/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab97d8
 */

X509_SIG * d2i_X509_SIG(X509_SIG **a,uchar **in,long len)

{
  X509_SIG *pXVar1;
  
  pXVar1 = (X509_SIG *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7af80);
  return pXVar1;
}

