
/* WARNING: Type propagation algorithm not settling */

void FUN_00109028(void)

{
  byte bVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  short sVar5;
  int *piVar6;
  uint uVar7;
  float fVar8;
  int iVar9;
  int iVar10;
  ulong uVar11;
  int iVar12;
  uint uVar13;
  undefined2 *puVar14;
  uint uVar15;
  uint uVar16;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  float fVar17;
  float extraout_s0;
  float fVar18;
  undefined8 uStack0000000000000030;
  int iStack0000000000000038;
  int iStack000000000000003c;
  undefined4 uStack0000000000000108;
  float fStack000000000000010c;
  undefined4 uStack0000000000000110;
  undefined4 uStack0000000000000114;
  undefined4 uStack0000000000000118;
  undefined4 uStack000000000000011c;
  
  uVar4 = uStack0000000000000118;
  uVar3 = uStack0000000000000110;
  uVar2 = uStack0000000000000108;
  func_0x00109910();
  func_0x00109910(uVar2,fStack000000000000010c,uVar3,uStack0000000000000114,uVar4,
                  uStack000000000000011c);
  iVar9 = 0;
  fVar8 = fStack000000000000010c;
  while (iVar10 = iStack0000000000000038, iStack0000000000000038 < iStack000000000000003c) {
    uVar11 = (long)iStack0000000000000038 + 1;
    iVar10 = (int)uVar11;
    bVar1 = *(byte *)(uStack0000000000000030 + iStack0000000000000038);
    uVar13 = bVar1 - 1;
    if (uVar13 < 0x1f) {
      iStack0000000000000038 = iVar10;
                    /* WARNING: Could not recover jumptable at 0x0010881c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_00108820 + (ulong)*(ushort *)(unaff_x23 + (ulong)uVar13 * 2) * 4))();
      return;
    }
    if (bVar1 < 0x20 && bVar1 != 0x1c) break;
    if (bVar1 == 0xff) {
      if (iVar10 < iStack000000000000003c) {
        uVar13 = (uint)*(byte *)(uStack0000000000000030 + uVar11);
        uVar11 = (ulong)(iStack0000000000000038 + 2U);
        if (iStack000000000000003c <= (int)(iStack0000000000000038 + 2U)) goto code_r0x00108938;
code_r0x00108fb0:
        uVar15 = (uint)*(byte *)(uStack0000000000000030 + (int)uVar11);
        iStack0000000000000038 = (int)uVar11 + 1;
        if (iStack0000000000000038 < iStack000000000000003c) goto code_r0x00108fc0;
code_r0x00108944:
        uVar16 = 0;
        if (iStack000000000000003c <= iStack0000000000000038) goto code_r0x00108950;
code_r0x00108fd0:
        uVar7 = (uint)*(byte *)(uStack0000000000000030 + iStack0000000000000038);
        iStack0000000000000038 = iStack0000000000000038 + 1;
      }
      else {
        uVar13 = 0;
        if (iVar10 < iStack000000000000003c) goto code_r0x00108fb0;
code_r0x00108938:
        uVar15 = 0;
        iStack0000000000000038 = (int)uVar11;
        if (iStack000000000000003c <= iStack0000000000000038) goto code_r0x00108944;
code_r0x00108fc0:
        uVar16 = (uint)*(byte *)(uStack0000000000000030 + iStack0000000000000038);
        iStack0000000000000038 = iStack0000000000000038 + 1;
        if (iStack0000000000000038 < iStack000000000000003c) goto code_r0x00108fd0;
code_r0x00108950:
        uVar7 = 0;
      }
      fVar8 = 1.5258789e-05;
      fVar17 = (float)(int)((uVar15 << 8 | uVar13 << 0x10 | uVar16) << 8 | uVar7) * 1.5258789e-05;
    }
    else {
      iVar10 = iStack000000000000003c;
      if (iStack0000000000000038 <= iStack000000000000003c && -1 < iStack0000000000000038) {
        iVar10 = iStack0000000000000038;
      }
      iStack0000000000000038 = iVar10;
      sVar5 = func_0x0010857c(&uStack0000000000000030);
      fVar17 = (float)(int)sVar5;
    }
    iVar10 = iStack0000000000000038;
    if (0x2f < iVar9) break;
    *(float *)(unaff_x22 + (long)iVar9 * 4) = fVar17;
    iVar9 = iVar9 + 1;
  }
  iStack0000000000000038 = iVar10;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  piVar6 = (int *)___stack_chk_fail(0);
  fVar17 = (float)piVar6[4];
  if (((float)piVar6[2] == fVar17) && (fVar18 = (float)piVar6[5], (float)piVar6[3] == fVar18))
  goto code_r0x00109818;
  iVar10 = (int)(float)piVar6[2];
  iVar9 = (int)(float)piVar6[3];
  if (*piVar6 == 0) {
    iVar12 = piVar6[0xc];
    puVar14 = (undefined2 *)(*(long *)(piVar6 + 10) + (long)iVar12 * 0xe);
    *(undefined1 *)(puVar14 + 6) = 2;
    *puVar14 = (short)iVar10;
    puVar14[1] = (short)iVar9;
    *(undefined8 *)(puVar14 + 2) = 0;
    fVar17 = (float)piVar6[4];
  }
  else {
    if ((piVar6[7] < iVar10) || (piVar6[1] == 0)) {
      piVar6[7] = iVar10;
      if (iVar9 <= piVar6[9]) goto code_r0x00109778;
code_r0x00109790:
      piVar6[9] = iVar9;
      if (iVar10 < piVar6[6]) goto code_r0x001097b8;
code_r0x001097a0:
      if (piVar6[1] == 0) goto code_r0x001097b8;
      if (piVar6[8] <= iVar9) goto code_r0x001097c8;
code_r0x001097d0:
      piVar6[8] = iVar9;
    }
    else {
      if (piVar6[9] < iVar9) goto code_r0x00109790;
code_r0x00109778:
      if (piVar6[1] == 0) goto code_r0x00109790;
      if (piVar6[6] <= iVar10) goto code_r0x001097a0;
code_r0x001097b8:
      piVar6[6] = iVar10;
      if (iVar9 < piVar6[8]) goto code_r0x001097d0;
code_r0x001097c8:
      if (piVar6[1] == 0) goto code_r0x001097d0;
    }
    piVar6[1] = 1;
    iVar12 = piVar6[0xc];
  }
  piVar6[0xc] = iVar12 + 1;
  fVar18 = (float)piVar6[5];
code_r0x00109818:
  fVar17 = fVar17 + extraout_s0;
  fVar18 = fVar18 + fVar8;
  piVar6[4] = (int)fVar17;
  piVar6[5] = (int)fVar18;
  piVar6[2] = (int)fVar17;
  piVar6[3] = (int)fVar18;
  iVar10 = (int)fVar17;
  iVar9 = (int)fVar18;
  if (*piVar6 == 0) {
    iVar12 = piVar6[0xc];
    puVar14 = (undefined2 *)(*(long *)(piVar6 + 10) + (long)iVar12 * 0xe);
    *(undefined1 *)(puVar14 + 6) = 1;
    *puVar14 = (short)iVar10;
    puVar14[1] = (short)iVar9;
    *(undefined8 *)(puVar14 + 2) = 0;
    piVar6[0xc] = iVar12 + 1;
    return;
  }
  if ((piVar6[7] < iVar10) || (piVar6[1] == 0)) {
    piVar6[7] = iVar10;
    iVar12 = piVar6[9];
  }
  else {
    iVar12 = piVar6[9];
  }
  if ((iVar12 < iVar9) || (piVar6[1] == 0)) {
    piVar6[9] = iVar9;
    iVar12 = piVar6[6];
  }
  else {
    iVar12 = piVar6[6];
  }
  if ((iVar10 < iVar12) || (piVar6[1] == 0)) {
    piVar6[6] = iVar10;
    iVar10 = piVar6[8];
  }
  else {
    iVar10 = piVar6[8];
  }
  if ((iVar9 < iVar10) || (piVar6[1] == 0)) {
    piVar6[8] = iVar9;
  }
  piVar6[1] = 1;
  piVar6[0xc] = piVar6[0xc] + 1;
  return;
}

