(ns codewars-clojure.moves-in-squared-strings-i.solution-test
  (:require [clojure.test :refer :all]
            [codewars-clojure.moves-in-squared-strings-i.solution :as solution]))

(deftest test-split-str
  (is (= (solution/split-str "") []))
  (is (= (solution/split-str "abcd") ["abcd"]))
  (is (= (solution/split-str "abcd\nefgh\nijkl\nmnop") ["abcd" "efgh" "ijkl" "mnop"])))

(deftest test-join-list
  (is (= (solution/join-list []) ""))
  (is (= (solution/join-list ["abcd"]) "abcd"))
  (is (= (solution/join-list ["abcd" "efgh" "ijkl" "mnop"]) "abcd\nefgh\nijkl\nmnop")))

(deftest test-vert-mirror
  (is (= (solution/vert-mirror "") ""))
  (is (= (solution/vert-mirror "abcd") "dcba"))
  (is (= (solution/vert-mirror "abcd\nefgh\nijkl\nmnop") "dcba\nhgfe\nlkji\nponm")))

(deftest test-hor-mirror
  (is (= (solution/hor-mirror "") ""))
  (is (= (solution/hor-mirror "abcd") "abcd"))
  (is (= (solution/hor-mirror "abcd\nefgh") "efgh\nabcd"))
  (is (= (solution/hor-mirror "abcd\nefgh\nijkl") "ijkl\nefgh\nabcd"))
  (is (= (solution/hor-mirror "abcd\nefgh\nijkl\nmnop") "mnop\nijkl\nefgh\nabcd")))

(deftest test-oper
  (is (= (solution/oper solution/vert-mirror "abcd\nefgh\nijkl\nmnop") "dcba\nhgfe\nlkji\nponm"))
  (is (= (solution/oper solution/hor-mirror "abcd\nefgh\nijkl\nmnop") "mnop\nijkl\nefgh\nabcd")))
