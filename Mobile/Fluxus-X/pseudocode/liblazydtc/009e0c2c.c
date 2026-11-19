/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0c2c
 */

undefined8 ossl_gost_ukm(long param_1,uchar *param_2)

{
  int iVar1;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  undefined8 uVar2;
  uint uStack_34;
  
  type = (EVP_MD *)
         ssl_evp_md_fetch(**(undefined8 **)(param_1 + 0x9a8),0x3d6,
                          (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  uVar2 = 0;
  if (type != (EVP_MD *)0x0) {
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if ((((ctx == (EVP_MD_CTX *)0x0) || (iVar1 = EVP_DigestInit(ctx,type), iVar1 < 1)) ||
        (iVar1 = EVP_DigestUpdate(ctx,(void *)(param_1 + 0x160),0x20), iVar1 < 1)) ||
       ((iVar1 = EVP_DigestUpdate(ctx,(void *)(param_1 + 0x140),0x20), iVar1 < 1 ||
        (iVar1 = EVP_DigestFinal_ex(ctx,param_2,&uStack_34), iVar1 < 1)))) {
      EVP_MD_CTX_free(ctx);
      ssl_evp_md_free(type);
      uVar2 = 0;
    }
    else {
      EVP_MD_CTX_free(ctx);
      ssl_evp_md_free(type);
      uVar2 = 1;
    }
  }
  return uVar2;
}

