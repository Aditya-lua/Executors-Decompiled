
void FUN_00724800(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x20;
  long unaff_x21;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  
  lVar2 = func_0x007259cc();
  *(long *)(unaff_x20 + 0x1b0) = lVar2;
  if (((ulong)*(uint *)(unaff_x21 + 0x758) <=
       (ulong)((lVar2 - *(long *)(unaff_x20 + 0x1a8) >> 4) * -0x5555555555555555)) &&
     (*(char *)(unaff_x20 + 0x59) == '\0')) {
    func_0x0070f408();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x724940);
    (*pcVar1)();
  }
  if (in_stack_00000038 < 0) {
    __ZdlPv(in_stack_00000028);
    return;
  }
  return;
}

