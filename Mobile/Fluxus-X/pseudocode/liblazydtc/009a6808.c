/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6808
 */

void dtls1_free(long param_1)

{
  pitem *item;
  void *ptr;
  
  DTLS_RECORD_LAYER_free(param_1 + 0xc58);
  ssl3_free(param_1);
  ptr = (void *)0x0;
  if (*(long *)(param_1 + 0x4b8) != 0) {
    item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118));
    if (item != (pitem *)0x0) {
      do {
        dtls1_hm_fragment_free(item->data);
        pitem_free(item);
        item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118));
      } while (item != (pitem *)0x0);
    }
    dtls1_clear_sent_buffer(param_1);
    pqueue_free(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x118));
    pqueue_free(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x120));
    ptr = *(void **)(param_1 + 0x4b8);
  }
  CRYPTO_free(ptr);
  *(undefined8 *)(param_1 + 0x4b8) = 0;
  return;
}

