/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6778
 */

void dtls1_clear_sent_buffer(long param_1)

{
  pitem *item;
  void *pvVar1;
  
  item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x120));
  if (item != (pitem *)0x0) {
    do {
      pvVar1 = item->data;
      if (*(int *)((long)pvVar1 + 0x28) != 0) {
        if (*(EVP_CIPHER_CTX **)(param_1 + 0x878) != *(EVP_CIPHER_CTX **)((long)pvVar1 + 0x30)) {
          EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)((long)pvVar1 + 0x30));
        }
        if (*(long *)(param_1 + 0x890) != *(long *)((long)pvVar1 + 0x38)) {
          EVP_MD_CTX_free();
        }
      }
      dtls1_hm_fragment_free(pvVar1);
      pitem_free(item);
      item = pqueue_pop(*(pqueue *)(*(long *)(param_1 + 0x4b8) + 0x120));
    } while (item != (pitem *)0x0);
  }
  return;
}

