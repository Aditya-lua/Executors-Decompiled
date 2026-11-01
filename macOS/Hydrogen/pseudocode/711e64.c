
void FUN_00711e64(long param_1,long param_2)

{
  ulong uVar1;
  undefined8 *in_x9;
  long in_x10;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long lVar6;
  long unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  if ((0x57 < in_x10 - 8U) && (0x3f < (ulong)((unaff_x24 - param_2) - unaff_x26))) {
    uVar1 = (in_x10 - 8U >> 3) + 1;
    uVar2 = uVar1 & 0x3ffffffffffffff8;
    unaff_x21 = (undefined8 *)(unaff_x24 + uVar2 * -8);
    in_x9 = in_x9 + -uVar2;
    puVar3 = (undefined8 *)(unaff_x24 + -0x20);
    puVar4 = (undefined8 *)(param_2 + unaff_x25 * 8 + -0x20);
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
    if (uVar1 == uVar2) goto LAB_00711ee0;
  }
  do {
    unaff_x21 = unaff_x21 + -1;
    in_x9 = in_x9 + -1;
    *in_x9 = *unaff_x21;
  } while (unaff_x21 != unaff_x23);
LAB_00711ee0:
  lVar6 = *unaff_x20;
  *unaff_x20 = (long)in_x9;
  unaff_x20[1] = unaff_x22;
  unaff_x20[2] = param_1;
  if (lVar6 != 0) {
    __ZdlPv(lVar6);
  }
  unaff_x20[1] = unaff_x22;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return;
}

