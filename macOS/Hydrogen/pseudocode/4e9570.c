
void FUN_004e9570(void)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long lVar5;
  code *unaff_x26;
  code *unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long lStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  
  puVar4 = (undefined8 *)func_0x00187bd0();
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f00();
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x4e96b4);
    (*pcVar3)();
  }
  puVar4[5] = in_stack_00000048;
  puVar4[4] = in_stack_00000040;
  puVar4[7] = in_stack_00000058;
  puVar4[6] = in_stack_00000050;
  puVar4[8] = in_stack_00000060;
  puVar4[1] = in_stack_00000028;
  *puVar4 = in_stack_00000020;
  puVar4[3] = in_stack_00000038;
  puVar4[2] = in_stack_00000030;
  lVar5 = 0x48;
  lStack0000000000000018 = 1;
  uStack0000000000000008 = unaff_x28;
  while ((*unaff_x26)(&uStack0000000000000068), uStack0000000000000068 != -0x8000000000000000) {
    if (lStack0000000000000018 == uStack0000000000000008) {
      (*unaff_x27)(unaff_x29 + -0x70);
      lVar1 = *(long *)(unaff_x29 + -0x70) + 1;
      if (*(long *)(unaff_x29 + -0x70) == -1) {
        lVar1 = -1;
      }
      func_0x007a5594(&uStack0000000000000008,lStack0000000000000018,lVar1,8,0x48);
    }
    plVar2 = (long *)((long)puVar4 + lVar5);
    plVar2[1] = in_stack_00000070;
    *plVar2 = uStack0000000000000068;
    plVar2[8] = in_stack_000000a8;
    plVar2[5] = in_stack_00000090;
    plVar2[4] = in_stack_00000088;
    plVar2[7] = in_stack_000000a0;
    plVar2[6] = in_stack_00000098;
    plVar2[3] = in_stack_00000080;
    plVar2[2] = in_stack_00000078;
    lStack0000000000000018 = lStack0000000000000018 + 1;
    lVar5 = lVar5 + 0x48;
  }
  if ((code *)*unaff_x20 != (code *)0x0) {
    (*(code *)*unaff_x20)();
  }
  if (unaff_x20[1] != 0) {
    func_0x00187bd4();
  }
  unaff_x21[1] = (long)puVar4;
  *unaff_x21 = uStack0000000000000008;
  unaff_x21[2] = lStack0000000000000018;
  return;
}

