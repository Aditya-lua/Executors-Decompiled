/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5d840
 */

undefined8 evp_method_store_cache_flush(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = ossl_lib_ctx_get_data(param_1,0,&DAT_00c5d6b8);
  if (lVar1 == 0) {
    return 1;
  }
  uVar2 = ossl_method_store_cache_flush_all();
  return uVar2;
}

