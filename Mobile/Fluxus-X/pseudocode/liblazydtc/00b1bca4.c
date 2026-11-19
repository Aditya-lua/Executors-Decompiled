/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bca4
 */

X509_EXTENSION * d2i_X509_EXTENSION(X509_EXTENSION **a,uchar **in,long len)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = (X509_EXTENSION *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82368);
  return pXVar1;
}

