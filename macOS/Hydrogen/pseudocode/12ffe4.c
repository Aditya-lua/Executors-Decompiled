
void FUN_0012ffe4(ulong param_1)

{
  uint uVar1;
  long lVar2;
  long in_x9;
  undefined1 *puVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  float *pfVar8;
  undefined2 *puVar9;
  long unaff_x19;
  long unaff_x24;
  long unaff_x25;
  int unaff_w26;
  int unaff_w27;
  float fVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  float fVar13;
  undefined8 uVar14;
  float fVar15;
  float fVar16;
  
  uVar6 = param_1 & 0xfffffffc;
  puVar3 = (undefined1 *)(in_x9 + 0x14a);
  uVar4 = uVar6;
  do {
    puVar3[-0xe0] = 0;
    puVar3[-0x70] = 0;
    *puVar3 = 0;
    puVar3[0x70] = 0;
    puVar3 = puVar3 + 0x1c0;
    uVar4 = uVar4 - 4;
  } while (uVar4 != 0);
  if (uVar6 != param_1) {
    lVar2 = param_1 - uVar6;
    puVar3 = (undefined1 *)(in_x9 + uVar6 * 0x70 + 0x6a);
    do {
      *puVar3 = 0;
      lVar2 = lVar2 + -1;
      puVar3 = puVar3 + 0x70;
    } while (lVar2 != 0);
  }
  if (unaff_w27 != unaff_w26) goto LAB_00130178;
  fVar13 = *(float *)(unaff_x19 + 0x80);
  fVar10 = fVar13 + 1.0;
  if (fVar13 + 1.0 < *(float *)(unaff_x24 + 0x21c)) {
    fVar10 = *(float *)(unaff_x24 + 0x21c);
  }
  *(undefined1 *)(unaff_x19 + 0x242) = 1;
  fVar15 = *(float *)(unaff_x19 + 0xf4);
  *(float *)(unaff_x25 + 0xc) = fVar10 - fVar15;
  fVar16 = *(float *)(unaff_x24 + 0x224);
  if (fVar16 <= fVar10) {
    fVar10 = fVar16;
  }
  *(float *)(unaff_x19 + 0x154) = fVar10;
  *(float *)(unaff_x19 + 0x134) = fVar10;
  *(float *)(unaff_x19 + 0x15c) = fVar16;
  *(float *)(unaff_x19 + 0x13c) = fVar16;
  *(undefined2 *)(unaff_x19 + 0x232) = *(undefined2 *)(unaff_x19 + 0x234);
  fVar16 = *(float *)(unaff_x19 + 0x7c);
  fVar15 = (fVar13 + *(float *)(unaff_x19 + 0x114)) - fVar15;
  *(float *)(unaff_x24 + 0x114) = fVar15;
  *(float *)(unaff_x19 + 0x7c) = fVar15 - (fVar13 - fVar16);
  *(float *)(unaff_x19 + 0x80) = fVar15;
  uVar1 = *(uint *)(unaff_x19 + 0x6c);
  uVar4 = (ulong)uVar1;
  lVar2 = *(long *)(unaff_x19 + 0x18);
  if (0 < (int)uVar1) {
    if (uVar1 < 4) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar4 & 0xfffffffc;
      pfVar8 = (float *)(lVar2 + 0x104);
      uVar6 = uVar7;
      do {
        *(undefined2 *)(pfVar8 + -0x2a) = *(undefined2 *)(pfVar8 + -0x29);
        *(undefined2 *)(pfVar8 + -0xe) = *(undefined2 *)(pfVar8 + -0xd);
        *(undefined2 *)(pfVar8 + 0xe) = *(undefined2 *)(pfVar8 + 0xf);
        *(undefined2 *)(pfVar8 + 0x2a) = *(undefined2 *)(pfVar8 + 0x2b);
        pfVar8[-0x38] = fVar10;
        pfVar8[-0x1c] = fVar10;
        *pfVar8 = fVar10;
        pfVar8[0x1c] = fVar10;
        pfVar8 = pfVar8 + 0x70;
        uVar6 = uVar6 - 4;
      } while (uVar6 != 0);
      if (uVar7 == uVar4) goto LAB_00130140;
    }
    puVar9 = (undefined2 *)(lVar2 + uVar7 * 0x70 + 0x60);
    lVar5 = uVar4 - uVar7;
    do {
      puVar9[-2] = *puVar9;
      *(float *)(puVar9 + -0x1e) = fVar10;
      puVar9 = puVar9 + 0x38;
      lVar5 = lVar5 + -1;
    } while (lVar5 != 0);
  }
LAB_00130140:
  uVar12 = *(undefined8 *)(lVar2 + 0x28);
  uVar11 = *(undefined8 *)(lVar2 + 0x20);
  uVar14 = *(undefined8 *)(lVar2 + 0x20);
  *(undefined8 *)(unaff_x24 + 0x250) = *(undefined8 *)(lVar2 + 0x28);
  *(undefined8 *)(unaff_x24 + 0x248) = uVar14;
  lVar5 = *(long *)(unaff_x24 + 0x2a8);
  *(undefined8 *)(lVar5 + 0x90) = uVar12;
  *(undefined8 *)(lVar5 + 0x88) = uVar11;
  lVar2 = *(long *)(lVar5 + 0x60) + (long)*(int *)(lVar5 + 0x58) * 0x10;
  *(undefined8 *)(lVar2 + -8) = uVar12;
  *(undefined8 *)(lVar2 + -0x10) = uVar11;
  func_0x000f69c4(*(undefined8 *)(unaff_x19 + 0x1a0),lVar5,
                  *(undefined2 *)(*(long *)(unaff_x19 + 0x18) + 0x5c));
LAB_00130178:
  if ((*(byte *)(unaff_x19 + 0x94) & 1) == 0) {
    *(int *)(unaff_x19 + 0x98) = *(int *)(unaff_x19 + 0x98) + 1;
  }
  *(undefined1 *)(unaff_x19 + 0x237) = 0;
  return;
}

