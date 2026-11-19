/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6bc34
 */

int EVP_PKEY_set1_EC_KEY(EVP_PKEY *pkey,ec_key_st *key)

{
  int iVar1;
  int iVar2;
  
  iVar1 = EC_KEY_up_ref(key);
  iVar2 = 0;
  if (iVar1 != 0) {
    iVar2 = EVP_PKEY_assign(pkey,0x198,key);
    if (iVar2 == 0) {
      EC_KEY_free(key);
      iVar2 = 0;
    }
    else {
      iVar2 = 1;
    }
  }
  return iVar2;
}

