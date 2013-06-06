(ns helsinki-info.test.search-utils
  (:use clojure.test
        helsinki-info.search-utils))

(deftest escapingSearchTerms

  (testing "hyphenated terms are escaped"
    (is (= "\"foo-bar\" baz" (escapeSearchString "foo-bar baz"))))

  (testing "leading hyphen is removed"
    (is (= "test" (escapeSearchString "-test")))))