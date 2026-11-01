
int FUN_000971bc(uint *param_1)

{
  ulong *puVar1;
  char *pcVar2;
  short *psVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  short sVar7;
  int *piVar8;
  int *piVar9;
  int *piVar10;
  bool bVar11;
  short *psVar12;
  int *piVar13;
  short *psVar14;
  short *psVar15;
  int iVar16;
  uint uVar17;
  ulong uVar18;
  ulong *puVar19;
  uint uVar20;
  int *piVar21;
  ulong uVar22;
  ulong *puVar23;
  int in_w13;
  ulong uVar24;
  int *piVar25;
  ulong uVar26;
  int *piVar27;
  int *piVar28;
  uint unaff_w22;
  long lVar29;
  int *piVar30;
  short *psVar31;
  long unaff_x25;
  short *unaff_x27;
  int *piVar32;
  ulong *puVar33;
  long unaff_x29;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  
  uVar4 = *param_1;
  uVar26 = (ulong)unaff_w22;
  piVar21 = *(int **)(unaff_x29 + -0x58);
  param_1[2] = param_1[2] + unaff_w22;
  *param_1 = uVar4 + unaff_w22;
  param_1[1] = 3;
  psVar15 = unaff_x27;
  piVar28 = piVar21;
  if (unaff_w22 < 0xd) {
LAB_000986e8:
    uVar24 = (long)piVar21 + (uVar26 - (long)piVar28);
    uVar18 = uVar24 - 0xf;
    if (uVar24 < 0xf) {
      *(char *)psVar15 = (char)((int)uVar24 << 4);
    }
    else {
      psVar12 = (short *)((long)psVar15 + 1);
      *(char *)psVar15 = -0x10;
      if (0xfe < uVar18) {
        uVar18 = ((*(long *)(unaff_x29 + -0x58) + uVar26) - (long)piVar28) - 0x10e;
        uVar26 = uVar18 / 0xff;
        _memset(psVar12,0xff,uVar26 + 1);
        uVar18 = uVar18 % 0xff;
        psVar12 = (short *)((long)psVar15 + uVar26 + 2);
      }
      *(char *)psVar12 = (char)uVar18;
      psVar15 = psVar12;
    }
    _memcpy((char *)((long)psVar15 + 1),piVar28,uVar24);
    return ((int)(char *)((long)psVar15 + 1) + (int)uVar24) - (int)unaff_x27;
  }
  piVar32 = *(int **)(unaff_x29 + -0x58);
  lVar29 = (long)piVar32 - (ulong)uVar4;
  piVar30 = (int *)((long)piVar21 + (uVar26 - 0xb));
  *(short *)(unaff_x25 + (ulong)((uint)(*piVar32 * -0x61c8864f) >> 0x13) * 2) = (short)uVar4;
  puVar33 = (ulong *)((long)piVar21 + (uVar26 - 0xc));
  piVar25 = piVar32;
code_r0x00097258:
  uVar18 = 1;
  piVar27 = (int *)((long)piVar25 + 1U);
  uVar20 = in_w13 << 6;
  iVar16 = *(int *)((long)piVar25 + 1U);
  do {
    piVar13 = piVar27;
    piVar27 = (int *)((long)piVar13 + uVar18);
    piVar28 = piVar25;
    if (piVar30 < piVar27) goto LAB_000986e8;
    uVar18 = (ulong)(uVar20 >> 6);
    uVar20 = uVar20 + 1;
    lVar6 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
    uVar24 = (ulong)*(ushort *)(unaff_x25 + lVar6);
    sVar7 = (short)lVar29;
    iVar5 = *piVar27;
    *(short *)(unaff_x25 + lVar6) = (short)piVar13 - sVar7;
    bVar11 = *(int *)(lVar29 + uVar24) != iVar16;
    iVar16 = iVar5;
  } while (bVar11);
  piVar27 = (int *)(lVar29 + uVar24);
  if ((*(int **)(unaff_x29 + -0x58) < piVar27) &&
     (*(char *)((long)piVar13 - 1) == *(char *)((long)piVar27 - 1))) {
    piVar8 = (int *)((long)piVar32 + uVar24 + ~(ulong)uVar4);
    piVar9 = (int *)((long)piVar13 - 1U);
    piVar10 = (int *)((long)piVar13 - 1U);
    do {
      piVar13 = piVar10;
      piVar28 = piVar9;
      piVar27 = piVar8;
      if ((piVar27 <= *(int **)(unaff_x29 + -0x58)) || (piVar28 <= piVar25)) break;
      piVar8 = (int *)((long)piVar27 + -1);
      piVar9 = (int *)((long)piVar28 + -1);
      piVar10 = (int *)((long)piVar13 - 1);
    } while (*(char *)((long)piVar28 + -1) == *(char *)((long)piVar27 + -1));
  }
  else {
    piVar28 = piVar13;
  }
  psVar12 = (short *)((long)psVar15 + 1);
  uVar17 = (uint)((long)piVar13 - (long)piVar25);
  uVar20 = uVar17 - 0xf;
  if (uVar17 < 0xf) {
    *(char *)psVar15 = (char)(uVar17 << 4);
  }
  else {
    *(char *)psVar15 = -0x10;
    psVar14 = psVar12;
    if (0xfe < uVar20) {
      uVar20 = ((int)piVar13 - (int)piVar25) - 0x10e;
      uVar18 = (ulong)uVar20 / 0xff;
      _memset(psVar12,0xff,uVar18 + 1);
      uVar20 = uVar20 + (int)uVar18;
      psVar14 = (short *)((long)psVar15 + uVar18 + 2);
    }
    psVar12 = (short *)((long)psVar14 + 1);
    *(char *)psVar14 = (char)uVar20;
  }
  psVar14 = (short *)((long)psVar12 + ((long)piVar13 - (long)piVar25 & 0xffffffffU));
  psVar3 = psVar14;
  if (psVar14 <= psVar12 + 4) {
    psVar3 = psVar12 + 4;
  }
  psVar31 = psVar15;
  if (((char *)((long)psVar3 + ~(ulong)psVar12) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)psVar12 - (long)piVar25) < 0x40)) {
    piVar13 = piVar25;
    psVar15 = psVar12;
  }
  else {
    uVar18 = ((long)psVar3 + ~(ulong)psVar12 >> 3) + 1;
    uVar22 = uVar18 & 0x3ffffffffffffff8;
    piVar13 = piVar25 + uVar22 * 2;
    psVar15 = psVar12 + uVar22 * 4;
    piVar25 = piVar25 + 8;
    psVar12 = psVar12 + 0x10;
    uVar24 = uVar22;
    do {
      uVar34 = *(undefined8 *)(piVar25 + -8);
      uVar36 = *(undefined8 *)(piVar25 + -2);
      uVar35 = *(undefined8 *)(piVar25 + -4);
      uVar38 = *(undefined8 *)(piVar25 + 2);
      uVar37 = *(undefined8 *)piVar25;
      uVar40 = *(undefined8 *)(piVar25 + 6);
      uVar39 = *(undefined8 *)(piVar25 + 4);
      *(undefined8 *)(psVar12 + -0xc) = *(undefined8 *)(piVar25 + -6);
      *(undefined8 *)(psVar12 + -0x10) = uVar34;
      *(undefined8 *)(psVar12 + -4) = uVar36;
      *(undefined8 *)(psVar12 + -8) = uVar35;
      *(undefined8 *)(psVar12 + 4) = uVar38;
      *(undefined8 *)psVar12 = uVar37;
      *(undefined8 *)(psVar12 + 0xc) = uVar40;
      *(undefined8 *)(psVar12 + 8) = uVar39;
      uVar24 = uVar24 - 8;
      piVar25 = piVar25 + 0x10;
      psVar12 = psVar12 + 0x20;
    } while (uVar24 != 0);
    if (uVar18 == uVar22) goto LAB_000973d8;
  }
  do {
    psVar12 = psVar15 + 4;
    *(undefined8 *)psVar15 = *(undefined8 *)piVar13;
    piVar13 = piVar13 + 2;
    psVar15 = psVar12;
  } while (psVar12 < psVar14);
