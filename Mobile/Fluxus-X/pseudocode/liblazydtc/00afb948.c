/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb948
 */

NOTICEREF * d2i_NOTICEREF(NOTICEREF **a,uchar **in,long len)

{
  NOTICEREF *pNVar1;
  
  pNVar1 = (NOTICEREF *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7f010);
  return pNVar1;
}

