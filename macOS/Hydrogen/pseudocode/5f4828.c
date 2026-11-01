
void FUN_005f4828(void)

{
  code *pcVar1;
  uint unaff_w19;
  undefined4 *unaff_x23;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000020;
  
  *unaff_x23 = 1;
  unaff_x23[2] = 1;
  if ((unaff_w19 >> 7 & 1) != 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    func_0x00049dd0(&uStack0000000000000008);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5f4c50);
    (*pcVar1)();
  }
  return;
}

