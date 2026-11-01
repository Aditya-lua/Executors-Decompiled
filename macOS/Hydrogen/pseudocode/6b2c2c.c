
void FUN_006b2c2c(undefined8 param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16])

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
  
  uVar7 = param_5._8_8_;
  uVar6 = param_5._0_8_;
  uVar5 = param_4._8_8_;
  uVar4 = param_4._0_8_;
  while( true ) {
    in_x13[-3] = uVar7;
    in_x13[-4] = uVar6;
    in_x13[-1] = uVar5;
    in_x13[-2] = uVar4;
    in_x14 = in_x14 + -0x10;
    if (in_x14 == 0) break;
    uVar3 = in_x12[-8];
    uVar2 = in_x12[-5];
    uVar1 = in_x12[-6];
    uVar7 = in_x12[-0xb];
    uVar6 = in_x12[-0xc];
    uVar5 = in_x12[-9];
    uVar4 = in_x12[-10];
    in_x13[-7] = in_x12[-7];
    in_x13[-8] = uVar3;
    in_x13[-5] = uVar2;
    in_x13[-6] = uVar1;
    in_x12 = in_x12 + -8;
    in_x13 = in_x13 + -8;
  }
  if (in_x10 != in_x11) {
    do {
      unaff_x22 = unaff_x22 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x22;
    } while (unaff_x22 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x208) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x210) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x218) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x210) = unaff_x23;
  return;
}