LAB_000973d8:
  do {
    psVar15 = psVar14 + 1;
    *psVar14 = (short)piVar28 - (short)piVar27;
    puVar1 = (ulong *)(piVar28 + 1);
    puVar23 = (ulong *)(piVar27 + 1);
    if (puVar1 < puVar33) {
      uVar18 = *puVar1 ^ *puVar23;
      if (uVar18 == 0) {
        puVar23 = (ulong *)(piVar27 + 3);
        puVar19 = (ulong *)(piVar28 + 3);
        goto LAB_00097424;
      }
      uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
      uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
      uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
      uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
      uVar17 = (uint)((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3);
      piVar28 = (int *)((long)piVar28 + (ulong)(uVar17 + 4));
code_r0x000974dc:
      *(char *)psVar31 = (char)*psVar31 + (char)uVar17;
    }
    else {
      puVar19 = puVar1;
LAB_00097424:
      for (; puVar19 < puVar33; puVar19 = puVar19 + 1) {
        uVar18 = *puVar19 ^ *puVar23;
        if (uVar18 != 0) {
          uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
          uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
          uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
          uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
          puVar19 = (ulong *)((long)puVar19 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3)
                             );
          goto code_r0x00097454;
        }
        puVar23 = puVar23 + 1;
      }
      if (puVar19 < (ulong *)((long)piVar21 + (uVar26 - 8))) {
        if ((int)*puVar23 == (int)*puVar19) {
          puVar19 = (ulong *)((long)puVar19 + 4);
          puVar23 = (ulong *)((long)puVar23 + 4);
        }
      }
      if (puVar19 < (ulong *)((long)piVar21 + (uVar26 - 6))) {
        if ((short)*puVar23 == (short)*puVar19) {
          puVar19 = (ulong *)((long)puVar19 + 2);
          puVar23 = (ulong *)((long)puVar23 + 2);
        }
      }
      if (puVar19 < (ulong *)((long)piVar21 + (uVar26 - 5))) {
        if ((char)*puVar23 == (char)*puVar19) {
          puVar19 = (ulong *)((long)puVar19 + 1);
        }
      }
code_r0x00097454:
      piVar28 = (int *)((long)piVar28 + ((long)puVar19 - (long)puVar1 & 0xffffffffU) + 4);
      uVar17 = (uint)((long)puVar19 - (long)puVar1);
      uVar20 = uVar17 - 0xf;
      if (uVar17 < 0xf) goto code_r0x000974dc;
      *(char *)psVar31 = (char)*psVar31 + '\x0f';
      psVar15[0] = -1;
      psVar15[1] = -1;
      if (0x3fb < uVar20) {
        uVar18 = (ulong)((uVar17 - 0x40b) / 0x3fc << 2);
        _memset(psVar14 + 3,0xff,uVar18 + 4);
        uVar20 = (uVar17 - 0x40b) % 0x3fc;
        psVar15 = (short *)((long)(psVar14 + 3) + uVar18);
      }
      uVar17 = (uVar20 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar15 + (ulong)uVar17);
      psVar15 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar20 + (char)uVar17;
    }
    if (piVar30 <= piVar28) goto LAB_000986e8;
    *(short *)(unaff_x25 + (ulong)((uint)(*(int *)((long)piVar28 + -2) * -0x61c8864f) >> 0x13) * 2)
         = (short)(int *)((long)piVar28 + -2) - sVar7;
    iVar16 = *piVar28;
    lVar6 = (ulong)((uint)(iVar16 * -0x61c8864f) >> 0x13) * 2;
    piVar27 = (int *)(lVar29 + (ulong)*(ushort *)(unaff_x25 + lVar6));
    *(short *)(unaff_x25 + lVar6) = (short)piVar28 - sVar7;
    if (*piVar27 != iVar16) break;
    psVar14 = (short *)((long)psVar15 + 1);
    *(char *)psVar15 = '\0';
    psVar31 = psVar15;
  } while( true );
  piVar25 = piVar28;
  goto code_r0x00097258;
}

