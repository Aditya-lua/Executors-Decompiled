
void FUN_005cbb94(long *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],long param_5)

{
  long in_x9;
  long *in_x10;
  long lVar1;
  long in_x11;
  long unaff_x20;
  long unaff_x21;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  
  lVar3 = param_2._8_8_;
  lVar2 = param_2._0_8_;
  lVar1 = in_x9;
  do {
    lVar4 = param_3._0_8_ + lVar2 * 0x10;
    lVar5 = param_3._8_8_ + lVar3 * 0x10;
    in_x10[-3] = lVar5 + param_4._8_8_;
    in_x10[-4] = lVar4 + param_4._0_8_;
    in_x10[-1] = lVar5 + in_x11;
    in_x10[-2] = lVar4 + in_x11;
    in_x10[1] = lVar5 + 0x48;
    *in_x10 = lVar4 + 0x48;
    in_x10[3] = lVar5 + 0x68;
    in_x10[2] = lVar4 + 0x68;
    lVar2 = lVar2 + param_4._0_8_;
    lVar3 = lVar3 + param_4._8_8_;
    lVar1 = lVar1 + -8;
    in_x10 = in_x10 + 8;
  } while (lVar1 != 0);
  if (unaff_x21 != in_x9) {
    lVar1 = unaff_x20 + in_x9 * 0x10 + 8;
    do {
      *(long *)(param_5 + in_x9 * 8) = lVar1;
      in_x9 = in_x9 + 1;
      lVar1 = lVar1 + 0x10;
    } while (unaff_x21 != in_x9);
  }
  *param_1 = unaff_x21;
  param_1[1] = param_5;
  param_1[2] = unaff_x21;
  return;
}

