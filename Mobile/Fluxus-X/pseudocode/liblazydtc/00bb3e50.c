/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3e50
 */

void HUF_readDTableX1_wksp
               (uint *param_1,undefined8 param_2,undefined8 param_3,int *param_4,ulong param_5,
               undefined4 param_6)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  undefined1 uVar5;
  uint uVar6;
  long lVar7;
  undefined1 *puVar8;
  ulong uVar9;
  ulong uVar10;
  int iVar11;
  ulong uVar12;
  long *plVar13;
  byte bVar14;
  int *piVar15;
  ulong uVar16;
  uint uVar17;
  undefined8 *puVar18;
  char *pcVar19;
  uint uVar20;
  ulong uVar21;
  long lVar22;
  byte *pbVar23;
  undefined1 *puVar24;
  undefined4 *puVar25;
  long lVar26;
  long *plVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  ulong uVar32;
  long lVar33;
  long lVar34;
  ulong uVar35;
  ulong uVar36;
  char cVar37;
  char cVar38;
  char cVar39;
  char cVar40;
  char cVar41;
  char cVar42;
  char cVar43;
  char cVar45;
  char cVar46;
  char cVar47;
  char cVar48;
  char cVar49;
  char cVar50;
  undefined8 uVar44;
  char cVar51;
  undefined1 uVar56;
  undefined4 uVar52;
  char cVar55;
  char cVar57;
  char cVar59;
  char cVar60;
  char cVar61;
  undefined8 uVar53;
  char cVar58;
  char cVar62;
  undefined8 uVar54;
  char cVar64;
  char cVar65;
  char cVar66;
  char cVar67;
  char cVar68;
  char cVar69;
  undefined8 uVar63;
  char cVar70;
  ulong uVar71;
  ulong uVar72;
  ulong uVar73;
  ulong uVar74;
  ulong uVar75;
  undefined8 local_70;
  long local_68;
  
  lVar7 = tpidr_el0;
  local_68 = *(long *)(lVar7 + 0x28);
  local_70 = 0;
  if (param_5 < 0x5d4) {
LAB_00bb3e88:
    uVar9 = 0xffffffffffffffd4;
    goto LAB_00bb4b38;
  }
  piVar1 = param_4 + 0x135;
  uVar9 = HUF_readStats_wksp(piVar1,0x100,param_4,&local_70,(long)&local_70 + 4,param_2,param_3,
                             param_4 + 0x1a,0x36c,param_6);
  if (0xffffffffffffff88 < uVar9) goto LAB_00bb4b38;
  uVar2 = *param_1;
  uVar4 = (uint)local_70;
  uVar10 = local_70 & 0xffffffff;
  uVar20 = (uVar2 & 0xff) + 1;
  uVar17 = 0xb;
  if (uVar20 < 0xb) {
    uVar17 = (uVar2 & 0xff) + 1;
  }
  uVar6 = uVar17 - local_70._4_4_;
  if (uVar17 < local_70._4_4_) {
    uVar17 = local_70._4_4_;
    if (uVar20 < local_70._4_4_) goto LAB_00bb3e88;
  }
  else if (uVar6 != 0) {
    if ((uint)local_70 != 0) {
      if ((uint)local_70 < 8) {
        uVar21 = 0;
      }
      else {
        bVar14 = (byte)uVar6;
        if ((uint)local_70 < 0x20) {
          uVar16 = 0;
        }
        else {
          uVar21 = local_70 & 0xffffffe0;
          uVar16 = uVar21;
          piVar15 = piVar1;
          do {
            uVar44 = *(undefined8 *)(piVar15 + 2);
            uVar54 = *(undefined8 *)piVar15;
            uVar63 = *(undefined8 *)(piVar15 + 6);
            uVar53 = *(undefined8 *)(piVar15 + 4);
            uVar16 = uVar16 - 0x20;
            cVar37 = (char)((ulong)uVar54 >> 8);
            cVar38 = (char)((ulong)uVar54 >> 0x10);
            cVar39 = (char)((ulong)uVar54 >> 0x18);
            cVar40 = (char)((ulong)uVar54 >> 0x20);
            cVar41 = (char)((ulong)uVar54 >> 0x28);
            cVar42 = (char)((ulong)uVar54 >> 0x30);
            cVar43 = (char)((ulong)uVar54 >> 0x38);
            cVar45 = (char)((ulong)uVar44 >> 8);
            cVar46 = (char)((ulong)uVar44 >> 0x10);
            cVar47 = (char)((ulong)uVar44 >> 0x18);
            cVar48 = (char)((ulong)uVar44 >> 0x20);
            cVar49 = (char)((ulong)uVar44 >> 0x28);
            cVar50 = (char)((ulong)uVar44 >> 0x30);
            cVar51 = (char)((ulong)uVar44 >> 0x38);
            cVar55 = (char)((ulong)uVar53 >> 8);
            cVar57 = (char)((ulong)uVar53 >> 0x10);
            cVar58 = (char)((ulong)uVar53 >> 0x18);
            cVar59 = (char)((ulong)uVar53 >> 0x20);
            cVar60 = (char)((ulong)uVar53 >> 0x28);
            cVar61 = (char)((ulong)uVar53 >> 0x30);
            cVar62 = (char)((ulong)uVar53 >> 0x38);
            cVar64 = (char)((ulong)uVar63 >> 8);
            cVar65 = (char)((ulong)uVar63 >> 0x10);
            cVar66 = (char)((ulong)uVar63 >> 0x18);
            cVar67 = (char)((ulong)uVar63 >> 0x20);
            cVar68 = (char)((ulong)uVar63 >> 0x28);
            cVar69 = (char)((ulong)uVar63 >> 0x30);
            cVar70 = (char)((ulong)uVar63 >> 0x38);
            *(ulong *)(piVar15 + 2) =
                 CONCAT17((bVar14 & ~-(cVar51 == '\0')) + cVar51,
                          CONCAT16((bVar14 & ~-(cVar50 == '\0')) + cVar50,
                                   CONCAT15((bVar14 & ~-(cVar49 == '\0')) + cVar49,
                                            CONCAT14((bVar14 & ~-(cVar48 == '\0')) + cVar48,
                                                     CONCAT13((bVar14 & ~-(cVar47 == '\0')) + cVar47
                                                              ,CONCAT12((bVar14 & ~-(cVar46 == '\0')
                                                                        ) + cVar46,
                                                                        CONCAT11((bVar14 & ~-(cVar45
                                                                                             == '\0'
                                                  )) + cVar45,
                                                  (bVar14 & ~-((char)uVar44 == '\0')) + (char)uVar44
                                                  )))))));
            *(ulong *)piVar15 =
                 CONCAT17((bVar14 & ~-(cVar43 == '\0')) + cVar43,
                          CONCAT16((bVar14 & ~-(cVar42 == '\0')) + cVar42,
                                   CONCAT15((bVar14 & ~-(cVar41 == '\0')) + cVar41,
                                            CONCAT14((bVar14 & ~-(cVar40 == '\0')) + cVar40,
                                                     CONCAT13((bVar14 & ~-(cVar39 == '\0')) + cVar39
                                                              ,CONCAT12((bVar14 & ~-(cVar38 == '\0')
                                                                        ) + cVar38,
                                                                        CONCAT11((bVar14 & ~-(cVar37
                                                                                             == '\0'
                                                  )) + cVar37,
                                                  (bVar14 & ~-((char)uVar54 == '\0')) + (char)uVar54
                                                  )))))));
            *(ulong *)(piVar15 + 6) =
                 CONCAT17((bVar14 & ~-(cVar70 == '\0')) + cVar70,
                          CONCAT16((bVar14 & ~-(cVar69 == '\0')) + cVar69,
                                   CONCAT15((bVar14 & ~-(cVar68 == '\0')) + cVar68,
                                            CONCAT14((bVar14 & ~-(cVar67 == '\0')) + cVar67,
                                                     CONCAT13((bVar14 & ~-(cVar66 == '\0')) + cVar66
                                                              ,CONCAT12((bVar14 & ~-(cVar65 == '\0')
                                                                        ) + cVar65,
                                                                        CONCAT11((bVar14 & ~-(cVar64
                                                                                             == '\0'
                                                  )) + cVar64,
                                                  (bVar14 & ~-((char)uVar63 == '\0')) + (char)uVar63
                                                  )))))));
            *(ulong *)(piVar15 + 4) =
                 CONCAT17((bVar14 & ~-(cVar62 == '\0')) + cVar62,
                          CONCAT16((bVar14 & ~-(cVar61 == '\0')) + cVar61,
                                   CONCAT15((bVar14 & ~-(cVar60 == '\0')) + cVar60,
                                            CONCAT14((bVar14 & ~-(cVar59 == '\0')) + cVar59,
                                                     CONCAT13((bVar14 & ~-(cVar58 == '\0')) + cVar58
                                                              ,CONCAT12((bVar14 & ~-(cVar57 == '\0')
                                                                        ) + cVar57,
                                                                        CONCAT11((bVar14 & ~-(cVar55
                                                                                             == '\0'
                                                  )) + cVar55,
                                                  (bVar14 & ~-((char)uVar53 == '\0')) + (char)uVar53
                                                  )))))));
            piVar15 = piVar15 + 8;
          } while (uVar16 != 0);
          if (uVar21 == uVar10) goto LAB_00bb3fe0;
          uVar16 = uVar21;
          if ((local_70 & 0x18) == 0) goto LAB_00bb3fb8;
        }
        uVar21 = local_70 & 0xfffffff8;
        lVar34 = uVar16 - uVar21;
        puVar18 = (undefined8 *)((long)param_4 + uVar16 + 0x4d4);
        do {
          uVar54 = *puVar18;
          lVar34 = lVar34 + 8;
          cVar37 = (char)((ulong)uVar54 >> 8);
          cVar38 = (char)((ulong)uVar54 >> 0x10);
          cVar39 = (char)((ulong)uVar54 >> 0x18);
          cVar40 = (char)((ulong)uVar54 >> 0x20);
          cVar41 = (char)((ulong)uVar54 >> 0x28);
          cVar42 = (char)((ulong)uVar54 >> 0x30);
          cVar43 = (char)((ulong)uVar54 >> 0x38);
          *puVar18 = CONCAT17((bVar14 & ~-(cVar43 == '\0')) + cVar43,
                              CONCAT16((bVar14 & ~-(cVar42 == '\0')) + cVar42,
                                       CONCAT15((bVar14 & ~-(cVar41 == '\0')) + cVar41,
                                                CONCAT14((bVar14 & ~-(cVar40 == '\0')) + cVar40,
                                                         CONCAT13((bVar14 & ~-(cVar39 == '\0')) +
                                                                  cVar39,CONCAT12((bVar14 & ~-(
                                                  cVar38 == '\0')) + cVar38,
                                                  CONCAT11((bVar14 & ~-(cVar37 == '\0')) + cVar37,
                                                           (bVar14 & ~-((char)uVar54 == '\0')) +
                                                           (char)uVar54)))))));
          puVar18 = puVar18 + 1;
        } while (lVar34 != 0);
        if (uVar21 == uVar10) goto LAB_00bb3fe0;
      }
LAB_00bb3fb8:
      lVar34 = uVar10 - uVar21;
      pcVar19 = (char *)((long)param_4 + uVar21 + 0x4d4);
      do {
        uVar20 = 0;
        if (*pcVar19 != '\0') {
          uVar20 = uVar6;
        }
        lVar34 = lVar34 + -1;
        *pcVar19 = (char)uVar20 + *pcVar19;
        pcVar19 = pcVar19 + 1;
      } while (lVar34 != 0);
    }
LAB_00bb3fe0:
    if (local_70._4_4_ != 0) {
      piVar15 = param_4 + uVar17;
      uVar20 = uVar17;
      do {
        uVar20 = uVar20 - 1;
        *piVar15 = piVar15[-(ulong)uVar6];
        piVar15 = piVar15 + -1;
      } while (uVar6 < uVar20);
    }
    memset((void *)((long)param_4 + (ulong)(uVar6 * 4) + (ulong)(uVar17 + ~local_70._4_4_) * -4),0,
           (ulong)(uVar17 + ~local_70._4_4_) * 4 + 4);
  }
  iVar11 = 0;
  uVar16 = (ulong)(uVar17 + 1);
  *(char *)param_1 = (char)uVar2;
  *(undefined1 *)((long)param_1 + 1) = 0;
  *(char *)((long)param_1 + 2) = (char)uVar17;
  *(char *)((long)param_1 + 3) = (char)(uVar2 >> 0x18);
  piVar15 = param_4;
  do {
    iVar3 = *piVar15;
    uVar16 = uVar16 - 1;
    piVar15[0xd] = iVar11;
    piVar15 = piVar15 + 1;
    iVar11 = iVar3 + iVar11;
  } while (uVar16 != 0);
  if ((int)uVar4 < 4) {
    uVar16 = 0;
    if (0 < (int)uVar4) goto LAB_00bb4114;
  }
  else {
    uVar21 = 0;
    do {
      uVar16 = (ulong)*(byte *)((long)param_4 + uVar21 + 0x4d4);
      uVar20 = param_4[uVar16 + 0xd];
      param_4[uVar16 + 0xd] = uVar20 + 1;
      cVar37 = (char)uVar21;
      *(char *)((long)param_4 + (ulong)uVar20 + 0x3d4) = cVar37;
      uVar16 = (ulong)*(byte *)((long)param_4 + uVar21 + 0x4d5);
      uVar20 = param_4[uVar16 + 0xd];
      param_4[uVar16 + 0xd] = uVar20 + 1;
      *(char *)((long)param_4 + (ulong)uVar20 + 0x3d4) = cVar37 + '\x01';
      uVar16 = (ulong)*(byte *)((long)param_4 + uVar21 + 0x4d6);
      uVar20 = param_4[uVar16 + 0xd];
      param_4[uVar16 + 0xd] = uVar20 + 1;
      *(char *)((long)param_4 + (ulong)uVar20 + 0x3d4) = cVar37 + '\x02';
      uVar16 = uVar21 + 4;
      uVar21 = (ulong)*(byte *)((long)param_4 + uVar21 + 0x4d7);
      uVar20 = param_4[uVar21 + 0xd];
      param_4[uVar21 + 0xd] = uVar20 + 1;
      *(char *)((long)param_4 + (ulong)uVar20 + 0x3d4) = cVar37 + '\x03';
      uVar21 = uVar16;
    } while (uVar16 < uVar4 - 3);
    if ((int)uVar16 < (int)uVar4) {
LAB_00bb4114:
      uVar16 = uVar16 & 0xffffffff;
      do {
        uVar20 = param_4[(ulong)*(byte *)((long)piVar1 + uVar16) + 0xd];
        param_4[(ulong)*(byte *)((long)piVar1 + uVar16) + 0xd] = uVar20 + 1;
        *(char *)((long)param_4 + (ulong)uVar20 + 0x3d4) = (char)uVar16;
        uVar16 = uVar16 + 1;
      } while (uVar10 != uVar16);
    }
  }
  uVar17 = uVar17 + 1;
  if (1 < uVar17) {
    iVar11 = *param_4;
    uVar20 = 0;
    uVar10 = 1;
    do {
      uVar4 = param_4[uVar10];
      uVar16 = (ulong)uVar4;
      uVar6 = uVar17 - (uint)uVar10;
      uVar2 = (1 << (ulong)((uint)uVar10 & 0x1f)) >> 1;
      uVar5 = (undefined1)uVar6;
      if ((int)uVar2 < 4) {
        if (uVar2 == 1) {
          if (0 < (int)uVar4) {
            lVar31 = (long)iVar11;
            lVar34 = (long)(int)uVar20;
            if ((uVar4 < 8) ||
               ((uVar21 = (long)param_4 + lVar31 + 0x3d4,
                (ulong)((long)param_1 + lVar34 * 2 + 4) < uVar21 + uVar16 &&
                (uVar21 < (long)param_1 + (lVar34 + uVar16) * 2 + 4)))) {
              uVar21 = 0;
            }
            else {
              if (uVar4 < 0x20) {
                uVar32 = 0;
              }
              else {
                uVar21 = uVar16 & 0x7fffffe0;
                puVar8 = (undefined1 *)((long)param_1 + lVar34 * 2 + 0x24);
                puVar18 = (undefined8 *)((long)param_4 + lVar31 + 0x3d4);
                uVar32 = uVar21;
                do {
                  uVar63 = puVar18[1];
                  uVar53 = *puVar18;
                  uVar44 = puVar18[3];
                  uVar54 = puVar18[2];
                  uVar32 = uVar32 - 0x20;
                  *puVar8 = uVar5;
                  puVar8[1] = (char)uVar54;
                  puVar8[2] = uVar5;
                  puVar8[3] = (char)((ulong)uVar54 >> 8);
                  puVar8[4] = uVar5;
                  puVar8[5] = (char)((ulong)uVar54 >> 0x10);
                  puVar8[6] = uVar5;
                  puVar8[7] = (char)((ulong)uVar54 >> 0x18);
                  puVar8[8] = uVar5;
                  puVar8[9] = (char)((ulong)uVar54 >> 0x20);
                  puVar8[10] = uVar5;
                  puVar8[0xb] = (char)((ulong)uVar54 >> 0x28);
                  puVar8[0xc] = uVar5;
                  puVar8[0xd] = (char)((ulong)uVar54 >> 0x30);
                  puVar8[0xe] = uVar5;
                  puVar8[0xf] = (char)((ulong)uVar54 >> 0x38);
                  puVar8[0x10] = uVar5;
                  puVar8[0x11] = (char)uVar44;
                  puVar8[0x12] = uVar5;
                  puVar8[0x13] = (char)((ulong)uVar44 >> 8);
                  puVar8[0x14] = uVar5;
                  puVar8[0x15] = (char)((ulong)uVar44 >> 0x10);
                  puVar8[0x16] = uVar5;
                  puVar8[0x17] = (char)((ulong)uVar44 >> 0x18);
                  puVar8[0x18] = uVar5;
                  puVar8[0x19] = (char)((ulong)uVar44 >> 0x20);
                  puVar8[0x1a] = uVar5;
                  puVar8[0x1b] = (char)((ulong)uVar44 >> 0x28);
                  puVar8[0x1c] = uVar5;
                  puVar8[0x1d] = (char)((ulong)uVar44 >> 0x30);
                  puVar8[0x1e] = uVar5;
                  puVar8[0x1f] = (char)((ulong)uVar44 >> 0x38);
                  puVar8[-0x20] = uVar5;
                  puVar8[-0x1f] = (char)uVar53;
                  puVar8[-0x1e] = uVar5;
                  puVar8[-0x1d] = (char)((ulong)uVar53 >> 8);
                  puVar8[-0x1c] = uVar5;
                  puVar8[-0x1b] = (char)((ulong)uVar53 >> 0x10);
                  puVar8[-0x1a] = uVar5;
                  puVar8[-0x19] = (char)((ulong)uVar53 >> 0x18);
                  puVar8[-0x18] = uVar5;
                  puVar8[-0x17] = (char)((ulong)uVar53 >> 0x20);
                  puVar8[-0x16] = uVar5;
                  puVar8[-0x15] = (char)((ulong)uVar53 >> 0x28);
                  puVar8[-0x14] = uVar5;
                  puVar8[-0x13] = (char)((ulong)uVar53 >> 0x30);
                  puVar8[-0x12] = uVar5;
                  puVar8[-0x11] = (char)((ulong)uVar53 >> 0x38);
                  puVar8[-0x10] = uVar5;
                  puVar8[-0xf] = (char)uVar63;
                  puVar8[-0xe] = uVar5;
                  puVar8[-0xd] = (char)((ulong)uVar63 >> 8);
                  puVar8[-0xc] = uVar5;
                  puVar8[-0xb] = (char)((ulong)uVar63 >> 0x10);
                  puVar8[-10] = uVar5;
                  puVar8[-9] = (char)((ulong)uVar63 >> 0x18);
                  puVar8[-8] = uVar5;
                  puVar8[-7] = (char)((ulong)uVar63 >> 0x20);
                  puVar8[-6] = uVar5;
                  puVar8[-5] = (char)((ulong)uVar63 >> 0x28);
                  puVar8[-4] = uVar5;
                  puVar8[-3] = (char)((ulong)uVar63 >> 0x30);
                  puVar8[-2] = uVar5;
                  puVar8[-1] = (char)((ulong)uVar63 >> 0x38);
                  puVar8 = puVar8 + 0x40;
                  puVar18 = puVar18 + 4;
                } while (uVar32 != 0);
                if (uVar21 == uVar16) goto LAB_00bb41a4;
                uVar32 = uVar21;
                if ((uVar4 & 0x18) == 0) {
                  lVar34 = uVar21 + lVar34;
                  goto LAB_00bb4424;
                }
              }
              uVar21 = uVar16 & 0x7ffffff8;
              lVar22 = lVar34 * 2;
              lVar34 = uVar21 + lVar34;
              lVar29 = uVar32 - uVar21;
              puVar8 = (undefined1 *)((long)param_1 + uVar32 * 2 + lVar22 + 4);
              puVar18 = (undefined8 *)((long)param_4 + uVar32 + lVar31 + 0x3d4);
              do {
                uVar54 = *puVar18;
                lVar29 = lVar29 + 8;
                *puVar8 = uVar5;
                puVar8[1] = (char)uVar54;
                puVar8[2] = uVar5;
                puVar8[3] = (char)((ulong)uVar54 >> 8);
                puVar8[4] = uVar5;
                puVar8[5] = (char)((ulong)uVar54 >> 0x10);
                puVar8[6] = uVar5;
                puVar8[7] = (char)((ulong)uVar54 >> 0x18);
                puVar8[8] = uVar5;
                puVar8[9] = (char)((ulong)uVar54 >> 0x20);
                puVar8[10] = uVar5;
                puVar8[0xb] = (char)((ulong)uVar54 >> 0x28);
                puVar8[0xc] = uVar5;
                puVar8[0xd] = (char)((ulong)uVar54 >> 0x30);
                puVar8[0xe] = uVar5;
                puVar8[0xf] = (char)((ulong)uVar54 >> 0x38);
                puVar8 = puVar8 + 0x10;
                puVar18 = puVar18 + 1;
              } while (lVar29 != 0);
              if (uVar21 == uVar16) goto LAB_00bb41a4;
            }
LAB_00bb4424:
            lVar22 = uVar16 - uVar21;
            puVar8 = (undefined1 *)((long)param_1 + lVar34 * 2 + 5);
            puVar24 = (undefined1 *)((long)param_4 + uVar21 + lVar31 + 0x3d4);
            do {
              uVar56 = *puVar24;
              lVar22 = lVar22 + -1;
              puVar8[-1] = uVar5;
              *puVar8 = uVar56;
              puVar8 = puVar8 + 2;
              puVar24 = puVar24 + 1;
            } while (lVar22 != 0);
          }
          goto LAB_00bb41a4;
        }
        if (uVar2 != 2) goto LAB_00bb42f0;
        if ((int)uVar4 < 1) goto LAB_00bb41a4;
        lVar31 = (long)iVar11;
        lVar34 = (long)(int)uVar20;
        if (uVar4 < 8) {
LAB_00bb422c:
          uVar21 = 0;
        }
        else {
          uVar21 = (long)param_4 + lVar31 + 0x3d4;
          if (((ulong)((long)param_1 + lVar34 * 2 + 4) < uVar21 + uVar16) &&
             (uVar21 < (long)param_1 + lVar34 * 2 + uVar16 * 4 + 4)) goto LAB_00bb422c;
          if (uVar4 < 0x20) {
            uVar32 = 0;
LAB_00bb4550:
            uVar21 = uVar16 & 0x7ffffff8;
            lVar22 = lVar34 * 2;
            lVar34 = lVar34 + uVar21 * 2;
            lVar29 = uVar32 - uVar21;
            puVar8 = (undefined1 *)((long)param_1 + uVar32 * 4 + lVar22 + 4);
            puVar18 = (undefined8 *)((long)param_4 + uVar32 + lVar31 + 0x3d4);
            do {
              uVar54 = *puVar18;
              lVar29 = lVar29 + 8;
              *puVar8 = uVar5;
              puVar8[1] = (char)uVar54;
              puVar8[2] = uVar5;
              puVar8[3] = (char)uVar54;
              puVar8[4] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 8);
              puVar8[5] = uVar56;
              puVar8[6] = uVar5;
              puVar8[7] = uVar56;
              puVar8[8] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x10);
              puVar8[9] = uVar56;
              puVar8[10] = uVar5;
              puVar8[0xb] = uVar56;
              puVar8[0xc] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x18);
              puVar8[0xd] = uVar56;
              puVar8[0xe] = uVar5;
              puVar8[0xf] = uVar56;
              puVar8[0x10] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x20);
              puVar8[0x11] = uVar56;
              puVar8[0x12] = uVar5;
              puVar8[0x13] = uVar56;
              puVar8[0x14] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x28);
              puVar8[0x15] = uVar56;
              puVar8[0x16] = uVar5;
              puVar8[0x17] = uVar56;
              puVar8[0x18] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x30);
              puVar8[0x19] = uVar56;
              puVar8[0x1a] = uVar5;
              puVar8[0x1b] = uVar56;
              puVar8[0x1c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x38);
              puVar8[0x1d] = uVar56;
              puVar8[0x1e] = uVar5;
              puVar8[0x1f] = uVar56;
              puVar8 = puVar8 + 0x20;
              puVar18 = puVar18 + 1;
            } while (lVar29 != 0);
            if (uVar21 == uVar16) goto LAB_00bb41a4;
          }
          else {
            uVar21 = uVar16 & 0x7fffffe0;
            puVar8 = (undefined1 *)((long)param_1 + lVar34 * 2 + 0x44);
            puVar18 = (undefined8 *)((long)param_4 + lVar31 + 0x3d4);
            uVar32 = uVar21;
            do {
              uVar63 = puVar18[1];
              uVar53 = *puVar18;
              uVar44 = puVar18[3];
              uVar54 = puVar18[2];
              uVar32 = uVar32 - 0x20;
              *puVar8 = uVar5;
              puVar8[1] = (char)uVar54;
              puVar8[2] = uVar5;
              puVar8[3] = (char)uVar54;
              puVar8[4] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 8);
              puVar8[5] = uVar56;
              puVar8[6] = uVar5;
              puVar8[7] = uVar56;
              puVar8[8] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x10);
              puVar8[9] = uVar56;
              puVar8[10] = uVar5;
              puVar8[0xb] = uVar56;
              puVar8[0xc] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x18);
              puVar8[0xd] = uVar56;
              puVar8[0xe] = uVar5;
              puVar8[0xf] = uVar56;
              puVar8[0x10] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x20);
              puVar8[0x11] = uVar56;
              puVar8[0x12] = uVar5;
              puVar8[0x13] = uVar56;
              puVar8[0x14] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x28);
              puVar8[0x15] = uVar56;
              puVar8[0x16] = uVar5;
              puVar8[0x17] = uVar56;
              puVar8[0x18] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x30);
              puVar8[0x19] = uVar56;
              puVar8[0x1a] = uVar5;
              puVar8[0x1b] = uVar56;
              puVar8[0x1c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar54 >> 0x38);
              puVar8[0x1d] = uVar56;
              puVar8[0x1e] = uVar5;
              puVar8[0x1f] = uVar56;
              puVar8[0x20] = uVar5;
              puVar8[0x21] = (char)uVar44;
              puVar8[0x22] = uVar5;
              puVar8[0x23] = (char)uVar44;
              puVar8[0x24] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 8);
              puVar8[0x25] = uVar56;
              puVar8[0x26] = uVar5;
              puVar8[0x27] = uVar56;
              puVar8[0x28] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 0x10);
              puVar8[0x29] = uVar56;
              puVar8[0x2a] = uVar5;
              puVar8[0x2b] = uVar56;
              puVar8[0x2c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 0x18);
              puVar8[0x2d] = uVar56;
              puVar8[0x2e] = uVar5;
              puVar8[0x2f] = uVar56;
              puVar8[0x30] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 0x20);
              puVar8[0x31] = uVar56;
              puVar8[0x32] = uVar5;
              puVar8[0x33] = uVar56;
              puVar8[0x34] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 0x28);
              puVar8[0x35] = uVar56;
              puVar8[0x36] = uVar5;
              puVar8[0x37] = uVar56;
              puVar8[0x38] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 0x30);
              puVar8[0x39] = uVar56;
              puVar8[0x3a] = uVar5;
              puVar8[0x3b] = uVar56;
              puVar8[0x3c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar44 >> 0x38);
              puVar8[0x3d] = uVar56;
              puVar8[0x3e] = uVar5;
              puVar8[0x3f] = uVar56;
              puVar8[-0x40] = uVar5;
              puVar8[-0x3f] = (char)uVar53;
              puVar8[-0x3e] = uVar5;
              puVar8[-0x3d] = (char)uVar53;
              puVar8[-0x3c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 8);
              puVar8[-0x3b] = uVar56;
              puVar8[-0x3a] = uVar5;
              puVar8[-0x39] = uVar56;
              puVar8[-0x38] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 0x10);
              puVar8[-0x37] = uVar56;
              puVar8[-0x36] = uVar5;
              puVar8[-0x35] = uVar56;
              puVar8[-0x34] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 0x18);
              puVar8[-0x33] = uVar56;
              puVar8[-0x32] = uVar5;
              puVar8[-0x31] = uVar56;
              puVar8[-0x30] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 0x20);
              puVar8[-0x2f] = uVar56;
              puVar8[-0x2e] = uVar5;
              puVar8[-0x2d] = uVar56;
              puVar8[-0x2c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 0x28);
              puVar8[-0x2b] = uVar56;
              puVar8[-0x2a] = uVar5;
              puVar8[-0x29] = uVar56;
              puVar8[-0x28] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 0x30);
              puVar8[-0x27] = uVar56;
              puVar8[-0x26] = uVar5;
              puVar8[-0x25] = uVar56;
              puVar8[-0x24] = uVar5;
              uVar56 = (undefined1)((ulong)uVar53 >> 0x38);
              puVar8[-0x23] = uVar56;
              puVar8[-0x22] = uVar5;
              puVar8[-0x21] = uVar56;
              puVar8[-0x20] = uVar5;
              puVar8[-0x1f] = (char)uVar63;
              puVar8[-0x1e] = uVar5;
              puVar8[-0x1d] = (char)uVar63;
              puVar8[-0x1c] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 8);
              puVar8[-0x1b] = uVar56;
              puVar8[-0x1a] = uVar5;
              puVar8[-0x19] = uVar56;
              puVar8[-0x18] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 0x10);
              puVar8[-0x17] = uVar56;
              puVar8[-0x16] = uVar5;
              puVar8[-0x15] = uVar56;
              puVar8[-0x14] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 0x18);
              puVar8[-0x13] = uVar56;
              puVar8[-0x12] = uVar5;
              puVar8[-0x11] = uVar56;
              puVar8[-0x10] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 0x20);
              puVar8[-0xf] = uVar56;
              puVar8[-0xe] = uVar5;
              puVar8[-0xd] = uVar56;
              puVar8[-0xc] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 0x28);
              puVar8[-0xb] = uVar56;
              puVar8[-10] = uVar5;
              puVar8[-9] = uVar56;
              puVar8[-8] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 0x30);
              puVar8[-7] = uVar56;
              puVar8[-6] = uVar5;
              puVar8[-5] = uVar56;
              puVar8[-4] = uVar5;
              uVar56 = (undefined1)((ulong)uVar63 >> 0x38);
              puVar8[-3] = uVar56;
              puVar8[-2] = uVar5;
              puVar8[-1] = uVar56;
              puVar8 = puVar8 + 0x80;
              puVar18 = puVar18 + 4;
            } while (uVar32 != 0);
            if (uVar21 == uVar16) goto LAB_00bb41a4;
            uVar32 = uVar21;
            if ((uVar4 & 0x18) != 0) goto LAB_00bb4550;
            lVar34 = lVar34 + uVar21 * 2;
          }
        }
        lVar22 = uVar16 - uVar21;
        puVar8 = (undefined1 *)((long)param_1 + lVar34 * 2 + 7);
        puVar24 = (undefined1 *)((long)param_4 + uVar21 + lVar31 + 0x3d4);
        do {
          uVar56 = *puVar24;
          lVar22 = lVar22 + -1;
          puVar8[-3] = uVar5;
          puVar8[-1] = uVar5;
          puVar8[-2] = uVar56;
          *puVar8 = uVar56;
          puVar8 = puVar8 + 4;
          puVar24 = puVar24 + 1;
        } while (lVar22 != 0);
      }
      else if (uVar2 == 4) {
        if (0 < (int)uVar4) {
          lVar31 = (long)iVar11;
          lVar34 = (long)(int)uVar20;
          if (uVar4 < 4) {
            uVar32 = 0;
          }
          else {
            uVar21 = (long)param_4 + lVar31 + 0x3d4;
            if (((ulong)((long)param_1 + lVar34 * 2 + 4) < uVar21 + uVar16) &&
               (uVar21 < (long)param_1 + lVar34 * 2 + uVar16 * 8 + 4)) {
              uVar32 = 0;
            }
            else {
              if (uVar4 < 0x10) {
                uVar21 = 0;
              }
              else {
                uVar32 = uVar16 & 0x7ffffff0;
                plVar13 = (long *)((long)param_1 + lVar34 * 2 + 4);
                puVar18 = (undefined8 *)((long)param_4 + lVar31 + 0x3d4);
                uVar21 = uVar32;
                do {
                  uVar44 = puVar18[1];
                  uVar54 = *puVar18;
                  uVar21 = uVar21 - 0x10;
                  plVar13[9] = (ulong)CONCAT11((char)((ulong)uVar44 >> 8),uVar5) * 0x1000100010001;
                  plVar13[8] = (ulong)CONCAT11((char)uVar44,uVar5) * 0x1000100010001;
                  plVar13[0xb] = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x18),uVar5) *
                                 0x1000100010001;
                  plVar13[10] = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x10),uVar5) *
                                0x1000100010001;
                  plVar13[0xd] = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x28),uVar5) *
                                 0x1000100010001;
                  plVar13[0xc] = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x20),uVar5) *
                                 0x1000100010001;
                  plVar13[0xf] = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x38),uVar5) *
                                 0x1000100010001;
                  plVar13[0xe] = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x30),uVar5) *
                                 0x1000100010001;
                  plVar13[5] = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x28),uVar5) *
                               0x1000100010001;
                  plVar13[4] = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x20),uVar5) *
                               0x1000100010001;
                  plVar13[7] = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x38),uVar5) *
                               0x1000100010001;
                  plVar13[6] = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x30),uVar5) *
                               0x1000100010001;
                  plVar13[1] = (ulong)CONCAT11((char)((ulong)uVar54 >> 8),uVar5) * 0x1000100010001;
                  *plVar13 = (ulong)CONCAT11((char)uVar54,uVar5) * 0x1000100010001;
                  plVar13[3] = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x18),uVar5) *
                               0x1000100010001;
                  plVar13[2] = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x10),uVar5) *
                               0x1000100010001;
                  plVar13 = plVar13 + 0x10;
                  puVar18 = puVar18 + 2;
                } while (uVar21 != 0);
                if (uVar32 == uVar16) goto LAB_00bb41a4;
                uVar21 = uVar32;
                if ((uVar4 & 0xc) == 0) {
                  lVar34 = lVar34 + uVar32 * 4;
                  goto LAB_00bb4b08;
                }
              }
              uVar32 = uVar16 & 0x7ffffffc;
              lVar29 = uVar21 - uVar32;
              lVar22 = lVar34 * 2;
              lVar34 = lVar34 + uVar32 * 4;
              plVar13 = (long *)((long)param_1 + uVar21 * 8 + lVar22 + 4);
              puVar25 = (undefined4 *)((long)param_4 + lVar31 + uVar21 + 0x3d4);
              do {
                uVar52 = *puVar25;
                lVar29 = lVar29 + 4;
                plVar13[1] = (ulong)CONCAT11((char)((uint)uVar52 >> 8),uVar5) * 0x1000100010001;
                *plVar13 = (ulong)CONCAT11((char)uVar52,uVar5) * 0x1000100010001;
                plVar13[3] = (ulong)CONCAT11((char)((uint)uVar52 >> 0x18),uVar5) * 0x1000100010001;
                plVar13[2] = (ulong)CONCAT11((char)((uint)uVar52 >> 0x10),uVar5) * 0x1000100010001;
                plVar13 = plVar13 + 4;
                puVar25 = puVar25 + 1;
              } while (lVar29 != 0);
              if (uVar32 == uVar16) goto LAB_00bb41a4;
            }
          }
