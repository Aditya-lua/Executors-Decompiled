/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a200ac
 */

DSA * d2i_DSAPublicKey(DSA **a,uchar **pp,long length)

{
  DSA *pDVar1;
  
  pDVar1 = (DSA *)ASN1_item_d2i((ASN1_VALUE **)a,pp,length,(ASN1_ITEM *)&DAT_00c5aa78);
  return pDVar1;
}

