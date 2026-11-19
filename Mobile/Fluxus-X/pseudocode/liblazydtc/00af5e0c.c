/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e0c
 */

IPAddressRange * d2i_IPAddressRange(IPAddressRange **a,uchar **in,long len)

{
  IPAddressRange *pIVar1;
  
  pIVar1 = (IPAddressRange *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e750);
  return pIVar1;
}

