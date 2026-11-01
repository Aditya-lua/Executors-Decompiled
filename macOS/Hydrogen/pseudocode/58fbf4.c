
void FUN_0058fbf4(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined1 in_ZR;
  undefined8 *in_x9;
  long in_x10;
  undefined8 *in_x11;
  undefined8 *puVar1;
  undefined8 *in_x12;
  long in_x13;
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
  
  while (!(bool)in_ZR) {
    uVar2 = in_x12[-4];
    uVar4 = in_x12[-1];
    uVar3 = in_x12[-2];
    uVar6 = in_x12[1];
    uVar5 = *in_x12;
    uVar8 = in_x12[3];
    uVar7 = in_x12[2];
    in_x15[-3] = in_x12[-3];
    in_x15[-4] = uVar2;
    in_x15[-1] = uVar4;
    in_x15[-2] = uVar3;
    in_x15[1] = uVar6;
    *in_x15 = uVar5;
    in_x15[3] = uVar8;
    in_x15[2] = uVar7;
    in_x16 = in_x16 + -8;
    in_x12 = in_x12 + 8;
    in_x15 = in_x15 + 8;
    in_ZR = in_x16 == 0;
  }
  if (in_x13 != in_x14) {
    puVar1 = in_x11;
    do {
      in_x11 = puVar1 + 1;
      *(undefined8 *)(in_x10 + param_1 * 8) = *puVar1;
      param_1 = param_1 + 1;
      puVar1 = in_x11;
    } while (in_x11 != in_x9);
  }
  param_2[1] = in_x11;
  param_3[1] = param_1;
  *(long *)*param_3 = param_1;
  if (param_2[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_2,param_2[2] << 3,8);
  return;
}

