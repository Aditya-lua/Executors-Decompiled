/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1d54
 */

undefined8 ossl_provider_up_ref_parent(undefined8 param_1,undefined4 param_2)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  
  uVar1 = ossl_provider_libctx();
  plVar2 = (long *)ossl_lib_ctx_get_data(uVar1,0x12,&DAT_00c6d498);
  uVar1 = 0;
  if (plVar2 != (long *)0x0) {
    lVar3 = ossl_provider_get_parent(param_1);
    if (lVar3 != *plVar2) {
                    /* WARNING: Could not recover jumptable at 0x00aa1db0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (*(code *)plVar2[9])(lVar3,param_2);
      return uVar1;
    }
    uVar1 = 1;
  }
  return uVar1;
}

