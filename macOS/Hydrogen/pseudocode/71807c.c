
/* WARNING: Removing unreachable block (ram,0x007180cc) */

ulong FUN_0071807c(long *param_1)

{
  char *pcVar1;
  code *pcVar2;
  long *plVar3;
  long lVar4;
  long unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  long unaff_x29;
  long lStack0000000000000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long lStack0000000000000040;
  long *in_stack_00000058;
  char in_stack_00000060;
  
  while( true ) {
    lStack0000000000000000 = (long)param_1;
    func_0x007181dc();
    lVar4 = unaff_x20 + 0x28;
    if (lVar4 == unaff_x24) break;
    param_1 = (long *)(unaff_x20 + 0x38);
    pcVar1 = (char *)(unaff_x20 + 0x4f);
    unaff_x20 = lVar4;
    if (*pcVar1 < '\0') {
      param_1 = (long *)*param_1;
    }
  }
  if (in_stack_00000008 != 0) {
    for (; in_stack_00000010 != in_stack_00000008; in_stack_00000010 = in_stack_00000010 + -0x28) {
    }
    __ZdlPv(in_stack_00000008);
  }
  if (in_stack_00000060 != '\0') {
    if (in_stack_00000058 == &lStack0000000000000040) {
      lVar4 = 4;
      plVar3 = &lStack0000000000000040;
    }
    else {
      if (in_stack_00000058 == (long *)0x0) goto LAB_00718150;
      lVar4 = 5;
      plVar3 = in_stack_00000058;
    }
    (**(code **)(*plVar3 + lVar4 * 8))();
  }
LAB_00718150:
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x71819c);
    (*pcVar2)();
  }
  return unaff_x23 & 0xff | (unaff_x22 & 0xffffff) << 8 | 0x100000000;
}

