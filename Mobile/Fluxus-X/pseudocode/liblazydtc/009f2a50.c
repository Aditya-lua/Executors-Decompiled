/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2a50
 */

int i2d_PKCS8_PRIV_KEY_INFO(PKCS8_PRIV_KEY_INFO *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c58a40);
  return iVar1;
}

