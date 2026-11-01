
undefined8 FUN_00052204(undefined8 param_1,int param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000040;
  long in_stack_00000088;
  long in_stack_000000b0;
  char cStack00000000000001d8;
  char cStack00000000000001d9;
  undefined1 uStack_11;
  
  if (param_2 == 0) {
    uVar2 = __Unwind_Resume(param_1);
    uVar2 = func_0x0005249c(&uStack_11,uVar2);
    return uVar2;
  }
  ___cxa_begin_catch(param_1);
  ___cxa_end_catch();
  if ((cStack00000000000001d8 != '\0') && (in_stack_00000088 != 0)) {
    __ZdaPv();
  }
  if ((cStack00000000000001d9 != '\0') && (in_stack_000000b0 != 0)) {
    __ZdaPv();
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x521e4);
    (*pcVar1)();
  }
  return 1;
}

