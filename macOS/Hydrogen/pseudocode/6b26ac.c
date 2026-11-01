
void FUN_006b26ac(undefined8 param_1,long param_2)

{
  ulong uVar1;
  undefined4 *in_x9;
  long in_x10;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined4 *puVar6;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  puVar6 = unaff_x21;
  if ((0x3b < in_x10 - 4U) && (0x3f < (ulong)((long)unaff_x21 + (-unaff_x24 - param_2)))) {
    uVar1 = (in_x10 - 4U >> 2) + 1;
    uVar2 = uVar1 & 0x7ffffffffffffff0;
    puVar6 = unaff_x21 + -uVar2;
    in_x9 = in_x9 + -uVar2;
    puVar3 = (undefined8 *)(unaff_x21 + -8);
    puVar4 = (undefined8 *)(param_2 + unaff_x23 * 4 + -0x20);
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
      uVar5 = uVar5 - 0x10;
    } while (uVar5 != 0);
    if (uVar1 == uVar2) goto LAB_006b272c;
  }
  do {
    puVar6 = puVar6 + -1;
    in_x9 = in_x9 + -1;
    *in_x9 = *puVar6;
  } while (puVar6 != unaff_x20);
LAB_006b272c:
  *(undefined4 **)(unaff_x19 + 0x40) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x50) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  return;
}