LAB_00bb4b08:
          lVar22 = uVar16 - uVar32;
          plVar13 = (long *)((long)param_1 + lVar34 * 2 + 4);
          pbVar23 = (byte *)((long)param_4 + lVar31 + uVar32 + 0x3d4);
          do {
            lVar22 = lVar22 + -1;
            *plVar13 = ((ulong)(uVar6 & 0xff) | (ulong)*pbVar23 << 8) * 0x1000100010001;
            plVar13 = plVar13 + 1;
            pbVar23 = pbVar23 + 1;
          } while (lVar22 != 0);
        }
      }
      else if (uVar2 == 8) {
        if (0 < (int)uVar4) {
          lVar31 = (long)iVar11;
          lVar34 = (long)(int)uVar20;
          if (uVar4 < 4) {
LAB_00bb42b8:
            uVar21 = 0;
          }
          else {
            uVar21 = (long)param_4 + lVar31 + 0x3d4;
            if (((ulong)((long)param_1 + lVar34 * 2 + 4) < uVar21 + uVar16) &&
               (uVar21 < (long)param_1 + lVar34 * 2 + uVar16 * 0x10 + 4)) goto LAB_00bb42b8;
            if (uVar4 < 0x10) {
              uVar32 = 0;
LAB_00bb47a0:
              uVar21 = uVar16 & 0x7ffffffc;
              lVar29 = uVar32 - uVar21;
              lVar22 = lVar34 * 2;
              lVar34 = lVar34 + uVar21 * 8;
              plVar13 = (long *)((long)param_1 + uVar32 * 0x10 + lVar22 + 4);
              puVar25 = (undefined4 *)((long)param_4 + lVar31 + uVar32 + 0x3d4);
              do {
                uVar52 = *puVar25;
                lVar29 = lVar29 + 4;
                uVar32 = (ulong)CONCAT11((char)uVar52,uVar5);
                uVar12 = (ulong)CONCAT11((char)((uint)uVar52 >> 0x10),uVar5);
                lVar28 = (ulong)CONCAT11((char)((uint)uVar52 >> 8),uVar5) * 0x1000100010001;
                lVar22 = (ulong)CONCAT11((char)((uint)uVar52 >> 0x18),uVar5) * 0x1000100010001;
                *plVar13 = uVar32 * 0x1000100010001;
                plVar13[1] = uVar32 * 0x1000100010001;
                plVar13[2] = lVar28;
                plVar13[3] = lVar28;
                plVar13[4] = uVar12 * 0x1000100010001;
                plVar13[5] = uVar12 * 0x1000100010001;
                plVar13[6] = lVar22;
                plVar13[7] = lVar22;
                plVar13 = plVar13 + 8;
                puVar25 = puVar25 + 1;
              } while (lVar29 != 0);
              if (uVar21 == uVar16) goto LAB_00bb41a4;
            }
            else {
              uVar21 = uVar16 & 0x7ffffff0;
              plVar13 = (long *)((long)param_1 + lVar34 * 2 + 4);
              puVar18 = (undefined8 *)((long)param_4 + lVar31 + 0x3d4);
              uVar32 = uVar21;
              do {
                uVar44 = puVar18[1];
                uVar54 = *puVar18;
                uVar32 = uVar32 - 0x10;
                uVar12 = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x30),uVar5);
                uVar35 = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x20),uVar5);
                uVar72 = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x10),uVar5);
                uVar75 = (ulong)CONCAT11((char)uVar54,uVar5);
                uVar71 = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x30),uVar5);
                uVar73 = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x20),uVar5);
                uVar74 = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x10),uVar5);
                uVar36 = (ulong)CONCAT11((char)uVar44,uVar5);
                lVar29 = (ulong)CONCAT11((char)((ulong)uVar54 >> 8),uVar5) * 0x1000100010001;
                lVar30 = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x18),uVar5) * 0x1000100010001;
                lVar22 = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x38),uVar5) * 0x1000100010001;
                lVar28 = (ulong)CONCAT11((char)((ulong)uVar54 >> 0x28),uVar5) * 0x1000100010001;
                lVar26 = (ulong)CONCAT11((char)((ulong)uVar44 >> 8),uVar5) * 0x1000100010001;
                *plVar13 = uVar75 * 0x1000100010001;
                plVar13[1] = uVar75 * 0x1000100010001;
                plVar13[2] = lVar29;
                plVar13[3] = lVar29;
                lVar33 = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x18),uVar5) * 0x1000100010001;
                plVar13[4] = uVar72 * 0x1000100010001;
                plVar13[5] = uVar72 * 0x1000100010001;
                plVar13[6] = lVar30;
                plVar13[7] = lVar30;
                lVar29 = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x28),uVar5) * 0x1000100010001;
                plVar13[8] = uVar35 * 0x1000100010001;
                plVar13[9] = uVar35 * 0x1000100010001;
                plVar13[10] = lVar28;
                plVar13[0xb] = lVar28;
                lVar28 = (ulong)CONCAT11((char)((ulong)uVar44 >> 0x38),uVar5) * 0x1000100010001;
                plVar13[0xc] = uVar12 * 0x1000100010001;
                plVar13[0xd] = uVar12 * 0x1000100010001;
                plVar13[0xe] = lVar22;
                plVar13[0xf] = lVar22;
                plVar13[0x10] = uVar36 * 0x1000100010001;
                plVar13[0x11] = uVar36 * 0x1000100010001;
                plVar13[0x12] = lVar26;
                plVar13[0x13] = lVar26;
                plVar13[0x14] = uVar74 * 0x1000100010001;
                plVar13[0x15] = uVar74 * 0x1000100010001;
                plVar13[0x16] = lVar33;
                plVar13[0x17] = lVar33;
                plVar13[0x18] = uVar73 * 0x1000100010001;
                plVar13[0x19] = uVar73 * 0x1000100010001;
                plVar13[0x1a] = lVar29;
                plVar13[0x1b] = lVar29;
                plVar13[0x1c] = uVar71 * 0x1000100010001;
                plVar13[0x1d] = uVar71 * 0x1000100010001;
                plVar13[0x1e] = lVar28;
                plVar13[0x1f] = lVar28;
                plVar13 = plVar13 + 0x20;
                puVar18 = puVar18 + 2;
              } while (uVar32 != 0);
              if (uVar21 == uVar16) goto LAB_00bb41a4;
              uVar32 = uVar21;
              if ((uVar4 & 0xc) != 0) goto LAB_00bb47a0;
              lVar34 = lVar34 + uVar21 * 8;
            }
          }
          lVar22 = uVar16 - uVar21;
          plVar13 = (long *)((long)param_1 + lVar34 * 2 + 0xc);
          pbVar23 = (byte *)((long)param_4 + lVar31 + uVar21 + 0x3d4);
          do {
            lVar22 = lVar22 + -1;
            lVar34 = ((ulong)(uVar6 & 0xff) | (ulong)*pbVar23 << 8) * 0x1000100010001;
            plVar13[-1] = lVar34;
            *plVar13 = lVar34;
            plVar13 = plVar13 + 2;
            pbVar23 = pbVar23 + 1;
          } while (lVar22 != 0);
        }
      }
      else {
LAB_00bb42f0:
        if (0 < (int)uVar4) {
          uVar36 = -(ulong)(uVar2 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar2 << 1;
          uVar32 = 0;
          uVar21 = ((long)(int)uVar2 - 1U >> 4) + 1;
          uVar35 = uVar21 & 0x1ffffffffffffffc;
          uVar12 = -(ulong)(uVar20 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar20 << 1;
          plVar13 = (long *)((long)param_1 + uVar12 + 0x44);
          lVar34 = (long)param_1 + uVar12;
          do {
            if (0 < (int)uVar2) {
              lVar31 = ((ulong)(uVar6 & 0xff) |
                       (ulong)*(byte *)((long)param_4 + uVar32 + (long)iVar11 + 0x3d4) << 8) *
                       0x1000100010001;
              if (uVar2 < 0x31) {
                lVar22 = 0;
              }
              else {
                uVar12 = uVar35;
                plVar27 = plVar13;
                do {
                  plVar27[-7] = lVar31;
                  plVar27[-8] = lVar31;
                  plVar27[-5] = lVar31;
                  plVar27[-6] = lVar31;
                  uVar12 = uVar12 - 4;
                  plVar27[-3] = lVar31;
                  plVar27[-4] = lVar31;
                  plVar27[-1] = lVar31;
                  plVar27[-2] = lVar31;
                  plVar27[1] = lVar31;
                  *plVar27 = lVar31;
                  plVar27[3] = lVar31;
                  plVar27[2] = lVar31;
                  plVar27[5] = lVar31;
                  plVar27[4] = lVar31;
                  plVar27[7] = lVar31;
                  plVar27[6] = lVar31;
                  plVar27 = plVar27 + 0x10;
                } while (uVar12 != 0);
                lVar22 = uVar35 << 4;
                if (uVar21 == uVar35) goto LAB_00bb433c;
              }
              lVar28 = lVar22 * 2;
              lVar29 = lVar34;
              do {
                lVar22 = lVar22 + 0x10;
                lVar26 = lVar29 + lVar28;
                lVar29 = lVar29 + 0x20;
                *(long *)(lVar26 + 4) = lVar31;
                *(long *)(lVar26 + 0xc) = lVar31;
                *(long *)(lVar26 + 0x14) = lVar31;
                *(long *)(lVar26 + 0x1c) = lVar31;
              } while (lVar22 < (int)uVar2);
            }
LAB_00bb433c:
            uVar32 = uVar32 + 1;
            plVar13 = (long *)((long)plVar13 + uVar36);
            lVar34 = lVar34 + uVar36;
          } while (uVar32 != uVar16);
        }
      }
LAB_00bb41a4:
      uVar10 = uVar10 + 1;
      iVar11 = uVar4 + iVar11;
      uVar20 = uVar4 * uVar2 + uVar20;
    } while (uVar10 != uVar17);
  }
LAB_00bb4b38:
  if (*(long *)(lVar7 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return;
}

