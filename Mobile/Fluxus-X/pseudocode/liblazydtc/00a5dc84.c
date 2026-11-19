/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5dc84
 */

char * evp_get_global_properties_str(undefined8 param_1)

{
  undefined8 *puVar1;
  long lVar2;
  char *pcVar3;
  
  puVar1 = (undefined8 *)ossl_ctx_global_properties();
  if (puVar1 == (undefined8 *)0x0) {
    pcVar3 = CRYPTO_strdup("","crypto/evp/evp_fetch.c",0x26a);
    return pcVar3;
  }
  lVar2 = ossl_property_list_to_string(param_1,*puVar1,0,0);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_fetch.c",0x26e,"evp_get_global_properties_str");
    ERR_set_error(6,0xc0103,0);
  }
  else {
    pcVar3 = CRYPTO_malloc((int)lVar2,"crypto/evp/evp_fetch.c",0x272);
    if (pcVar3 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_fetch.c",0x274,"evp_get_global_properties_str");
      ERR_set_error(6,0xc0100,0);
      return (char *)0x0;
    }
    lVar2 = ossl_property_list_to_string(param_1,*puVar1,pcVar3,lVar2);
    if (lVar2 != 0) {
      return pcVar3;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/evp_fetch.c",0x278,"evp_get_global_properties_str");
    ERR_set_error(6,0xc0103,0);
    CRYPTO_free(pcVar3);
  }
  return (char *)0x0;
}

