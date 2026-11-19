/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5eb4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

IPAddressFamily * IPAddressFamily_new(void)

{
  IPAddressFamily *pIVar1;
  
  pIVar1 = (IPAddressFamily *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e7f8);
  return pIVar1;
}

