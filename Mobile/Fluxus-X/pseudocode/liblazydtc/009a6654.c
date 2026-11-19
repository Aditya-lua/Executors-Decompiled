/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6654
 */

ulong dtls1_new(long param_1)

{
  int iVar1;
  ulong uVar2;
  void *ptr;
  pqueue p_Var3;
  
  uVar2 = DTLS_RECORD_LAYER_new(param_1 + 0xc58);
  if (((int)uVar2 != 0) && (uVar2 = ssl3_new(param_1), (int)uVar2 != 0)) {
    ptr = (void *)CRYPTO_zalloc(0x210,"ssl/d1_lib.c",0x4d);
    if (ptr != (void *)0x0) {
      p_Var3 = pqueue_new();
      *(pqueue *)((long)ptr + 0x118) = p_Var3;
      p_Var3 = pqueue_new();
      *(pqueue *)((long)ptr + 0x120) = p_Var3;
      if (*(int *)(param_1 + 0x38) != 0) {
        *(undefined8 *)((long)ptr + 0x100) = 0xff;
      }
      *(undefined8 *)((long)ptr + 0x128) = 0;
      *(undefined8 *)((long)ptr + 0x130) = 0;
      if ((p_Var3 != (pqueue)0x0) && (*(pqueue *)((long)ptr + 0x118) != (pqueue)0x0)) {
        *(void **)(param_1 + 0x4b8) = ptr;
        iVar1 = (**(code **)(*(long *)(param_1 + 8) + 0x18))(param_1);
        return (ulong)(iVar1 != 0);
      }
      pqueue_free(*(pqueue *)((long)ptr + 0x118));
      pqueue_free(*(pqueue *)((long)ptr + 0x120));
      CRYPTO_free(ptr);
    }
    ssl3_free(param_1);
    uVar2 = 0;
  }
  return uVar2;
}

