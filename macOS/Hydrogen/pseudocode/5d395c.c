
void FUN_005d395c(undefined8 param_1)

{
  undefined1 uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  puVar3 = (undefined8 *)func_0x00187bd0(param_1,8);
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    func_0x007a05dc();
  }
  else {
    func_0x005d36b4(&uStack0000000000000040,*(undefined8 *)(unaff_x20 + 8));
    puVar3[1] = in_stack_00000048;
    *puVar3 = uStack0000000000000040;
    puVar3[3] = in_stack_00000058;
    puVar3[2] = in_stack_00000050;
    puVar3[5] = in_stack_00000068;
    puVar3[4] = in_stack_00000060;
    puVar3[7] = in_stack_00000078;
    puVar3[6] = in_stack_00000070;
    puVar4 = (undefined8 *)func_0x00187bd0(0x40,8);
    if (puVar4 != (undefined8 *)0x0) {
      func_0x005d36b4(&uStack0000000000000040,*(undefined8 *)(unaff_x20 + 0x10));
      puVar4[1] = in_stack_00000048;
      *puVar4 = uStack0000000000000040;
      puVar4[3] = in_stack_00000058;
      puVar4[2] = in_stack_00000050;
      puVar4[5] = in_stack_00000068;
      puVar4[4] = in_stack_00000060;
      puVar4[7] = in_stack_00000078;
      puVar4[6] = in_stack_00000070;
      uVar1 = *(undefined1 *)(unaff_x20 + 0x18);
      unaff_x19[2] = puVar4;
      *(undefined1 *)(unaff_x19 + 3) = uVar1;
      *unaff_x19 = 9;
      unaff_x19[1] = puVar3;
      return;
    }
  }
  func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5d3c40);
  (*pcVar2)();
}

