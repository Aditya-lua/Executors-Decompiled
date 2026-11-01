
undefined8 FUN_001952dc(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 unaff_x19;
  long unaff_x21;
  long lVar3;
  long lVar4;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000020;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  while (unaff_x21 = unaff_x21 + -1, unaff_x21 != 0) {
    func_0x0018b2e8();
  }
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 4,8);
    __Unwind_Resume();
    unaff_x19 = func_0x007a2668();
    func_0x0019fb28(&uStack0000000000000020);
    func_0x00194830(&uStack0000000000000008);
  }
  __Unwind_Resume(unaff_x19);
  func_0x007a2668();
  func_0x00195c58(&lStack_58);
  uVar1 = func_0x0018e2ec(lStack_50,lStack_48);
  uVar2 = _SecItemDelete();
  _CFRelease(uVar1);
  lVar4 = lStack_50;
  for (lVar3 = lStack_48; lVar3 != 0; lVar3 = lVar3 + -1) {
    func_0x0019fb28(lVar4);
    func_0x0019e6a4(lVar4 + 8);
    lVar4 = lVar4 + 0x10;
  }
  if (lStack_58 != 0) {
    func_0x00187bd4(lStack_50,lStack_58 << 4,8);
  }
  return uVar2;
}

