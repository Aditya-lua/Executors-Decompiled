
void FUN_005dc620(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],long param_6)

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
  
  while( true ) {
    in_x13 = in_x13 + 0x40;
    in_x12 = in_x12 + -8;
    if (in_x12 == 0) break;
    in_x11[-3] = in_x13 + param_2._8_8_;
    in_x11[-4] = in_x13 + param_2._0_8_;
    in_x11[-1] = in_x13 + param_3._8_8_;
    in_x11[-2] = in_x13 + param_3._0_8_;
    in_x11[1] = in_x13 + param_4._8_8_;
    *in_x11 = in_x13 + param_4._0_8_;
    in_x11[3] = in_x13 + param_5._8_8_;
    in_x11[2] = in_x13 + param_5._0_8_;
    in_x11 = in_x11 + 8;
  }
  if (in_x10 != param_1) {
    do {
      *(long *)(param_6 + param_1 * 8) = in_x9;
      in_x9 = in_x9 + 8;
      param_1 = param_1 + 1;
    } while (in_x9 != unaff_x22 + unaff_x20);
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_6;
  unaff_x19[2] = param_1;
  return;
}

