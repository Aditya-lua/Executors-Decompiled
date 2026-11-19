/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e3c
 */

IPAddressOrRange * d2i_IPAddressOrRange(IPAddressOrRange **a,uchar **in,long len)

{
  IPAddressOrRange *pIVar1;
  
  pIVar1 = (IPAddressOrRange *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e788);
  return pIVar1;
}

