
void FUN_00718938(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  long *in_stack_00000008;
  long in_stack_00000010;
  
  lVar1 = func_0x00704c24(param_1,unaff_x19 << 3);
  if ((unaff_x19 < 8) || ((ulong)((lVar1 + unaff_x21 * -8) - unaff_x22) < 0x40)) {
    uVar2 = 0;
  }
  else {
    uVar2 = unaff_x19 & 0xfffffffffffffff8;
    puVar3 = (undefined8 *)(lVar1 + 0x20);
    puVar5 = (undefined8 *)(unaff_x21 * 8 + unaff_x22 + 0x20);
    uVar6 = uVar2;
    do {
      uVar7 = puVar5[-4];
      uVar9 = puVar5[-1];
      uVar8 = puVar5[-2];
      uVar11 = puVar5[1];
      uVar10 = *puVar5;
      uVar13 = puVar5[3];
      uVar12 = puVar5[2];
      puVar3[-3] = puVar5[-3];
      puVar3[-4] = uVar7;
      puVar3[-1] = uVar9;
      puVar3[-2] = uVar8;
      puVar3[1] = uVar11;
      *puVar3 = uVar10;
      puVar3[3] = uVar13;
      puVar3[2] = uVar12;
      uVar6 = uVar6 - 8;
      puVar3 = puVar3 + 8;
      puVar5 = puVar5 + 8;
    } while (uVar6 != 0);
    if (unaff_x19 == uVar2) goto LAB_00718984;
  }
  lVar4 = unaff_x19 - uVar2;
  puVar3 = (undefined8 *)(unaff_x22 + uVar2 * 8 + unaff_x21 * 8);
  puVar5 = (undefined8 *)(lVar1 + uVar2 * 8);
  do {
    *puVar5 = *puVar3;
    lVar4 = lVar4 + -1;
    puVar3 = puVar3 + 1;
    puVar5 = puVar5 + 1;
  } while (lVar4 != 0);
LAB_00718984:
  lVar1 = *in_stack_00000008 + in_stack_00000010 * 8;
  if (lVar1 != in_stack_00000008[1]) {
    in_stack_00000008[1] = lVar1;
  }
  return;
}

