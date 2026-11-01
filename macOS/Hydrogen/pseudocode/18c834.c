
void FUN_0018c834(long param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x25;
  long unaff_x27;
  long *unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  while( true ) {
    _memcpy(param_1,param_2,param_3);
    unaff_x28[-2] = unaff_x22;
    unaff_x28[-1] = unaff_x23;
    *unaff_x28 = unaff_x22;
    if (unaff_x21 == unaff_x27) {
      unaff_x19[1] = in_stack_00000010;
      *unaff_x19 = in_stack_00000008;
      unaff_x19[2] = unaff_x25;
      return;
    }
    param_3 = unaff_x20[3];
    unaff_x28 = unaff_x28 + 3;
    unaff_x20 = unaff_x20 + 2;
    unaff_x27 = unaff_x27 + 1;
    if (param_3 < 0) break;
    param_2 = *unaff_x20;
    if (param_3 == 0) {
      param_1 = 1;
    }
    else {
      param_1 = func_0x00187bd0(param_3,1);
      if (param_1 == 0) goto LAB_0018c8ac;
    }
    unaff_x22 = param_3;
    unaff_x23 = param_1;
  }
  in_stack_00000000 = 0;
  param_3 = unaff_x23;
LAB_0018c8ac:
  func_0x007a1f00(in_stack_00000000,param_3,&UNK_009c0710);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x18c8c4);
  (*pcVar1)();
}

