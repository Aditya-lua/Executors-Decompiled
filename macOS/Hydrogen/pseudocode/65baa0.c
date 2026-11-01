
void FUN_0065baa0(long param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  long in_x9;
  long unaff_x29;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
  }
  func_0x00611644();
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

