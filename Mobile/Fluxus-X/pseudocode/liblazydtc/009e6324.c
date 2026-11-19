/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6324
 */

int i2d_GOST_KX_MESSAGE(ASN1_VALUE *param_1,uchar **param_2)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d(param_1,param_2,(ASN1_ITEM *)&DAT_00c58888);
  return iVar1;
}

