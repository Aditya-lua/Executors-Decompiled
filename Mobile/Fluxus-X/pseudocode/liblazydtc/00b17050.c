/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17050
 */

NETSCAPE_SPKAC * d2i_NETSCAPE_SPKAC(NETSCAPE_SPKAC **a,uchar **in,long len)

{
  NETSCAPE_SPKAC *pNVar1;
  
  pNVar1 = (NETSCAPE_SPKAC *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c81e38);
  return pNVar1;
}

