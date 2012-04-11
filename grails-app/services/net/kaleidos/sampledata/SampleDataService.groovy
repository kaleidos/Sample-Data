package net.kaleidos.sampledata

class SampleDataService {
	
	private static final String COMMON_P = 'Lorem ipsum'
	
	private static final String[] WORDS = ['exercitationem', 'perferendis', 'perspiciatis', 'laborum', 'eveniet',
			'sunt', 'iure', 'nam', 'nobis', 'eum', 'cum', 'officiis', 'excepturi',
			'odio', 'consectetur', 'quasi', 'aut', 'quisquam', 'vel', 'eligendi',
			'itaque', 'non', 'odit', 'tempore', 'quaerat', 'dignissimos',
			'facilis', 'neque', 'nihil', 'expedita', 'vitae', 'vero', 'ipsum',
			'nisi', 'animi', 'cumque', 'pariatur', 'velit', 'modi', 'natus',
			'iusto', 'eaque', 'sequi', 'illo', 'sed', 'ex', 'et', 'voluptatibus',
			'tempora', 'veritatis', 'ratione', 'assumenda', 'incidunt', 'nostrum',
			'placeat', 'aliquid', 'fuga', 'provident', 'praesentium', 'rem',
			'necessitatibus', 'suscipit', 'adipisci', 'quidem', 'possimus',
			'voluptas', 'debitis', 'sint', 'accusantium', 'unde', 'sapiente',
			'voluptate', 'qui', 'aspernatur', 'laudantium', 'soluta', 'amet',
			'quo', 'aliquam', 'saepe', 'culpa', 'libero', 'ipsa', 'dicta',
			'reiciendis', 'nesciunt', 'doloribus', 'autem', 'impedit', 'minima',
			'maiores', 'repudiandae', 'ipsam', 'obcaecati', 'ullam', 'enim',
			'totam', 'delectus', 'ducimus', 'quis', 'voluptates', 'dolores',
			'molestiae', 'harum', 'dolorem', 'quia', 'voluptatem', 'molestias',
			'magni', 'distinctio', 'omnis', 'illum', 'dolorum', 'voluptatum', 'ea',
			'quas', 'quam', 'corporis', 'quae', 'blanditiis', 'atque', 'deserunt',
			'laboriosam', 'earum', 'consequuntur', 'hic', 'cupiditate',
			'quibusdam', 'accusamus', 'ut', 'rerum', 'error', 'minus', 'eius',
			'ab', 'ad', 'nemo', 'fugit', 'officia', 'at', 'in', 'id', 'quos',
			'reprehenderit', 'numquam', 'iste', 'fugiat', 'sit', 'inventore',
			'beatae', 'repellendus', 'magnam', 'recusandae', 'quod', 'explicabo',
			'doloremque', 'aperiam', 'consequatur', 'asperiores', 'commodi',
			'optio', 'dolor', 'labore', 'temporibus', 'repellat', 'veniam',
			'architecto', 'est', 'esse', 'mollitia', 'nulla', 'a', 'similique',
			'eos', 'alias', 'dolore', 'tenetur', 'deleniti', 'porro', 'facere',
			'maxime', 'corrupti']
	
	private static final String [] COMMON_WORDS = ['lorem', 'ipsum', 'dolor', 'sit', 'amet', 'consectetur',
			'adipisicing', 'elit', 'sed', 'do', 'eiusmod', 'tempor', 'incididunt',
			'ut', 'labore', 'et', 'dolore', 'magna', 'aliqua']
	
