
undefined8 FUN_006eadf8(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  ulong uStack_28;
  
  func_0x006e63b0();
  func_0x006e644c();
  uVar1 = func_0x006e644c();
  uStack_28 = 0;
  func_0x006e6914(uVar1,1,&uStack_28);
  uVar2 = NEON_ucvtf(uStack_28 & 0xffffffff);
  func_0x006e3850(uVar2,uVar1);
  return 1;
}

