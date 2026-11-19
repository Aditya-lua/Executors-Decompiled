/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5d870
 */

undefined8 evp_method_store_remove_all_provided(undefined8 param_1)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = ossl_provider_libctx();
  lVar2 = ossl_lib_ctx_get_data(uVar1,0,&DAT_00c5d6b8);
  if (lVar2 == 0) {
    return 1;
  }
  uVar1 = ossl_method_store_remove_all_provided(lVar2,param_1);
  return uVar1;
}

