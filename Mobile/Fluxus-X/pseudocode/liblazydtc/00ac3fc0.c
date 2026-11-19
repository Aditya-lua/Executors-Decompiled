/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3fc0
 */

byte ossl_global_properties_no_mirrored(undefined8 param_1)

{
  byte bVar1;
  long lVar2;
  
  lVar2 = ossl_lib_ctx_get_data(param_1,0xe,&DAT_00c7c670);
  bVar1 = 0;
  if (lVar2 != 0) {
    bVar1 = *(byte *)(lVar2 + 8) & 1;
  }
  return bVar1;
}

