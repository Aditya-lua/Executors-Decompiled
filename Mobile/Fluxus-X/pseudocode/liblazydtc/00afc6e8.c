/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc6e8
 */

CRL_DIST_POINTS * d2i_CRL_DIST_POINTS(CRL_DIST_POINTS **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7f858);
  return (CRL_DIST_POINTS *)pAVar1;
}

