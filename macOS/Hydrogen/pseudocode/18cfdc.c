
void FUN_0018cfdc(long *param_1,long param_2)

{
  long in_x9;
  long in_x10;
  ulong in_x11;
  long lVar1;
  ulong uVar2;
  undefined2 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  lVar1 = in_x9 * 2 + in_x10;
  if ((ulong)(lVar1 - param_2) < 0x40) {
    uVar2 = 0;
  }
  else {
    uVar2 = in_x11 & 0x7fffffffffffffe0;
    in_x9 = in_x9 + uVar2;
    puVar4 = (undefined8 *)(param_2 + 0x20);
    puVar5 = (undefined8 *)(lVar1 + 0x20);
    uVar6 = uVar2;
    do {
      uVar7 = puVar4[-4];
      uVar9 = puVar4[-1];
      uVar8 = puVar4[-2];
      uVar11 = puVar4[1];
      uVar10 = *puVar4;
      uVar13 = puVar4[3];
      uVar12 = puVar4[2];
      puVar5[-3] = puVar4[-3];
      puVar5[-4] = uVar7;
      puVar5[-1] = uVar9;
      puVar5[-2] = uVar8;
      puVar5[1] = uVar11;
      *puVar5 = uVar10;
      puVar5[3] = uVar13;
      puVar5[2] = uVar12;
      uVar6 = uVar6 - 0x20;
      puVar4 = puVar4 + 8;
      puVar5 = puVar5 + 8;
    } while (uVar6 != 0);
    if (in_x11 == uVar2) goto LAB_0018d010;
  }
  lVar1 = in_x11 - uVar2;
  puVar3 = (undefined2 *)(param_2 + uVar2 * 2);
  do {
    *(undefined2 *)(in_x10 + in_x9 * 2) = *puVar3;
    in_x9 = in_x9 + 1;
    lVar1 = lVar1 + -1;
    puVar3 = puVar3 + 1;
  } while (lVar1 != 0);
LAB_0018d010:
  *param_1 = in_x9;
  return;
}

