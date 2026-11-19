/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb90c
 */

USERNOTICE * d2i_USERNOTICE(USERNOTICE **a,uchar **in,long len)

{
  USERNOTICE *pUVar1;
  
  pUVar1 = (USERNOTICE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7efd8);
  return pUVar1;
}

