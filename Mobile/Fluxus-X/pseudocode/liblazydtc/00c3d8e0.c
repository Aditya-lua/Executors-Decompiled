/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d8e0
 */

ec_key_st * EVP_PKEY_get1_EC_KEY(EVP_PKEY *pkey)

{
  ec_key_st *peVar1;
  
  peVar1 = EVP_PKEY_get1_EC_KEY(pkey);
  return peVar1;
}

