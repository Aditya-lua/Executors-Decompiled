
void thunk_FUN_0003cc14(void)

{
  code *pcVar1;
  long *plVar2;
  long *unaff_x21;
  int unaff_w23;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000060;
  long in_stack_00000070;
  undefined8 in_stack_00000080;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  long in_stack_000000c0;
  undefined8 in_stack_000000c8;
  long in_stack_000000d8;
  
  if (unaff_w23 == 2) {
    plVar2 = (long *)___cxa_begin_catch();
    (**(code **)(*plVar2 + 0x10))();
    func_0x006e644c();
  }
  else {
    if (unaff_w23 != 1) {
      if (in_stack_00000050 < 0) {
        __ZdlPv(in_stack_00000040);
      }
      if (unaff_x21 != (long *)0x0) {
        (**(code **)(*unaff_x21 + 8))();
      }
      if (-1 < in_stack_00000070) goto code_r0x0003ce0c;
      __ZdlPv(in_stack_00000060);
      if (in_stack_00000090 < 0) goto code_r0x0003ce14;
      do {
        do {
          if (in_stack_000000a8 < 0) {
            __ZdlPv(in_stack_00000098);
          }
          if (in_stack_000000c0 < 0) {
            __ZdlPv(in_stack_000000b0);
          }
          if (in_stack_000000d8 < 0) {
            __ZdlPv(in_stack_000000c8);
          }
          __Unwind_Resume();
code_r0x0003ce0c:
        } while (-1 < in_stack_00000090);
code_r0x0003ce14:
        __ZdlPv(in_stack_00000080);
      } while( true );
    }
    plVar2 = (long *)___cxa_begin_catch();
    (**(code **)(*plVar2 + 0x10))();
    func_0x006e644c();
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3cd8c);
  (*pcVar1)();
}

