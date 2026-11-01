
void FUN_000f13c4(long param_1)

{
  long lVar1;
  int iVar2;
  short sVar3;
  short sVar4;
  short sVar5;
  short sVar6;
  short sVar7;
  int iVar8;
  ulong uVar9;
  long in_x9;
  long in_x10;
  undefined8 *puVar10;
  undefined8 *puVar11;
  long in_x11;
  ulong in_x12;
  long lVar12;
  int iVar13;
  short *psVar14;
  uint uVar15;
  int iVar16;
  long unaff_x19;
  undefined4 unaff_w20;
  undefined8 *unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x25;
  undefined4 unaff_w26;
  long unaff_x27;
  float fVar17;
  float fVar18;
  undefined8 uVar19;
  float fVar20;
  float fVar21;
  undefined8 uVar22;
  float fVar23;
  float unaff_s9;
  float unaff_s10;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000018;
  
  if ((in_x12 & 1) != 0) {
    fVar17 = unaff_s10 * 0.5 + 1.0;
    if ((unaff_x22 & 1) == 0) {
      fVar17 = unaff_s9;
    }
    lVar12 = 0;
    iVar16 = *(int *)(unaff_x19 + 0x34);
    iVar13 = 2;
    if ((unaff_x22 & 1) == 0) {
      iVar13 = 3;
    }
    psVar14 = *(short **)(unaff_x19 + 0x50);
    iVar8 = iVar16;
    do {
      uVar15 = 0;
      if (in_x11 != lVar12) {
        uVar15 = (int)lVar12 + 1;
      }
      uVar9 = (ulong)uVar15;
      iVar2 = iVar16;
      if (in_x11 != lVar12) {
        iVar2 = iVar8 + iVar13;
      }
      uVar19 = *(undefined8 *)(in_x9 + lVar12 * 8);
      uVar22 = *(undefined8 *)(in_x9 + uVar9 * 8);
      fVar18 = ((float)uVar19 + (float)uVar22) * 0.5;
      fVar20 = ((float)((ulong)uVar19 >> 0x20) + (float)((ulong)uVar22 >> 0x20)) * 0.5;
      fVar21 = fVar20 * fVar20 + fVar18 * fVar18;
      if (1e-06 < fVar21) {
        fVar21 = 1.0 / fVar21;
        fVar23 = 100.0;
        if (fVar21 <= 100.0) {
          fVar23 = fVar21;
        }
        fVar18 = fVar18 * fVar23;
        fVar20 = fVar20 * fVar23;
      }
      puVar10 = (undefined8 *)(in_x10 + (ulong)(uVar15 << 1) * 8);
      *puVar10 = CONCAT44((float)((ulong)unaff_x21[uVar9] >> 0x20) + fVar20 * fVar17,
                          (float)unaff_x21[uVar9] + fVar18 * fVar17);
      puVar10[1] = CONCAT44((float)((ulong)unaff_x21[uVar9] >> 0x20) - fVar20 * fVar17,
                            (float)unaff_x21[uVar9] - fVar18 * fVar17);
      sVar3 = (short)iVar2;
      *psVar14 = sVar3;
      sVar4 = (short)iVar8;
      psVar14[1] = sVar4;
      if ((unaff_x22 & 1) == 0) {
        psVar14[2] = sVar4 + 2;
        psVar14[3] = sVar4 + 2;
        psVar14[4] = sVar3 + 2;
        psVar14[5] = sVar3;
        psVar14[6] = sVar3 + 1;
        psVar14[7] = sVar4 + 1;
        psVar14[8] = sVar4;
        psVar14[9] = sVar4;
        psVar14[10] = sVar3;
        psVar14[0xb] = sVar3 + 1;
        psVar14 = psVar14 + 0xc;
        *(short **)(unaff_x19 + 0x50) = psVar14;
        if (unaff_x27 + -1 == lVar12) goto code_r0x000f150c;
      }
      else {
        psVar14[2] = sVar4 + 1;
        psVar14[3] = sVar3 + 1;
        psVar14[4] = sVar4 + 1;
        psVar14[5] = sVar3;
        psVar14 = psVar14 + 6;
        *(short **)(unaff_x19 + 0x50) = psVar14;
        if (unaff_x27 + -1 == lVar12) {
          puVar10 = (undefined8 *)
                    (*(long *)(*(long *)(unaff_x19 + 0x38) + 0x208) +
                    (long)in_stack_00000000._4_4_ * 0x10);
          uVar19 = *puVar10;
          uVar22 = puVar10[1];
          puVar10 = *(undefined8 **)(unaff_x19 + 0x48);
          puVar11 = (undefined8 *)(in_x9 + param_1 * 8 + 8);
          do {
            *puVar10 = puVar11[-1];
            lVar12 = *(long *)(unaff_x19 + 0x48);
            *(undefined8 *)(lVar12 + 8) = uVar19;
            *(undefined4 *)(lVar12 + 0x10) = unaff_w20;
            *(undefined8 *)(lVar12 + 0x14) = *puVar11;
            lVar12 = *(long *)(unaff_x19 + 0x48);
            *(undefined8 *)(lVar12 + 0x1c) = uVar22;
            *(undefined4 *)(lVar12 + 0x24) = unaff_w20;
            puVar10 = (undefined8 *)(lVar12 + 0x28);
            *(undefined8 **)(unaff_x19 + 0x48) = puVar10;
            param_1 = param_1 + -1;
            puVar11 = puVar11 + 2;
          } while (param_1 != 0);
          goto LAB_000f1850;
        }
      }
      lVar12 = lVar12 + 1;
      iVar8 = iVar2;
    } while( true );
  }
  fVar17 = (unaff_s10 - unaff_s9) * 0.5;
  iVar13 = *(int *)(unaff_x19 + 0x34);
  psVar14 = *(short **)(unaff_x19 + 0x50);
  lVar12 = 0;
  iVar16 = iVar13;
  do {
    lVar1 = lVar12 + 1;
    uVar15 = 0;
    if (in_x11 != lVar12) {
      uVar15 = (uint)lVar1;
    }
    uVar9 = (ulong)uVar15;
    iVar8 = iVar13;
    if (in_x11 != lVar12) {
      iVar8 = iVar16 + 4;
    }
    uVar19 = *(undefined8 *)(in_x9 + lVar12 * 8);
    uVar22 = *(undefined8 *)(in_x9 + uVar9 * 8);
    fVar18 = ((float)uVar19 + (float)uVar22) * 0.5;
    fVar20 = ((float)((ulong)uVar19 >> 0x20) + (float)((ulong)uVar22 >> 0x20)) * 0.5;
    fVar21 = fVar20 * fVar20 + fVar18 * fVar18;
    if (1e-06 < fVar21) {
      fVar21 = 1.0 / fVar21;
      fVar23 = 100.0;
      if (fVar21 <= 100.0) {
        fVar23 = fVar21;
      }
      fVar18 = fVar18 * fVar23;
      fVar20 = fVar20 * fVar23;
    }
    fVar21 = fVar18 * (unaff_s9 + fVar17);
    fVar23 = fVar20 * (unaff_s9 + fVar17);
    puVar10 = (undefined8 *)(in_x10 + (ulong)(uVar15 << 2) * 8);
    *puVar10 = CONCAT44(fVar23 + (float)((ulong)unaff_x21[uVar9] >> 0x20),
                        fVar21 + (float)unaff_x21[uVar9]);
    puVar10[1] = CONCAT44(fVar20 * fVar17 + (float)((ulong)unaff_x21[uVar9] >> 0x20),
                          fVar18 * fVar17 + (float)unaff_x21[uVar9]);
    puVar10[2] = CONCAT44((float)((ulong)unaff_x21[uVar9] >> 0x20) - fVar20 * fVar17,
                          (float)unaff_x21[uVar9] - fVar18 * fVar17);
    puVar10[3] = CONCAT44((float)((ulong)unaff_x21[uVar9] >> 0x20) - fVar23,
                          (float)unaff_x21[uVar9] - fVar21);
    sVar6 = (short)iVar8;
    sVar3 = sVar6 + 1;
    *psVar14 = sVar3;
    sVar7 = (short)iVar16;
    psVar14[1] = sVar7 + 1;
    sVar4 = sVar7 + 2;
    psVar14[2] = sVar4;
    psVar14[3] = sVar4;
    sVar5 = sVar6 + 2;
    psVar14[4] = sVar5;
    psVar14[5] = sVar3;
    psVar14[6] = sVar3;
    psVar14[7] = sVar7 + 1;
    psVar14[8] = sVar7;
    psVar14[9] = sVar7;
    psVar14[10] = sVar6;
    psVar14[0xb] = sVar3;
    psVar14[0xc] = sVar5;
    psVar14[0xd] = sVar4;
    psVar14[0xe] = sVar7 + 3;
    psVar14[0xf] = sVar7 + 3;
    psVar14[0x10] = sVar6 + 3;
    psVar14[0x11] = sVar5;
    psVar14 = psVar14 + 0x12;
    lVar12 = lVar1;
    iVar16 = iVar8;
  } while (unaff_x27 != lVar1);
  *(short **)(unaff_x19 + 0x50) = psVar14;
  puVar11 = *(undefined8 **)(unaff_x19 + 0x48);
  puVar10 = (undefined8 *)(in_x9 + param_1 * 8 + 0x10);
  do {
    *puVar11 = puVar10[-2];
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 8) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x10) = unaff_w26;
    *(undefined8 *)(lVar12 + 0x14) = puVar10[-1];
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 0x1c) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x24) = unaff_w20;
    *(undefined8 *)(lVar12 + 0x28) = *puVar10;
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 0x30) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x38) = unaff_w20;
    *(undefined8 *)(lVar12 + 0x3c) = puVar10[1];
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 0x44) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x4c) = unaff_w26;
    puVar11 = (undefined8 *)(lVar12 + 0x50);
    *(undefined8 **)(unaff_x19 + 0x48) = puVar11;
    puVar10 = puVar10 + 4;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
