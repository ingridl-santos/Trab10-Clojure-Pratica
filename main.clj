;; Ingrid Lima dos Santos
;; q1. Na aula disponível em: https://replit.com/@frankalcantara/ClojureAula2?v=1 foram destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em Clojure. Sua primeira tarefa será descrever cada uma destas funções e apresentar dois exemplos de uso de cada uma delas. Lembre-se os exemplos precisam ser utilizados de forma que o resutado da função possa ser visto no terminal.   

;; assoc: se aplicado a um map, retorna um novo map do mesmo tipo (hash/sort), que contém o mapeamento de chave(s) para valor(s). E se aplicado a um vetor, retorna um novo vetor que contém valor no índice.
(println (format "\nFunc 1. Entrada: assoc %s; Saida: %s" (str "nil :key1 4") (assoc nil :key1 4)))
(println (format "Func 1. Entrada: assoc %s; Saida: %s" (str ":key1 'value' :key2 'another value'") (assoc {} :key1 "value" :key2 "another value")))

;; dissoc: retorna um novo map do mesmo tipo (hash/sort), que não contém um map para chave(s).
(println (format "\nFunc 1. Entrada: dissoc %s; Saida: %s" (str "{:a 1 :b 2 :c 3} :c :b") (dissoc {:a 1 :b 2 :c 3} :c :b)))
(println (format "Func 1. Entrada: dissoc %s; Saida: %s" (str "{:a 1 :b 2 :c 3} :b") (dissoc {:a 1 :b 2 :c 3} :b)))

;; range: retorna uma sequência preguiçosa de numeros do início (inclusive) ao fim (exclusivo), por etapa, em que o padrão inicial é 0, o passo é 1 e o fim é infinito. Quando step é igual a 0, retorna uma sequência infinita de início. Quando o início é igual ao fim, retorna uma lista vazia. 
(println (format "\nFunc 1. Entrada: range %s; Saida: %s;" (str "range 10 20") (range 10 20)))
(println (format "Func 1. Entrada: range %s; Saida: %s;" (str "range 35") (range 35)))

;; map: retorna uma sequência preguiçosa que consiste no resultado da aplicação de f ao conjunto de primeiros itens de cada colll, seguido pela aplicação de f ao conjunto de segundos itens em cada colll, até que qualquer uma das collls se esgote. Quaisquer itens restantes em outras colagens são ignorados. A função f deve aceitar argumentos number-of-cols. E retorna um transdutor quando nenhuma coleçao é fornecida.
(println "\nFunc 1. Entrada: map [1 2 3] [4 5 6]; Saida:" (map + [1 2 3] [4 5 6]))
(println "Func 1. Entrada: map {2 'two' 3 'three'} [5 3 2]; Saida:" (map {2 "two" 3 "three"} [5 3 2]))

;; inc: retorna um número um maior que o numéro de entrada.
(println (format "\nFunc 1. Entrada: inc %s; Saida: %d;" (str "inc 2") (inc 2)))
(println (format "Func 1. Entrada: inc %s; Saida: %d;" (str "inc 100") (inc 100)))

