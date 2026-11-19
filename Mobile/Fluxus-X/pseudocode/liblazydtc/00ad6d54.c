/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad6d54
 */

int FUN_00ad6d54(long param_1,uchar *param_2,long *param_3,uchar *param_4,int param_5)

{
  int iVar1;
  int iVar2;
  RSA *rsa;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x98);
  rsa = (RSA *)EVP_PKEY_get0_RSA(*(undefined8 *)(param_1 + 0x88));
  iVar2 = *(int *)(lVar3 + 0x1c);
  if (iVar2 == 4) {
    iVar1 = RSA_size(rsa);
    iVar2 = FUN_00ad789c(lVar3,param_1);
    if ((iVar2 == 0) ||
       (iVar2 = RSA_padding_add_PKCS1_OAEP_mgf1
                          (*(undefined8 *)(lVar3 + 0x38),iVar1,param_4,param_5,
                           *(undefined8 *)(lVar3 + 0x40),*(undefined4 *)(lVar3 + 0x48),
                           *(undefined8 *)(lVar3 + 0x20),*(undefined8 *)(lVar3 + 0x28)), iVar2 == 0)
       ) {
      return -1;
    }
    param_4 = *(uchar **)(lVar3 + 0x38);
    iVar2 = 3;
    param_5 = iVar1;
  }
  iVar2 = RSA_public_encrypt(param_5,param_4,param_2,rsa,iVar2);
  if (-1 < iVar2) {
    lVar3 = (long)iVar2;
    iVar2 = 1;
    *param_3 = lVar3;
  }
  return iVar2;
}

