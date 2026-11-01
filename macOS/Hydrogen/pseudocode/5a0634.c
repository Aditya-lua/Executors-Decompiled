
void FUN_005a0634(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 long param_7)

{
  long in_x9;
  long in_x10;
  long lVar1;
  long *in_x11;
  undefined8 *unaff_x19;
  long unaff_x21;
  byte unaff_w23;
  long unaff_x24;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  lVar3 = param_2._8_8_;
  lVar2 = param_2._0_8_;
  lVar1 = in_x10;
  do {
    lVar4 = param_6._0_8_ + lVar2 * 0x40;
    lVar5 = param_6._8_8_ + lVar3 * 0x40;
    in_x11[-3] = lVar5;
    in_x11[-4] = lVar4;
    in_x11[-1] = lVar5 + param_5._8_8_;
    in_x11[-2] = lVar4 + param_5._0_8_;
    in_x11[1] = lVar5 + param_4._8_8_;
    *in_x11 = lVar4 + param_4._0_8_;
    in_x11[3] = lVar5 + param_3._8_8_;
    in_x11[2] = lVar4 + param_3._0_8_;
    lVar2 = lVar2 + 8;
    lVar3 = lVar3 + 8;
    lVar1 = lVar1 + -8;
    in_x11 = in_x11 + 8;
  } while (lVar1 != 0);
  if (in_x9 != in_x10) {
    lVar2 = in_x9 - in_x10;
    lVar1 = unaff_x24 + in_x10 * 0x40;
    do {
      *(long *)(param_7 + param_1 * 8) = lVar1;
      param_1 = param_1 + 1;
      lVar1 = lVar1 + 0x40;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  if ((unaff_w23 & unaff_x21 != 0) == 1) {
    *(long *)(param_7 + param_1 * 8) = unaff_x21;
    param_1 = param_1 + 1;
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = param_1;
  return;
}

