
void FUN_0018cbb0(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],long param_9)

{
  long in_x9;
  undefined8 *in_x10;
  undefined8 *puVar1;
  undefined8 *in_x11;
  long in_x12;
  long *unaff_x19;
  long unaff_x20;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  uVar9 = param_8._8_8_;
  uVar8 = param_8._0_8_;
  uVar7 = param_6._8_8_;
  uVar6 = param_6._0_8_;
  uVar5 = param_4._8_8_;
  uVar4 = param_4._0_8_;
  uVar3 = param_2._8_8_;
  uVar2 = param_2._0_8_;
  while( true ) {
    in_x10[-3] = uVar3;
    in_x10[-4] = uVar2;
    in_x10[-1] = uVar5;
    in_x10[-2] = uVar4;
    in_x10[1] = uVar7;
    *in_x10 = uVar6;
    in_x10[3] = uVar9;
    in_x10[2] = uVar8;
    in_x12 = in_x12 + -8;
    if (in_x12 == 0) break;
    uVar2 = in_x11[8];
    uVar3 = in_x11[10];
    uVar4 = in_x11[0xc];
    uVar5 = in_x11[0xe];
    uVar6 = in_x11[0x10];
    uVar7 = in_x11[0x12];
    uVar8 = in_x11[0x14];
    uVar9 = in_x11[0x16];
    in_x10 = in_x10 + 8;
    in_x11 = in_x11 + 0x10;
  }
  puVar1 = (undefined8 *)(unaff_x20 + in_x9 * 0x10);
  do {
    *(undefined8 *)(param_9 + in_x9 * 8) = *puVar1;
    in_x9 = in_x9 + 1;
    puVar1 = puVar1 + 2;
  } while (param_1 != in_x9);
  *unaff_x19 = param_1;
  unaff_x19[1] = param_9;
  unaff_x19[2] = param_1;
  return;
}

