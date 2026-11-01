
void FUN_0002d860(long param_1,undefined1 param_2 [16],long param_3)

{
  long in_x9;
  long in_x10;
  undefined8 *in_x11;
  long lVar1;
  undefined8 in_x12;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x23;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar3 = param_2._8_8_;
  uVar2 = param_2._0_8_;
  while( true ) {
    in_x11[2] = in_x12;
    in_x11[1] = uVar3;
    *in_x11 = uVar2;
    in_x10 = in_x10 + -0x18;
    if (in_x10 == 0) break;
    uVar3 = unaff_x21[1];
    uVar2 = *unaff_x21;
    in_x12 = unaff_x21[2];
    in_x11 = in_x11 + 3;
  }
  lVar1 = *unaff_x19;
  if (unaff_x20 != lVar1) {
    do {
      uVar3 = *(undefined8 *)(unaff_x20 + -0x10);
      uVar2 = *(undefined8 *)(unaff_x20 + -0x18);
      *(undefined8 *)(in_x9 + -8) = *(undefined8 *)(unaff_x20 + -8);
      *(undefined8 *)(in_x9 + -0x10) = uVar3;
      *(undefined8 *)(in_x9 + -0x18) = uVar2;
      in_x9 = in_x9 + -0x18;
      unaff_x20 = unaff_x20 + -0x18;
    } while (unaff_x20 != lVar1);
    unaff_x20 = *unaff_x19;
  }
  *unaff_x19 = in_x9;
  unaff_x19[1] = param_1;
  unaff_x19[2] = param_3 + unaff_x23 * 0x18;
  if (unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(unaff_x20);
  return;
}

