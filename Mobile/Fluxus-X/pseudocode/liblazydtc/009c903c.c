/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c903c
 */

undefined8 DTLS_RECORD_LAYER_new(long param_1)

{
  void *ptr;
  pqueue p_Var1;
  undefined8 uVar2;
  
  ptr = CRYPTO_malloc(0x68,"ssl/record/rec_layer_d1.c",0x17);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_d1.c",0x18,"DTLS_RECORD_LAYER_new");
    ERR_set_error(0x14,0xc0100,0);
    uVar2 = 0;
  }
  else {
    *(void **)(param_1 + 0x10b8) = ptr;
    p_Var1 = pqueue_new();
    *(pqueue *)((long)ptr + 0x30) = p_Var1;
    p_Var1 = pqueue_new();
    *(pqueue *)((long)ptr + 0x40) = p_Var1;
    p_Var1 = pqueue_new();
    *(pqueue *)((long)ptr + 0x50) = p_Var1;
    if (((*(pqueue *)((long)ptr + 0x30) == (pqueue)0x0) || (p_Var1 == (pqueue)0x0)) ||
       (*(long *)((long)ptr + 0x40) == 0)) {
      pqueue_free(*(pqueue *)((long)ptr + 0x30));
      pqueue_free(*(pqueue *)((long)ptr + 0x40));
      pqueue_free(*(pqueue *)((long)ptr + 0x50));
      CRYPTO_free(ptr);
      uVar2 = 0;
      *(undefined8 *)(param_1 + 0x10b8) = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

