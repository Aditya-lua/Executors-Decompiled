
void FUN_006c5614(long param_1,long param_2)

{
  ulong uVar1;
  undefined8 *in_x9;
  ulong in_x10;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar6;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  puVar6 = unaff_x23;
  if ((0x57 < in_x10) && (0x3f < (ulong)((long)unaff_x23 + (-unaff_x25 - param_2)))) {
    uVar1 = (in_x10 >> 3) + 1;
    uVar2 = uVar1 & 0x3ffffffffffffff8;
    puVar6 = unaff_x23 + -uVar2;
    in_x9 = in_x9 + -uVar2;
    puVar3 = unaff_x23 + -4;
    puVar4 = (undefined8 *)(param_2 + unaff_x24 * 8 + -0x20);
    uVar5 = uVar2;
    do {
      uVar9 = *puVar3;
      uVar8 = puVar3[3];
      uVar7 = puVar3[2];
      uVar13 = puVar3[-3];
      uVar12 = puVar3[-4];
      uVar11 = puVar3[-1];
      uVar10 = puVar3[-2];
      puVar4[1] = puVar3[1];
      *puVar4 = uVar9;
      puVar4[3] = uVar8;
      puVar4[2] = uVar7;
      puVar4[-3] = uVar13;
      puVar4[-4] = uVar12;
      puVar4[-1] = uVar11;
      puVar4[-2] = uVar10;
      puVar3 = puVar3 + -8;
      puVar4 = puVar4 + -8;
      uVar5 = uVar5 - 8;
    } while (uVar5 != 0);
    if (uVar1 == uVar2) goto LAB_006c5690;
  }
  do {
    puVar6 = puVar6 + -1;
    in_x9 = in_x9 + -1;
    *in_x9 = *puVar6;
  } while (puVar6 != unaff_x20);
LAB_006c5690:
  *unaff_x19 = (long)in_x9;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = param_1;
  if (unaff_x20 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  unaff_x19[1] = unaff_x22;
  return;
}

