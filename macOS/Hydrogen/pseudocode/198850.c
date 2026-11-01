
void FUN_00198850(undefined8 *param_1)

{
  int iVar1;
  long unaff_x19;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  iVar1 = _AuthorizationMakeExternalForm(*param_1);
  if (iVar1 == 0) {
    *(undefined8 *)(unaff_x19 + 9) = in_stack_00000008;
    *(undefined8 *)(unaff_x19 + 1) = in_stack_00000000;
    *(undefined8 *)(unaff_x19 + 0x19) = in_stack_00000018;
    *(undefined8 *)(unaff_x19 + 0x11) = in_stack_00000010;
  }
  else {
    *(int *)(unaff_x19 + 4) = iVar1;
  }
  *(bool *)unaff_x19 = iVar1 != 0;
  return;
}

