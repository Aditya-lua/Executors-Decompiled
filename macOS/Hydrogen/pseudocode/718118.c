
ulong FUN_00718118(void)

{
  code *pcVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  long lStack0000000000000040;
  long *in_stack_00000058;
  char in_stack_00000060;
  
  if (in_stack_00000060 != '\0') {
    if (in_stack_00000058 == &lStack0000000000000040) {
      lVar3 = 4;
      plVar2 = &lStack0000000000000040;
    }
    else {
      if (in_stack_00000058 == (long *)0x0) goto LAB_00718150;
      lVar3 = 5;
      plVar2 = in_stack_00000058;
    }
    (**(code **)(*plVar2 + lVar3 * 8))();
  }
LAB_00718150:
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x71819c);
    (*pcVar1)();
  }
  return unaff_x23 & 0xff | (unaff_x22 & 0xffffff) << 8 | unaff_x19 << 0x20;
}

