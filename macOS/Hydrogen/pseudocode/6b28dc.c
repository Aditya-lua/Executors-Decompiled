
undefined8 FUN_006b28dc(undefined8 param_1)

{
  undefined8 *in_x9;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  undefined8 *in_x13;
  undefined8 *in_x14;
  long lVar1;
  long unaff_x19;
  long *unaff_x20;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  lVar1 = in_x11;
  do {
    uVar4 = *in_x13;
    uVar3 = in_x13[3];
    uVar2 = in_x13[2];
    uVar8 = in_x13[-3];
    uVar7 = in_x13[-4];
    uVar6 = in_x13[-1];
    uVar5 = in_x13[-2];
    in_x14[1] = in_x13[1];
    *in_x14 = uVar4;
    in_x14[3] = uVar3;
    in_x14[2] = uVar2;
    in_x14[-3] = uVar8;
    in_x14[-4] = uVar7;
    in_x14[-1] = uVar6;
    in_x14[-2] = uVar5;
    in_x13 = in_x13 + -8;
    in_x14 = in_x14 + -8;
    lVar1 = lVar1 + -8;
  } while (lVar1 != 0);
  if (in_x10 != in_x11) {
    do {
      in_x12 = in_x12 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *in_x12;
    } while (in_x12 != unaff_x24);
  }
  lVar1 = *unaff_x20;
  *(undefined8 **)(unaff_x19 + 0x88) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x90) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x98) = param_1;
  if (lVar1 != 0) {
    __ZdlPv(lVar1);
  }
  *(undefined8 *)(unaff_x19 + 0x90) = unaff_x23;
  return 1;
}

