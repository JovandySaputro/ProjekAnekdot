package com.adoranwodo.gottrivia.database

import com.adoranwodo.gottrivia.model.Question

const val DATABASE_NAME = "GotTriviaQuiz.db"

const val QUESTION_TABLE_NAME = "questions"
const val SCORE_TABLE_NAME = "scores"

const val easy = "Easy"
const val medium = "Medium"
const val hard = "Hard"

// Answers
const val a = "a"
const val b = "b"
const val c = "c"


val appQuestions = arrayListOf<Question>(
    Question( question = "Berikut ini yang bukan ciri-ciri teks anekdot adalah ... ", difficulty = easy, optionA = "Struktur teks orientasi-krisis-reaksi", optionB = "Memiliki pesan moral", optionC = "Memiliki unsur lucu", answer = b),
    Question( question = "Berikut ini yang termasuk unsur kebahasaan kecuali ... ", difficulty = easy, optionA = "Konjungsi menyatakan yang menyatakan hubungan waktu", optionB = "Kalimat retoris", optionC = "Kalimat tanya", answer = c),
    Question( question = "Yang termasuk kedalam sifat-sifat anekdot secara umum adalah ... ", difficulty = easy, optionA = "Aneh", optionB = "Khayalan", optionC = "Nyata", answer = c),
    Question( question = "Contoh anekdot dalam kehidupan kita sehari-hari dan merupakan perwujudan dari seni adalah ... ", difficulty = easy, optionA = "Keramik", optionB = "Lukis pasir", optionC = "Karikatur", answer = c),
    Question( question = "Cerita yang lucu dan mengesankan serta singkat dan menarik, biasanya mengenai orang penting berdasarkan kejadian sebenarnya, merupakan pengertian dari ...", difficulty = easy, optionA = "Teks Eksposisi", optionB = "Teks Anekdots", optionC = "Teks Laporan Hasil Observasi", answer = b),
    Question( question = "Yang merupakan unsur-unsur teks anekdot, kecuali ... ", difficulty = easy, optionA = "Pujian", optionB = "Kritik", optionC = "Humor", answer = a),
    Question( question = "Struktur teks anekdot yang tepat, yaitu ... ", difficulty = easy, optionA = "Abstraksi – Orientasi – Krisis – Reaksi – Koda", optionB = "Abstraksi – Koda – Orientasi – Krisis – Reaksi", optionC = "Reaksi – Abstraksi – Krisis – Orientasi – Koda", answer = a),
    Question( question = "Bagian terjadinya masalah atau hal unik dalam struktur teks anekdot disebut ... ", difficulty = easy, optionA = "Krisis", optionB = "Abstraksi", optionC = "Koda", answer = a),
    Question( question = "Bagian akhir dari cerita dalam struktur teks anekdot disebut ... ", difficulty = easy, optionA = "Abstraksi", optionB = "Orientasi", optionC = "Koda", answer = c),
    Question( question = "Yang merupakan tujuan penulisan teks anekdot, yaitu ...", difficulty = easy, optionA = "Memberi argumentasi", optionB = "Menghibur", optionC = "Memberi petunjuk", answer = b)
//    Question(question = "Valar Morghulis is usually responded with ", difficulty = hard, optionA = "Valar Bohnaris", optionB = "Valar Rohaires", optionC = "Valar Dohaeris", answer = c),
//    Question(question = "What can put out wildfire", difficulty = hard, optionA = "Sand", optionB = "Water", optionC = "Dragon's blood", answer = a),
//    Question(question = "What substance is capable of defeating whitewalkers", difficulty = easy, optionA = "Dragon Stone", optionB = "Valyrian Steel", optionC = "Wildfire", answer = b),
//    Question(question = "How many times has Beric Dondarrion been brought back to life", difficulty = hard, optionA = "Five", optionB = "Seven", optionC = "Six", answer = c),
//    Question(question = "Which Stark family direwolf was killed in retaliation for an attack on Price Joffery", difficulty = medium, optionA = "Lady", optionB = "Nymeria", optionC = "Ghost", answer = a),
//    Question(question = "Arya's punishment for stealing from the many-face god was", difficulty = easy, optionA = "Losing Needle", optionB = "Hunger", optionC = "Blindness", answer = c),
//    Question(question = "This character said 'Its nothing' right before he died", difficulty = hard, optionA = "Tywin Lannister", optionB = "King Joffrey", optionC = "Renly Baratheon", answer = b),
//    Question(question = "The name of King Tommen's favorite cat is", difficulty = medium, optionA = "Battle Pus", optionB = "Little Lion", optionC = "Ser Pounce", answer = c),
//    Question(question = "What's the name of Ned Stark's greatsword", difficulty = medium, optionA = "Ice", optionB = "Northguard", optionC = "Widow's Wall", answer = a),
//    Question(question = "Who shoots the flaming arrow that destroy's Stannis fleet in Blackwater Bay", difficulty = hard, optionA = "King Joffrey", optionB = "Jaime Lannister", optionC = "Bronn", answer = c),
//    Question(question = "Prince Oberyn Martell is nicknamed the Red Viper because of his combat and ", difficulty = medium, optionA = "Killings", optionB = "Ruby colored armor", optionC = "Knowledge of poisons", answer = c),
//    Question(question = "The Night King was created using a dagger made of ", difficulty = easy, optionA = "Blue Ice", optionB = "Dragonglass", optionC = "Valyrian Steel", answer = b),
//    Question(question = "How many arrows does Ramsay Bolton let loose at Rickon Stark ", difficulty = medium, optionA = "Two", optionB = "Three", optionC = "Four", answer = c),
//    Question(question = "Who created the secret tunnel in the sewers under Casterly Rock ", difficulty = hard, optionA = "Varys", optionB = "Tyrion Lannister", optionC = "Lord Baelish", answer = b),
//    Question(question = "What's Sansa Stark's favorite thing to eat ", difficulty = easy, optionA = "Honey cake", optionB = "Strawberry pie", optionC = "Lemon cake", answer = c),
//    Question(question = "Dead creatures revived by white walkers are known as ", difficulty = easy, optionA = "Walkers", optionB = "Wights", optionC = "Dead", answer = b),
//    Question(question = "Who was Lord Commander of the Kingsguard at the beginning of Game of Thrones ", difficulty = easy, optionA = "Ser Jaime Lannister", optionB = "Ser Jeor Mormont", optionC = "Ser Barristan Selmy", answer = c),
//    Question(question = "Who was Margaery Tyrell's first husband ", difficulty = easy, optionA = "Renly Baratheon", optionB = "Tommen Baratheon", optionC = "Joffrey Baratheon", answer = a),
//    Question(question = "How many times has Sansa Stark been married", difficulty = easy, optionA = "Once", optionB = "Twice", optionC = "Three times", answer = b),
//    Question(question = "Who is the ruler of the Iron Islands at the beginning of Game of Thrones", difficulty = easy, optionA = "Yara Greyjoy", optionB = "Aeron Greyjoy", optionC = "Balon Greyjoy", answer = c),
//    Question(question = "Who is the mad king's first born son", difficulty = easy, optionA = "Rhaegal Targaryen", optionB = "Rhaegar Targaryen", optionC = "Viserys Targaryen", answer = b),
//    Question(question = "Who delivered the fatal blow to Robb Stark", difficulty = medium, optionA = "Walder Frey", optionB = "Roose Bolton", optionC = "Alliser Thorne", answer = b),
//    Question(question = "Grey Worm and Missandei became allies of Daenaerys Targaryen after she liberated the slaves of which city", difficulty = easy, optionA = "Yunkai", optionB = "Astapor", optionC = "Meeren", answer = b),
//    Question(question = "What is the name of the royal executioner who beheaded Ned Stark", difficulty = medium, optionA = "Ser Janos Trant", optionB = "Ser Meryn Trant", optionC = "Ser Ilyn Payne", answer = c),
//    Question(question = "Which rival king attempted to take King's Landing during the Battle of the Blackwater", difficulty = medium, optionA = "Balon Greyjoy", optionB = "Stannis Baratheon", optionC = "Renly Baratheon", answer = b),
//    Question(question = "Who was the fool that helped Sansa Stark escape King's Landing after Joffrey's death", difficulty = hard, optionA = "Vardis Egen", optionB = "Dontos Hollard", optionC = "Eddison Tollett", answer = b),
//    Question(question = "The father of Gilly's son is ", difficulty = easy, optionA = "Samwell Tarly", optionB = "Craster", optionC = "Tormund Giantsbane", answer = b),
//    Question(question = "Where does Arya Stark train to become a faceless man", difficulty = easy, optionA = "Meereen", optionB = "Pentos", optionC = "Braavos", answer = c),
//    Question(question = "Thoros of Myr is responsible for reviving which character from the dead", difficulty = hard, optionA = "Sandor Clegane", optionB = "Gregor Clegane", optionC = "Beric Dondarrion", answer = c),
//    Question(question = "Davos Seaworth grew up in the slums of which city", difficulty = easy, optionA = "Dorne", optionB = "King's landing", optionC = "Astapor", answer = b),
//    Question(question = "Who is Lyanna to Jorah Mormont", difficulty = easy, optionA = "Daughter", optionB = "Sister", optionC = "Cousin", answer = c),
//    Question(question = "What is the surname given to the bastards born in Dorne", difficulty = easy, optionA = "Sand", optionB = "Stone", optionC = "Storm", answer = a),
//    Question(question = "The Mountain is the nickname for which character", difficulty = easy, optionA = "Geroid Clegane", optionB = "Sandor Clegane", optionC = "Gregor Clegane", answer = c),
//    Question(question = "Who is not on Arya Starks list", difficulty = easy, optionA = "Meryn Trant", optionB = "Rorge", optionC = "Tommen Baratheon", answer = c),
//    Question(question = "Who is known as 'The-King-Beyond-the-Wall' ", difficulty = medium, optionA = "Stannis Baratheon", optionB = "Mance Rayder", optionC = "Tormund Giantsbane", answer = b),
//    Question(question = "Who was the ruler of the Iron Islands at the beginning of Game of Thrones ", difficulty = easy, optionA = "Yara Greyjoy", optionB = "Aeron Greyjoy", optionC = "Balon Greyjoy", answer = c),
//    Question(question = "Which city did Samwell Tarly travel to in order to train as a maester ", difficulty = medium, optionA = "High Garden", optionB = "Oldtown", optionC = "Gulltown", answer = b),
//    Question(question = "Who does Tywin plan to re-marry his daughter Cersie to", difficulty = hard, optionA = "Euron Greyjoy", optionB = "Oberyn Martell", optionC = "Loras Tyrell", answer = c),
//    Question(question = "Which name is given to the bastards of The Reach", difficulty = medium, optionA = "Stone", optionB = "Flowers", optionC = "Bastard", answer = b),
//    Question(question = "At Hoster Tully's funeral, who shot the burning arrow that hit its mark", difficulty = medium, optionA = "Edmure Tully", optionB = "Brynden Tully", optionC = "Lord Karstark", answer = b),
//    Question(question = "Who was the liege lord of the Freys before the War of the Five Kings", difficulty = medium, optionA = "Hoster Tully", optionB = "Jon Arryn", optionC = "Robert Baratheon", answer = a),
//    Question(question = "What was the name of the boy Arya was playing with (and who later died) when Nymeria attacked Joffrey", difficulty = medium, optionA = "Pyp", optionB = "Mycah", optionC = "Gendry", answer = a),
//    Question(question = "Who is Myrcella betrothed to in season 2", difficulty = medium, optionA = "Trystane Martell", optionB = "Sam Crakehall", optionC = "Oberyn Martell", answer = a),
//    Question(question = "Which of these is not a direwolf", difficulty = medium, optionA = "Nymeria", optionB = "Storm", optionC = "Summer", answer = b),
//    Question(question = "What are the words of House Martell", difficulty = medium, optionA = "Growing Strong", optionB = "Hear Me Roar", optionC = "Unbowed, Unbent, Unbroken", answer = c),
//    Question(question = "How many Starks appeared in the first episode of the series", difficulty = medium, optionA = "7", optionB = "8", optionC = "9", answer = b),
//    Question(question = "How many kings did Tywin Lannister serve as the Hand", difficulty = medium, optionA = "1", optionB = "2", optionC = "3", answer = c),
//    Question(question = "Which of the following characters appears in season 1", difficulty = medium, optionA = "Stannis Baratheon ", optionB = "Beric Dondarrion", optionC = "Roose Bolton", answer = b),
//    Question(question = "Which of the following types of wine does the wine merchant attempt to poison Daenerys with", difficulty = hard, optionA = "Arbor Red", optionB = "Dornish Red", optionC = "Stormland Red", answer = a),
//    Question(question = "What is the first thing Jon Snow says in the first episode in season 4", difficulty = hard, optionA = "I can't believe Robb is dead", optionB = "The Halfhand believed our only chance to stop Mance was to get a man inside his army", optionC = "Last time I saw him, he was in the courtyard at Winterfell", answer = c),
//    Question(question = "Brienne pledged her alliance to which of these pairs", difficulty = hard, optionA = "Sansa Stark and Selwyn Tarth", optionB = "Catelyn Stark and Renly Baratheon", optionC = "Stannis Baratheon and Catelyn Stark", answer = b),
//    Question(question = "What is Meera's relationship to Howland Reed", difficulty = hard, optionA = "daughter", optionB = "aunt", optionC = "cousin", answer = a),
//    Question(question = "During the Red Wedding, which Houses were allies against the Starks", difficulty = hard, optionA = "Frey, Lannister and Tully", optionB = "Frey, Forrester and Lannister", optionC = "Frey, Bolton and Lannister", answer = c),
//    Question(question = "Which House is extinct at the time Cersei Lannister becomes Queen of Westeros", difficulty = hard, optionA = "Arryn", optionB = "Baratheon", optionC = "Greyjoy", answer = b),
//    Question(question = "Who was Ros' regular customer at Winterfell", difficulty = hard, optionA = "Theon Greyjoy", optionB = "Tywin Lannister", optionC = "Randyll Tarly", answer = a),
//    Question(question = "Which kings did Jaime Lannister serve as a Kingsguard", difficulty = hard, optionA = "Robert Baratheon, Joffrey Baratheon and Aerys I", optionB = "Maekar I, Robert Baratheon and Joffrey Baratheon", optionC = "Aerys II, Robert Baratheon and Joffrey Baratheon ", answer = c),
//    Question(question = "What is Visenya Targaryen's relationship to Aegon I", difficulty = hard, optionA = "Wife and sister", optionB = "Wife and aunt", optionC = "Wife and cousin", answer = a),
//    Question(question = "Arthur Dayne was a member of the Kingsguard of which king", difficulty = hard, optionA = "Aerys I", optionB = "Aerys II", optionC = "Aegon I", answer = b),
//    Question(question = "What does Daenerys mean when she says 'Shekh ma sheieraki anni' ", difficulty = hard, optionA = "Moon of my life", optionB = "Sun of my life", optionC = "My sun and stars", answer = c),
//    Question(question = "What was the last thing Viserys Targaryen said before he died ", difficulty = medium, optionA = "Dany help!", optionB = "Dany please!", optionC = "It's my birthright", answer = b),
//    Question(question = "Who said 'Together we can end this war in a fortnight' right before they died", difficulty = hard, optionA = "Ned Stark", optionB = "Robb Stark", optionC = "Renly Baratheon", answer = c),
//    Question(question = "Who said 'We are the watchers on the wall' right before they died", difficulty = hard, optionA = "Jon Snow", optionB = "Qhorin Halfhand", optionC = "Pyp", answer = b),
//    Question(question = "Who said 'Carry me?", difficulty = medium, optionA = "Polliver", optionB = "Jojen Reed", optionC = "Lommy", answer = a),
//    Question(question = "Who said 'He'll stab us in the back first chance he gets' right before they died", difficulty = medium, optionA = "Karl", optionB = "Orell", optionC = "Ygritte", answer = b),
//    Question(question = "Who said 'Kill me and be cursed. You are no king of mine!' right before they died", difficulty = medium, optionA = "Rodrik Cassel", optionB = "Ros", optionC = "Rickard Karstark", answer = c),
//    Question(question = "Which of the following is not a position on King Joffrey Baratheon's small council", difficulty = easy, optionA = "Master of Seas", optionB = "Master of Whisperers", optionC = "Master of Ships", answer = a),
//    Question(question = "Which of the following are NOT one of the daughters/granddaughters of Walder Frey that Robb Stark could have chosen to marry", difficulty = easy, optionA = "Waldina", optionB = "Sarah", optionC = "Mary", answer = a),
//    Question(question = "Who said 'Do it quickly' right before they died", difficulty = medium, optionA = "Maester Luwin", optionB = "Rodrik Cassel", optionC = "Jojen Reed", answer = a),
//    Question(question = "Who said 'Give me something for the pain, and let me die' right before they died", difficulty = easy, optionA = "Khal Drogo", optionB = "Maester Luwin", optionC = "Robert Baratheon", answer = b),
//    Question(question = "Who said 'Go with them' right before they died", difficulty = medium, optionA = "Syrio Forel", optionB = "Jojen Reed", optionC = "Maester Luwin", answer = b),
//    Question(question = "Who said 'I shall have your head for this' right before they died", difficulty = easy, optionA = "Lord Commander Mormont", optionB = "Rodrik Cassel", optionC = "Xaro Xhoan Daxos", answer = a),
//    Question(question = "Who said 'Gods help you Theon Greyjoy, now you are truly lost' right before they died", difficulty = hard, optionA = "Jory Cassel", optionB = "Rodrik Cassel", optionC = "Maester Cassel", answer = b),
//    Question(question = "Who shot the burning arrow that sunk Lord Hoster Tully’s ship at his funeral", difficulty = easy, optionA = "Edmure Tully", optionB = "Brynden Tully", optionC = "Catelyn Tully", answer = a),
//    Question(question = "How many kings did Lord Tywin Lannister serve as Hand", difficulty = easy, optionA = "1", optionB = "2", optionC = "3", answer = c),
//    Question(question = "'A crow gone bad. A man gone mad. A people so had. A North so sad.' Who said these lines", difficulty = easy, optionA = "Mance Rayder", optionB = "Jon Snow", optionC = "Bran Stark", answer = a),
//    Question(question = "The King Who Knelt was", difficulty = easy, optionA = "Mikken Stark", optionB = "Eddard Stark", optionC = "Torrhen Stark", answer = c),
//    Question(question = "What does Varys usually say is his goal", difficulty = easy, optionA = "To survive", optionB = "To serve the realm", optionC = "To avenge the Targaryens", answer = b),
//    Question(question = "Patchface came from which of the Free Cities", difficulty = medium, optionA = "Valyria", optionB = "Lorath", optionC = "Volantis", answer = c),
//    Question(question = "How many knights were in Robert’s Kingsguard", difficulty = medium, optionA = "7", optionB = "8", optionC = "9", answer = a),
//    Question(question = "Where did Lyanna Stark die", difficulty = easy, optionA = "The Tower of Joy", optionB = "Winterfell", optionC = "The Shadow Tower", answer = a),
//    Question(question = "Who founded House Stark", difficulty = easy, optionA = "Torrhen Stark", optionB = "Brandon Stark", optionC = "Eddard Stark", answer = c),
//    Question(question = "The destruction of the Great Sept of Baelor directly caused which two deaths", difficulty = easy, optionA = "Margaery Tyrell and Lancel Lannister", optionB = "Margaery Tyrell and Tommen Baratheon", optionC = "Margaery Tyrell and Myrcella Baratheon", answer = a),
//    Question(question = "Who does Daenerys name as her bloodriders", difficulty = hard, optionA = "Aggo, Jhogo, and Rakharo", optionB = "Quaro, Kotho, and Daego", optionC = "Cohollo, Pello, and Gartho", answer = a),
//    Question(question = "In the first episode, King Robert Baratheon says, 'In my dreams, I kill him every night' Who is he referring to", difficulty = medium, optionA = "Aerys Targaryen", optionB = "Rhaegar Targaryen", optionC = "Balon Greyjoy", answer = b),
//    Question(question = "Which house has the sigil of a silver trout", difficulty = medium, optionA = "House Targaryen", optionB = "House Stark", optionC = "House Tully", answer = c),
//    Question(question = "Who must an Unsullied kill to complete their training", difficulty = easy, optionA = "A newborn slave child", optionB = "A random citizen of Astapor", optionC = "Another Unsullied", answer = a),
//    Question(question = "Who created the first White Walker", difficulty = easy, optionA = "The First Men", optionB = "The Children of the Forest", optionC = "The Night’s Watch", answer = b),
//    Question(question = "In which part of Westeros can you find The Dreadfort", difficulty = hard, optionA = "The North", optionB = "The Riverlands", optionC = "The Stormlands", answer = a),
//    Question(question = "What is the main religion of the Seven Kingdoms", difficulty = hard, optionA = "Drowned God", optionB = "Faith of the Seven", optionC = "Old Gods of the Forest", answer = b),
//    Question(question = "Whose look does Brienne of Tarth notice on the wraith that killed Renly Baratheon in his camp", difficulty = easy, optionA = "Melisandre of Asshai's", optionB = "Stannis Baratheon's", optionC = "Catelyn Stark's", answer = b),
//    Question(question = "Which of these is NOT located in Westeros", difficulty = medium, optionA = "Pentos", optionB = "Harrenhal", optionC = "Sunspear", answer = a),
//    Question(question = "Who forged Arya’s sword, Needle", difficulty = medium, optionA = "Donal Noye", optionB = "Mikken", optionC = "Tobho Mott", answer = b),
//    Question(question = "The Seven Pointed Star is a symbol connected to which religion", difficulty = hard, optionA = "The Faith of the Seven", optionB = "The Old Gods of the Forest", optionC = "The Lord of Light", answer = a),
//    Question(question = "House Targaryen originally came from", difficulty = medium, optionA = "Westeros", optionB = "Essos", optionC = "Valyria", answer = c),
//    Question(question = "During the battle between Prince Oberyn Martell and The Mountain, whose name is he shouting", difficulty = easy, optionA = "Elia", optionB = "Ellaria", optionC = "Lyanna", answer = a),
//    Question(question = "Which part of Westeros is home to The Water Gardens", difficulty = hard, optionA = "The Vale", optionB = "Dorne", optionC = "King’s Landing", answer = b),
//    Question(question = "Which name is given to the people who live beyond The Wall", difficulty = easy, optionA = "Free folk", optionB = "Wilding", optionC = "Crannogmen", answer = a)
)