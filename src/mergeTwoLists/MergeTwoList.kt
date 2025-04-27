package mergeTwoLists

class MergeTwoList {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var resultNode: ListNode? = ListNode(0)
        var mergedPointer = resultNode

        var pointer1 = list1
        var pointer2 = list2


        while(pointer1 != null || pointer2 != null){
            if(pointer1?.value!! <= pointer2?.value!!){
                mergedPointer?.next = pointer1
                pointer1 = pointer1.next
            }else{
                mergedPointer = pointer2
                pointer2 = pointer2.next
            }
            mergedPointer = mergedPointer?.next
        }

        return resultNode
    }
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}

