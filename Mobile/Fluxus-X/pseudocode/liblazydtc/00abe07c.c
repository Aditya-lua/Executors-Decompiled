/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe07c
 */

int i2d_PKCS7_ISSUER_AND_SERIAL(PKCS7_ISSUER_AND_SERIAL *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7b8a8);
  return iVar1;
}

