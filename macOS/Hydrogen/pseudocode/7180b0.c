
/* WARNING: Removing unreachable block (ram,0x007180cc) */

ulong FUN_007180b0(undefined8 param_1)

{
  code *pcVar1;
  bool in_ZR;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  undefined8 in_stack_00000008;
  long lStack0000000000000040;
  long *in_stack_00000058;
  char in_stack_00000060;
  
  if (!in_ZR) {
    do {
      unaff_x19 = unaff_x19 + -0x28;
    } while (unaff_x19 != unaff_x20);
    param_1 = in_stack_00000008;
  }
  __ZdlPv(param_1);
  if (in_stack_00000060 != '\0') {
    if (in_stack_00000058 == &lStack0000000000000040) {
      lVar3 = 4;
      plVar2 = &lStack0000000000000040;
    }
    else {
      if (in_stack_00000058 == (long *)0x0) goto code_r0x00718150;
      lVar3 = 5;
      plVar2 = in_stack_00000058;
    }
    (**(code **)(*plVar2 + lVar3 * 8))();
  }
code_r0x00718150:
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x71819c);
    (*pcVar1)();
  }
  return unaff_x23 & 0xff | (unaff_x22 & 0xffffff) << 8 | 0x100000000;
}

