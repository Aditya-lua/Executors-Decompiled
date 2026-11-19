/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2007c
 */

DSA * d2i_DSAPrivateKey(DSA **a,uchar **pp,long length)

{
  DSA *pDVar1;
  
  pDVar1 = (DSA *)ASN1_item_d2i((ASN1_VALUE **)a,pp,length,(ASN1_ITEM *)&DAT_00c5a840);
  return pDVar1;
}

