/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7a0a8
 */

int FUN_00a7a0a8(long param_1,uchar *param_2,ulong *param_3,uchar *param_4,int param_5)

{
  int iVar1;
  EC_KEY *eckey;
  ulong uVar2;
  long lVar3;
  uint local_44;
  
  lVar3 = *(long *)(param_1 + 0x98);
  eckey = (EC_KEY *)EVP_PKEY_get0_EC_KEY(*(undefined8 *)(param_1 + 0x88));
  iVar1 = ECDSA_size(eckey);
  if (iVar1 < 1) {
LAB_00a7a128:
    iVar1 = 0;
  }
  else {
    if (param_2 == (uchar *)0x0) {
      uVar2 = (ulong)iVar1;
    }
    else {
      if (*param_3 < (ulong)(long)iVar1) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_pmeth.c",0x82,"pkey_ec_sign");
        ERR_set_error(0x10,100,0);
        goto LAB_00a7a128;
      }
      if (*(long *)(lVar3 + 8) == 0) {
        iVar1 = 0x40;
      }
      else {
        iVar1 = EVP_MD_get_type();
      }
      iVar1 = ECDSA_sign(iVar1,param_4,param_5,param_2,&local_44,eckey);
      if (iVar1 < 1) {
        return iVar1;
      }
      uVar2 = (ulong)local_44;
    }
    iVar1 = 1;
    *param_3 = uVar2;
  }
  return iVar1;
}

