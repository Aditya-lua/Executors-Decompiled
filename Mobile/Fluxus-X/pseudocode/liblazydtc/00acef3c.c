/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acef3c
 */

RSA * d2i_RSAPrivateKey(RSA **a,uchar **in,long len)

{
  RSA *pRVar1;
  
  pRVar1 = (RSA *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ce48);
  return pRVar1;
}

