/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe1a8
 */

int i2d_PKCS7_ENCRYPT(PKCS7_ENCRYPT *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7b9f0);
  return iVar1;
}

