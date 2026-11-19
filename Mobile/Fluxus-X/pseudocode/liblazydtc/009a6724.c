/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6724
 */

void dtls1_clear_received_buffer(long param_1)

{
  pitem *item;
  
  item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118));
  if (item != (pitem *)0x0) {
    do {
      dtls1_hm_fragment_free(item->data);
      pitem_free(item);
      item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118));
    } while (item != (pitem *)0x0);
  }
  return;
}

