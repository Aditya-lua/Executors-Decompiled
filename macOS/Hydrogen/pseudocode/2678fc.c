
void FUN_002678fc(ulong *param_1,ulong param_2)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  ulong uVar3;
  undefined8 uVar4;
  
  uVar4 = 0;
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_2;
  uVar3 = param_2 * 0x50;
  if ((SUB168(auVar1 * ZEXT816(0x50),8) == 0) && (uVar3 < 0x7ffffffffffffff9)) {
    if (uVar3 != 0) {
      uVar4 = 8;
      uVar2 = func_0x00187bd0(uVar3,8);
      if (uVar2 != 0) goto LAB_00267970;
      goto LAB_00267954;
    }
  }
  else {
LAB_00267954:
    func_0x007a1f00(uVar4,uVar3,&UNK_009cb380);
  }
  param_2 = 0;
  uVar2 = 8;
LAB_00267970:
  *param_1 = param_2;
  param_1[1] = uVar2;
  param_1[2] = 0;
  return;
}

