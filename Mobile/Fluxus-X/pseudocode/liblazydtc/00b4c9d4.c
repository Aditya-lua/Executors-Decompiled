/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4c9d4
 */

undefined4 FUN_00b4c9d4(long param_1,uint param_2,code *param_3,undefined8 param_4)

{
  bool bVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  long lVar5;
  
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
    if ((param_2 & 3) == 0) goto LAB_00b4ca84;
LAB_00b4ca48:
    if ((bVar1) && (iVar2 = ossl_dh_key_todata(param_1,lVar4,0,param_2 & 1), iVar2 != 0)) {
LAB_00b4ca88:
      lVar5 = OSSL_PARAM_BLD_to_param(lVar4);
      if (lVar5 != 0) {
        uVar3 = (*param_3)(lVar5,param_4);
        OSSL_PARAM_free(lVar5);
        goto LAB_00b4cab4;
      }
    }
  }
  else {
    iVar2 = ossl_dh_params_todata(param_1,lVar4,0);
    bVar1 = iVar2 != 0;
    if ((param_2 & 3) != 0) goto LAB_00b4ca48;
LAB_00b4ca84:
    if (bVar1) goto LAB_00b4ca88;
  }
  uVar3 = 0;
LAB_00b4cab4:
  OSSL_PARAM_BLD_free(lVar4);
  return uVar3;
}

