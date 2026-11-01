
undefined8 FUN_004bddd0(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long *plVar4;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  uStack0000000000000010 = 1;
  uStack0000000000000020 = 1;
  uStack0000000000000018 = param_1;
  puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4bdf34);
    (*pcVar1)();
  }
  puVar3[1] = in_stack_00000008;
  *puVar3 = in_stack_00000000;
  puVar3[3] = uStack0000000000000018;
  puVar3[2] = uStack0000000000000010;
  puVar3[4] = uStack0000000000000020;
  plVar4 = (long *)(unaff_x19 + -0xa8);
  lVar2 = *(long *)*plVar4;
  *(long *)*plVar4 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    func_0x005d2c74(plVar4);
  }
  *plVar4 = (long)puVar3;
  return 1;
}