	private static final SPANISH_SURNAMES = ["Flores", "Campos", "Vega", "Diez", "Fuentes", "Carrasco", "Caballero", "Nieto", "Aguilar", "Pascual", "Reyes", "Herrero", "Santana", "Lorenzo", "Hidalgo", "Montero", "Ibañez", "Gimenez", "Ferrer", "Duran", "Vicente", "Benitez", "Mora", "Arias", "Santiago", "Vargas", "Carmona", "Crespo", "Pastor", "Roman", "Soto", "Saez", "Velasco", "Soler", "Moya", "Esteban", "Parra", "Bravo", "Gallardo", "Rojas"]
	private static final SPANISH_MALE_NAMES = ["Jose", "Antonio", "Juan", "Manuel", "Francisco", "Luis", "Javier", "Miguel", "Angel", "Carlos", "Jesus", "David", "Pedro", "Daniel", "Maria", "Rafael", "Fernando", "Alberto", "Alejandro", "Ramon", "Pablo", "Jorge", "Vicente", "Enrique", "Sergio", "Andres", "Ignacio", "Victor", "Diego", "Joaquin", "Eduardo", "Raul", "Adrian", "Oscar", "Alvaro", "Ivan", "Santiago", "Ruben", "Alfonso", "Roberto", "Emilio", "Ricardo", "Jaime", "Julio", "Gabriel", "Salvador", "Mario", "Julian", "Tomas", "Marcos", "Agustin", "Felix", "Guillermo", "Josep", "Jordi", "Cesar", "Joan", "Domingo", "Cristian", "Gonzalo", "Felipe", "Mohamed", "Alfredo", "Martin", "Sebastian", "Mariano", "Nicolas", "Marc", "Ismael", "Hugo", "Samuel", "Gregorio", "Hector", "Esteban", "Lorenzo", "Xavier", "Eugenio", "Aitor", "Arturo", "Cristobal", "Rodrigo", "Albert", "Valentin", "Adolfo", "Borja", "German", "Alex", "John", "Benito", "Jonathan", "Ernesto", "Alexander", "Marco", "Christian", "Lucas", "Iker", "Gustavo", "Gerardo", "Carmelo", "Isidro"]
	private static final SPANISH_FEMALE_NAMES = ["Maria", "Carmen", "Ana", "Isabel", "Dolores", "Pilar", "Josefa", "Teresa", "Rosa", "Antonia", "Angeles", "Cristina", "Francisca", "Laura", "Elena", "Luisa", "Mercedes", "Concepcion", "Rosario", "Marta", "Jose", "Lucia", "Juana", "Manuela", "Raquel", "Jesus", "Sara", "Beatriz", "Paula", "Patricia", "Eva", "Encarnacion", "Victoria", "Rocio", "Belen", "Julia", "Esther", "Silvia", "Montserrat", "Andrea", "Nuria", "Angela", "Margarita", "Inmaculada", "Monica", "Yolanda", "Sandra", "Sonia", "Irene", "Alicia", "Susana", "Mar", "Marina", "Alba", "Amparo", "Nieves", "Natalia", "Gloria", "Soledad", "Lourdes", "Veronica", "Ines", "Consuelo", "Carolina", "Luz", "Asuncion", "Begoña", "Claudia", "Noelia", "Lorena", "Catalina", "Milagros", "Esperanza", "Emilia", "Olga", "Aurora", "Magdalena", "Lidia", "Alejandra", "Fatima", "Blanca", "Miriam", "Sofia", "Clara", "Josefina", "Eugenia", "Elisa", "Anna", "Purificacion", "Celia", "Nerea", "Carla", "Virginia", "Remedios", "Trinidad", "Vicenta", "Vanesa", "Gema", "Elvira", "Matilde"]
	
	private static final SUBDOMAINS =['es', 'com', 'org', 'net', 'gov', 'tk']
	
	
	private static Random rand = new Random()
	

	/**
	 * 	Returns a random word
	 */
	def word(){
		return WORDS[rand.nextInt(WORDS.size())]
	}

	/**
	 * 	Returns a random capital word
	 */
	def wordCapital(){
		def word = WORDS[rand.nextInt(WORDS.size())].capitalize()
	}

	/**
	 * Returns a string of `count` lorem ipsum words separated by a single space.
	 * If `common` is True, then the first 2 words will be the standard
	 * 'Lorem ipsum' words. Otherwise, all words will be selected randomly.
	 * @param count
	 * @return
	 */
	def words(def count, def common=false) {
		def wordList=(common?COMMON_P:wordCapital())
		def num = wordList.split(' ').size()+1
		(num..count).each {
			wordList += ' ' + word()
		}
		return wordList
	}

	/**
	 * Returns a randomly generated sentence of lorem ipsum text.
	 * The first word is capitalized, and the sentence ends in either a period or
	 * question mark. Commas are added at random.
	 * @return
	 */
	def sentence(){
		//Determine the number of comma-separated sections and number of words in
		//each section for this sentence.
		StringBuffer sentence = new StringBuffer()

		sentence << wordCapital()


		(0..(rand.nextInt(4)+1)).each{
			(0..(rand.nextInt(9)+3)).each{
				sentence << ' ' << word()
			}

			sentence << ","
		}


		sentence = sentence[0..-2] << (rand.nextBoolean()?'.':'?')
		return sentence
	}

