@pytest.fixture
def test_list():
    list=[3,6,8,9,4,2]
    return list

def test_listsum():
    return sum(list)
class TestSumlist():
    def test_sum(self):
        numbers=[1,2,3,4,5,6,7,8,9,,10]
        self.assertEqual(sum_list(numbers),55))

