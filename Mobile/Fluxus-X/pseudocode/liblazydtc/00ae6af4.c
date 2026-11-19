/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae6af4
 */

BIGNUM * SRP_Calc_x_ex(BIGNUM *param_1,char *param_2,char *param_3,undefined8 param_4,
                      undefined8 param_5)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  EVP_MD_CTX *ctx;
  uchar *to;
  EVP_MD *type;
  size_t sVar4;
  BIGNUM *pBVar5;
  uchar auStack_64 [20];
  
  if (param_1 == (BIGNUM *)0x0) {
    return (BIGNUM *)0x0;
  }
  if (param_2 == (char *)0x0) {
    return (BIGNUM *)0x0;
  }
  if (param_3 == (char *)0x0) {
    return (BIGNUM *)0x0;
  }
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    return (BIGNUM *)0x0;
  }
  iVar2 = BN_num_bits(param_1);
  iVar3 = iVar2 + 0xe;
  if (-1 < iVar2 + 7) {
    iVar3 = iVar2 + 7;
  }
  to = CRYPTO_malloc(iVar3 >> 3,"crypto/srp/srp_lib.c",0x9f);
  if (to == (uchar *)0x0) {
    pBVar5 = (BIGNUM *)0x0;
    type = (EVP_MD *)0x0;
  }
  else {
    type = (EVP_MD *)EVP_MD_fetch(param_4,&DAT_002d142e,param_5);
    if ((type != (EVP_MD *)0x0) && (iVar3 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar3 != 0))
    {
      sVar4 = strlen(param_2);
      iVar3 = EVP_DigestUpdate(ctx,param_2,sVar4);
      if ((iVar3 != 0) && (iVar3 = EVP_DigestUpdate(ctx,&DAT_002bcda4,1), iVar3 != 0)) {
        sVar4 = strlen(param_3);
        iVar3 = EVP_DigestUpdate(ctx,param_3,sVar4);
        if ((((iVar3 != 0) && (iVar3 = EVP_DigestFinal_ex(ctx,auStack_64,(uint *)0x0), iVar3 != 0))
            && (iVar3 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar3 != 0)) &&
           (iVar3 = BN_bn2bin(param_1,to), -1 < iVar3)) {
          iVar3 = BN_num_bits(param_1);
          uVar1 = iVar3 + 0xe;
          if (-1 < (int)(iVar3 + 7U)) {
            uVar1 = iVar3 + 7U;
          }
          iVar3 = EVP_DigestUpdate(ctx,to,(long)((ulong)uVar1 << 0x20) >> 0x23);
          if (((iVar3 != 0) && (iVar3 = EVP_DigestUpdate(ctx,auStack_64,0x14), iVar3 != 0)) &&
             (iVar3 = EVP_DigestFinal_ex(ctx,auStack_64,(uint *)0x0), iVar3 != 0)) {
            pBVar5 = BN_bin2bn(auStack_64,0x14,(BIGNUM *)0x0);
            goto LAB_00ae6cb0;
          }
        }
      }
    }
    pBVar5 = (BIGNUM *)0x0;
  }
LAB_00ae6cb0:
  EVP_MD_free(type);
  CRYPTO_free(to);
  EVP_MD_CTX_free(ctx);
  return pBVar5;
}

