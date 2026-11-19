/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e76c
 */

X509_REQ * d2i_X509_REQ(X509_REQ **a,uchar **in,long len)

{
  X509_REQ *pXVar1;
  
  pXVar1 = (X509_REQ *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c827b0);
  return pXVar1;
}

