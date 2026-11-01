
void FUN_005da934(long param_1)

{
  code *pcVar1;
  dword *pdVar2;
  long in_x9;
  long unaff_x20;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  dword *in_stack_00000090;
  dword *in_stack_00000098;
  long in_stack_000000a0;
  dword *in_stack_000000a8;
  
  if (param_1 == in_x9) {
    pdVar2 = (dword *)func_0x00187bd0(8,8);
    if (pdVar2 == (dword *)0x0) {
      func_0x007a1f18(8,8);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5da9f4);
      (*pcVar1)();
    }
    *(long *)pdVar2 = unaff_x20 + 0xb8;
    in_stack_000000a0 = 1;
  }
  else {
    in_stack_000000a0 = 0;
    pdVar2 = &MACH_HEADER.cpusubtype;
  }
  in_stack_00000058 = in_stack_00000010;
  in_stack_00000050 = in_stack_00000008;
  in_stack_00000068 = in_stack_00000020;
  in_stack_00000060 = in_stack_00000018;
  in_stack_00000078 = in_stack_00000030;
  in_stack_00000070 = in_stack_00000028;
  in_stack_00000088 = in_stack_00000040;
  in_stack_00000080 = in_stack_00000038;
  in_stack_000000a8 = pdVar2 + in_stack_000000a0 * 2;
  uStack0000000000000048 = 1;
  in_stack_00000090 = pdVar2;
  in_stack_00000098 = pdVar2;
  func_0x005a3308(&uStack0000000000000048,&UNK_009f30a0);
  return;
}

