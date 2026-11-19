/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f110
 */

X509_CERT_AUX * d2i_X509_CERT_AUX(X509_CERT_AUX **a,uchar **in,long len)

{
  X509_CERT_AUX *pXVar1;
  
  pXVar1 = (X509_CERT_AUX *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82c60);
  return pXVar1;
}

