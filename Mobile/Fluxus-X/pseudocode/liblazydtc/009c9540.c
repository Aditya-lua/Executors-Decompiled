/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9540
 */

bool dtls1_retrieve_buffered_record(long param_1,long param_2)

{
  pitem *item;
  long lVar1;
  long *plVar2;
  
  item = pqueue_pop(*(pqueue *)(param_2 + 8));
  if (item != (pitem *)0x0) {
    plVar2 = item->data;
    SSL3_BUFFER_release((long *)(param_1 + 0xc78));
    lVar1 = *plVar2;
    *(long *)(param_1 + 0x1cb0) = plVar2[1];
    *(long *)(param_1 + 0x1ca8) = lVar1;
    lVar1 = plVar2[6];
    *(long *)(param_1 + 0xca0) = plVar2[7];
    *(long *)(param_1 + 0xc98) = lVar1;
    lVar1 = plVar2[4];
    *(long *)(param_1 + 0xc90) = plVar2[5];
    *(long *)(param_1 + 0xc88) = lVar1;
    lVar1 = plVar2[2];
    *(long *)(param_1 + 0xc80) = plVar2[3];
    *(long *)(param_1 + 0xc78) = lVar1;
    memcpy((void *)(param_1 + 0x12a8),plVar2 + 8,0x50);
    lVar1 = *plVar2;
    *(undefined4 *)(param_1 + 0x1cfa) = *(undefined4 *)(lVar1 + 5);
    *(undefined2 *)(param_1 + 0x1cfe) = *(undefined2 *)(lVar1 + 9);
    CRYPTO_free(item->data);
    pitem_free(item);
  }
  return item != (pitem *)0x0;
}

