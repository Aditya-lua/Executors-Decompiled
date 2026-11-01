
uint FUN_006f95a0(undefined8 param_1)

{
  long lVar1;
  undefined8 unaff_x19;
  uint uVar2;
  uint uVar3;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  long unaff_x25;
  long unaff_x29;
  undefined4 uStack0000000000000000;
  long lStack0000000000000010;
  long lStack0000000000000018;
  uint uStack0000000000000028;
  
  *(undefined8 *)(unaff_x29 + -0x60) = param_1;
  uStack0000000000000000 = 200;
  lStack0000000000000010 = unaff_x20 + *(long *)(unaff_x29 + -0x58);
  lStack0000000000000018 = unaff_x21 + unaff_x25;
  uStack0000000000000028 = 0;
  lVar1 = func_0x006f9748();
  uVar3 = uStack0000000000000028;
  if (lVar1 == 0) {
    func_0x006e383c();
    uVar2 = 1;
  }
  else if (unaff_w22 == 0) {
    uVar2 = uStack0000000000000028;
    if (uStack0000000000000028 < 2) {
      uVar2 = 1;
    }
    func_0x006e6978(unaff_x19,uVar2,"too many captures");
    if ((int)uVar2 < 1) {
      uVar2 = uVar3;
    }
    else {
      uVar3 = 0;
      do {
        func_0x006fa2fc();
        uVar3 = uVar3 + 1;
      } while (uVar2 != uVar3);
    }
  }
  else {
    func_0x006e3870();
    func_0x006e3870();
    uVar3 = uStack0000000000000028;
    func_0x006e6978(unaff_x19,uStack0000000000000028,"too many captures");
    if (0 < (int)uVar3) {
      uVar2 = 0;
      do {
        func_0x006fa2fc();
        uVar2 = uVar2 + 1;
      } while (uVar3 != uVar2);
    }
    uVar2 = uVar3 + 2;
  }
  return uVar2;
}

