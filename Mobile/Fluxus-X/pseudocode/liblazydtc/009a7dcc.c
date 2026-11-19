/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7dcc
 */

pitem * pqueue_insert(pqueue pq,pitem *item)

{
  _pitem *p_Var1;
  int iVar2;
  _pitem *__s1;
  _pitem *p_Var3;
  
  if (*(_pitem **)pq != (_pitem *)0x0) {
    p_Var1 = *(_pitem **)pq;
    p_Var3 = (_pitem *)0x0;
    do {
      __s1 = p_Var1;
      iVar2 = memcmp(__s1,item,8);
      if (0 < iVar2) {
        item->next = __s1;
        if (p_Var3 != (_pitem *)0x0) {
          pq = (pqueue)&p_Var3->next;
        }
        goto LAB_009a7e38;
      }
      if (iVar2 == 0) {
        return (pitem *)0x0;
      }
      p_Var1 = __s1->next;
      p_Var3 = __s1;
    } while (__s1->next != (_pitem *)0x0);
    pq = (pqueue)&__s1->next;
    item->next = (_pitem *)0x0;
  }
LAB_009a7e38:
  *(pitem **)pq = item;
  return item;
}

