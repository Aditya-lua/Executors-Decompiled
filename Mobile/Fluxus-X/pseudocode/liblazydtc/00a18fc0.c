/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18fc0
 */

int i2d_int_dhx(ASN1_VALUE *param_1,uchar **param_2)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d(param_1,param_2,(ASN1_ITEM *)&DAT_00c59ff0);
  return iVar1;
}

