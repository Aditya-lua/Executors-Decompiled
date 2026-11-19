/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e6c
 */

IPAddressChoice * d2i_IPAddressChoice(IPAddressChoice **a,uchar **in,long len)

{
  IPAddressChoice *pIVar1;
  
  pIVar1 = (IPAddressChoice *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e7c0);
  return pIVar1;
}

