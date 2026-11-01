
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0072ee34(void)

{
  uint uVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uVar3;
  undefined8 uStack0000000000000008;
  
  *(undefined8 *)(unaff_x19 + 0xc) = _UNK_008ccd48;
  uVar1 = *(uint *)(unaff_x21 + 0x10);
  *(uint *)(unaff_x19 + 0x14) = uVar1;
  if (uVar1 < 0x81) {
    _memcpy(unaff_x19 + 0x18,*(undefined8 *)(unaff_x21 + 0x20));
    uVar3 = func_0x00730fe0(&uStack0000000000000008,0xa2b278);
    uVar2 = uStack0000000000000008;
    if ((int)uVar3 != 0) {
      uVar2 = 0;
    }
    *unaff_x20 = uVar2;
    uVar2 = uStack0000000000000008;
    if ((int)uVar3 == 0) {
      return uVar3;
    }
  }
  else {
    uVar3 = 100;
    *unaff_x20 = 0;
    uVar2 = 0;
  }
  (*pcRam0000000000a2b5f0)(uVar2);
  uStack0000000000000008 = 0;
  (*pcRam0000000000a2b5f0)();
  return uVar3;
}

