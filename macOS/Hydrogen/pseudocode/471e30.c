
void FUN_00471e30(void)

{
  bool in_ZR;
  undefined1 *unaff_x19;
  int unaff_w26;
  undefined8 uVar1;
  
  if (in_ZR) {
    uVar1 = 0xfff0000000000000;
    if (unaff_w26 != 0x2d) {
      uVar1 = 0x7ff0000000000000;
    }
    *(undefined8 *)(unaff_x19 + 8) = uVar1;
    *unaff_x19 = 0;
  }
  else {
    unaff_x19[1] = 1;
    *unaff_x19 = 1;
  }
  return;
}

