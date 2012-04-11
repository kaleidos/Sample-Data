package net.kaleidos.sampledata

import grails.test.*

class SampleDataServiceTests extends GrailsUnitTestCase {
	def SampleDataService sampleDataService
    protected void setUp() {
        super.setUp()
		sampleDataService = new SampleDataService()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testWord() {
		def word = sampleDataService.word()
		assert word.length() > 0
	}
	
	void testWords() {
		def word = sampleDataService.words(5)
		assert word.split(' ').size() == 5
		word = sampleDataService.words(100, false)
		assert word.split(' ').size() == 100
		word = sampleDataService.words(100, true)
		assert word.split(' ').size() == 100
		assert word[0..10] == 'Lorem ipsum'
	}
	
	
	void testCapitalWord() {
		def word = sampleDataService.wordCapital()
		assert word.length() > 0
	}
	
	
	void testSentence() {
		def sentence = sampleDataService.sentence()
		assert sentence.length() > 0
	}
	
	
	void testSpanishName() {
		def name = sampleDataService.nameSpanish(2)
		assert name.split(' ').size() == 3
	}
	
	void testEmail() {
		def email = sampleDataService.email()
		
		def emailRegex = /[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,4}/		
		assert email ==~ emailRegex
	}
	
	void testNumberDigits() {
		def number = sampleDataService.numberDigits(1)
		assert number < 10
		number = sampleDataService.numberDigits(2)
		assert number < 100
		number = sampleDataService.numberDigits(3)
		assert number < 1000
	}
	
	void testNumberDigitsString() {
		def number = sampleDataService.numberDigitsString(1)
		assert number.length() == 1
		number = sampleDataService.numberDigitsString(2)
		assert number.length() == 2
		number = sampleDataService.numberDigitsString(3)
		assert number.length() == 3
		
	}
	
	void testParagraph() {
		def paragraph = sampleDataService.paragraph()
		assert paragraph.length() > 0
	}
	
	void testParagraphs() {
		def paragraphs = sampleDataService.paragraphs(5)
		assert paragraphs.length() > 0
		assert paragraphs[0..10] == 'Lorem ipsum'
		
		paragraphs = sampleDataService.paragraphs(5, false)
		assert paragraphs.length() > 0
		assert paragraphs[0..10] != 'Lorem ipsum'
		
	}
	
	void testTelephoneSpanish() {
		def tel = sampleDataService.telephoneSpanish()
		def telRegex = /[69][0-9]{8}/
		assert tel ==~ telRegex
	}
	
	void testFutureDate(){
		def date = sampleDataService.futureDate()
		assert (new Date() + 365) > date
		assert (new Date()) < date
	}
	
	void testPastDate(){
		def date = sampleDataService.pastDate()
		assert (new Date() - 365) < date
		assert (new Date()) > date
	}
	
	void testVeryPastDate(){
		def date = sampleDataService.veryPastDate()
		assert (new Date() - 36500) < date
		assert (new Date() - 7300) > date
	}
	
	void testNifSpanish(){
		def nif = sampleDataService.nifSpanish()
		def nifRegex = /[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKET]/
		assert nif ==~ nifRegex
		
	}
	
	void testZipCodeSpanish(){
		def zip = sampleDataService.zipCodeSpanish()
		assert zip <= 99999
		assert zip >= 10000
	}
	
	
}

