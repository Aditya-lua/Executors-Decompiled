
void FUN_0070f474(undefined8 param_1)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar2;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  *unaff_x19 = param_1;
  uVar2 = *unaff_x20;
  unaff_x19[2] = unaff_x20[1];
  unaff_x19[1] = uVar2;
  unaff_x19[4] = in_stack_00000008;
  unaff_x19[3] = in_stack_00000000;
  unaff_x19[5] = in_stack_00000010;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x70f4b4);
  (*pcVar1)();
}

