/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f1280
 */

ASN1_STRING * ASN1_STRING_type_new(int type)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = (ASN1_STRING *)CRYPTO_zalloc(0x18,"crypto/asn1/asn1_lib.c",0x15e);
  if (pAVar1 == (ASN1_STRING *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_lib.c",0x160,"ASN1_STRING_type_new");
    ERR_set_error(0xd,0xc0100,0);
    pAVar1 = (ASN1_STRING *)0x0;
  }
  else {
    pAVar1->type = type;
  }
  return pAVar1;
}

