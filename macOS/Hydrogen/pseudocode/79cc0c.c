
undefined8 * FUN_0079cc0c(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long *unaff_x20;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  puVar2 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x79cc90);
    (*pcVar1)();
  }
  puVar2[1] = in_stack_00000038;
  *puVar2 = in_stack_00000030;
  puVar2[3] = in_stack_00000028;
  puVar2[2] = in_stack_00000020;
  puVar2[5] = in_stack_00000018;
  puVar2[4] = in_stack_00000010;
  puVar2[7] = in_stack_00000008;
  puVar2[6] = in_stack_00000000;
  func_0x0042fea4();
  puVar3 = (undefined8 *)*unaff_x20;
  if (puVar3 == (undefined8 *)0x0) {
    *unaff_x20 = (long)puVar2;
    puVar3 = puVar2;
  }
  else {
    func_0x00430058(puVar2);
    func_0x00187bd4(puVar2,0x40,8);
  }
  return puVar3;
}

