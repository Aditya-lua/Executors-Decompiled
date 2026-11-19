/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b6c
 */

int i2d_ASN1_VISIBLESTRING(ASN1_VISIBLESTRING *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c58db0);
  return iVar1;
}

