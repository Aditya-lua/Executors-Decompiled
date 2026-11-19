/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e84
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

IPAddressChoice * IPAddressChoice_new(void)

{
  IPAddressChoice *pIVar1;
  
  pIVar1 = (IPAddressChoice *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e7c0);
  return pIVar1;
}

