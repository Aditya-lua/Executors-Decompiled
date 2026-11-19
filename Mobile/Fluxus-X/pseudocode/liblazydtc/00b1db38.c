/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1db38
 */

EC_KEY * d2i_EC_PUBKEY(EC_KEY **a,uchar **pp,long length)

{
  int iVar1;
  EVP_PKEY *pkey;
  ec_key_st *peVar2;
  uchar *local_38;
  
  local_38 = *pp;
  pkey = (EVP_PKEY *)FUN_00b1d214(0,&local_38,length,0,0,1);
  if (pkey != (EVP_PKEY *)0x0) {
    iVar1 = EVP_PKEY_get_id();
    if ((iVar1 == 0x198) || (iVar1 == 0x494)) {
      peVar2 = EVP_PKEY_get1_EC_KEY(pkey);
      EVP_PKEY_free(pkey);
      if (peVar2 == (ec_key_st *)0x0) {
        return (EC_KEY *)0x0;
      }
      *pp = local_38;
      if (a == (EC_KEY **)0x0) {
        return peVar2;
      }
      EC_KEY_free(*a);
      *a = peVar2;
      return peVar2;
    }
    EVP_PKEY_free(pkey);
  }
  return (EC_KEY *)0x0;
}

