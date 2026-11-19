/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bcd4
 */

X509_EXTENSIONS * d2i_X509_EXTENSIONS(X509_EXTENSIONS **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c823a0);
  return (X509_EXTENSIONS *)pAVar1;
}

