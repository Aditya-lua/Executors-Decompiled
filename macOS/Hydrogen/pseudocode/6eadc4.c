
undefined8 FUN_006eadc4(ulong param_1)

{
  undefined8 uVar1;
  long unaff_x20;
  int unaff_w21;
  undefined8 uVar2;
  ulong in_stack_00000008;
  ulong uStack_28;
  
  if (in_stack_00000008 < param_1) {
    uVar1 = func_0x006e644c();
    uStack_28 = 0;
    func_0x006e6914(uVar1,1,&uStack_28);
    uVar2 = NEON_ucvtf(uStack_28 & 0xffffffff);
    func_0x006e3850(uVar2,uVar1);
    return 1;
  }
  _memcpy(unaff_x20 + unaff_w21);
  return 0;
}

