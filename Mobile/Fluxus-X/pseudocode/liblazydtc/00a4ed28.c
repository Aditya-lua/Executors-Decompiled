/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ed28
 */

undefined8 ossl_decoder_store_cache_flush(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = ossl_lib_ctx_get_data(param_1,0xb,&DAT_00c5d058);
  if (lVar1 == 0) {
    return 1;
  }
  uVar2 = ossl_method_store_cache_flush_all();
  return uVar2;
}

