
undefined8 FUN_006eacc0(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  ulong in_stack_00000008;
  ulong uStack_68;
  long lStack_60;
  undefined8 uStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_40;
  ulong uStack_38;
  undefined1 auStack_6 [6];
  
  func_0x006e6914(param_1,1);
  uVar3 = func_0x006e6bc0();
  uVar1 = func_0x006e6bc0();
  if ((int)uVar1 < 0) {
    func_0x006e63b0();
  }
  else if ((ulong)uVar1 + (uVar3 & 0xffffffff) <= in_stack_00000008) {
    func_0x006e38d8();
    return 1;
  }
  uVar4 = func_0x006e644c();
  uStack_38 = 0;
  lVar5 = func_0x006e6914(uVar4,1,&uStack_38);
  uVar1 = func_0x006e6bc0(uVar4,2);
  uStack_40 = 0;
  uVar6 = func_0x006e67c8(uVar4,3,&uStack_40);
  uVar2 = func_0x006e6c08(uVar4,4,uStack_40 & 0xffffffff);
  if ((int)uVar2 < 0) {
    func_0x006e63b0(uVar4,4,"count");
  }
  else if (uVar2 <= uStack_40) {
    if ((ulong)uVar2 + (ulong)uVar1 <= uStack_38) {
      _memcpy(lVar5 + (int)uVar1,uVar6);
      return 0;
    }
    goto code_r0x006eae18;
  }
  func_0x006e644c(uVar4,"string length overflow");
code_r0x006eae18:
  uVar6 = func_0x006e644c(uVar4,"buffer access out of bounds");
  puStack_48 = &DAT_006eae28;
  uStack_68 = 0;
  lStack_60 = lVar5;
  uStack_58 = uVar4;
  puStack_50 = auStack_6 + -10;
  func_0x006e6914(uVar6,1,&uStack_68);
  uVar4 = NEON_ucvtf(uStack_68 & 0xffffffff);
  func_0x006e3850(uVar4,uVar6);
  return 1;
}

