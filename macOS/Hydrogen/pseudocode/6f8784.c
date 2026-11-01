
undefined8 FUN_006f8784(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong unaff_x20;
  long in_stack_00000000;
  long in_stack_00000008;
  
  uVar2 = func_0x006e671c();
  in_stack_00000008 = unaff_x20 + in_stack_00000008;
  func_0x006e4118();
  if (in_stack_00000000 == 0) {
    unaff_x20 = unaff_x20 + 1;
  }
  if (unaff_x20 <= (ulong)(in_stack_00000008 - in_stack_00000000)) {
    do {
      iVar1 = _memcmp(unaff_x20,uVar2,in_stack_00000000);
      if (iVar1 == 0) {
        func_0x006e3870();
        func_0x006e38d8();
        func_0x006e4514();
        if (in_stack_00000000 != 0) {
          unaff_x20 = (in_stack_00000000 + unaff_x20) - 1;
        }
      }
      unaff_x20 = unaff_x20 + 1;
    } while (unaff_x20 <= (ulong)(in_stack_00000008 - in_stack_00000000));
  }
  if (in_stack_00000000 != 0) {
    func_0x006e3870();
    func_0x006e38d8();
    func_0x006e4514();
  }
  return 1;
}

