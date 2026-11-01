
undefined1  [16] FUN_005e101c(long param_1,long param_2,ulong param_3,long param_4,long param_5)

{
  long extraout_x8;
  undefined8 in_x9;
  undefined8 extraout_x9;
  ulong in_x12;
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  
  auVar1._8_8_ = param_3;
  auVar1._0_8_ = param_2;
  if (-0x41 < *(char *)(param_1 + param_4)) {
    if (param_3 <= in_x12) goto LAB_005e104c;
    if (-0x41 < *(char *)(param_1 + param_5)) goto LAB_005e1054;
  }
  do {
    auVar1 = func_0x007a297c(param_1);
    param_1 = extraout_x8;
    in_x9 = extraout_x9;
LAB_005e104c:
    param_2 = auVar1._0_8_;
  } while (param_5 != auVar1._8_8_);
LAB_005e1054:
  *(long *)(param_2 + 0x10) = param_5;
  *(long *)(param_2 + 0x18) = *(long *)(param_2 + 0x18) + 1;
  auVar2._8_8_ = in_x9;
  auVar2._0_8_ = param_1 + param_4;
  return auVar2;
}

