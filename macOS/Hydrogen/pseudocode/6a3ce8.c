
void FUN_006a3ce8(code *param_1)

{
  uint uVar1;
  long unaff_x19;
  undefined8 uVar2;
  undefined8 uStack0000000000000008;
  undefined *in_stack_00000010;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  
  (*param_1)();
  uVar2 = *(undefined8 *)(unaff_x19 + 0x70);
  uVar1 = *(uint *)(unaff_x19 + 0x10);
  func_0x005edf2c(&uStack0000000000000008,0);
  uStack0000000000000008 = &UNK_00a0e1c8;
  in_stack_00000010 = &UNK_00a0e358;
  in_stack_00000030 = 0;
  in_stack_00000020 = uVar2;
  in_stack_00000028 = (ulong)uVar1;
  func_0x006a3df8();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
    return;
  }
  uVar2 = ___stack_chk_fail();
  func_0x0003e9ec();
  do {
    func_0x0003e9ec(unaff_x19 + 0x58);
    func_0x0003e9ec();
    func_0x0003e9ec(unaff_x19 + 0x18);
    if (*(long **)(unaff_x19 + 8) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x19 + 8) + 8))();
    }
    uVar2 = __Unwind_Resume(uVar2);
  } while( true );
}

