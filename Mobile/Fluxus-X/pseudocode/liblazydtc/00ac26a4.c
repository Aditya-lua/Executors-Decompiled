/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac26a4
 */

int PKCS7_add1_attrib_digest(PKCS7_SIGNER_INFO *si,uchar *md,int mdlen)

{
  int iVar1;
  ASN1_OCTET_STRING *str;
  
  str = ASN1_OCTET_STRING_new();
  iVar1 = 0;
  if (str != (ASN1_OCTET_STRING *)0x0) {
    iVar1 = ASN1_STRING_set(str,md,mdlen);
    if ((iVar1 == 0) || (iVar1 = PKCS7_add_signed_attribute(si,0x33,4,str), iVar1 == 0)) {
      ASN1_OCTET_STRING_free(str);
      iVar1 = 0;
    }
    else {
      iVar1 = 1;
    }
  }
  return iVar1;
}

