/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b0c
 */

int i2d_ASN1_UTCTIME(ASN1_UTCTIME *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c58d40);
  return iVar1;
}

