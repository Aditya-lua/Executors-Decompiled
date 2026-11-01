
void FUN_00705b9c(void)

{
  code *pcVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 in_stack_00000000;
  undefined7 uStack0000000000000008;
  undefined1 uStack000000000000000f;
  undefined7 uStack0000000000000010;
  undefined1 uStack0000000000000017;
  undefined1 uStack000000000000001f;
  long in_stack_00000028;
  
  _memmove();
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  uStack000000000000001f = uStack000000000000000f;
  if (*(char *)(unaff_x19 + 0x40) == '\0') {
    *(undefined8 *)(unaff_x19 + 0x28) = in_stack_00000000;
    *(undefined8 *)(unaff_x19 + 0x30) = _uStack0000000000000008;
    *(ulong *)(unaff_x19 + 0x37) = CONCAT71(uStack0000000000000010,uStack000000000000000f);
    *(undefined1 *)(unaff_x19 + 0x3f) = uStack0000000000000017;
    *(undefined1 *)(unaff_x19 + 0x40) = 1;
  }
  else {
    if (*(char *)(unaff_x19 + 0x3f) < '\0') {
      __ZdlPv(*(undefined8 *)(unaff_x19 + 0x28));
    }
    *(undefined8 *)(unaff_x19 + 0x28) = in_stack_00000000;
    *(ulong *)(unaff_x19 + 0x30) = CONCAT17(uStack000000000000001f,uStack0000000000000008);
    *(ulong *)(unaff_x19 + 0x37) = CONCAT71(uStack0000000000000010,uStack000000000000001f);
    *(undefined1 *)(unaff_x19 + 0x3f) = uStack0000000000000017;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != in_stack_00000028) {
    ___stack_chk_fail();
    func_0x0001748c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x705c64);
    (*pcVar1)();
  }
  return;
}

