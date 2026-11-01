
void FUN_00024478(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  long unaff_x29;
  
  if (param_3 != 0) {
    func_0x00017634();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return;
    }
    ___stack_chk_fail();
  }
  func_0x00023e84("wstring_convert: to_bytes error");
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x24554);
  (*pcVar1)();
}

