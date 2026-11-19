/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3fec
 */

void ossl_global_properties_stop_mirroring(undefined8 param_1)

{
  long lVar1;
  
  lVar1 = ossl_lib_ctx_get_data(param_1,0xe,&DAT_00c7c670);
  if (lVar1 != 0) {
    *(byte *)(lVar1 + 8) = *(byte *)(lVar1 + 8) | 1;
  }
  return;
}

