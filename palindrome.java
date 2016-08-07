bool palindromeOrNot(node *head) {
  node *tailPointer;
  node *headLocal=head;
  node *reverseList=reverseLinkedListIteratively(head);
  int response=1;

  while(headLocal != NULL && reverseList!=NULL) {
    if(headLocal->id==reverseList->id) {
      headLocal=headLocal->next;
      reverseList=reverseList->next;
    }
    else
      return false;
  }

  if(headLocal == NULL && reverseList==NULL)
    return fasle;
  else 
    return true;
}