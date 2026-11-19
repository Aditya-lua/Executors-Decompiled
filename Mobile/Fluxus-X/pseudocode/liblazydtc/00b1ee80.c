/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ee80
 */

int i2d_re_X509_tbs(ASN1_VALUE *param_1,uchar **param_2)

{
  int iVar1;
  
  *(undefined4 *)(param_1 + 0x80) = 1;
  iVar1 = ASN1_item_i2d(param_1,param_2,(ASN1_ITEM *)&DAT_00c82930);
  return iVar1;
}

