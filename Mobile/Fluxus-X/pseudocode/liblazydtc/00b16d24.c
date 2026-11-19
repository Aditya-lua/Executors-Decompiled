/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16d24
 */

int i2d_PKCS8PrivateKeyInfo_bio(BIO *bp,EVP_PKEY *key)

{
  int iVar1;
  PKCS8_PRIV_KEY_INFO *a;
  
  a = EVP_PKEY2PKCS8(key);
  iVar1 = 0;
  if (a != (PKCS8_PRIV_KEY_INFO *)0x0) {
    iVar1 = ASN1_i2d_bio(i2d_PKCS8_PRIV_KEY_INFO,bp,(uchar *)a);
    PKCS8_PRIV_KEY_INFO_free(a);
  }
  return iVar1;
}

