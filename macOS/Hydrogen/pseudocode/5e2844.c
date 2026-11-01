
void FUN_005e2844(ulong param_1,long param_2)

{
  long *plVar1;
  code *pcVar2;
  ulong in_x9;
  long in_x10;
  long in_x11;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong uVar3;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
code_r0x005e2844:
  in_x10 = in_x10 + 1;
  in_x9 = in_x9 - 1;
  in_x11 = in_x11 + 1;
  if (unaff_x24 == in_x9) {
LAB_005e28f0:
    unaff_x19[1] = in_stack_00000010;
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[2] = in_stack_00000018;
    return;
  }
  do {
    if (unaff_x24 + in_x10 < unaff_x20) {
      if (*(char *)(in_x11 + unaff_x24) < -0x40) goto code_r0x005e2844;
      uVar3 = unaff_x24 + in_x10;
    }
    else {
      if (param_1 != in_x9) goto code_r0x005e2844;
      uVar3 = unaff_x20;
    }
    if ((uVar3 < unaff_x24) || (*(char *)(unaff_x21 + unaff_x24) < -0x40)) {
LAB_005e2930:
      func_0x007a297c();
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5e2950);
      (*pcVar2)();
    }
    if (unaff_x24 + in_x10 < unaff_x20) {
      if (*(char *)(unaff_x21 + uVar3) < -0x40) goto LAB_005e2930;
    }
    else if (uVar3 != unaff_x20) goto LAB_005e2930;
    if (unaff_x23 == uStack0000000000000008) {
      func_0x007afcf8(&uStack0000000000000008,unaff_x23,1,8,0x10);
      param_2 = in_stack_00000010;
    }
    plVar1 = (long *)(param_2 + unaff_x23 * 0x10);
    *plVar1 = unaff_x21 + unaff_x24;
    plVar1[1] = uVar3 - unaff_x24;
    unaff_x23 = unaff_x23 + 1;
    in_stack_00000018 = unaff_x23;
    if (unaff_x20 <= uVar3) goto LAB_005e28f0;
    param_1 = uVar3 + 1;
    in_x10 = 1;
    in_x9 = unaff_x20;
    in_x11 = unaff_x25;
    unaff_x24 = uVar3;
  } while( true );
}

