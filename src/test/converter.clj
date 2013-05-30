(ns test.converter
  (:use midje.sweet
        roman-numeral.converter))

(fact "When parsing roman numerals symbols are valued correctly"
  (parse-roman-numeral "I") => 1
;  (parse-roman-numeral "V") => 5
;  (parse-roman-numeral "X") => 10
;  (parse-roman-numeral "L") => 50
;  (parse-roman-numeral "C") => 100
;  (parse-roman-numeral "D") => 500
;  (parse-roman-numeral "M") => 1000
  )

;(fact "When parsing roman numerals the value of symbols are added together"
;  (parse-roman-numeral "III") => 3
;  (parse-roman-numeral "XV") => 15
;  (parse-roman-numeral "MDCC") => 1700
;  (parse-roman-numeral "MMMCCCXXXIII") => 3333
;  )
;
;(fact "When a lower value symbol occurs before a higher value symbol it's value is subtracted from the higher value symbol"
;  (parse-roman-numeral "IV") => 4
;  (parse-roman-numeral "CD") => 400
;  (parse-roman-numeral "IX") => 9
;  (parse-roman-numeral "CMXCIX") => 999
;  )