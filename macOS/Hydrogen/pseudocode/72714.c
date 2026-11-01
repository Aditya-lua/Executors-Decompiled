
undefined1  [16] FUN_00072714(void)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  long *unaff_x19;
  undefined8 unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined1 auVar4 [16];
  long *in_stack_00000008;
  
  plVar2 = *(long **)(*unaff_x19 + unaff_x26 * 8);
  if (plVar2 == (long *)0x0) {
    *in_stack_00000008 = unaff_x19[2];
    unaff_x19[2] = (long)in_stack_00000008;
    *(undefined8 *)(*unaff_x19 + unaff_x26 * 8) = unaff_x24;
    if (*in_stack_00000008 != 0) {
      uVar3 = *(ulong *)(*in_stack_00000008 + 8);
      if ((unaff_x25 & unaff_x25 - 1) == 0) {
        uVar3 = uVar3 & unaff_x25 - 1;
      }
      else if (unaff_x25 <= uVar3) {
        uVar1 = 0;
        if (unaff_x25 != 0) {
          uVar1 = uVar3 / unaff_x25;
        }
        uVar3 = uVar3 - uVar1 * unaff_x25;
      }
      *(long **)(*unaff_x19 + uVar3 * 8) = in_stack_00000008;
    }
  }
  else {
    *in_stack_00000008 = *plVar2;
    *plVar2 = (long)in_stack_00000008;
  }
  unaff_x19[3] = unaff_x19[3] + 1;
  auVar4._8_8_ = 1;
  auVar4._0_8_ = in_stack_00000008;
  return auVar4;
}

