/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21f70
 */

int i2d_SM2_Ciphertext(ASN1_VALUE *param_1,uchar **param_2)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d(param_1,param_2,(ASN1_ITEM *)&DAT_00c8cc88);
  return iVar1;
}

