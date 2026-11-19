/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4f80
 */

int i2d_GENERAL_NAMES(GENERAL_NAMES *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c7e330);
  return iVar1;
}

