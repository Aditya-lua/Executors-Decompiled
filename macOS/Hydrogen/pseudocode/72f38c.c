
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0072f38c(void)

{
  uint uVar1;
  bool in_ZR;
  undefined8 uVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uVar3;
  int unaff_w22;
  undefined8 uStack0000000000000008;
  
  if (in_ZR) {
    *(undefined8 *)(unaff_x19 + 0xc) = _UNK_008ccd40;
    uVar1 = *(uint *)(unaff_x21 + 0x10);
    *(uint *)(unaff_x19 + 0x14) = uVar1;
  }
  else if (unaff_w22 == 6) {
    *(undefined8 *)(unaff_x19 + 0xc) = _UNK_007fc080;
    uVar1 = *(uint *)(unaff_x21 + 0x10);
    *(uint *)(unaff_x19 + 0x14) = uVar1;
  }
  else {
    *(undefined8 *)(unaff_x19 + 0xc) = _UNK_008ccd48;
    uVar1 = *(uint *)(unaff_x21 + 0x10);
    *(uint *)(unaff_x19 + 0x14) = uVar1;
  }
  if (uVar1 < 0x81) {
    _memcpy(unaff_x19 + 0x18,*(undefined8 *)(unaff_x21 + 0x20));
    uVar3 = func_0x00730fe0(&uStack0000000000000008,0xa2b368);
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

