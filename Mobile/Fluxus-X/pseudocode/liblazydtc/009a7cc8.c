/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7cc8
 */

pitem * pitem_new(uchar *prio64be,void *data)

{
  pitem *ppVar1;
  undefined8 uVar2;
  
  ppVar1 = CRYPTO_malloc(0x18,"ssl/pqueue.c",0x14);
  if (ppVar1 == (pitem *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/pqueue.c",0x17,"pitem_new");
    ERR_set_error(0x14,0xc0100,0);
    ppVar1 = (pitem *)0x0;
  }
  else {
    uVar2 = *(undefined8 *)prio64be;
    ppVar1->next = (_pitem *)0x0;
    *(undefined8 *)ppVar1->priority = uVar2;
    ppVar1->data = data;
  }
  return ppVar1;
}

