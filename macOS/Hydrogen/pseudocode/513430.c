
void FUN_00513430(long param_1,long param_2,long param_3)

{
  code *pcVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long *unaff_x27;
  long *in_stack_00000008;
  
  while( true ) {
    _memcpy(param_1,param_2,param_3);
    unaff_x27[-1] = unaff_x19;
    *unaff_x27 = unaff_x21;
    unaff_x27[1] = unaff_x19;
    if (unaff_x26 == unaff_x24) {
      *in_stack_00000008 = unaff_x23 + unaff_x24 + 1;
      return;
    }
    param_2 = unaff_x25[-1];
    param_3 = *unaff_x25;
    unaff_x25 = unaff_x25 + 2;
    unaff_x27 = unaff_x27 + 3;
    unaff_x24 = unaff_x24 + 1;
    if (param_3 < 0) break;
    if (param_3 == 0) {
      param_1 = 1;
    }
    else {
      param_1 = func_0x00187bd0(param_3,1);
      if (param_1 == 0) {
        uVar2 = 1;
        goto LAB_005134b4;
      }
    }
    unaff_x19 = param_3;
    unaff_x21 = param_1;
  }
  uVar2 = 0;
  param_3 = unaff_x21;
LAB_005134b4:
  func_0x007a1f00(uVar2,param_3,&UNK_009e9838);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5134c8);
  (*pcVar1)();
}

