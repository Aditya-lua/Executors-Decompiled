
undefined8 FUN_00697d70(void)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  undefined1 auVar4 [16];
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  uVar1 = func_0x0001753c();
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar1);
  auVar4 = func_0x0001753c();
  plVar2 = auVar4._0_8_;
  lVar3 = (**(code **)(*plVar2 + 0x28))();
  if (lVar3 == auVar4._8_8_) {
                    /* WARNING: Could not recover jumptable at 0x00697dfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*plVar2 + 0x30))(plVar2);
    return uVar1;
  }
  return 0;
}

