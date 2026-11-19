/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac25b0
 */

int PKCS7_add_attrib_content_type(PKCS7_SIGNER_INFO *si,ASN1_OBJECT *coid)

{
  int iVar1;
  ASN1_TYPE *pAVar2;
  
  pAVar2 = PKCS7_get_signed_attribute(si,0x32);
  if (pAVar2 != (ASN1_TYPE *)0x0) {
    return 0;
  }
  if (coid == (ASN1_OBJECT *)0x0) {
    coid = OBJ_nid2obj(0x15);
  }
  iVar1 = PKCS7_add_signed_attribute(si,0x32,6,coid);
  return iVar1;
}

