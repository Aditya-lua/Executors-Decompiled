/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b140
 */

X509_CRL_INFO * d2i_X509_CRL_INFO(X509_CRL_INFO **a,uchar **in,long len)

{
  X509_CRL_INFO *pXVar1;
  
  pXVar1 = (X509_CRL_INFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82090);
  return pXVar1;
}

