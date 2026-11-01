
undefined8 FUN_0072edd8(undefined8 param_1,undefined8 param_2,uint param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uStack0000000000000008;
  
  *(uint *)(unaff_x19 + 0x14) = param_3;
  if (param_3 < 0x81) {
    _memcpy(unaff_x19 + 0x18,*(undefined8 *)(unaff_x21 + 0x20));
    uVar1 = func_0x00730fe0(&uStack0000000000000008,0xa2b278);
    uVar2 = uStack0000000000000008;
    if ((int)uVar1 != 0) {
      uVar2 = 0;
    }
    *unaff_x20 = uVar2;
    uVar2 = uStack0000000000000008;
    if ((int)uVar1 == 0) {
      return uVar1;
    }
  }
  else {
    uVar1 = 100;
    uVar2 = 0;
    *unaff_x20 = 0;
  }
  (*pcRam0000000000a2b5f0)(uVar2);
  uStack0000000000000008 = 0;
  (*pcRam0000000000a2b5f0)();
  return uVar1;
}

