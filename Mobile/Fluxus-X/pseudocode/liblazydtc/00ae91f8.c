/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae91f8
 */

void OPENSSL_sk_pop_free(int *param_1,code *param_2)

{
  int iVar1;
  long lVar2;
  
  if (param_1 == (int *)0x0) {
    return;
  }
  iVar1 = *param_1;
  if (0 < iVar1) {
    lVar2 = 0;
    do {
      if (*(long *)(*(long *)(param_1 + 2) + lVar2 * 8) != 0) {
        (*param_2)();
        iVar1 = *param_1;
      }
      lVar2 = lVar2 + 1;
    } while (lVar2 < iVar1);
  }
  CRYPTO_free(*(void **)(param_1 + 2));
  CRYPTO_free(param_1);
  return;
}