	/**
	 * Returns a randomly generated paragraph of lorem ipsum text.
	 * The paragraph consists of between 1 and 4 sentences, inclusive.
	 */
	def paragraph(){
		def txt = ''
		(0..(rand.nextInt(4))).each{ txt += sentence() }
		return txt
	}

	/**
	 * Returns a list of paragraphs as returned by paragraph().
	 * If `common` is True, then the first paragraph will start with 'Lorem ipsum'
	 */
	def paragraphs(count=3, common=true){
		def txt =''
		def num = 0
		if (common){
			txt = COMMON_P + ' ' + word()+ ' ' + word()+ ' ' + word()+ ' ' + word() +'.'
			num = 1
		}

		(num..count).each {
			txt += paragraph() + '\n'
		}
		return txt
	}

	/**
	 * Returns a random email, with subdomain of es, com, org, net, gov, tk
	 * @return
	 */
	def email(){
		return word()+'@'+word()+'.'+SUBDOMAINS[rand.nextInt(SUBDOMAINS.size())]
	}

	/**
	 * Returns a random number from 0 to 999[with the given number of digits].
	 */
	def numberDigits(def digits=3){
		return rand.nextInt(10 ** digits)
	}

	/**
	 * Random number from 0 to 999[with the given number of digits], in string format, filled by 0s on the left.
	 */
	def numberDigitsString(def digits=3){
		def digits_txt = '0123456789'
		def txt = ''
		(1..digits).each{
			txt+=digits_txt[rand.nextInt(9)]
		}
		return txt
	}

	/**
	 * Returns a random date between today and today + one year.
	 */
	def futureDate(){
		return (new Date() + rand.nextInt(364)+1)
	}

	/**
	 * Returns a random date between today and today - one year.
	 */
	def pastDate(){
		return (new Date() - (rand.nextInt(364)+1))
	}

	/**
	 * Returns a random date between today-20 years and today -100 years. Useful for birth dates.
	 */
	def veryPastDate(){
		def date = new Date() - 7300 //today - 20 years
		return (date - rand.nextInt(29200)) //0 to 80 years
	}

	////////////////////////////////////////////////////////////
	////////////// SPANISH SAMPLE DATA   ///////////////////////
	////////////////////////////////////////////////////////////

	/**
	 * Returns a random spanish name, with a variable number of surnames
	 * The first name will be male or female at 50%
	 * The number of surnames are defined by numSurnames
	 * @return
	 */
	def nameSpanish(def numSurnames=0){
		def name = (rand.nextBoolean()?nameMaleSpanish():nameFemaleSpanish())
		(1..numSurnames).each{
			name += ' ' + surnameSpanish()
		}
		return name
	}

	/**
	 * Returns a random spanish surname
	 * @return
	 */
	def surnameSpanish(){
		return SPANISH_SURNAMES[rand.nextInt(SPANISH_SURNAMES.size())]
	}

	/**
	 * Returns a random spanish male name 
	 * @return
	 */
	def nameMaleSpanish(){
		return SPANISH_MALE_NAMES[rand.nextInt(SPANISH_MALE_NAMES.size())]
	}

	/**
	 * Returns a random spanish female name
	 * @return
	 */
	def nameFemaleSpanish(){
		return SPANISH_FEMALE_NAMES[rand.nextInt(SPANISH_FEMALE_NAMES.size())]
	}

	/**
	 * Returns a random spanish number (9 digits, starting by 9 or 6)
	 * @return
	 */
	def telephoneSpanish(){
		def txt = (rand.nextBoolean()?'9':'6')
		(0..7).each{
			txt += rand.nextInt(10)
		}
		return txt
	}

	/**
	 * Returns a random spanish nif
	 * @return
	 */
	def nifSpanish(){
		def nif = numberDigitsString(8)
		return nif + "TRWAGMYFPDXBNJZSQVHLCKET".charAt(nif.toInteger() % 23)
	}

	/**
	 * Returns a random spanish zip code
	 * @return
	 */
	def zipCodeSpanish(){
		return rand.nextInt(89999)+10000
	}
}
