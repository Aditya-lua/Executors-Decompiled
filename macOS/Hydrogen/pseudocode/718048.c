
/* WARNING: Removing unreachable block (ram,0x007180cc) */

ulong FUN_00718048(undefined8 param_1)

{
  long lVar1;
  code *pcVar2;
  long *plVar3;
  long lVar4;
  code *in_x9;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined1 uStack0000000000000030;
  long lStack0000000000000040;
  long *in_stack_00000058;
  char in_stack_00000060;
  
  (*in_x9)(&uStack0000000000000008,param_1,&uStack0000000000000030);
  lVar1 = in_stack_00000010;
  for (lVar4 = uStack0000000000000008; lVar4 != lVar1; lVar4 = lVar4 + 0x28) {
    func_0x007181dc();
  }
  if (uStack0000000000000008 != 0) {
    for (; in_stack_00000010 != uStack0000000000000008;
        in_stack_00000010 = in_stack_00000010 + -0x28) {
    }
    in_stack_00000010 = uStack0000000000000008;
    __ZdlPv(uStack0000000000000008);
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

