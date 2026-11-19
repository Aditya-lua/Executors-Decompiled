/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e24
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

IPAddressRange * IPAddressRange_new(void)

{
  IPAddressRange *pIVar1;
  
  pIVar1 = (IPAddressRange *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e750);
  return pIVar1;
}

