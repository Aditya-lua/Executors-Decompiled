/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b42d10
 */

undefined4 FUN_00b42d10(long param_1,DH *param_2)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if (((param_2 != (DH *)0x0) && (param_1 != 0)) && (iVar1 != 0)) {
    uVar5 = *(undefined8 *)(param_1 + 8);
    lVar3 = ossl_dh_get0_params(param_2);
    lVar4 = ossl_dh_get0_params(uVar5);
    if (((lVar3 == 0) || (lVar4 == 0)) || (iVar1 = ossl_ffc_params_cmp(lVar3,lVar4,1), iVar1 == 0))
    {
      ERR_new();
      ERR_set_debug("providers/implementations/exchange/dh_exch.c",0x7b,"dh_match_params");
      ERR_set_error(0x39,0xcb,0);
      uVar2 = 0;
    }
    else {
      iVar1 = DH_up_ref(param_2);
      uVar2 = 0;
      if (iVar1 != 0) {
        DH_free(*(DH **)(param_1 + 0x10));
        uVar2 = 1;
        *(DH **)(param_1 + 0x10) = param_2;
      }
    }
  }
  return uVar2;
}

