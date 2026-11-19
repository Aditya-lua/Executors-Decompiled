/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1da9c
 */

int i2d_DSA_PUBKEY(DSA *a,uchar **pp)

{
  int iVar1;
  EVP_PKEY *pkey;
  
  iVar1 = 0;
  if (a != (DSA *)0x0) {
    pkey = EVP_PKEY_new();
    if (pkey == (EVP_PKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x_pubkey.c",0x30c,"i2d_DSA_PUBKEY");
      ERR_set_error(0xd,0xc0100,0);
      iVar1 = -1;
    }
    else {
      EVP_PKEY_assign(pkey,0x74,a);
      iVar1 = i2d_PUBKEY(pkey,pp);
      (pkey->pkey).ptr = (char *)0x0;
      EVP_PKEY_free(pkey);
    }
  }
  return iVar1;
}

