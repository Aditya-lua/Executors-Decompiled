/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00f9c
 */

PROXY_CERT_INFO_EXTENSION *
d2i_PROXY_CERT_INFO_EXTENSION(PROXY_CERT_INFO_EXTENSION **a,uchar **in,long len)

{
  PROXY_CERT_INFO_EXTENSION *pPVar1;
  
  pPVar1 = (PROXY_CERT_INFO_EXTENSION *)
           ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c80980);
  return pPVar1;
}

