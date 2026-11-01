
void FUN_006b2468(undefined8 param_1)

{
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  undefined4 *in_x12;
  undefined8 *in_x13;
  undefined8 *in_x14;
  long in_x15;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 unaff_x22;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  for (; in_x15 != 0; in_x15 = in_x15 + -0x10) {
    uVar3 = *in_x13;
    uVar2 = in_x13[3];
    uVar1 = in_x13[2];
    uVar7 = in_x13[-3];
    uVar6 = in_x13[-4];
    uVar5 = in_x13[-1];
    uVar4 = in_x13[-2];
    in_x14[1] = in_x13[1];
    *in_x14 = uVar3;
    in_x14[3] = uVar2;
    in_x14[2] = uVar1;
    in_x14[-3] = uVar7;
    in_x14[-4] = uVar6;
    in_x14[-1] = uVar5;
    in_x14[-2] = uVar4;
    in_x13 = in_x13 + -8;
    in_x14 = in_x14 + -8;
  }
  if (in_x10 != in_x11) {
    do {
      in_x12 = in_x12 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *in_x12;
    } while (in_x12 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x40) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x50) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  return;
}

