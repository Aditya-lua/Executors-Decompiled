/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bd0c
 */

X509_NAME_ENTRY * d2i_X509_NAME_ENTRY(X509_NAME_ENTRY **a,uchar **in,long len)

{
  X509_NAME_ENTRY *pXVar1;
  
  pXVar1 = (X509_NAME_ENTRY *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82478);
  return pXVar1;
}