LAB_000f1850:
  *(uint *)(unaff_x19 + 0x34) = *(int *)(unaff_x19 + 0x34) + (in_stack_00000018._4_4_ & 0xffff);
  return;
code_r0x000f150c:
  puVar10 = *(undefined8 **)(unaff_x19 + 0x48);
  puVar11 = (undefined8 *)(in_x9 + param_1 * 8 + 8);
  do {
    *puVar10 = *unaff_x21;
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 8) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x10) = unaff_w20;
    *(undefined8 *)(lVar12 + 0x14) = puVar11[-1];
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 0x1c) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x24) = unaff_w26;
    *(undefined8 *)(lVar12 + 0x28) = *puVar11;
    *(undefined8 *)(*(long *)(unaff_x19 + 0x48) + 0x30) = unaff_x25;
    lVar12 = *(long *)(unaff_x19 + 0x48);
    *(undefined4 *)(lVar12 + 0x38) = unaff_w26;
    puVar10 = (undefined8 *)(lVar12 + 0x3c);
    *(undefined8 **)(unaff_x19 + 0x48) = puVar10;
    param_1 = param_1 + -1;
    puVar11 = puVar11 + 2;
    unaff_x21 = unaff_x21 + 1;
  } while (param_1 != 0);
  goto LAB_000f1850;
}

