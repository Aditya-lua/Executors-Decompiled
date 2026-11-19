/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d6a4
 */

undefined8 ossl_ffc_params_print(BIO *param_1,undefined8 *param_2,int param_3)

{
  byte *pbVar1;
  char *param3;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  
  iVar2 = ASN1_bn_print(param_1,"prime P:",(BIGNUM *)*param_2,(uchar *)0x0,param_3);
  if (iVar2 == 0) {
    return 0;
  }
  iVar2 = ASN1_bn_print(param_1,"generator G:",(BIGNUM *)param_2[2],(uchar *)0x0,param_3);
  if (iVar2 == 0) {
    return 0;
  }
  if (((BIGNUM *)param_2[1] != (BIGNUM *)0x0) &&
     (iVar2 = ASN1_bn_print(param_1,"subgroup order Q:",(BIGNUM *)param_2[1],(uchar *)0x0,param_3),
     iVar2 == 0)) {
    return 0;
  }
  if (((BIGNUM *)param_2[3] != (BIGNUM *)0x0) &&
     (iVar2 = ASN1_bn_print(param_1,"subgroup factor:",(BIGNUM *)param_2[3],(uchar *)0x0,param_3),
     iVar2 == 0)) {
    return 0;
  }
  if (param_2[4] != 0) {
    iVar2 = BIO_indent(param_1,param_3,0x80);
    if (iVar2 == 0) {
      return 0;
    }
    iVar2 = BIO_puts(param_1,"seed:");
    if (iVar2 < 1) {
      return 0;
    }
    uVar4 = 0;
    while (uVar3 = param_2[5], uVar4 < uVar3) {
      if ((uVar4 / 0xf) * 0xf == uVar4) {
        iVar2 = BIO_puts(param_1,"\n");
        if (iVar2 < 1) {
          return 0;
        }
        iVar2 = BIO_indent(param_1,param_3 + 4,0x80);
        if (iVar2 == 0) {
          return 0;
        }
        uVar3 = param_2[5];
      }
      pbVar1 = (byte *)(param_2[4] + uVar4);
      uVar4 = uVar4 + 1;
      param3 = "";
      if (uVar4 != uVar3) {
        param3 = ":";
      }
      iVar2 = BIO_printf(param_1,"%02x%s",(uint)*pbVar1,param3);
      if (iVar2 < 1) {
        return 0;
      }
    }
    iVar2 = BIO_write(param_1,&DAT_002c4dae,1);
    if (iVar2 < 1) {
      return 0;
    }
  }
  if ((*(int *)(param_2 + 6) == -1) ||
     ((iVar2 = BIO_indent(param_1,param_3,0x80), iVar2 != 0 &&
      (iVar2 = BIO_printf(param_1,"counter: %d\n",*(int *)(param_2 + 6)), 0 < iVar2)))) {
    return 1;
  }
  return 0;
}

