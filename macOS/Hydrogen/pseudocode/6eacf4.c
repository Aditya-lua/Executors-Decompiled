
undefined8 FUN_006eacf4(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  ulong in_stack_00000008;
  ulong uStack_68;
  long lStack_60;
  undefined8 uStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_40;
  ulong uStack_38;
  undefined1 auStack_6 [6];
  
  if (param_1 <= in_stack_00000008) {
    func_0x006e38d8();
    return 1;
  }
  uVar3 = func_0x006e644c();
  uStack_38 = 0;
  lVar4 = func_0x006e6914(uVar3,1,&uStack_38);
  uVar1 = func_0x006e6bc0(uVar3,2);
  uStack_40 = 0;
  uVar5 = func_0x006e67c8(uVar3,3,&uStack_40);
  uVar2 = func_0x006e6c08(uVar3,4,uStack_40 & 0xffffffff);
  if ((int)uVar2 < 0) {
    func_0x006e63b0(uVar3,4,"count");
  }
  else if (uVar2 <= uStack_40) {
    if ((ulong)uVar2 + (ulong)uVar1 <= uStack_38) {
      _memcpy(lVar4 + (int)uVar1,uVar5);
      return 0;
    }
    goto code_r0x006eae18;
  }
  func_0x006e644c(uVar3,"string length overflow");
code_r0x006eae18:
  uVar5 = func_0x006e644c(uVar3,"buffer access out of bounds");
  puStack_48 = &DAT_006eae28;
  uStack_68 = 0;
  lStack_60 = lVar4;
  uStack_58 = uVar3;
  puStack_50 = auStack_6 + -10;
  func_0x006e6914(uVar5,1,&uStack_68);
  uVar3 = NEON_ucvtf(uStack_68 & 0xffffffff);
  func_0x006e3850(uVar3,uVar5);
  return 1;
}

