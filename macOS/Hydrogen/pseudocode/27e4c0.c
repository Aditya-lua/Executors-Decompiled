
ulong FUN_0027e4c0(undefined8 param_1)

{
  uint uVar1;
  ulong in_x6;
  long unaff_x20;
  uint uStack0000000000000008;
  
  *(undefined8 *)(unaff_x20 + 0x48) = param_1;
  if (*(code **)(unaff_x20 + 0x10) != (code *)0x0) {
    _uStack0000000000000008 = (ulong)((uint)in_x6 & ((int)(uint)in_x6 >> 0x1f ^ 0xffffffffU));
    uVar1 = (**(code **)(unaff_x20 + 0x10))();
    if ((int)uVar1 < 1) {
      uStack0000000000000008 = uVar1;
    }
    in_x6 = (ulong)uStack0000000000000008;
  }
  return in_x6;
}

