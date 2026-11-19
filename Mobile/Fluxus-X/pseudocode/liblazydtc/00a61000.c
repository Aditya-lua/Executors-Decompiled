/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61000
 */

undefined8 OSSL_ENCODER_names_do_all(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != (long *)0x0) {
    if (*param_1 != 0) {
      ossl_provider_libctx();
      uVar1 = ossl_namemap_stored();
      uVar1 = ossl_namemap_doall_names(uVar1,(int)param_1[1],param_2,param_3);
      return uVar1;
    }
    uVar1 = 1;
  }
  return uVar1;
}

