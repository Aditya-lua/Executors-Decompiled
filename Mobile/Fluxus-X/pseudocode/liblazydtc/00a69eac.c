/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69eac
 */

int i2d_SCRYPT_PARAMS(ASN1_VALUE *param_1,uchar **param_2)

{
  int iVar1;
  
  iVar1 = ASN1_item_i2d(param_1,param_2,(ASN1_ITEM *)&DAT_00c5e8f0);
  return iVar1;
}

