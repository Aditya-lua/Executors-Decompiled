/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb960
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

NOTICEREF * NOTICEREF_new(void)

{
  NOTICEREF *pNVar1;
  
  pNVar1 = (NOTICEREF *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7f010);
  return pNVar1;
}

