/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5dd04
 */

undefined8
FUN_00b5dd04(undefined8 *param_1,long param_2,undefined8 *param_3,ulong param_4,undefined8 param_5,
            undefined8 param_6)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = param_1[1];
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if (param_2 == 0) {
LAB_00b5ddac:
    uVar2 = 1;
    *param_3 = 0x72;
  }
  else {
    if (param_4 < 0x72) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0xcd,"ed448_digest_sign");
      uVar2 = 0x6a;
    }
    else if (*(long *)(lVar3 + 0x50) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0xd1,"ed448_digest_sign");
      uVar2 = 0xdd;
    }
    else {
      iVar1 = ossl_ed448_sign(*param_1,param_2,param_5,param_6,lVar3 + 0x11,*(long *)(lVar3 + 0x50),
                              0,0,*(undefined8 *)(lVar3 + 8));
      if (iVar1 != 0) goto LAB_00b5ddac;
      ERR_new();
      ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0xe0,"ed448_digest_sign");
      uVar2 = 0xaf;
    }
    ERR_set_error(0x39,uVar2,0);
    uVar2 = 0;
  }
  return uVar2;
}

