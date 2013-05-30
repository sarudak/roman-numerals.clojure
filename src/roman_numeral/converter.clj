(ns roman-numeral.converter)

(def numeral-to-value-mapping {
                                \I 1
                                \V 5
                                \X 10
                                \L 50
                                \C 100
                                \D 500
                                \M 1000})

(defn parse-roman-numeral [roman-numerals]
  (loop [numeral-values (map numeral-to-value-mapping roman-numerals)
         sum 0]
    (if (seq numeral-values)
      (let [[current next] numeral-values
            add-or-subtract (if (and next (> next current)) - +)]
        (recur (rest numeral-values) (add-or-subtract sum current)) )
      sum)
  ))

(defn convert-to-roman-numeral [number] "")