/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5d8b8
 */

undefined8
evp_set_default_properties_int
          (undefined8 param_1,long param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  long lVar2;
  
  if (param_2 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = ossl_parse_query(param_1,param_2,1);
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_fetch.c",0x21f,"evp_set_default_properties_int");
      ERR_set_error(6,0xd2,0);
      return 0;
    }
  }
  iVar1 = FUN_00a5d95c(param_1,lVar2,param_3,param_4);
  if (iVar1 == 0) {
    ossl_property_free(lVar2);
    return 0;
  }
  return 1;
}

