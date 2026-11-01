
undefined8 FUN_001957d0(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  func_0x00187bd4(param_2,param_1 << 4,8);
  __Unwind_Resume();
  uVar1 = func_0x007a2668();
  func_0x0019fb28(&uStack0000000000000030);
  func_0x00194830(&uStack0000000000000018);
  __Unwind_Resume(uVar1);
  func_0x007a2668();
  func_0x00195f10(&lStack_58);
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

