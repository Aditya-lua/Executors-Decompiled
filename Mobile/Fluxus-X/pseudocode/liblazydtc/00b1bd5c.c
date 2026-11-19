/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bd5c
 */

X509_NAME * d2i_X509_NAME(X509_NAME **a,uchar **in,long len)

{
  X509_NAME *pXVar1;
  
  pXVar1 = (X509_NAME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c824b0);
  return pXVar1;
}

