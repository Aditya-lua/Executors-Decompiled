/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe16c
 */

int i2d_PKCS7_SIGN_ENVELOPE(PKCS7_SIGN_ENVELOPE *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7b9b8);
  return iVar1;
}

