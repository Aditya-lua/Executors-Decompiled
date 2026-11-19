/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b244
 */

undefined8 ossl_x509_crl_set0_libctx(long param_1,undefined8 param_2,char *param_3)

{
  char *pcVar1;
  
  if (param_1 != 0) {
    *(undefined8 *)(param_1 + 0xe8) = param_2;
    CRYPTO_free(*(void **)(param_1 + 0xf0));
    *(undefined8 *)(param_1 + 0xf0) = 0;
    if (param_3 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_3,"crypto/x509/x_crl.c",0x210);
      *(char **)(param_1 + 0xf0) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        return 0;
      }
    }
  }
  return 1;
}

