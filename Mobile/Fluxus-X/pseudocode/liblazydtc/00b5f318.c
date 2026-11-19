/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5f318
 */

void FUN_00b5f318(long param_1)

{
  int iVar1;
  void *pvVar2;
  
  if (param_1 == 0) {
    return;
  }
  EVP_MD_CTX_free(*(undefined8 *)(param_1 + 0x28));
  EVP_MD_free(*(undefined8 *)(param_1 + 0x20));
  EVP_MD_free(*(undefined8 *)(param_1 + 0x70));
  CRYPTO_free(*(void **)(param_1 + 8));
  pvVar2 = *(void **)(param_1 + 0xb8);
  if (pvVar2 == (void *)0x0) {
    pvVar2 = (void *)0x0;
  }
  else {
    iVar1 = RSA_size(*(RSA **)(param_1 + 0x10));
    OPENSSL_cleanse(pvVar2,(long)iVar1);
    pvVar2 = *(void **)(param_1 + 0xb8);
  }
  CRYPTO_free(pvVar2);
  *(undefined8 *)(param_1 + 0xb8) = 0;
  RSA_free(*(RSA **)(param_1 + 0x10));
  CRYPTO_clear_free(param_1,0xc0,"providers/implementations/signature/rsa_sig.c",0x3d4);
  return;
}

