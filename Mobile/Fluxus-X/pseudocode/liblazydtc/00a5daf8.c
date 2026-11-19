/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5daf8
 */

bool EVP_default_properties_is_fips_enabled(undefined8 param_1)

{
  bool bVar1;
  int iVar2;
  undefined8 *puVar3;
  
  puVar3 = (undefined8 *)ossl_ctx_global_properties(param_1,1);
  bVar1 = false;
  if (puVar3 != (undefined8 *)0x0) {
    iVar2 = ossl_property_is_enabled(param_1,&DAT_002dc037,*puVar3);
    bVar1 = iVar2 != 0;
  }
  return bVar1;
}

