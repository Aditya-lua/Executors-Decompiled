
void FUN_006b83ec(undefined8 param_1)

{
  long unaff_x19;
  undefined1 (*unaff_x20) [16];
  undefined1 auVar1 [16];
  
  *(undefined8 *)(*unaff_x20 + 8) = *(undefined8 *)(unaff_x19 + -8);
  *(undefined8 *)(unaff_x19 + -8) = param_1;
  if (*(uint *)(*unaff_x20 + 8) < *(uint *)*unaff_x20) {
    auVar1 = NEON_ext(*unaff_x20,*unaff_x20,8,1);
    *(long *)(*unaff_x20 + 8) = auVar1._8_8_;
    *(long *)*unaff_x20 = auVar1._0_8_;
    return;
  }
  return;
}

