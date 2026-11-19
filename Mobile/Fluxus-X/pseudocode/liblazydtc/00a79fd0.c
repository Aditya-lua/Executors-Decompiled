/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a79fd0
 */

int FUN_00a79fd0(long param_1,EVP_PKEY *param_2)

{
  int iVar1;
  EC_KEY *key;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x98);
  if ((*(long *)(param_1 + 0x88) == 0) && (*plVar2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_pmeth.c",0x1ca,"pkey_ec_keygen");
    ERR_set_error(0x10,0x8b,0);
  }
  else {
    key = EC_KEY_new();
    if (key != (EC_KEY *)0x0) {
      iVar1 = EVP_PKEY_assign(param_2,0x198,key);
      if (iVar1 == 0) {
        EC_KEY_free(key);
      }
      else {
        if (*(EVP_PKEY **)(param_1 + 0x88) == (EVP_PKEY *)0x0) {
          iVar1 = EC_KEY_set_group(key,(EC_GROUP *)*plVar2);
        }
        else {
          iVar1 = EVP_PKEY_copy_parameters(param_2,*(EVP_PKEY **)(param_1 + 0x88));
        }
        if (iVar1 != 0) {
          iVar1 = EC_KEY_generate_key(key);
          return iVar1;
        }
      }
    }
  }
  return 0;
}

