
void FUN_005c37b4(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],long param_8)

{
  long *in_x9;
  long in_x10;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  lVar2 = param_2._8_8_;
  lVar1 = param_2._0_8_;
  while( true ) {
    lVar1 = lVar1 + param_4._0_8_;
    lVar2 = lVar2 + param_4._8_8_;
    in_x10 = in_x10 + -8;
    if (in_x10 == 0) break;
    lVar3 = param_3._0_8_ + lVar1 * 0x10;
    lVar4 = param_3._8_8_ + lVar2 * 0x10;
    in_x9[-3] = lVar4 + param_4._8_8_;
    in_x9[-4] = lVar3 + param_4._0_8_;
    in_x9[-1] = lVar4 + param_5._8_8_;
    in_x9[-2] = lVar3 + param_5._0_8_;
    in_x9[1] = lVar4 + param_6._8_8_;
    *in_x9 = lVar3 + param_6._0_8_;
    in_x9[3] = lVar4 + param_7._8_8_;
    in_x9[2] = lVar3 + param_7._0_8_;
    in_x9 = in_x9 + 8;
  }
  if (unaff_x21 != param_1) {
    lVar1 = unaff_x22 + param_1 * 0x10 + 8;
    do {
      *(long *)(param_8 + param_1 * 8) = lVar1;
      param_1 = param_1 + 1;
      lVar1 = lVar1 + 0x10;
    } while (unaff_x21 != param_1);
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_8;
  unaff_x19[2] = unaff_x21;
  return;
}

