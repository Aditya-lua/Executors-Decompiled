/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab58f4
 */

NETSCAPE_CERT_SEQUENCE * d2i_NETSCAPE_CERT_SEQUENCE(NETSCAPE_CERT_SEQUENCE **a,uchar **in,long len)

{
  NETSCAPE_CERT_SEQUENCE *pNVar1;
  
  pNVar1 = (NETSCAPE_CERT_SEQUENCE *)
           ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7aec8);
  return pNVar1;
}

