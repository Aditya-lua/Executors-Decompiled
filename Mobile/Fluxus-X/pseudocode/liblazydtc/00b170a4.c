/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b170a4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

NETSCAPE_SPKI * NETSCAPE_SPKI_new(void)

{
  NETSCAPE_SPKI *pNVar1;
  
  pNVar1 = (NETSCAPE_SPKI *)ASN1_item_new((ASN1_ITEM *)&DAT_00c81e70);
  return pNVar1;
}

