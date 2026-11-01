
void FUN_00585c2c(long param_1,undefined8 param_2,long param_3)

{
  undefined1 in_ZR;
  long *in_x9;
  long in_x10;
  undefined8 *in_x11;
  long in_x12;
  undefined8 *in_x13;
  undefined8 *puVar1;
  long in_x14;
  long in_x15;
  undefined8 *in_x16;
  undefined8 *in_x17;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  while (!(bool)in_ZR) {
    uVar2 = in_x13[-4];
    uVar4 = in_x13[-1];
    uVar3 = in_x13[-2];
    uVar6 = in_x13[1];
    uVar5 = *in_x13;
    uVar8 = in_x13[3];
    uVar7 = in_x13[2];
    in_x17[-3] = in_x13[-3];
    in_x17[-4] = uVar2;
    in_x17[-1] = uVar4;
    in_x17[-2] = uVar3;
    in_x17[1] = uVar6;
    *in_x17 = uVar5;
    in_x17[3] = uVar8;
    in_x17[2] = uVar7;
    param_3 = param_3 + -8;
    in_x13 = in_x13 + 8;
    in_x17 = in_x17 + 8;
    in_ZR = param_3 == 0;
  }
  if (in_x14 != in_x15) {
    do {
      puVar1 = in_x16 + 1;
      *(undefined8 *)(in_x12 + in_x10 * 8) = *in_x16;
      in_x10 = in_x10 + 1;
      in_x16 = puVar1;
    } while (puVar1 != in_x11);
  }
  *in_x9 = in_x10;
  if (param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_2,param_1 << 3,8);
  return;
}

