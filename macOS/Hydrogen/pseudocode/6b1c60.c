
int FUN_006b1c60(undefined8 param_1)

{
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  undefined4 *in_x12;
  undefined8 *in_x13;
  undefined8 *in_x14;
  long in_x15;
  long unaff_x19;
  undefined8 unaff_x21;
  undefined4 *unaff_x22;
  short unaff_w23;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  while( true ) {
    in_x15 = in_x15 + -0x10;
    if (in_x15 == 0) break;
    uVar3 = in_x13[-8];
    uVar2 = in_x13[-5];
    uVar1 = in_x13[-6];
    uVar7 = in_x13[-0xb];
    uVar6 = in_x13[-0xc];
    uVar5 = in_x13[-9];
    uVar4 = in_x13[-10];
    in_x14[-7] = in_x13[-7];
    in_x14[-8] = uVar3;
    in_x14[-5] = uVar2;
    in_x14[-6] = uVar1;
    in_x14[-0xb] = uVar7;
    in_x14[-0xc] = uVar6;
    in_x14[-9] = uVar5;
    in_x14[-10] = uVar4;
    in_x13 = in_x13 + -8;
    in_x14 = in_x14 + -8;
  }
  if (in_x10 != in_x11) {
    do {
      in_x12 = in_x12 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *in_x12;
    } while (in_x12 != unaff_x22);
  }
  *(undefined4 **)(unaff_x19 + 0x70) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x80) = param_1;
  if (unaff_x22 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x21;
  return (int)unaff_w23;
}

