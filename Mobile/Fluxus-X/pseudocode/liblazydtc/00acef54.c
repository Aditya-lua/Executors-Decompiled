/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acef54
 */

RSA * d2i_RSAPublicKey(RSA **a,uchar **in,long len)

{
  RSA *pRVar1;
  
  pRVar1 = (RSA *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ceb0);
  return pRVar1;
}

