
undefined1  [16] FUN_0044c924(void)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  short *unaff_x19;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    uVar1 = 1;
    uVar2 = 0x2c;
  }
  else if (*unaff_x19 == 0x7367) {
    uVar1 = 1;
    uVar2 = 0x2d;
  }
  else if (*unaff_x19 == 0x7274) {
    uVar1 = 1;
    uVar2 = 0x30;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x5e;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}

