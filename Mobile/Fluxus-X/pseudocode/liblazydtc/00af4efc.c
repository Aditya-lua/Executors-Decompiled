/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4efc
 */

EDIPARTYNAME * d2i_EDIPARTYNAME(EDIPARTYNAME **a,uchar **in,long len)

{
  EDIPARTYNAME *pEVar1;
  
  pEVar1 = (EDIPARTYNAME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e2c0);
  return pEVar1;
}

