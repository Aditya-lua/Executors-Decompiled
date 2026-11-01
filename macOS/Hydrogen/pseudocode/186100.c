
undefined * FUN_00186100(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x21;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  func_0x00187bd4();
  puVar2 = (undefined8 *)func_0x00187bd0(0x50,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x50);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x186228);
    (*pcVar1)();
  }
  puVar2[5] = unaff_x21;
  puVar2[4] = in_stack_00000010;
  puVar2[7] = in_stack_00000028;
  puVar2[6] = in_stack_00000020;
  puVar2[9] = in_stack_00000038;
  puVar2[8] = in_stack_00000030;
  puVar2[1] = 1;
  *puVar2 = 1;
  puVar2[3] = in_stack_00000008;
  puVar2[2] = in_stack_00000000;
  *unaff_x19 = puVar2 + 2;
  return &UNK_00001b58;
}

