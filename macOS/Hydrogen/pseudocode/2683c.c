
void FUN_0002683c(long param_1)

{
  long in_x9;
  undefined1 *in_x10;
  undefined1 *puVar1;
  undefined8 *in_x11;
  undefined1 *puVar2;
  long in_x12;
  long in_x13;
  undefined1 *in_x14;
  undefined8 *puVar3;
  long lVar4;
  long unaff_x20;
  long unaff_x22;
  undefined1 *unaff_x23;
  long unaff_x24;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  puVar3 = (undefined8 *)(param_1 + 0x20);
  lVar4 = in_x13;
  do {
    uVar5 = in_x11[-4];
    uVar7 = in_x11[-1];
    uVar6 = in_x11[-2];
    uVar9 = in_x11[1];
    uVar8 = *in_x11;
    uVar11 = in_x11[3];
    uVar10 = in_x11[2];
    puVar3[-3] = in_x11[-3];
    puVar3[-4] = uVar5;
    puVar3[-1] = uVar7;
    puVar3[-2] = uVar6;
    puVar3[1] = uVar9;
    *puVar3 = uVar8;
    puVar3[3] = uVar11;
    puVar3[2] = uVar10;
    lVar4 = lVar4 + -0x40;
    in_x11 = in_x11 + 8;
    puVar3 = puVar3 + 8;
  } while (lVar4 != 0);
  puVar1 = in_x10;
  if (in_x12 != in_x13) {
    do {
      puVar2 = in_x14 + 1;
      in_x10 = puVar1 + 1;
      *puVar1 = *in_x14;
      puVar1 = in_x10;
      in_x14 = puVar2;
    } while (puVar2 != unaff_x23);
  }
  *(undefined1 **)(unaff_x20 + 8) = in_x10;
  if (param_1 != in_x9) {
    _memmove(in_x9);
  }
  if (unaff_x24 != unaff_x22) {
    _memmove();
  }
  return;
}

