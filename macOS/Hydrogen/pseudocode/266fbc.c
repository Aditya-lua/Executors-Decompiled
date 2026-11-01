
void FUN_00266fbc(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined8 in_stack_00000048;
  
  if (param_1 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x380);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x267078);
    (*pcVar1)();
  }
  *param_1 = 0;
  *(undefined2 *)((long)param_1 + 0x37a) = 0;
  in_stack_00000020 = 0;
  uStack0000000000000028 = 0;
  in_stack_00000048 = 3;
  uStack0000000000000018 = param_1;
  func_0x002605fc(&uStack0000000000000018,&uStack0000000000000030,&uStack0000000000000028);
  *unaff_x19 = uStack0000000000000018;
  unaff_x19[1] = in_stack_00000020;
  unaff_x19[2] = uStack0000000000000028;
  return;
}

