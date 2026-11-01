
void FUN_005daa8c(long param_1)

{
  code *pcVar1;
  dword *pdVar2;
  dword *pdVar3;
  long lVar4;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x24;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  dword *in_stack_00000070;
  dword *in_stack_00000078;
  long in_stack_00000080;
  dword *in_stack_00000088;
  dword *in_stack_00000090;
  dword *in_stack_00000098;
  long in_stack_000000a0;
  dword *in_stack_000000a8;
  
  if (param_1 == unaff_x24) {
    pdVar2 = (dword *)func_0x00187bd0(8,8);
    if (pdVar2 == (dword *)0x0) {
      func_0x007a1f18(8,8);
      goto LAB_005dabb8;
    }
    *(long *)pdVar2 = unaff_x20 + 0x60;
    lVar4 = 1;
  }
  else {
    lVar4 = 0;
    pdVar2 = &MACH_HEADER.cpusubtype;
  }
  if (*(long *)(unaff_x20 + 0xb0) == -0x8000000000000000) {
    pdVar3 = (dword *)func_0x00187bd0(8,8);
    if (pdVar3 == (dword *)0x0) {
      func_0x007a1f18(8,8);
LAB_005dabb8:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x5dabbc);
      (*pcVar1)();
    }
    *(long *)pdVar3 = unaff_x20 + 0xb8;
    in_stack_000000a0 = 1;
  }
  else {
    in_stack_000000a0 = 0;
    pdVar3 = &MACH_HEADER.cpusubtype;
  }
  in_stack_000000a8 = pdVar3 + in_stack_000000a0 * 2;
  uStack0000000000000048 = 1;
  in_stack_00000068 = unaff_x21 + unaff_x22 * 8;
  in_stack_00000070 = pdVar2;
  in_stack_00000078 = pdVar2;
  in_stack_00000080 = lVar4;
  in_stack_00000088 = pdVar2 + lVar4 * 2;
  in_stack_00000090 = pdVar3;
  in_stack_00000098 = pdVar3;
  func_0x005a0704(&uStack0000000000000048,&UNK_009f30a0);
  return;
}

