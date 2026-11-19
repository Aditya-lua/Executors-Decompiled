/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19518
 */

undefined8 ossl_dh_params_fromdata(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 local_28;
  
  uVar2 = 0;
  if (((param_1 != 0) && (lVar1 = ossl_dh_get0_params(), uVar2 = 0, lVar1 != 0)) &&
     (uVar2 = ossl_ffc_params_fromdata(lVar1,param_2), (int)uVar2 != 0)) {
    ossl_dh_cache_named_group(param_1);
    lVar1 = OSSL_PARAM_locate_const(param_2,"priv_len");
    if ((lVar1 == 0) ||
       ((uVar2 = OSSL_PARAM_get_long(lVar1,&local_28), (int)uVar2 != 0 &&
        (uVar2 = DH_set_length(param_1,local_28), (int)uVar2 != 0)))) {
      uVar2 = 1;
    }
  }
  return uVar2;
}

