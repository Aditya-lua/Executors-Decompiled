/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00fa8
 */

int i2d_PROXY_CERT_INFO_EXTENSION(PROXY_CERT_INFO_EXTENSION *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c80980);
  return iVar1;
}

