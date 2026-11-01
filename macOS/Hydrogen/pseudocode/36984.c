
void FUN_00036984(undefined8 *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],undefined1 param_9 [16])

{
  undefined8 *puVar1;
  undefined8 *in_x9;
  undefined8 *puVar2;
  undefined8 *in_x10;
  long in_x11;
  long in_x12;
  undefined8 *in_x13;
  long in_x14;
  undefined8 *in_x15;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  uVar17 = param_9._8_8_;
  uVar16 = param_9._0_8_;
  uVar15 = param_8._8_8_;
  uVar14 = param_8._0_8_;
  uVar13 = param_7._8_8_;
  uVar12 = param_7._0_8_;
  uVar11 = param_6._8_8_;
  uVar10 = param_6._0_8_;
  uVar9 = param_5._8_8_;
  uVar8 = param_5._0_8_;
  uVar7 = param_4._8_8_;
  uVar6 = param_4._0_8_;
  while( true ) {
    in_x15[-4] = uVar6;
    in_x15[-3] = uVar8;
    in_x15[-2] = uVar7;
    in_x15[-1] = uVar9;
    *in_x15 = uVar10;
    in_x15[1] = uVar12;
    in_x15[2] = uVar11;
    in_x15[3] = uVar13;
    in_x15[4] = uVar14;
    in_x15[5] = uVar16;
    in_x15[6] = uVar15;
    in_x15[7] = uVar17;
    in_x14 = in_x14 + -8;
    if (in_x14 == 0) break;
    uVar4 = in_x13[9];
    uVar3 = in_x13[10];
    uVar5 = in_x13[0xb];
    uVar6 = in_x13[0xc];
    uVar8 = in_x13[0xd];
    uVar7 = in_x13[0xe];
    uVar9 = in_x13[0xf];
    uVar10 = in_x13[0x10];
    uVar12 = in_x13[0x11];
    uVar11 = in_x13[0x12];
    uVar13 = in_x13[0x13];
    uVar14 = in_x13[0x14];
    uVar16 = in_x13[0x15];
    uVar15 = in_x13[0x16];
    uVar17 = in_x13[0x17];
    in_x15[8] = in_x13[8];
    in_x15[9] = uVar4;
    in_x15[10] = uVar3;
    in_x15[0xb] = uVar5;
    in_x13 = in_x13 + 0x10;
    in_x15 = in_x15 + 0x10;
  }
  if (in_x11 != in_x12) {
    do {
      puVar2 = in_x10 + 2;
      uVar6 = in_x10[1];
      *in_x9 = *in_x10;
      in_x9[1] = uVar6;
      in_x9 = in_x9 + 2;
      in_x10 = puVar2;
    } while (puVar2 != param_1);
  }
  if (param_1 != unaff_x20) {
    puVar2 = unaff_x21;
    do {
      puVar1 = param_1 + 2;
      uVar6 = *param_1;
      puVar2[1] = param_1[1];
      *puVar2 = uVar6;
      unaff_x21 = unaff_x21 + 2;
      param_1 = puVar1;
      puVar2 = puVar2 + 2;
    } while (puVar1 != unaff_x20);
  }
  *unaff_x19 = (long)unaff_x21;
  return;
}

