
undefined1  [16] FUN_0044c864(void)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  int *unaff_x19;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    uVar1 = 1;
    uVar2 = 0x1b;
  }
  else if (*unaff_x19 == 0x376d6d78) {
    uVar1 = 1;
    uVar2 = 0x1c;
  }
  else if (*unaff_x19 == 0x7274646c) {
    uVar1 = 1;
    uVar2 = 0x31;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x5e;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}

