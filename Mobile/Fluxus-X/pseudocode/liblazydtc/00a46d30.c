/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a46d30
 */

int FUN_00a46d30(undefined8 param_1,undefined8 param_2,undefined8 param_3,void *param_4,
                undefined8 param_5)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    iVar1 = 0;
  }
  else {
    type = (EVP_MD *)EVP_MD_fetch(param_1,"SHAKE256",param_5);
    if (((type == (EVP_MD *)0x0) || (iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar1 == 0))
       || (iVar1 = EVP_DigestUpdate(ctx,param_4,0x39), iVar1 == 0)) {
      iVar1 = 0;
    }
    else {
      iVar1 = EVP_DigestFinalXOF(ctx,param_2,param_3);
      iVar1 = -(uint)(iVar1 != 0);
    }
    EVP_MD_CTX_free(ctx);
    EVP_MD_free(type);
  }
  return iVar1;
}

