
undefined1  [16] FUN_0044c744(void)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  uint in_w8;
  int in_w10;
  ushort *unaff_x19;
  undefined1 auVar3 [16];
  
  if (in_ZR && in_w10 == 0x32) {
    uVar1 = 1;
    uVar2 = 0x1f;
  }
  else if (*unaff_x19 == in_w8 && (char)unaff_x19[1] == '3') {
    uVar1 = 1;
    uVar2 = 0x20;
  }
  else if (*unaff_x19 == 0x6d6d && (char)unaff_x19[1] == '4') {
    uVar1 = 1;
    uVar2 = 0x21;
  }
  else if (*unaff_x19 == 0x6d6d && (char)unaff_x19[1] == '5') {
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

