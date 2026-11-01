
void FUN_005d7820(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined8 *param_4,
                 undefined8 *param_5)

{
  undefined1 *in_x9;
  long in_x10;
  undefined1 *in_x11;
  undefined1 *puVar1;
  long in_x12;
  undefined8 *in_x13;
  long in_x14;
  undefined8 *in_x15;
  long in_x16;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  uVar5 = param_3._8_8_;
  uVar4 = param_3._0_8_;
  uVar3 = param_2._8_8_;
  uVar2 = param_2._0_8_;
  while( true ) {
    uVar7 = in_x13[1];
    uVar6 = *in_x13;
    uVar9 = in_x13[3];
    uVar8 = in_x13[2];
    in_x15[-3] = uVar3;
    in_x15[-4] = uVar2;
    in_x15[-1] = uVar5;
    in_x15[-2] = uVar4;
    in_x15[1] = uVar7;
    *in_x15 = uVar6;
    in_x15[3] = uVar9;
    in_x15[2] = uVar8;
    in_x16 = in_x16 + -0x40;
    if (in_x16 == 0) break;
    uVar3 = in_x13[5];
    uVar2 = in_x13[4];
    uVar5 = in_x13[7];
    uVar4 = in_x13[6];
    in_x13 = in_x13 + 8;
    in_x15 = in_x15 + 8;
  }
  if (in_x12 != in_x14) {
    puVar1 = in_x11;
    do {
      in_x11 = puVar1 + 1;
      *(undefined1 *)(in_x10 + param_1) = *puVar1;
      param_1 = param_1 + 1;
      puVar1 = in_x11;
    } while (in_x11 != in_x9);
  }
  param_4[1] = in_x11;
  param_5[1] = param_1;
  *(long *)*param_5 = param_1;
  if (param_4[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_4,param_4[2],1);
  return;
}

