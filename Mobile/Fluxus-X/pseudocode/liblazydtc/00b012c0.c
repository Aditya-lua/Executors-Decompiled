/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b012c0
 */

int i2d_PKEY_USAGE_PERIOD(PKEY_USAGE_PERIOD *a,uchar **out)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d((ASN1_VALUE *)a,out,(ASN1_ITEM *)&DAT_00c80bb0);
  return iVar1;
}

