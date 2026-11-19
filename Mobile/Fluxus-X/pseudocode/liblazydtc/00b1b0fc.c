/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b0fc
 */

X509_REVOKED * d2i_X509_REVOKED(X509_REVOKED **a,uchar **in,long len)

{
  X509_REVOKED *pXVar1;
  
  pXVar1 = (X509_REVOKED *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82058);
  return pXVar1;
}

