/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f824c
 */

X509_ALGOR * d2i_X509_ALGOR(X509_ALGOR **a,uchar **in,long len)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = (X509_ALGOR *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c59180);
  return pXVar1;
}

