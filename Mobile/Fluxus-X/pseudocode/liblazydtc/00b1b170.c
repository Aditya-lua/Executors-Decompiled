/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b170
 */

X509_CRL * d2i_X509_CRL(X509_CRL **a,uchar **in,long len)

{
  X509_CRL *pXVar1;
  
  pXVar1 = (X509_CRL *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c820f8);
  return pXVar1;
}

