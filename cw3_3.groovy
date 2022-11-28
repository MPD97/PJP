import java.text.ParseException
import java.text.SimpleDateFormat
class dateParser{

	static void isDateValid(String dates){
		def pattern = /[0-9]{4}-[0-9]{2}-[0-9]{2}/

		def matches = dates =~ pattern
		
		if(matches.size() == 0){
			println "$dates nie posiada prawidłowych dat."
			return
		}
		
		matches.findAll({ 
			try {
				def df = new SimpleDateFormat("yyyy-MM-dd")
				df.setLenient(false)
				df.parse(it)
				
				println "$it jest prawidłową datą."
				return
			} catch(ParseException e)
			{
			
			}
			println "$it nie jest prawidłową datą."
		})
		
	}
	
	static void main(String[] args){
		def validDate1 = "2022-11-28"
		def validDate2 = "1990-01-01"
		def invalidDate1 = "2022-12-32"
		def invalidDate2 = "2020-13-01"

		def textWithDates = "Ala ma kota. 2022-03-19 to 19 dzień marca. Data 2022-14-45 jest nieprawidłowa."

		isDateValid(validDate1)
		isDateValid(validDate2)
		isDateValid(invalidDate1)
		isDateValid(invalidDate2)
		
		isDateValid(textWithDates)
	}
}