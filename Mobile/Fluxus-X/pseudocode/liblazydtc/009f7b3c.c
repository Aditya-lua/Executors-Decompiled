/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b3c
 */

int i2d_ASN1_GENERALIZEDTIME(ASN1_GENERALIZEDTIME *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c58d78);
  return iVar1;
}

