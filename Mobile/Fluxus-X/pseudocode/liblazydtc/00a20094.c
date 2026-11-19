/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20094
 */

DSA * d2i_DSAparams(DSA **a,uchar **pp,long length)

{
  DSA *pDVar1;
  
  pDVar1 = (DSA *)ASN1_item_d2i((ASN1_VALUE **)a,pp,length,(ASN1_ITEM *)&DAT_00c5a998);
  return pDVar1;
}

