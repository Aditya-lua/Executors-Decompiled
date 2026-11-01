
undefined8 FUN_00195390(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x00195c58(&uStack0000000000000008);
  lVar4 = in_stack_00000018;
  lVar1 = in_stack_00000010;
  uVar2 = func_0x0018e2ec(in_stack_00000010,in_stack_00000018);
  uVar3 = _SecItemDelete();
  _CFRelease(uVar2);
  lVar5 = lVar1;
  for (; lVar4 != 0; lVar4 = lVar4 + -1) {
    func_0x0019fb28(lVar5);
    func_0x0019e6a4(lVar5 + 8);
    lVar5 = lVar5 + 0x10;
  }
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(lVar1,uStack0000000000000008 << 4,8);
  }
  return uVar3;
}

