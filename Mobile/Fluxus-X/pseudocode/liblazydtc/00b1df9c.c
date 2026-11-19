/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1df9c
 */

int ossl_i2d_X25519_PUBKEY(void *param_1,uchar **param_2)

{
  int iVar1;
  EVP_PKEY *pkey;
  
  iVar1 = 0;
  if (param_1 != (void *)0x0) {
    pkey = EVP_PKEY_new();
    if (pkey == (EVP_PKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x_pubkey.c",0x3b6,"ossl_i2d_X25519_PUBKEY");
      ERR_set_error(0xd,0xc0100,0);
      iVar1 = -1;
    }
    else {
      EVP_PKEY_assign(pkey,0x40a,param_1);
      iVar1 = i2d_PUBKEY(pkey,param_2);
      (pkey->pkey).ptr = (char *)0x0;
      EVP_PKEY_free(pkey);
    }
  }
  return iVar1;
}

