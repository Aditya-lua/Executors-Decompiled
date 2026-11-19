/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19650
 */

undefined8 ossl_dh_params_todata(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = DH_get_length();
  uVar2 = ossl_dh_get0_params(param_1);
  uVar2 = ossl_ffc_params_todata(uVar2,param_2,param_3);
  if (((int)uVar2 != 0) &&
     ((lVar1 < 1 ||
      (uVar2 = ossl_param_build_set_long(param_2,param_3,"priv_len",lVar1), (int)uVar2 != 0)))) {
    uVar2 = 1;
  }
  return uVar2;
}

