
void FUN_0003ca70(undefined8 param_1,int param_2)

{
  code *pcVar1;
  long *plVar2;
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
  
  if (param_2 == 4) {
    plVar2 = (long *)___cxa_begin_catch(param_1);
    (**(code **)(*plVar2 + 0x10))();
    func_0x006e644c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x3cd8c);
    (*pcVar1)();
  }
  if (in_stack_00000070 < 0) {
    __ZdlPv(in_stack_00000060);
  }
  do {
    if (in_stack_00000090 < 0) {
      __ZdlPv(in_stack_00000080);
    }
    if (in_stack_000000a8 < 0) {
      __ZdlPv(in_stack_00000098);
    }
    if (in_stack_000000c0 < 0) {
      __ZdlPv(in_stack_000000b0);
    }
    if (in_stack_000000d8 < 0) {
      __ZdlPv(in_stack_000000c8);
    }
    __Unwind_Resume(param_1);
  } while( true );
}

