
void FUN_0049a9c8(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long *unaff_x19;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  
  puVar2 = (undefined8 *)func_0x00187bd0(0xe0,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0xe0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x49aa74);
    (*pcVar1)();
  }
  puVar2[0x15] = in_stack_000000a8;
  puVar2[0x14] = in_stack_000000a0;
  puVar2[0x17] = in_stack_000000b8;
  puVar2[0x16] = in_stack_000000b0;
  puVar2[0x19] = in_stack_000000c8;
  puVar2[0x18] = in_stack_000000c0;
  puVar2[0x1b] = in_stack_000000d8;
  puVar2[0x1a] = in_stack_000000d0;
  puVar2[0xd] = in_stack_00000068;
  puVar2[0xc] = in_stack_00000060;
  puVar2[0xf] = in_stack_00000078;
  puVar2[0xe] = in_stack_00000070;
  puVar2[0x11] = in_stack_00000088;
  puVar2[0x10] = in_stack_00000080;
  puVar2[0x13] = in_stack_00000098;
  puVar2[0x12] = in_stack_00000090;
  puVar2[5] = in_stack_00000028;
  puVar2[4] = in_stack_00000020;
  puVar2[7] = in_stack_00000038;
  puVar2[6] = in_stack_00000030;
  puVar2[9] = in_stack_00000048;
  puVar2[8] = in_stack_00000040;
  puVar2[0xb] = in_stack_00000058;
  puVar2[10] = in_stack_00000050;
  puVar2[1] = in_stack_00000008;
  *puVar2 = in_stack_00000000;
  puVar2[3] = in_stack_00000018;
  puVar2[2] = in_stack_00000010;
  uVar3 = func_0x0049af4c();
  if (*unaff_x19 != -0x8000000000000000) {
    func_0x0051b078(uVar3,0xf);
  }
  return;
}

