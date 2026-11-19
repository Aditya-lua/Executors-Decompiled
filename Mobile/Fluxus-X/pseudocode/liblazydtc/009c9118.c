/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9118
 */

void DTLS_RECORD_LAYER_free(long param_1)

{
  if (*(long *)(param_1 + 0x10b8) != 0) {
    DTLS_RECORD_LAYER_clear();
    pqueue_free(*(pqueue *)(*(long *)(param_1 + 0x10b8) + 0x30));
    pqueue_free(*(pqueue *)(*(long *)(param_1 + 0x10b8) + 0x40));
    pqueue_free(*(pqueue *)(*(long *)(param_1 + 0x10b8) + 0x50));
    CRYPTO_free(*(void **)(param_1 + 0x10b8));
    *(undefined8 *)(param_1 + 0x10b8) = 0;
  }
  return;
}

