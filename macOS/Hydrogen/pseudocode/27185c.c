
void FUN_0027185c(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  long *extraout_x8;
  long unaff_x29;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  if (*(long *)(unaff_x29 + -0x38) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x30),*(long *)(unaff_x29 + -0x38),1);
  }
  lVar2 = __Unwind_Resume(param_1);
  func_0x00281e30(&uStack_98,0x2c);
  iVar1 = func_0x00290560(&uStack_98,*(undefined8 *)(lVar2 + 0x20));
  if (iVar1 == 1) {
    uStack_48 = uStack_90;
    uStack_50 = uStack_98;
    uStack_38 = uStack_80;
    uStack_40 = uStack_88;
    uStack_28 = uStack_70;
    uStack_30 = uStack_78;
    func_0x00276f24(&lStack_68,&uStack_50);
    if (lStack_68 == -0x7fffffffffffffff) {
      *extraout_x8 = -0x7fffffffffffffff;
    }
    else {
      extraout_x8[1] = lStack_60;
      *extraout_x8 = lStack_68;
      extraout_x8[2] = lStack_58;
    }
  }
  else {
    *extraout_x8 = -0x7fffffffffffffff;
    func_0x00281ecc(&uStack_98);
  }
  return;
}

