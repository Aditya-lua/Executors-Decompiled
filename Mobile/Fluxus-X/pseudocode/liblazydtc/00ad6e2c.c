/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad6e2c
 */

uint FUN_00ad6e2c(long param_1,uchar *param_2,ulong *param_3,uchar *param_4,int param_5)

{
  int iVar1;
  uint uVar2;
  RSA *rsa;
  ulong uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0x98);
  rsa = (RSA *)EVP_PKEY_get0_RSA(*(undefined8 *)(param_1 + 0x88));
  if (*(int *)(lVar4 + 0x1c) == 4) {
    iVar1 = FUN_00ad789c(lVar4,param_1);
    if (iVar1 == 0) {
      return 0xffffffff;
    }
    uVar2 = RSA_private_decrypt(param_5,param_4,*(uchar **)(lVar4 + 0x38),rsa,3);
    if ((int)uVar2 < 1) {
      return uVar2;
    }
    uVar2 = RSA_padding_check_PKCS1_OAEP_mgf1
                      (param_2,uVar2,*(undefined8 *)(lVar4 + 0x38),uVar2,uVar2,
                       *(undefined8 *)(lVar4 + 0x40),*(undefined4 *)(lVar4 + 0x48),
                       *(undefined8 *)(lVar4 + 0x20),*(undefined8 *)(lVar4 + 0x28));
  }
  else {
    uVar2 = RSA_private_decrypt(param_5,param_4,param_2,rsa,*(int *)(lVar4 + 0x1c));
  }
  uVar3 = (long)(int)uVar2 >> 0x3f;
  *param_3 = ~uVar3 & (long)(int)uVar2 | uVar3 & *param_3;
  return ~((int)uVar2 >> 0x1f) & 1U | (int)uVar2 >> 0x1f & uVar2;
}

