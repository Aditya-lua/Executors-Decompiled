/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf6f4
 */

OCSP_CERTID * d2i_OCSP_CERTID(OCSP_CERTID **a,uchar **in,long len)

{
  OCSP_CERTID *pOVar1;
  
  pOVar1 = (OCSP_CERTID *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c79f30);
  return pOVar1;
}

