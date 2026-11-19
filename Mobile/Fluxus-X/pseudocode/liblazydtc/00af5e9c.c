/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5e9c
 */

IPAddressFamily * d2i_IPAddressFamily(IPAddressFamily **a,uchar **in,long len)

{
  IPAddressFamily *pIVar1;
  
  pIVar1 = (IPAddressFamily *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e7f8);
  return pIVar1;
}

