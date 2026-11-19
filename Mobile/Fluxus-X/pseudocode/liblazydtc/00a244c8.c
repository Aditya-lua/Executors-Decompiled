/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a244c8
 */

int i2d_EC_PRIVATEKEY(ASN1_VALUE *param_1,uchar **param_2)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d(param_1,param_2,(ASN1_ITEM *)&DAT_00c5b2e0);
  return iVar1;
}

