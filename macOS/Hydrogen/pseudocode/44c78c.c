
undefined1  [16] FUN_0044c78c(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int in_w8;
  int in_w9;
  int in_w10;
  short *unaff_x19;
  undefined1 auVar3 [16];
  
  if (in_w9 == in_w8 && in_w10 == 0x35) {
    uVar1 = 1;
    uVar2 = 0x22;
  }
  else if (*unaff_x19 == 0x6d6d && (char)unaff_x19[1] == '6') {
    uVar1 = 1;
    uVar2 = 0x23;
  }
  else if (*unaff_x19 == 0x6d6d && (char)unaff_x19[1] == '7') {
    uVar1 = 1;
    uVar2 = 0x24;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x5e;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}

