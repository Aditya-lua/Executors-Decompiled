
undefined8 FUN_0072edd4(void)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uStack0000000000000008;
  
  uVar1 = *(uint *)(unaff_x21 + 0x10);
  *(uint *)(unaff_x19 + 0x14) = uVar1;
  if (uVar1 < 0x81) {
    _memcpy(unaff_x19 + 0x18,*(undefined8 *)(unaff_x21 + 0x20));
    uVar2 = func_0x00730fe0(&uStack0000000000000008,0xa2b278);
    uVar3 = uStack0000000000000008;
    if ((int)uVar2 != 0) {
      uVar3 = 0;
    }
    *unaff_x20 = uVar3;
    uVar3 = uStack0000000000000008;
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
  else {
    uVar2 = 100;
    uVar3 = 0;
    *unaff_x20 = 0;
  }
  (*pcRam0000000000a2b5f0)(uVar3);
  uStack0000000000000008 = 0;
  (*pcRam0000000000a2b5f0)();
  return uVar2;
}

