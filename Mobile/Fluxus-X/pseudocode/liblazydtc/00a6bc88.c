/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6bc88
 */

undefined8 evp_pkey_get0_EC_KEY_int(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = EVP_PKEY_get_base_id();
  if (iVar1 == 0x198) {
    uVar2 = evp_pkey_get_legacy(param_1);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_legacy.c",0x48,"evp_pkey_get0_EC_KEY_int");
    ERR_set_error(6,0x8e,0);
    uVar2 = 0;
  }
  return uVar2;
}

