/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b36a9c
 */

bool FUN_00b36a9c(uchar *param_1,void *param_2,ulong param_3,void *param_4,int param_5,
                 undefined8 param_6,undefined8 param_7)

{
  bool bVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  type = (EVP_MD *)EVP_MD_fetch(param_6,&DAT_002d142e,param_7);
  bVar1 = false;
  if ((ctx != (EVP_MD_CTX *)0x0) && (type != (EVP_MD *)0x0)) {
    iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
    if ((iVar2 == 0) ||
       ((iVar2 = EVP_DigestUpdate(ctx,param_2,param_3 & 0xffffffff), iVar2 == 0 ||
        (iVar2 = EVP_DigestUpdate(ctx,param_4,(long)param_5), iVar2 == 0)))) {
      bVar1 = false;
    }
    else {
      iVar2 = EVP_DigestFinal_ex(ctx,param_1,(uint *)0x0);
      bVar1 = iVar2 != 0;
    }
  }
  EVP_MD_CTX_free(ctx);
  EVP_MD_free(type);
  return bVar1;
}

