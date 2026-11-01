
void FUN_00187c58(long *param_1,undefined1 param_2 [16],undefined1 param_3 [16],long param_4)

{
  long in_x9;
  long in_x10;
  long lVar1;
  long in_x11;
  undefined8 *puVar2;
  long in_x12;
  undefined8 *in_x13;
  undefined8 *in_x14;
  long in_x15;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  uVar6 = param_3._8_8_;
  uVar5 = param_3._0_8_;
  uVar4 = param_2._8_8_;
  uVar3 = param_2._0_8_;
  while( true ) {
    uVar8 = in_x13[1];
    uVar7 = *in_x13;
    uVar10 = in_x13[3];
    uVar9 = in_x13[2];
    in_x14[-3] = uVar4;
    in_x14[-4] = uVar3;
    in_x14[-1] = uVar6;
    in_x14[-2] = uVar5;
    in_x14[1] = uVar8;
    *in_x14 = uVar7;
    in_x14[3] = uVar10;
    in_x14[2] = uVar9;
    in_x15 = in_x15 + -8;
    if (in_x15 == 0) break;
    uVar4 = in_x13[5];
    uVar3 = in_x13[4];
    uVar6 = in_x13[7];
    uVar5 = in_x13[6];
    in_x13 = in_x13 + 8;
    in_x14 = in_x14 + 8;
  }
  if (in_x11 != in_x12) {
    lVar1 = in_x11 - in_x12;
    puVar2 = (undefined8 *)(param_4 + in_x12 * 8);
    do {
      *(undefined8 *)(in_x10 + in_x9 * 8) = *puVar2;
      in_x9 = in_x9 + 1;
      lVar1 = lVar1 + -1;
      puVar2 = puVar2 + 1;
    } while (lVar1 != 0);
  }
  *param_1 = in_x9;
  return;
}

