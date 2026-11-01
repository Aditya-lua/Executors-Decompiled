
void FUN_0064b010(void)

{
  undefined4 uVar1;
  uint uVar2;
  undefined4 uVar3;
  long unaff_x19;
  int unaff_w21;
  
  if (unaff_w21 == 0) {
    uVar2 = func_0x00602288();
    uVar3 = 6;
    if (0x59a < uVar2) {
      uVar3 = 7;
    }
    uVar1 = 5;
    if (0x21b < uVar2) {
      uVar1 = uVar3;
    }
    uVar3 = 4;
    if (0xc5 < uVar2) {
      uVar3 = uVar1;
    }
    uVar1 = 3;
    if (0x46 < uVar2) {
      uVar1 = uVar3;
    }
    uVar3 = 2;
    if (0x18 < uVar2) {
      uVar3 = uVar1;
    }
    uVar1 = 1;
    if (0x11 < uVar2) {
      uVar1 = uVar3;
    }
    *(undefined4 *)(unaff_x19 + 0x60) = uVar1;
  }
  func_0x006075d4();
  return;
}

