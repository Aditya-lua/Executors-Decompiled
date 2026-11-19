/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d470
 */

undefined8
OSSL_PARAM_BLD_push_BN_pad(undefined8 param_1,undefined8 param_2,BIGNUM *param_3,ulong param_4)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  char *pcVar6;
  
  if (param_3 == (BIGNUM *)0x0) {
    bVar2 = false;
LAB_00a9d4d8:
    lVar4 = FUN_00a9d5b4(param_1,param_2,param_4 & 0xffffffff,param_4,2,bVar2);
    uVar5 = 0;
    if (lVar4 != 0) {
      *(BIGNUM **)(lVar4 + 0x20) = param_3;
      uVar5 = 1;
    }
  }
  else {
    iVar3 = BN_is_negative(param_3);
    if (iVar3 == 0) {
      iVar3 = BN_num_bits(param_3);
      if (iVar3 < -0xe) {
        ERR_new();
        ERR_set_debug("crypto/param_build.c",0xd7,"OSSL_PARAM_BLD_push_BN_pad");
        uVar5 = 0x73;
      }
      else {
        uVar1 = iVar3 + 0xe;
        if (-1 < (int)(iVar3 + 7U)) {
          uVar1 = iVar3 + 7U;
        }
        if ((ulong)((long)((ulong)uVar1 << 0x20) >> 0x23) <= param_4) {
          iVar3 = BN_get_flags(param_3,8);
          bVar2 = iVar3 == 8;
          if (param_4 == 0) {
            param_4 = 1;
          }
          goto LAB_00a9d4d8;
        }
        ERR_new();
        ERR_set_debug("crypto/param_build.c",0xdb,"OSSL_PARAM_BLD_push_BN_pad");
        uVar5 = 0x74;
      }
      pcVar6 = (char *)0x0;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/param_build.c",0xd0,"OSSL_PARAM_BLD_push_BN_pad");
      pcVar6 = "Negative big numbers are unsupported for OSSL_PARAM";
      uVar5 = 0x8010c;
    }
    ERR_set_error(0xf,uVar5,pcVar6);
    uVar5 = 0;
  }
  return uVar5;
}

