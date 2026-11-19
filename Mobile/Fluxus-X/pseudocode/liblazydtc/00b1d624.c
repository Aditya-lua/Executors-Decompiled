/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d624
 */

int i2d_RSA_PUBKEY(RSA *a,uchar **pp)

{
  int iVar1;
  EVP_PKEY *pkey;
  
  iVar1 = 0;
  if (a != (RSA *)0x0) {
    pkey = EVP_PKEY_new();
    if (pkey == (EVP_PKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x_pubkey.c",0x277,"i2d_RSA_PUBKEY");
      ERR_set_error(0xd,0xc0100,0);
      iVar1 = -1;
    }
    else {
      EVP_PKEY_assign(pkey,6,a);
      iVar1 = i2d_PUBKEY(pkey,pp);
      (pkey->pkey).ptr = (char *)0x0;
      EVP_PKEY_free(pkey);
    }
  }
  return iVar1;
}

