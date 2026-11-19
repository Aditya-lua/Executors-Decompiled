/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f1350
 */

void ASN1_STRING_clear_free(int *param_1)

{
  undefined8 uVar1;
  
  if (param_1 != (int *)0x0) {
    if ((*(void **)(param_1 + 2) != (void *)0x0) && ((*(byte *)(param_1 + 4) >> 4 & 1) == 0)) {
      OPENSSL_cleanse(*(void **)(param_1 + 2),(long)*param_1);
    }
    uVar1 = *(undefined8 *)(param_1 + 4);
    if (((uint)uVar1 >> 4 & 1) == 0) {
      CRYPTO_free(*(void **)(param_1 + 2));
    }
    if (((uint)uVar1 >> 7 & 1) == 0) {
      CRYPTO_free(param_1);
      return;
    }
  }
  return;
}

