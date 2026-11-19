/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4dc0c
 */

/* WARNING: Removing unreachable block (ram,0x00b4dcec) */

undefined4 FUN_00b4dc0c(long param_1,ulong param_2,code *param_3,undefined8 param_4)

{
  bool bVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long local_50;
  long local_48;
  
  iVar2 = ossl_prov_is_running();
  if ((param_2 & 7) == 0) {
    return 0;
  }
  if (param_1 == 0) {
    return 0;
  }
  if (iVar2 == 0) {
    return 0;
  }
  lVar4 = OSSL_PARAM_BLD_new();
  if (lVar4 == 0) {
    return 0;
  }
  if ((param_2 & 0x84) == 0) {
    bVar1 = true;
    if ((param_2 & 3) == 0) goto LAB_00b4dd04;
LAB_00b4dc88:
    if (bVar1) {
      local_50 = 0;
      local_48 = 0;
      DSA_get0_key(param_1,&local_50,&local_48);
      if (((((param_2 & 1) == 0) || (local_48 == 0)) ||
          (iVar2 = ossl_param_build_set_bn(lVar4,0,&DAT_002a3e83), iVar2 != 0)) &&
         ((local_50 == 0 || (iVar2 = ossl_param_build_set_bn(lVar4,0,&DAT_002ad463), iVar2 != 0))))
      {
LAB_00b4dd08:
        lVar6 = OSSL_PARAM_BLD_to_param(lVar4);
        if (lVar6 != 0) {
          uVar3 = (*param_3)(lVar6,param_4);
          OSSL_PARAM_free(lVar6);
          goto LAB_00b4dd3c;
        }
      }
    }
  }
  else {
    uVar5 = ossl_dsa_get0_params(param_1);
    iVar2 = ossl_ffc_params_todata(uVar5,lVar4,0);
    bVar1 = iVar2 != 0;
    if ((param_2 & 3) != 0) goto LAB_00b4dc88;
LAB_00b4dd04:
    if (bVar1) goto LAB_00b4dd08;
  }
  uVar3 = 0;
LAB_00b4dd3c:
  OSSL_PARAM_BLD_free(lVar4);
  return uVar3;
}

