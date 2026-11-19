/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00966e10
 */

undefined4 FUN_00966e10(uchar *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  undefined4 uVar3;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    uVar3 = 0x1b;
  }
  else {
    type = (EVP_MD *)EVP_sha512_256();
    iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
    if (iVar1 == 0) {
      EVP_MD_CTX_free(ctx);
      uVar3 = 2;
    }
    else {
      iVar1 = EVP_DigestUpdate(ctx,param_2,param_3);
      iVar2 = EVP_DigestFinal_ex(ctx,param_1,(uint *)0x0);
      EVP_MD_CTX_free(ctx);
      uVar3 = 0x3b;
      if (iVar2 != 0 && iVar1 != 0) {
        uVar3 = 0;
      }
    }
  }
  return uVar3;
}

