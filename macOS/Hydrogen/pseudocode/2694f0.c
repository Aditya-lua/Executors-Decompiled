
void FUN_002694f0(void)

{
  ulong uVar1;
  long lVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  int iVar6;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x25;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  uVar4 = unaff_x21[2];
  uVar5 = unaff_x22[2];
  uVar1 = uVar4;
  if (uVar5 <= uVar4) {
    uVar1 = uVar5;
  }
  iVar6 = _memcmp(unaff_x21[1],unaff_x22[1],uVar1);
  lVar2 = uVar4 - uVar5;
  if (iVar6 != 0) {
    lVar2 = (long)iVar6;
  }
  puVar3 = unaff_x22;
  if (-1 < lVar2) {
    puVar3 = unaff_x21;
    unaff_x21 = unaff_x22;
  }
  uVar7 = *unaff_x25;
  unaff_x19[1] = unaff_x25[1];
  *unaff_x19 = uVar7;
  uVar8 = unaff_x25[3];
  uVar7 = unaff_x25[2];
  uVar10 = unaff_x25[5];
  uVar9 = unaff_x25[4];
  uVar11 = unaff_x25[6];
  uVar13 = unaff_x25[9];
  uVar12 = unaff_x25[8];
  unaff_x19[7] = unaff_x25[7];
  unaff_x19[6] = uVar11;
  unaff_x19[9] = uVar13;
  unaff_x19[8] = uVar12;
  unaff_x19[3] = uVar8;
  unaff_x19[2] = uVar7;
  unaff_x19[5] = uVar10;
  unaff_x19[4] = uVar9;
  uVar8 = unaff_x21[3];
  uVar7 = unaff_x21[2];
  uVar10 = unaff_x21[5];
  uVar9 = unaff_x21[4];
  uVar11 = unaff_x21[6];
  uVar13 = unaff_x21[9];
  uVar12 = unaff_x21[8];
  unaff_x19[0x11] = unaff_x21[7];
  unaff_x19[0x10] = uVar11;
  unaff_x19[0x13] = uVar13;
  unaff_x19[0x12] = uVar12;
  unaff_x19[0xd] = uVar8;
  unaff_x19[0xc] = uVar7;
  unaff_x19[0xf] = uVar10;
  unaff_x19[0xe] = uVar9;
  uVar7 = *unaff_x21;
  unaff_x19[0xb] = unaff_x21[1];
  unaff_x19[10] = uVar7;
  uVar7 = *puVar3;
  unaff_x19[0x15] = puVar3[1];
  unaff_x19[0x14] = uVar7;
  uVar7 = puVar3[6];
  uVar9 = puVar3[9];
  uVar8 = puVar3[8];
  uVar13 = puVar3[3];
  uVar12 = puVar3[2];
  uVar11 = puVar3[5];
  uVar10 = puVar3[4];
  unaff_x19[0x1b] = puVar3[7];
  unaff_x19[0x1a] = uVar7;
  unaff_x19[0x1d] = uVar9;
  unaff_x19[0x1c] = uVar8;
  unaff_x19[0x17] = uVar13;
  unaff_x19[0x16] = uVar12;
  unaff_x19[0x19] = uVar11;
  unaff_x19[0x18] = uVar10;
  uVar8 = unaff_x20[3];
  uVar7 = unaff_x20[2];
  uVar10 = unaff_x20[5];
  uVar9 = unaff_x20[4];
  uVar11 = unaff_x20[6];
  uVar13 = unaff_x20[9];
  uVar12 = unaff_x20[8];
  unaff_x19[0x25] = unaff_x20[7];
  unaff_x19[0x24] = uVar11;
  unaff_x19[0x27] = uVar13;
  unaff_x19[0x26] = uVar12;
  unaff_x19[0x21] = uVar8;
  unaff_x19[0x20] = uVar7;
  unaff_x19[0x23] = uVar10;
  unaff_x19[0x22] = uVar9;
  uVar7 = *unaff_x20;
  unaff_x19[0x1f] = unaff_x20[1];
  unaff_x19[0x1e] = uVar7;
  return;
}

