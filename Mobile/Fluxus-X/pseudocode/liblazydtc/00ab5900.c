/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5900
 */

int i2d_NETSCAPE_CERT_SEQUENCE(NETSCAPE_CERT_SEQUENCE *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7aec8);
  return iVar1;
}

