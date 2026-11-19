/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e730
 */

X509_REQ_INFO * d2i_X509_REQ_INFO(X509_REQ_INFO **a,uchar **in,long len)

{
  X509_REQ_INFO *pXVar1;
  
  pXVar1 = (X509_REQ_INFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82748);
  return pXVar1;
}

