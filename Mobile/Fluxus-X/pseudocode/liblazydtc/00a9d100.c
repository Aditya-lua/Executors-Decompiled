/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d100
 */

void OSSL_PARAM_BLD_free(void *param_1)

{
  int iVar1;
  void *ptr;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  iVar1 = OPENSSL_sk_num(*(undefined8 *)((long)param_1 + 0x10));
  if (0 < iVar1) {
    do {
      ptr = (void *)OPENSSL_sk_pop(*(undefined8 *)((long)param_1 + 0x10));
      CRYPTO_free(ptr);
      iVar1 = iVar1 + -1;
    } while (iVar1 != 0);
  }
  OPENSSL_sk_free(*(undefined8 *)((long)param_1 + 0x10));
  CRYPTO_free(param_1);
  return;
}

