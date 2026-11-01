
undefined1  [16] FUN_004d50e8(long *param_1,long *param_2,ulong param_3)

{
  undefined1 auVar1 [16];
  undefined1 in_ZR;
  long *in_x9;
  long *plVar2;
  long in_x10;
  long in_x11;
  long lVar3;
  undefined1 auVar4 [16];
  
  auVar4._8_8_ = param_3;
  while( true ) {
    if ((bool)in_ZR) {
      auVar1._8_8_ = 0;
      auVar1._0_8_ = auVar4._8_8_;
      return auVar1 << 0x40;
    }
    plVar2 = in_x9 + 4;
    lVar3 = *in_x9;
    *param_2 = (long)plVar2;
    param_2[2] = in_x10;
    auVar4._8_8_ = CONCAT44(0,(int)auVar4._8_8_ + 1);
    in_x10 = in_x10 + 1;
    if (lVar3 != in_x11) break;
    in_ZR = plVar2 == param_1;
    in_x9 = plVar2;
  }
  auVar4._0_8_ = 1;
  return auVar4;
}

