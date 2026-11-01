
void FUN_00195648(void)

{
  int iVar1;
  undefined8 *unaff_x19;
  long lVar2;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  iVar1 = _SecItemCopyMatching();
  if (iVar1 == 0) {
    func_0x00195b20();
    _CFRelease();
    lVar2 = in_stack_00000020;
    for (; in_stack_00000028 != 0; in_stack_00000028 = in_stack_00000028 + -1) {
      func_0x0019fb28(lVar2);
      func_0x0019e6a4(lVar2 + 8);
      lVar2 = lVar2 + 0x10;
    }
  }
  else {
    *(int *)(unaff_x19 + 1) = iVar1;
    *unaff_x19 = 0x8000000000000000;
    _CFRelease();
    lVar2 = in_stack_00000020;
    for (; in_stack_00000028 != 0; in_stack_00000028 = in_stack_00000028 + -1) {
      func_0x0019fb28(lVar2);
      func_0x0019e6a4(lVar2 + 8);
      lVar2 = lVar2 + 0x10;
    }
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 4,8);
  }
  return;
}

