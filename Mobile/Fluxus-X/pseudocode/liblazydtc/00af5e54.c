/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e54
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

IPAddressOrRange * IPAddressOrRange_new(void)

{
  IPAddressOrRange *pIVar1;
  
  pIVar1 = (IPAddressOrRange *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e788);
  return pIVar1;
}

