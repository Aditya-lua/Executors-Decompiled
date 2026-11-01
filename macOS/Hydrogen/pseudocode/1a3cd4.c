
void FUN_001a3cd4(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *puVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  lVar2 = *(long *)(unaff_x19 + 0x10);
  if (unaff_x21 != unaff_x20) {
    puVar3 = (undefined8 *)(*(long *)(unaff_x19 + 8) + lVar2 * 0x40);
    do {
      uVar5 = unaff_x21[1];
      uVar4 = *unaff_x21;
      uVar7 = unaff_x21[3];
      uVar6 = unaff_x21[2];
      puVar1 = unaff_x21 + 5;
      uVar8 = unaff_x21[4];
      uVar10 = unaff_x21[7];
      uVar9 = unaff_x21[6];
      unaff_x21 = unaff_x21 + 8;
      puVar3[5] = *puVar1;
      puVar3[4] = uVar8;
      puVar3[7] = uVar10;
      puVar3[6] = uVar9;
      puVar3[1] = uVar5;
      *puVar3 = uVar4;
      puVar3[3] = uVar7;
      puVar3[2] = uVar6;
      lVar2 = lVar2 + 1;
      puVar3 = puVar3 + 8;
    } while (unaff_x21 != unaff_x20);
    *(undefined8 **)(param_1 + 8) = unaff_x21;
  }
  *(long *)(unaff_x19 + 0x10) = lVar2;
  return;
}

