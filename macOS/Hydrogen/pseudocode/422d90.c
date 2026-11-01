
void FUN_00422d90(void)

{
  bool in_ZR;
  uint *puVar1;
  undefined4 uVar2;
  undefined *puVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined4 *unaff_x19;
  ulong unaff_x20;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined1 uStack0000000000000000;
  char cStack0000000000000001;
  
  if (in_ZR) {
    puVar1 = (uint *)___error();
    puVar3 = (undefined *)((ulong)*puVar1 << 0x20 | 2);
LAB_00422dc8:
    *(undefined **)(unaff_x19 + 2) = puVar3;
    uVar2 = 1;
  }
  else {
    iVar4 = *(int *)(unaff_x29 + -0x14);
    if (iVar4 == 0) {
      iVar4 = 2;
    }
    else if (cStack0000000000000001 != '\x01') {
      puVar3 = &UNK_009da800;
      goto LAB_00422dc8;
    }
    uVar2 = 0;
    puVar5 = (undefined8 *)(unaff_x20 | 2);
    uVar8 = puVar5[5];
    uVar7 = puVar5[4];
    uVar6 = puVar5[6];
    *(undefined8 *)((long)unaff_x19 + 0x42) = puVar5[7];
    *(undefined8 *)((long)unaff_x19 + 0x3a) = uVar6;
    uVar6 = puVar5[8];
    uVar10 = puVar5[0xb];
    uVar9 = puVar5[10];
    *(undefined8 *)((long)unaff_x19 + 0x52) = puVar5[9];
    *(undefined8 *)((long)unaff_x19 + 0x4a) = uVar6;
    *(undefined8 *)((long)unaff_x19 + 0x62) = uVar10;
    *(undefined8 *)((long)unaff_x19 + 0x5a) = uVar9;
    uVar6 = *puVar5;
    uVar10 = puVar5[3];
    uVar9 = puVar5[2];
    *(undefined8 *)((long)unaff_x19 + 0x12) = puVar5[1];
    *(undefined8 *)((long)unaff_x19 + 10) = uVar6;
    *(undefined8 *)((long)unaff_x19 + 0x22) = uVar10;
    *(undefined8 *)((long)unaff_x19 + 0x1a) = uVar9;
    *(undefined1 *)(unaff_x19 + 2) = uStack0000000000000000;
    *(char *)((long)unaff_x19 + 9) = cStack0000000000000001;
    *(undefined8 *)((long)unaff_x19 + 0x6a) = puVar5[0xc];
    *(undefined8 *)((long)unaff_x19 + 0x32) = uVar8;
    *(undefined8 *)((long)unaff_x19 + 0x2a) = uVar7;
    unaff_x19[1] = iVar4;
  }
  *unaff_x19 = uVar2;
  return;
}

