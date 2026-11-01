
undefined8 FUN_006ead5c(undefined8 param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 uStack0000000000000008;
  ulong uStack_28;
  long lStack_20;
  undefined8 uStack_18;
  
  _uStack0000000000000008 = 0;
  lVar3 = func_0x006e6914(param_1,1,&uStack0000000000000008);
  uVar1 = func_0x006e6bc0(param_1,2);
  uVar4 = func_0x006e67c8(param_1,3);
  iVar2 = func_0x006e6c08(param_1,4,0);
  if (iVar2 < 0) {
    func_0x006e63b0(param_1,4,"count");
  }
  else if (iVar2 == 0) {
    if (uVar1 <= _uStack0000000000000008) {
      _memcpy(lVar3 + (int)uVar1,uVar4);
      return 0;
    }
    goto code_r0x006eae18;
  }
  func_0x006e644c(param_1,"string length overflow");
code_r0x006eae18:
  uVar4 = func_0x006e644c(param_1,"buffer access out of bounds");
  uStack_28 = 0;
  lStack_20 = lVar3;
  uStack_18 = param_1;
  func_0x006e6914(uVar4,1,&uStack_28);
  uVar5 = NEON_ucvtf(uStack_28 & 0xffffffff);
  func_0x006e3850(uVar5,uVar4);
  return 1;
}

