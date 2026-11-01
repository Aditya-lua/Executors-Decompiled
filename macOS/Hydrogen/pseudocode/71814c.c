
ulong FUN_0071814c(code *param_1)

{
  code *pcVar1;
  long unaff_x19;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  
  (*param_1)();
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x71819c);
    (*pcVar1)();
  }
  return unaff_x23 & 0xff | (unaff_x22 & 0xffffff) << 8 | unaff_x19 << 0x20;
}

