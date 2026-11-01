
void FUN_00677e3c(ulong param_1)

{
  bool bVar1;
  undefined8 *puVar2;
  bool in_ZR;
  bool in_CY;
  uint in_w8;
  ulong uVar3;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  undefined8 *puVar4;
  long in_x12;
  ulong uVar5;
  long in_x13;
  ulong uVar6;
  long in_x14;
  uint in_w15;
  int in_register_0000407c;
  ulong in_x16;
  long unaff_x21;
  long unaff_x24;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  if ((((in_CY && !in_ZR || in_x16 < param_1) || in_w8 < in_w15) || in_register_0000407c != 0) ||
     ((in_x14 + (-in_x13 - (in_x12 * 8 + 0x7fffffff8U & 0x7fffffff8))) - 8 < 0x40)) {
    uVar3 = in_x9;
  }
  else {
    uVar5 = in_x10 & 0xfffffffffffffff8;
    uVar3 = in_x9 - uVar5;
    puVar4 = (undefined8 *)((unaff_x21 - in_x13) + in_x11 * 8 + -0x20);
    uVar6 = uVar5;
    do {
      uVar9 = puVar4[1];
      uVar8 = *puVar4;
      uVar7 = puVar4[2];
      uVar13 = puVar4[-3];
      uVar12 = puVar4[-4];
      uVar11 = puVar4[-1];
      uVar10 = puVar4[-2];
      puVar2 = (undefined8 *)(unaff_x21 + (in_x9 & 0xffffffff) * 8);
      *puVar2 = puVar4[3];
      puVar2[-1] = uVar7;
      puVar2[-2] = uVar9;
      puVar2[-3] = uVar8;
      puVar2[-4] = uVar11;
      puVar2[-5] = uVar10;
      puVar2[-6] = uVar13;
      puVar2[-7] = uVar12;
      in_x9 = in_x9 - 8;
      puVar4 = puVar4 + -8;
      uVar6 = uVar6 - 8;
    } while (uVar6 != 0);
    if (in_x10 == uVar5) goto LAB_00677e9c;
  }
  uVar6 = uVar3;
  do {
    *(undefined8 *)(unaff_x21 + (uVar6 & 0xffffffff) * 8) =
         *(undefined8 *)(unaff_x21 + unaff_x24 * -8 + uVar6 * 8);
    uVar3 = uVar6 - 1;
    bVar1 = unaff_x24 < (long)uVar6;
    uVar6 = uVar3;
  } while (bVar1);
LAB_00677e9c:
  if (-1 < (int)uVar3) {
    _bzero();
  }
  return;
}

