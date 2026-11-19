/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1aff8
 */

X509_ATTRIBUTE * d2i_X509_ATTRIBUTE(X509_ATTRIBUTE **a,uchar **in,long len)

{
  X509_ATTRIBUTE *pXVar1;
  
  pXVar1 = (X509_ATTRIBUTE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c81fd0);
  return pXVar1;
}

