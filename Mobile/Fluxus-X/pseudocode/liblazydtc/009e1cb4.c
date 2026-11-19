/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1cb4
 */

undefined8 dtls1_retransmit_buffered_messages(long param_1)

{
  int iVar1;
  pitem *ppVar2;
  undefined4 local_24;
  pitem *local_18;
  
  local_24 = 0;
  local_18 = pqueue_iterator(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x120));
  do {
    ppVar2 = pqueue_next(&local_18);
    if (ppVar2 == (pitem *)0x0) {
      return 1;
    }
    iVar1 = dtls1_retransmit_message
                      (param_1,(uint)*(ushort *)((long)ppVar2->data + 0x10) * 2 -
                               *(int *)((long)ppVar2->data + 0x28),&local_24);
  } while (0 < iVar1);
  return 0xffffffff;
}

