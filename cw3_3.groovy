import java.text.ParseException
import java.text.SimpleDateFormat
class dateParser{

	static void isDateValid(String date){
		def pattern = /^[0-9]{4}-[0-9]{2}-[0-9]{2}$/

		if(date.matches(pattern))
		{
			try {
				def df = new SimpleDateFormat("yyyy-MM-dd")
				df.setLenient(false)
				df.parse(date)
				
				println "$date jest prawidłową datą."
				return
			} catch(ParseException e)
			{
			
			}
			
			println "$date nie jest prawidłową datą."
		}
	}
	
	static void main(String[] args){
		def validDate1 = "2022-11-28"
		def validDate2 = "1990-01-01"
		def invalidDate1 = "2022-12-32"
		def invalidDate2 = "2020-13-01"


		isDateValid(validDate1)
		isDateValid(validDate2)
		isDateValid(invalidDate1)
		isDateValid(invalidDate2)
	}
}