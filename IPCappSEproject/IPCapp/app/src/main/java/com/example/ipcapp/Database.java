package com.example.ipcapp;

class Database extends MainActivity {

    String section_1 = "SECTION 1:  Title and extent of operation of the Code.\u2014This Act shall be called the Indian Penal Code, and \r\n" + //
            "shall 3\r\n extend to the whole of India 4\r\n[except the State of Jammu and Kashmir ";
    String section_2 = "SECTION 2:Punishment of offences committed within India.\u2014Every person shall be liable to punishment \r\n" + //
            "under this Code and not otherwise for every act or omission contrary to the provisions thereof, of which \r\n" + //
            "he shall be guilty within 5\r\n" + //
            "[India] 6\r\n" + //
            "****.";
    String section_3 = "SECTION 3: Punishment of offences committed beyond, but which by law may be tried within, India.\u2014\r\n" + //
            "Any person liable, by any 7\r\n" + //
            "[Indian law], to be tried for an offence committed beyond 8\r\n" + //
            "[India] shall be \r\n" + //
            "dealt with according to the provisions of this Code for any act committed beyond 8\r\n" + //
            "[India] in the same \r\n" + //
            "manner as if such act had been committed within 5\r\n" + //
            "[India]";
    String section_4 = "SECTION 4: Extension of Code to extra-territorial offences.\u2014The provisions of this Code apply also to any \r\n" + //
            "offence committed by\u2014\r\n" + //
            "10[(1) any citizen of India in any place without and beyond India;\r\n" + //
            "(2) any person on any ship or aircraft registered in India wherever it may be.]\r\n" + //
            "11[(3) any person in any place without and beyond India committing offence targeting a computer \r\n" + //
            "resource located in India.]\r\n" + //
            "12[Explanation.\u2014In this section\u2014\r\n" + //
            "(a) the word \u201Coffence\u201D includes every act committed outside India which, if committed in \r\n" + //
            "India, would be punishable under this Code;\r\n" + //
            " \r\n" + //
            "(b) the expression \u201Ccomputer resource\u201D shall have the meaning assigned to it in clause (k) of \r\n" + //
            "sub-section (1) of section 2 of the Information Technology Act, 2000 (21 of 2000);]\r\n" + //
            "1\r\n" + //
            "[Illustration]\r\n" + //
            "2\r\n" + //
            "***A, 3\r\n" + //
            "[who is 4\r\n" + //
            "[a citizen of India]], commits a murder in Uganda. He can be tried and convicted of \r\n" + //
            "of murder in any place in 5\r\n" + //
            "[India] in which he may be found.\r\n" + //
            "6\r\n" + //
            "* * * * *";
    String section_5 = "SECGTION 5: Certain laws not to be affected by this Act.\u2014Nothing in this Act shall affect the provisions of \r\n" + //
            "any Act for punishing mutiny and desertion of officers, soldiers, sailors or airmen in the service of the \r\n" + //
            "Government of India or the provisions of any special or local law";
    //chapter 2
    String section_6 = "SECTION 6: Definitions in the Code to be understood subject to exceptions.\u2014Throughout this Code every \r\n" + //
            "definition of an offence, every penal provision, and every illustration of every such definition or penal \r\n" + //
            "provision, shall be understood subject to the exceptions contained in the Chapter entitled \u201CGeneral \r\n" + //
            "Exceptions\u201D, though those exceptions are not repeated in such definition, penal provision, or illustration.\r\n" + //
            "Illustrations\r\n" + //
            "(a) The sections, in this Code, which contain definitions of offences, do not express that a child under seven years of age \r\n" + //
            "cannot commit such offences; but the definitions are to be understood subject to the general exception which provides that \r\n" + //
            "nothing shall be an offence which is done by a child under seven years of age.\r\n" + //
            "(b) A, a police-officer, without warrant, apprehends Z, who has committed murder. Here A is not guilty of the offence of \r\n" + //
            "wrongful confinement; for he was bound by law to apprehend Z, and therefore the case falls within the general exception which\r\n" + //
            "provides that \u201Cnothing is an offence which is done by a person who is bound by law to do it\u201D";
    String section_7 = "SECTION 7: Sense of expression once explained.\u2014Every expression which is explained in any part of this \r\n" + //
            "Code, is used in every part of this Code in conformity with the explanation";
    String section_8 = "SECTION 8: Gender.\u2014The pronoun \u201Che\u201D and its derivatives are used of any person, whether male or female";
    String section_9 = "SECTION 9: Number.\u2014Unless the contrary appears from the context, words importing the singular number \r\n" + //
            "include the plural number, and words importing the plural number include the singular number";
    String section_10 = "SECTION 10:\u201CMan\u201D. \u201CWoman\u201D.\u2014The word \u201Cman\u201D denotes a male human being of any age; the word \r\n" + //
            "\u201Cwoman\u201D denotes a female human being of any age";
    String section_11 ="SECTION 11:\u201CPerson\u201D.\u2014The word \u201Cperson\u201D includes any Company or Association or body of persons, \r\n" + //
            "whether incorporated or not";
    String section_12 ="SECTION 12:\u201CPublic\u201D.\u2014The word \u201Cpublic\u201D includes any class of the public or any community";
    String section_13 ="SECTION 13: [Definition of \u201CQueen\u201D.] Omitted by the A. O. 1950";
    String section_14 ="SECTION 14:\u201CServant of Government\u201D.\u2014The words \u201Cservant of Government\u201D denote any officer or servant \r\n" + //
            "servant continued, appointed or employed in India by or under the authority of Government.";
    String section_15 ="SECTION 15: [Definition of \u201CBritish India\u201D.] Rep. by the A. O. 1937";
    String section_16 ="SECTION 16: [Definition of \u201CGovernment of India\u201D.] Rep., ibid";
    String section_17 ="SECTION 17:7 \u201CGovernment\u201D.\u2014The word \u201CGovernment\u201D denotes the Central Government or the Government \r\n" + //
            "of a 2\r\n" + //
            "***State";
    String section_18 ="SECTION 18:\u201CIndia\u201D.\u2014\u201CIndia\u201D means the territory of India excluding the State of Jammu and Kashmir";
    String section_19 ="SECTION 19\u201CJudge\u201D.\u2014The word \u201CJudge\u201D denotes not only every person who is officially designated as a \r\n" + //
            "Judge, but also every person.\r\n" + //
            "who is empowered by law to give, in any legal proceeding, civil or criminal, a definitive judgment, or \r\n" + //
            "a judgment which, if not appealed against, would be definitive, or a judgment which, if confirmed by \r\n" + //
            "some other authority, would be definitive, or\r\n" + //
            "who is one of a body or persons, which body of persons is empowered by law to give such a \r\n" + //
            "judgment.\r\n" + //
            "Illustrations\r\n" + //
            "(a) A Collector exercising jurisdiction in a suit under Act 10 of 1859, is a Judge.\r\n" + //
            "(b) A Magistrate exercising jurisdiction in respect of a charge on which he has power to sentence to fine or imprisonment,\r\n" + //
            "with or without appear, is a Judge.\r\n" + //
            "(c) A member of a panchayat which has power, under 4Regulation VII, 1816, of the Madras Code, to try and determine suits, \r\n" + //
            "suits, is a Judge.\r\n" + //
            "(d) A Magistrate exercising jurisdiction in respect of a charge on which he has power only to commit for trial to another \r\n" + //
            "Court, is not a Judge";
    String section_20 ="SECTION 20:\u201CCourt of Justice\u201D.\u2014The words \u201CCourt of Jutsice\u201D denote a Judge who is empowered by law to \r\n" + //
            "act judicially alone, or a body of Judges which is empowered by law to act judicially as a body, when \r\n" + //
            "such Judge or body of Judges is acting judicially.\r\n" + //
            "Illustration\r\n" + //
            "A Panchayat acting under 4Regulation VII, 1816, of the Madras Code, having power to try and determine suits, is a Court of \r\n" + //
            "Justice.";
    String section_21 ="SECTION 21:\u201CPublic servant\u201D.\u2014The words \u201Cpublic servant\u201D denote a person falling under any of the \r\n" + //
            "descriptions hereinafter following, namely:\u2014\r\n" + //
            "5\r\n" + //
            "* * * * *\r\n" + //
            "Second.\u2014Every Commissioned Officer in the Military, 6\r\n" + //
            "[Naval or Air] Forces 7\r\n" + //
            "[\r\n" + //
            "8\r\n" + //
            "*** of India];\r\n" + //
            "9\r\n" + //
            "[Third.\u2014Every Judge including any person empowered by law to discharge, whether by himself or \r\n" + //
            "as a member of any body of persons, any adjudicatory functions;]\r\n" + //
            "Fourth.\u2014Every officer of a Court of Justice 10[(including a liquidator, receiver or commissioner)] \r\n" + //
            "whose duty it is, as such officer, to investigate or report on any matter of law or fact, or to make, \r\n" + //
            "authenticate, or keep any document, or to take charge or dispose of any property, or to execute any \r\n" + //
            "judicial process, or to administer any oath, or to interpret, or to preserve order in the Court, and every \r\n" + //
            "person specially authorised by a Court of Justice to perform any of such duties;\r\n" + //
            "Fifth.\u2014Every juryman, assessor, or member of a panchayat assisting a Court of Justice or public \r\n" + //
            "servant;Sixth.\u2014Every arbitrator or other person to whom any cause or matter has been referred for decision \r\n" + //
            "or report by any Court of Justice, or by any other competent public authority;\r\n" + //
            "Seventh.\u2014Every person who holds any office by virtue of which he is empowered to place or keep \r\n" + //
            "any person in confinement;\r\n" + //
            "Eighth.\u2014Every officer of 1\r\n" + //
            "[the Government] whose duty it is, as such officer, to prevent offences, to \r\n" + //
            "give information of offences, to bring offenders to justice, or to protect the public health, safety or \r\n" + //
            "convenience;\r\n" + //
            "Ninth.\u2014Every officer whose duty it is as such officer, to take, receive, keep or expend any property \r\n" + //
            "on behalf of 1\r\n" + //
            "[the Government], or to make any survey, assessment or contract on behalf of 1\r\n" + //
            "[the \r\n" + //
            "Government], or to execute any revenue-process, or to investigate, or to report, on any matter affecting \r\n" + //
            "the pecuniary interests of 1\r\n" + //
            "[the Government], or to make, authenticate or keep any document relating to \r\n" + //
            "the pecuniary interests of 1\r\n" + //
            "[the Government], or to prevent the infraction of any law for the protection of \r\n" + //
            "the pecuniary interests of 1\r\n" + //
            "[the Government] 2\r\n" + //
            "***;\r\n" + //
            "Tenth.\u2014Every officer whose duty it is, as such officer, to take, receive, keep or expend any property, \r\n" + //
            "to make any survey or assessment or to levy any rate or tax for any secular common purpose of any \r\n" + //
            "village, town or district, or to make, authenticate or keep any document for the ascertaining of the rights \r\n" + //
            "of the people of any village, town or district;\r\n" + //
            "3\r\n" + //
            "[Eleventh.\u2014Every person who holds any office in virtue of which he is empowered to prepare, \r\n" + //
            "publish, maintain or revise an electoral roll or to conduct an election or part of an election;]\r\n" + //
            "4\r\n" + //
            "[Twelfth.\u2014Every person\u2014\r\n" + //
            "(a) in the service or pay of the Government or remunerated by fees or commission for the \r\n" + //
            "performance of any public duty by the Government;\r\n" + //
            "(b) in the service or pay of a local authority, a corporation established by or under a Central, \r\n" + //
            "Provincial or State Act or a Government company as defined in section 617 of the Companies \r\n" + //
            "Act, 1956 (1 of 1956).]\r\n" + //
            "Illustration\r\n" + //
            "A Municipal Commissioner is a public servant.\r\n" + //
            "Explanation 1.\u2014Persons falling under any of the above descriptions are public servants, whether \r\n" + //
            "appointed by the Government or not.\r\n" + //
            "Explanation 2.\u2014Wherever the words \u201Cpublic servant\u201D occur, they shall be understood of every \r\n" + //
            "person who is in actual possession of the situation of a public servant, whatever legal defect there may be \r\n" + //
            "in his right to hold that situation.\r\n" + //
            "3\r\n" + //
            "[Explanation 3.\u2014The word \u201Celection\u201D denotes an election for the purpose of selecting members of \r\n" + //
            "any legislative, municipal or other public authority, of whatever character, the method of selection to \r\n" + //
            "which is by, or under, any law prescribed as by election.]\r\n" + //
            "5\r\n" + //
            "* * * * *";
    String section_22 ="SECTION 22:\u201CMovable property\u201D.\u2014The words \u201Cmovable property\u201D are intended to include corporeal \r\n" + //
            "property of every description, except land and things attached to the earth or permanently fastened to \r\n" + //
            "anything which is attached to the earth";
    String section_23 ="SECTION 23:\u201CWrongful gain\u201D.\u2014\u201CWrongful gain\u201D is gain by unlawful means of property to which the person \r\n" + //
            "gaining is not legally entitled.\u201CWrongful loss\u201D.\u2014\u201CWrongful loss\u201D is the loss by unlawful means of property to which the person\r\n" + //
            "losing it is legally entitled.Gaining wrongfully/Losing wrongfully.\u2014A person is said to gain wrongfully when such person \r\n" + //
            "retains wrongfully, as well as when such person acquires wrongfully. A person is said to lose wrongfully \r\n" + //
            "when such person is wrongfully kept out of any property, as well as when such person is wrongfully \r\n" + //
            "deprived of property.";
    String section_24 ="SECTION 24:\u201CDishonestly\u201D.\u2014Whoever does anything with the intention of causing wrongful gain to one \r\n" + //
            "person or wrongful loss to another person, is said to do that thing \u201Cdishonestly\u201D";
    String section_25 ="SECTION 25:\u201CFraudulently\u201D.\u2014A person is said to do a thing fraudulently if he does that thing with intent to \r\n" + //
            "defraud but not otherwise";
    String section_26 ="SECTION 26:\u201CReason to believe\u201D.\u2014A person is said to have \u201Creason to believe\u201D a thing, if he has sufficient \r\n" + //
            "cause to believe that thing but not otherwise";
    String section_27 ="SECTION 27:\u201CProperty in possession of wife, clerk or servant\u201D.\u2014When property is in the possession of a \r\n" + //
            "person's wife, clerk or servant, on account of that person, it is in that person's possession within the \r\n" + //
            "meaning of this Code.\r\n" + //
            "Explanation.\u2014A person employed temporarily or on a particular occasion in the capacity of a clerk\r\n" + //
            "or servant, is a clerk or servant within the meaning of this section";
    String section_28 ="SECTION 28:\u201CCounterfeit\u201D.\u2014A person is said to \u201Ccounterfeit\u201D who causes one thing to resemble another \r\n" + //
            "thing, intending by means of that resemblance to practise deception, or knowing it to be likely that \r\n" + //
            "deception will thereby be practised.\r\n" + //
            "1\r\n" + //
            "[Explanation 1.\u2014It is not essential to counterfeiting that the imitation should be exact.\r\n" + //
            "Explanation 2.\u2014When a person causes one thing to resemble another thing, and the resemblance is \r\n" + //
            "such that a person might be deceived thereby, it shall be presumed, until the contrary is proved, that the \r\n" + //
            "person so causing the one thing to resemble the other thing intended by means of that resemblance to \r\n" + //
            "practise deception or knew it to be likely that deception would thereby be practised.]";
    String section_29 ="SECTION 29:\u201CDocument\u201D.\u2014The word \u201Cdocument\u201D denotes any matter expressed or described upon any \r\n" + //
            "substance by means of letters, figures or marks, or by more than one of those means, intended to be used, \r\n" + //
            "or which may be used, as evidence of that matter.\r\n" + //
            "Explanation 1.\u2014It is immaterial by what means or upon what substance the letters, figures or marks \r\n" + //
            "are formed, or whether the evidence is intended for, or may be used in, a Court of Justice, or notExplanation 2.\u2014Whatever is expressed by means of letters, figures or marks as explained by \r\n" + //
            "mercantile or other usage, shall be deemed to be expressed by such letters, figures or marks within the \r\n" + //
            "meaning of this section, although the same may not be actually expressed";
    String section_29A ="SECTION 29A:\u201CElectronic record\u201D.\u2014The words \u201Celectronic record\u201D shall have the meaning assigned to \r\n" + //
            "them in clause (t) of sub-section (1) of section 2 of the Information Technology Act, 2000 (21 of 2000).]";
    String section_30 ="SECTION 30:\u201CValuable security\u201D.\u2014The words \u201Cvaluable security\u201D denote a document which is, or purports to \r\n" + //
            "be, a document whereby any legal right is created, extended, transferred, restricted, extinguished or released, or whereby any person acknowledges that he lies under legal liability, or has not a certain legal \r\n" + //
            "right.";
    String section_31 ="SECTION 31:\u201CA will\u201D.\u2014The words \u201Ca will\u201D denote any testamentary document.";
    String section_32 ="SECTION 32:Words referring to acts include illegal omissions.\u2014In every part of this Code, except where a \r\n" + //
            "contrary intention appears from the context, words which refer to acts done extend also to illegal \r\n" + //
            "omissions.";
    String section_33 ="SECTION 33:\u201CAct\u201D. \u201COmission\u201D.\u2014The word \u201Cact\u201D denotes as well as series of acts as a single act: the word \r\n" + //
            "\u201Comission\u201D denotes as well a series of omissions as a single omission";
    String section_34 ="SECTION 34:[34. Acts done by several persons in furtherance of common intention.\u2014When a criminal act is \r\n" + //
            "done by several persons in furtherance of the common intention of all, each of such persons is liable for \r\n" + //
            "that act in the same manner as if it were done by him alone.]";
    String section_35 ="SECTION 35:When such an act is criminal by reason of its being done with a criminal knowledge or \r\n" + //
            "intention.\u2014Whenever an act, which is criminal only by reason of its being done with a criminal \r\n" + //
            "knowledge or intention, is done by several persons, each of such persons who joins in the act with such \r\n" + //
            "knowledge or intention is liable for the act in the same manner as if the act were done by him alone with \r\n" + //
            "that knowledge or intention.";
    String section_36 ="SECTION 36: Effect caused partly by act and partly by omission.\u2014Wherever the causing of a certain effect, \r\n" + //
            "or an attempt to cause that effect, by an act or by an omission, is an offence, it is to be understood that the \r\n" + //
            "causing of that effect partly by an act and partly by an omission is the same offence.\r";
    String section_37 ="SECTION 37: Co-operation by doing one of several acts constituting an offence.\u2014When an offence is \r\n" + //
            "committed by means of several acts, whoever intentionally co-operates in the commission of that offence \r\n" + //
            "by doing any one of those acts, either singly or jointly with any other person, commits that offence.\r\n" + //
            "Illustrations\r\n" + //
            "(a) A and B agree to murder Z by severally and at different times giving him small doses of poison. A and B administer the \r\n" + //
            "poison according to the agreement with intent to murder Z. Z dies from the effects the several doses of poison so administered to \r\n" + //
            "him. Here A and B intentionally cooperate in the commission of murder and as each of them does an act by which the death is \r\n" + //
            "caused, they are both guilty of the offence though their acts are separate.\r\n" + //
            "(b) A and B are joint jailors, and as such have the charge of Z, a prisoner, alternatively for six hours at a time. A and B, \r\n" + //
            "intending to cause Z's death, knowingly co-operate in causing that effect by illegally omitting, each during the time of his \r\n" + //
            "attendance, to furnish Z with food supplied to them for that purpose. Z dies of hunger. Both A and B are guilty of the murder of \r\n" + //
            "Z.\r\n" + //
            "(c) A, a jailor, has the charge of Z, a prisoner. A, intending to cause Z's death, illegally omits to supply Z with food; in \r\n" + //
            "consequence of which Z is much reduced in strength, but the starvation is not sufficient to cause his death. A is dismissed from \r\n" + //
            "his office, and B succeeds him. B, without collusion or co-operation with A, illegally omits to supply Z with food, knowing that \r\n" + //
            "he is likely thereby to cause Z's death. Z dies of hunger. B is guilty of murder, but, as A did not co-operate with B. A is guilty \r\n" + //
            "only of an attempt to commit murder.";
    String section_38 ="SECTION 38: Persons concerned in criminal act may be guilty of different offences.\u2014Where several \r\n" + //
            "persons are engaged or concerned in the commission of a criminal act, they may be guilty of different\r\n" + //
            "offences by means of that act.\r";
    String section_39 ="SECTION 39:\u201CVoluntarily\u201D.\u2014A person is said to cause an effect \u201Cvoluntarily\u201D when he causes it by means \r\n" + //
            "whereby he intended to cause it, or by means which, at the time of employing those means, he knew or \r\n" + //
            "had reason to believe to be likely to cause it.";
    String section_40 ="SECTION 40:1\r\n" + //
            "[40. \u201COffence\u201D.\u2014Except in the 2\r\n" + //
            "[Chapters] and sections mentioned in clauses 2 and 3 of this section, \r\n" + //
            "the word \u201Coffence\u201D denotes a thing made punishable by this Code.\r\n" + //
            "In Chapter IV, 3\r\n" + //
            "[Chapter VA] and in the following sections, namely, sections 4\r\n" + //
            "[64, 65, 66, 5\r\n" + //
            "[67], 71], \r\n" + //
            "109, 110, 112, 114, 115, 116, 117,6\r\n" + //
            "[118, 119 and 120] 187, 194, 195, 203, 211, 213, 214, 221, 222, 223, \r\n" + //
            "224, 225, 327, 328, 329, 330, 331, 347, 348, 388, 389 and 445, the word \u201Coffence\u201D denotes a thing \r\n" + //
            "punishable under this Code, or under any special or local law as hereinafter defined.\r\n" + //
            "And in sections 141, 176, 177, 201, 202, 212, 216 and 441, the word \u201Coffence\u201D has the same meaning \r\n" + //
            "when the thing punishable under the special or local law is punishable under such law with imprisonment \r\n" + //
            "for a term of six months or upwards, whether with or without fine.]";
    String section_41 ="SECTION 41:\u201CSpecial law\u201D.\u2014A \u201Cspecial law\u201D is a law applicable to a particular subject.";
    String section_42 ="SECTION 42:\u201CLocal law\u201D.\u2014A \u201Clocal law\u201D is a law applicable only to a particular part of 7\r\n" + //
            "[\r\n" + //
            "8\r\n" + //
            "***9\r\n" + //
            "[India]].\r";
    String section_43 ="SECTION 43:\u201CIllegal\u201D. \u201CLegally bound to do\u201D.\u2014The word \u201Cillegal\u201D is applicable to everything which is an \r\n" + //
            "offence or which is prohibited by law, or which furnishes ground for a civil action; and a person is said to \r\n" + //
            "be \u201Clegally bound to do\u201D whatever it is illegal in him to omit.";
    String section_44 ="SECTION 44:\u201CInjury\u201D.\u2014The word \u201Cinjury\u201D denotes any harm whatever illegally caused to any person, in \r\n" + //
            "body, mind, reputation or property";
    String section_45 ="SECTION 45:\u201CLife\u201D.\u2014The word \u201Clife\u201D denotes the life of a human being, unless the contrary appears from the \r\n" + //
            "context.";
    String section_46 ="SECTION 46:\u201CDeath\u201D.\u2014The word \u201Cdeath\u201D denotes the death of a human being unless the contrary appears \r\n" + //
            "from the context.";
    String section_47 ="SECTION 47:\u201CAnimal\u201D.\u2014The word \u201Canimal\u201D denotes any living creature, other than a human being.";
    String section_48 ="SECTION 48:\u201CVessel\u201D.\u2014The word \u201Cvessel\u201D denotes anything made for the conveyance by water of human \r\n" + //
            "beings or of property.\r";
    String section_49 ="SECTION 49:\u201CYear\u201D. \u201CMonth\u201D.\u2014Wherever the word \u201Cyear\u201D or the word \u201Cmonth\u201D is used, it is to be \r\n" + //
            "understood that the year or the month is to be reckoned according to the British calendar.\r";
    String section_50 ="SECTION 50:\u201CSection\u201D.\u2014The word \u201Csection\u201D denotes one of those portions of a Chapter of this Code which \r\n" + //
            "are distinguished by prefixed numeral figures.";
    String section_51 ="SECTION 51:\u201COath\u201D.\u2014The word \u201Coath\u201D includes a solemn affirmation substituted by law for an oath, and any \r\n" + //
            "declaration required or authorised by law to be made before a public servant or to be used for the purpose \r\n" + //
            "of proof, whether in a Court of Justice or not.";
    String section_52 ="SECTION 52\u201CGood faith\u201D.\u2014Nothing is said to be done or believed in \u201Cgood faith\u201D which is done or believed \r\n" + //
            "without due care and attention.:";
    String section_52A ="SECTION 52A:1\r\n" + //
            "[52A. \u201CHarbour\u201D.\u2014Except in section 157, and in section 130 in the case in which the harbour is \r\n" + //
            "given by the wife or husband of the person harboured, the word \u201Charbour\u201D includes the supplying a person \r\n" + //
            "with shelter, food, drink, money, clothes, arms, ammunition or means of conveyance, or the assisting a \r\n" + //
            "person by any means, whether of the same kind as those enumerated in this section or not, to evade \r\n" + //
            "apprehension.]";
    String section_53 ="SECTION 53:Punishments.\u2014The punishments to which offenders are liable under the provisions of this Code \r\n" + //
            "are\u2014\r\n" + //
            "First.\u2014Death;\r\n" + //
            "2\r\n" + //
            "[Secondly.\u2014Imprisonment for life;]\r\n" + //
            "3\r\n" + //
            "* * * * *\r\n" + //
            "Fourthly.\u2014Imprisonment, which is of two descriptions, namely:\u2014\r\n" + //
            "(1) Rigorous, that is, with hard labour;\r\n" + //
            "(2) Simple;\r\n" + //
            "Fifthly.\u2014Forfeiture of property;\r\n" + //
            "Sixthly.\u2014Fine";
    String section_53A ="SECTION 53A:4\r\n" + //
            "[53A. Construction of reference to transportation.\u2014(1) Subject to the provisions of \r\n" + //
            "sub-section (2) and sub-section (3), any reference to \u201Ctransportation for life\u201D in any other law for the time \r\n" + //
            "being in force or in any instrument or order having effect by virtue of any such law or of any enactment \r\n" + //
            "repealed shall be construed as a reference to \u201Cimprisonment for life\u201D.\r\n" + //
            "(2) In every case in which a sentence of transportation for a term has been passed before the \r\n" + //
            "commencement of the Code of Criminal Procedure (Amendment) Act, 5\r\n" + //
            "[1955 (26 of 1955)], the offender \r\n" + //
            "shall be dealt with in the same manner as if sentenced to rigorous imprisonment for the same term.\r\n" + //
            "(3) Any reference to transportation for a term or to transportation for any shorter term (by whatever \r\n" + //
            "name called) in any other law for the time being in force shall be deemed to have been omitted.\r\n" + //
            "(4) Any reference to \u201Ctransportation\u201D in any other law for the time being in force shall,\u2014\r\n" + //
            "(a) if the expression means transportation for life, be construed as a reference to imprisonment for \r\n" + //
            "life;\r\n" + //
            "(b) if the expression means transportation for any shorter term, be deemed to have been omitted.]";
    String section_54 ="SECTION 54:Commutation of sentence of death.\u2014In every case in which sentence of death shall have been \r\n" + //
            "passed, 6\r\n" + //
            "[the appropriate Government] may, without the consent of the offender, commute the punishment \r\n" + //
            "punishment for any other punishment provided by this Code.";
    String section_55 ="SECTION 55:Commutation of sentence of imprisonment for life.\u2014In every case in which sentence of \r\n" + //
            "7\r\n" + //
            "[imprisonment] for life shall have been passed, 8\r\n" + //
            "[the appropriate Government] may, without the consentconsent of the offender, commute the punishment for imprisonment of either description for a term not \r\n" + //
            "exceeding fourteen years";
    String section_55A ="SECTION 55A:1\r\n" + //
            "[55A. Definition of \u201Cappropriate Government\u201D.\u2014In sections fifty-four and fifty-five the \r\n" + //
            "expression \u201Cappropriate Government\u201D means,\u2014\r\n" + //
            "(a) in cases where the sentence is a sentence of death or is for an offence against any law relating \r\n" + //
            "to a matter to which the executive power of the Union extends, the Central Government; and\r\n" + //
            "(b) in cases where the sentence (whether of death or not) is for an offence against any law relating \r\n" + //
            "to a matter to which the executive power of the State extends, the Government of the State within \r\n" + //
            "which the offender is sentenced.]";
    String section_56 ="SECTION 56: [Sentence of Europeans and Americans to penal servitude. Proviso as to sentence for term \r\n" + //
            "exceeding ten years but not for life.] Rep. by the Criminal Law (Removal of Racial Discriminations) Act, \r\n" + //
            "1949 (17 of 1949) (w. e. f. 6-4-1949).";
    String section_57 ="SECTION 57:Fractions of terms of punishment.\u2014In calculating fractions of terms of punishment, \r\n" + //
            "2\r\n" + //
            "[imprisonment] for life shall be reckoned as equivalent to2\r\n" + //
            "[imprisonment] for twenty years.\r";
    String section_58 ="SECTION 58:. [Offenders sentenced to transportation how dealt with until transported.] Rep. by the Code of \r\n" + //
            "Criminal Procedure (Amendment) Act, 1955 (26 of 1955), s. 117 and the Sch. (w.e.f. 1-1-1956).";
    String section_59 ="SECTION 59: [Transportation instead of imprisonment.] Rep. by s.117 and the Sch., ibid. (w.e.f. 1-1-1956).\r";
    String section_60 ="SECTION 60:Sentence may be (in certain cases of imprisonment) wholly or partly rigorous or simple.\u2014In \r\n" + //
            "every case in which an offender is punishable with imprisonment which may be of either description, it \r\n" + //
            "shall be competent to the Court which sentences such offender to direct in the sentence that such \r\n" + //
            "imprisonment shall be wholly rigorous, or that such imprisonment shall be wholly simple, or that any part \r\n" + //
            "of such imprisonment shall be rigorous and the rest simple.\r";
    String section_61 ="SECTION 61: [Sentence of forfeiture of property.] Rep. by the Indian Penal Code (Amendment) Act, 1921 \r\n" + //
            "(16 of 1921), s. 4.";
    String section_62 ="SECTION 62:[Forfeiture of property, in respect of offenders punishable with death, transportation or \r\n" + //
            "imprisonment.] Rep. by s. 4 ibid.";
    String section_63 ="SECTION 63: Amount of fine.\u2014Where no sum is expressed to which a fine may extend, the amount of fine to \r\n" + //
            "which the offender is liable is unlimited, but shall not be excessive.";
    String section_64 ="SECTION 64: Sentence of imprisonment for non-payment of fine.\u20143\r\n" + //
            "[In every case of an offence punishable \r\n" + //
            "with imprisonment as well as fine, in which the offender is sentenced to a fine, whether with or without \r\n" + //
            "imprisonment,\r\n" + //
            "and in every case of an offence punishable 4\r\n" + //
            "[with imprisonment or fine, or] with fine only, in which \r\n" + //
            "the offender is sentenced to a fine.]\r\n" + //
            "it shall be competent to the Court which sentences such offender to direct by the sentence that, in \r\n" + //
            "default of payment of the fine, the offender shall suffer imprisonment for a certain term, which \r\n" + //
            "imprisonment shall be in excess of any other imprisonment to which he may have been sentenced or to \r\n" + //
            "which he may be liable under a commutation of a sentence. ";
    String section_65 ="SECTION 65: Limit to imprisonment for non-payment of fine, when imprisonment and fine awardable.\u2014\r\n" + //
            "The term for which the Court directs the offender to be imprisoned in default of payment of a fine shall \r\n" + //
            "not exceed one-fourth of the term of imprisonment which is the maximum fixed for the offence, if the \r\n" + //
            "offence be punishable with imprisonment as well as fine.\r";
    String section_66 ="SECTION 66:Description of imprisonment for non-payment of fine.\u2014The imprisonment which the Court \r\n" + //
            "imposes in default of payment of a fine may be of any description to which the offender might have been \r\n" + //
            "sentenced for the offence.";
    String section_67 ="SECTION 67:Imprisonment for non-payment of fine, when offence punishable with fine only.\u2014If the \r\n" + //
            "offence be punishable with fine only, 1\r\n" + //
            "[the imprisonment which the Court imposes in default of payment \r\n" + //
            "of the fine shall be simple, and] the term for which the Court directs the offender to be imprisoned, in \r\n" + //
            "default of payment of fine, shall not exceed the following scale, that is to say, for any term not exceeding \r\n" + //
            "two months when the amount of the fine shall not exceed fifty rupees, and for any term not exceeding \r\n" + //
            "four months when the amount shall not exceed one hundred rupees, and for any term not exceeding six \r\n" + //
            "months in any other case.";
    String section_68 ="SECTION 68: Imprisonment to terminate on payment of fine.\u2014The imprisonment which is imposed in \r\n" + //
            "default of payment of a fine shall terminate whenever that fine is either paid or levied by process of law.\r";
    String section_69 ="SECTION 69: Termination of imprisonment on payment of proportional part of fine.\u2014If, before the \r\n" + //
            "expiration of the term of imprisonment fixed in default of payment, such a proportion of the fine be paid \r\n" + //
            "or levied that the term of imprisonment suffered in default of payment is not less than proportional to the \r\n" + //
            "part of the fine still unpaid, the imprisonment shall terminate.";
    String section_70 ="SECTION 70:Fine leviable within six years, of during imprisonment. Death not to discharge property \r\n" + //
            "from liability.\u2014The fine, or any part thereof which remains unpaid, may be levied at any time within six \r\n" + //
            "years after the passing of the sentence, and if, under the sentence, the offender be liable to imprisonment \r\n" + //
            "for a longer period than six years, then at any time previous to the expiration of that period; and the death \r\n" + //
            "of the offender does not discharge from the liability any property which would, after his death, be legally \r\n" + //
            "liable for his debts.";
    String section_71 ="SECTION 71: Limit of punishment of offence made up of several offences.\u2014Where anything which is an \r\n" + //
            "offence is made up of parts, any of which parts is itself an offence, the offender shall not be punished with \r\n" + //
            "the punishment of more than one of such his offences, unless it be so expressly provided.\r\n" + //
            "2\r\n" + //
            "[Where anything is an offence falling within two or more separate definitions of any law in force for \r\n" + //
            "the time being by which offences are defined or punished, or\r\n" + //
            "where several acts, of which one or more than one would by itself or themselves constitute an \r\n" + //
            "offence, constitute, when combined, a different offence,\r\n" + //
            "the offender shall not be punished with a more severe punishment than the Court which tries him \r\n" + //
            "could award for any one of such offences].";
    String section_72 ="SECTION 72:. Punishment of person guilty of one of several offences, the judgment stating that it is \r\n" + //
            "doubtful of which.\u2014In all cases in which judgment is given that a person is guilty of one of several \r\n" + //
            "offences specified in the judgment, but that it is doubtful of which of these offences he is guilty, the \r\n" + //
            "offender shall be punished for the offence for which the lowest punishment is provided if the same \r\n" + //
            "punishment is not provided for all.";
    String section_73 ="SECTION 73: Solitary confinement.\u2014Whenever any person is convicted of an offence for which under this \r\n" + //
            "Code the Court has power to sentence him to rigorous imprisonment, the Court may, by its sentence, \r\n" + //
            "order that the offender shall be kept in solitary confinement for any portion or portions of the \r\n" + //
            "imprisonment to which he is sentenced, not exceeding three months in the whole, according to the \r\n" + //
            "following scale, that is to say\u2014\r\n" + //
            "a time not exceeding one month if the term of imprisonment shall not exceed six months;\r\n" + //
            "a time not exceeding two months if the term of imprisonment shall exceed six months and1\r\n" + //
            "[shall not \r\n" + //
            "exceed one] year\r\n" + //
            "a time not exceeding three months if the term of imprisonment shall exceed one year.";
    String section_74 ="SECTION 74:Limit of solitary confinement.\u2014In executing a sentence of solitary confinement, such \r\n" + //
            "confinement shall in no case exceed fourteen days at a time, with intervals between the periods of solitary \r\n" + //
            "confinement of not less duration than such periods; and when the imprisonment awarded shall exceed \r\n" + //
            "three months, the solitary confinement shall not exceed seven days in any one month of the whole \r\n" + //
            "imprisonment awarded, with intervals between the periods of solitary confinement of not less duration \r\n" + //
            "than such periods.";
    String section_75 ="SECTION 75:Limit of solitary confinement.\u2014In executing a sentence of solitary confinement, such \r\n" + //
            "confinement shall in no case exceed fourteen days at a time, with intervals between the periods of solitary \r\n" + //
            "confinement of not less duration than such periods; and when the imprisonment awarded shall exceed \r\n" + //
            "three months, the solitary confinement shall not exceed seven days in any one month of the whole \r\n" + //
            "imprisonment awarded, with intervals between the periods of solitary confinement of not less duration \r\n" + //
            "than such periods.";
    String section_76 ="SECTION 76: Act done by a person bound, or by mistake of fact believing himself bound, by law.\u2014\r\n" + //
            "Nothing is an offence which is done by a person who is, or who by reason of a mistake of fact and not by \r\n" + //
            "reason of a mistake of law in good faith believes himself to be, bound by law to do it.\r\n" + //
            "Illustrations\r\n" + //
            "(a) A, a soldier, fires on a mob by the order of his superior officer, in conformity with the commands of the law. A has \r\n" + //
            "committed no offence.\r\n" + //
            "(b) A, an officer of a Court of Justice, being ordered by that Court to arrest Y, and after due enquiry, believing Z to be Y, \r\n" + //
            "arrests Z. A has committed no offence.\r";
    String section_77 ="SECTION 77: Act of Judge when acting judicially.\u2014Nothing is an offence which is done by a Judge when \r\n" + //
            "acting judicially in the exercise of any power which is, or which in good faith he believes to be, given to \r\n" + //
            "him by law.\r";
    String section_78 ="SECTION 78:Act done pursuant to the judgment or order of Court.\u2014Nothing which is done in pursuance \r\n" + //
            "of, or which is warranted by the judgment or order of, a Court of Justice; if done whilst such judgment or \r\n" + //
            "order remains in force, is an offence, notwithstanding the Court may have had no jurisdiction to pass such \r\n" + //
            "judgment or order, provided the person doing the act in good faith believes that the Court had such \r\n" + //
            "jurisdiction.";
    String section_79 ="SECTION 79: Act done by a person justified, or by mistake of fact believing himself, justified, by law.\u2014\r\n" + //
            "Nothing is an offence which is done by any person who is justified by law, or who by reason of a mistake \r\n" + //
            "of fact and not by reason of a mistake of law in good faith, believes himself to be justified by law, in \r\n" + //
            "doing it.\r";
    String section_80 ="SECTION 80:Accident in doing a lawful act.\u2014Nothing is an offence which is done by accident or misfortune, \r\n" + //
            "and without any criminal intention or knowledge in the doing of a lawful act in a lawful manner by lawful \r\n" + //
            "means and with proper care and caution.";
    String section_81 ="SECTION 81: Act likely to cause harm, but done without criminal intent, and to prevent other harm.\u2014\r\n" + //
            "Nothing is an offence merely by reason of its being done with the knowledge that it is likely to cause \r\n" + //
            "harm, if it be done without any criminal intention to cause harm, and in good faith for the purpose of \r\n" + //
            "preventing or avoiding other harm to person or property.\r\n" + //
            "Explanation.\u2014It is a question of fact in such a case whether the harm to be prevented or avoided was \r\n" + //
            "of such a nature and so imminent as to justify or excuse the risk of doing the act with the knowledge that \r\n" + //
            "it was likely to cause harm.";
    String section_82 ="SECTION 82:Act of a child under seven years of age.\u2014Nothing is an offence which is done by a child under \r\n" + //
            "seven years of age. ";
    String section_83 ="SECTION 83:Act of a child above seven and under twelve of immature understanding.\u2014Nothing is an \r\n" + //
            "offence which is done by a child above seven years of age and under twelve, who has not attained \r\n" + //
            "sufficient maturity of understanding to judge of the nature and consequences of his conduct on that \r\n" + //
            "occasion.";
    String section_84 ="SECTION 84:Act of a person of unsound mind.\u2014Nothing is an offence which is done by a person who, at the \r\n" + //
            "time of doing it, by reason of unsoundness of mind, is incapable of knowing the nature of the act, or that \r\n" + //
            "he is doing what is either wrong or contrary to law";
    String section_85 ="SECTION 85: Act of a person incapable of judgment by reason of intoxication caused against his will.\u2014\r\n" + //
            "Nothing is an offence which is done by a person who, at the time of doing it, is, by reason of intoxication, \r\n" + //
            "incapable of knowing the nature of the act, or that he is doing what is either wrong, or contrary to \r\n" + //
            "law: provided that the thing which intoxicated him was administered to him without his knowledge or \r\n" + //
            "against his will.";
    String section_86 ="SECTION 86:. Offence requiring a particular intent or knowledge committed by one who is intoxicated.\u2014\r\n" + //
            "In cases where an act done is not an offence unless done with a particular knowledge or intent, a person \r\n" + //
            "who does the act in a state of intoxication shall be liable to be dealt with as if he had the same knowledge \r\n" + //
            "as he would have had if he had not been intoxicated, unless the thing which intoxicated him was \r\n" + //
            "administered to him without his knowledge or against his will.\r\n" + //
            "";
    String section_87 ="SECTION 87:Act not intended and not known to be likely to cause death or grievous hurt, done by \r\n" + //
            "consent.\u2014Nothing which is not intended to cause death, or grievous hurt, and which is not known by the \r\n" + //
            "doer to be likely to cause death or grievous hurt, is an offence by reason of any harm which it may cause, \r\n" + //
            "or be intended by the doer to cause, to any person, above eighteen years of age, who has given consent, \r\n" + //
            "whether express or implied, to suffer that harm; or by reason of any harm which it may be known by the \r\n" + //
            "doer to be likely to cause to any such person who has consented to take the risk of that harm.";
    String section_88 ="SECTION 88:Act not intended to cause death, done by consent in good faith for person's benefit.\u2014\r\n" + //
            "Nothing, which is not intented to cause death, is an offence by reason of any harm which it may cause, or \r\n" + //
            "be intended by the doer to cause, or be known by the doer to be likely to cause, to any person for whose \r\n" + //
            "benefit it is done in good faith, and who has given a consent, whether express or implied, to suffer that \r\n" + //
            "harm, or to take the risk of that harm.\r";
    String section_89 ="SECTION 89:Act done in good faith for benefit of child or insane person, by or by consent of guardian.\u2014\r\n" + //
            "Nothing which is done in good faith for the benefit of a person under twelve years of age, or of unsound \r\n" + //
            "mind, by or by consent, either express or implied, of the guardian or other person having lawful charge of \r\n" + //
            "that person, is an offence by reason of any harm which it may cause, or be intended by the doer to cause \r\n" + //
            "or be known by the doer to be likely to cause to that person: Provided\u2014\r\n" + //
            "Provisos. First.\u2014That this exception shall not extend to the intentional causing of death, or to the \r\n" + //
            "attempting to cause death;\r\n" + //
            "Secondly.\u2014That this exception shall not extend to the doing of anything which the person doing \r\n" + //
            "it knows to be likely to cause death, for any purpose other than the preventing of death or grievous \r\n" + //
            "hurt, or the curing of any grievous disease or infirmity;\r\n" + //
            "Thirdly.\u2014That this exception shall not extend to the voluntary causing of grievous hurt, or to the \r\n" + //
            "attempting to cause grievous hurt, unless it be for the purpose of preventing death or grievous hurt, or \r\n" + //
            "the curing of any grievous disease or infirmity;\r\n" + //
            "Fourthly.\u2014That this exception shall not extend to the abetment of any offence, to the committing \r\n" + //
            "of which offence it would not extend.";
    String section_90 ="SECTION 90: Consent known to be given under fear or misconception.\u2014A consent is not such a consent as \r\n" + //
            "is intended by any section of this Code, if the consent is given by a person under fear of injury, or under a \r\n" + //
            "misconception of fact, and if the person doing the act knows, or has reason to believe, that the consent \r\n" + //
            "was given in consequence of such fear or misconception; or\r\n" + //
            "Consent of insane person.\u2014if the consent is given by a person who, from unsoundness of mind, or \r\n" + //
            "intoxication, is unable to understand the nature and consequence of that to which he gives his consent; or\r\n" + //
            "Consent of child.\u2014unless the contrary appears from the context, if the consent is given by a person \r\n" + //
            "who is under twelve years of age.\r";
    String section_91 ="SECTION 91:Exclusion of acts which are offences independently of harm cause.\u2014The exceptions in \r\n" + //
            "sections 87, 88 and 89 do not extend to acts which are offences independently of any harm which they \r\n" + //
            "may cause, or be intended to cause, or be known to be likely to cause, to the person giving the consent, or \r\n" + //
            "on whose behalf the consent is given.\r\n" + //
            "";
    String section_92 ="SECTION 92: Act done in good faith for benefit of a person without consent.\u2014Nothing is an offence by \r\n" + //
            "reason of any harm which it may cause to a person for whose benefit it is done in good faith, even without \r\n" + //
            "that person's consent, if the circumstances are such that it is impossible for that person to signify consent, \r\n" + //
            "or if that person is incapable of giving consent, and has no guardian or other person in lawful charge of \r\n" + //
            "him from whom it is possible to obtain consent in time for the thing to be done with benefit: Provided\u2014\r\n" + //
            "Provisos. First.\u2014That this exception shall not extend to the intentional causing of death, or the \r\n" + //
            "attempting to cause death;\r\n" + //
            "Secondly.\u2014That this exception shall not extend to the doing of anything which the person doing it \r\n" + //
            "knows to be likely to cause death, for any purpose other than the preventing of death or grievous hurt, or \r\n" + //
            "the curing of any grievous disease or infirmity;\r\n" + //
            "Thirdly.\u2014That this exception shall not extend to the voluntary causing of hurt, or to the attempting to \r\n" + //
            "cause hurt, for any purpose other than the preventing of death or hurt;\r\n" + //
            "Fourthly.\u2014That this exception shall not extend to the abetment of any offence, to the committing of \r\n" + //
            "which offence it would not extend.";
    String section_93 ="SECTION 93: Communication made in good faith.\u2014No communication made in good faith is an offence by \r\n" + //
            "reason of any harm to the person to whom it is made, if it is made for the benefit of that person.\r";
    String section_94 ="SECTION 94:Act to which a person is compelled by threats.\u2014Except murder, and offences against the State \r\n" + //
            "punishable with death, nothing is an offence which is done by a person who is compelled to do it by \r\n" + //
            "threats, which, at the time of doing it, reasonably cause the apprehension that instant death to that person \r\n" + //
            "will otherwise be the consequence: Provided the person doing the act did not of his own accord, or from a \r\n" + //
            "reasonable apprehension of harm to himself short of instant death, place himself in the situation by which \r\n" + //
            "he became subject to such constraint.\r\n" + //
            "Explanation 1.\u2014A person who, of his own accord, or by reason of a threat of being beaten, joins a \r\n" + //
            "gang of dacoits, knowing their character, is not entitled to the benefit of this exception, on the ground of \r\n" + //
            "his having been compelled by his associates to do anything that is an offence by law.\r\n" + //
            "Explanation 2.\u2014A person seized by a gang of dacoits, and forced, by threat of instant death, to do a \r\n" + //
            "thing which is an offence by law; for example, a smith compelled to take his tools and to force the door of \r\n" + //
            "a house for the dacoits to enter and plunder it, is entitled to the benefit of this exception.\r\n" + //
            "";
    String section_95 ="SECTION 95:Act causing slight harm.\u2014Nothing is an offence by reason that it causes, or that it is intended to \r\n" + //
            "cause, or that it is known to be likely to cause, any harm, if that harm is so slight that no person of \r\n" + //
            "ordinary sense and temper would complain of such harm.";
    String section_96 ="SECTION 96:Things done in private defence.\u2014Nothing is an offence which is done in the exercise of the \r\n" + //
            "right of private defence.\r";
    String section_97 ="SECTION 97:Right of private defence of the body and of property.\u2014Every person has a right, subject to the \r\n" + //
            "restrictions contained in section 99, to defend\u2014\r\n" + //
            "First.\u2014His own body, and the body of any other person, against any offence affecting the human \r\n" + //
            "body;\r\n" + //
            "Secondly.\u2014The property, whether movable or immovable, of himself or of any other person, against \r\n" + //
            "any act which is an offence falling under the defintion of theft, robbery, mischief or criminal trespass, or \r\n" + //
            "which is an attempt to commit theft, robbery, mischief or criminal trespass.";
    String section_98 ="SECTION 98:Right of private defence against the act of a person of unsound mind, etc.\u2014When an act,\r\n" + //
            "which would otherwise be a certain offence, is not that offence, by reason of the youth, the want of \r\n" + //
            "maturity of understanding, the unsoundness of mind or the intoxication of the person doing that act, or by \r\n" + //
            "reason of any misconception on the part of that person, every person has the same right of private defence \r\n" + //
            "against that act which he would have if the act were that offence.";
    String section_99 ="SECTION 99:Acts against which there is no right of private defence.\u2014There is no right of private defence \r\n" + //
            "against an act which does not reasonably cause the apprehension of death or of grievous hurt, if done, or \r\n" + //
            "attempted to be done, by a public servant acting in good faith under colour of his office, though that act,\r\n" + //
            "may not be strictly justifiable by law.\r\n" + //
            "There is no right of private defence against an act which does not reasonably cause the apprehension \r\n" + //
            "of death or of grievous hurt, if done, or attempted to be done, by the direction of a public servant acting in \r\n" + //
            "good faith under colour of his office, though that direction may not be strictly justifiable by law.\r\n" + //
            "There is no right of private defence in cases in which there is time to have recourse to protection of \r\n" + //
            "the public authorities.\r\n" + //
            "Extent to which the right may be exercised.\u2014The right of private defence in no case extends to the \r\n" + //
            "inflicting of more harm than it is necessary to inflict for the purpose of defence.\r\n" + //
            "Explanation 1.\u2014A person is not deprived of the right of private defence against an act done, or \r\n" + //
            "attempted to be done, by a public servant, as such, unless he knows or has reason to believe, that the \r\n" + //
            "person doing the act is such public servant.\r\n" + //
            "Explanation 2.\u2014A person is not deprived of the right of private defence against an act done, or \r\n" + //
            "attempted to be done, by the direction of a public servant, unless he knows, or has reason to believe, that \r\n" + //
            "the person doing the act is acting by such direction, or unless such person states the authority under which \r\n" + //
            "he acts, or if he has authority in writing, unless he produces such authority, if demanded.";
    String section_100 ="SECTION 100:When the right of private defence of the body extends to causing death.\u2014The right of \r\n" + //
            "private defence of the body extends, under the restrictions mentioned in the last preceding section, to the \r\n" + //
            "voluntary causing of death or of any other harm to the assailant, if the offence which occasions the \r\n" + //
            "exercise of the right be of any of the descriptions hereinafter enumerated, namely:\u2014\r\n" + //
            "First.\u2014Such an assault as may reasonably cause the apprehension that death will otherwise be the \r\n" + //
            "consequence of such assault;\r\n" + //
            "Secondly.\u2014Such an assault as may reasonably cause the apprehension that grievous hurt will \r\n" + //
            "otherwise be the consequence of such assault;\r\n" + //
            "Thirdly.\u2014An assault with the intention of committing rape;\r\n" + //
            "Fourthly.\u2014An assault with the intention of gratifying unnatural lust;\r\n" + //
            "Fifthly.\u2014An assault with the intention of kidnapping or abducting;\r\n" + //
            "Sixthly.\u2014An assault with the intention of wrongfully confining a person, under circumstances which \r\n" + //
            "may reasonably cause him to apprehend that he will be unable to have recourse to the public authorities \r\n" + //
            "for his release.\r\n" + //
            "1\r\n" + //
            "[Seventhly.\u2014An act of throwing or administering acid or an attempt to throw or administer acid \r\n" + //
            "which may reasonably cause the apprehension that grievous hurt will otherwise be the consequence of \r\n" + //
            "such act.]\r";
    String section_101 ="SECTION 101:When such right extends to causing any harm other than death.\u2014If the offence be not of \r\n" + //
            "any of the descriptions enumerated in the last preceding section, the right of private defence of the body \r\n" + //
            "does not extend to the voluntary causing of death to the assailant, but does extend, under the restrictions \r\n" + //
            "mentioned in section 99, to the voluntary causing to the assailant of any harm other than death.";
    String section_102 ="SECTION 102:Commencement and continuance of the right of private defence of the body.\u2014The right of \r\n" + //
            "private defence of the body commences as soon as a reasonable apprehension of danger to the body arises \r\n" + //
            "from an attempt or threat to commit the offence though the offence may not have been committed; and it \r\n" + //
            "continues as long as such apprehension of danger to the body continues";
    String section_103 ="SECTION 103:When the right of private defence of property extends to causing death.\u2014The right of \r\n" + //
            "private defence of property extends, under the restrictions mentioned in section 99, to the voluntary \r\n" + //
            "causing of death or of any other harm to the wrong-doer, if the offence, the committing of which, or the \r\n" + //
            "attempting to commit which, occasions the exercise of the right, be an offence of any of the descriptions \r\n" + //
            "hereinafter enumerated, namely:\u2014\r\n" + //
            "First.\u2014Robbery;\r\n" + //
            "Secondly.\u2014House-breaking by night;\r\n" + //
            "Thirdly.\u2014Mischief by fire committed on any building, tent or vessel, which building, tent or vessel is \r\n" + //
            "used as a human dwelling, or as a place for the custody of property;\r\n" + //
            "Fourthly.\u2014Theft, mischief, or house-trespass, under such circumstances as may reasonably cause \r\n" + //
            "apprehension that death or grievous hurt will be the consequence, if such right of private defence is not \r\n" + //
            "exercised.";
    String section_104 ="SECTION 104:When such right extends to causing any harm other than death.\u2014If the offence, the \r\n" + //
            "committing of which, or the attempting to commit which occasions the exercise of the right of private \r\n" + //
            "defence, be theft, mischief, or criminal trespass, not of any of the descriptions enumerated in the last \r\n" + //
            "preceding section, that right does not extend to the voluntary causing of death, but does extend, subject to \r\n" + //
            "the restrictions mentioned in section 99, to the voluntary causing to the wrong-doer of any harm other \r\n" + //
            "than death.";
    String section_105 ="SECTION 105:Commencement and continuance of the right of private defence of property.\u2014The right of \r\n" + //
            "private defence of property commences when a reasonable apprehension of danger to the property \r\n" + //
            "commences.\r\n" + //
            "The right of private defence of property against theft continues till the offender has effected his retreat \r\n" + //
            "with the property or either the assistance of the public authorities is obtained, or the property has been \r\n" + //
            "recovered.\r\n" + //
            "The right of private defence of property against robbery continues as long as the offender causes or \r\n" + //
            "attempts to cause to any person death or hurt or wrongful restraint or as long as the fear of instant death or \r\n" + //
            "of instant hurt or of instant personal restraint continues.\r\n" + //
            "The right of private defence of property against criminal trespass or mischief continues as long as the \r\n" + //
            "offender continues in the commission of criminal trespass or mischief.The right of private defence of property against house-breaking by night continues as long as the \r\n" + //
            "house-trespass which has been begun by such house-breaking continues.";
    String section_106 ="SECTION 106:Right of private defence against deadly assault when there is risk of harm to innocent \r\n" + //
            "person.\u2014If in the exercise of the right of private defence against an assault which reasonably causes the \r\n" + //
            "apprehension of death, the defender be so situated that he cannot effectually exercise that right without \r\n" + //
            "risk of harm to an innocent person, his right of private defence extends to the running of that risk.";
    String section_107 ="SECTION 107:Abetment of a thing.\u2014A person abets the doing of a thing, who\u2014\r\n" + //
            "First.\u2014Instigates any person to do that thing; or\r\n" + //
            "Secondly.\u2014Engages with one or more other person or persons in any conspiracy for the doing of that \r\n" + //
            "thing, if an act or illegal omission takes place in pursuance of that conspiracy, and in order to the doing of \r\n" + //
            "that thing; or\r\n" + //
            "Thirdly.\u2014Intentionally aids, by any act or illegal omission, the doing of that thing.\r\n" + //
            "Explanation 1.\u2014A person who, by wilful misrepresentation, or by wilful concealment of a material \r\n" + //
            "fact which he is bound to disclose, voluntarily causes or procures, or attempts to cause or procure, a thing \r\n" + //
            "to be done, is said to instigate the doing of that thing.\rExplanation 2.\u2014Whoever, either prior to or at the time of the commission of an act, does anything in \r\n" + //
            "order to facilitate the commission of that act, and thereby facilitates the commission thereof, is said to aid \r\n" + //
            "the doing of that act.";
    String section_108 ="SECTION 108: Abettor.\u2014A person abets an offence, who abets either the commission of an offence, or the \r\n" + //
            "commission of an act which would be an offence, if committed by a person capable by law of committing \r\n" + //
            "an offence with the same intention or knowledge as that of the abettor.\r\n" + //
            "Explanation 1.\u2014The abetment of the illegal omission of an act may amount to an offence although \r\n" + //
            "the abettor may not himself be bound to do that act.\r\n" + //
            "Explanation 2.\u2014To constitute the offence of abetment it is not necessary that the act abetted should \r\n" + //
            "be committed, or that the effect requisite to constitute the offence should be caused.Explanation 3.\u2014It is not necessary that the person abetted should be capable by law of committing an \r\n" + //
            "offence, or that he should have the same guilty intention or knowledge as that of the abettor, or any guilty \r\n" + //
            "intention or knowledge Explanation 4.\u2014The abetment of an offence being an offence, the abetment of such an abetment is \r\n" + //
            "also an offence. Explanation 5.\u2014It is not necessary to the commission of the offence of abetment by conspiracy that \r\n" + //
            "the abettor should concert the offence with the person who commits it. It is sufficient if he engages in the\r\n" + //
            "conspiracy in pursuance of which the offence is committed.";
    String section_108A ="SECTION 108A:1\r\n" + //
            "[108A. Abetment in India of offences outside India.\u2014A person abets an offence within the\r\n" + //
            "meaning of this Code who, in 2\r\n" + //
            "[India], abets the commission of any act without and beyond 2\r\n" + //
            "[India] \r\n" + //
            "which would constitute an offence if committed in 2\r\n" + //
            "[India].";
    String section_109 ="SECTION 109: Punishment of abetment if the act abetted is committed in consequence and where no \r\n" + //
            "express provision is made for its punishment.\u2014Whoever abets any offence shall, if the act abetted is \r\n" + //
            "committed in consequence of the abetment, and no express provision is made by this Code for the \r\n" + //
            "punishment of such abetment, be punished with the punishment provided for the offence.\r\n" + //
            "Explanation.\u2014An act or offence is said to be committed in consequence of abetment, when it is \r\n" + //
            "committed in consequence of the instigation, or in pursuance of the conspiracy, or with the aid which \r\n" + //
            "constitutes the abetment.";
    String section_110 ="SECTION 110: Punishment of abetment if person abetted does act with different intention from that of \r\n" + //
            "abettor.\u2014Whoever abets the commission of an offence shall, if the person abetted does the act with a \r\n" + //
            "different intention or knowledge from that of the abettor, be punished with the punishment provided for \r\n" + //
            "the offence which would have been committed if the act had been done with the intention or knowledge \r\n" + //
            "of the abettor and with no other";
    String section_111 ="SECTION 111: Liability of abettor when one act abetted and different act done.\u2014When an Act is abetted \r\n" + //
            "and a different act is done, the abettor is liable for the act done, in the same manner and to the same extent \r\n" + //
            "as if he had directly abetted it:\r\n" + //
            "Provided the act done was a probable consequence of the abetment, and was committed under the \r\n" + //
            "influence of the instigation, or with the aid or in pursuance of the conspiracy which constituted the \r\n" + //
            "abetment.";
    String section_112 ="SECTION 112: Abettor when liable to cumulative punishment for act abetted and for act done.\u2014If the act \r\n" + //
            "for which the abettor is liable under the last preceding section is committed in addition to the act abetted, \r\n" + //
            "and constitute a distinct offence, the abettor is liable to punishment for each of the offences.";
    String section_113 ="SECTION 113:Liability of abettor for an effect caused by the act abetted different from that intended by \r\n" + //
            "the abettor.\u2014When an act is abetted with the intention on the part of the abettor of causing a particular \r\n" + //
            "effect, and an act for which the abettor is liable in consequence of the abetment, causes a different effect \r\n" + //
            "from that intended by the abettor, the abettor is liable for the effect caused, in the same manner and to the \r\n" + //
            "same extent as if he had abetted the act with the intention of causing that effect, provided he knew that the \r\n" + //
            "act abetted was likely to cause that effect.";
    String section_114 ="SECTION 114:Abettor present when offence is committed.\u2014Whenever any person, who is absent would be \r\n" + //
            "liable to be punished as an abettor, is present when the act or offence for which he would be punishable in \r\n" + //
            "consequence of the abetment is committed, he shall be deemed to have committed such act or offence.\r\n" + //
            "";
    String section_115 ="SECTION 115:Abetment of offence punishable with death or imprisonment for life.\u2014if offence not \r\n" + //
            "committed.\u2014Whoever abets the commission of an offence punishable with death or 1\r\n" + //
            "[imprisonment for \r\n" + //
            "life], shall, if that offence be not committed in consequence of the abetment, and no express provision is \r\n" + //
            "made by this Code for the punishment of such abetment, be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to seven years, and shall also be liable to fine;\r\n" + //
            "if act causing harm be done in consequence.\u2014and if any act for which the abettor is liable in \r\n" + //
            "consequence of the abetment, and which causes hurt to any person, is done, the abettor shall be liable to \r\n" + //
            "imprisonment of either description for a term which may extend to fourteen years, and shall also be liable \r\n" + //
            "to fine.";
    String section_116 ="SECTION 116:Abetment of offence punishable with imprisonment\u2014if offence be not committed.\u2014\r\n" + //
            "Whoever abets an offence punishable with imprisonment shall, if that offence be not committed in \r\n" + //
            "consequence of the abetment, and no express provision is made by this Code for the punishment of such \r\n" + //
            "abetment, be punished with imprisonment of any description provided for that offence for a term which \r\n" + //
            "may extend to one-fourth part of the longest term provided for that offence; or with such fine as is \r\n" + //
            "provided for that offence, or with both;\r\n" + //
            "if abettor or person abetted be a public servant whose duty it is to prevent offence.\u2014and if the \r\n" + //
            "abettor or the person abetted is a public servant, whose duty it is to prevent the commission of such \r\n" + //
            "offence, the abettor shall be punished with imprisonment of any description provided for that offence, for \r\n" + //
            "a term which may extend to one-half of the longest term provided for that offence, or with such fine as is \r\n" + //
            "provided for the offence, or with both.";
    String section_117 ="SECTION 117:Abetting commission of offence by the public or by more than ten persons.\u2014Whoever abets \r\n" + //
            "the commission of an offence by the public generally or by any number or class of persons exceeding ten, \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to three years, or \r\n" + //
            "with fine, or with both";
    String section_118 ="SECTION 118:Concealing design to commit offence punishable with death or imprisonment for life.\u2014\r\n" + //
            "Whoever intending to facilitate or knowing it to be likely that he will thereby facilitate the commission of \r\n" + //
            "an offence punishable with death or 1\r\n" + //
            "[imprisonment for life],\r1\r\n" + //
            "[voluntarily conceals by any act or illegal omission, or by the use of encryption or any other \r\n" + //
            "information hiding tool, the existence of a design] to commit such offence or makes any representation \r\n" + //
            "which he knows to be false respecting such design,\r\n" + //
            "if offence be committed; if offence be not committed.\u2014shall, if that offence be committed, be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to seven years, or, if the \r\n" + //
            "offence be not committed, with imprisonment of either description, for a term which may extend to three \r\n" + //
            "years; and in either case shall also be liable to fine.";
    String section_119 ="SECTION 119:Public servant concealing design to commit offence which it is his duty to prevent.\u2014\r\n" + //
            "Whoever, being a public servant intending to facilitate or knowing it to be likely that he will thereby \r\n" + //
            "facilitate the commission of an offence which it is his duty as such public servant to prevent,\r\n" + //
            "1\r\n" + //
            "[voluntarily conceals, by any act or illegal omission or by the use of encryption or any other \r\n" + //
            "information hiding tool, the existence of a design] to commit such offence, or makes any representation \r\n" + //
            "which he knows to be false respecting such design,\r\n" + //
            "if offence be committed.\u2014shall, if the offence be committed, be punished with imprisonment of any \r\n" + //
            "description provided for the offence, for a term which may extend to one-half of the longest term of such \r\n" + //
            "imprisonment, or with such fine as is provided for that offence, or with both;\r\n" + //
            "if offence be punishable with death, etc.\u2014or, if the offence be punishable with death or \r\n" + //
            "2\r\n" + //
            "[imprisonment for life], with imprisonment of either description for a term which may extend to ten \r\n" + //
            "years;\r\n" + //
            "if offence be not committed.\u2014or, if the offence be not committed, shall be punished with \r\n" + //
            "imprisonment of any description provided for the offence for a term which may extend to one-fourth part \r\n" + //
            "of the longest term of such imprisonment or with such fine as is provided for the offence, or with both";
    String section_120 ="SECTION 120:Concealing design to commit offence punishable with imprisonment.\u2014Whoever, intending \r\n" + //
            "to facilitate or knowing it to be likely that he will thereby facilitate the commission of an offence \r\n" + //
            "punishable with imprisonment,\r\n" + //
            "voluntarily conceals, by any act or illegal omission, the existence of a design to commit such offence, or \r\n" + //
            "makes any representation which he knows to be false respecting such design,\r\n" + //
            "if offence be committed; if offence be not committed.\u2014shall, if the offence be committed, be \r\n" + //
            "punished with imprisonment of the description provided for the offence, for a term which may extend to \r\n" + //
            "one-fourth, and, if the offence be not committed, to one-eight, of the longest term of such imprisonment, \r\n" + //
            "or with such fine as is provided for the offence, or with both.\r";
    String section_120A ="SECTION 120A:Definition of criminal conspiracy.\u2014When two or more persons agree to do, or cause to be \r\n" + //
            "done,\u2014\r\n" + //
            "(1) an illegal act, or (2) an act which is not illegal by illegal means, such an agreement is designated a criminal \r\n" + //
            "conspiracy:\r\n" + //
            "Provided that no agreement except an agreement to commit an offence shall amount to a criminal \r\n" + //
            "conspiracy unless some act besides the agreement is done by one or more parties to such agreement in \r\n" + //
            "pursuance thereof.\r\n" + //
            "Explanation.\u2014It is immaterial whether the illegal act is the ultimate object of such agreement, or is \r\n" + //
            "merely incidental to that object.";
    String section_120B ="SECTION 120B:Punishment of criminal conspiracy.\u2014(1) Whoever is a party to a criminal conspiracy to \r\n" + //
            "commit an offence punishable with death, 1\r\n" + //
            "[imprisonment for life] or rigorous imprisonment for a term of \r\n" + //
            "two years or upwards, shall, where no express provision is made in this Code for the punishment of such a \r\n" + //
            "conspiracy, be punished in the same manner as if he had abetted such offence.\r\n" + //
            "(2) Whoever is a party to a criminal conspiracy other than a criminal conspiracy to commit an offence \r\n" + //
            "punishable as aforesaid shall be punished with imprisonment of either description for a term not \r\n" + //
            "exceeding six months, or with fine or with both.]";
    String section_121 ="SECTION 121:Waging, or attempting to wage war, or abetting waging of war, against the Government of \r\n" + //
            "India.\u2014Whoever wages war against the 2\r\n" + //
            "[Government of India], or attempts to wage such war, or abets \r\n" + //
            "the waging of such war, shall be punished with death, or 3\r\n" + //
            "[imprisonment for life] 4\r\n" + //
            "[and shall also be liable \r\n" + //
            "to fine].\r\n" + //
            "5\r\n" + //
            "[Illustration]\r\n" + //
            "6\r\n" + //
            "***A joins an insurrection against the 2\r\n" + //
            "[Government of India]. A has committed the offence defined \r\n" + //
            "in this section.\r\n" + //
            "7\r\n" + //
            "*";
    String section_121A ="SECTION 121A:. Conspiracy to commit offences punishable by section 121.\u2014Whoever within or without \r\n" + //
            "9\r\n" + //
            "[India] conspires to commit any of the offences punishable by section 121, 10*** or conspires to \r\n" + //
            "overawe, by means of criminal force or the show of criminal force, 11[the Central Government or any \r\n" + //
            "12[State] Government 13***], shall be punished with 14[imprisonment for life], or with imprisonment of \r\n" + //
            "either description which may extend to ten years, 15[and shall also be liable to fine].\r\n" + //
            "Explanation.\u2014To constitute a conspiracy under this section, it is not necessary that any act or illegal \r\n" + //
            "omission shall take place in pursuance thereof.]";
    String section_122 ="SECTION 122:Collecting arms, etc., with intention of waging war against the Government of India.\u2014\r\n" + //
            "Whoever collects men, arms or ammunition or otherwise prepares to wage war with the intention of either \r\n" + //
            "waging or being prepared to wage war against the 2\r\n" + //
            "[Government of India], shall be punished with1\r\n" + //
            "[imprisonment for life] or imprisonment of either description for a term not exceeding ten years, 2\r\n" + //
            "[and \r\n" + //
            "shall also be liable to fine].\r ";
    String section_123 ="SECTION 123:Concealing with intent to facilitate design to wage war.\u2014Whoever by any act, or by any \r\n" + //
            "illegal omission, conceals the existence of a design to wage war against the 3\r\n" + //
            "[Government of India], \r\n" + //
            "intending by such concealment to facilitate, or knowing it to be likely that such concealment will \r\n" + //
            "facilitate, the waging of such war, shall be punished with imprisonment of either description for a term \r\n" + //
            "which may extend to ten years, and shall also be liable to fine.\r";
    String section_124 ="SECTION 124:Assaulting President, Governor, etc., with intent to compel or restrain the exercise of any \r\n" + //
            "lawful power.\u2014Whoever, with the intention of inducing or compelling the 4\r\n" + //
            "[President] of India, or \r\n" + //
            "5\r\n" + //
            "[Governor 6\r\n" + //
            "***] of any 7\r\n" + //
            "[State], \r\n" + //
            "8\r\n" + //
            "*** 9\r\n" + //
            "*** 10*** to exercise or refrain from exercising in any manner any \r\n" + //
            "any of the lawful powers of such 11[President or 5\r\n" + //
            "[Governor 6\r\n" + //
            "***]], \r\n" + //
            "assaults or wrongfully restrains, or attempts wrongfully to restrain, or overawes, by means of criminal \r\n" + //
            "force or the show of criminal force, or attempts so to overawe, such 11[President or 5\r\n" + //
            "[Governor 6\r\n" + //
            "***]],\r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to seven \r\n" + //
            "years, and shall also be liable to fine.\r";
    String section_124A ="SECTION 124A:Sedition.\u2014Whoever by words, either spoken or written, or by signs, or by visible \r\n" + //
            "representation, or otherwise, brings or attempts to bring into hatred or contempt, or excites or attempts to \r\n" + //
            "excite disaffection towards, 13*** the Government established by law in 14[India], 15*** shall be punished \r\n" + //
            "with 16[imprisonment for life], to which fine may be added, or with imprisonment which may extend to \r\n" + //
            "three years, to which fine may be added, or with fine.\r\n" + //
            "Explanation 1.\u2014The expression \u201Cdisaffection\u201D includes disloyalty and all feelings of enmity.\r\n" + //
            "Explanation 2.\u2014Comments expressing disapprobation of the measures of the Government with a \r\n" + //
            "view to obtain their alteration by lawful means, without exciting or attempting to excite hatred, contempt \r\n" + //
            "or disaffection, do not constitute an offence under this section.\r\n" + //
            "Explanation 3.\u2014Comments expressing disapprobation of the administrative or other action of the \r\n" + //
            "Government without exciting or attempting to excite hatred, contempt or disaffection, do not constitute an \r\n" + //
            "offence under this section.]\r";
    String section_125 ="SECTION 125: Waging war against any Asiatic Power in alliance with the Government of India.\u2014\r\n" + //
            "Whoever wages war against the Government of any Asiatic Power in alliance or at peace with the \r\n" + //
            "3\r\n" + //
            "[Government of India] or attempts to wage such war, or abets the waging of such war, shall be punished \r\n" + //
            "with 1\r\n" + //
            "[imprisonment for life], to which fine may be added, or with imprisonment of either description for \r\n" + //
            "a term which may extend to seven years, to which fine may be added, or with fine.\r";
    String section_126 ="SECTION 126: Committing depredation on territories of Power at peace with the Government of India.\u2014\r\n" + //
            "Whoever commits depredation, or makes preparations to commit depredation, on the territories of any \r\n" + //
            "Power in alliance or at peace with the 1\r\n" + //
            "[Government of India], shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to seven years, and shall also be liable to fine and to \r\n" + //
            "forfeiture of any property used or intended to be used in committing such depredation, or acquired by \r\n" + //
            "such depredation.\r";
    String section_127 ="SECTION 127:Receiving property taken by war or depredation mentioned in sections 125 and 126.\u2014\r\n" + //
            "Whoever receives any property knowing the same to have been taken in the commission of any of the \r\n" + //
            "offences mentioned in sections 125 and 126, shall be punished with imprisonment of either description \r\n" + //
            "for a term which may extend to seven years, and shall also be liable to fine and to forfeiture of the \r\n" + //
            "property so received.";
    String section_128 ="SECTION 128:Public servant voluntarily allowing prisoner of state or war to escape.\u2014Whoever, being a \r\n" + //
            "public servant and having the custody of any State prisoner or prisoner of war, voluntarily allows such \r\n" + //
            "prisoner to escape from any place in which such prisoner is confined, shall be punished with \r\n" + //
            "2\r\n" + //
            "[imprisonment for life], or imprisonment of either description for a term which may extend to ten years, \r\n" + //
            "and shall also be liable to fine.";
    String section_129 ="SECTION 129:Public servant negligently suffering such prisoner to escape.\u2014Whoever, being a public \r\n" + //
            "servant and having the custody of any State prisoner or prisoner of war, negligently suffers such prisoner \r\n" + //
            "to escape from any place of confinement in which such prisoner is confined, shall be punished with \r\n" + //
            "simple imprisonment for a term which may extend to three years, and shall also be liable to fine.\r";
    String section_130 ="SECTION 130:Aiding escape of, rescuing or harbouring such prisoner.\u2014Whoever knowingly aids or assists \r\n" + //
            "any State prisoner or prisoner of war in escaping from lawful custody, or rescues or attempts to rescue \r\n" + //
            "any such prisoner, or harbours or conceals any such prisoner who has escaped from lawful custody, or \r\n" + //
            "offers or attempts to offer any resistance to the recapture of such prisoner, shall be punished with \r\n" + //
            "2\r\n" + //
            "[imprisonment for life], or with imprisonment of either description for a term which may extend to ten \r\n" + //
            "years, and shall also be liable to fine.\r\n" + //
            "Explanation.\u2014A State prisoner or prisoner of war, who is permitted to be at large on his parole \r\n" + //
            "within certain limits in 3\r\n" + //
            "[India], is said to escape from lawful custody if he goes beyond the limits within \r\n" + //
            "which he is allowed to be at large.\r\n" + //
            "";
    String section_131 ="SECTION 131:Abetting mutiny, or attempting to seduce a soldier, sailor or airman from his duty.\u2014\r\n" + //
            "Whoever abets the committing of mutiny by an officer, soldier, 5\r\n" + //
            "[sailor or airman], in the Army, 6\r\n" + //
            "[Navy \r\n" + //
            "or Air Force] of the 1\r\n" + //
            "[Government of India] or attempts to seduce any such officer, soldier, 5\r\n" + //
            "[sailor or \r\n" + //
            "airman] from his allegiance or his duty, shall be punished with 2\r\n" + //
            "[imprisonment for life], or with \r\n" + //
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \r\n" + //
            "fine.\r\n" + //
            "7\r\n" + //
            "[Explanation.\u2014In this section the words \u201Cofficer\u201D, \r\n" + //
            "8\r\n" + //
            "[\u201Csoldier\u201D, \r\n" + //
            "9\r\n" + //
            "[\u201Csailor\u201D] and \u201Cairman\u201D] include any \r\n" + //
            "any person subject to the 1\r\n" + //
            "[Army Act, 2\r\n" + //
            "[the Army Act, 1950 (46 of 1950)], 3\r\n" + //
            "[the Naval Discipline Act, 4\r\n" + //
            "***the \r\n" + //
            "4\r\n" + //
            "***the 5\r\n" + //
            "Indian Navy (Discipline) Act,1934 (34 of 1934)] 6\r\n" + //
            "[the Air Force Act or 7\r\n" + //
            "[the Air Force Act, \r\n" + //
            "1950 (45 of 1950)]], as the case may be].] ";
    String section_132 ="SECTION 132:Abetment of mutiny, if mutiny is committed in consequence thereof.\u2014Whoever abets the \r\n" + //
            "committing of mutiny by an officer, soldier, 8\r\n" + //
            "[sailor or airman], in the Army, 9\r\n" + //
            "[Navy or Air Force] of the \r\n" + //
            "10[Government of India], shall, if mutiny be committed in consequence of that abetment, be punished with \r\n" + //
            "death or with 11[imprisonment for life], or imprisonment of either description for a term which may \r\n" + //
            "extend to ten years, and shall also be liable to fine.";
    String section_133 ="SECTION 133:Abetment of assault by soldier, sailor or airman on his superior officer, when in execution \r\n" + //
            "of his office.\u2014Whoever abets an assault by an officer, soldier, 8\r\n" + //
            "[sailor or airman], in the Army, 9\r\n" + //
            "[Navy or \r\n" + //
            "Air Force] of the 10[Government of India], on any superior officer being in the execution of his office, \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to three years, and \r\n" + //
            "shall also be liable to fine.";
    String section_134 ="SECTION 134:Abetment of such assault, if the assault committed.\u2014Whoever abets an assault by an officer, \r\n" + //
            "soldier, 8\r\n" + //
            "[sailor or airman], in the Army, 9\r\n" + //
            "[Navy or Air Force] of the 10[Government of India], on any \r\n" + //
            "superior officer being in the execution of his office, shall, if such assault be committed in consequence of \r\n" + //
            "that abetment be punished with imprisonment of either description for a term which may extend to seven \r\n" + //
            "years, and shall also be liable to fine.\r";
    String section_135 ="SECTION 135: Abetment of desertion of soldier, sailor or airman.\u2014Whoever, abets the desertion of any \r\n" + //
            "officer, soldier, 8\r\n" + //
            "[sailor or airman], in the Army, 9\r\n" + //
            "[Navy or Air Force] of the 10[Government of India], \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to two years, or \r\n" + //
            "with fine, or with both.";
    String section_136 ="SECTION 136:Harbouring deserter.\u2014Whoever, except as hereinafter excepted, knowing or having reason to \r\n" + //
            "believe that an officer, soldier, 8\r\n" + //
            "[sailor or airman], in the Army, 9\r\n" + //
            "[Navy or Air Force] of the \r\n" + //
            "10[Government of India], has deserted, harbours such officer, soldier, 8\r\n" + //
            "[sailor or airman], shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to two years, or with fine \r\n" + //
            "or with both.\r\n" + //
            "Exception.\u2014This provision does not extend to the case in which the harbour is given by a wife to her \r\n" + //
            "husband.";
    String section_137 ="SECTION 137:Deserter concealed on board merchant vessel through negligence of master.\u2014The master or \r\n" + //
            "person in charge of a merchant vessel, on board of which any deserter from the Army, 9\r\n" + //
            "[Navy or Air \r\n" + //
            "Force] of the 10[Government of India] is concealed, shall, though ignorant of such concealment, be liable \r\n" + //
            "to a penalty not exceeding five hundred rupees, if he might have known of such concealment but for some \r\n" + //
            "neglect of his duty as such master or person in charge, or but for some want of discipline on board of the \r\n" + //
            "vessel.";
    String section_138 ="SECTION 138:Abetment of act of insubordination by soldier, sailor or airman.\u2014Whoever abets what he \r\n" + //
            "knows to be an act of insubordination by an officer, soldier, 8\r\n" + //
            "[sailor or airman], in the Army, 9\r\n" + //
            "[Navy or air \r\n" + //
            "Force], of the 10[Government of India], shall, if such act of insubordination be committed in consequence \r\n" + //
            "of that abetment, be punished with imprisonment of either description for a term which may extend to six \r\n" + //
            "months, or with fine, or with both.";
    String section_138A ="SECTION 138A:[Application of foregoing sections to the Indian Marine Service.] Rep. by the Amending Act, \r\n" + //
            "1934 (35 of 1934), s. 2 and Sch.";
    String section_139 ="SECTION 139:Persons subject to certain Acts.\u2014No person subject to 2\r\n" + //
            "[the Army Act, 3\r\n" + //
            "[the Army Act, 1950 \r\n" + //
            "(46 of 1950)], the Naval Discipline Act, 4\r\n" + //
            "[\r\n" + //
            "5\r\n" + //
            "*** 6\r\n" + //
            "[the Indian Navy (Discipline) Act, 1934 (34 of 1934)], \r\n" + //
            "7\r\n" + //
            "[the Air Force Act or 8\r\n" + //
            "[the Air Force Act, 1950 (45 of 1950)]]], is subject to punishment under this Code \r\n" + //
            "Code for any of the offences defined in this Chapter.";
    String section_140 ="SECTION 140:Wearing garb or carrying token used by soldier, sailor or airman.\u2014Whoever, not being a \r\n" + //
            "soldier, 9\r\n" + //
            "[sailor or airman] in the Military, 10[Naval or Air] service of the 11[Government of India], wears \r\n" + //
            "any garb or carries any token resembling any garb or token used by such a soldier, 9\r\n" + //
            "[sailor or airman] with \r\n" + //
            "the intention that it may be believed that he is such a soldier, 9\r\n" + //
            "[sailor or airman], shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to three months, or with fine which may \r\n" + //
            "extend to five hundred rupees, or with both.";
    String section_141 ="SECTION 141:Unlawful assembly.\u2014An assembly of five or more persons is designated an \u201Cunlawful \r\n" + //
            "assembly\u201D, if the common object of the persons composing that assembly is\u2014\r\n" + //
            "First.\u2014To overawe by criminal force, or show of criminal force, 12[the Central or any State \r\n" + //
            "Government or Parliament or the Legislature of any State], or any public servant in the exercise of the \r\n" + //
            "lawful power of such public servant; or\r\n" + //
            "Second.\u2014To resist the execution of any law, or of any legal process; or\r\n" + //
            "Third.\u2014To commit any mischief or criminal trespass, or other offence; or\r\n" + //
            "Fourth.\u2014By means of criminal force, or show of criminal force, to any person, to take or obtain \r\n" + //
            "possession of any property, or to deprive any person of the enjoyment of a right of way, or of the use of \r\n" + //
            "water or other incorporeal right of which he is in possession or enjoyment, or to enforce any right or \r\n" + //
            "supposed right; or\r\n" + //
            "Fifth.\u2014By means of criminal force, or show of criminal force, to compel any person to do what he is \r\n" + //
            "not legally bound to do, or to omit to do what he is legally entitled to do.\r\n" + //
            "Explanation.\u2014An assembly which was not unlawful when it assembled, may subsequently become \r\n" + //
            "an unlawful assembly.";
    String section_142 ="SECTION 142:Being member of unlawful assembly.\u2014Whoever, being aware of facts which render any \r\n" + //
            "assembly an unlawful assembly, intentionally joins that assembly, or continues in it, is said to be a \r\n" + //
            "member of an unlawful assembly";
    String section_143 ="SECTION 143:Punishment.\u2014Whoever is a member of an unlawful assembly, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to six months, or with fine, or with both.\r";

    String section_144 ="SECTION 144:Joining unlawful assembly armed with deadly weapon.\u2014Whoever, being armed with any \r\n" + //
            "deadly weapon, or with anything which, used as a weapon of offence, is likely to cause death, is a \r\n" + //
            "member of an unlawful assembly, shall be punished with imprisonment of either description for a term \r\n" + //
            "which may extend to two years, or with fine, or with both.";
    String section_145 ="SECTION 145:Joining or continuing in unlawful assembly, knowing it has been commanded to \r\n" + //
            "disperse.\u2014Whoever joins or continues in an unlawful assembly, knowing that such unlawful assembly \r\n" + //
            "has been commanded in the manner prescribed by law to disperse, shall be punished with imprisonment \r\n" + //
            "of either description for a term which may extent to two years, or with fine, or with both";
    String section_146 ="SECTION 146:Rioting.\u2014Whenever force or violence is used by an unlawful assembly, or by any member \r\n" + //
            "thereof, in prosecution of the common object of such assembly, every member of such assembly is guilty \r\n" + //
            "of the offence of rioting.\r";
    String section_147 ="SECTION 147:Punishment for rioting.\u2014Whoever is guilty of rioting, shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to two years, or with fine, or with both.\r";
    String section_148 ="SECTION 148:Rioting, armed with deadly weapon.\u2014Whoever is guilty of rioting, being armed with a deadly \r\n" + //
            "weapon or with anything which, used as a weapon of offence, is likely to cause death, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to three years, or with fine, or with \r\n" + //
            "both";
    String section_149 ="SECTION 149:Every member of unlawful assembly guilty of offence committed in prosecution of common \r\n" + //
            "object.\u2014If an offence is committed by any member of an unlawful assembly in prosecution of the \r\n" + //
            "common object of that assembly, or such as the members of that assembly knew to be likely to be \r\n" + //
            "committed in prosecution of that object, every person who, at the time of the committing of that offence, \r\n" + //
            "is a member of the same assembly, is guilty of that offence.\r";
    String section_150 ="SECTION 150:Hiring, or conniving at hiring, of persons to join unlawful assembly.\u2014Whoever hires or \r\n" + //
            "engages, or employs, or promotes, or connives at the hiring, engagement or employment of any person to \r\n" + //
            "join or become a member of any unlawful assembly, shall be punishable as a member of such unlawful \r\n" + //
            "assembly, and for any offence which may be committed by any such person as a member of such \r\n" + //
            "unlawful assembly in pursuance of such hiring, engagement or employment, in the same manner as if he \r\n" + //
            "had been a member of such unlawful assembly, or himself had committed such offence.\r";
    String section_151 ="SECTION 151:Knowingly joining or continuing in assembly of five or more persons after it has been \r\n" + //
            "commanded to disperse.\u2014Whoever knowingly joins or continues in any assembly of five or more \r\n" + //
            "persons likely to cause a disturbance of the public peace, after such assembly has been lawfully \r\n" + //
            "commanded to disperse, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to six months, or with fine, or with both.\r\n" + //
            "Explanation.\u2014If the assembly is an unlawful assembly within the meaning of section 141, the \r\n" + //
            "offender will be punishable under section 145.";
    String section_152 ="SECTION 152:Assaulting or obstructing public servant when suppressing riot, etc.\u2014Whoever assaults or \r\n" + //
            "threatens to assault, or obstructs or attempts to obstruct, any public servant in the discharge of his duty as \r\n" + //
            "such public servant, in endeavouring to disperse an unlawful assembly, or to suppress a riot or affray, or \r\n" + //
            "uses, or threatens, or attempts to use criminal force to such public servant, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to three years, or with fine, or with both.";
    String section_153 ="SECTION 153:Wantonly giving provocation with intent to cause riot\u2014if rioting be committed; if not \r\n" + //
            "committed.\u2014Whoever malignantly, or wantonly by doing anything which is illegal, gives provocation to \r\n" + //
            "any person intending or knowing it to be likely that such provocation will cause the offence of rioting to \r\n" + //
            "be committed, shall, if the offence of rioting be committed in consequence of such provocation, be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to one year, or with fine, \r\n" + //
            "or with both; and if the offence of rioting be not committed, with imprisonment of either description for a \r\n" + //
            "term which may extend to six months, or with fine, or with both.";
    String section_153A ="SECTION 153A:Promoting enmity between different groups on ground of religion, race, place of birth, \r\n" + //
            "residence, language, etc., and doing acts prejudicial to maintenance of harmony.\u2014(1) Whoever\u2014\r\n" + //
            "(a) by words, either spoken or written, or by signs or by visible representations or otherwise, \r\n" + //
            "promotes or attempts to promote, on grounds of religion, race, place of birth, residence, language, \r\n" + //
            "caste or community or any other ground whatsoever, disharmony or feelings of enmity, hatred or ill\u0002will between different religious, racials, language or regional groups or castes or communities, or (b) commits any act which is prejudicial to the maintenance of harmony between different \r\n" + //
            "religious, racial, language or regional groups or castes or communities, and which disturbs or is likely \r\n" + //
            "to disturb the public tranquillity, 1\r\n" + //
            "[or]\r\n" + //
            "1\r\n" + //
            "[(c) organizes any exercise, movement, drill or other similar activity intending that the \r\n" + //
            "participants in such activity shall use or be trained to use criminal force or violence or knowing it to \r\n" + //
            "be likely that the participants in such activity will use or be trained to use criminal force or violence, \r\n" + //
            "or participates in such activity intending to use or be trained to use criminal force or violence or \r\n" + //
            "knowing it to be likely that the participants in such activity will use or be trained to use criminal force \r\n" + //
            "or violence, against any religious, racial, language or regional group or caste or community and such \r\n" + //
            "activity for any reason whatsoever causes or is likely to cause fear or alarm or a feeling of insecurity \r\n" + //
            "amongst members of such religious, racial, language or regional group or caste or community,]\r\n" + //
            "shall be punished with imprisonment which may extend to three years, or with fine, or with both.\r\n" + //
            "(2) Offence committed in place of worship, etc.\u2014Whoever commits an offence specified in \r\n" + //
            "sub-section (1) in any place of worship or in any assembly engaged in the performance of religious \r\n" + //
            "worship or religious ceremonies, shall be punished with imprisonment which may extend to five years \r\n" + //
            "and shall also be liable to fine.]";
    String section_153AA ="SECTION 153AA:Punishment for knowingly carrying arms in any procession or organising, or holding \r\n" + //
            "or taking part in any mass drill or mass training with arms.\u2014Whoever knowingly carries arms in any \r\n" + //
            "procession or organizes or holds or takes part in any mass drill or mass training with arms in any public \r\n" + //
            "place in contravention of any public notice or order issued or made under section 144A of the Code of \r\n" + //
            "Criminal Procedure, 1973 (2 of 1974) shall be punished with imprisonment for a term which may extend \r\n" + //
            "to six months and with fine which may extend to two thousand rupees.\r\n" + //
            "Explanation.\u2014\u201CArms\u201D means articles of any description designed or adapted as weapons for offence \r\n" + //
            "or defence and includes firearms, sharp edged weapons, lathis, dandas and sticks].\r";
    String section_153B ="SECTION 153B:Imputations, assertions prejudicial to national integration.\u2014(1) Whoever, by words \r\n" + //
            "either spoken or written or by signs or by visible representations or otherwise,\u2014\r\n" + //
            "(a) makes or publishes any imputation that any class of persons cannot, by reason of their being \r\n" + //
            "members of any religious, racial, language or regional group or caste or community, bear true faith \r\n" + //
            "and allegiance to the Constitution of India as by law established or uphold the sovereignty and \r\n" + //
            "integrity of India, or\r\n" + //
            "(b) asserts, counsels, advises, propagates or publishes that any class of persons shall, by reason of \r\n" + //
            "their being members of any religious, racial, language or regional group or caste or community, be \r\n" + //
            "denied, or deprived of their rights as citizens of India, or\r\n" + //
            "(c) makes or publishes and assertion, counsel, plea or appeal concerning the obligation of any \r\n" + //
            "class of persons, by reason of their being members of any religious, racial, language or regional group \r\n" + //
            "or caste or community, and such assertion, counsel, plea or appeal causes or is likely to cause \r\n" + //
            "disharmony or feelings of enmity or hatred or ill-will between such members and other persons,\r\n" + //
            "shall be punished with imprisonment which may extend to three years, or with fine, or with both.\r\n" + //
            "(2) Whoever commits an offence specified in sub-section (1) in any place of worship or in any \r\n" + //
            "assembly engaged in the performance of religious worship or religious ceremonies, shall be punished with \r\n" + //
            "imprisonment which may extend to five years and shall also be liable to fine.]\r";
    String section_154 ="SECTION 154:Owner or occupier of land on which an unlawful assembly is held.\u2014Whenever any unlawful \r\n" + //
            "assembly or riot takes place, the owner or occupier of the land upon which such unlawful assembly is \r\n" + //
            "held, or such riot is committed, and any person having or claiming an interest in such land, shall be \r\n" + //
            "punishable with fine not exceeding one thousand rupees, if he or his agent or manager, knowing that such \r\n" + //
            "offence is being or has been committed, or having reason to believe it is likely to be committed, do not \r\n" + //
            "give the earliest notice thereof in his or their power to the principal officer at the nearest police-station,\r and do not, in the case of his or their having reason to believe that it was about to be committed, use all \r\n" + //
            "lawful means in his or their power to prevent it and, in the event of its taking place, do not use all lawful \r\n" + //
            "means in his or their power to disperse or suppress the riot or unlawful assembly.";
    String section_155 ="SECTION 155:Liability of person for whose benefit riot is committed.\u2014Whenever a riot is committed for \r\n" + //
            "the benefit or on behalf of any person who is the owner or occupier of any land respecting which such riot \r\n" + //
            "takes place or who claims any interest in such land, or in the subject of any dispute which gave rise to the \r\n" + //
            "riot, or who has accepted or derived any benefit therefrom, such person shall be punishable with fine, if \r\n" + //
            "he or his agent or manager, having reason to believe that such riot was likely to be committed or that the \r\n" + //
            "unlawful assembly by which such riot was committed was likely to be held, shall not respectively use all \r\n" + //
            "lawful means in his or their power to prevent such assembly or riot from taking place, and for suppressing \r\n" + //
            "and dispersing the same.";
    String section_156 ="SECTION 156: Liability of agent of owner or occupier for whose benefit riot is committed.\u2014Whenever a \r\n" + //
            "riot is committed for the benefit or on behalf of any person who is the owner or occupier of any land \r\n" + //
            "respecting which such riot takes place, or who claims any interest in such land, or in the subject of any \r\n" + //
            "dispute which gave rise to the riot, or who has accepted or derived any benefit therefrom,\r\n" + //
            "the agent or manager of such person shall be punishable with fine, if such agent or manager, having \r\n" + //
            "reason to believe that such riot was likely to be committed, or that the unlawful assembly by which such \r\n" + //
            "riot was committed was likely to be held, shall not use all lawful means in his power to prevent such riot \r\n" + //
            "or assembly from taking place and for suppressing and dispersing the same.";
    String section_157 ="SECTION 157:Harbouring persons hired for an unlawful assembly.\u2014Whoever harbours, receives or \r\n" + //
            "assembles, in any house or premises in his occupation or charge, or under his control any persons \r\n" + //
            "knowing that such persons have been hired, engaged or employed, or are about to be hired, engaged or \r\n" + //
            "employed, to join or become members of an unlawful assembly, shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to six months, or with fine, or with both.";
    String section_158 ="SECTION 158:Being hired to take part in an unlawful assembly or riot.\u2014Whoever is engaged, or hired, or \r\n" + //
            "offers or attempts to be hired or engaged, to do or assist in doing any of the acts specified in section 141, \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to six months, or \r\n" + //
            "with fine, or with both,\r\n" + //
            "or to go armed.\u2014and whoever, being so engaged or hired as aforesaid, goes armed, or engages or \r\n" + //
            "offers to go armed, with any deadly weapon or with anything which used as a weapon of offence is likely \r\n" + //
            "to cause death, shall be punished with imprisonment of either description for a term which may extend to \r\n" + //
            "two years, or with fine, or with both.";
    String section_159 ="SECTION 159: Affray.\u2014When two or more persons, by fighting in a public place, disturb the public peace, they \r\n" + //
            "are said to \u201Ccommit an affray\u201D.";
    String section_160 ="SECTION 160: Punishment for committing affray.\u2014Whoever commits an affray, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to one month, or with fine which may \r\n" + //
            "extend to one hundred rupees, or with both.";
    String section_161 ="SECTION 161:Rep. by the Prevention of Corruption Act, 1988 (49 of 1988), s. 31.\r";
    String section_162 ="SECTION 162:Rep. by the Prevention of Corruption Act, 1988 (49 of 1988), s. 31.\r";
    String section_163 ="SECTION 163:Rep. by the Prevention of Corruption Act, 1988 (49 of 1988), s. 31.\r";
    String section_164 ="SECTION 164:Rep. by the Prevention of Corruption Act, 1988 (49 of 1988), s. 31.\r";
    String section_165 ="SECTION 165:Rep. by the Prevention of Corruption Act, 1988 (49 of 1988), s. 31.\r";
    String section_165A ="SECTION 165A:Rep. by the Prevention of Corruption Act, 1988 (49 of 1988), s. 31.\r";
    String section_166 ="SECTION 166:Public servant disobeying law, with intent to cause injury to any person.\u2014Whoever, being a \r\n" + //
            "public servant, knowingly disobeys any direction of the law as to the way in which he is to conduct \r\n" + //
            "himself as such public servant, intending to cause, or knowing it to be likely that he will by such \r\n" + //
            "disobedience, cause injury to any person, shall be punished with simple imprisonment for a term which \r\n" + //
            "may extend to one year, or with fine, or with both.";
    String section_166A ="SECTION 166A:Public servant disobeying direction under law.\u2014Whoever, being a public servant,\u2014\r\n" + //
            "(a) knowingly disobeys any direction of the law which prohibits him from requiring the \r\n" + //
            "attendance at any place of any person for the purpose of investigation into an offence or any other \r\n" + //
            "matter, or\r\n" + //
            "(b) knowingly disobeys, to the prejudice of any person, any other direction of the law regulating \r\n" + //
            "the manner in which he shall conduct such investigation, or\r\n" + //
            "(c) fails to record any information given to him under sub-section (1) of section 154 of the Code \r\n" + //
            "of Criminal Procedure, 1973 (2 of 1974), in relation to cognizable offence punishable under section \r\n" + //
            "326A, section 326B, section 354, section 354B, section 370, section 370A, section 376, section 376A, \r\n" + //
            "section 376B, section 376C, section 376D, section 376E or section 509,\r\n" + //
            "shall be punished with rigorous imprisonment for a term which shall not be less than six months but \r\n" + //
            "which may extend to two years, and shall also be liable to fine.";
    String section_166B ="SECTION 166B: Punishment for non-treatment of victim.\u2014Whoever, being in charge of a hospital, public or \r\n" + //
            "private, whether run by the Central Government, the State Government, local bodies or any other person, \r\n" + //
            "contravenes the provisions of section 357C of the Code of Criminal Procedure, 1973 (2 of 1974), shall be \r\n" + //
            "punished with imprisonment for a term which may extend to one year or with fine or with both.]";
    String section_167 ="SECTION 167:Public servant framing an incorrect document with intent to cause injury.\u2014Whoever, being \r\n" + //
            "a public servant, and being, as 2\r\n" + //
            "[such public servant, charged with the preparation or translation of any \r\n" + //
            "document or electronic record, frames, prepares or translates that document or electronic record] in a \r\n" + //
            "manner which he knows or believes to be incorrect, intending thereby to cause or knowing it to be likely \r\n" + //
            "that he may thereby cause injury to any person, shall be punished with imprisonment of either description \r\n" + //
            "for a term which may extend to three years, or with fine, or with both.\r";
    String section_168 ="SECTION 168:Public servant unlawfully engaging in trade.\u2014Whoever, being a public servant, and being \r\n" + //
            "legally bound as such public servant not to engage in trade, engages in trade, shall be punished with \r\n" + //
            "simple imprisonment for a term which may extend to one year, or with fine, or with both.";
    String section_169 ="SECTION 169:Public servant unlawfully buying or bidding for property.\u2014Whoever, being a public servant, \r\n" + //
            "and being legally bound as such public servant, not to purchase or bid for certain property, purchases or \r\n" + //
            "bids for that property, either in his own name or in the name of another, or jointly, or in shares with \r\n" + //
            "others, shall be punished with simple imprisonment for a term which may extend to two years, or with \r\n" + //
            "fine, or with both; and the property, if purchased, shall be confiscated.";
    String section_170 ="SECTION 170:Personating a public servant.\u2014Whoever pretends to hold any particular office as a public \r\n" + //
            "servant, knowing that he does not hold such office or falsely personates any other person holding such \r\n" + //
            "office, and in such assumed character does or attempts to do any act under colour of such office, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to two years, or with fine, \r\n" + //
            "or with both.";
    String section_171 ="SECTION 171:Wearing garb or carrying token used by public servant with fraudulent intent.\u2014Whoever, \r\n" + //
            "not belonging to a certain class of public servants, wears any garb or carries any token resembling any \r\n" + //
            "garb or token used by that class of public servants, with the intention that it may be believed, or with the \r\n" + //
            "knowledge that it is likely to be believed, that he belongs to that class of public servants, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to three months, or with \r\n" + //
            "fine which may extend to two hundred rupees, or with both.";
    String section_171A ="SECTION 171A:\u201CCandidate\u201D, \u201CElectoral right\u201D defined.\u2014For the purposes of this Chapter\u2014\r\n" + //
            "4\r\n" + //
            "[(a) \u201Ccandidate\u201D means a person who has been nominated as a candidate at any election;] (b) \u201Celectoral right\u201D means the right of a person to stand, or not to stand as, or to withdraw from \r\n" + //
            "being, a candidate or to vote or refrain from voting at an election.\r";
    String section_171B ="SECTION 171B:Bribery.\u2014(1) Whoever\u2014\r\n" + //
            "(i) gives a gratification to any person with the object of inducing him or any other person to \r\n" + //
            "exercise any electoral right or of rewarding any person for having exercised any such right; or\r\n" + //
            "(ii) accepts either for himself or for any other person any gratification as a reward for exercising \r\n" + //
            "any such right or for inducing or attempting to induce any other person to exercise any such right,\r\n" + //
            "commits the offence of bribery:\r\n" + //
            "Provided that a declaration of public policy or a promise of public action shall not be an offence\r\n" + //
            "under this section.\r\n" + //
            "(2) A person who offers, or agrees to give, or offers or attempts to procure, a gratification shall be \r\n" + //
            "deemed to give a gratification.\r\n" + //
            "(3) A person who obtains or agrees to accept or attempts to obtain a gratification shall be deemed to \r\n" + //
            "accept a gratification, and a person who accepts a gratification as a motive for doing what he does not \r\n" + //
            "intend to do, or as a reward for doing what he has not done, shall be deemed to have accepted the \r\n" + //
            "gratification as a reward.";
    String section_171C ="SECTION 171C:Undue influence at elections.\u2014(1) Whoever voluntarily interferes or attempts to interfere \r\n" + //
            "with the free exercise of any electoral right commits the offence of undue influence at an election.\r\n" + //
            "(2) Without prejudice to the generality of the provisions of sub-section (1), whoever\u2014\r\n" + //
            "(a) threatens any candidate or voter, or any person in whom a candidate or voter is interested, \r\n" + //
            "with injury of any kind, or\r\n" + //
            "(b) induces or attempts to induce a candidate or voter to believe that he or any person in whom he \r\n" + //
            "is interested will become or will be rendered an object of Divine displeasure or of spiritual censure,\r\n" + //
            "shall be deemed to interfere with the free exercise of the electoral right of such candidate or voter, within \r\n" + //
            "the meaning of sub-section (1). \r\n" + //
            "(3) A declaration of public policy or a promise of public action or the mere exercise or a legal right \r\n" + //
            "without intent to interfere with an electoral right, shall not be deemed to be interference within the \r\n" + //
            "meaning of this section.";
    String section_171D ="SECTION 171D:Personation at elections.\u2014Whoever at an election applies for a voting paper on votes in the \r\n" + //
            "name of any other person, whether living or dead, or in a fictitious name, or who having voted once at \r\n" + //
            "such election applies at the same election for a voting paper in his own name, and whoever abets, \r\n" + //
            "procures or attempts to procure the voting by any person in any such way, commits the offence of \r\n" + //
            "personation at an election.\r\n" + //
            "1\r\n" + //
            "[Provided that nothing in this section shall apply to a person who has been authorised to vote as \r\n" + //
            "proxy for an elector under any law for the time being in force in so far as he votes as a proxy for such \r\n" + //
            "elector.]\r";
    String section_171E ="SECTION 171E:Punishment for bribery.\u2014Whoever commits the offence of bribery shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to one year, or with fine, or with both:\r\n" + //
            "Provided that bribery by treating shall be punished with fine only.\r\n" + //
            "Explanation.\u2014\u201CTreating\u201D means that form of bribery where the gratification consists in food, drink, \r\n" + //
            "entertainment, or provision.";
    String section_171F ="SECTION 171F:Punishment for undue influence or personation at an election.\u2014Whoever commits the \r\n" + //
            "offence of undue influence or personation at an election shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to one year or with fine, or with both.\r";
    String section_171G ="SECTION 171GFalse statement in connection with an election.\u2014Whoever with intent to affect the result of \r\n" + //
            "an election makes or publishes any statement purporting to be a statement of fact which is false and which \r\n" + //
            "he either knows or believes to be false or does not believe to be true, in relation to the personal character \r\n" + //
            "or conduct of any candidate shall be punished with fine.\r";
    String section_171H ="SECTION 171H:Illegal payments in connection with an election.\u2014Whoever without the general or special \r\n" + //
            "authority in writing of a candidate incurs or authorises expenses on account of the holding of any public \r\n" + //
            "meeting, or upon any advertisement, circular or publication, or in any other way whatsoever for the \r\n" + //
            "purpose of promoting or procuring the election of such candidate, shall be punished with fine which may \r\n" + //
            "extend to five hundred rupees:\r\n" + //
            "Provided that if any person having incurred any such expenses not exceeding the amount of ten \r\n" + //
            "rupees without authority obtains within ten days from the date on which such expenses were incurred the \r\n" + //
            "approval in writing of the candidate, he shall be deemed to have incurred such expenses with the authority \r\n" + //
            "of the candidate";
    String section_171I ="SECTION 171I:Failure to keep election accounts.\u2014Whoever being required by any law for the time being in \r\n" + //
            "force or any rule having the force of law to keep accounts of expenses incurred at or in connection with an \r\n" + //
            "election fails to keep such accounts shall be punished with fine which may extend to five hundred rupees.]\r";
    String section_172 = "Absconding to avoid service of summons or other proceeding.—Whoever absconds in order \n" +
            "to avoid being served with a summons, notice or order proceeding from any public servant legally \n" +
            "competent, as such public servant, to issue such summons, notice or order, shall be punished with simple \n" +
            "imprisonment for a term which may extend to one month, or with fine which may extend to five hundred \n" +
            "rupees, or with both" +
            "or, if the summons or notice or order is to attend in person or by agent, or to 1\n" +
            "[produce a document or \n" +
            "an electronic record in a Court of Justice], with simple imprisonment for a term which may extend to six \n" +
            "months, or with fine which may extend to one thousand rupees, or with both.";
    String section_173 = "SECTION 173 : Preventing service of summons or other proceeding, or preventing publication thereof.—\n" +
            "Whoever in any manner intentionally prevents the serving on himself, or on any other person, of any \n" +
            "summons, notice or order proceeding from any public servant legally competent, as such public servant, \n" +
            "to issue such summons, notice or order,\n" +
            "or intentionally prevents the lawful affixing to any place of any such summons, notice or order,\n" +
            "or intentionally removes any such summons, notice or order from any place to which it is lawfully \n" +
            "affixed,\n" +
            "or intentionally prevents the lawful making of any proclamation, under the authority of any public \n" +
            "servant legally competent, as such public servant, to direct such proclamation to be made,\n" +
            "shall be punished with simple imprisonment for a term which may extend to one month, or with fine \n" +
            "which may extend to five hundred rupees, or with both;\n" +
            "or, if the summons, notice, order or proclamation is to attend in person or by agent, or 2\n" +
            "[to produce a \n" +
            "document or electronic record in a Court of Justice] with simple imprisonment for a term which may \n" +
            "extend to six months, or with fine which may extend to one thousand rupees, or with both.";
    String section_174 = "SECTION_174 : Non-attendance in obedience to an order from public servant.—Whoever, being legally \n" +
            "bound to attend in person or by an agent at a certain place and time in obedience to a summons, notice, \n" +
            "order, or proclamation proceeding from any public servant legally competent, as such public servant, to \n" +
            "issue the same,\n" +
            "intentionally omits to attend at that place or time, or departs from the place where he is bound to \n" +
            "attend before the time at which it is lawful for him to depart,shall be punished with simple imprisonment for a term which may extend to one month, or with fine \n" +
            "which may extend to five hundred rupees, or with both;\n" +
            "or, if the summons, notice, order or proclamation is to attend in person or by agent in a Court of \n" +
            "Justice, with simple imprisonment for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both.";
    String section_174A = "SECTION_174A : Non-appearance in response to a proclamation under section 82 of Act 2 of 1974.—\n" +
            "Whoever fails to appear at the specified place and the specified time as required by a proclamation \n" +
            "published under sub-section (1) of section 82 of the Code of Criminal Procedure, 1973 shall be punished \n" +
            "with imprisonment for a term which may extend to three years or with fine or with both, and where a \n" +
            "declaration has been made under sub-section (4) of that section pronouncing him as a proclaimed \n" +
            "offender, he shall be punished with imprisonment for a term which may extend to seven years and shall \n" +
            "also be liable to fine.";
    String section_175 = "SECTION_175 : Omission to produce document to public servant by person legally bound to produce it.—\n" +
            "Whoever, being legally bound to produce or deliver up any 4\n" +
            "[document or electronic record] to any public \n" +
            "servant, as such, intentionally omits so to produce or deliver up the same, shall be punished with simple \n" +
            "imprisonment for a term which may extend to one month, or with fine which may extend to five hundred \n" +
            "rupees, or with both;\n" +
            "or, if the 4\n" +
            "[document or electronic record] is to be produced or delivered up to a Court of Justice, with \n" +
            "simple imprisonment for a term which may extend to six months, or with fine which may extend to one\n" +
            "thousand rupees, or with both.\n";
    String section_176 = "SECTION_176 : Omission to give notice or information to public servant by person legally bound to give \n" +
            "it.—Whoever, being legally bound to give any notice or to furnish information on any subject to any \n" +
            "public servant, as such, intentionally omits to give such notice or to furnish such information in the \n" +
            "manner and at the time required by law, shall be punished with simple imprisonment for a term which \n" +
            "may extend to one month, or with fine which may extend to five hundred rupees, or with both;\n" +
            "or, if the notice or information required to be given respects the commission of an offence, or is \n" +
            "required for the purpose of preventing the commission of an offence, or in order to the apprehension of an \n" +
            "offender, with simple imprisonment for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both;\n" +
            "6\n" +
            "[or, if the notice or information required to be given is required by an order passed under \n" +
            "sub-section (1) of section 565 of the Code of Criminal Procedure, 1898 (5 of 1898), with imprisonment of \n" +
            "either description for a term which may extend to six months, or with fine which may extend to one \n" +
            "thousand rupees, or with both.]\n";
    String section_177 = "SECTION_176 : Furnishing false information.—Whoever, being legally bound to furnish information on any \n" +
            "subject to any public servant, as such, furnishes, as true, information on the subject which he knows or \n" +
            "has reason to believe to be false shall be punished with simple imprisonment for a term which may extend \n" +
            "to six months, or with fine which may extend to one thousand rupees, or with both;or, if the information which he is legally bound to give respects the commission of an offence, or is \n" +
            "required for the purpose of preventing the commission of an offence, or in order to the apprehension of an \n" +
            "offender, with imprisonment of either description for a term which may extend to two years, or with fine, \n" +
            "or with both";
    String section_178 = "SECTION_178 : Refusing oath or affirmation when duly required by public servant to make it.—Whoever \n" +
            "refuses to bind himself by an oath 4\n" +
            "[or affirmation] to state the truth, when required so to bind himself by \n" +
            "a public servant legally competent to require that he shall so bind himself, shall be punished with simple \n" +
            "imprisonment for a term which may extend to six months, or with fine which may extend to one thousand \n" +
            "rupees, or with both.\n";
    String section_179 = "SECTION_179 : Refusing to answer public servant authorised to question.—Whoever, being legally bound to \n" +
            "state the truth on any subject to any public servant, refuses to answer any question demanded of him \n" +
            "touching that subject by such public servant in the exercise of the legal powers of such public servant, \n" +
            "shall be punished with simple imprisonment for a term which may extend to six months, or with fine \n" +
            "which may extend to one thousand rupees, or with both.";
    String section_180 = "SECTION_180 : Refusing to sign statement.—Whoever refuses to sign any statement made by him, when \n" +
            "required to sign that statement by a public servant legally competent to require that he shall sign that \n" +
            "statement, shall be punished with simple imprisonment for a term which may extend to three months, or \n" +
            "with fine which may extend to five hundred rupees, or with both.";
    String section_181 = "SECTION_181 : False statement on oath or affirmation to public servant or person authorised to \n" +
            "administer an oath or affirmation.—Whoever, being legally bound by an oath 4\n" +
            "[or affirmation] to state \n" +
            "the truth on any subject to any public servant or other person authorized by law to administer such oath \n" +
            "4\n" +
            "[or affirmation], makes, to such public servant or other person as aforesaid, touching that subject, any \n" +
            "statement which is false, and which he either knows or believes to be false or does not believe to be true, \n" +
            "shall be punished with imprisonment of either description for a term which may extend to three years, and \n" +
            "shall also be liable to fine.";
    String section_182 = "SECTION_182 : False information, with intent to cause public servant to use his lawful power to the \n" +
            "injury of another person.—Whoever gives to any public servant any information which he knows or \n" +
            "believes to be false, intending thereby to cause, or knowing it to be likely that he will thereby cause, such \n" +
            "public servant—\n" +
            "(a) to do or omit anything which such public servant ought not to do or omit if the true state of \n" +
            "facts respecting which such information is given were known by him, or\n" +
            "(b) to use the lawful power of such public servant to the injury or annoyance of any personshall be punished with imprisonment of either description for a term which may extend to six months, or \n" +
            "with fine which may extend to one thousand rupees, or with both.";
    String section_183 = "SECTION_183 : Resistance to the taking of property by the lawful authority of a public servant.—Whoever \n" +
            "offers any resistance to the taking of any property by the lawful authority of any public servant, knowing \n" +
            "or having reason to believe that he is such public servant, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to six months, or with fine which may extend to one thousand \n" +
            "rupees, or with both";
    String section_184 = "SECTION_184 : Obstructing sale of property offered for sale by authority of public servant.—Whoever \n" +
            "intentionally obstructs any sale of property offered for sale by the lawful authority of any public servant, \n" +
            "as such, shall be punished with imprisonment of either description for a term which may extend to one \n" +
            "month, or with fine which may extend to five hundred rupees, or with bot";
    String section_185 = "SECTION_185 : Illegal purchase or bid for property offered for sale by authority of public servant.—\n" +
            "Whoever, at any sale of property held by the lawful authority of a public servant, as such, purchases or \n" +
            "bids for any property on account of any person, whether himself or any other, whom he knows to be \n" +
            "under a legal incapacity to purchase that property at that sale, or bids for such property not intending to \n" +
            "perform the obligations under which he lays himself by such bidding, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to one month, or with fine which may \n" +
            "extend to two hundred rupees, or with both.";
    String section_186 = "SECTION_186 : . Obstructing public servant in discharge of public functions.—Whoever voluntarily obstructs \n" +
            "any public servant in the discharge of his public functions, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to three months, or with fine which may extend to five hundred \n" +
            "rupees, or with both.\n";
    String section_187 = "SECTION_187 : Omission to assist public servant when bound by law to give assistance.—Whoever, being \n" +
            "bound by law to render or furnish assistance to any public servant in the execution of his public duty, \n" +
            "intentionally omits to give such assistance, shall be punished with simple imprisonment for a term which \n" +
            "may extend to one month, or with fine which may extend to two hundred rupees, or with both;\n" +
            "and if such assistance be demanded of him by a public servant legally competent to make such \n" +
            "demand for the purposes of executing any process lawfully issued by a Court of Justice, or of preventing \n" +
            "the commission of an offence, or suppressing a riot, or affray, or of apprehending a person charged with \n" +
            "or guilty of an offence, or of having escaped from lawful custody, shall be punished with simple \n" +
            "imprisonment for a term which may extend to six months, or with fine which may extend to five hundred \n" +
            "rupees, or with both";
    String section_188 = "SECTION_188 : Disobedience to order duly promulgated by public servant.—Whoever, knowing that, by an \n" +
            "order promulgated by a public servant lawfully empowered to promulgate such order, he is directed to \n" +
            "abstain from a certain act, or to take certain order with certain property in his possession or under his \n" +
            "management, disobeys such direction,\n" +
            "shall, if such disobedience causes or tends to cause obstruction, annoyance or injury, or risk of \n" +
            "obstruction, annoyance or injury, to any persons lawfully employed, be punished with simple \n" +
            "imprisonment for a term which may extend to one month or with fine which may extend to two hundred \n" +
            "rupees, or with both;\nand if such disobedience causes or tends to cause danger to human life, health or safety, or causes or \n" +
            "tends to cause a riot or affray, shall be punished with imprisonment of either description for a term which \n" +
            "may extend to six months, or with fine which may extend to one thousand rupees, or with both.\n" +
            "Explanation.—It is not necessary that the offender should intend to produce harm, or contemplate his \n" +
            "disobedience as likely to produce harm. It is sufficient that he knows of the order which he disobeys, and \n" +
            "that his disobedience produces, or is likely to produce, harm.";
    String section_189 = "SECTION_189 : Threat of injury to public servant.—Whoever holds out any threat of injury to any public \n" +
            "servant, or to any person in whom he believes that public servant to be interested, for the purpose of \n" +
            "inducing that public servant to do any act, or to forbear or delay to do any act, connected with the exercise \n" +
            "of the public functions of such public servant, shall be punished with imprisonment of either description \n" +
            "for a term which may extend to two years, or with fine, or with both.";
    String section_190 = "SECTION_190 : Threat of injury to induce person to refrain from applying for protection to public \n" +
            "servant.—Whoever holds out any threat of injury to any person for the purpose of inducing that person to \n" +
            "refrain or desist from making a legal application for protection against any injury to any public servant \n" +
            "legally empowered as such to give such protection, or to cause such protection to be given, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to one year, or with fine, \n" +
            "or with both.\n";
    //CHAPTER XI
    //OF FALSE EVIDENCEAND OFFENCES AGAINST PUBLIC JUSTICE
    String section_191 = "SECTION_191 :  Giving false evidence.—Whoever, being legally bound by an oath or by an express provision of \n" +
            "law to state the truth, or being bound by law to make a declaration upon any subject, makes any statement \n" +
            "which is false, and which he either knows or believes to be false or does not believe to be true, is said to \n" +
            "give false evidence.\n" +
            "Explanation1.—A statement is within the meaning of this section, whether it is made verbally or \n" +
            "otherwise.\n" +
            "Explanation 2.—A false statement as to the belief of the person attesting is within the meaning of this \n" +
            "section, and a person may be guilty of giving false evidence by stating that he believes a thing which he \n" +
            "does not believe, as well as by stating that he knows a thing which he does not know.\n";
    String section_192 = "SECTION_192 : Fabricating false evidence.—Whoever causes any circumstance to exist or 1\n" +
            "[makes any false \n" +
            "entry in any book or record, or electronic record or makes any document or electronic record containing a \n" +
            "false statement,] intending that such circumstance, false entry or false statement may appear in evidencein a judicial proceeding, or in a proceeding taken by law before a public servant as such, or before an \n" +
            "arbitrator, and that such circumstance, false entry or false statement, so appearing in evidence, may cause \n" +
            "any person who in such proceeding is to form an opinion upon the evidence, to entertain an erroneous \n" +
            "opinion touching any point material to the result of such proceeding is said “to fabricate false evidence”.\n";
    String section_193 = "SECTION_193 : Punishment for false evidence.—Whoever intentionally gives false evidence in any of a \n" +
            "judicial proceeding, or fabricates false evidence for the purpose of being used in any stage of a judicial \n" +
            "proceeding, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "seven years, and shall also be liable to fine;\n" +
            "and whoever intentionally gives or fabricates false evidence in any other case, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to three years, and shall also be liable to \n" +
            "fine.\n" +
            "Explanation 1.—A trial before a Court-martial1\n" +
            "***is a judicial proceeding.\n" +
            "Explanation 2.—An investigation directed by law preliminary to a proceeding before a Court of \n" +
            "Justice, is a stage of a judicial proceeding, though that investigation may not take place before a Court of \n" +
            "Justice.";
    String section_194 = "SECTION_194 : . Giving or fabricating false evidence with intent to procure conviction of capital offence.—\n" +
            "Whoever gives or fabricates false evidence, intending thereby to cause, or knowing it to be likely that he \n" +
            "will thereby cause, any person to be convicted of an offence which is capital 2\n" +
            "[by the law for the time \n" +
            "being in force in 3\n" +
            "[India]] shall be punished with 4\n" +
            "[imprisonment for life], or with rigorous imprisonment \n" +
            "for a term which may extend to ten years, and shall also be liable to fine;\n" +
            "If innocent person be thereby convicted and executed.—and if an innocent person be convicted \n" +
            "and executed in consequence of such false evidence, the person who gives such false evidence shall be \n" +
            "punished either with death or the punishment hereinbefore described.\n";
    String section_195 = "SECTION_195 : Giving or fabricating false evidence with intent to procure conviction of offence punishable \n" +
            "with imprisonment for life or imprisonment.—Whoever gives or fabricates false evidence intending \n" +
            "thereby to cause, or knowing it to be likely that he will thereby cause, any person to be convicted of an \n" +
            "offence which 2\n" +
            "[by the law for the time being in force in 3\n" +
            "[India]] is not capital, but punishable with \n" +
            "4\n" +
            "[imprisonment for life], or imprisonment for a term of seven years or upwards, shall be punished as a \n" +
            "person convicted of that offence would be liable to be punished.";
    String section_195A = "SECTION_195A : Threatening any person to give false evidence.—Whoever threatens another with any \n" +
            "injury to his person, reputation or property or to the person or reputation of any one in whom that person \n" +
            "is interested, with intent to cause that person to give false evidence shall be punished with imprisonment \n" +
            "of either description for a term which may extend to seven years, or with fine, or with both;\n" +
            "and if innocent person is convicted and sentenced in consequence of such false evidence, with death \n" +
            "or imprisonment for more than seven years, the person who threatens shall be punished with the same \n" +
            "punishment and sentence in the same manner and to the same extent such innocent person is punished and \n" +
            "sentenced.";
    String section_196 = "SECTION_196 : Using evidence known to be false.—Whoever corruptly uses or attempts to use as true or \n" +
            "genuine evidence any evidence which he knows to be false or fabricated, shall be punished in the same \n" +
            "manner as if he gave or fabricated false evidence.";
    String section_197 = "SECTION_197 : Issuing or signing false certificate.—Whoever issues or signs any certificate required by law to \n" +
            "be given or signed, or relating to any fact of which such certificate is by law admissible in evidence, \n" +
            "knowing or believing that such certificate is false in any material point, shall be punished in the same \n" +
            "manner as if he gave false evidence.";
    String section_198 = "SECTION_198 : Using as true a certificate known to be false.—Whoever corruptly uses or attempts to use any \n" +
            "such certificate as a true certificate, knowing the same to be false in any material point, shall be punished \n" +
            "in the same manner as if he gave false evidence.\n";
    String section_199 = "SECTION_199 : False statement made in declaration which is by law receivable as evidence.—Whoever, in \n" +
            "any declaration made or subscribed by him, which declaration any Court of Justice, or any public servant \n" +
            "or other person, is bound or authorised by law to receive as evidence of any fact, makes any statement \n" +
            "which is false, and which he either knows or believes to be false or does not believe to be true, touching \n" +
            "any point material to the object for which the declaration is made or used, shall be punished in the same \n" +
            "manner as if he gave false evidence.";
    String section_200 = "SECTION_200 : . Using as true such declaration knowing it to be false.—Whoever corruptly uses or attempts to \n" +
            "use as true any such declaration, knowing the same to be false in any material point, shall be punished in \n" +
            "the same manner as if he gave false evidence.\n" +
            "Explanation.—A declaration which is inadmissible merely upon the ground of some informality, is a \n" +
            "declaration within the meaning of sections 199 and 200.";
    String section_201 = "SECTION_201 : Causing disappearance of evidence of offence, or giving false information to screen \n" +
            "offender.—Whoever, knowing or having reason to believe that an offence has been committed, causes \n" +
            "any evidence of the commission of that offence to disappear, with the intention of screening the offender \n" +
            "from legal punishment, or with that intention gives any information respecting the offence which he\n" +
            "knows or believes to be false,\n" +
            "if a capital offence.—shall, if the offence which he knows or believes to have been committed is \n" +
            "punishable with death be punished with imprisonment of either description for a term which may extend \n" +
            "to seven years, and shall also be liable to fine;\n" +
            "if punishable with imprisonment for life.—and if the offence is punishable with 1\n" +
            "[imprisonment for \n" +
            "life], or with imprisonment which may extend to ten years, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to three years, and shall also be liable to fine;\n" +
            "if punishable with less than ten years’ imprisonment.—and if the offence is punishable with \n" +
            "imprisonment for any term not extending to ten years, shall be punished with imprisonment of the description provided for the offence, for a term which may extend to one-fourth part of the longest term \n" +
            "of the imprisonment provided for the offence, or with fine, or with both.";
    String section_202 = "SECTION_202 : Intentional omission to give information of offence by person bound to inform.—Whoever, \n" +
            "knowing or having reason to believe that an offence has been committed, intentionally omits to give any \n" +
            "information respecting that offence which he is legally bound to give, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to six months, or with fine, or with both.";
    String section_203 = "SECTION_203 : Giving false information respecting an offence committed.—Whoever, knowing or having \n" +
            "reason to believe that an offence has been committed, gives any information respecting that offence which \n" +
            "he knows or believes to be false, shall be punished with imprisonment of either description for a term \n" +
            "which may extend to two years, or with fine, or with both.\n" +
            "1\n" +
            "[Explanation.—In sections 201 and 202 and in this section the word “offence” includes any act \n" +
            "committed at any place out of 2\n" +
            "[India], which, if committed in 2\n" +
            "[India], would be punishable under any of \n" +
            "the following sections, namely, 302, 304, 382, 392, 393, 394, 395, 396, 397, 398, 399, 402, 435, 436, 449, \n" +
            "450, 457, 458, 459 and 460.]";
    String section_204 = "SECTION_204 : Destruction of document to prevent its production as evidence.—Whoever secretes or \n" +
            "destroys any 3\n" +
            "[document and electronic record] which he may be lawfully compelled to produce as \n" +
            "evidence in a Court of Justice, or in any proceeding lawfully held before a public servant, as such, or \n" +
            "obliterates or renders illegible the whole or any part of such 3\n" +
            "[document or electronic record] with the \n" +
            "intention of preventing the same from being produced or used as evidence before such Court or public \n" +
            "servant as aforesaid, or after he shall have been lawfully summoned or required to produce the same for \n" +
            "that purpose, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "two years, or with fine, or with both.";
    String section_205 = "SECTION_205 : . False personation for purpose of act or proceeding in suit or prosecution.—Whoever falsely \n" +
            "personates another, and in such assumed character makes any admission or statement, or confesses \n" +
            "judgment, or causes any process to be issued or becomes bail or security, or does any other act in any suit \n" +
            "or criminal prosecution, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to three years, or with fine, or with both";
    String section_206 = "SECTION_206 : . Fraudulent removal or concealment of property to prevent its seizure as forfeited or in \n" +
            "execution.—Whoever fraudulently removes, conceals, transfers or delivers to any person any property or \n" +
            "any interest therein, intending thereby to prevent that property or interest therein from being taken as a \n" +
            "forfeiture or in satisfaction of a fine, under a sentence which has been pronounced, or which he knows to \n" +
            "be likely to be pronounced, by a Court of Justice or other competent authority, or from being taken in \n" +
            "execution of a decree or order which has been made, or which he knows to be likely to be made by a \n" +
            "Court of Justice in a civil suit, shall be punished with imprisonment of either description for a term which \n" +
            "may extend to two years or with fine, or with both.\n";
    String section_207 = "SECTION_207 : Fraudulent claim to property to prevent its seizure as forfeited or in execution.—Whoever \n" +
            "fraudulently accepts, receives or claims any property or any interest therein, knowing that he has no right \n" +
            "or rightful claim to such property or interest, or practices any deception touching any right to any property \n" +
            "or any interest therein, intending thereby to prevent that property or interest therein from being taken as a \n" +
            "forfeiture or in satisfaction of a fine, under a sentence which has been pronounced, or which he knows to \n" +
            "be likely to be pronounced by a Court of Justice or other competent authority, or from being taken in \n" +
            "execution of a decree or order which has been made, or which he knows to be likely to be made by a \n" +
            "Court of Justice in a civil suit, shall be punished with imprisonment of either description for a term which \n" +
            "may extend to two years, or with fine, or with both.";
    String section_208 = "SECTION_208 : Fraudulently suffering decree for sum not due.—Whoever fraudulently causes or suffers a \n" +
            "decree or order to be passed against him at the suit of any person for a sum not due or for a larger sum \n" +
            "than is due to such person or for any property or interest in property to which such person is not entitled, \n" +
            "or fraudulently causes or suffers a decree or order to be executed against him after it has been satisfied, or \n" +
            "for anything in respect of which it has been satisfied, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to two years, or with fine, or with both.\n";
    String section_209 = "SECTION_209 : Dishonesty making false claim in Court.—Whoever fraudulently or dishonestly, or with intent \n" +
            "to injure or annoy any person, makes in a Court of Justice any claim which he knows to be false, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to two years, and shall \n" +
            "also be liable to fine";
    String section_210 = "SECTION_210 : Fraudulently obtaining decree for sum not due.—Whoever fraudulently obtains a decree or \n" +
            "order against any person for a sum not due, or for a larger sum than is due or for any property or interest \n" +
            "in property to which he is not entitled, or fraudulently causes a decree or order to be executed against any \n" +
            "person after it has been satisfied or for anything in respect of which it has been satisfied, or fraudulently \n" +
            "suffers or permits any such act to be done in his name, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to two years, or with fine, or with both.\n";
    String section_211 = "SECTION_211 : False charge of offence made with intent to injure.—Whoever, with intent to cause injury to \n" +
            "any person, institutes or causes to be instituted any criminal proceeding against that person, or falsely \n" +
            "charges any person with having committed an offence, knowing that there is no just or lawful ground for \n" +
            "such proceeding or charge against that person, shall be punished with imprisonment of either description \n" +
            "for a term which may extend to two years, or with fine, or with both;\n" +
            "and if such criminal proceeding be instituted on a false charge of an offence punishable with death,\n" +
            "1\n" +
            "[imprisonment for life], or imprisonment for seven years or upwards, shall be punishable with \n" +
            "imprisonment of either description for a term which may extend to seven years, and shall also be liable to \n" +
            "fine.";
    String section_212 = "SECTION_212 : Harbouring offender.—Whenever an offence has been committed, whoever harbours or \n" +
            "conceals a person whom he knows or has reason to believe to be the offender, with the intention of \n" +
            "screening him from legal punishment,\n" +
            "if a capital offence.—shall, if the offence is punishable with death, be punished with imprisonment \n" +
            "of either description for a term which may extend to five years, and shall also be liable to fine;\n" +
            "if punishable with imprisonment for life, or with imprisonment.—and if the offence is punishable \n" +
            "with 1\n" +
            "[imprisonment for life], or with imprisonment which may extend to ten years, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to three years, and shall also be \n" +
            "liable to fine;\n" +
            "and if the offence is punishable with imprisonment which may extend to one year, and not to ten \n" +
            "years, shall be punished with imprisonment of the description provided for the offence for a term which \n" +
            "may extend to one-fourth part of the longest term of imprisonment provided for the offence, or with fine, \n" +
            "or with both. \n" +
            "2\n" +
            "[“Offence” in this section includes any act committed at any place out of 3\n" +
            "[India], which, if \n" +
            "committed in 3\n" +
            "[India], would be punishable under any of the following sections, namely, 302, 304, 382, \n" +
            "392, 393, 394, 395, 396, 397, 398, 399, 402, 435, 436, 449, 450, 457, 458, 459 and 460; and every such \n" +
            "act shall, for the purposes of this section, be deemed to be punishable as if the accused person had been \n" +
            "guilty of it in 3\n" +
            "[India].]Exception.—This provision shall not extend to any case in which the harbour or concealment is by the \n" +
            "husband or wife of the offender.";
    String section_213 = "SECTION_213 :  Taking gift, etc., to screen an offender from punishment.—Whoever accepts or attempts to \n" +
            "obtain, or agrees to accept, any gratification for himself or any other person, or any restitution of property \n" +
            "to himself or any other person, in consideration of his concealing an offence or of his screening any \n" +
            "person from legal punishment for any offence, or of his not proceeding against any person for the purpose \n" +
            "of bringing him to legal punishment,\n" +
            "if a capital offence.—shall, if the offence is punishable with death, be punished with imprisonment \n" +
            "of either description for a term which may extend to seven years, and shall also be liable to fine;\n" +
            "if punishable with imprisonment for life, or with imprisonment.—and if the offence is punishable \n" +
            "with 1\n" +
            "[imprisonment for life], or with imprisonment which may extend to ten years, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to three years, and shall also be \n" +
            "liable to fine;\n" +
            "and if the offence is punishable with imprisonment not extending to ten years, shall be punished with \n" +
            "imprisonment of the description provided for the offence for a term which may extend to one fourth part \n" +
            "of the longest term of imprisonment provided for the offence, or with fine, or with both.\n";
    String section_214 = "SECTION_214 : Offering gift or restoration of property in consideration of screening offender.—Whoever \n" +
            "gives or causes, or offers or agrees to give or cause, any gratification to any person, or 2\n" +
            "[restores or causes \n" +
            "the restoration of] any property to any person, in consideration of that person's concealing an offence, or \n" +
            "of his screening any person from legal punishment for any offence, or of his not proceeding against any \n" +
            "person for the purpose of bringing him to legal punishment,\n" +
            "if a capital offence.—shall, if the offence is punishable with death, be punished with imprisonment \n" +
            "of either description for a term which may extend to seven years, and shall also be liable to fine;\n" +
            "if punishable with imprisonment for life, or with imprisonment.—and if the offence is punishable \n" +
            "with 1\n" +
            "[imprisonment for life] or with imprisonment which may extend to ten years, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to three years, and shall also be liable to \n" +
            "fine;\n" +
            "and if the offence is punishable with imprisonment not extending to ten years, shall be punished with \n" +
            "imprisonment of the description provided for the offence for a term which may extend to one-fourth part \n" +
            "of the longest term of imprisonment provided for the offence, or with fine, or with both.\n" +
            "3\n" +
            "[Exception.—The provisions of sections 213 and 214 do not extend to any case in which the offence \n" +
            "may lawfully be compounded.]";
    String section_215 = "SECTION_215 : Taking gift to help to recover stolen property, etc.—Whoever takes or agrees or consents to \n" +
            "take any gratification under pretence or on account of helping any person to recover any movable \n" +
            "property of which he shall have been deprived by any offence punishable under this Code, shall, unless he \n" +
            "uses all means in his power to cause the offender to be apprehended and convicted of the offence, be \n" +
            "punished with imprisonment of either description for a term which may extend to two years, or with fine, \n" +
            "or with both.";
    String section_216 = "SECTION_216 :  Harbouring offender who has escaped from custody or whose apprehension has been \n" +
            "ordered.—Whenever any person convicted of a charged with an offence, being in lawful custody for that \n" +
            "offence, escapes from such custody,or whenever a public servant, in the exercise of the lawful powers of such public servant, orders a \n" +
            "certain person to be apprehended for an offence, whoever, knowing of such escape or order for \n" +
            "apprehension, harbours or conceals that person with the intention of preventing him from being \n" +
            "apprehended, shall be punished in the manner following, that is to say,\n" +
            "if a capital offence.—if the offence for which the person was in custody or is ordered to be \n" +
            "apprehended is punishable with death, he shall be punished with imprisonment of either description for a \n" +
            "term which may extend to seven years, and shall also be liable to fine;\n" +
            "if punishable with imprisonment for life, or with imprisonment.—if the offence is punishable \n" +
            "with 1\n" +
            "[imprisonment for life] or imprisonment for ten years, he shall be punished with imprisonment of \n" +
            "either description for a term which may extend to three years, with or without fine;\n" +
            "and if the offence is punishable with imprisonment which may extend to one year and not to ten \n" +
            "years, he shall be punished with imprisonment of the description provided for the offence for a term \n" +
            "which may extend to one-fourth part of the longest term of the imprisonment provided for such offence,\n" +
            "or with fine, or with both.\n" +
            "2\n" +
            "[“Offence” in this section includes also any act or omission of which a person is alleged to have been \n" +
            "guilty out of 3\n" +
            "[India], which, if he had been guilty of it in 3\n" +
            "[India], would have been punishable as an \n" +
            "offence, and for which he is, under any law relating to extradition, 4\n" +
            "*** or otherwise, liable to be \n" +
            "apprehended or detained in custody in 3\n" +
            "[India], and every such act or omission shall, for the purposes of \n" +
            "this section, be deemed to be punishable as if the accused person had been guilty of it in 3\n" +
            "[India].]\n" +
            "Exception.—The provision does not extend to the case in which the harbour or concealment is by the \n" +
            "husband or wife of the person to be apprehended.\n";
    String section_216A = "SECTION_216_A : Penalty for harbouring robbers or dacoits.—Whoever, knowing or having reason to \n" +
            "believe that any persons are about to commit or have recently committed robbery or dacoity, harbours \n" +
            "them or any of them, with the intention of facilitating the commission of such robbery or dacoity, or of \n" +
            "screening them or any of them from punishment, shall be punished with rigorous imprisonment for a term \n" +
            "which may extend to seven years, and shall also be liable to fine.\n" +
            "Explanation.—For the purposes of this section it is immaterial whether the robbery or dacoity is \n" +
            "intended to be committed, or has been committed, within or without 3\n" +
            "[India].\n" +
            "Exception.—This provision does not extend to the case in which the harbour is by the husband or \n" +
            "wife of the offender.]\n";
    String section_216B = "SECTION_216_B : Definition of “harbour” in sections 212, 216 and 216A.] Rep. by the Indian Penal Code \n" +
            "(Amendment) Act, 1942 (8 of 1942), s. 3.";
    String section_217 = "SECTION_217 : Public servant disobeying direction of law with intent to save person from punishment or \n" +
            "property from forfeiture.—Whoever, being a public servant, knowingly disobeys any direction of the \n" +
            "law as to the way in which he is to conduct himself as such public servant, intending thereby to save, or \n" +
            "knowing it to be likely that he will thereby save, any person from legal punishment, or subject him to a \n" +
            "less punishment than that to which he is liable, or with intent to save, or knowing that he is likely thereby \n" +
            "to save, any property from forfeiture or any charge to which it is liable by law, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to two years, or with fine, or with both.\n";
    String section_218 = "SECTION_218 : Public servant framing incorrect record or writing with intent to save person from \n" +
            "punishment or property from forfeiture.—Whoever, being a public servant, and being as such public \n" +
            "servant, charged with the preparation of any record or other writing, frames that record or writing in a \n" +
            "manner which he knows to be incorrect, with intent to cause, or knowing it to be likely that he will \n" +
            "thereby cause, loss or injury to the public or to any person, or with intent thereby to save, or knowing it to \n" +
            "be likely that he will thereby save, any person from legal punishment, or with intent to save, or knowing that he is likely thereby to save, any property from forfeiture or other charge to which it is liable by law, \n" +
            "shall be punished with imprisonment of either description for a term which may extend to three years, or \n" +
            "with fine, or with both.";
    String section_219 = "SECTION_219 : . Public servant in judicial proceeding corruptly making report, etc., contrary to law.—\n" +
            "Whoever, being a public servant, corruptly or maliciously makes or pronounces in any stage of a judicial \n" +
            "proceeding, any report, order, verdict, or decision which he knows to be contrary to law, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to seven years, or with fine, or with \n" +
            "both";
    String section_220 = "SECTION_220 : Commitment for trial or confinement by person having authority who knows that he is \n" +
            "acting contrary to law.—Whoever, being in any office which gives him legal authority to commit \n" +
            "persons for trial or to confinement, or to keep persons in confinement, corruptly or maliciously commits \n" +
            "any person for trial or to confinement, or keeps any person in confinement, in the exercise of that \n" +
            "authority knowing that in so doing he is acting contrary to law, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to seven years, or with fine, or with both.";
    String section_221 = "SECTION_221 : . Intentional omission to apprehend on the part of public servant bound to apprehend.—\n" +
            "Whoever, being a public servant, legally bound as such public servant to apprehend or to keep in \n" +
            "confinement any person charged with or liable to be apprehended for an offence, intentionally omits to \n" +
            "apprehend such person, or intentionally suffers such person to escape, or intentionally aids such person in \n" +
            "escaping or attempting to escape from such confinement, shall be punished as follows, that is to say:—\n" +
            "with imprisonment of either description for a term which may extend to seven years, with or without \n" +
            "fine, if the person in confinement, or who ought to have been apprehended, was charged with, or liable to \n" +
            "be apprehended for, an offence punishable with death; or \n" +
            "with imprisonment of either description for a term which may extend to three years, with or without \n" +
            "fine, if the person in confinement, or who ought to have been apprehended, was charged with, or liable to \n" +
            "be apprehended for, an offence punishable with 1\n" +
            "[imprisonment for life] or imprisonment for a term \n" +
            "which may extend to ten years; or\n" +
            "with imprisonment of either description for a term which may extend to two years, with or without \n" +
            "fine, if the person in confinement, or who ought to have been apprehended, was charged with, or liable to \n" +
            "be apprehended for, an offence punishable with imprisonment for a term less than ten years.";
    String section_222 = "SECTION_222 : Intentional omission to apprehend on the part of public servant bound to apprehend \n" +
            "person under sentence or lawfully committed.—Whoever, being a public servant, legally bound as \n" +
            "such public servant to apprehend or to keep in confinement any person under sentence of a Court of \n" +
            "Justice for any offence 2\n" +
            "[or lawfully committed to custody], intentionally omits to apprehend such person, \n" +
            "or intentionally suffers such person to escape or intentionally aids such person in escaping or attempting \n" +
            "to escape from such confinement, shall be punished as follows, that is to say:—\n" +
            "with 1\n" +
            "[imprisonment for life] or with imprisonment of either description for a term which may extend \n" +
            "to fourteen years, with or without fine, if the person in confinement, or who ought to have been \n" +
            "apprehended, is under sentence of death; or\n" +
            "with imprisonment of either description for a term which may extend to seven years, with or without \n" +
            "fine, if the person in confinement or who ought to have been apprehended, is subject, by a sentence of a \n" +
            "Court of Justice, or by virtue of a commutation of such sentence, to 1\n" +
            "[imprisonment for life] 3\n" +
            "*** 4\n" +
            "*** \n" +
            "5\n" +
            "*** 6\n" +
            "*** or imprisonment for a term of ten years, or upwards; or \n" +
            "with imprisonment of either description for a term which may extend to three years, or with fine, or \n" +
            "with both, if the person in confinement or who ought to have been apprehended is subject by a sentence \n" +
            "of a Court of Justice, to imprisonment for a term not extending to ten years 2\n" +
            "[or if the person was lawfully \n" +
            "committed to custody].";
    String section_223 = "SECTION_223 :  Escape from confinement or custody negligently suffered by public servant.—Whoever, \n" +
            "being a public servant legally bound as such public servant to keep in confinement any person charged \n" +
            "with or convicted of any offence 1\n" +
            "[or lawfully committed to custody], negligently suffers such person to \n" +
            "escape from confinement, shall be punished with simple imprisonment for a term which may extend to \n" +
            "two years, or with fine, or with both";
    String section_224 = "SECTION_224 : Resistance or obstruction by a person to his lawful apprehension.—Whoever intentionally \n" +
            "offers any resistance or illegal obstruction to the lawful apprehension of himself for any offence with \n" +
            "which he is charged or of which he has been convicted, or escapes or attempts to escape from any custody \n" +
            "in which he is lawfully detained for any such offence, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to two years, or with fine, or with both.\n" +
            "Explanation.—The punishment in this section is in addition to the punishment for which the person to \n" +
            "be apprehended or detained in custody was liable for the offence with which he was charged, or of which \n" +
            "he was convicted.";
    String section_225 = "SECTION_225 : Resistance or obstruction to lawful apprehension of another person.—Whoever intentionally \n" +
            "offers any resistance or illegal obstruction to the lawful apprehension of any other person for an offence, \n" +
            "or rescues or attempts to rescue any other person from any custody in which that person is lawfully \n" +
            "detained for an offence, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to two years, or with fine, or with both;\n" +
            "or, if the person to be apprehended, or the person rescued or attempted to be rescued, is charged with \n" +
            "or liable to be apprehended for an offence punishable with 2\n" +
            "[imprisonment for life] or imprisonment for a \n" +
            "term which may extend to ten years, shall be punished with imprisonment of either description for a term \n" +
            "which may extend to three years, and shall also be liable to fine;\n" +
            "or, if the person to be apprehended, or rescued, or attempted to be rescued, is charged with or liable to \n" +
            "be apprehended for an offence punishable with death, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to seven years, and shall also be liable to fine;\n" +
            "or, if the person to be apprehended or rescued, or attempted to be rescued, is liable under the sentence \n" +
            "of a Court of Justice, or by virtue of a commutation of such a sentence, to 2\n" +
            "[imprisonment for life], 3\n" +
            "*** \n" +
            "4\n" +
            "*** 5\n" +
            "*** or imprisonment, for a term of ten years, or upwards, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to seven years, and shall also be liable to fine;\n" +
            "or, if the person to be apprehended or rescued, or attempted to be rescued, is under sentence of death, \n" +
            "shall be punished with 2\n" +
            "[imprisonment for life] or imprisonment of either description for a term not \n" +
            "exceeding ten years, and shall also be liable to fine.\n";
    String section_225A = "SECTION_225A : . Omission to apprehend, or sufferance of escape, on part of public servant, in cases not \n" +
            "otherwise, provided for.—Whoever, being a public servant legally bound as such public servant to \n" +
            "apprehend, or to keep in confinement, any person in any case not provided for in section 221, section 222 \n" +
            "or section 223, or in any other law for the time being in force, omits to apprehend that person or suffers \n" +
            "him to escape from confinement, shall be punished—\n" +
            "(a) if he does so intentionally, with imprisonment of either description for a term which may \n" +
            "extend to three years, or with fine or with both; and\n" +
            "(b) if he does so negligently, with simple imprisonment for a term which may extend to two \n" +
            "years, or with fine, or with both.\n";
    String section_225B = "SECTION_225B : Resistance or obstruction to lawful apprehension, or escape or rescue in cases not \n" +
            "otherwise provided for.—Whoever, in any case not provided for in section 224 or section 225 or in any \n" +
            "other law for the time being in force, intentionally offers any resistance or illegal obstruction to the lawful \n" +
            "apprehension of himself or of any other person, or escapes or attempts to escape from any custody in which he is lawfully detained, or rescues or attempts to rescue any other person from any custody in \n" +
            "which that person is lawfully detained, shall be punished with imprisonment of either description for a \n" +
            "term which may extend to six months, or with fine, or with both.";
    String section_226 = "SECTION_226 : [Unlawful return from transportation.] Rep. by the Code of Criminal Procedure (Amendment) \n" +
            "Act, 1955 (26 of 1955), s. 117 and the Sch (w.e.f. 1-1-1956).";
    String section_227 = "SECTION_227 : Violation of condition of remission of punishment.—Whoever, having accepted any \n" +
            "conditional remission of punishment, knowingly violates any condition on which such remission was \n" +
            "granted, shall be punished with the punishment to which he was originally sentenced, if he has already \n" +
            "suffered no part of that punishment, and if he has suffered any part of that punishment, then with so much \n" +
            "of that punishment as he has not already suffered.";
    String section_228 = "SECTION_228 : . Intentional insult or interruption to public servant sitting in judicial proceeding.—Whoever \n" +
            "intentionally offers any insult, or causes any interruption to any public servant, while such public servant \n" +
            "is sitting in any stage of a judicial proceeding, shall be punished with simple imprisonment for a term \n" +
            "which may extend to six months, or with fine which may extend to one thousand rupees, or with both.\n";
    String section_228A = "SECTION_228A : Disclosure of identity of the victim of certain offences, etc.—(1) Whoever prints or \n" +
            "publishes the name or any matter which may make known the identity of any person against whom an \n" +
            "2\n" +
            "[offence under section 376, section 376A, section 376B, section 376C, section 376D or section 376E] is \n" +
            "alleged or found to have been committed (hereafter in this section referred to as the victim) shall be \n" +
            "punished with imprisonment of either description for a term which may extend to two years and shall also \n" +
            "be liable to fine.\n" +
            "(2) Nothing in sub-section (1) extends to any printing or publication of the name or any matter which \n" +
            "may make known the identity of the victim if such printing or publication is—\n" +
            "(a) by or under the order in writing of the officer-in-charge of the police station or the police \n" +
            "officer making the investigation into such offence acting in good faith for the purposes of such \n" +
            "investigation; or\n" +
            "(b) by, or with the authorisation in writing of, the victim; or\n" +
            "(c) where the victim is dead or minor or of unsound mind, by, or with the authorisation in writing \n" +
            "of, the next of kin of the victim:\n" +
            "Provided that no such authorisation shall be given by the next of kin to anybody other than the \n" +
            "chairman or the secretary, by whatever name called, of any recognised welfare institution or organisation.\n" +
            "Explanation.—For the purposes of this sub-section, “recognised welfare institution or organisation”\n" +
            "means a social welfare institution or organisationrecognised in this behalf by the Central or State \n" +
            "Government.\n" +
            "(3) Whoever prints or publishes any matter in relation to any proceeding before a court with respect to \n" +
            "an offence referred to in sub-section (1) without the previous permission of such court shall be punished \n" +
            "with imprisonment of either description for a term which may extend to two years and shall also be liable \n" +
            "to fine.\n" +
            "Explanation.—The printing or publication of the judgment of any High Court or the Supreme Court \n" +
            "does not amount to an offence within the meaning of this section.";
    String section_229 = "SECTION_229 : Personation of a juror or assessor.—Whoever, by personation or otherwise, shall intentionally \n" +
            "cause, or knowingly suffer himself to be returned, empanelled or sworn as a juryman or assessor in any \n" +
            "case in which he knows that he is not entitled by law to be so returned, empanelled or sworn, or knowing \n" +
            "himself to have been so returned, empanelled or sworn contrary to law, shall voluntarily serve on such \n" +
            "jury or as such assessor, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to two years, or with fine, or with both.\n";
    String section_229A = "SECTION_229A : Failure by person released on bail or bond to appear in court.—Whoever, having been \n" +
            "charged with an offence and released on bail or on bond without sureties, fails without sufficient cause \n" +
            "(the burden of proving which shall lie upon him), to appear in court in accordance with the terms of the \n" +
            "bail or bond, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "one year, or with fine, or with both.\n" +
            "Explanation.—The punishment under this section is—\n" +
            "(a) in addition to the punishment to which the offender would be liable on a conviction for the \n" +
            "offence with which he has been charged; and\n" +
            "(b) without prejudice to the power of the court to order forfeiture of the bond.";
    // CHAPTER XII
    //OF OFFENCES RELATINGTO COINAND GOVERNMENT STAMPS
    String section_230 = "SECTION_230 : “Coin” defined.—2\n" +
            "[Coin is metal used for the time being as money, and stamped and issued by \n" +
            "the authority of some State or Sovereign Power in order to be so used.]\n" +
            "3\n" +
            "[Indian coin.—Indian coin is metal stamped and issued by the authority of the Government of India \n" +
            "in order to be used as money; and metal which has been so stamped and issued shall continue to be Indian \n" +
            "coin for the purposes of this Chapter, notwithstanding that it may have ceased to be used as money.";
    String section_231 = "SECTION_231 : Counterfeiting coin.—Whoever counterfeits or knowingly performs any part of the process of \n" +
            "counterfeiting coin, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to seven years, and shall also be liable to fine.\n" +
            "Explanation.—A person commits this offence who intending to practise deception, or knowing it to \n" +
            "be likely that deception will thereby be practised, causes a genuine coin to appear like a different coin.";
    String section_232 = "SECTION_232 : Counterfeiting Indian coin.—Whoever counterfeits, or knowingly performs any part of the \n" +
            "process of counterfeiting 4\n" +
            "[Indian coin], shall be punished with 7\n" +
            "[imprisonment for life], or with \n" +
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \n" +
            "fine.";
    String section_233 = "SECTION_233 : Making or selling instrument for counterfeiting coin.—Whoever makes or mends, or \n" +
            "performs any part of the process of making or mending, or buys, sells or disposes of, any die or \n" +
            "instrument, for the purpose of being used, or knowing or having reason to believe that it is intended to be \n" +
            "used, for the purpose of counterfeiting coin, shall be punished with imprisonment of either description for \n" +
            "a term which may extended to three years, and shall also be liable to fine.";
    String section_234 = "SECTION_234 :  Making or selling instrument for counterfeiting Indian coin.—Whoever makes or mends, or \n" +
            "performs any part of the process of making or mending or buys, sells or disposes of, any die or \n" +
            "instrument, for the purpose of being used, or knowing or having reason to believe that it is intended to be used, for the purpose of counterfeiting 1\n" +
            "[Indian coin], shall be punished with imprisonment of either \n" +
            "description for a term which may extend to seven years, and shall also be liable to fine.";
    String section_235 = "SECTION_235 : Possession of instrument or material for the purpose of using the same for counterfeiting \n" +
            "coin.—Whoever is in possession of any instrument or material, for the purpose of using the same for \n" +
            "counterfeiting coin, or knowing or having reason to believe that the same is intended to be used for that \n" +
            "purpose, shall be punished with imprisonment of either description for a term which may extend to three \n" +
            "years, and shall also be liable to fine;\n" +
            "if Indian coin.—and if the coin to be counterfeited is 1\n" +
            "[Indian coin], shall be punished with \n" +
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \n" +
            "fine.";
    String section_236 = "SECTION_236 : 236. Abetting in India the counterfeiting out of India of coin.—Whoever, being within 2\n" +
            "[India] \n" +
            "abets the counterfeiting of coin out of 2\n" +
            "[India] shall be punished in the same manner as if he abetted the \n" +
            "counterfeiting of such coin within 2\n" +
            "[India].";
    String section_237 = "SECTION_237 : Import or export of counterfeit coin.—Whoever imports into 2\n" +
            "[India], or exports therefrom,\n" +
            "any counterfeit coin, knowing or having reason to believe that the same is counterfeit, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to three years, and shall also be \n" +
            "liable to fine.";
    String section_238 = "SECTION_238 : Import or export of counterfeits of the Indian coin.—Whoever imports into 2\n" +
            "[India], or \n" +
            "exports therefrom, any counterfeit coin, which he knows or has reason to believe to be a counterfeit of \n" +
            "1\n" +
            "[Indian coin], shall be punished with 3\n" +
            "[Imprisonment for life], or with imprisonment of either description \n" +
            "description for a term which may extend to ten years, and shall also be liable to fine.";
    String section_239 = "SECTION_239 : Delivery of coin, possessed with knowledge that it is counterfeit.—Whoever, having any \n" +
            "counterfeit coin, which at the time when he became possessed of it, he knew to be counterfeit, \n" +
            "fraudulently or with intent that fraud may be committed, delivers the same to any persons or attempts to \n" +
            "induce any person to receive it, shall be punished with imprisonment of either description for a term \n" +
            "which may extend to five years, and shall also be liable to fine.\n";
    String section_240 = "SECTION_240 : Delivery of Indian coin, possessed with knowledge that it is counterfeit.—Whoever, having \n" +
            "any counterfeit coin which is a counterfeit of 1\n" +
            "[Indian coin], and which, at the time when he became \n" +
            "possessed of it, he knew to be a counterfeit of 1\n" +
            "[Indian coin], fraudulently or with intent that fraud may be \n" +
            "committed, delivers the same to any person, or attempts to induce any person to receive it, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \n" +
            "be liable to fine.";
    String section_241 = "SECTION_241 : Delivery of coin as genuine, which, when first possessed, the deliverer did not know to be \n" +
            "counterfeit.—Whoever delivers to any other person as genuine, or attempts to induce any other person to \n" +
            "receive as genuine, any counterfeit coin which he knows to be counterfeit, but which he did not know to \n" +
            "be counterfeit at the time when he took it into his possession, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to two years, or with fine to an amount which may extend \n" +
            "to ten times the value of the coin counterfeited, or with both.\n";
    String section_242 = "SECTION_242 : Possession of counterfeit coin by person who knew it to be counterfeit when he became \n" +
            "possessed thereof.—Whoever, fraudulently or with intent that fraud may be committed, is in possession of counterfeit coin, having known at the time when he became possessed thereof that such coin was \n" +
            "counterfeit, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "three years, and shall also be liable to fine";
    String section_243 = "SECTION_243 : Possession of Indian coin by person who knew it to be counterfeit when he became \n" +
            "possessed thereof.—Whoever, fraudulently or with intent that fraud may be committed, is in possession \n" +
            "of counterfeit coin, which is a counterfeit of 1\n" +
            "[Indian coin], having known at the time when he became \n" +
            "possessed of it that it was counterfeit, shall be punished with imprisonment of either description for a \n" +
            "term which may extend to seven years, and shall also be liable to fine.";
    String section_244 = "SECTION_244 : Person employed in mint causing coin to be of different weight or composition from that \n" +
            "fixed by law.—Whoever, being employed in any mint lawfully established in 2\n" +
            "[India], does any act, or \n" +
            "omits what he is legally bound to do, with the intention of causing any coin issued from that mint to be of \n" +
            "a different weight or composition from the weight or composition fixed by law, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to seven years, and shall also be liable to \n" +
            "fine.\n";
    String section_245 = "SECTION_245 : Unlawfully taking coining instrument from mint.—Whoever, without lawful authority, takes \n" +
            "out of any mint, lawfully established in 2\n" +
            "[India], any coining tool or instrument, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to seven years, and shall also be liable to \n" +
            "fine.";
    String section_246 = "SECTION_246 : Fraudulently or dishonestly diminishing weight or altering composition of coin.—Whoever, \n" +
            "fraudulently or dishonestly performs on any coin any operation which diminishes the weight or alters the \n" +
            "composition of that coin, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to three years, and shall also be liable to fine.\n" +
            "Explanation.—A person who scoops out part of the coin and puts anything else into the cavity alters \n" +
            "the composition of the coin.\n";
    String section_247 = "SECTION_247 : Fraudulently or dishonestly diminishing weight or altering composition of Indian coin.—\n" +
            "Whoever fraudulently or dishonestly performs on 3\n" +
            "[any Indian coin] any operation which diminishes the \n" +
            "weight or alters the composition of that coin, shall be punished with imprisonment of either description \n" +
            "for a term which may extend to seven years, and shall also be liable to fine";
    String section_248 = "SECTION_248 : Altering appearance of coin with intent that it shall pass as coin of different description.—\n" +
            "Whoever performs on any coin any operation which alters the appearance of that coin, with the intention \n" +
            "that the said coin shall pass as a coin of a different description, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to three years, and shall also be liable to fine.";
    String section_249 = "SECTION_249 : Altering appearance of Indian coin with intent that it shall pass as coin of different \n" +
            "description.—Whoever performs on 3\n" +
            "[any Indian coin] any operation which alters the appearance of that \n" +
            "coin, with the intention that the said coin shall pass as a coin of a different description, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to seven years, and shall also be \n" +
            "liable to fine.";
    String section_250 = "SECTION_250 : Delivery of coin, possessed with knowledge that it is altered.—Whoever, having coin in his \n" +
            "possession with respect to which the offence defined in section 246 or 248 has been committed, and \n" +
            "having known at the time when he became possessed of such coin that such offence had been committed \n" +
            "with respect to it, fraudulently or with intent that fraud may be committed, delivers such coin to any other \n" +
            "person, or attempts to induce any other person to receive the same, shall be punished with imprisonment \n" +
            "of either description for a term which may extend to five years, and shall also be liable to fine.\n";
    String section_251 = "SECTION_251 : Delivery of Indian coin, possessed with knowledge that it is altered.—Whoever, having coin \n" +
            "in his possession with respect to which the offence defined in section 247 or 249 has been committed, and \n" +
            "having known at the time when he became possessed of such coin that such offence had been committed \n" +
            "with respect to it, fraudulently or with intent that fraud may be committed, delivers such coin to any other person, or attempts to induce any other person to receive the same, shall be punished with imprisonment \n" +
            "of either description for a term which may extend to ten years, and shall also be liable to fine.\n";
    String section_252 = "SECTION_252 :  Possession of coin by person who knew it to be altered when he became possessed \n" +
            "thereof.—Whoever fraudulently or with intent that fraud may be committed, is in possession of coin with \n" +
            "respect to which the offence defined in either of the section 246 or 248 has been committed, having \n" +
            "known at the time of becoming possessed thereof that such offence had been committed with respect to \n" +
            "such coin, shall be punished with imprisonment of either description for a term which may extend to three \n" +
            "years, and shall also be liable to fine";
    String section_253 = "SECTION_253 : . Possession of Indian coin by person who knew it to be altered when he became possessed \n" +
            "thereof.—Whoever, fraudulently or with intent that fraud may be committed, is in possession of coin \n" +
            "with respect to which the offence defined in either of the section 247 or 249 has been committed having \n" +
            "known at the time of becoming possessed thereof, that such offence had been committed with respect to \n" +
            "such coin, shall be punished with imprisonment of either description for a term which may extend to five \n" +
            "years, and shall also be liable to fine";
    String section_254 = "SECTION_254 : Delivery of coin as genuine which, when first possessed, the deliverer did not know to be \n" +
            "altered.—Whoever delivers to any other person as genuine or as a coin of a different description from \n" +
            "what it is, or attempts to induce any person to receive as genuine, or as a different coin from what it is, \n" +
            "any coin in respect of which he knows that any such operation as that mentioned in sections 246, 247, 248 \n" +
            "or 249 has been performed, but in respect of which he did not, at the time when he took it into his \n" +
            "possession, know that such operation had been performed, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to two years, or with fine to an amount which may extend to ten \n" +
            "times the value of the coin for which the altered coin is passed, or attempted to be passed.";
    String section_255 = "SECTION_255 : Counterfeiting Government stamp.—Whoever counterfeits, or knowingly performs any part \n" +
            "of the process of counterfeiting, any stamp issued by Government for the purpose of revenue shall be \n" +
            "punished with 1\n" +
            "[imprisonment for life] or with imprisonment of either description for a term which may \n" +
            "extend to ten years, and shall also be liable to fine.\n" +
            "Explanation.—A person commits this offence who counterfeits by causing a genuine stamps of one \n" +
            "denomination to appear like a genuine stamp of a different denomination.";
    String section_256 = "SECTION_256 : Having possession of instrument or material for counterfeiting Government stamp.—\n" +
            "Whoever has in his possession any instrument or material for the purpose of being used, or knowing or \n" +
            "having reason to believe that it is intended to be used, for the purpose of counterfeiting any stamp issued \n" +
            "by Government for the purpose of revenue, shall be punished with imprisonment of either description for \n" +
            "a term which may extend to seven years, and shall also be liable to fine";
    String section_257 = "SECTION_257 :  Making or selling instrument for counterfeiting Government stamp.—Whoever makes or \n" +
            "performs any part of the process of making, or buys, or sells, or disposes or, any instrument for the \n" +
            "purpose of being used, or knowing or having reason to believe that it is intended to be used, for the \n" +
            "purpose of counterfeiting any stamp issued by Government for the purpose of revenue, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to seven years, and shall also be \n" +
            "liable to fine";
    String section_258 = "SECTION_258 : Sale of counterfeit Government stamp.—Whoever sells, or offers for sale, any stamp which he \n" +
            "knows or has reason to believe to be a counterfeit of any stamp issued by Government for the purpose of \n" +
            "revenue, shall be punished with imprisonment of either description for a term which may extend to seven \n" +
            "years, and shall also be liable to fine";
    String section_259 = "SECTION_259 : . Having possession of counterfeit Government stamp.—Whoever has in his possession any \n" +
            "stamp which he knows to be a counterfeit of any stamp issued by Government for the purpose of revenue, \n" +
            "intending to use, or dispose of the same as a genuine stamp, or in order that it may be used as a genuine \n" +
            "stamp, shall be punished with imprisonment of either description for a term which may extend to seven \n" +
            "years, and shall also be liable to fine.";
    String section_260 = "SECTION_260 : Using as genuine a Government stamp known to be counterfeit.—Whoever uses as genuine \n" +
            "any stamp, knowing it to be a counterfeit of any stamp issued by Government for the purpose of revenue, shall be punished with imprisonment of either description for a term which may extend to seven years, or \n" +
            "with fine, or with both.";
    String section_261 = "SECTION_261 : Effacing writing from substance bearing Government stamp, or removing from document \n" +
            "a stamp used for it, with intent to cause loss to Government.—Whoever, fraudulently or with intent to \n" +
            "cause loss to the Government, removes or effaces from any substance, bearing any stamp issued by \n" +
            "Government for the purpose of revenue, any writing or document for which such stamp has been used, or \n" +
            "removes from any writing or document a stamp which has been used for such writing or document, in \n" +
            "order that such stamp may be used for a different writing or document, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to three years, or with fine, or with both.";
    String section_262 = "SECTION_262 : Using Government stamp known to have been before used.—Whoever, fraudulently or with \n" +
            "intent to cause loss to the Government, uses for any purpose a stamp issued by Government for the \n" +
            "purpose of revenue, which he knows to have been before used, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to two years, or with fine, or with both.";
    String section_263 = "SECTION_263 : Erasure of mark denoting that stamp has been used.—Whoever, fraudulently or with intent \n" +
            "to cause loss to Government, erases or removes from a stamp issued by Government for the purpose of \n" +
            "revenue, any mark, put or impressed upon such stamp for the purpose of denoting that the same has been \n" +
            "used, or knowingly has in his possession or sells or disposes of any such stamp from which such mark has \n" +
            "been erased or removed, or sells or disposes of any such stamp which he knows to have been used, shall \n" +
            "be punished with imprisonment of either description for a term which may extend to three years, or with \n" +
            "fine, or with both.\n";
    String section_263A = "SECTION_263A : Prohibition of fictitious stamps.—(1) Whoever—\n" +
            "(a) makes, knowingly utters, deals in or sells any fictitious stamp, or knowingly uses for any \n" +
            "postal purpose any fictitious stamp, or\n" +
            "(b) has in his possession, without lawful excuse, any fictitious stamp, or\n" +
            "(c) makes or, without lawful excuse, has in his possession any die, plate, instrument or materials \n" +
            "for making any fictitious stamp, \n" +
            "shall be punished with fine which may extend to two hundred rupees.\n" +
            "(2) Any such stamp, die, plate, instrument or materials in the possession of any person for making any \n" +
            "fictitious stamp 2\n" +
            "[may be seized and, if seized] shall be forfeited.\n" +
            "(3) In this section “fictitious stamp” means any stamp falsely purporting to be issued by Government \n" +
            "for the purpose of denoting a rate of postage, or any facsimile or imitation or representation, whether on \n" +
            "paper or otherwise, of any stamp issued by Government for that purpose.\n" +
            "(4) In this section and also in sections 255 to 263, both inclusive, the word “Government”, when used \n" +
            "in connection with, or in reference to any stamp issued for the purpose of denoting a rate of postage, shall, \n" +
            "notwithstanding anything in section 17, be deemed to include the person or persons authorized by law to \n" +
            "administer executive government in any part of India, and also in any part of Her Majesty's dominions or \n" +
            "in any foreign country.\n";
    // CHAPTER XIII
    //OF OFFENCESRELATINGTO WEIGHTSAND MEASURES
    String section_264 = "SECTION_264 : . Fraudulent use of false instrument for weighing.—Whoever, fraudulently uses any instrument \n" +
            "for weighing which he knows to be false, shall be punished with imprisonment of either description for a \n" +
            "term which may extend to one year, or with fine, or with both.";
    String section_265 = "SECTION_265 : Fraudulent use of false weight or measure.—Whoever, fraudulently uses any false weight or \n" +
            "false measure of length or capacity, or fraudulently uses any weight or any measure of length or capacity \n" +
            "as a different weight or measure from what it is, shall be punished with imprisonment of either description \n" +
            "for a term which may extend to one year, or with fine, or with both.";
    String section_266 = "SECTION_266 : Being in possession of false weight or measure.—Whoever is in possession of any instrument \n" +
            "for weighing, or of any weight, or of any measure of length or capacity, which he knows to be false,intending that the same may be fraudulently used, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to one year, or with fine, or with both.";
    String section_267 = "SECTION_267 : Making or selling false weight or measure.—Whoever makes, sells or disposes of any \n" +
            "instrument for weighing, or any weight, or any measure of length or capacity which he knows to be false, \n" +
            "in order that the same may be used as true, or knowing that the same is likely to be used as true, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to one year, or with fine, \n" +
            "or with both.\n";
    //  CHAPTER XIV
    //OF OFFENCESAFFECTINGTHE PUBLIC HEALTH, SAFETY, CONVENIENCE, DECENCYAND MORALS
    String section_268 = "SECTION_268 : Public nuisance.—A person is guilty of a public nuisance who does any act or is guilty of an \n" +
            "illegal omission which causes any common injury, danger or annoyance to the public or to the people in \n" +
            "general who dwell or occupy property in the vicinity, or which must necessarily cause injury, obstruction, \n" +
            "danger or annoyance to persons who may have occasion to use any public right.\n" +
            "A common nuisance is not excused on the ground that it causes some convenience or advantage.";
    String section_269 = "SECTION_269 : Negligent act likely to spread infection of disease dangerous to life.—Whoever unlawfully or \n" +
            "negligently does any act which is, and which he knows or has reason to believe to be, likely to spread the \n" +
            "infection of any disease dangerous to life, shall be punished with imprisonment of either description for a \n" +
            "term which may extend to six months, or with fine, or with both.\n";
    String section_270 = "SECTION_270 :  Malignant act likely to spread infection of disease dangerous to life.—Whoever malignantly \n" +
            "does any act which is, and which he knows or has reason the believe to be, likely to spread the infection \n" +
            "of any disease dangerous to life, shall be punished with imprisonment of either description for a term \n" +
            "which may extend to two years, or with fine, or with both.";
    String section_271 = "SECTION_271 :  Disobedience to quarantine rule.—Whoever knowingly disobeys any rule made and \n" +
            "promulgated 2\n" +
            "[by the 3\n" +
            "*** Government 4\n" +
            "***] for putting any vessel into a state of quarantine, or for \n" +
            "regulating the intercourse of vessels in a state of quarantine with the shore or with other vessels, for \n" +
            "regulating the intercourse between places where an infectious disease prevails and other places, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to six months, or with \n" +
            "fine, or with both.";
    String section_272 = "SECTION_272 :  Adulteration of food or drink intended for sale.—Whoever adulterates any article of food or \n" +
            "drink, so as to make such article noxious as food or drink, intending to sell such article as food or drink, \n" +
            "or knowing it to be likely that the same will be sold as food or drink, shall be punished with imprisonment \n" +
            "of either description for a term which may extend to six months, or with fine which may extend to one\n" +
            "thousand rupees, or with both.\n";
    String section_273 = "SECTION_273 : Sale of noxious food or drink.—Whoever sells, or offers or exposes for sale, as food or drink, \n" +
            "any article which has been rendered or has become noxious, or is in a state unfit for food or drink, \n" +
            "knowing or having reason to believe that the same is noxious as food or drink, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both.";
    String section_274 = "SECTION_274 : Adulteration of drugs.—Whoever adulterates any drug or medical preparation in such a manner \n" +
            "as to lessen the efficacy or change the operation of such drug or medical preparation, or to make it \n" +
            "noxious, intending that it shall be sold or used for, or knowing it to be likely that it will be sold or used \n" +
            "for, any medicinal purpose, as if it had not undergone such adulteration, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both.";
    String section_275 = "SECTION_275 : Sale of adulterated drugs.—Whoever, knowing any drug or medical preparation to have been \n" +
            "adulterated in such a manner as to lessen its efficacy, to change its operation, or to render it noxious, sells \n" +
            "the same, or offers or exposes it for sale, or issues it from any dispensary for medicinal purposes as \n" +
            "unadulterated, or causes it to be used for medicinal purposes by any person not knowing of the \n" +
            "adulteration, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "six months, or with fine which may extend to one thousand rupees, or with both.";
    String section_276 = "SECTION_276 : Sale of drug as a different drug or preparation.—Whoever knowingly sells, or offers or \n" +
            "exposes for sale, or issues from a dispensary for medicinal purposes, any drug or medical preparation, as a \n" +
            "different drug or medical preparation, shall be punished with imprisonment of either description for a \n" +
            "term which may extend to six months, or with fine which may extend to one thousand rupees, or with \n" +
            "both.";
    String section_277 = "SECTION_277 : Fouling water of public spring or reservoir.—Whoever voluntarily corrupts or fouls the water \n" +
            "of any public spring or reservoir, so as to render it less fit for the purpose for which it is ordinarily used, \n" +
            "shall be punished with imprisonment of either description for a term which may extend to three months, \n" +
            "or with fine which may extend to five hundred rupees, or with both.\n";
    String section_278 = "SECTION_278 : Making atmosphere noxious to health.—Whoever voluntarily vitiates the atmosphere in any \n" +
            "place so as to make it noxious to the health of persons in general dwelling or carrying on business in the \n" +
            "neighbourhood or passing along a public way, shall be punished with fine which may extend to five \n" +
            "hundred rupees";
    String section_279 = "SECTION_279 : Rash driving or riding on a public way.—Whoever drives any vehicle, or rides, on any public \n" +
            "way in a manner so rash or negligent as to endanger human life, or to be likely to cause hurt or injury to \n" +
            "any other person, shall be punished with imprisonment of either description for a term which may extend \n" +
            "to six months, or with fine which may extend to one thousand rupees, or with both.";
    String section_280 = "SECTION_280 : Rash navigation of vessel.—Whoever navigates any vessel in a manner so rash or negligent as \n" +
            "to endanger human life, or to be likely to cause hurt or injury to any other person, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both.\n";
    String section_281 = "SECTION_281 : Exhibition of false light, mark or buoy.—Whoever exhibits any false light, mark or buoy, \n" +
            "intending or knowing it to be likely that such exhibition will mislead any navigator, shall be punished \n" +
            "with imprisonment of either description for a term which may extend to seven years, or with fine, or with \n" +
            "both. ";
    String section_282 = "SECTION_282 : Conveying person by water for hire in unsafe or overloaded vessel.—Whoever knowingly or \n" +
            "negligently conveys, or causes to be conveyed for hire, any person by water in any vessel, when that \n" +
            "vessel is in such a state or so loaded as to endanger the life of that person, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both.";
    String section_283 = "SECTION_283 : Danger or obstruction in public way or line of navigation.—Whoever, by doing any act, or \n" +
            "by omitting to take order with any property in his possession or under his charge, causes danger, \n" +
            "obstruction or injury to any person in any public way or public line of navigation, shall be punished, with \n" +
            "fine which may extend to two hundred rupees.";
    String section_284 = "SECTION_284 : Negligent conduct with respect to poisonous substance.—Whoever does, with any poisonous \n" +
            "substance, any act in a manner so rash or negligent as to endanger human life, or to be likely to cause hurt \n" +
            "or injury to any person,\n" +
            "or knowingly or negligently omits to take such order with any poisonous substance in his possession \n" +
            "as is sufficient to guard against any probable danger to human life from such poisonous substance,\n" +
            "shall be punished with imprisonment of either description for a term which may extend to six months, \n" +
            "or with fine which may extend to one thousand rupees, or with both";
    String section_285 = "SECTION_285 : Negligent conduct with respect to fire or combustible matter.—Whoever does, with fire or \n" +
            "any combustible matter, any act so rashly or negligently as to endanger human life, or to be likely to \n" +
            "cause hurt or injury to any other person, \n" +
            "67\n" +
            "or knowingly or negligently omits to take such order with any fire or any combustible matter in his \n" +
            "possession as is sufficient to guard against any probable danger to human life from such fire or \n" +
            "combustible matter,\n" +
            "shall be punished with imprisonment of either description for a term which may extend to six months, \n" +
            "or with fine which may extend to one thousand rupees, or with both.\n";
    String section_286 = "SECTION_286 :  Negligent conduct with respect to explosive substance.—Whoever does, with any explosive \n" +
            "substance, any act so rashly or negligently as to endanger human life, or to be likely to cause hurt or \n" +
            "injury to any other person,\n" +
            "or knowingly or negligently omits to take such order with any explosive substance in his possession \n" +
            "as is sufficient to guard against any probable danger to human life from that substance,\n" +
            "shall be punished with imprisonment of either description for a term which may extend to six months, \n" +
            "or with fine which may extend to one thousand rupees, or with both.\n";
    String section_287 = "SECTION_287 : Negligent conduct with respect to machinery.—Whoever does, with any machinery, any act \n" +
            "so rashly or negligently as to endanger human life or to be likely to cause hurt or injury to any other \n" +
            "person,\n" +
            "or knowingly or negligently omits to take such order with any machinery in his possession or under \n" +
            "his care as is sufficient to guard against any probable danger to human life from such machinery,\n" +
            "shall be punished with imprisonment of either description for a term which may extend to six months, \n" +
            "or with fine which may extend to one thousand rupees, or with both.\n";
    String section_288 = "SECTION_288 : Negligent conduct with respect to pulling down or repairing buildings.—Whoever, in \n" +
            "pulling down or repairing any building, knowingly or negligently omits to take such order with that \n" +
            "building as is sufficient to guard against any probable danger to human life from the fall of that building, \n" +
            "or of any part thereof, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to six months, or with fine which may extend to one thousand rupees, or with both";
    String section_289 = "SECTION_289 : Negligent conduct with respect to animal.—Whoever knowingly or negligently omits to take \n" +
            "such order with any animal in his possession as is sufficient to guard against any probable danger to \n" +
            "human life, or any probable danger of grievous hurt from such animal, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to six months, or with fine which may \n" +
            "extend to one thousand rupees, or with both.";
    String section_290 = "SECTION_290 : Punishment for public nuisance in cases not otherwise provided for.—Whoever commits a \n" +
            "public nuisance in any case not otherwise punishable by this Code, shall be punished with fine which may \n" +
            "extend to two hundred rupees.\n";
    String section_291 = "SECTION_291 : Continuance of nuisance after injunction to discontinue.—Whoever repeats or continues a \n" +
            "public nuisance, having been enjoined by any public servant who has lawful authority to issue such \n" +
            "injunction not to repeat or continue such nuisance, shall be punished with simple imprisonment for a term \n" +
            "which may extend to six months, or with fine, or with both.";
    String section_292 = "SECTION_292 : Sale, etc., of obscene books, etc.—2\n" +
            "[(1) For the purposes of sub-section (2), a book, pamphlet, \n" +
            "paper, writing, drawing, painting, representation, figure or any other object, shall be deemed to be \n" +
            "obscene if it is lascivious or appeals to the prurient interest or if its effect, or (where it comprises two or \n" +
            "more distinct items) the effect of any one of its items, is, if taken as a whole, such as to tend to deprave \n" +
            "and corrupt persons who are likely, having regard to all relevant circumstances, to read, see or hear the \n" +
            "matter contained or embodied in it.]\n" +
            "3\n" +
            "[(2)] Whoever—\n" +
            "(a) sells, lets to hire, distributes, publicity exhibits or in any manner puts into circulation, or for \n" +
            "purposes of sale, hire, distribution, public exhibition or circulation, makes, produces or has in his possession any obscene book, pamphlet, paper, drawing, painting, representation or figure or any \n" +
            "other obscene object whatsoever, or\n" +
            "(b) imports, exports or conveys any obscene object for any of the purposes aforesaid, or knowing \n" +
            "or having reason to believe that such object will be sold, let to hire, distributed or publicly exhibited \n" +
            "or in any manner put into circulation, or\n" +
            "(c) takes part in or receives profits from any business in the course of which he knows or has \n" +
            "reason to believe that any such obscene objects are, for any of the purposes aforesaid, made, \n" +
            "produced, purchased, kept, imported, exported, conveyed, publicly exhibited or in any manner put \n" +
            "into circulation, or\n" +
            "(d) advertises or makes known by any means whatsoever that any person is engaged or is ready to \n" +
            "engage in any act which is an offence under this section, or that any such obscene object can be \n" +
            "procured from or through any person, or\n" +
            "(e) offers or attempts to do any act which is an offence under this section,\n" +
            "shall be punished 1\n" +
            "[on first conviction with imprisonment of either description for a term which may \n" +
            "extend to two years, and with fine which may extend to two thousand rupees, and, in the event of a \n" +
            "second or subsequent conviction, with imprisonment of either description for a term which may extend to \n" +
            "five years, and also with fine which may extend to five thousand rupees].\n" +
            "2\n" +
            "[Exception.—This section does not extend to—\n" +
            "(a) any book, pamphlet, paper, writing, drawing, painting, representation or figure—\n" +
            "(i) the publication of which is proved to be justified as being for the public good on the \n" +
            "ground that such book, pamphlet, paper, writing, drawing, painting, representation or figure is in \n" +
            "the interest of science, literature, art or learning or other objects of general concern, or\n" +
            "(ii) which is kept or used bona fide for religious purposes;\n" +
            "(b) any representation sculptured, engraved, painted or otherwise represented on or in—\n" +
            "(i) any ancient monument within the meaning of the Ancient Monuments and Archaeological \n" +
            "Sites and Remains Act, 1958 (24 of 1958), or \n" +
            "(ii) any temple, or on any car used for the conveyance of idols, or kept or used for any \n" +
            "religious purpose.]]";
    String section_293 = "SECTION_293 : Sale, etc., of obscene objects to young person.—Whoever sells, lets to hire, distributes, \n" +
            "exhibits or circulates to any person under the age of twenty years any such obscene object as is referred to \n" +
            "in the last preceding section, or offers or attempts so to do, shall be punished 1\n" +
            "[on first conviction with \n" +
            "imprisonment of either description for a term which may extend to three years, and with fine which may \n" +
            "extend to two thousand rupees, and, in the event of a second or subsequent conviction, with imprisonment \n" +
            "of either description for a term which may extend to seven years, and also with fine which may extend to \n" +
            "five thousand rupees";
    String section_294 = "SECTION_294 : . Obscene acts and songs.—Whoever, to the annoyance of others,\n" +
            "(a) does any obscene act in any public place, or\n" +
            "(b) sings, recites or utters any obscene song, ballad or words, in or near any public place,\n" +
            "shall be punished with imprisonment of either description for a term which may extend to three months, \n" +
            "or with fine, or with both.";
    String section_294A = "SECTION_294A : Keeping lottery office.—Whoever keeps any office or place for the purpose of drawing any \n" +
            "lottery 6\n" +
            "[not being 7\n" +
            "[a State lottery] or a lottery authorised by the 8\n" +
            "[State] Government], shall be punished punished with imprisonment of either description for a term which may extend to six months, or with \n" +
            "fine, or with both.\n" +
            "And whoever publishes any proposal to pay any sum, or to deliver any goods, or to do or forbear \n" +
            "doing anything for the benefit of any person, on any event or contingency relative or applicable to the \n" +
            "drawing of any ticket, lot, number or figure in any such lottery, shall be punished with fine which may \n" +
            "extend to one thousand rupees.]\n";
    //  CHAPTER XV
    //OF OFFENCESRELATING TO RELIGION
    String section_295 = "SECTION_295 : Injuring or defiling place of worship, with intent to insult the religion of any class.—\n" +
            "Whoever destroys, damages or defiles any place of worship, or any object held sacred by any class of \n" +
            "persons with the intention of thereby insulting the religion of any class of persons or with the knowledge \n" +
            "that any class of persons is likely to consider such destruction, damage or defilement as an insult to their \n" +
            "religion, shall be punished with imprisonment of either description for a term which may extend to two \n" +
            "years, or with fine, or with both";
    String section_295A ="SECTION-295A : . Deliberate and malicious acts, intended to outrage religious feelings of any class by \n" +
            "insulting its religion or religious beliefs.—Whoever, with deliberate and malicious intention of \n" +
            "outraging the religious feelings of any class of 2\n" +
            "[citizens of India], 3\n" +
            "[by words, either spoken or written, or \n" +
            "or by signs or by visible representations or otherwise], insults or attempts to insult the religion or the \n" +
            "religious beliefs of that class, shall be punished with imprisonment of either description for a term which \n" +
            "may extend to 4\n" +
            "[three years], or with fine, or with both.";
    String section_296 = "SECTION_296 : Disturbing religious assembly.—Whoever voluntarily causes disturbance to any assembly \n" +
            "lawfully engaged in the performance of religious worship, or religious ceremonies, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to one year, or with fine, or with both.";
    String section_297 = "SECTION_297 : Trespassing on burial places, etc.—Whoever, with the intention of wounding the feelings of \n" +
            "any person, or of insulting the religion of any person or with the knowledge that the feelings of any \n" +
            "person are likely to be wounded, or that the religion of any person is likely to be insulted thereby,\n" +
            "commits any trespass in any place of worship or on any place of sepulture, or any place set apart for \n" +
            "the performance of funeral rites or as a depository for the remains of the dead, or offers any indignity to \n" +
            "any human corpse, or causes disturbance to any persons assembled for the performance of funeral \n" +
            "ceremonies,\n" +
            "shall be punished with imprisonment of either description for a term which may extend to one year, or \n" +
            "with fine, or with both.";
    String section_298 = "SECTION_298 : . Uttering words, etc., with deliberate intent to wound religious feelings.—Whoever, with the \n" +
            "deliberate intention of wounding the religious feelings of any person, utters any word or makes any sound \n" +
            "in the hearing of that person or makes any gesture in the sight of that persons or places any object in the \n" +
            "sight of that person, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to one year, or with fine, or with both";
    // CHAPTER XVI
    //OF OFFENCESAFFECTINGTHE HUMAN BODY
    //Of offences affecting life
    String section_299 = "SECTION_299 : . Culpable homicide.—Whoever causes death by doing an act with the intention of causing \n" +
            "death, or with the intention of causing such bodily injury as is likely to cause death, or with the \n" +
            "knowledge that he is likely by such act to cause death, commits the offence of culpable homicide" +
            "Explanation 1.—A person who causes bodily injury to another who is labouring under a disorder, \n" +
            "disease or bodily infirmity, and thereby accelerates the death of that other, shall be deemed to have caused \n" +
            "his death.\n" +
            "Explanation 2.—Where death is caused by bodily injury, the person who causes such bodily injury \n" +
            "shall be deemed to have caused the death, although by resorting to proper remedies and skilful treatment \n" +
            "the death might have been prevented.\n" +
            "Explanation 3.—The causing of the death of a child in the mother's womb is not homicide. But it may \n" +
            "amount to culpable homicide to cause the death of a living child, if any part of that child has been brought \n" +
            "forth, though the child may not have breathed or been completely born.";
    String section_300 = "SECTION_300 : . Murder.—Except in the cases hereinafter excepted, culpable homicide is murder, if the act by \n" +
            "which the death is caused is done with the intention of causing death, or—\n" +
            "2ndly.—If it is done with the intention of causing such bodily injury as the offender knows to be \n" +
            "likely to cause the death of the person to whom the harm is caused, or—\n" +
            "3rdly.—If it is done with the intention of causing bodily injury to any person and the bodily injury \n" +
            "intended to be inflicted is sufficient in the ordinary course of nature to cause death, or—\n" +
            "4thly.—If the person committing the act knows that it is so imminently dangerous that it must, in all \n" +
            "probability, cause death, or such bodily injury as is likely to cause death, and commits such act without \n" +
            "any excuse for incurring the risk of causing death or such injury as aforesaid." +
            "Exception 1.—When culpable homicide is not murder.—Culpable homicide is not murder if the \n" +
            "offender, whilst deprived of the power of self-control by grave and sudden provocation, causes the death \n" +
            "of the person who gave the provocation or causes the death of any other person by mistake or accident.\n" +
            "The above exception is subject to the following provisos:—\n" +
            "First.—That the provocation is not sought or voluntarily provoked by the offender as an excuse for \n" +
            "killing or doing harm to any person.\n" +
            "Secondly.—That the provocation is not given by anything done in obedience to the law, or by a public \n" +
            "servant in the lawful exercise of the powers of such public servant.\n" +
            "Thirdly.—That the provocation is not given by anything done in the lawful exercise of the right of \n" +
            "private defence" +
            "Explanation.—Whether the provocation was grave and sudden enough to prevent the offence from \n" +
            "amounting to murder is a question of fact.";
    String section_301 = "SECTION_301 :  Culpable homicide by causing death of person other than person whose death was \n" +
            "intended.—If a person, by doing anything which he intends or knows to be likely to cause death, \n" +
            "commits culpable homicide by causing the death of any person, whose death he neither intends nor knows \n" +
            "himself to be likely to cause, the culpable homicide committed by the offender is of the description of \n" +
            "which it would have been if he had caused the death of the person whose death he intended or knew\n" +
            "himself to he likely to cause";
    String section_302 = "SECTION_302 : Punishment for murder.—Whoever commits murder shall be punished with death or \n" +
            "1\n" +
            "[imprisonment for life], and shall also be liable to fine.";
    String section_303 = "SECTION_303 : Punishment for murder by life-convict.—Whoever, being under sentence of 1\n" +
            "[imprisonment \n" +
            "for life], commits murder, shall be punished with death.";
    String section_304 = "SECTION_304 : Punishment for culpable homicide not amounting to murder.—Whoever commits culpable \n" +
            "homicide not amounting to murder, shall be punished with 1\n" +
            "[imprisonment for life], or imprisonment of \n" +
            "either description for a term which may extend to ten years, and shall also be liable to fine, if the act by \n" +
            "which the death is caused is done with the intention of causing death, or of causing such bodily injury as \n" +
            "is likely to cause death;\n" +
            "or with imprisonment of either description for a term which may extend to ten years, or with fine, or \n" +
            "with both, if the act is done with the knowledge that it is likely to cause death, but without any intention \n" +
            "to cause death, or to cause such bodily injury as is likely to cause death.";
    String section_304A = "SECTION_304A :  Causing death by negligence.—Whoever causes the death of any person by doing any rash \n" +
            "or negligent act not amounting to culpable homicide, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to two years, or with fine, or with both.";
    String section_304B = "SECTION_304B : Dowry death.—(1) Where the death of a woman is caused by any burns or bodily injury or \n" +
            "occurs otherwise than under normal circumstances within seven years of her marriage and it is shown that \n" +
            "soon before her death she was subjected to cruelty or harassment by her husband or any relative of her \n" +
            "husband for, or in connection with, any demand for dowry, such death shall be called “dowry death”, and \n" +
            "such husband or relative shall be deemed to have caused her death.\n" +
            "Explanation.—For the purposes of this sub-section, “dowry” shall have the same meaning as in \n" +
            "section 2 of the Dowry Prohibition Act, 1961 (28 of 1961).\n" +
            "(2) Whoever commits dowry death shall be punished with imprisonment for a term which shall not be \n" +
            "less than seven years but which may extend to imprisonment for life.";
    String section_305 = "SECTION_305 : Abetment of suicide of child or insane person.—If any person under eighteen years of age, \n" +
            "any insane person, any delirious person, any idiot, or any person in a state of intoxication, commits \n" +
            "suicide, whoever abets the commission of such suicide, shall be punished with death or 1\n" +
            "[imprisonment \n" +
            "for life], or imprisonment for a term not exceeding ten years, and shall also be liable to fine.\n";
    String section_306 = "SECTION_306 : Abetment of suicide.—If any person commits suicide, whoever abets the commission of such \n" +
            "suicide, shall be punished with imprisonment of either description for a term which may extend to ten \n" +
            "years, and shall also be liable to fine";
    String section_307 = "SECTION_307 : Attempt to murder.—Whoever does any act with such intention or knowledge, and under such \n" +
            "circumstances that, if he by that act caused death, he would be guilty of murder, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \n" +
            "fine; and if hurt is caused to any person by such act, the offender shall be liable either to 1\n" +
            "[imprisonment \n" +
            "for life], or to such punishment as is hereinbefore mentioned.\n" +
            "Attempts by life-convicts.—4\n" +
            "[When any person offending under this section is under sentence of \n" +
            "1\n" +
            "[imprisonment for life], he may, if hurt is caused, be punished with death.]";
    String section_308 = "SECTION_308 : Attempt to commit culpable homicide.—Whoever does any act with such intention or \n" +
            "knowledge and under such circumstances that, if he by that act caused death, he would be guilty of \n" +
            "culpable homicide not amounting to murder, shall be punished with imprisonment of either description \n" +
            "for a term which may extend to three years, or with fine, or with both; and, if hurt is caused to any person \n" +
            "by such act, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "seven years, or with fine, or with both";
    String section_309 = "SECTION_309 : Attempt to commit suicide.—Whoever attempts to commit suicide and does any act towards \n" +
            "the commission of such offence, shall be punished with simple imprisonment for a term which may \n" +
            "extend to one year 2\n" +
            "[or with fine, or with both.";
    String section_310 = "SECTION_310 : Thug.—Whoever, at any time after the passing of this Act, shall have been habitually associated \n" +
            "with any other or others for the purpose of committing robbery or child-stealing by means of or \n" +
            "accompanied with murder, is a thug.";
    String section_311 = "SECTION_311 : Punishment.—Whoever is a thug, shall be punished with 3\n" +
            "[imprisonment for life], and shall also \n" +
            "be liable to fine";
    String section_312 = "SECTION_312 : . Causing miscarraige.—Whoever voluntarily causes a woman with child to miscarry, shall, if \n" +
            "such miscarriage be not caused in good faith for the purpose of saving the life of the woman, be punished \n" +
            "with imprisonment of either description for a term which may extend to three years, or with fine, or with \n" +
            "both; and, if the woman be quick with child, shall be punished with imprisonment of either description for \n" +
            "a term which may extend to seven years, and shall also be liable to fine";
    String section_313 = "SECTION_313 : . Causing miscarriage without woman's consent.—Whoever commits the offence defined in \n" +
            "the last preceding section without the consent of the woman, whether the woman is quick with child or \n" +
            "not, shall be punished with 3\n" +
            "[imprisonment for life], or with imprisonment of either description for a term \n" +
            "which may extend to ten years, and shall also be liable to fine. ";
    String section_314 = "SECTION_314 : Death caused by act done with intent to cause miscarriage.—Whoever, with intent to cause \n" +
            "the miscarriage of a woman with child, does any act which causes the death of such woman, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \n" +
            "be liable to fine;\n" +
            "if act done without woman's consent.—and if the act is done without the consent of the woman, \n" +
            "shall be punished either with 3\n" +
            "[imprisonment for life], or with the punishment above mentioned.\n" +
            "Explanation.—It is not essential to this offence that the offender should know that the act is likely to \n" +
            "cause death.";
    String section_315 = "SECTION_315 : Act done with intent to prevent child being born alive or to cause it to die after birth.—\n" +
            "Whoever before the birth of any child does any act with the intention of thereby preventing that child \n" +
            "from being born alive or causing it to die after its birth, and does by such act prevent that child from being born alive, or causes it to die after its birth, shall, if such act be not caused in good faith for the purpose of \n" +
            "saving the life of the mother, be punished with imprisonment of either description for a term which may \n" +
            "extend to ten years, or with fine, or with both.";
    String section_316 = "SECTION_316 : Causing death of quick unborn child by act amounting to culpable homicide.—Whoever \n" +
            "does any act under such circumstances, that if he thereby caused death he would be guilty of culpable \n" +
            "homicide, and does by such act cause the death of a quick unborn child, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \n" +
            "fine.";
    String section_317 = "SECTION_317 : Exposure and abandonment of child under twelve years, by parent or person having care\n" +
            "of it.—Whoever being the father or mother of a child under the age of twelve years, or having the care of \n" +
            "such child, shall expose or leave such child in any place with the intention of wholly abandoning such \n" +
            "child, shall be punished with imprisonment of either description for a term which may extend to seven \n" +
            "years, or with fine, or with both.\n";
    String section_318 = "SECTION_318 :  Concealment of birth by secret disposal of dead body.—Whoever, by secretly burying or \n" +
            "otherwise disposing of the dead body of a child whether such child die before or after or during its birth, \n" +
            "intentionally conceals or endeavors to conceal the birth of such child, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to two years, or with fine, or with both.\n" +
            "Of Hurt";
    String section_319 = "SECTION_319 : Hurt.—Whoever causes bodily pain, disease or infirmity to any person is said to cause hurt";
    String section_320 = "SECTION_320 : Grievous hurt.—The following kinds of hurt only are designated as “grievous”:—\n" +
            "First.—Emasculation.\n" +
            "Secondly.—Permanent privation of the sight of either eye.\n" +
            "Thirdly.—Permanent privation of the hearing of either ear.\n" +
            "Fourthly.—Privation of any member or joint.\n" +
            "Fifthly.—Destruction or permanent impairing of the powers of any member or joint.\n" +
            "Sixthly.—Permanent disfiguration of the head or face.\n" +
            "Seventhly.—Fracture or dislocation of a bone or tooth.\n" +
            "Eighthly.—Any hurt which endangers life or which causes the sufferer to be during the space of \n" +
            "twenty days in severe bodily pain, or unable to follow his ordinary pursuits";
    String section_321 = "SECTION_321 : Voluntarily causing hurt.—Whoever does any act with the intention of thereby causing hurt to \n" +
            "any person, or with the knowledge that he is likely thereby to cause hurt to any person, and does thereby \n" +
            "cause hurt to any person, is said “voluntarily to cause hurt”";
    String section_322 = "SECTION_322 : Voluntarily causing grievous hurt.—Whoever voluntarily causes hurt, if the hurt which he \n" +
            "intends to cause or knows himself to be likely to cause is grievous hurt, and if the hurt which he causes is \n" +
            "grievous hurt, is said “voluntarily to cause grievous hurt" +
            "Explanation.—A person is not said voluntarily to cause grievous hurt except when he both causes \n" +
            "grievous hurt and intends or knows himself to be likely to cause grievous hurt. But he is said voluntarily \n" +
            "to cause grievous hurt, if intending or knowing himself to be likely to cause grievous hurt of one kind, he \n" +
            "actually causes grievous hurt of another kind.\n”";
    String section_323 = "SECTION_323 : Punishment for voluntarily causing hurt.—Whoever, except in the case provided for by \n" +
            "section 334, voluntarily causes hurt, shall be punished with imprisonment of either description for a term \n" +
            "which may extend to one year, or with fine which may extend to one thousand rupees, or with both";
    String section_324 = "SECTION_324 : Voluntarily causing hurt by dangerous weapons or means.—Whoever, except in the case \n" +
            "provided for by section 334, voluntarily causes hurt by means of any instrument for shooting, stabbing or \n" +
            "cutting, or any instrument which, used as a weapon of offence, is likely to cause death, or by means of fire \n" +
            "or any heated substance, or by means of any poison or any corrosive substance, or by means of any \n" +
            "explosive substance or by means of any substance which it is deleterious to the human body to inhale, to \n" +
            "swallow, or to receive into the blood, or by means of any animal, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to three years, or with fine, or with both.";
    String section_325 = "SECTION_325 : Punishment for voluntarily causing grievous hurt.—Whoever, except in the case provided for \n" +
            "by section 335, voluntarily causes grievous hurt, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to seven years, and shall also be liable to fine";
    String section_326 = "SECTION_326 : Voluntarily causing grievous hurt by dangerous weapons or means.—Whoever, except in \n" +
            "the case provided for by section 335, voluntarily causes grievous hurt by means of any instrument for \n" +
            "shooting, stabbing or cutting, or any instrument which, used as a weapon of offence, is likely to cause \n" +
            "death, or by means of fire or any heated substance, or by means of any poison or any corrosive substance, \n" +
            "or by means of any explosive substance, or by means of any substance which it is deleterious to the \n" +
            "human body to inhale, to swallow, or to receive into the blood, or by means of any animal, shall be \n" +
            "punished with 1\n" +
            "[imprisonment for life], or with imprisonment of either description for a term which may \n" +
            "extend to ten years, and shall also be liable to fine.";
    String section_326A ="SECTION_326A : Voluntarily causing grievous hurt by use of acid, etc.—Whoever causes permanent or \n" +
            "partial damage or deformity to, or burns or maims or disfigures or disables, any part or parts of the body \n" +
            "of a person or causes grievous hurt by throwing acid on or by administering acid to that person, or by \n" +
            "using any other means with the intention of causing or with the knowledge that he is likely to cause such \n" +
            "injury or hurt, shall be punished with imprisonment of either description for a term which shall not be less \n" +
            "than ten years but which may extend to imprisonment for life, and with fine:\n" +
            "Provided that such fine shall be just and reasonable to meet the medical expenses of the treatment of \n" +
            "the victim:\n" +
            "Provided further that any fine imposed under this section shall be paid to the victim.";
    String section_326B ="SECTION_326B : Voluntarily throwing or attempting to throw acid.—Whoever throws or attempts to throw \n" +
            "acid on any person or attempts to administer acid to any person, or attempts to use any other means, with \n" +
            "the intention of causing permanent or partial damage or deformity or burns or maiming or disfigurement \n" +
            "or disability or grievous hurt to that person, shall be punished with imprisonment of either description for \n" +
            "a term which shall not be less than five years but which may extend to seven years, and shall also be \n" +
            "liable to fine.\n" +
            "Explanation 1.—For the purposes of section 326A and this section, \"acid\" includes any substance \n" +
            "which has acidic or corrosive character or burning nature, that is capable of causing bodily injury leading \n" +
            "to scars or disfigurement or temporary or permanent disability.\n" +
            "Explanation 2.—For the purposes of section 326A and this section, permanent or partial damage or \n" +
            "deformity shall not be required to be irreversible";
    String section_327 = "SECTION_327 : Voluntarily causing hurt to extort property, or to constrain to an illegal to an act.—\n" +
            "Whoever voluntarily causes hurt, for the purpose of extorting from the sufferer, or from any person \n" +
            "interested in the sufferer, any property or valuable security, or of constraining the sufferer or any person \n" +
            "interested in such sufferer to do anything which is illegal or which may facilitate the commission of an offence, shall be punished with imprisonment of either description for a term which may extend to ten \n" +
            "years, and shall also be liable to fine";
    String section_328 = "SECTION_328 : Causing hurt by means of poison, etc., with intent to commit and offence.—Whoever \n" +
            "administers to or causes to be taken by any person any poison or any stupefying, intoxicating or \n" +
            "unwholesome drug, or other thing with intent to cause hurt to such person, or with intent to commit or to \n" +
            "facilitate the commission of an offence or knowing it to be likely that he will thereby cause hurt, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \n" +
            "be liable to fine. ";
    String section_329 = "SECTION_329 : Voluntarily causing grievous hurt to extort property, or to constrain to an illegal act.—\n" +
            "Whoever voluntarily causes grievous hurt for the purpose of extorting from the sufferer or from any \n" +
            "person interested in the sufferer any property or valuable security, or of constraining the sufferer or any \n" +
            "person interested in such sufferer to do anything that is illegal or which may facilitate the commission of \n" +
            "an offence, shall be punished with 1\n" +
            "[imprisonment for life], or imprisonment of either description for a \n" +
            "term which may extend to ten years, and shall also be liable to fine.";
    String section_330 = "SECTION_330 : Voluntarily causing hurt to extort confession, or to compel restoration of property.—\n" +
            "Whoever voluntarily causes hurt, for the purpose of extorting from the sufferer or from any person \n" +
            "interested in the sufferer, any confession or any information which may lead to the detection of an offence \n" +
            "or misconduct, or for the purpose of constraining the sufferer or any person interested in the sufferer to \n" +
            "restore or to cause the restoration of any property or valuable security or to satisfy any claim or demand, \n" +
            "or to give information which may lead to the restoration of any property or valuable security, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to seven years, and shall \n" +
            "also be liable to fine";
    String section_331 = "SECTION_331 : Voluntarily causing grievous hurt to extort confession, or to compel restoration of \n" +
            "property.—Whoever voluntarily causes grievous hurt for the purpose of extorting from the sufferer or \n" +
            "from any person interested in the sufferer any confession or any information which may lead to the \n" +
            "detection of an offence or misconduct, or for the purpose of constraining the sufferer or any person \n" +
            "interested in the sufferer to restore or to cause the restoration of any property or valuable security, or to \n" +
            "satisfy any claim or demand or to give information which may lead to the restoration of any property or \n" +
            "valuable security, shall be punished with imprisonment of either description for a term which may extend \n" +
            "to ten years, and shall also be liable to fine.";
    String section_332 = "SECTION_332 : Voluntarily causing hurt to deter public servant from his duty.—Whoever voluntarily causes \n" +
            "hurt to any person being a public servant in the discharge of his duty as such public servant, or with intent \n" +
            "to prevent or deter that person or any other public servant from discharging his duty as such public \n" +
            "servant or in consequence of anything done or attempted to be done by that person in the lawful discharge \n" +
            "of his duty as such public servant, shall be punished with imprisonment of either description for a term \n" +
            "which may extend to three years, or with fine, or with both.";
    String section_333 = "SECTION_333 : Voluntarily causing grievous hurt to deter public servant from his duty.—Whoever \n" +
            "voluntarily causes grievous hurt to any person being a public servant in the discharge of his duty as such \n" +
            "public servant, or with intent to prevent or deter that person or any other public servant from discharging \n" +
            "his duty as such public servant, or in consequence of anything done or attempted to be done by that \n" +
            "person in the lawful discharge of his duty as such public servant, shall be punished with imprisonment of \n" +
            "either description for a term which may extend to ten years, and shall also be liable to fine.";
    String section_334 = "SECTION_334 : Voluntarily causing hurt on provocation.—Whoever voluntarily causes hurt on grave and \n" +
            "sudden provocation, if he neither intends nor knows himself to be likely to cause hurt to any person other \n" +
            "than the person who gave the provocation, shall be punished with imprisonment of either description for a \n" +
            "term which may extend to one month, or with fine which may extend to five hundred rupees, or with both.";
    String section_335 = "SECTION_335 : Voluntarily causing grievous hurt on provocation.—Whoever 1\n" +
            "[voluntarily] causes grievous \n" +
            "hurt on grave and sudden provocation, if he neither intends nor knows himself to be likely to cause \n" +
            "grievous hurt to any person other than the person who gave the provocation, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to four years, or with fine which may\n" +
            "extend to two thousand rupees, or with both. \n" +
            "Explanation.—The last two sections are subject to the same provisos as Exception 1, section 300.";
    String section_336 = "SECTION_336 :  Act endangering life or personal safety of others.—Whoever does any act so rashly or \n" +
            "negligently as to endanger human life or the personal safety of others, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to three months or with fine which may \n" +
            "extend to two hundred and fifty rupees, or with both";
    String section_337 = "SECTION_337 : Causing hurt by act endangering life or personal safety of others.—Whoever causes hurt to \n" +
            "any person by doing any act so rashly or negligently as to endanger human life, or the personal safety of \n" +
            "others, shall be punished with imprisonment of either description for a term which may extend to six \n" +
            "months, or with fine which may extend to five hundred rupees, or with both.\n";
    String section_338 = "SECTION_338 : Causing grievous hurt by act endangering life or personal safety of others.—Whoever \n" +
            "causes grievous hurt to any person by doing any act so rashly or negligently as to endanger human life, or \n" +
            "the personal safety of others, shall be punished with imprisonment of either description for a term which \n" +
            "may extend to two years, or with fine which may extend to one thousand rupees, or with both";
    String section_339 = "SECTION_339 :  Wrongful restraint.—Whoever voluntarily obstructs any person so as to prevent that person \n" +
            "from proceeding in any direction in which that person has a right to proceed, is said wrongfully to restrain \n" +
            "that person.\n" +
            "Exception.—The obstruction of a private way over land or water which a person in good faith \n" +
            "believes himself to have a lawful right to obstruct, is not an offence within the meaning of this section.\n";
    String section_340 = "SECTION_340 : Wrongful confinement.—Whoever wrongfully restrains any person in such a manner as to \n" +
            "prevent that person from proceedings beyond certain circumscribing limits, is said “wrongfully to \n" +
            "confine” that person";
    String section_341 = "SECTION_341 : Punishment for wrongful restraint.—Whoever wrongfully restrains any person shall be \n" +
            "punished with simple imprisonment for a term which may extend to one month, or with fine which may \n" +
            "extend to five hundred rupees, or with both";
    String section_342 = "SECTION_342 : Punishment for wrongful confinement.—Whoever wrongfully confines any person shall be \n" +
            "punished with imprisonment of either description for a term which may extend to one year, or with fine \n" +
            "which may extend to one thousand rupees, or with both.";
    String section_343 = "SECTION_343 : Wrongful confinement for three or more days.—Whoever wrongfully confines any person for \n" +
            "three days, or more, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to two years, or with fine, or with both.";
    String section_344 = "SECTION_344 : Wrongful confinement for ten or more days.—Whoever wrongfully confines any person for \n" +
            "ten days, or more, shall be punished with imprisonment of either description for a term which may extend \n" +
            "to three years, and shall also be liable to fine";
    String section_345 = "SECTION_345 : Wrongful confinement of person for whose liberation writ has been issued.—Whoever \n" +
            "keeps any person in wrongful confinement, knowing that a writ for the liberation of that person has been \n" +
            "duly issued, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "two years in addition to any term of imprisonment to which he may be liable under any other section of \n" +
            "this Chapter";
    String section_346 = "SECTION_346 : Wrongful confinement in secret.—Whoever wrongfully confines any person in such manner as \n" +
            "to indicate an intention that the confinement of such person may not be known to any person interested in \n" +
            "the person so confined, or to any public servant, or that the place of such confinement may not be known \n" +
            "to or discovered by any such person or public servant as hereinbefore mentioned, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to two years in addition to any other \n" +
            "punishment to which he may be liable for such wrongful confinement";
    String section_347 = "SECTION_347 : Wrongful confinement to extort property, or constrain to illegal act.—Whoever wrongfully \n" +
            "confines any person for the purpose of extorting from the person confined, or from any person interested \n" +
            "in the person confined, any property or valuable security or of constraining the person confined or any \n" +
            "person interested in such person to do anything illegal or to give any information which may facilitate the \n" +
            "commission of an offence, shall be punished with imprisonment of either description for a term which \n" +
            "may extend to three years, and shall also be liable to fine";
    String section_348 = "SECTION_348 : Wrongful confinement to extort confession, or compel restoration of property.—Whoever \n" +
            "wrongfully confines any person for the purpose of extorting from the person confined or any person \n" +
            "interested in the person confined any confession or any information which may lead to the detection of an \n" +
            "offence or misconduct, or for the purpose of constraining the person confined or any person interested in \n" +
            "the person confined to restore or to cause the restoration of any property or valuable security or to satisfy \n" +
            "any claim or demand, or to give information which may lead to the restoration of any property or valuable \n" +
            "security, shall be punished with imprisonment of either description for a term which may extend to three \n" +
            "years, and shall also be liable to fine";
    String section_349 = "SECTION_349 : Force.—A person is said to use force to another if he causes motion, change of motion, or \n" +
            "cessation of motion to that other, or if he causes to any substance such motion, or change of motion, or \n" +
            "cessation of motion as brings that substance into contact with any part of that other's body, or with \n" +
            "anything which that other is wearing or carrying, or with anything so situated that such contact affects that \n" +
            "other's sense of feeling: Provided that the person causing the motion, or change of motion, or cessation of \n" +
            "motion, causes that motion, change of motion, or cessation of motion in one of the three ways hereinafter \n" +
            "described:\n" +
            "First.—By his own bodily power.\n" +
            "Secondly.—By disposing any substance in such a manner that the motion or change or cessation of \n" +
            "motion takes place without any further act on his part, or on the part of any other person.\n" +
            "Thirdly.—By inducing any animal to move, to change its motion, or to cease to move";
    String section_350 = "SECTION_350 : 0. Criminal force.—Whoever intentionally uses force to any person, without that person's consent, \n" +
            "in order to the committing of any offence, or intending by the use of such force to cause, or knowing it to \n" +
            "be likely that by the use of such force he will cause injury, fear or annoyance to the person to whom the \n" +
            "force is used, is said to use criminal force to that other.";
    String section_351 = "SECTION_351 :  Assault.—Whoever makes any gesture, or any preparation intending or knowing it to be likely \n" +
            "that such gesture or preparation will cause any person present to apprehend that he who makes that \n" +
            "gesture or preparation is about to use criminal force to that person, is said to commit an assault.\n" +
            "Explanation.—Mere words do not amount to an assault. But the words which a person uses may give \n" +
            "to his gestures or preparation such a meaning as may make those gestures or preparations amount to an \n" +
            "assault";
    String section_352 = "SECTION_352 : Punishment for assault or criminal force otherwise than on grave provocation.—Whoever \n" +
            "assaults or uses criminal force to any person otherwise than on grave and sudden provocation given by \n" +
            "that person, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "three months, or with fine which may extend to five hundred rupees, or with both.\n" +
            "Explanation.—Grave and sudden provocation will not mitigate the punishment for an offence under \n" +
            "this section, if the provocation is sought or voluntarily provoked by the offender as an excuse for the \n" +
            "offence, or\n" +
            "if the provocation is given by anything done in obedience to the law, or by a public servant, in the \n" +
            "lawful exercise of the powers of such public servant, or\n" +
            "if the provocation is given by anything done in the lawful exercise of the right of private defence.\n" +
            "Whether the provocation was grave and sudden enough to mitigate the offence, is a question of fact Explanation.—Grave and sudden provocation will not mitigate the punishment for an offence under \n" +
            "this section, if the provocation is sought or voluntarily provoked by the offender as an excuse for the \n" +
            "offence, or\n" +
            "if the provocation is given by anything done in obedience to the law, or by a public servant, in the \n" +
            "lawful exercise of the powers of such public servant, or\n" +
            "if the provocation is given by anything done in the lawful exercise of the right of private defence.\n" +
            "Whether the provocation was grave and sudden enough to mitigate the offence, is a question of fact";
    String section_353 = "SECTION_353 : Assault or criminal force to deter public servant from discharge of his duty.—Whoever \n" +
            "assaults or uses criminal force to any person being a public servant in the execution of his duty as such \n" +
            "public servant, or with intent to prevent or deter that person from discharging his duty as such public \n" +
            "servant, or in consequence of anything done or attempted to be done by such person to the lawful \n" +
            "80\n" +
            "discharge of his duty as such public servant, shall be punished with imprisonment of either description for \n" +
            "a term which may extend to two years, or with fine, or with both";
    String section_354 = "SECTION_354 : . Assault or criminal force to woman with intent to outrage her modesty.—Whoever assaults \n" +
            "or uses criminal force to any woman, intending to outrage or knowing it to be likely that he will there by \n" +
            "outrage her modesty, 1\n" +
            "[shall be punished with imprisonment of either description for a term which shall not be less \n" +
            "than one year but which may extend to five years, and shall also be liable to fine].";
    String section_354A = "SECTION_354A : Sexual harassment and punishment for sexual harassment.—(1) Aman committing any \n" +
            "of the following acts—\n" +
            "(i) physical contact and advances involving unwelcome and explicit sexual overtures; or\n" +
            "(ii) a demand or request for sexual favours; or\n" +
            "(iii) showing pornography against the will of a woman; or\n" +
            "(iv) making sexually coloured remarks, \n" +
            "shall be guilty of the offence of sexual harassment.\n" +
            "(2) Any man who commits the offence specified in clause (i) or clause (ii) or clause (iii) of \n" +
            "sub-section (1) shall be punished with rigorous imprisonment for a term which may extend to three years, \n" +
            "or with fine, or with both.\n" +
            "(3) Any man who commits the offence specified in clause (iv) of sub-section (1) shall be punished \n" +
            "with imprisonment of either description for a term which may extend to one year, or with fine, or with \n" +
            "both";
    String section_354B = "SECTION_354B : 354B. Assault or use of criminal force to woman with intent to disrobe.—Any man who assaults \n" +
            "or uses criminal force to any woman or abets such act with the intention of disrobing or compelling her to \n" +
            "be naked, shall be punished with imprisonment of either description for a term which shall not be less \n" +
            "than three years but which may extend to seven years, and shall also be liable to fine";
    String section_354C = "SECTION_354C : Voyeurism.—Any man who watches, or captures the image of a woman engaging in a private \n" +
            "act in circumstances where she would usually have the expectation of not being observed either by the \n" +
            "perpetrator or by any other person at the behest of the perpetrator or disseminates such image shall be \n" +
            "punished on first conviction with imprisonment of either description for a term which shall not be less \n" +
            "than one year, but which may extend to three years, and shall also be liable to fine, and be punished on a \n" +
            "second or subsequent conviction, with imprisonment of either description for a term which shall not be \n" +
            "less than three years, but which may extend to seven years, and shall also be liable to fine.\n" +
            "Explanation 1.—For the purpose of this section, “private act” includes an act of watching carried out \n" +
            "in a place which, in the circumstances, would reasonably be expected to provide privacy and where the \n" +
            "victim's genitals, posterior or breasts are exposed or covered only in underwear; or the victim is using a \n" +
            "lavatory; or the victim is doing a sexual act that is not of a kind ordinarily done in public.\n" +
            "Explanation 2.—Where the victim consents to the capture of the images or any act, but not to their \n" +
            "dissemination to third persons and where such image or act is disseminated, such dissemination shall be \n" +
            "considered an offence under this section" ;
    String section_354D = "SECTION_354D : . Stalking.—(1) Any man who—\n" +
            "(i) follows a woman and contacts, or attempts to contact such woman to foster personal \n" +
            "interaction repeatedly despite a clear indication of disinterest by such woman; or\n" +
            "(ii) monitors the use by a woman of the internet, email or any other form of electronic \n" +
            "communication,\n" +
            "commits the offence of stalking:\n" +
            "Provided that such conduct shall not amount to stalking if the man who pursued it proves that—\n" +
            "(i) it was pursued for the purpose of preventing or detecting crime and the man accused of \n" +
            "stalking had been entrusted with the responsibility of prevention and detection of crime by the \n" +
            "State; or\n" +
            "(ii) it was pursued under any law or to comply with any condition or requirement imposed by \n" +
            "any person under any law; or\n" +
            "(iii) in the particular circumstances such conduct was reasonable and justified.\n" +
            "(2) Whoever commits the offence of stalking shall be punished on first conviction with imprisonment \n" +
            "of either description for a term which may extend to three years, and shall also be liable to fine; and be \n" +
            "punished on a second or subsequent conviction, with imprisonment of either description for a term which \n" +
            "may extend to five years, and shall also be liable to fine.";
    String section_355 = "SECTION_355 : Assault or criminal force with intent to dishonour person, otherwise than on grave \n" +
            "provocation. —Whoever assaults or uses criminal force to any person, intending thereby to dishonour \n" +
            "that person, otherwise than on grave and sudden provocation given by that person, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to two years, or with fine, or with both. ";
    String section_356 = "SECTION_356 : Assault or criminal force in attempt to commit theft of property carried by a person.—\n" +
            "Whoever assaults or uses criminal force to any person, in attempting to commit theft on any property \n" +
            "which that person is then wearing or carrying, shall be punished with imprisonment of either description \n" +
            "for a term which may extend to two years, or with fine, or with both.\n";
    String section_357 = "SECTION_357 : Assault or criminal force in attempt wrongfully to confine a person.—Whoever assaults or \n" +
            "uses criminal force to any person, in attempting wrongfully to confine that person, shall be punished with \n" +
            "imprisonment of either description for a term which may extend to one year, or with fine which may \n" +
            "extend to one thousand rupees, or with both";
    String section_358 = "SECTION_358 :  Assault or criminal force on grave provocation.—Whoever assaults or uses criminal force to \n" +
            "any person on grave and sudden provocation given by that person, shall be punished with simple \n" +
            "imprisonment for a term which may extend to one month, or with fine which may extend to two hundred \n" +
            "rupees, or with both.\n" +
            "Explanation.—The last section is subject to the same Explanation as section 352.\n" +
            "Of Kidnapping, Abduction, Slavery and Forced Labour";
    String section_359 = "SECTION_359 : Kidnapping.—Kidnapping is of two kinds: kidnapping from 1\n" +
            "[India], and kidnapping from \n" +
            "lawful guardianship";
    String section_360 = "SECTION_360 : Kidnapping from India.—Whoever conveys any person beyond the limits of 1\n" +
            "[India] without \n" +
            "the consent of that person, or of some person legally authorised to consent on behalf of that person, is said \n" +
            "to kidnap that person from 1\n" +
            "[India].";
    String section_361 = "SECTION_361 : Kidnapping from lawful guardianship.—Whoever takes or entices any minor under 2\n" +
            "[sixteen] \n" +
            "years of age if a male, or under 3\n" +
            "[eighteen] years of age if a female, or any person of unsound mind, out of \n" +
            "the keeping of the lawful guardian of such minor or person of unsound mind, without the consent of such \n" +
            "guardian, is said to kidnap such minor or person from lawful guardianship.\n" +
            "Explanation.—The words “lawful guardian” in this section include any person lawfully entrusted \n" +
            "with the care or custody of such minor or other person.\n" +
            "Exception.—This section does not extend to the act of any person who in good faith believes himself \n" +
            "to be the father of an illegitimate child, or who in good faith believes himself to be entitled to the lawful \n" +
            "custody of such child, unless such act is committed for an immoral or unlawful purpose";
    String section_362 = "SECTION_362 : . Abduction.—Whoever by force compels, or by any deceitful means induces, any person to go \n" +
            "from any place, is said to abduct that person";
    String section_363 = "SECTION_363 : Punishment for kidnapping.—Whoever kidnaps any person from 1\n" +
            "[India] or from lawful \n" +
            "guardianship, shall be punished with imprisonment of either description for a term which may extend to \n" +
            "seven years, and shall also be liable to fine";
    String section_363A = "SECTION_363A : Kidnapping or maiming a minor for purposes of begging.—(1) Whoever kidnaps any \n" +
            "minor or, not being the lawful guardian of a minor, obtains the custody of the minor, in order that such \n" +
            "minor may be employed or used for the purposes of begging shall be punishable with imprisonment of \n" +
            "either description for a term which may extend to ten years, and shall also be liable to fine.\n" +
            "(2) Whoever maims any minor in order that such minor may be employed or used for the purposes of \n" +
            "begging shall be punishable with imprisonment for life, and shall also be liable to fine.\n" +
            "(3) Where any person, not being the lawful guardian of a minor, employs or uses such minor for the \n" +
            "purposes of begging, it shall be presumed, unless the contrary is proved, that he kidnapped or otherwise \n" +
            "obtained the custody of that minor in order that the minor might be employed or used for the purposes of \n" +
            "begging.\n" +
            "(4) In this section,—\n" +
            "(a) “begging” means—\n" +
            "(i) soliciting or receiving alms in a public place, whether under the pretence of singing, \n" +
            "dancing, fortunetelling, performing tricks or selling articles or otherwise;\n" +
            "(ii) entering on any private premises for the purpose of soliciting or receiving alms;\n" +
            "(iii) exposing or exhibiting, with the object of obtaining or extorting alms, any sore, wound, \n" +
            "injury, deformity or disease, whether of himself or of any other person or of an animal;\n" +
            "(iv) using a minor as an exhibit for the purpose of soliciting or receiving alms;\n" +
            "(b) “minor” means—\n" +
            "(i) in the case of a male, a person under sixteen years of age; and\n" +
            "(ii) in the case of a female, a person under eighteen years of age.";
    String section_364 = "SECTION_364 : Kidnapping or abducting in order to murder.—Whoever kidnaps or abducts any person in \n" +
            "order that such person may be murdered or may be so disposed of as to be put in danger of being \n" +
            "murdered, shall be punished with 3\n" +
            "[imprisonment for life] or rigorous imprisonment for a term which may \n" +
            "extend to ten years, and shall also be liable to fine";
    String section_365 = "SECTION_365 : . Kidnapping or abducting with intent secretly and wrongfully to confine person.—Whoever \n" +
            "kidnaps or abducts any person with intent to cause that person to be secretly and wrongfully confined, \n" +
            "shall be punished with imprisonment of either description for a term which may extend to seven years, \n" +
            "and shall also be liable to fine";
    String section_366 = "SECTION_366 : Kidnapping, abducting or inducing woman to compel her marriage, etc.—Whoever kidnaps \n" +
            "or abducts any woman with intent that she may be compelled, or knowing it to be likely that she will be \n" +
            "compelled, to marry any person against her will, or in order that she may be forced or seduced to illicit \n" +
            "intercourse, or knowing it to be likely that she will be forced or seduced to illicit intercourse, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \n" +
            "be liable to fine; 1\n" +
            "[and whoever, by means of criminal intimidation as defined in this Code or of abuse of \n" +
            "authority or any other method of compulsion, induces any woman to go from any place with intent that \n" +
            "she may be, or knowing that it is likely that she will be, forced or seduced to illicit intercourse with \n" +
            "another person shall also be punishable as aforesaid";
    String section_366A = "SECTION_366A : Procuration of minor girl.—Whoever, by any means whatsoever, induces any minor girl \n" +
            "under the age of eighteen years to go from any place or to do any act with intent that such girl may be, or \n" +
            "knowing that it is likely that she will be, forced or seduced to illicit intercourse with another person shall \n" +
            "be punishable with imprisonment which may extend to ten years, and shall also be liable to fine";
    String section_366B = "SECTION_366B :  Importation of girl from foreign country.—Whoever imports into 3\n" +
            "[India] from any country \n" +
            "outside India 4\n" +
            "[or from the State of Jammu and Kashmir] any girl under the age of twenty-one years with \n" +
            "intent that she may be, or knowing it to be likely that she will be, forced or seduced to illicit intercourse \n" +
            "with another person, 5\n" +
            "*** shall be punishable with imprisonment which may extend to ten years and shall \n" +
            "shall also be liable to fine.";
    String section_367 = "SECTION_367 : Kidnapping or abducting in order to subject person to grievous hurt, slavery, etc.—\n" +
            "Whoever kidnaps or abducts any person in order that such person may be subjected, or may be so \n" +
            "disposed of as to be put in danger of being subjected to grievous hurt, or slavery, or to the unnatural lust \n" +
            "of any person, or knowing it to be likely that such person will be so subjected or disposed of, shall be \n" +
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \n" +
            "be liable to fine";
    String section_368 = "SECTION_368 : Wrongfully concealing or keeping in confinement, kidnapped or abducted person.—\n" +
            "Whoever, knowing that any person has been kidnapped or has been abducted, wrongfully conceals or \n" +
            "confines such person, shall be punished in the same manner as if he had kidnapped or abducted such \n" +
            "person with the same intention or knowledge, or for the same purpose as that with or for which he \n" +
            "conceals or detains such person in confinement";
    String section_369 = "SECTION_369 : Kidnapping or abducting child under ten years with intent to steal from its person.—\n" +
            "Whoever kidnaps or abducts any child under the age of ten years with the intention of taking dishonestly \n" +
            "any movable property from the person of such child, shall be punished with imprisonment of either \n" +
            "description for a term which may extend to seven years, and shall also be liable to fine.";
    String section_370 = "SECTION_370 : Trafficking of person.—(1) Whoever, for the purpose of exploitation, (a) recruits, (b) transports, \n" +
            "(c) harbours, (d) transfers, or (e) receives, a person or persons, by—\n" +
            "First.—using threats, or\n" +
            "Secondly.—using force, or any other form of coercion, or\n" +
            "Thirdly.—by abduction, or Fourthly.—by practising fraud, or deception, or\n" +
            "Fifthly.—by abuse of power, or\n" +
            "Sixthly.— by inducement, including the giving or receiving of payments or benefits, in order to achieve \n" +
            "the consent of any person having control overthe person recruited, transported, harboured, transferred or \n" +
            "received,\n" +
            "commits the offence of trafficking.\n" +
            "Explanation 1.—The expression \"exploitation\" shall include any act of physical exploitation or any form \n" +
            "of sexual exploitation, slavery or practices similar to slavery, servitude, or the forced removal of organs.\n" +
            "Explanation 2.—Theconsent of the victim is immaterial in determination of the offence of \n" +
            "trafficking.\n" +
            "(2)Whoever commits the offence of trafficking shall be punished with rigorous imprisonment for a \n" +
            "term which shall not be less than seven years, but which may extend to ten years, and shall also be liable \n" +
            "to fine.\n" +
            "(3) Where the offence involves the trafficking of more than one person, it shall be punishable with rigorous \n" +
            "imprisonment for a term which shall not be less than ten years but which may extend to imprisonment for life, and \n" +
            "shall also be liable to fine.\n" +
            "(4) Where the offence involves the trafficking of a minor, it shall be punishable with rigorous imprisonment for \n" +
            "a term which shall not be less than ten years, but which may extend to imprisonment for life, and shall also be liable \n" +
            "to fine.\n" +
            "(5) Where the offence involves the trafficking of more than one minor, it shall be punishable with \n" +
            "rigorous imprisonment for a term which shall not be less than fourteen years, but which may extend to \n" +
            "imprisonment for life, and shall also be liable to fine.\n" +
            "(6) If a person is convicted of the offence of trafficking of minor on more than one occasion, then \n" +
            "such person shall be punished with imprisonment for life, which shall mean imprisonment for the \n" +
            "remainder of that person's natural life, and shall also be liable to fine.\n" +
            "(7) When a public servant or a police officer is involved in the trafficking of any person then, such \n" +
            "public servant or police officer shall be punished with imprisonment for life, which shall mean \n" +
            "imprisonment for the remainder of that person's natural life, and shall also be liable to fine";
    String section_370A = "SECTION_370A : . Exploitation of a trafficked person.—(1) Whoever, knowingly or having reason to believe \n" +
            "that a minor has been trafficked, engages such minor for sexual exploitation in any manner, shall be \n" +
            "punished with rigorous imprisonment for a term which shall not be less than five years, but which may \n" +
            "extend to seven years, and shall also be liable to fine.\n" +
            "(2) Whoever, knowingly by or having reason to believe that a person has been trafficked, engages \n" +
            "such person for sexual exploitation in any manner, shall be punished with rigorous imprisonment for a \n" +
            "term which shall not be less than three years, but which may extend to five years, and shall also be liable \n" +
            "to fine.";
    String section_371 = "SECTION_371 : Habitual dealing in slaves.—Whoever habitually imports, exports, removes, buys, sells, traffics \n" +
            "or deals in slaves, shall be punished with 1\n" +
            "[imprisonment for life], or with imprisonment of either \n" +
            "description for a term not exceeding ten years, and shall also be liable to fine";
    String section_372 = "SECTION_372 : Selling minor for purposes of prostitution, etc.—Whoever sells, lets to hire, or otherwise \n" +
            "disposes of any 2\n" +
            "[person under the age of eighteen years with intent that such person shall at any age be \n" +
            "employed or used for the purpose of prostitution or illicit intercourse with any person or for any unlawful \n" +
            "and immoral purpose, or knowing it to be likely that such person will at any age be] employed or used for \n" +
            "any such purpose, shall be punished with imprisonment of either description for a term which may extend \n" +
            "to ten years, and shall also be liable to fine." +
            "1\n" +
            "[Explanation I.—When a female under the age of eighteen years is sold, let for hire, or otherwise \n" +
            "disposed of to a prostitute or to any person who keeps or manages a brothel, the person so disposing of \n" +
            "such female shall, until the contrary is proved, be presumed to have disposed of her with the intent that \n" +
            "she shall be used for the purpose of prostitution.\n" +
            "Explanation II.—For the purposes of this section “illicit intercourse” means sexual intercourse \n" +
            "between persons not united by marriage or by any union or tie which, though not amounting to a \n" +
            "marriage, is recognised by the personal law or custom of the community to which they belong or, where \n" +
            "they belong to different communities, of both such communities, as constituting between them a quasi\u0002marital relation.]";
    String section_373 = "SECTION_373 : Buying minor for purposes of prostitution, etc.—Whoever buys, hires or otherwise obtains \n" +
            "possession of any 2\n" +
            "[person under the age of eighteen years with intent that such person shall at any age be \n" +
            "employed or used for the purpose of prostitution or illicit intercourse with any person or for any unlawful \n" +
            "and immoral purpose, or knowing it to be likely that such person will at any age be] employed or used for \n" +
            "any such purpose, shall be punished with imprisonment of either description for a term which may extend \n" +
            "to ten years, and shall also be liable to fine.\n" +
            "3\n" +
            "[Explanation I.—Any prostitute or any person keeping or managing a brothel, who buys, hires or \n" +
            "otherwise obtains possession of a female under the age of eighteen years shall, until the contrary is \n" +
            "proved, be presumed to have obtained possession of such female with the intent that she shall be used for \n" +
            "the purpose of prostitution.\n" +
            "Explanation II.—“Illicit intercourse” has the same meaning as in section 372.]";
    String section_374 = "SECTION_374 :  Unlawful compulsory labour.—Whoever unlawfully compels any person to labour against the \n" +
            "will of that person, shall be punished with imprisonment of either description for a term which may \n" +
            "extend to one year, or with fine, or with both";
    String section_375 = "SECTION_375 : . Rape.—A man is said to commit “rape” if he—\n" +
            "(a) penetrates his penis, to any extent, into the vagina, mouth, urethra or anus of a woman or \n" +
            "makes her to do so with him or any other person; or\n" +
            "(b) inserts, to any extent, any object or a part of the body, not being the penis, into the vagina, the \n" +
            "urethra or anus of a woman or makes her to do so with him or any other person; or\n" +
            "(c) manipulates any part of the body of a woman so as to cause penetration into the vagina, \n" +
            "urethra, anus or any part of body of such woman or makes her to do so with him or any other person; \n" +
            "or\n" +
            "(d) applies his mouth to the vagina, anus, urethra of a woman or makes her to do so with him or \n" +
            "any other person,\n" +
            "under the circumstances falling under any of the following seven descriptions:—\n" +
            "First.—Against her will.\n" +
            "Secondly.—Without her consent.\n" +
            "Thirdly.—With her consent, when her consent has been obtained by putting her or any person in \n" +
            "whom she is interested, in fear of death or of hurt.\n" +
            "Fourthly.—With her consent, when the man knows that he is not her husband and that her \n" +
            "consent is given because she believes that he is another man to whom she is or believes herself to be \n" +
            "lawfully married" +
            "Fifthly.—With her consent when, at the time of giving such consent, by reason of unsoundness of \n" +
            "mind or intoxication or the administration by him personally or through another of any stupefying or \n" +
            "unwholesome substance, she is unable to understand the nature and consequences of that to which she \n" +
            "gives consent.\n" +
            "Sixthly.—With or without her consent, when she is under eighteen years of age.\n" +
            "Seventhly.—When she is unable to communicate consent.\n" +
            "Explanation 1.—For the purposes of this section, “vagina” shall also include labia majora.\n" +
            "Explanation 2.—Consent means an unequivocal voluntary agreement when the woman by words, \n" +
            "gestures or any form of verbal or non-verbal communication, communicates willingness to participate in \n" +
            "the specific sexual act:\n" +
            "Provided that a woman who does not physically resist to the act of penetration shall not by the reason \n" +
            "only of that fact, be regarded as consenting to the sexual activity.\n" +
            "Exception 1.—A medical procedure or intervention shall not constitute rape.\n" +
            "Exception 2.—Sexual intercourse or sexual acts by a man with his own wife, the wife not being under \n" +
            "fifteen years of age, is not rape";
    String section_376 = "SECTION_376 : Punishment for rape.—(1) Whoever, except in the cases provided for in sub-section (2), \n" +
            "commits rape, shall be punished with rigorous imprisonment of either description for a term which shall \n" +
            "not be less than seven years, but which may extend to imprisonment for life, and shall also be liable to \n" +
            "fine.\n" +
            "(2) Whoever,—\n" +
            "(a) being a police officer, commits rape—\n" +
            "(i) within the limits of the police station to which such police officer is appointed; or\n" +
            "(ii) in the premises of any station house; or\n" +
            "(iii) on a woman in such police officer's custody or in the custody of a police officer \n" +
            "subordinate to such police officer; or\n" +
            "(b) being a public servant, commits rape on a woman in such public servant's custody or in the \n" +
            "custody of a public servant subordinate to such public servant; or\n" +
            "(c) being a member of the armed forces deployed in an area by the Central or a State Government \n" +
            "commits rape in such area; or\n" +
            "(d) being on the management or on the staff of a jail, remand home or other place of custody \n" +
            "established by or under any law for the time being in force or of a women's or children's institution, \n" +
            "commits rape on any inmate of such jail, remand home, place or institution; or\n" +
            "(e) being on the management or on the staff of a hospital, commits rape on a woman in that \n" +
            "hospital; or\n" +
            "(f) being a relative, guardian or teacher of, or a person in a position of trust or authority towards \n" +
            "the woman, commits rape on such woman; or\n" +
            "(g) commits rape during communal or sectarian violence; or\n" +
            "(h) commits rape on a woman knowing her to be pregnant; or\n" +
            "(i) commits rape on a woman when she is under sixteen years of age; or\n" +
            "(j) commits rape, on a woman incapable of giving consent; or\n" +
            "(k) being in a position of control or dominance over a woman, commits rape on such woman; or\n" +
            "(l) commits rape on a woman suffering from mental or physical disability; or\n" +
            "(m) while committing rape causes grievous bodily harm or maims or disfigures or endangers the \n" +
            "life of a woman; or\n" +
            "87\n" +
            "(n) commits rape repeatedly on the same woman,\n" +
            "shall be punished with rigorous imprisonment for a term which shall not be less than ten years, but which \n" +
            "may extend to imprisonment for life, which shall mean imprisonment for the remainder of that person's \n" +
            "natural life, and shall also be liable to fine.\n" +
            "Explanation.—For the purposes of this sub-section,—\n" +
            "(a) “armed forces” means the naval, military and air forces and includes any member of the \n" +
            "Armed Forces constituted under any law for the time being in force, including the paramilitary forces \n" +
            "and any auxiliary forces that are under the control of the Central Government or the State \n" +
            "Government;\n" +
            "(b) “hospital” means the precincts of the hospital and includes the precincts of any institution for \n" +
            "the reception and treatment of persons during convalescence or of persons requiring medical attention \n" +
            "or rehabilitation;\n" +
            "(c) “police officer” shall have the same meaning as assigned to the expression “police” under the \n" +
            "Police Act, 1861 (5 of 1861);\n" +
            "(d) “women's or children's institution” means an institution, whether called an orphanage or a \n" +
            "home for neglected women or children or a widow's home or an institution called by any other name, \n" +
            "which is established and maintained for the reception and care of women or children";
    String section_376A = "SECTION_376A : Punishment for causing death or resulting in persistent vegetative state of victim.—\n" +
            "Whoever, commits an offence punishable under sub-section (1) or sub-section (2) of section 376 and in \n" +
            "the course of such commission inflicts an injury which causes the death of the woman or causes the \n" +
            "woman to be in a persistent vegetative state, shall be punished with rigorous imprisonment for a term \n" +
            "which shall not be less than twenty years, but which may extend to imprisonment for life, which shall \n" +
            "mean imprisonment for the remainder of that person's natural life, or with death.";
    String section_376B = "SECTION_376B : Sexual intercourse by husband upon his wife during separation.—Whoever has sexual \n" +
            "intercourse with his own wife, who is living separately, whether under a decree of separation or \n" +
            "otherwise, without her consent, shall be punished with imprisonment of either description for a term \n" +
            "which shall not be less than two years but which may extend to seven years, and shall also be liable to \n" +
            "fine.\n" +
            "Explanation.—In this section, “sexual intercourse” shall mean any of the acts mentioned in clauses \n" +
            "(a) to (d) of section 375";
    String section_376C = "SECTION_376C : Sexual intercourse by a person in authority.—Whoever, being—\n" +
            "(a) in a position of authority or in a fiduciary relationship; or\n" +
            "(b) a public servant; or\n" +
            "(c) superintendent or manager of a jail, remand home or other place of custody established by or \n" +
            "under any law for the time being in force, or a women's or children's institution; or\n" +
            "(d) on the management of a hospital or being on the staff of a hospital, \n" +
            "abuses such position or fiduciary relationship to induce or seduce any woman either in his custody or \n" +
            "under his charge or present in the premises to have sexual intercourse with him, such sexual intercourse \n" +
            "not amounting to the offence of rape, shall be punished with rigorous imprisonment of either description \n" +
            "for a term which shall not be less than five years, but which may extend to ten years, and shall also be \n" +
            "liable to fine.\n" +
            "Explanation 1.—In this section, “sexual intercourse” shall mean any of the acts mentioned in \n" +
            "clauses (a) to (d) of section 375.\n" +
            "Explanation 2.—For the purposes of this section, Explanation 1 to section 375 shall also be \n" +
            "applicable.\n" +
            "Explanation 3.—“Superintendent”, in relation to a jail, remand home or other place of custody or \n" +
            "a women's or children's institution, includes a person holding any other office in such jail, remand \n" +
            "88\n" +
            "home, place or institution by virtue of which such person can exercise any authority or control over \n" +
            "its inmates.\n" +
            "Explanation 4.—The expressions “hospital” and “women's or children's institution” shall \n" +
            "respectively have the same meaning as in Explanation to sub-section (2) of section 376";
    String section_376D = "SECTION_376D : Gang rape.—Where a woman is raped by one or more persons constituting a group or acting \n" +
            "in furtherance of a common intention, each of those persons shall be deemed to have committed the \n" +
            "offence of rape and shall be punished with rigorous imprisonment for a term which shall not be less than \n" +
            "twenty years, but which may extend to life which shall mean imprisonment for the remainder of that \n" +
            "person's natural life, and with fine:\n" +
            "Provided that such fine shall be just and reasonable to meet the medical expenses and rehabilitation of \n" +
            "the victim:";
    String section_376E = "SECTION_376E : Punishment for repeat offenders.—Whoever has been previously convicted of an offence \n" +
            "punishable under section 376 or section 376A or section 376D and is subsequently convicted of an \n" +
            "offence punishable under any of the said sections shall be punished with imprisonment for life which shall \n" +
            "mean imprisonment for the remainder of that person's natural life, or with death.]";
    String section_377 = "SECTION_377 : Unnatural offences.—Whoever voluntarily has carnal intercourse against the order of nature \n" +
            "with any man, woman or animal, shall be punished with 1\n" +
            "[imprisonment for life], or with imprisonment of \n" +
            "either description for a term which may extend to ten years, and shall also be liable to fine.\n" +
            "Explanation.—Penetration is sufficient to constitute the carnal intercourse necessary to the offence \n" +
            "described in this section";









    //CHAPTER 17
    String section_378 ="SECTION 378:Theft.\u2014Whoever, intending to take dishonestly any movable property out of the possession of \r\n" + //
            "any person without that person's consent, moves that property in order to such taking, is said to commit \r\n" + //
            "theft.\r\n" + //
            "Explanation 1.\u2014A thing so long as it is attached to the earth, not being movable property, is not the \r\n" + //
            "subject of theft; but it becomes capable of being the subject of theft as soon as it is severed from the earth.\r\n" + //
            "Explanation 2.\u2014A moving effected by the same act which effects the severance may be a theft.\r\n" + //
            "Explanation 3.\u2014A person is said to cause a thing to move by removing an obstacle which prevented \r\n" + //
            "it from moving or by separating it from any other thing, as well as by actually moving it.\r\n" + //
            "Explanation 4.\u2014A person, who by any means causes an animal to move, is said to move that animal, \r\n" + //
            "and to move everything which, in consequence of the motion so caused, is moved by that animal.\r\n" + //
            "Explanation 5.\u2014The consent mentioned in the definition may be express or implied, and may be \r\n" + //
            "given either by the person in possession, or by any person having for that purpose authority either express \r\n" + //
            "or implied";
    String section_379 ="SECTION 379: Punishment for theft.\u2014Whoever commits theft shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to three years, or with fine, or with both.\r";
    String section_380 ="SECTION 380:Theft in dwelling house, etc.\u2014Whoever commits theft in any building, tent or vessel, which \r\n" + //
            "building, tent or vessel is used as a human dwelling, or used for the custody of property, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to seven years, and shall also be \r\n" + //
            "liable to fine.";
    String section_381 ="SECTION 381:Theft by clerk or servant of property in possession of master.\u2014Whoever, being a clerk or \r\n" + //
            "servant, or being employed in the capacity of a clerk or servant, commits theft in respect of any property \r\n" + //
            "in the possession of his master or employer, shall be punished with imprisonment of either description for \r\n" + //
            "a term which may extend to seven years, and shall also be liable to fine.";
    String section_382 ="SECTION 382:Theft after preparation made for causing death, hurt or restraint in order to the \r\n" + //
            "committing of the theft.\u2014Whoever commits theft, having made preparation for causing death, or hurt, \r\n" + //
            "or restraint, or fear of death, or of hurt, or of restraint, to any person, in order to the committing of such \r\n" + //
            "theft, or in order to the effecting of his escape after the committing of such theft, or in order to the \r\n" + //
            "retaining of property taken by such theft, shall be punished with rigorous imprisonment for a term which \r\n" + //
            "may extend to ten years, and shall also be liable to fine.";
    String section_383 ="SECTION 383:Extortion.\u2014Whoever intentionally puts any person in fear of any injury to that person, or to any \r\n" + //
            "other, and thereby dishonestly induces the person so put in fear to deliver to any person any property, or \r\n" + //
            "valuable security or anything signed or sealed which may be converted into a valuable security, commits \r\n" + //
            "\u201Cextortion\u201D.\r";
    String section_384 ="SECTION 384:Punishment for extortion.\u2014Whoever commits extortion shall be punished with imprisonment \r\n" + //
            "of either description for a term which may extend to three years, or with fine, or with both.";
    String section_385 ="SECTION 385:Putting person in fear of injury in order to commit extortion.\u2014Whoever, in order to the \r\n" + //
            "committing of extortion, puts any person in fear, or attempts to put any person in fear, of any injury, shall \r\n" + //
            "be punished with imprisonment of either description for a term which may extend to two years, or with \r\n" + //
            "fine, or with both.\r";
    String section_386 ="SECTION 386:Extortion by putting a person in fear of death or grievous hurt.\u2014Whoever commits \r\n" + //
            "extortion by putting any person in fear of death or of grievous hurt to that person or to any other, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \r\n" + //
            "be liable to fine.";
    String section_387 ="SECTION 387:Putting person in fear of death or of grievous hurt, in order to commit extortion.\u2014\r\n" + //
            "Whoever, in order to the committing of extortion, puts or attempts to put any person in fear of death or of \r\n" + //
            "grievous hurt to that person or to any other, shall be punished with imprisonment of either description for \r\n" + //
            "a term which may extend to seven years, and shall also be liable to fine.";
    String section_388 ="SECTION 388:Extortion by threat of accusation of an offence punishable with death or imprisonment for \r\n" + //
            "life, etc.\u2014Whoever commits extortion by putting any person in fear of an accusation against that person \r\n" + //
            "or any other, of having committed or attempted to commit any offence punishable with death, or with \r\n" + //
            "1\r\n" + //
            "[imprisonment for life], or with imprisonment for a term which may extend to ten years, or of having \r\n" + //
            "attempted to induce any other person to commit such offence, shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to ten years, and shall also be liable to fine; and, if the \r\n" + //
            "offence be one punishable under section 377 of this Code, may be punished with 1\r\n" + //
            "[imprisonment for life].";
    String section_389 ="SECTION 389:Putting person in fear or accusation of offence, in order to commit extortion.\u2014Whoever, in \r\n" + //
            "order to the committing of extortion, puts or attempts to put any person in fear of an accusation, against \r\n" + //
            "that person or any other, of having committed, or attempted to commit, an offence punishable with death \r\n" + //
            "or with 1\r\n" + //
            "[imprisonment for life], or with imprisonment for a term which may extend to ten years, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to ten years, and shall also \r\n" + //
            "be liable to fine; and, if the offence be punishable under section 377 of this Code, may be punished with \r\n" + //
            "1\r\n" + //
            "[imprisonment for life]";
    String section_390 ="SECTION 390:Robbery.\u2014In all robbery there is either theft or extortion.\r\n" + //
            "When theft is robbery.\u2014Theft is \u201Crobbery\u201D if, in order to the committing of the theft, or in \r\n" + //
            "committing the theft, or in carrying away or attempting to carry away property obtained by the theft, the offender, for that end voluntarily causes or attempts to cause to any person death or hurt or wrongful \r\n" + //
            "restraint, or fear of instant death or of instant hurt, or of instant wrongful restraint.\r\n" + //
            "When extortion is robbery.\u2014Extortion is \u201Crobbery\u201D if the offender, at the time of committing the \r\n" + //
            "extortion, is in the presence of the person put in fear, and commits the extortion by putting that person in \r\n" + //
            "fear of instant death, of instant hurt, or of instant wrongful restraint to that person or to some other person, \r\n" + //
            "and, by so putting in fear, induces the person so put in fear then and there to deliver up the thing extorted.\r\n" + //
            "Explanation.\u2014The offender is said to be present if he is sufficiently near to put the other person in \r\n" + //
            "fear of instant death, of instant hurt, or of instant wrongful restraint.\r";
    String section_391 ="SECTION 391:Dacoity.\u2014When five or more persons conjointly commit or attempt to commit a robbery, or \r\n" + //
            "where the whole number of persons conjointly committing or attempting to commit a robbery, and \r\n" + //
            "persons present and aiding such commission or attempt, amount to five or more, every person so \r\n" + //
            "committing, attempting or aiding, is said to commit \u201Cdacoity\u201D.\r";
    String section_392 ="SECTION 392:Punishment for robbery.\u2014Whoever commits robbery shall be punished with rigorous \r\n" + //
            "imprisonment for a term which may extend to ten years, and shall also be liable to fine; and, if the robbery \r\n" + //
            "be committed on the highway between sunset and sunrise, the imprisonment may be extended to fourteen \r\n" + //
            "years.";
    String section_393 ="SECTION 393:Attempt to commit robbery.\u2014Whoever attempts to commit robbery shall be punished with \r\n" + //
            "rigorous imprisonment for a term which may extend to seven years, and shall also be liable to fine.\r";
    String section_394 ="SECTION 394: Voluntarily causing hurt in committing robbery.\u2014If any person, in committing or in \r\n" + //
            "attempting to commit robbery, voluntarily causes hurt, such person, and any other person jointly \r\n" + //
            "concerned in committing or attempting to commit such robbery, shall be punished with 1\r\n" + //
            "[imprisonment \r\n" + //
            "for life], or with rigorous imprisonment for a term which may extend to ten years, and shall also be liable \r\n" + //
            "to fine.";
    String section_395 ="SECTION 395:Punishment for dacoity.\u2014Whoever commits dacoity shall be punished with 1\r\n" + //
            "[imprisonment for\r\n" + //
            "life], or with rigorous imprisonment for a term which may extend to ten years, and shall also be liable to \r\n" + //
            "fine.\r";
    String section_396 ="SECTION 396:Dacoity with murder.\u2014If any one of five or more persons, who are conjointly committing \r\n" + //
            "dacoity, commits murder in so committing dacoity, every one of those persons shall be punished with \r\n" + //
            "death, or 1\r\n" + //
            "[imprisonment for life], or rigorous imprisonment for a term which may extend to ten years, \r\n" + //
            "and shall also be liable to fine.\r";
    String section_397 ="SECTION 397:Robbery, or dacoity, with attempt to cause death or grievous hurt.\u2014If, at the time of \r\n" + //
            "committing robbery or dacoity, the offender uses any deadly weapon, or causes grievous hurt to any \r\n" + //
            "person, or attempts to cause death or grievous hurt to any person, the imprisonment with which such \r\n" + //
            "offender shall be punished shall not be less than seven years.\r";
    String section_398 ="SECTION 398:Attempt to commit robbery or dacoitywhen armed with deadly weapon.\u2014If, at the time of \r\n" + //
            "attempting to commit robbery or dacoity, the offender is armed with any deadly weapon, the \r\n" + //
            "imprisonment with which such offender shall be punished shall not be less than seven years.";
    String section_399 ="SECTION 399:Making preparation to commit dacoity.\u2014Whoever makes any preparation for committing \r\n" + //
            "dacoity, shall be punished with rigorous imprisonment for a term which may extend to ten years, and shall \r\n" + //
            "also be liable to fine.\r";
    String section_400 ="SECTION 400:Punishment for belonging to gang of dacoits.\u2014Whoever, at any time after the passing of this \r\n" + //
            "Act, shall belong to a gang of persons associated for the purpose of habitually committing dacoity, shall \r\n" + //
            "be punished with 1\r\n" + //
            "[imprisonment for life], or with rigorous imprisonment for a term which may extend to \r\n" + //
            "ten years, and shall also be liable to fine.";
    String section_401 ="SECTION 401:Punishment for belonging to gang of thieves.\u2014Whoever, at any time after the passing of this \r\n" + //
            "Act, shall belong to any wandering or other gang of persons associated for the purpose of habitually \r\n" + //
            "committing theft or robbery, and not being a gang of thugs or dacoits, shall be punished with rigorous \r\n" + //
            "imprisonment for a term which may extend to seven years, and shall also be liable to fine.\r";
    String section_402 ="SECTION 402:Assembling for purpose of committing dacoity.\u2014Whoever, at any time after the passing of \r\n" + //
            "this Act, shall be one of five or more persons assembled for the purpose of committing dacoity, shall be \r\n" + //
            "punished with rigorous imprisonment for a term which may extend to seven years, and shall also be liable \r\n" + //
            "to fine.";
    String section_403 ="SECTION 403:. Dishonest misappropriation of property.\u2014Whoever dishonestly misappropriates or converts \r\n" + //
            "to his own use any movable property, shall be punished with imprisonment of either description for a \r\n" + //
            "term which may extend to two years, or with fine, or with both.Explanation 1.\u2014A dishonest misappropriation for a time only is a misappropriation with the meaning \r\n" + //
            "of this section.Explanation 2.\u2014A person who finds property not in the possession of any other person, and takes\r\n" + //
            "such property for the purpose of protecting it for, or of restoring it to, the owner, does not take or \r\n" + //
            "misappropriate it dishonestly, and is not guilty of an offence; but he is guilty of the offence above defined, \r\n" + //
            "if he appropriates it to his own use, when he knows or has the means of discovering the owner, or before \r\n" + //
            "he has used reasonable means to discover and give notice to the owner and has kept the property a \r\n" + //
            "reasonable time to enable the owner to claim it.\r\n" + //
            "What are reasonable means or what is a reasonable time in such a case, is a question of fact.\r\n" + //
            "It is not necessary that the finder should know who is the owner of the property, or that any particular \r\n" + //
            "person is the owner of it; it is sufficient if, at the time of appropriating it, he does not believe it to be his \r\n" + //
            "own property, or in good faith believe that the real owner cannot be found";
    String section_404 ="SECTION 404:Dishonest misappropriation of property possessed by deceased person at the time of his \r\n" + //
            "death.\u2014Whoever dishonestly misappropriates or converts to his own use property, knowing that such \r\n" + //
            "property was in the possession of a deceased person at the time of that person's decease, and has not since \r\n" + //
            "been in the possession of any person legally entitled to such possession, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to three years, and shall also be liable to \r\n" + //
            "fine, and if the offender at the time of such person's decease was employed by him as a clerk or servant, \r\n" + //
            "the imprisonment may extend to seven years";
    String section_405 ="SECTION 405:Criminal breach of trust.\u2014Whoever, being in any manner entrusted with property, or with any \r\n" + //
            "dominion over property, dishonestly misappropriates or converts to his own use that property, or \r\n" + //
            "dishonestly uses or disposes of that property in violation of any direction of law prescribing the mode in \r\n" + //
            "which such trust is to be discharged, or of any legal contract, express or implied, which he has made \r\n" + //
            "touching the discharge of such trust, or wilfully suffers any other person so to do, commits \u201Ccriminal \r\n" + //
            "breach of trust\u201D.\r\n" + //
            "1\r\n" + //
            "[\r\n" + //
            "2\r\n" + //
            "[Explanation 1].\u2014A person, being an employer 3\r\n" + //
            "[of an establishment whether exempted under \r\n" + //
            "section 17 of the Employees' Provident Funds and Miscellaneous Provisions Act, 1952 (19 of 1952) or\r\n" + //
            "not] who deducts the employee\u2019s contribution from the wages payable to the employee for credit to a \r\n" + //
            "Provident Fund or Family Pension Fund established by any law for the time being in force, shall be \r\n" + //
            "deemed to have been entrusted with the amount of the contribution so deducted by him and if he makes \r\n" + //
            "default in the payment of such contribution to the said Fund in violation of the said law, shall be deemed \r\n" + //
            "to have dishonestly used the amount of the said contribution in violation of a direction of law as \r\n" + //
            "aforesaid.]\r\n" + //
            "4\r\n" + //
            "[Explanation 2.\u2014A person, being an employer, who deducts the employees\u2019 contribution from the \r\n" + //
            "wages payable to the employee for credit to the Employees' State Insurance Fund held and administered \r\n" + //
            "by the Employees' State Insurance Corporation established under the Employees\u2019 State Insurance Act, \r\n" + //
            "1948 (34 of 1948), shall be deemed to have been entrusted with the amount of the contribution so \r\n" + //
            "deducted by him and if he makes default in the payment of such contribution to the said Fund in violation \r\n" + //
            "of the said Act, shall be deemed to have dishonestly used the amount of the said contribution in violation \r\n" + //
            "of a direction of law as aforesaid.]\r\n" + //
            "";
    String section_406 ="SECTION 406:Punishment for criminal breach of trust.\u2014Whoever commits criminal breach of trust shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to three years, or with \r\n" + //
            "fine, or with both.\r";
    String section_407 ="SECTION 407:Criminal breach of trust by carrier, etc.\u2014Whoever, being entrusted with property as a carrier, \r\n" + //
            "wharfinger or warehouse-keeper, commits criminal breach of trust in respect of such property, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to seven years, and shall \r\n" + //
            "also be liable to fine";
    String section_408 ="SECTION 408:Criminal breach of trust by clerk or servant.\u2014Whoever, being a clerk or servant or employed \r\n" + //
            "as a clerk or servant, and being in any manner entrusted in such capacity with property, or with any \r\n" + //
            "dominion over property, commits criminal breach of trust in respect of that property, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to seven years, and shall also be \r\n" + //
            "liable to fine";
    String section_409 ="SECTION 409:Criminal breach of trust by public servant, or by banker, merchant or agent.\u2014Whoever, \r\n" + //
            "being in any manner entrusted with property, or with any dominion over property in his capacity of a \r\n" + //
            "public servant or in the way of his business as a banker, merchant, factor, broker, attorney or agent, \r\n" + //
            "commits criminal breach of trust in respect of that property, shall be punished with 1\r\n" + //
            "[imprisonment for \r\n" + //
            "life], or with imprisonment of either description for a term which may extend to ten years, and shall also \r\n" + //
            "be liable to fine";
    String section_410 ="SECTION 410:Stolen property.\u2014Property, the possession whereof has been transferred by theft, or by \r\n" + //
            "extortion, or by robbery, and property which has been criminally misappropriated or in respect of which \r\n" + //
            "2\r\n" + //
            "*** 3\r\n" + //
            "***criminal breach of trust has been committed, is designated as \u201Cstolen property\u201D, \r\n" + //
            "4\r\n" + //
            "[whether the \r\n" + //
            "transfer has been made, or the misappropriation or breach of trust has been committed, within or without \r\n" + //
            "5\r\n" + //
            "[India]]. But, if such property subsequently comes into the possession of a person legally entitled to the \r\n" + //
            "possession thereof, it then ceases to be stolen property";
    String section_411 ="SECTION 411:Dishonestly receiving stolen property.\u2014Whoever dishonestly receives or retains any stolen \r\n" + //
            "property, knowing or having reason to believe the same to be stolen property, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to three years, or with fine, or with both.";
    String section_412 ="SECTION 412:Dishonestly receiving property stolen in the commission of a dacoity.\u2014Whoever dishonestly \r\n" + //
            "receives or retains any stolen property, the possession whereof he knows or has reason to believe to have \r\n" + //
            "been transferred by the commission of dacoity, or dishonestly receives from a person, whom he knows or \r\n" + //
            "has reason to believe to belong or to have belonged to a gang of dacoits, property which he knows or has \r\n" + //
            "reason to believe to have been stolen, shall be punished with 1\r\n" + //
            "[imprisonment for life], or with rigorous \r\n" + //
            "imprisonment for a term which may extend to ten years, and shall also be liable to fine.";
    String section_413 ="SECTION 413:Habitually dealing in stolen property.\u2014Whoever habitually receives or deals in property \r\n" + //
            "which he knows or has reason to believe to be stolen property, shall be punished with 1\r\n" + //
            "[imprisonment for \r\n" + //
            "life], or with imprisonment of either description for a term which may extend to ten years, and shall also \r\n" + //
            "be liable to fine.";
    String section_414 ="SECTION 414Assisting in concealment of stolen property.\u2014Whoever voluntarily assists in concealing or \r\n" + //
            "disposing of or making away with property which he knows or has reason to believe to be stolen property, \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to three years, or \r\n" + //
            "with fine, or with both.:";
    String section_415 ="SECTION 415: Cheating.\u2014Whoever, by deceiving any person, fraudulently or dishonestly induces the person \r\n" + //
            "so deceived to deliver any property to any person, or to consent that any person shall retain any property, \r\n" + //
            "or intentionally induces the person so deceived to do or omit to do anything which he would not do or \r\n" + //
            "omit if he were not so deceived, and which act or omission causes or is likely to cause damage or harm to \r\n" + //
            "that person in body, mind, reputation or property, is said to \u201Ccheat\u201D.\r\n" + //
            "Explanation.\u2014A dishonest concealment of facts is a deception within the meaning of this section.";
    String section_416 ="SECTION 416:Cheating by personation.\u2014A person is said to \u201Ccheat by personation\u201D if he cheats by \r\n" + //
            "pretending to be some other person, or by knowingly substituting one person for or another, or \r\n" + //
            "representing that he or any other person is a person other than he or such other person really is.\r\n" + //
            "Explanation.\u2014The offence is committed whether the individual personated is a real or imaginary \r\n" + //
            "person.\r";
    String section_417 ="SECTION 417: Punishment for cheating.\u2014Whoever cheats shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to one year, or with fine, or with both.";
    String section_418 ="SECTION 418: Cheating with knowledge that wrongful loss may ensue to person whose interest offender is \r\n" + //
            "bound to protect.\u2014Whoever cheats with the knowledge that he is likely thereby to cause wrongful loss \r\n" + //
            "to a person whose interest in the transaction to which the cheating relates, he was bound, either by law, or \r\n" + //
            "by a legal contract, to protect, shall be punished with imprisonment of either description for a term which \r\n" + //
            "may extend to three years, or with fine, or with both.\r";
    String section_419 ="SECTION 419:Punishment for cheating by personation.\u2014Whoever cheats by personation shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to three years, or with fine, or with \r\n" + //
            "both";
    String section_420 ="SECTION 420:Cheating and dishonestly inducing delivery of property.\u2014Whoever cheats and thereby \r\n" + //
            "dishonestly induces the person deceived to deliver any property to any person, or to make, alter or destroy \r\n" + //
            "the whole or any part of a valuable security, or anything which is signed or sealed, and which is capable \r\n" + //
            "of being converted into a valuable security, shall be punished with imprisonment of either description for \r\n" + //
            "a term which may extend to seven years, and shall also be liable to fine";
    String section_421 ="SECTION 421:Dishonest or fraudulent removal or concealment of property to prevent distribution among \r\n" + //
            "creditors.\u2014Whoever dishonestly or fraudulently removes, conceals or delivers to any person, or transfers \r\n" + //
            "or causes to be transferred to any person, without adequate consideration, any property, intending thereby \r\n" + //
            "to prevent, or knowing it to be likely that he will thereby prevent, the distribution of that property \r\n" + //
            "according to law among his creditors or the creditors of any other person, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to two years, or with fine, or with both.";
    String section_422 ="SECTION 422:Dishonestly or fraudulently preventing debt being available for creditors.\u2014Whoever \r\n" + //
            "dishonestly or fraudulently prevents any debt or demand due to himself or to any other person from being \r\n" + //
            "made available according to law for payment of his debts or the debts of such other person, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to two years, or with fine, \r\n" + //
            "or with both.";
    String section_423 ="SECTION 423:Dishonest or fraudulent execution of deed of transfer containing false statement of \r\n" + //
            "consideration.\u2014Whoever dishonestly or fraudulently signs, executes or becomes a party to any deed or \r\n" + //
            "instrument which purports to transfer or subject to any charge any property, or any interest therein, and \r\n" + //
            "which contains any false statement relating to the consideration for such transfer or charge, or relating to \r\n" + //
            "the person or persons for whose use or benefit it is really intended to operate, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to two years, or with fine, or with both.\r";
    String section_424 ="SECTION 424:Dishonest or fraudulent removal or concealment of property.\u2014Whoever dishonestly or \r\n" + //
            "fraudulently conceals or removes any property of himself or any other person, or dishonestly or \r\n" + //
            "fraudulently assists in the concealment or removal thereof, or dishonestly releases any demand or claim to \r\n" + //
            "which he is entitled, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to two years, or with fine, or with both.";
    String section_425 ="SECTION 425:Mischief.\u2014Whoever with intent to cause, or knowing that he is likely to cause, wrongful loss or \r\n" + //
            "damage to the public or to any person, causes the destruction of any property, or any such change in any \r\n" + //
            "property or in the situation thereof as destroys or diminishes its value or utility, or affects it injuriously, \r\n" + //
            "commits \u201Cmischief\u201D.\r\n" + //
            "Explanation 1.\u2014It is not essential to the offence of mischief that the offender should intend to cause \r\n" + //
            "loss or damage to the owner of the property injured or destroyed. It is sufficient if he intends to cause, or \r\n" + //
            "knows that he is likely to cause, wrongful loss or damage to any person by injuring any property, whether \r\n" + //
            "it belongs to that person or not.\r\n" + //
            "Explanation 2.\u2014Mischief may be committed by an act affecting property belonging to the person \r\n" + //
            "who commits the act, or to that person and others jointly.\r\n" + //
            "";
    String section_426 ="SECTION 426:Punishment for mischief.\u2014Whoever commits mischief shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to three months, or with fine, or with both.\r";
    String section_427 ="SECTION 427: Mischief causing damage to the amount of fifty rupees.\u2014Whoever commits mischief and \r\n" + //
            "thereby causes loss or damage to the amount of fifty rupees or upwards, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to two years, or with fine, or with both.";
    String section_428 ="SECTION 428:Mischief by killing or maiming animal of the value of ten rupees.\u2014Whoever commits \r\n" + //
            "mischief by killing, poisoning, maiming or rendering useless any animal or animals of the value of the ten \r\n" + //
            "rupees or upwards, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to two years, or with fine, or with both.";
    String section_429 ="SECTION 429:Mischief by killing or maiming cattle, etc., of any value or any animal of the value of fifty \r\n" + //
            "rupees.\u2014Whoever commits mischief by killing, poisoning, maiming or rendering useless, any elephant, \r\n" + //
            "camel, horse, mule, buffalo, bull, cow or ox, whatever may be the value thereof, or any other animal of \r\n" + //
            "the value of fifty rupees or upwards, shall be punished with imprisonment of either description for a term \r\n" + //
            "which may extend to five years, or with fine, or with both.";
    String section_430 ="SECTION 430: Mischief by injury to works of irrigation or by wrongfully diverting water.\u2014Whoever \r\n" + //
            "commits mischief by doing any act which causes, or which he knows to be likely to cause, a diminution \r\n" + //
            "of the supply of water for agricultural purposes, or for food or drink for human beings or for animals \r\n" + //
            "which are property, or for cleanliness or for carrying on any manufacture, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to five years, or with fine, or with both.";
    String section_431 ="SECTION 431:Mischief by injury to public road, bridge, river or channel.\u2014Whoever commits mischief by \r\n" + //
            "doing any act which renders or which he knows to be likely to render any public road, bridge, navigable \r\n" + //
            "river or navigable channel, natural or artificial, impassable or less safe for travelling or conveying \r\n" + //
            "property, shall be punished with imprisonment of either description for a term which may extend to five \r\n" + //
            "years, or with fine, or with both.\r";
    String section_432 ="SECTION 432:Mischief by causing inundation or obstruction to public drainage attended with damage.\u2014\r\n" + //
            "Whoever commits mischief by doing any act which causes or which he knows to be likely to cause an \r\n" + //
            "inundation or an obstruction to any public drainage attended with injury or damage, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to five years, or with fine, or with \r\n" + //
            "both.";
    String section_433 ="SECTION 433: Mischief by destroying, moving or rendering less useful a light-house or sea-mark.\u2014\r\n" + //
            "Whoever commits mischief by destroying or moving any light-house or other light used as a sea-mark, or \r\n" + //
            "any sea- mark or buoy or other thing placed as a guide for navigators, or by any act which renders any \r\n" + //
            "such light-house, sea-mark, buoy or other such thing as aforesaid less useful as a guide for navigators, \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to seven years, or \r\n" + //
            "with fine, or with both.\r\n" + //
            "";
    String section_434 ="SECTION 434: Mischief by destroying or moving, etc., a land-mark fixed by public authority.\u2014Whoever \r\n" + //
            "commits mischief by destroying or moving any land-mark fixed by the authority of a public servant, or by \r\n" + //
            "any act which renders such land-mark less useful as such, shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to one year, or with fine, or with both.";
    String section_435 ="SECTION 435:Mischief by fire or explosive substance with intent to cause damage to amount of one \r\n" + //
            "hundred or (in case of agricultural produce) ten rupees.\u2014Whoever commits mischief by fire or any \r\n" + //
            "explosive substance intending to cause, or knowing it to be likely that he will thereby cause, damage to \r\n" + //
            "any property to the amount of one hundred rupees or upwards 1\r\n" + //
            "[or (where the property is agricultural \r\n" + //
            "produce) ten rupees or upwards], shall be punished with imprisonment of either description for a term \r\n" + //
            "which may extend to seven years and shall also be liable to fine.";
    String section_436 ="SECTION 436:Mischief by fire or explosive substance with intent to destroy house, etc.\u2014Whoever commits \r\n" + //
            "mischief by fire or any explosive substance, intending to cause, or knowing it to be likely that he will \r\n" + //
            "thereby cause, the destruction of any building which is ordinarily used as a place of worship or as a \r\n" + //
            "human dwelling or as a place for the custody of property, shall be punished with 2\r\n" + //
            "[imprisonment for life], \r\n" + //
            "or with imprisonment of either description for a term which may extend to ten years, and shall also be \r\n" + //
            "liable to fine";
    String section_437 ="SECTION 437:Mischief with intent to destroy or make unsafe a decked vessel or one of twenty tons \r\n" + //
            "burden.\u2014Whoever commits mischief to any decked vessel or any vessel of a burden of twenty tons or \r\n" + //
            "upwards, intending to destroy or render unsafe, or knowing it to be likely that he will thereby destroy or \r\n" + //
            "render unsafe, that vessel, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to ten years, and shall also be liable to fine.";
    String section_438 ="SECTION 438:Punishment for the mischief described in section 437 committed by fire or explosive \r\n" + //
            "substance. \u2014Whoever commits, or attempts to commit, by fire or any explosive substance, such mischief \r\n" + //
            "as is described in the last preceding section, shall be punished with 2\r\n" + //
            "[imprisonment for life]. or with \r\n" + //
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \r\n" + //
            "fine.";
    String section_439 ="SECTION 439:Punishment for intentionally running vessel aground or ashore with intent to commit theft, \r\n" + //
            "etc.\u2014Whoever intentionally runs any vessel aground or ashore, intending to commit theft of any property \r\n" + //
            "contained therein or to dishonestly misappropriate any such property, or with intent that such theft or \r\n" + //
            "misappropriation of property may be committed, shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to ten years, and shall also be liable to fine.";
    String section_440 ="SECTION 440:Mischief committed after preparation made for causing death or hurt.\u2014Whoever commits \r\n" + //
            "mischief, having made preparation for causing to any person death, or hurt, or wrongful restraint, or fear \r\n" + //
            "of death, or of hurt, or of wrongful restraint, shall be punished with imprisonment of either description for \r\n" + //
            "a term which may extend to five years, and shall also be liable to fine.\r";
    String section_441 ="SECTION 441:Criminal trespass.\u2014Whoever enters into or upon property in the possession of another with \r\n" + //
            "intent to commit an offence or to intimidate, insult or annoy any person in possession of such property, \r\n" + //
            "or having lawfully entered into or upon such property, unlawfully remains there with intent thereby to \r\n" + //
            "intimidate, insult or annoy any such person, or with intent to commit an offence, \r\n" + //
            "is said to commit \u201Ccriminal trespass\u201D.\r";
    String section_442 ="SECTION 442:House-trespass.\u2014Whoever commits criminal trespass by entering into or remaining in any \r\n" + //
            "building, tent or vessel used as a human dwelling or any building used as a place for worship, or as a \r\n" + //
            "place for the custody of property, is said to commit \u201Chouse-trespass\u201D.\r\n" + //
            "Explanation.\u2014The introduction of any part of the criminal trespasser's body is entering sufficient to \r\n" + //
            "constitute house-trespass.";
    String section_443 ="SECTION 443:Lurking house-trespass.\u2014Whoever commits house-trespass having taken precautions to \r\n" + //
            "conceal such house-trespass from some person who has a right to exclude or eject the trespasser from the \r\n" + //
            "building, tent or vessel which is the subject of the trespass, is said to commit \u201Clurking house-trespass\u201D.\r";
    String section_444 ="SECTION 444: Lurking house-trespass by night.\u2014Whoever commits lurking house-trespass after sunset and\r\n" + //
            "before sunrise, is said to commit \u201Clurking house-trespass by night\u201D.";
    String section_445 ="SECTION 445:House-breaking.\u2014A person is said to commit \u201Chouse-breaking\u201D who commits house-trespass if \r\n" + //
            "he effects his entrance into the house or any part of it in any of the six ways hereinafter described; or if, \r\n" + //
            "being in the house or any part of it for the purpose of committing an offence, or having committed an \r\n" + //
            "offence therein, he quits the house or any part of it in any of such six ways, that is to say:\u2014\r\n" + //
            "First.\u2014If he enters or quits through a passage made by himself, or by any abettor of the house\u0002trespass, in order to the committing of the house-trespass.\r\n" + //
            "Secondly.\u2014If he enters or quits through any passage not intended by any person, other than himself \r\n" + //
            "or an abettor of the offence, for human entrance; or through any passage to which he has obtained access \r\n" + //
            "by scaling or climbing over any wall or building.\r\n" + //
            "Thirdly.\u2014If he enters or quits through any passage which he or any abettor of the house-trespass has \r\n" + //
            "opened, in order to the committing of the house-trespass by any means by which that passage was not \r\n" + //
            "intended by the occupier of the house to be opened.\r\n" + //
            "Fourthly.\u2014If he enters or quits by opening any lock in order to the committing of the house-trespass, \r\n" + //
            "or in order to the quitting of the house after a house-trespass.\r\n" + //
            "Fifthly.\u2014If he effects his entrance or departure by using criminal force or committing an assault, or \r\n" + //
            "by threatening any person with assault.\r\n" + //
            "Sixthly.\u2014If he enters or quits by any passage which he knows to have been fastened against such \r\n" + //
            "entrance or departure, and to have been unfastened by himself or by an abettor of the house-trespass.\r\n" + //
            "Explanation.\u2014Any out-house or building occupied with a house, and between which and such house \r\n" + //
            "there is an immediate internal communication, is part of the house within the meaning of this section";
    String section_446 ="SECTION 446:House-breaking by night.\u2014Whoever commits house-breaking after sunset and before sunrise, \r\n" + //
            "is said to commit \u201Chouse-breaking by night\u201D.\r";
    String section_447 ="SECTION 447:Punishment for criminal trespass.\u2014Whoever commits criminal trespass shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to three months, or with fine which \r\n" + //
            "may extend to five hundred rupees, or with both";
    String section_448 ="SECTION 448:Punishment for house-trespass.\u2014Whoever commits house-trespass shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to one year, or with fine which may \r\n" + //
            "extend to one thousand rupees, or with both";
    String section_449 ="SECTION 449:House-trespass in order to commit offence punishable with death.\u2014Whoever commits \r\n" + //
            "house-trespass in order to the committing of any offence punishable with death, shall be punished with \r\n" + //
            "1\r\n" + //
            "[imprisonment for life], or with rigorous imprisonment for a term not exceeding ten years, and shall also \r\n" + //
            "be liable to fine.";
    String section_450 ="SECTION 450:House-trespass in order to commit offence punishable with imprisonment for life.\u2014\r\n" + //
            "Whoever commits house-trespass in order to the committing of any offence punishable with \r\n" + //
            "1\r\n" + //
            "[imprisonment for life], shall be punished with imprisonment of either description for a term not \r\n" + //
            "exceeding ten years, and shall also be liable to fine.\r";
    String section_451 ="SECTION 451:House-trespass in order to commit offence punishable with imprisonment.\u2014Whoever \r\n" + //
            "commits house-trespass in order to the committing of any offence punishable with imprisonment, shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to two years, and shall \r\n" + //
            "also be liable to fine; and if the offence intended to be committed is theft, the term of the imprisonment \r\n" + //
            "may be extended to seven years.";
    String section_452 ="SECTION 452:House-trespass alter preparation for hurt, assault or wrongful restraint.\u2014Whoever \r\n" + //
            "commits house-trespass, having made preparation for causing hurt to any person or for assaulting any \r\n" + //
            "person, or for wrongfully restraining any person, or for putting and person in fear of hurt, or of assault, or \r\n" + //
            "of wrongful restraint, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to seven years, and shall also be liable to fine.";
    String section_453 ="SECTION 453:House-trespass alter preparation for hurt, assault or wrongful restraint.\u2014Whoever \r\n" + //
            "commits house-trespass, having made preparation for causing hurt to any person or for assaulting any \r\n" + //
            "person, or for wrongfully restraining any person, or for putting and person in fear of hurt, or of assault, or \r\n" + //
            "of wrongful restraint, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to seven years, and shall also be liable to fine.";
    String section_454 ="SECTION 454:Lurking house-trespass or house-breaking in order to commit offence punishable with \r\n" + //
            "imprisonment.\u2014Whoever commits lurking house-trespass or house-breaking, in order to the committing \r\n" + //
            "of any offence punishable with imprisonment, shall be punished with imprisonment of either description \r\n" + //
            "for a term which may extend to three years, and shall also be liable to fine; and if the offence intended to \r\n" + //
            "be committed is theft, the term of the imprisonment may be extended to ten years.";
    String section_455 ="SECTION 455:Lurking house-trespass or house-breaking after preparation for hurt, assault or wrongful \r\n" + //
            "restraint.\u2014Whoever commits lurking house-trespass, or house-breaking, having made preparation for \r\n" + //
            "causing hurt to any person, or for assaulting any person, or for wrongfully restraining any person, or for \r\n" + //
            "putting any person in fear of hurt or of assault or of wrongful restraint, shall be punished with \r\n" + //
            "imprisonment of either description or a term which may extend to ten years, and shall also be liable to \r\n" + //
            "fine.";
    String section_456 ="SECTION 456:Punishment for lurking house-trespass or house-breaking by night.\u2014Whoever commits \r\n" + //
            "lurking house-trespass by night, or house-breaking by night, shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to three years, and shall also be liable to fine.";
    String section_457 ="SECTION 457:Lurking house-trespass or house-breaking by night in order to commit offence punishable \r\n" + //
            "with imprisonment.\u2014Whoever commits lurking house-trespass by night, or house-breaking by night, in \r\n" + //
            "order to the committing of any offence punishable with imprisonment, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to five years, and shall also be liable to \r\n" + //
            "fine; and, if the offence intended to be committed is theft, the term of the imprisonment may be extended \r\n" + //
            "to fourteen years.";
    String section_458 ="SECTION 458:Lurking house-trespass or house-breaking by night after preparation for hurt, assault, or \r\n" + //
            "wrongful restraint.\u2014Whoever commits lurking house-trespass by night, or house-breaking by night, \r\n" + //
            "having made preparation for causing hurt to any person or for assaulting any person, or for wrongfully \r\n" + //
            "restraining any person, or for putting any person in fear of hurt, or of assault, or of wrongful restraint, \r\n" + //
            "shall be punished with imprisonment of either description for a term which may extend to fourteen years, \r\n" + //
            "and shall also be liable to fine.";
    String section_459 ="SECTION 459:Grievous hurt caused whilst committing lurking house-trespass or house-breaking.\u2014\r\n" + //
            "Whoever, whilst committing lurking house-trespass or house-breaking, causes grievous hurt to any person \r\n" + //
            "or attempts to cause death or grievous hurt to any person, shall be punished with 1\r\n" + //
            "[imprisonment for life], \r\n" + //
            "or imprisonment of either description for a term which may extend to ten years, and shall also be liable to \r\n" + //
            "fine.\r";
    String section_460 ="SECTION 460:All persons jointly concerned in lurking house-trespass or house-breaking by night \r\n" + //
            "punishable where death or grievous hurt caused by one of them.\u2014If, at the time of the committing of \r\n" + //
            "lurking house-trespass by night or house-breaking by night, any person guilty of such offence shall \r\n" + //
            "voluntarily cause or attempt to cause death or grievous hurt to any person, every person jointly concerned \r\n" + //
            "in committing such lurkking house-trespass by night or house-breaking by night, shall be punished with \r\n" + //
            "1\r\n" + //
            "[imprisonment for life], or with imprisonment of either description for a term which may extend to ten \r\n" + //
            "years, and shall also be liable to fine.";
    String section_461 ="SECTION 461:Dishonestly breaking open receptacle containing property.\u2014Whoever dishonestly or with \r\n" + //
            "intent to commit mischief, breaks open or unfastens any closed receptacle which contains or which he \r\n" + //
            "believes to contain property, shall be punished with imprisonment of either description for a term which \r\n" + //
            "may extend to two years, or with fine, or with both";
    String section_462 ="SECTION 462:Punishment for same offence when committed by person entrusted with custody.\u2014\r\n" + //
            "Whoever, being entrusted with any closed receptacle which contains or which he believes to contain \r\n" + //
            "property, without having authority to open the same, dishonestly, or with intent to commit mischief, \r\n" + //
            "breaks open or unfastens that receptacle, shall be punished with imprisonment of either description for a \r\n" + //
            "term which may extend to three years, or with fine, or with both.";
    String section_463 ="SECTION 463:Forgery.\u20143\r\n" + //
            "[Whoever makes any false document or false electronic record or part of a \r\n" + //
            "document or electronic record, with intent to cause damage or injury], to the public or to any person, or to \r\n" + //
            "support any claim or title, or to cause any person to part with property, or to enter into any express or \r\n" + //
            "implied contract, or with intent to commit fraud or that fraud may be committed, commits forgery.\r";
    String section_464 ="SECTION 464:Making a false document.\u20143\r\n" + //
            "[A person is said to make a false document or false electronic \r\n" + //
            "record\u2014\r\n" + //
            "First.\u2014Who dishonestly or fraudulently\u2014\r\n" + //
            "(a) makes, signs, seals or executes a document or part of a document;\r\n" + //
            "(b) makes or transmits any electronic record or part of any electronic record;\r\n" + //
            "(c) affixes any 4\r\n" + //
            "[electronic signature] on any electronic record;\r\n" + //
            "(d) makes any mark denoting the execution of a document or the authenticity of the \r\n" + //
            "4\r\n" + //
            "[electronic signature],\r\n" + //
            "with the intention of causing it to be believed that such document or part of document, electronic \r\n" + //
            "record or 4\r\n" + //
            "[electronic signature] was made, signed, sealed, executed, transmitted or affixed by or by the \r\n" + //
            "authority of a person by whom or by whose authority he knows that it was not made, singed, sealed, \r\n" + //
            "executed or affixed; or\r\n" + //
            "Secondly.\u2014Who without lawful authority, dishonestly or fraudulently, by cancellation or otherwise, \r\n" + //
            "alters a document or an electronic record in any material part thereof, after it has been made, executed or \r\n" + //
            "affixed with 4\r\n" + //
            "[electronic signature] either by himself or by any other person, whether such person be \r\n" + //
            "living or dead at the time of such alteration; or\r\n" + //
            "Thirdly.\u2014Who dishonestly or fraudulently causes any person to sign, seal, execute or alter a \r\n" + //
            "document or an electronic record or to affix his 4\r\n" + //
            "[electronic signature] on any electronic record knowing \r\n" + //
            "that such person by reason of unsoundness of mind or intoxication cannot, or that by reason of deceptionpractised upon him, he does not know the contents of the document or electronic record or the nature of\r\n" + //
            "the alteration.]Explanation 1.\u2014A man\u2019s signature of his own name may amount to forgery.Explanation 2.\u2014The making of a false document in the name of a fictious person, intending it to be \r\n" + //
            "believed that the document was made by a real person, or in the name of a deceased person, intending it to \r\n" + //
            "be believed that the document was made by the person in his lifetime, may amount to forgery.\r\n" + //
            "1\r\n" + //
            "[Explanation 3.\u2014For the purposes of this section, the expression \u201Caffixing 2\r\n" + //
            "[electronic signature]\u201D\r\n" + //
            "shall have the meaning assigned to it in clause (d) of sub-section (1) of section 2 of the Information \r\n" + //
            "Technology Act, 2000 (21 of 2000).]\r";
    String section_465 ="SECTION 465:Punishment for forgery.\u2014Whoever commits forgery shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to two years, or with fine, or with both.";
    String section_466 ="SECTION 466:Forgery of record of Court or of public register, etc.\u20143\r\n" + //
            "[Whoever forges a document or an \r\n" + //
            "electronic record], purporting to be a record or proceeding of or in a Court of Justice, or a register of birth, \r\n" + //
            "baptism, marriage or burial, or a register kept by a public servant as such, or a certificate or document \r\n" + //
            "purporting to be made by a public servant in his official capacity, or an authority to institute or defend a \r\n" + //
            "suit, or to take any proceedings therein, or to confess judgment, or a power of attorney, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to seven years, and shall also be \r\n" + //
            "liable to fine.1\r\n" + //
            "[Explanation.\u2014For the purposes of this section, \"register\" includes any list, data or record of any \r\n" + //
            "entries maintained in the electronic form as defined in clause (r) of sub-section (1) of section 2 of the \r\n" + //
            "Information Technology Act, 2000 (21 of 2000).]\r";
    String section_467 ="SECTION 467:Forgery of valuable security, will, etc.\u2014Whoever forges a document which purports to be a \r\n" + //
            "valuable security or a will, or an authority to adopt a son, or which purports to give authority to any \r\n" + //
            "person to make or transfer any valuable security, or to receive the principal, interest or dividends thereon, \r\n" + //
            "or to receive or deliver any money, movable property, or valuable security, or any document purporting to \r\n" + //
            "be an acquittance or receipt acknowledging the payment of money, or an acquittance or receipt for the \r\n" + //
            "delivery of any movable property or valuable security, shall be punished with 4\r\n" + //
            "[imprisonment for life], or \r\n" + //
            "with imprisonment of either description for a term which may extend to ten years, and shall also be liable \r\n" + //
            "to fine.\r";
    String section_468 ="SECTION 468:Forgery for purpose of cheating.\u2014Whoever commits forgery, intending that the 3\r\n" + //
            "[document or \r\n" + //
            "electronic record forged] shall be used for the purpose of cheating, shall be punished with imprisonment \r\n" + //
            "of either description for a term which may extend to seven years, and shall also be liable to fine.\r";
    String section_469 ="SECTION 469:. Forgery for purpose of harming reputation.\u2014Whoever commits forgery, 3\r\n" + //
            "[intending that the \r\n" + //
            "document or electronic record forged] shall harm the reputation of any party, or knowing that it is likely \r\n" + //
            "to be used for that purpose, shall be punished with imprisonment of either description for a term which \r\n" + //
            "may extend to three years, and shall also be liable to fine";
    String section_470 ="SECTION 470:Forged document.\u2014A false 5\r\n" + //
            "[document or electronic record] made wholly or in part by forgery \r\n" + //
            "is designated \u201Ca forged 5\r\n" + //
            "[document or electronic record]\u201D.";
    String section_471 ="SECTION 471:Using as genuine a forged document or electronic record.\u2014Whoever fraudulently or \r\n" + //
            "dishonestly uses as genuine any 5\r\n" + //
            "[document or electronic record] which he knows or has reason to believe \r\n" + //
            "to be a forged 5\r\n" + //
            "[document or electronic record], shall be punished in the same manner as if he had forged \r\n" + //
            "such 5\r\n" + //
            "[document or electronic record].";
    String section_472 ="SECTION 472:Making or possessing counterfeit seal, etc., with intent to commit forgery punishable under \r\n" + //
            "section 467.\u2014Whoever makes or counterfeits any seal, plate or other instrument for making an \r\n" + //
            "impression, intending that the same shall be used for the purpose of committing any forgery which would \r\n" + //
            "be punishable under section 467 of this Code, or, with such intent, has in his possession any such seal, \r\n" + //
            "plate or other instrument, knowing the same to be counterfeit, shall be punished with 4\r\n" + //
            "[imprisonment for \r\n" + //
            "life], or with imprisonment of either description for a term which may extend to seven years, and shall \r\n" + //
            "also be liable to fine.";
    String section_473 ="SECTION 473:Making or possessing counterfeit seal, etc., with intent to commit forgery punishable \r\n" + //
            "otherwise.\u2014Whoever makes or counterfeits any seal, plate or other instrument for making an impression, \r\n" + //
            "intending that the same shall be used for the purpose of committing any forgery which would be \r\n" + //
            "punishable under any section of this Chapter other than section 467, or, with such intent, has in his \r\n" + //
            "possession any such seal, plate or other instrument, knowing the same to be counterfeit, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to seven years, and shall also be \r\n" + //
            "liable to fine";
    String section_474 ="SECTION 474:Having possession of document described in section 466 or 467, knowing it to be forged and \r\n" + //
            "intending to use it genuine.\u20141\r\n" + //
            "[Whoever has in his possession any document or electronic record, \r\n" + //
            "knowing the same to be forged and intending that the same shall fraudulently or dishonestly be used as \r\n" + //
            "genuine, shall, if the document or electronic record is one of the description mentioned in section 466 of \r\n" + //
            "this Code], be punished with imprisonment of either description for a term which may extend to seven \r\n" + //
            "years, and shall also be liable to fine; and if the document is one of the description mentioned in section \r\n" + //
            "467, shall be punished with 2\r\n" + //
            "[imprisonment for life], or with imprisonment of either description, for a \r\n" + //
            "term which may extend to seven years, and shall also be liable to fine.\r";
    String section_475 ="SECTION 475:Counterfeiting device or mark used for authenticating documents described in section 467, \r\n" + //
            "or possessing counterfeit marked material.\u2014Whoever counterfeits upon, or in the substance of, any \r\n" + //
            "material, any device or mark used for the purpose of authenticating any document described in section \r\n" + //
            "467 of this Code, intending that such device or mark shall be used for the purpose of giving the \r\n" + //
            "appearance of authenticity to any document then forged or thereafter to be forged on such material, or \r\n" + //
            "who, with such intent, has in his possession any material upon or in the substance of which any such \r\n" + //
            "device or mark has been counterfeited, shall be punished with 2\r\n" + //
            "[imprisonment for life], or with \r\n" + //
            "imprisonment of either description for a term which may extend to seven years, and shall also be liable to \r\n" + //
            "fine";
    String section_476 ="SECTION 476:Counterfeiting device or mark used for authenticating documents other than those \r\n" + //
            "described in section 467, or possessing counterfeit marked material.\u2014Whoever counterfeits upon, or \r\n" + //
            "in the substance of, any material, any device or mark used for the purpose of authenticating 3\r\n" + //
            "[any \r\n" + //
            "document or electronic record] other than the documents described in section 467 of this Code, intending \r\n" + //
            "that such device or mark shall be used for the purpose of giving the appearance of authenticity to any \r\n" + //
            "document then forged or thereafter to be forged on such material, or who with such intent, has in his \r\n" + //
            "possession any material upon or in the substance of which any such device or mark has been \r\n" + //
            "counterfeited, shall be punished with imprisonment of either description for a term which may extend to \r\n" + //
            "seven years, and shall also be liable to fine.";
    String section_477 ="SECTION 477:Fraudulent cancellation, destruction, etc., of will, authority to adopt, or valuable \r\n" + //
            "security.\u2014Whoever fraudulently or dishonestly, or with intent to cause damage or injury to the public or \r\n" + //
            "to any person, cancels, destroys or defaces, or attempts to cancel, destroy or deface, or secretes or \r\n" + //
            "attempts to secrete any document which is or purports to be a will, or an authority to adopt a son, or any \r\n" + //
            "valuable security, or commits mischief in respect of such document, shall be punished with \r\n" + //
            "2\r\n" + //
            "[imprisonment for life], or with imprisonment of either description for a term which may extend to seven \r\n" + //
            "years, and shall also be liable to fine.\r";
    String section_477A ="SECTION 477A:Falsification of accounts.\u2014Whoever, being a clerk, officer or servant, or employed or \r\n" + //
            "acting in the capacity of a clerk, officer or servant, wilfully, and with intent to defraud, destroys, alters, \r\n" + //
            "mutilates or falsifies any 5\r\n" + //
            "[book, electronic record, paper, writing] valuable security or account which \r\n" + //
            "belongs to or is in the possession of his employer, or has been received by him for or on behalf of his \r\n" + //
            "employer, or wilfully, and with intent to defraud, makes or abets the making of any false entry in, or \r\n" + //
            "omits or alters or abets the omission or alteration of any material particular from or in. any such 5\r\n" + //
            "[book, \r\n" + //
            "electronic record, paper, writing] valuable security or account, shall be punished with imprisonment of \r\n" + //
            "either description for a term which may extend to seven years, or with fine, or with both.Explanation.\u2014It shall be sufficient in any charge under this section to allege a general intent to \r\n" + //
            "defraud without naming any particular person intended to be defrauded or specifying any particular sum \r\n" + //
            "of money intended to be the subject of the fraud, or any particular day on which the offence was \r\n" + //
            "committed.] ";
    String section_478 ="SECTION 478:[Trade Mark.] Rep. by the Trade and Merchandise Marks Act, 1958 (43 of 1958), s. 135 and\r\n" + //
            "Sch. (w. e. f. 25-11-1959).";
    String section_479 ="SECTION 479:Property mark.\u2014A mark used for denoting that movable property belongs to a particular \r\n" + //
            "person is called a property mark.";
    String section_480 ="SECTION 480:[Using a false trade mark.] Rep. by the Trade and Merchandise Marks Act, 1958 (43 of 1958), s.\r\n" + //
            "135and Sch. (w.e.f. 25- 11-1959).\r";
    String section_481 ="SECTION 481: Using a false property mark.\u2014Whoever marks any movable property or goods or any case, \r\n" + //
            "package or other receptacle containing movable property or goods, or uses any case, package or other \r\n" + //
            "receptacle having any mark thereon, in a manner reasonably calculated to cause it to be believed that the \r\n" + //
            "property or goods so marked, or any property or goods contained in any such receptacle so marked, \r\n" + //
            "belong to a person to whom they do not belong, is said to use a false property mark.";
    String section_482 ="SECTION 482:Punishment for using a false property mark.\u2014Whoever uses 3\r\n" + //
            "***any false property mark \r\n" + //
            "shall, unless he proves that he acted without intent to defraud, be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to one year, or with fine, or with both.";
    String section_483 ="SECTION 483:Counterfeiting a property mark used by another.\u2014Whoever counterfeits any 4\r\n" + //
            "***property \r\n" + //
            "mark used by any other person shall be punished with imprisonment of either description for a term which \r\n" + //
            "may extend to two years, or with fine, or with both.";
    String section_484 ="SECTION 484:Counterfeiting a mark used by a public servant.\u2014Whoever counterfeits any property mark \r\n" + //
            "used by a public servant, or any mark used by a public servant to denote that any property has been \r\n" + //
            "manufactured by a particular person or at a particular time or place, or that the property is of a particular \r\n" + //
            "quality or has passed through a particular office, or that it is entitled to any exemption, or uses as genuine \r\n" + //
            "any such mark knowing the same to be counterfeit, shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to three years, and shall also be liable to fine.\r";
    String section_485 ="SECTION 485:Making or possession of any instrument for counterfeiting a property mark.\u2014Whoever \r\n" + //
            "makes or has in his possession any die, plate or other instrument for the purpose of counterfeiting a \r\n" + //
            "property mark, or has in his possession a property mark for the purpose of denoting that any goods belong \r\n" + //
            "to a person to whom they do not belong, shall be punished with imprisonment of either description for a \r\n" + //
            "term which may extend to three years, or with fine, or with both.";
    String section_486 ="SECTION 486:Selling goods marked with a counterfeit property mark.\u20146\r\n" + //
            "[Whoever sells, or exposes, or has \r\n" + //
            "has in possession for sale, any goods or things with a counterfeit property mark] affixed to or impressed \r\n" + //
            "upon the same or to or upon any case, package or other receptacle in which such goods are contained, \r\n" + //
            "shall, unless he proves\r\n" + //
            "(a) that, having taken all reasonable precautions against committing an offence against this section, he \r\n" + //
            "had at the time of the commission of the alleged offence no reason to suspect the genuineness of the mark, \r\n" + //
            "and\r\n" + //
            "(b) that, on demand made by or on behalf of the prosecutor, he gave all the information in his power \r\n" + //
            "with respect to the persons from whom he obtained such goods or things, or\r\n" + //
            "(c) that otherwise he had acted innocently,\r be punished with imprisonment of either description for a term which may extend to one year, or with \r\n" + //
            "fine, or with both.";
    String section_487 ="SECTION 487:Making a false mark upon any receptacle containing goods.\u2014Whoever makes any false \r\n" + //
            "mark upon any case, package or other receptacle containing goods, in a manner reasonably calculated to \r\n" + //
            "cause any public servant or any other person to believe that such receptacle contains goods which it does \r\n" + //
            "not contain or that it does not contain goods which it does contain, or that the goods contained in such \r\n" + //
            "receptacle are of a nature or quality different from the real nature or quality thereof, shall, unless he \r\n" + //
            "proves that he acted without intent to defraud, be punished with imprisonment of either description for a \r\n" + //
            "term which may extend to three years, or with fine, or with both.";
    String section_488 ="SECTION 488:Punishment for making use of any such false mark.\u2014Whoever makes use of any such false \r\n" + //
            "mark in any manner prohibited by the last foregoing section shall, unless he proves that he acted without \r\n" + //
            "intent to defraud, be punished as if he had committed an offence against that section.";
    String section_489 ="SECTION 489:Tampering with property mark with intent to cause injury.\u2014Whoever removes, destroys, \r\n" + //
            "defaces or adds to any property mark, intending or knowing it to be likely that he may thereby cause \r\n" + //
            "injury to any person, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to one year, or with fine, or with both.]\r";
    String section_489A ="SECTION 489A:Counterfeiting currency-notes or bank-notes.\u2014Whoever counterfeits, or knowingly \r\n" + //
            "performs any part of the process of counterfeiting, any currency-note or bank-note, shall be punished with \r\n" + //
            "2\r\n" + //
            "[imprisonment for life], or with imprisonment of either description for a term which may extend to ten \r\n" + //
            "years, and shall also be liable to fine.\r\n" + //
            "Explanation.\u2014For the purposes of this section and of sections 489B, 3\r\n" + //
            "[489C, 489D and 489E], the \r\n" + //
            "expression \u201Cbank-note\u201D means a promissory note or engagement for the payment of money to bearer on \r\n" + //
            "demand issued by any person carrying on the business of banking in any part of the world, or issued by or \r\n" + //
            "under the authority of any State or Sovereign Power, and intended to be used as equivalent to, or as a \r\n" + //
            "substitute for money.";
    String section_489B ="SECTION 489B: Using as genuine, forged or counterfeit currency-notes or bank-notes.\u2014Whoever sells to, \r\n" + //
            "or buys or receives from, any other person, or otherwise traffics in or uses as genuine, any forged or \r\n" + //
            "counterfeit currency-note or bank-note, knowing or having reason to believe the same to be forged or \r\n" + //
            "counterfeit, shall be punished with 2\r\n" + //
            "[imprisonment for life], or with imprisonment of either description for \r\n" + //
            "a term which may extend to ten years, and shall also be liable to fine";
    String section_489C ="SECTION 489C:Possession of forged or counterfeit currency-notes or bank-notes.\u2014Whoever has in his \r\n" + //
            "possession any forged or counterfeit currency-note or bank-note, knowing or having reason to believe the \r\n" + //
            "same to be forged or counterfeit and intending to use the same as genuine or that it may be used as \r\n" + //
            "genuine, shall be punished with imprisonment of either description for a term which may extend to seven \r\n" + //
            "years, or with fine, or with both.";
    String section_489D ="SECTION 489D: Making or possessing instruments or materials for forging or counterfeiting currency \r\n" + //
            "notes or bank-notes.\u2014Whoever makes, or performs any part of the process of making, or buys or sells \r\n" + //
            "or disposes of, or has in his possession, any machinery, instrument or material for the purpose of being \r\n" + //
            "used, or knowing or having reason to believe that it is intended to be used, for forging or counterfeiting \r\n" + //
            "any currency-note or bank-note, shall be punished with 2\r\n" + //
            "[imprisonment for life], or with imprisonment of \r\n" + //
            "either description for a term which may extend to ten years, and shall also be liable to fine.]";
    String section_489E ="SECTION 489E: Making or using documents resembling currency-notes or bank-notes.\u2014(1) Whoever \r\n" + //
            "makes, or causes to be made, or uses for any purpose whatsoever, or delivers to any person, any document \r\n" + //
            "purporting to be, or in any way resembling, or so nearly resembling as to be calculated to deceive, any \r\n" + //
            "currency-note or bank-note shall be punished with fine which may extend to one hundred rupees.(2) If any person, whose name appears on a document the making of which is an offence under \r\n" + //
            "sub-section (1), refuses, without lawful excuse, to disclose to a police-officer on being so required the \r\n" + //
            "name and address of the person by whom it was printed or otherwise made, he shall be punished with fine \r\n" + //
            "which may extend to two hundred rupees.\r\n" + //
            "(3) Where the name of any person appears on any document in respect of which any person is \r\n" + //
            "charged with an offence under sub- section (1) or on any other document used or distributed in connection \r\n" + //
            "with that document it may, until the contrary is proved, be presumed that that person caused the document \r\n" + //
            "to be made.]";
    String section_490 ="SECTION 490:[Breach of contract of service during voyage or journey.] Rep. by the Workmen's Breach of \r\n" + //
            "Contract (Repealing) Act, 1925 (3 of 1925), s. 2 and Sch.\r";
    String section_491 ="SECTION 491:Breach of contract to attend on and supply wants of helpless person.\u2014Whoever, being \r\n" + //
            "bound by a lawful contract to attend on or to supply the wants of any person who, by reason of youth, or \r\n" + //
            "of unsoundness of mind, or of a disease or bodily weakness, is helpless or incapable of providing for his \r\n" + //
            "own safety or of supplying his own wants, voluntarily omits so to do, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to three months, or with fine which may \r\n" + //
            "extend to two hundred rupees, or with both.\r";
    String section_492 ="SECTION 492:[Breach of contract to serve at distant place to which servant is conveyed at master's expense.] \r\n" + //
            "Rep. by the Workmen's Breach of Contract (Repealing) Act,1925 (3 of 1925), s. 2 and Sch.\r";
    String section_493 ="SECTION 493:Cohabitation caused by a man deceitfully inducing a belief of lawful marriage.\u2014Every man \r\n" + //
            "who by deceit causes any woman who is not lawfully married to him to believe that she is lawfully \r\n" + //
            "married to him and to cohabit or have sexual intercourse with him in that belief, shall be punished with \r\n" + //
            "imprisonment of either description for a term which may extend to ten years, and shall also be liable to \r\n" + //
            "fine.";
    String section_494 ="SECTION 494:Marrying again during lifetime of husband or wife.\u2014Whoever, having a husband or wife \r\n" + //
            "living, marries in any case in which such marriage is void by reason of its taking place during the life of \r\n" + //
            "such husband or wife, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to seven years, and shall also be liable to fine.\r\n" + //
            "Exception.\u2014This section does not extend to any person whose marriage with such husband or wife \r\n" + //
            "has been declared void by a Court of competent jurisdiction,\r\n" + //
            "nor to any person who contracts a marriage during the life of a former husband or wife, if such \r\n" + //
            "husband or wife, at the time of the subsequent marriage, shall have been continually absent from such \r\n" + //
            "person for the space of seven years, and shall not have been heard of by such person as being alive within \r\n" + //
            "that time provided the person contracting such subsequent marriage shall, before such marriage takes \r\n" + //
            "place, inform the person with whom such marriage is contracted of the real state of facts so far as the \r\n" + //
            "same are within his or her knowledge.";
    String section_495 ="SECTION 495:Same offence with concealment of former marriage from person with whom subsequent \r\n" + //
            "marriage is contracted.\u2014Whoever commits the offence defined in the last preceding section having \r\n" + //
            "concealed from the person with whom the subsequent marriage is contracted, the fact of the former \r\n" + //
            "marriage, shall be punished with imprisonment of either description for a term which may extend to ten \r\n" + //
            "years, and shall also be liable to fine.\r";
    String section_496 ="SECTION 496:Marriage ceremony fraudulently gone through without lawful marriage.\u2014Whoever, \r\n" + //
            "dishonestly or with a fraudulent intention, goes through the ceremony of being married, knowing that he \r\n" + //
            "is not thereby lawfully married, shall be punished with imprisonment of either description for a term \r\n" + //
            "which may extend to seven years, and shall also be liable to fine.\r\n" + //
            "";
    String section_497 ="SECTION 497:Adultery.\u2014Whoever has sexual intercourse with a person who is and whom he knows or has \r\n" + //
            "reason to believe to be the wife of another man, without the consent or connivance of that man, such \r\n" + //
            "sexual intercourse not amounting to the offence of rape, is guilty of the offence of adultery, and shall be \r\n" + //
            "punished with imprisonment of either description for a term which may extend to five years, or with fine, \r\n" + //
            "or with both. In such case the wife shall not be punishable as an abettor.";
    String section_498 ="SECTION 498:Enticing or taking away or detaining with criminal intent a married woman.\u2014Whoever \r\n" + //
            "takes or entices away any woman who is and whom he knows or has reason to believe to be the wife of \r\n" + //
            "any other man, from that man, or from any person having the care of her on behalf of that man, with \r\n" + //
            "intent that she may have illicit intercourse with any person, or conceals or detains with that intent any \r\n" + //
            "such woman, shall be punished with imprisonment of either description for a term which may extend to \r\n" + //
            "two years, or with fine, or with both.";
    String section_498A ="SECTION 498A:Husband or relative of husband of a woman subjecting her to cruelty.\u2014Whoever, being \r\n" + //
            "the husband or the relative of the husband of a woman, subjects such woman to cruelty shall be punished \r\n" + //
            "with imprisonment for a term which may extend to three years and shall also be liable to fine.\r\n" + //
            "Explanation.\u2014For the purposes of this section, \u201Ccruelty\u201D means\u2014\r\n" + //
            "(a) anywilful conduct which is of such a nature as is likely to drive the woman to commit suicide \r\n" + //
            "or to cause grave injury or danger to life, limb or health (whether mental or physical) of the woman; \r\n" + //
            "or\r\n" + //
            "(b) harassment of the woman where such harassment is with a view to coercing her or any person \r\n" + //
            "related to her to meet any unlawful demand for any property or valuable security or is on account of \r\n" + //
            "failure by her or any person related to her to meet such demand.]\r";
    String section_499 ="SECTION 499:Defamation.\u2014Whoever, by words either spoken or intended to be read, or by signs or by visible \r\n" + //
            "representations, makes or publishes any imputation concerning any person intending to harm, or knowing \r\n" + //
            "or having reason to believe that such imputation will harm, the reputation of such person, is said, except \r\n" + //
            "in the cases hereinafter excepted, to defame that person.\r\n" + //
            "Explanation 1.\u2014It may amount to defamation to impute anything to a deceased person, if the \r\n" + //
            "imputation would harm the reputation of that person if living, and is intended to be hurtful to the fellings \r\n" + //
            "of his family or other near relatives.\r\n" + //
            "Explanation 2.\u2014It may amount to defamation to make an imputation concerning a company or an \r\n" + //
            "association or collection of persons as such.\r\n" + //
            "Explanation 3.\u2014An imputation in the form of an alternative or expressed ironically, may amount to \r\n" + //
            "defamation.\r\n" + //
            "Explanation 4.\u2014No imputation is said to harm a person's reputation, unless that imputation directly \r\n" + //
            "or indirectly, in the estimation of others, lowers the moral or intellectual character of that person, or \r\n" + //
            "lowers the character of that person in respect of his caste or of his calling, or lowers the credit of that \r\n" + //
            "person, or causes it to be believed that the body of that person is in a lothsome state, or in a state generally \r\n" + //
            "considered as disgraceful.\r First Exception.\u2014Imputation of truth which public good requires to be made or published.\u2014It \r\n" + //
            "is not defamation to impute anything which is true concerning any person, if it be for the public good that \r\n" + //
            "the imputation should be made or published. Whether or not it is for the public good is a question of fact.\r\n" + //
            "Second Exception.\u2014Public conduct of public servants.\u2014It is not defamation to express in good \r\n" + //
            "faith any opinion whatever respecting the conduct of a public servant in the discharge of his public \r\n" + //
            "functions, or respecting his character, so far as his character appears in that conduct, and no further.\r\n" + //"Third Exception.\u2014Conduct of any person touching any public question.\u2014It is not defamation to \r\n" + //
            "express in good faith any opinion whatever respecting the conduct of any person touching any public \r\n" + //
            "question, and respecting his character, so far as his character appears in that conduct, and no further.Fourth Exception.\u2014Publication of reports of proceedings of courts.\u2014It is not defamation to \r\n" + //
            "publish substantially true report of the proceedings of a Court of Justice, or of the result of any such \r\n" + //
            "proceedings.\r\n" + //
            "Explanation.\u2014A Justice of the Peace or other officer holding an enquiry in open Court preliminary to\r\n" + //
            "a trial in a Court of Justice, is a Court within the meaning of the above section.\r\n" + //
            "Fifth Exception.\u2014Merits of case decided in Court or conduct of witnesses and others \r\n" + //
            "concerned.\u2014It is not defamation to express in good faith any opinion whatever respecting the merits of \r\n" + //
            "any case, civil or criminal, which has been decided by a Court of Justice, or respecting the conduct of any \r\n" + //
            "person as a party, witness or agent, in any such case, or respecting the character of such person, as far as \r\n" + //
            "his character appears in that conduct, and no further.Sixth Exception.\u2014Merits of public performance.\u2014It is not defamation to express in good faith any \r\n" + //
            "opinion respecting the merits of any performance which its author has submitted to the judgment of the \r\n" + //
            "public, or respecting the character of the author so far as his character appears in such performance, and\r\n" + //
            "no further.\r\n" + //
            "Explanation.\u2014A performance may be submitted to the judgment of the public expressly or by acts on \r\n" + //
            "the part of the author which imply such submission to the judgment of the public.Seventh Exception.\u2014Censure passed in good faith by person having lawful authority over \r\n" + //
            "another.\u2014It is not defamation in a person having over another any authority, either conferred by law or arising out of a lawful contract made with that other, to pass in good faith any censure on the conduct of \r\n" + //
            "that other in matters to which such lawful authority relates.\r Eighth Exception.\u2014Accusation preferred in good faith to authorised person.\u2014It is not \r\n" + //
            "defamation to prefer in good faith an accusation against any person to any of those who have lawful \r\n" + //
            "authority over that person with respect to the subject-matter of accusation Ninth Exception.\u2014Imputation made in good faith by person for protection of his or other's \r\n" + //
            "interests.\u2014It is not defamation to make an imputation on the character of another provided that the \r\n" + //
            "imputation be made in good faith for the protection of the interests of the person making it, or of any \r\n" + //
            "other person, or for the public good.Tenth Exception.\u2014Caution intended for good of person to whom conveyed or for public good.\u2014\r\n" + //
            "It is not defamation to convey a caution, in good faith, to one person against another, provided that such \r\n" + //
            "caution be intended for the good of the person to whom it is conveyed, or of some person in whom that \r\n" + //
            "person is interested, or for the public good.";
    String section_500 ="SECTION 500:Punishment for defamation.\u2014Whoever defames another shall be punished with simple \r\n" + //
            "imprisonment for a term which may extend to two years, or with fine, or with both.";
    String section_501 ="SECTION 501:Printing or engraving matter known to be defamatory.\u2014Whoever prints or engraves any \r\n" + //
            "matter, knowing or having good reason to believe that such matter is defamatory of any person, shall be \r\n" + //
            "punished with simple imprisonment for a term which may extend to two years, or with fine, or with both.";
    String section_502 ="SECTION 502:Sale of printed or engraved substance containing defamatory matter.\u2014Whoever sells or \r\n" + //
            "offers for sale any printed or engraved substance containing defamatory matter, knowing that it contains \r\n" + //
            "such matter, shall be punished with simple imprisonment for a term which may extend to two years, or \r\n" + //
            "with fine, or with both.";
    String section_503 ="SECTION 503:. Criminal intimidation.\u2014Whoever threatens another with any injury to his person, reputation or \r\n" + //
            "property, or to the person or reputation of any one in whom that person is interested, with intent to cause \r\n" + //
            "alarm to that person, or to cause that person to do any act which he is not legally bound to do, or to omit \r\n" + //
            "to do any act which that person is legally entitled to do, as the means of avoiding the execution of such \r\n" + //
            "threat, commits criminal intimidation.\r\n" + //
            "Explanation.\u2014A threat to injure the reputation of any deceased person in whom the person threatened \r\n" + //
            "is interested, is within this section.";
    String section_504 ="SECTION 504: Intentional insult with intent to provoke breach of the peace.\u2014Whoever intentionally \r\n" + //
            "insults, and thereby gives provocation to any person, intending or knowing it to be likely that such \r\n" + //
            "provocation will cause him to break the public peace, or to commit any other offence, shall be punished \r\n" + //
            "with imprisonment of either description for a term which may extend to two years, or with fine, or with \r\n" + //
            "both.";
    String section_505 ="SECTION 505:Statements conducing to public mischief.\u20142\r\n" + //
            "[(1)] Whoever makes, publishes or circulates \r\n" + //
            "any statement, rumour or report,\u2014\r\n" + //
            "(a) with intent to cause, or which is likely to cause, any officer, soldier, 3\r\n" + //
            "[sailor or airman] in the \r\n" + //
            "Army, 4\r\n" + //
            "[Navy or Air Force] 5\r\n" + //
            "[of India] to mutiny or otherwise disregard or fail in his duty as such; or \r\n" + //
            "(b) with intent to cause, or which is likely to cause, fear or alarm to the public, or to any section \r\n" + //
            "of the public whereby any person may be induced to commit an offence against the State or against \r\n" + //
            "the public tranquility; or\r\n" + //
            "(c) with intent to incite, or which is likely to incite, any class or community of persons to commit \r\n" + //
            "any offence against any other class or community,\r\n" + //
            "shall be punished with imprisonment which may extend to 6\r\n" + //
            "[three years], or with fine, or with both.\r\n" + //
            "7\r\n" + //
            "[(2) Statements creating or promoting enmity, hatred or ill-will between classes.\u2014Whoever \r\n" + //
            "makes, publishes or circulates any statement or report containing rumour or alarming news with intent to \r\n" + //
            "create or promote, or which is likely to create or promote, on grounds of religion, race, place of birth, \r\n" + //
            "residence, language, caste or community or any other ground whatsoever, feelings of enmity, hatred or ill\u0002will between different religious, racial, language or regional groups or castes or communities, shall be \r\n" + //
            "punished with imprisonment which may extend to three years, or with fine, or with both.\r\n" + //
            "(3) Offence under sub-section (2) committed in place of worship, etc.\u2014Whoever commits an \r\n" + //
            "offence specified in sub-section (2) in any place of worship or in any assembly engaged in the \r\n" + //
            "performance of religious worship or religious ceremonies, shall be punished with imprisonment which \r\n" + //
            "may extend to five years and shall also be liable to fine.]\r\n" + //
            "Exception.\u2014It does not amount to an offence, within the meaning of this section, when the person \r\n" + //
            "making, publishing or circulating any such statement, rumour or report, has reasonable grounds for \r\n" + //
            "believing that such statement, rumour or report is true and makes, publishes or circulates it 2\r\n" + //
            "[in good faith \r\n" + //
            "and] without any such intent as aforesaid.";
    String section_506 ="SECTION 506:Punishment for criminal intimidation.\u2014Whoever commits the offence of criminal \r\n" + //
            "intimidation shall be punished with imprisonment of either description for a term which may extend to \r\n" + //
            "two years, or with fine, or with both;\r\n" + //
            "If threat be to cause death or grievous hurt, etc.\u2014and if the threat be to cause death or grievous \r\n" + //
            "hurt, or to cause the destruction of any property by fire, or to cause an offence punishable with death or \r\n" + //
            "8\r\n" + //
            "[imprisonment for life], or with imprisonment for a term which may extend to seven years, or to impute \r\n" + //
            "unchastity to a woman, shall be punished with imprisonment of either description for a term which may \r\n" + //
            "extend to seven years, or with fine, or with both";
    String section_507 ="SECTION 507: Criminal intimidation by an anonymous communication.\u2014Whoever commits the offence of \r\n" + //
            "criminal intimidation by an anonymous communication, or having taken precaution to conceal the name \r\n" + //
            "or abode of the person from whom the threat comes, shall be punished with imprisonment of either \r\n" + //
            "description for a term which may extend to two years, in addition to the punishment provided for the \r\n" + //
            "offence by the last preceding section";
    String section_508 ="SECTION 508:Act caused by inducing person to believe that he will be rendered an object of the Divine \r\n" + //
            "displeasure.\u2014Whoever voluntarily causes or attempts to cause any person to do anything which that \r\n" + //
            "person is not legally bound to do, or to omit to do anything which he is legally entitled to do, by inducing \r\n" + //
            "or attempting to induce that person to believe that he or any person in whom he is interested will become \r\n" + //
            "or will be rendered by some act of the offender an object of Divine displeasure if he does not do the thing \r\n" + //
            "which it is the object of the offender to cause him to do, or if he does the thing which it is the object of the \r\n" + //
            "offender to cause him to omit, shall be punished with imprisonment of either description for a term which \r\n" + //
            "may extend to one year, or with fine, or with both.";
    String section_509 ="SECTION 509 :Word, gesture or act intended to insult the modesty of a woman.\u2014Whoever, intending to \r\n" + //
            "insult the modesty of any woman, utters any words, makes any sound or gesture, or exhibits any object, \r\n" + //
            "intending that such word or sound shall be heard, or that such gesture or object shall be seen, by such \r\n" + //
            "woman, or intrudes upon the privacy of such woman, 1\r\n" + //
            "[shall be punished with simple imprisonment for a \r\n" + //
            "term which may extend to three years, and also with fine].";
    String section_510 ="SECTION 510: Misconduct in public by a drunken person.\u2014Whoever, in a state of intoxication, appears in \r\n" + //
            "any public place, or in any place which it is a trespass in him to enter, and there conducts himself in such \r\n" + //
            "a manner as to cause annoyance to any person, shall be punished with simple imprisonment for a term \r\n" + //
            "which may extend to twenty-four hours, or with fine which may extend to ten rupees, or with both.\r";
    String section_511 ="SECTION 511: Punishment for attempting to commit offences punishable with imprisonment for life or \r\n" + //
            "other imprisonment.\u2014Whoever attempts to commit an offence punishable by this Code with \r\n" + //
            "2\r\n" + //
            "[imprisonment for life] or imprisonment, or to cause such an offence to be committed, and in such \r\n" + //
            "attempt does any act towards the commission of the offence, shall, where no express provision is made by \r\n" + //
            "this Code for the punishment of such attempt, be punished with 3\r\n" + //
            "[imprisonment of any description \r\n" + //
            "provided for the offence, for a term which may extend to one-half of the imprisonment for life or, as the \r\n" + //
            "case may be, one- half of the longest term of imprisonment provided for that offence], or with such fine as \r\n" + //
            "is provided for the offence, or with both.";



}