/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d820
 */

int X509_self_signed(X509 *param_1,int param_2)

{
  int iVar1;
  EVP_PKEY *r;
  
  r = (EVP_PKEY *)X509_get0_pubkey();
  if (r == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x62,"X509_self_signed");
    ERR_set_error(0xb,0x6c,0);
  }
  else {
    iVar1 = ossl_x509v3_cache_extensions(param_1);
    if (iVar1 != 0) {
      if ((*(byte *)((long)&param_1[1].name + 1) >> 5 & 1) == 0) {
        return 0;
      }
      if (param_2 == 0) {
        return 1;
      }
      iVar1 = X509_verify(param_1,r);
      return iVar1;
    }
  }
  return -1;
}

