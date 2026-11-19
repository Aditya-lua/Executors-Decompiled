/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093efe0
 */

undefined8 FUN_0093efe0(uchar *param_1,void *param_2,undefined8 param_3)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  ulong uVar2;
  undefined8 uVar3;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    uVar3 = 0x1b;
  }
  else {
    type = EVP_sha256();
    iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
    if (iVar1 == 0) {
      EVP_MD_CTX_free(ctx);
      uVar3 = 2;
    }
    else {
      uVar2 = FUN_00963a64(param_3);
      EVP_DigestUpdate(ctx,param_2,uVar2 & 0xffffffff);
      EVP_DigestFinal_ex(ctx,param_1,(uint *)0x0);
      EVP_MD_CTX_free(ctx);
      uVar3 = 0;
    }
  }
  return uVar3;
}

