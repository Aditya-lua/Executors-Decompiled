
undefined8 FUN_006ead90(undefined8 param_1)

{
  uint uVar1;
  undefined8 uVar2;
  long unaff_x20;
  uint unaff_w21;
  undefined8 uVar3;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  ulong uStack_28;
  
  uVar2 = func_0x006e67c8(param_1,3);
  uVar1 = func_0x006e6c08();
  if ((int)uVar1 < 0) {
    func_0x006e63b0();
  }
  else if (uVar1 <= in_stack_00000000) {
    if ((ulong)uVar1 + (ulong)unaff_w21 <= in_stack_00000008) {
      _memcpy(unaff_x20 + (int)unaff_w21,uVar2);
      return 0;
    }
    goto code_r0x006eae18;
  }
  func_0x006e644c();
code_r0x006eae18:
  uVar2 = func_0x006e644c();
  uStack_28 = 0;
  func_0x006e6914(uVar2,1,&uStack_28);
  uVar3 = NEON_ucvtf(uStack_28 & 0xffffffff);
  func_0x006e3850(uVar3,uVar2);
  return 1;
}

