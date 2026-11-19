/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa478c
 */

void FUN_00aa478c(void *param_1)

{
  undefined8 *puVar1;
  void *ptr;
  long lVar2;
  ulong uVar3;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  *(byte *)((long)param_1 + 0x48) = *(byte *)((long)param_1 + 0x48) | 2;
  CRYPTO_free(*(void **)((long)param_1 + 0x28));
  OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + 8),&LAB_00aa48a8);
  OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + 0x10),&LAB_00aa48ec);
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x18));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x20));
  ptr = *(void **)((long)param_1 + 0x30);
  if (*(long *)((long)param_1 + 0x38) != 0) {
    lVar2 = 0;
    uVar3 = 0;
    do {
      puVar1 = (undefined8 *)((long)ptr + lVar2);
      CRYPTO_free((void *)*puVar1);
      CRYPTO_free((void *)puVar1[1]);
      OPENSSL_sk_pop_free(puVar1[3],FUN_00aa27d0);
      ptr = *(void **)((long)param_1 + 0x30);
      uVar3 = uVar3 + 1;
      lVar2 = lVar2 + 0x28;
    } while (uVar3 < *(ulong *)((long)param_1 + 0x38));
  }
  CRYPTO_free(ptr);
  CRYPTO_free(param_1);
  return;
}

