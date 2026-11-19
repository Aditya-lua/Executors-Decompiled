/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eccc8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_OBJECT * ASN1_OBJECT_new(void)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = (ASN1_OBJECT *)CRYPTO_zalloc(0x28,"crypto/asn1/a_object.c",0x15b);
  if (pAVar1 == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_object.c",0x15d,"ASN1_OBJECT_new");
    ERR_set_error(0xd,0xc0100,0);
    return (ASN1_OBJECT *)0x0;
  }
  pAVar1->flags = 1;
  return pAVar1;
}

