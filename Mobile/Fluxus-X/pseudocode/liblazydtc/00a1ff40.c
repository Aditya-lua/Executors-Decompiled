/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ff40
 */

bool FUN_00a1ff40(BIO *param_1,long param_2,int param_3,int param_4)

{
  int param2;
  int iVar1;
  BIGNUM *num;
  BIGNUM *num_00;
  
  if (*(long *)(param_2 + 8) == 0) {
    param2 = 0;
    iVar1 = 0;
    if (param_4 != 2) goto LAB_00a1ffd4;
LAB_00a1ff84:
    num = *(BIGNUM **)(param_2 + 0x68);
    num_00 = *(BIGNUM **)(param_2 + 0x70);
    if (num_00 != (BIGNUM *)0x0) {
      iVar1 = BIO_indent(param_1,param_3,0x80);
      if (iVar1 == 0) {
        return false;
      }
      iVar1 = BIO_printf(param_1,"%s: (%d bit)\n","Private-Key",param2);
      goto joined_r0x00a1ffc0;
    }
  }
  else {
    param2 = DSA_bits(param_2);
    iVar1 = param2;
    if (param_4 == 2) goto LAB_00a1ff84;
LAB_00a1ffd4:
    param2 = iVar1;
    if (param_4 < 1) {
      num = (BIGNUM *)0x0;
    }
    else {
      num = *(BIGNUM **)(param_2 + 0x68);
    }
  }
  iVar1 = BIO_printf(param_1,"Public-Key: (%d bit)\n",param2);
  num_00 = (BIGNUM *)0x0;
joined_r0x00a1ffc0:
  if (((iVar1 < 1) ||
      (iVar1 = ASN1_bn_print(param_1,"priv:",num_00,(uchar *)0x0,param_3), iVar1 == 0)) ||
     (iVar1 = ASN1_bn_print(param_1,"pub: ",num,(uchar *)0x0,param_3), iVar1 == 0)) {
    return false;
  }
  iVar1 = ossl_ffc_params_print(param_1,(long *)(param_2 + 8),param_3);
  return iVar1 != 0;
}

