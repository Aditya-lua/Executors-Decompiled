
void FUN_005a5bbc(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  
  puVar2 = (undefined8 *)func_0x00187bd0();
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    func_0x007a05dc();
    func_0x007a1f18(8,0x40);
  }
  else {
    func_0x005a5b10(&uStack0000000000000070,*(undefined8 *)(unaff_x21 + 8));
    puVar2[1] = in_stack_00000078;
    *puVar2 = uStack0000000000000070;
    puVar2[3] = in_stack_00000088;
    puVar2[2] = in_stack_00000080;
    puVar2[5] = in_stack_00000098;
    puVar2[4] = in_stack_00000090;
    puVar2[7] = in_stack_000000a8;
    puVar2[6] = in_stack_000000a0;
    puVar3 = (undefined8 *)func_0x00187bd0(0x40,8);
    if (puVar3 != (undefined8 *)0x0) {
      func_0x005a5b10(&uStack0000000000000070,*(undefined8 *)(unaff_x21 + 0x10));
      puVar3[1] = in_stack_00000078;
      *puVar3 = uStack0000000000000070;
      puVar3[3] = in_stack_00000088;
      puVar3[2] = in_stack_00000080;
      puVar3[5] = in_stack_00000098;
      puVar3[4] = in_stack_00000090;
      puVar3[7] = in_stack_000000a8;
      puVar3[6] = in_stack_000000a0;
      unaff_x19[2] = puVar3;
      *unaff_x19 = 7;
      unaff_x19[1] = puVar2;
      return;
    }
    func_0x007a1f18(8,0x40);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5a62fc);
  (*pcVar1)();
}

