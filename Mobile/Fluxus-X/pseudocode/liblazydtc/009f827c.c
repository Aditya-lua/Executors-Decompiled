/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f827c
 */

X509_ALGORS * d2i_X509_ALGORS(X509_ALGORS **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c591b8);
  return (X509_ALGORS *)pAVar1;
}

