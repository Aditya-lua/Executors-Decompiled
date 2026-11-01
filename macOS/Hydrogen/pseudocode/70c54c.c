
void FUN_0070c54c(undefined8 param_1,long param_2)

{
  long in_x9;
  undefined4 *puVar1;
  long in_x10;
  long in_x11;
  undefined4 *in_x12;
  long in_x13;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x24;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  puVar1 = (undefined4 *)(in_x9 - in_x13);
  puVar2 = (undefined8 *)(unaff_x22 + -0x20);
  puVar3 = (undefined8 *)(param_2 + unaff_x24 * 4 + -0x20);
  lVar4 = in_x11;
  do {
    uVar7 = *puVar2;
    uVar6 = puVar2[3];
    uVar5 = puVar2[2];
    uVar11 = puVar2[-3];
    uVar10 = puVar2[-4];
    uVar9 = puVar2[-1];
    uVar8 = puVar2[-2];
    puVar3[1] = puVar2[1];
    *puVar3 = uVar7;
    puVar3[3] = uVar6;
    puVar3[2] = uVar5;
    puVar3[-3] = uVar11;
    puVar3[-4] = uVar10;
    puVar3[-1] = uVar9;
    puVar3[-2] = uVar8;
    puVar2 = puVar2 + -8;
    puVar3 = puVar3 + -8;
    lVar4 = lVar4 + -0x10;
  } while (lVar4 != 0);
  if (in_x10 != in_x11) {
    do {
      in_x12 = in_x12 + -1;
      puVar1 = puVar1 + -1;
      *puVar1 = *in_x12;
    } while (in_x12 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x60) = puVar1;
  *(undefined8 *)(unaff_x19 + 0x68) = unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x70) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x68) = unaff_x21;
  return;
}

