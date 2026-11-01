
void FUN_007189d4(long param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *puVar3;
  long in_x10;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long *in_stack_00000008;
  long in_stack_00000010;
  
  puVar1 = (undefined8 *)(param_2 + 0x20);
  puVar3 = (undefined8 *)(in_x10 + unaff_x22 + 0x20);
  lVar2 = param_1;
  do {
    uVar4 = puVar3[-4];
    uVar6 = puVar3[-1];
    uVar5 = puVar3[-2];
    uVar8 = puVar3[1];
    uVar7 = *puVar3;
    uVar10 = puVar3[3];
    uVar9 = puVar3[2];
    puVar1[-3] = puVar3[-3];
    puVar1[-4] = uVar4;
    puVar1[-1] = uVar6;
    puVar1[-2] = uVar5;
    puVar1[1] = uVar8;
    *puVar1 = uVar7;
    puVar1[3] = uVar10;
    puVar1[2] = uVar9;
    lVar2 = lVar2 + -8;
    puVar1 = puVar1 + 8;
    puVar3 = puVar3 + 8;
  } while (lVar2 != 0);
  if (unaff_x19 != param_1) {
    lVar2 = unaff_x19 - param_1;
    puVar1 = (undefined8 *)(unaff_x22 + param_1 * 8 + unaff_x21 * 8);
    puVar3 = (undefined8 *)(param_2 + param_1 * 8);
    do {
      *puVar3 = *puVar1;
      lVar2 = lVar2 + -1;
      puVar1 = puVar1 + 1;
      puVar3 = puVar3 + 1;
    } while (lVar2 != 0);
  }
  lVar2 = *in_stack_00000008 + in_stack_00000010 * 8;
  if (lVar2 != in_stack_00000008[1]) {
    in_stack_00000008[1] = lVar2;
  }
  return;
}

