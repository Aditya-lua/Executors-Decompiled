/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad789c
 */

undefined8 FUN_00ad789c(long param_1,long param_2)

{
  int num;
  RSA *rsa;
  void *pvVar1;
  
  if (*(long *)(param_1 + 0x38) == 0) {
    rsa = (RSA *)EVP_PKEY_get0_RSA(*(undefined8 *)(param_2 + 0x88));
    num = RSA_size(rsa);
    pvVar1 = CRYPTO_malloc(num,"crypto/rsa/rsa_pmeth.c",0x73);
    *(void **)(param_1 + 0x38) = pvVar1;
    if (pvVar1 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x74,"setup_tbuf");
      ERR_set_error(4,0xc0100,0);
      return 0;
    }
  }
  return 1;
}

