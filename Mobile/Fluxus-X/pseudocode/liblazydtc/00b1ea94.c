/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ea94
 */

X509_CINF * d2i_X509_CINF(X509_CINF **a,uchar **in,long len)

{
  X509_CINF *pXVar1;
  
  pXVar1 = (X509_CINF *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82930);
  return pXVar1;
}

