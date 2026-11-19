/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac00d0
 */

undefined8
FUN_00ac00d0(undefined8 *param_1,int *param_2,long param_3,undefined8 param_4,size_t param_5)

{
  int iVar1;
  undefined8 uVar2;
  EVP_PKEY_CTX *ctx;
  uchar *out;
  undefined8 uVar3;
  size_t local_48;
  
  uVar3 = *(undefined8 *)(param_3 + 0x28);
  uVar2 = ossl_pkcs7_ctx_get0_libctx(uVar3);
  uVar3 = ossl_pkcs7_ctx_get0_propq(uVar3);
  ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(uVar2,param_4,uVar3);
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    uVar2 = 0xffffffff;
  }
  else {
    iVar1 = EVP_PKEY_decrypt_init(ctx);
    if ((iVar1 < 1) ||
       (iVar1 = EVP_PKEY_decrypt(ctx,(uchar *)0x0,&local_48,
                                 *(uchar **)(*(int **)(param_3 + 0x18) + 2),
                                 (long)**(int **)(param_3 + 0x18)), iVar1 < 1)) {
      uVar2 = 0xffffffff;
    }
    else {
      out = CRYPTO_malloc((int)local_48,"crypto/pkcs7/pk7_doit.c",0xb1);
      if (out == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0xb4,"pkcs7_decrypt_rinfo");
        ERR_set_error(0x21,0xc0100,0);
        uVar2 = 0xffffffff;
      }
      else {
        iVar1 = EVP_PKEY_decrypt(ctx,out,&local_48,*(uchar **)(*(int **)(param_3 + 0x18) + 2),
                                 (long)**(int **)(param_3 + 0x18));
        if (((iVar1 < 1) || (local_48 == 0)) || ((param_5 != 0 && (local_48 != param_5)))) {
          ERR_new();
          ERR_set_debug("crypto/pkcs7/pk7_doit.c",0xbd,"pkcs7_decrypt_rinfo");
          ERR_set_error(0x21,0x80006,0);
          EVP_PKEY_CTX_free(ctx);
          CRYPTO_free(out);
          return 0;
        }
        CRYPTO_clear_free(*param_1,(long)*param_2,"crypto/pkcs7/pk7_doit.c",0xc3);
        *param_1 = out;
        *param_2 = (int)local_48;
        uVar2 = 1;
      }
    }
    EVP_PKEY_CTX_free(ctx);
  }
  return uVar2;
}

