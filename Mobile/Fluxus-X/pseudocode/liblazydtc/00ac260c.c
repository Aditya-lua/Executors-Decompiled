/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac260c
 */

int PKCS7_add0_attrib_signing_time(PKCS7_SIGNER_INFO *si,ASN1_TIME *t)

{
  int iVar1;
  ASN1_TIME *a;
  
  a = (ASN1_TIME *)0x0;
  if ((t == (ASN1_TIME *)0x0) &&
     (t = X509_gmtime_adj((ASN1_TIME *)0x0,0), a = t, t == (ASN1_TIME *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_attr.c",0x69,"PKCS7_add0_attrib_signing_time");
    ERR_set_error(0x21,0xc0100,0);
  }
  else {
    iVar1 = PKCS7_add_signed_attribute(si,0x34,0x17,t);
    if (iVar1 != 0) {
      return 1;
    }
    ASN1_TIME_free(a);
  }
  return 0;
}

