
void FUN_0065ba7c(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long unaff_x29;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  
  if (in_stack_00000080 <= in_stack_00000078) {
    in_stack_00000078 = in_stack_00000080;
  }
  if (in_stack_00000088 != 0) {
    if (in_stack_00000078 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + in_stack_00000078 * 8) = 0;
        in_stack_00000078 = in_stack_00000078 - 1;
      } while (in_stack_00000078 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
    ___stack_chk_fail();
    uVar2 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
    ___cxa_throw(uVar2,&DAT_009fb298,&DAT_0063885c);
    uVar2 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
    ___cxa_throw(uVar2,&DAT_009fb298,&DAT_0063885c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x65bb34);
    (*pcVar1)();
  }
  return;
}

