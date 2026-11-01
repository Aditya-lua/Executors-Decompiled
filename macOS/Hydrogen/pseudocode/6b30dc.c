
void FUN_006b30dc(undefined8 param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  undefined8 *in_x13;
  long in_x14;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x22;
  undefined8 unaff_x23;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar4 = param_3._8_8_;
  uVar3 = param_3._0_8_;
  uVar2 = param_2._8_8_;
  uVar1 = param_2._0_8_;
  while( true ) {
    uVar8 = in_x12[-3];
    uVar7 = in_x12[-4];
    uVar6 = in_x12[-1];
    uVar5 = in_x12[-2];
    in_x13[1] = uVar4;
    *in_x13 = uVar3;
    in_x13[3] = uVar2;
    in_x13[2] = uVar1;
    in_x13[-3] = uVar8;
    in_x13[-4] = uVar7;
    in_x13[-1] = uVar6;
    in_x13[-2] = uVar5;
    in_x13 = in_x13 + -8;
    in_x14 = in_x14 + -0x10;
    if (in_x14 == 0) break;
    uVar4 = in_x12[-7];
    uVar3 = in_x12[-8];
    uVar2 = in_x12[-5];
    uVar1 = in_x12[-6];
    in_x12 = in_x12 + -8;
  }
  if (in_x10 != in_x11) {
    do {
      unaff_x22 = unaff_x22 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x22;
    } while (unaff_x22 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x1d8) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x1e0) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x1e8) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x1e0) = unaff_x23;
  return;
}

