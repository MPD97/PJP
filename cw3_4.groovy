import java.text.DecimalFormat


class realNumbersFinder{

	static String patternRealNumbers = /((\+|-)?([0-9]+)(\.[0-9]+)?)|((\+|-)?\.?[0-9]+)/
	static String patternPLN = /((\+|-)?([0-9]+)(\.[0-9]+)?[ ][P][L][N])|((\+|-)?\.?[0-9]+[ ][P][L][N])/
	static DecimalFormat decimalFormatter = new DecimalFormat("#0.00");

	static BigDecimal PlnToEuroExchangeRate = 0.21

	static void main (String[] args){
	
		def text = "Pan Abacki kupił 3 jabłka po 1.59 PLN. Pi równa 3.14. Liczba -123.123 jest ujemna. Moje saldo to -150 PLN."

		println FindRealNumbers(text)
		
		println ConvertPlnToEur(text, PlnToEuroExchangeRate)
	}
	

	static BigDecimal[] FindRealNumbers(String input){

		def results = []
	
		def matches = input =~ patternRealNumbers
		
		matches.each({
			results.push(it[0] as BigDecimal)
		})
		
		return results
	}
	
	static String ConvertPlnToEur(String input, BigDecimal exchangeRate){		
		return input.replaceAll(patternPLN, { pln -> 
			def value = (pln[0] =~ patternRealNumbers)[0][0] as BigDecimal
			return decimalFormatter.format(value * exchangeRate) + " EUR"
		})
	}
}