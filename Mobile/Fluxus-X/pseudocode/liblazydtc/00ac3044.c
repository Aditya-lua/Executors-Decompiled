/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3044
 */

PKCS7_SIGNER_INFO * PKCS7_add_signature(PKCS7 *p7,X509 *x509,EVP_PKEY *pkey,EVP_MD *dgst)

{
  int iVar1;
  PKCS7_SIGNER_INFO *p7i;
  char *name;
  int local_34;
  
  if (dgst == (EVP_MD *)0x0) {
    iVar1 = EVP_PKEY_get_default_digest_nid(pkey,&local_34);
    if (0 < iVar1) {
      name = OBJ_nid2sn(local_34);
      dgst = EVP_get_digestbyname(name);
      if (dgst != (EVP_MD *)0x0) goto LAB_00ac306c;
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x18e,"PKCS7_add_signature");
      ERR_set_error(0x21,0x97,0);
    }
    p7i = (PKCS7_SIGNER_INFO *)0x0;
  }
  else {
LAB_00ac306c:
    p7i = PKCS7_SIGNER_INFO_new();
    if (((p7i != (PKCS7_SIGNER_INFO *)0x0) &&
        (iVar1 = PKCS7_SIGNER_INFO_set(p7i,x509,pkey,dgst), 0 < iVar1)) &&
       (iVar1 = PKCS7_add_signer(p7,p7i), iVar1 != 0)) {
      return p7i;
    }
  }
  PKCS7_SIGNER_INFO_free(p7i);
  return (PKCS7_SIGNER_INFO *)0x0;
}

