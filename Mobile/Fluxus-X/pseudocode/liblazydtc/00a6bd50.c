/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6bd50
 */

ec_key_st * EVP_PKEY_get1_EC_KEY(EVP_PKEY *pkey)

{
  EC_KEY *pEVar1;
  int iVar2;
  EC_KEY *key;
  
  iVar2 = EVP_PKEY_get_base_id();
  if (iVar2 == 0x198) {
    key = (EC_KEY *)evp_pkey_get_legacy(pkey);
    if (key != (EC_KEY *)0x0) {
      iVar2 = EC_KEY_up_ref(key);
      pEVar1 = (EC_KEY *)0x0;
      if (iVar2 != 0) {
        pEVar1 = key;
      }
      return pEVar1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_legacy.c",0x48,"evp_pkey_get0_EC_KEY_int");
    ERR_set_error(6,0x8e,0);
  }
  return (ec_key_st *)0x0;
}