;; filter: retorna uma sequência lenta dos itens em coll para os quais (item pred) retorna true lógico. pred deve estar livre de efeitos colaterais. E retorna um transdutor quando nenhuma coleção é fornecida.
(println "\nFunc 1. Entrada: filter even? 10; Saida:" (filter even? (range 10)))
(println "Func 1. Entrada: filter #{0 1 2 3} #{2 3 4 5}; Saida:" (filter #{0 1 2 3} #{2 3 4 5}))

;; odd: retorna verdadeiro se n for ímpar, lança uma exceção se n não for um inteiro
(println (format "\nFunc 1. Entrada: odd %s; Saida: %s;" (str "3") (odd? 3)))
(println (format "Func 1. Entrada: odd %s; Saida: %s;" (str "44") (odd? 44)))

;; into: retorna uma nova coll que consiste em to-coll com todos os itens de from-coll conjugados. Um transdutor pode ser fornecido.
(println (format "\nFunc 1. Entrada: into %s; Saida: %s;" (str "[1 2 3] '(4 5 6)") (into [1 2 3] '(4 5 6))))
(println (format "Func 1. Entrada: into %s; Saida: %s;" (str "{1 2, 3 4}") (into [] {1 2, 3 4})))

;; nth: retorna o valor no índice. get retorna nil se o índice estiver fora dos limites, nth lança uma exceção, a menos que not-found seja fornecido.
(println (format "\nFunc 1. Entrada: nth %s; Saida: %s;" (str "[0 1 2] 77 1337") (nth [0 1 2] 77 1337)))
(println (format "Func 1. Entrada: nth %s; Saida: %s;" (str "['first'] -1 'this is not python'") (nth ["first"] -1 "this is not python")))

;; conj: retorna uma nova coleção com o xs 'adicionado'. (conj nil item) retorna (item). A 'adição' pode ocorrer em diferentes 'lugares' dependendo do tipo.
(println (format "\nFunc 1. Entrada: conj %s; Saida: %s;" (str "[1 2 3] 4") (conj [1 2 3] 4)))
(println (format "Func 1. Entrada: conj %s; Saida: %s;" (str "'(1 2 3) 4") (conj '(1 2 3) 4)))

;; sort: retorn uma sequência ordenada de itens em coll.
(println (format "\nFunc 1. Entrada: sort %s; Saida: %s;" (str "[3 1 2 4]") (sort [3 1 2 4])))
(println (format "Func 1. Entrada: sort %s; Saida: %s;" (str "{:foo 5, :bar 2, :baz 10}") (sort > (vals {:foo 5, :bar 2, :baz 10}))))

;; partition-by: aplica f a cada valor em col, dividindo-o cada vez que f retorna um novo valor. Retorna uma sequência lenta de partições. E retorna um transdutor com estado quando nenhuma coleção é fornecida.
(println "\nFunc 1. Entrada: [1 1 1 2 2 3 3]; Saida:" (partition-by odd? [1 1 1 2 2 3 3]))
(println "Func 1. Entrada: [1 2 3 4 5]; Saida:" (partition-by #(= 3 %) [1 2 3 4 5]))

;; filter: retorna uma sequência lenta dos itens em coll para os quais (item pred) retorna true lógico. pred deve estar livre de efeitos colaterais. E retorna um transdutor quando nenhuma coleção é fornecida.
(println "\nFunc 1. Entrada: 7; Saida:" (filter odd? (range 7)))
(println "Func 1. Entrada: 15; Saida:" (filter even? (range 15)))

;; empty: Returns an empty collection of the same category as coll, or nil
(println (format "\nFunc 1. Entrada: %s; Saida: %s;" (str "[1 2 3]") (empty [1 2 3])))
(println (format "Func 1. Entrada: %s; Saida: %s;" (str "1") (empty 1)))

;; count: retorna o número de itens na coleção. (contagem nula) retorna 0.
(println (format "\nFunc 1. Entrada: %s; Saida: %s;" (str "[1 2 3 4]") (count [1 2 3 4])))
(println (format "Func 1. Entrada: %s; Saida: %s;" (str "nil") (count nil)))

;; char: convert para char.
(println (format "\nFunc 1. Entrada: %s; Saida: %s;" (str "97") (char 97)))
(println (format "Func 1. Entrada: %s; Saida: %s;" (str "88") (char 88)))

;; q2. Utilizando a linguagem Clojure, crie uma função chamada ehPrimo que receba um inteiro e devolva True caso este inteiro seja verdadeiro e False caso contrário.
(defn ehPrimo? [n]
  (empty? (filter #(= 0 (mod n %)) (range 2 n))))

(println (format "\nFunc 2. Entrada: %s; Saida: %s" (str "4") (ehPrimo? 4)))
(println (format "Func 2. Entrada: %s; Saida: %s" (str "11") (ehPrimo? 11)))

;; q3. Utilizando a linguagem Clojure, crie uma função chamada fatoresPrimos que receba um inteiro e devolva uma lista dos seus fatores primos. Decomposição em fatores primos é uma tarefa fundamental da aritmética.
(defn fatoresPrimos
  ([n] (fatoresPrimos 2 n))
  ([f n]
   (if (> n 1)
     (if (= 0 (mod n f))
       (cons f (fatoresPrimos f (/ n f)))
       (recur (inc f) n))
     ())))

(println (format "\nFunc 3. Entrada: %s; Saida: %s" (str "144") (fatoresPrimos 144)))
(println (format "Func 3. Entrada: %s; Saida: %s" (str "15") (fatoresPrimos 15)))

;; q4. Utilizando a linguagem Clojure, crie uma função chamada todosPrimos que receba dois valores inteiros e devolve todos os números primos que existam entre estes dois valores.
(defn todosPrimos [from to]
  (filter ehPrimo? (range from (inc to))))
(println "\nFunc 4. Entrada: 1 21; Saida: " (todosPrimos 1 21))
(println "Func 4. Entrada: 5 100; Saida: " (todosPrimos 5 100))

