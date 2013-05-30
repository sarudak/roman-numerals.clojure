(ns roman-numeral.converter)

(defn get-value-of-pair [[left right]]
  (if (< left right) (* -1 left) left)
 )

(defn get-pairs [numerals]
 (partition 2 1 (flatten [numerals 0]))
  )

(defn get-value-of-pairs [pairs]
  (map get-value-of-pair pairs)
  )

(defn parse-roman-numeral [roman-numeral]
  (let [character-map {
                         \I 1
                          \V 5
                          \X 10
                          \L 50
                          \C 100
                          \D 500
                          \M 1000}]

    (->>
      (map character-map roman-numeral)
      (get-pairs)
      (get-value-of-pairs)
      (apply +))
  ))



(defn convert-to-roman-numeral [number] "")