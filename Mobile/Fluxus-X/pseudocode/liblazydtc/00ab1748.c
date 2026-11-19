/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1748
 */

int OCSP_id_cmp(OCSP_CERTID *a,OCSP_CERTID *b)

{
  int iVar1;
  
  iVar1 = OBJ_cmp((ASN1_OBJECT *)a->hashAlgorithm,(ASN1_OBJECT *)b->hashAlgorithm);
  if (((iVar1 == 0) &&
      (iVar1 = ASN1_OCTET_STRING_cmp
                         ((ASN1_STRING *)&a->issuerKeyHash,(ASN1_STRING *)&b->issuerKeyHash),
      iVar1 == 0)) &&
     (iVar1 = ASN1_OCTET_STRING_cmp
                        ((ASN1_STRING *)&a[1].issuerNameHash,(ASN1_STRING *)&b[1].issuerNameHash),
     iVar1 == 0)) {
    iVar1 = ASN1_INTEGER_cmp((ASN1_INTEGER *)(a + 2),(ASN1_INTEGER *)(b + 2));
    return iVar1;
  }
  return iVar1;
}

