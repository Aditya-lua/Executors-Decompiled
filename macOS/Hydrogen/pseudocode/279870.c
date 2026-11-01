
void FUN_00279870(long *param_1,undefined1 *param_2,long param_3)

{
  long lVar1;
  undefined8 extraout_x1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auStack_20 [16];
  undefined1 *puStack_10;
  undefined *puStack_8;
  
  if (param_3 < 0) {
    uVar3 = 0;
LAB_002798f4:
    func_0x007a1f00(uVar3,param_3,&UNK_009cc668);
    puStack_8 = &
                __ZN80__LT_aws_lc_rs__encoding__EcPrivateKeyRfc5915Der_u20_as_u20_core__fmt__Debug_GT_3fmt17hde4051283b372f87E
    ;
    puStack_10 = auStack_20 + 0x50;
    func_0x00469240(auStack_20,extraout_x1,&UNK_0082e0d4,0x16);
    func_0x00465628(auStack_20);
    return;
  }
  if (param_3 == 0) {
    lVar1 = 1;
  }
  else {
    uVar3 = 1;
    lVar1 = func_0x00187bd0(param_3,1);
    if (lVar1 == 0) goto LAB_002798f4;
    _memcpy(lVar1,param_2,param_3);
    lVar2 = param_3;
    do {
      *param_2 = 0;
      lVar2 = lVar2 + -1;
      param_2 = param_2 + 1;
    } while (lVar2 != 0);
  }
  *param_1 = param_3;
  param_1[1] = lVar1;
  param_1[2] = param_3;
  return;
}

