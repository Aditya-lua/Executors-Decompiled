
void FUN_005dc610(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],long param_9)

{
  long in_x9;
  long in_x10;
  long *in_x11;
  long in_x12;
  long in_x13;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  
  lVar6 = param_8._8_8_;
  lVar5 = param_8._0_8_;
  lVar4 = param_7._8_8_;
  lVar3 = param_7._0_8_;
  lVar2 = param_6._8_8_;
  lVar1 = param_6._0_8_;
  while( true ) {
    in_x11[-3] = lVar4;
    in_x11[-4] = lVar3;
    in_x11[-1] = lVar6;
    in_x11[-2] = lVar5;
    in_x11[1] = lVar2 + param_4._8_8_;
    *in_x11 = lVar1 + param_4._0_8_;
    in_x11[3] = lVar2 + param_5._8_8_;
    in_x11[2] = lVar1 + param_5._0_8_;
    in_x13 = in_x13 + 0x40;
    in_x12 = in_x12 + -8;
    if (in_x12 == 0) break;
    lVar3 = in_x13 + param_2._0_8_;
    lVar4 = in_x13 + param_2._8_8_;
    lVar5 = in_x13 + param_3._0_8_;
    lVar6 = in_x13 + param_3._8_8_;
    in_x11 = in_x11 + 8;
    lVar1 = in_x13;
    lVar2 = in_x13;
  }
  if (in_x10 != param_1) {
    do {
      *(long *)(param_9 + param_1 * 8) = in_x9;
      in_x9 = in_x9 + 8;
      param_1 = param_1 + 1;
    } while (in_x9 != unaff_x22 + unaff_x20);
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_9;
  unaff_x19[2] = param_1;
  return;
}

