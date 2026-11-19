/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae6724
 */

BIGNUM * FUN_00ae6724(BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,undefined8 param_4,
                     undefined8 param_5)

{
  int iVar1;
  int iVar2;
  EVP_MD *type;
  void *data;
  BIGNUM *pBVar3;
  uchar auStack_54 [20];
  
  iVar1 = BN_num_bits(param_3);
  iVar2 = iVar1 + 0xe;
  if (-1 < iVar1 + 7) {
    iVar2 = iVar1 + 7;
  }
  type = (EVP_MD *)EVP_MD_fetch(param_4,&DAT_002d142e,param_5);
  if (type == (EVP_MD *)0x0) {
    return (BIGNUM *)0x0;
  }
  if (((param_1 == param_3) || (iVar1 = BN_ucmp(param_1,param_3), iVar1 < 0)) &&
     ((param_2 == param_3 || (iVar1 = BN_ucmp(param_2,param_3), iVar1 < 0)))) {
    iVar2 = iVar2 >> 3;
    data = CRYPTO_malloc(iVar2 << 1,"crypto/srp/srp_lib.c",0x2a);
    if ((((data != (void *)0x0) && (iVar1 = BN_bn2binpad(param_1,data,iVar2), -1 < iVar1)) &&
        (iVar1 = BN_bn2binpad(param_2,(long)data + (long)iVar2,iVar2), -1 < iVar1)) &&
       (iVar2 = EVP_Digest(data,(long)(iVar2 << 1),auStack_54,(uint *)0x0,type,(ENGINE *)0x0),
       iVar2 != 0)) {
      pBVar3 = BN_bin2bn(auStack_54,0x14,(BIGNUM *)0x0);
      goto LAB_00ae67bc;
    }
  }
  else {
    data = (void *)0x0;
  }
  pBVar3 = (BIGNUM *)0x0;
LAB_00ae67bc:
  EVP_MD_free(type);
  CRYPTO_free(data);
  return pBVar3;
}

