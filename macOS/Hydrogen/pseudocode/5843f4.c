
undefined8 FUN_005843f4(undefined8 param_1,long *param_2)

{
  undefined1 in_ZR;
  long *plVar1;
  long *plVar2;
  long in_x9;
  long in_x11;
  long *unaff_x19;
  long unaff_x21;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000008;
  
  while( true ) {
    if ((!(bool)in_ZR || in_x9 != in_x11) || (*unaff_x19 != *param_2)) {
      return 0;
    }
    auVar3 = func_0x0058027c(&uStack0000000000000008);
    unaff_x19 = auVar3._8_8_;
    plVar1 = auVar3._0_8_;
    if (plVar1 == (long *)0x0) {
      return 1;
    }
    auVar3 = func_0x0058027c(unaff_x21 + 0x48);
    param_2 = auVar3._8_8_;
    plVar2 = auVar3._0_8_;
    if (plVar2 == (long *)0x0) break;
    if (*plVar1 != *plVar2) {
      return 0;
    }
    in_x9 = plVar1[2];
    in_x11 = plVar2[2];
    in_ZR = plVar1[1] == plVar2[1];
  }
  return 1;
}

