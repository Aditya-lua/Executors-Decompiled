
undefined8 FUN_00054304(ulong param_1)

{
  ulong uVar1;
  ulong unaff_x20;
  long unaff_x21;
  long in_stack_00000008;
  undefined7 uStack0000000000000018;
  
  if (param_1 < 0x17) {
    _uStack0000000000000018 = CONCAT17((char)unaff_x20,uStack0000000000000018);
    if (unaff_x20 == 0) goto LAB_00054358;
  }
  else {
    uVar1 = (unaff_x20 & 0xfffffffffffffff8) + 8;
    if ((unaff_x20 | 7) != 0x17) {
      uVar1 = unaff_x20 | 7;
    }
    unaff_x21 = __Znwm(uVar1 + 1);
    _uStack0000000000000018 = uVar1 + 1 | 0x8000000000000000;
    in_stack_00000008 = unaff_x21;
  }
  _memmove(unaff_x21);
LAB_00054358:
  *(undefined1 *)(unaff_x21 + unaff_x20) = 0;
  func_0x000543d4(0xa333b8);
  if ((long)_uStack0000000000000018 < 0) {
    __ZdlPv(in_stack_00000008);
    return 0;
  }
  return 0;
}

