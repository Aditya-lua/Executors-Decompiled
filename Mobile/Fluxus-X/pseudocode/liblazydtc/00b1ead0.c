/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ead0
 */

X509 * d2i_X509(X509 **a,uchar **in,long len)

{
  X509 *pXVar1;
  
  pXVar1 = (X509 *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c82968);
  return pXVar1;
}

