/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9fe78
 */

void OSSL_PARAM_free(void *param_1)

{
  long lVar1;
  long lVar2;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  lVar1 = (long)param_1 + -0x10;
  do {
    lVar2 = lVar1;
    lVar1 = lVar2 + 0x28;
  } while (*(long *)(lVar2 + 0x10) != 0);
  if (*(int *)(lVar2 + 0x18) == 0x7f) {
    CRYPTO_secure_clear_free
              (*(undefined8 *)(lVar2 + 0x20),*(undefined8 *)(lVar2 + 0x28),"crypto/params_dup.c",
               0xe8);
  }
  CRYPTO_free(param_1);
  return;
}

