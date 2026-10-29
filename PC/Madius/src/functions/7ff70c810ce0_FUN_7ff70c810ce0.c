/* 7ff70c810ce0 FUN_7ff70c810ce0 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Instruction at (ram,0x7ff70c812dcb) overlaps instruction at (ram,0x7ff70c812dca)
    */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c810ce0(void)

{
  int *piVar1;
  longlong *plVar2;
  char *pcVar3;
  longlong *plVar4;
  char *pcVar5;
  char *pcVar6;
  longlong lVar7;
  short sVar8;
  longlong *plVar9;
  longlong lVar10;
  longlong *plVar11;
  longlong *plVar12;
  longlong lVar13;
  int iVar14;
  longlong lVar15;
  longlong lVar16;
  longlong lVar17;
  longlong lStack_60;
  undefined1 auStack_58 [32];
  undefined8 uStack_38;
  
  pcVar5 = _DAT_7ff70cc1a3c0;
  plVar12 = (longlong *)auStack_58;
  uStack_38 = 0xfffffffffffffffe;
  if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x98) != 0) {
    lStack_60 = 0x7ff70c810d16;
    FUN_7ff70c80af70(&UNK_7ff70cb8ad26);
  }
  if (*(longlong *)(pcVar5 + 0xa0) != 0) {
    lStack_60 = 0x7ff70c810d2c;
    FUN_7ff70c80af70(&UNK_7ff70cb8ad01);
  }
  if ((longlong)*(int *)(pcVar5 + 0x1110) != 0) {
    plVar11 = *(longlong **)(pcVar5 + 0x1118);
    plVar2 = plVar11 + *(int *)(pcVar5 + 0x1110);
LAB_7ff70c810d70:
    do {
      pcVar6 = _DAT_7ff70cc1a3c0;
      lVar13 = *plVar11;
      lStack_60 = 0x7ff70c810d89;
      FUN_7ff70c7e9290(lVar13,_DAT_7ff70cc1a3c0 + 0x1148);
      plVar4 = *(longlong **)(pcVar6 + 0x1118);
      lVar7 = (longlong)*(int *)(pcVar6 + 0x1110);
      plVar9 = plVar4;
      if (0 < lVar7) {
        do {
          if (*plVar9 == lVar13) break;
          plVar9 = plVar9 + 1;
        } while (plVar9 < plVar4 + lVar7);
      }
      if (plVar9 < plVar4 + lVar7) {
        lStack_60 = 0x7ff70c810de0;
        FUN_7ff70cb12b70(plVar9,plVar9 + 1,
                         (((ulonglong)~((longlong)plVar9 - (longlong)plVar4) >> 3) + lVar7) * 8);
        *(int *)(pcVar6 + 0x1110) = *(int *)(pcVar6 + 0x1110) + -1;
      }
      *(int *)(lVar13 + 0x2d4) = *(int *)(lVar13 + 0x2d4) + -1;
      if (*(char **)(lVar13 + 0x2d8) == pcVar5) {
        *(undefined1 *)(lVar13 + 0x50) = 0;
        lStack_60 = 0x7ff70c810dfc;
        FUN_7ff70c7c7a50(lVar13);
        pcVar6 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x2874) == *piVar1) {
            sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x287a) + 1;
          }
          else {
            iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
            lVar7 = (longlong)iVar14;
            *(int *)(pcVar6 + lVar7 * 8 + 0x2874) = *piVar1;
            pcVar3 = pcVar6 + lVar7 * 8 + 0x2878;
            pcVar3[0] = '\0';
            pcVar3[1] = '\0';
            pcVar3[2] = '\0';
            pcVar3[3] = '\0';
            sVar8 = 1;
          }
          *(short *)(pcVar6 + lVar7 * 8 + 0x287a) = sVar8;
          *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
        }
        lStack_60 = 0x7ff70c810e95;
        (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
        plVar11 = plVar11 + 1;
        if (plVar11 == plVar2) break;
        goto LAB_7ff70c810d70;
      }
      plVar11 = plVar11 + 1;
    } while (plVar11 != plVar2);
  }
  lVar13 = *(longlong *)(pcVar5 + 0x1198);
  if (lVar13 != 0) {
    pcVar5[0x1190] = '\0';
    pcVar6 = _DAT_7ff70cc1a3c0;
    pcVar5[0x1191] = '\0';
    pcVar5[0x1192] = '\0';
    pcVar5[0x1193] = '\0';
    pcVar5[0x1194] = '\0';
    pcVar5[0x1195] = '\0';
    pcVar5[0x1196] = '\0';
    pcVar5[0x1197] = '\0';
    if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x2874) == *piVar1) {
        sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x287a) + 1;
      }
      else {
        iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
        lVar7 = (longlong)iVar14;
        *(int *)(pcVar6 + lVar7 * 8 + 0x2874) = *piVar1;
        pcVar3 = pcVar6 + lVar7 * 8 + 0x2878;
        pcVar3[0] = '\0';
        pcVar3[1] = '\0';
        pcVar3[2] = '\0';
        pcVar3[3] = '\0';
        sVar8 = 1;
      }
      *(short *)(pcVar6 + lVar7 * 8 + 0x287a) = sVar8;
      *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
    }
    lStack_60 = 0x7ff70c810f5e;
    (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
    pcVar5[0x1198] = '\0';
    pcVar5[0x1199] = '\0';
    pcVar5[0x119a] = '\0';
    pcVar5[0x119b] = '\0';
    pcVar5[0x119c] = '\0';
    pcVar5[0x119d] = '\0';
    pcVar5[0x119e] = '\0';
    pcVar5[0x119f] = '\0';
  }
  if (*pcVar5 != '\0') {
    if ((pcVar5[0x2670] == '\x01') && (*(longlong *)(pcVar5 + 0x28) != 0)) {
      lStack_60 = 0x7ff70c810f89;
      FUN_7ff70c815110();
    }
    if ((longlong)*(int *)(pcVar5 + 0x26b8) != 0) {
      lVar13 = *(longlong *)(pcVar5 + 0x26c0);
      lVar7 = (longlong)*(int *)(pcVar5 + 0x26b8) << 5;
      do {
        if (*(int *)(lVar13 + 4) == 6) {
          lStack_60 = 0x7ff70c810fc9;
          (**(code **)(lVar13 + 0x10))(pcVar5,lVar13);
        }
        lVar13 = lVar13 + 0x20;
        lVar7 = lVar7 + -0x20;
      } while (lVar7 != 0);
    }
    lVar13 = 0;
    iVar14 = *(int *)(pcVar5 + 0x13e0);
    if (0 < iVar14) {
      lVar13 = 0;
      do {
        lVar7 = *(longlong *)(*(longlong *)(pcVar5 + 0x13e8) + lVar13 * 8);
        if (lVar7 != 0) {
          lStack_60 = 0x7ff70c81106c;
          FUN_7ff70c816af0(lVar7);
          pcVar6 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
              sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar10 = (longlong)iVar14;
              *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
              pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
              pcVar3[0] = '\0';
              pcVar3[1] = '\0';
              pcVar3[2] = '\0';
              pcVar3[3] = '\0';
              sVar8 = 1;
            }
            *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
            *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
          }
          lStack_60 = 0x7ff70c811043;
          (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
          iVar14 = *(int *)(pcVar5 + 0x13e0);
        }
        lVar13 = lVar13 + 1;
      } while (lVar13 < iVar14);
    }
    lVar7 = *(longlong *)(pcVar5 + 0x13e8);
    if (lVar7 != 0) {
      pcVar5[0x13e0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x13e1] = '\0';
      pcVar5[0x13e2] = '\0';
      pcVar5[0x13e3] = '\0';
      pcVar5[0x13e4] = '\0';
      pcVar5[0x13e5] = '\0';
      pcVar5[0x13e6] = '\0';
      pcVar5[0x13e7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81115f;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x13e8] = '\0';
      pcVar5[0x13e9] = '\0';
      pcVar5[0x13ea] = '\0';
      pcVar5[0x13eb] = '\0';
      pcVar5[0x13ec] = '\0';
      pcVar5[0x13ed] = '\0';
      pcVar5[0x13ee] = '\0';
      pcVar5[0x13ef] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x13f8);
    if (lVar7 != 0) {
      pcVar5[0x13f0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x13f1] = '\0';
      pcVar5[0x13f2] = '\0';
      pcVar5[0x13f3] = '\0';
      pcVar5[0x13f4] = '\0';
      pcVar5[0x13f5] = '\0';
      pcVar5[0x13f6] = '\0';
      pcVar5[0x13f7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811226;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x13f8] = '\0';
      pcVar5[0x13f9] = '\0';
      pcVar5[0x13fa] = '\0';
      pcVar5[0x13fb] = '\0';
      pcVar5[0x13fc] = '\0';
      pcVar5[0x13fd] = '\0';
      pcVar5[0x13fe] = '\0';
      pcVar5[0x13ff] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1408);
    if (lVar7 != 0) {
      pcVar5[0x1400] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1401] = '\0';
      pcVar5[0x1402] = '\0';
      pcVar5[0x1403] = '\0';
      pcVar5[0x1404] = '\0';
      pcVar5[0x1405] = '\0';
      pcVar5[0x1406] = '\0';
      pcVar5[0x1407] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8112ed;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1408] = '\0';
      pcVar5[0x1409] = '\0';
      pcVar5[0x140a] = '\0';
      pcVar5[0x140b] = '\0';
      pcVar5[0x140c] = '\0';
      pcVar5[0x140d] = '\0';
      pcVar5[0x140e] = '\0';
      pcVar5[0x140f] = '\0';
    }
    pcVar5[0x1440] = '\0';
    pcVar5[0x1441] = '\0';
    pcVar5[0x1442] = '\0';
    pcVar5[0x1443] = '\0';
    pcVar5[0x1444] = '\0';
    pcVar5[0x1445] = '\0';
    pcVar5[0x1446] = '\0';
    pcVar5[0x1447] = '\0';
    lVar7 = *(longlong *)(pcVar5 + 0x1418);
    if (lVar7 != 0) {
      pcVar5[0x1410] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1411] = '\0';
      pcVar5[0x1412] = '\0';
      pcVar5[0x1413] = '\0';
      pcVar5[0x1414] = '\0';
      pcVar5[0x1415] = '\0';
      pcVar5[0x1416] = '\0';
      pcVar5[0x1417] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8113bf;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1418] = '\0';
      pcVar5[0x1419] = '\0';
      pcVar5[0x141a] = '\0';
      pcVar5[0x141b] = '\0';
      pcVar5[0x141c] = '\0';
      pcVar5[0x141d] = '\0';
      pcVar5[0x141e] = '\0';
      pcVar5[0x141f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1428);
    if (lVar7 != 0) {
      pcVar5[0x1420] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1421] = '\0';
      pcVar5[0x1422] = '\0';
      pcVar5[0x1423] = '\0';
      pcVar5[0x1424] = '\0';
      pcVar5[0x1425] = '\0';
      pcVar5[0x1426] = '\0';
      pcVar5[0x1427] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811486;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1428] = '\0';
      pcVar5[0x1429] = '\0';
      pcVar5[0x142a] = '\0';
      pcVar5[0x142b] = '\0';
      pcVar5[0x142c] = '\0';
      pcVar5[0x142d] = '\0';
      pcVar5[0x142e] = '\0';
      pcVar5[0x142f] = '\0';
    }
    pcVar5[0x1f98] = '\0';
    pcVar5[0x1f99] = '\0';
    pcVar5[0x1f9a] = '\0';
    pcVar5[0x1f9b] = '\0';
    pcVar5[0x1f9c] = '\0';
    pcVar5[0x1f9d] = '\0';
    pcVar5[0x1f9e] = '\0';
    pcVar5[0x1f9f] = '\0';
    pcVar5[0x14d8] = '\0';
    pcVar5[0x14d9] = '\0';
    pcVar5[0x14da] = '\0';
    pcVar5[0x14db] = '\0';
    pcVar5[0x14dc] = '\0';
    pcVar5[0x14dd] = '\0';
    pcVar5[0x14de] = '\0';
    pcVar5[0x14df] = '\0';
    pcVar5[0x1460] = '\0';
    pcVar5[0x1461] = '\0';
    pcVar5[0x1462] = '\0';
    pcVar5[0x1463] = '\0';
    pcVar5[0x1464] = '\0';
    pcVar5[0x1465] = '\0';
    pcVar5[0x1466] = '\0';
    pcVar5[0x1467] = '\0';
    pcVar5[0x1448] = '\0';
    pcVar5[0x1449] = '\0';
    pcVar5[0x144a] = '\0';
    pcVar5[0x144b] = '\0';
    pcVar5[0x144c] = '\0';
    pcVar5[0x144d] = '\0';
    pcVar5[0x144e] = '\0';
    pcVar5[0x144f] = '\0';
    pcVar5[0x1450] = '\0';
    pcVar5[0x1451] = '\0';
    pcVar5[0x1452] = '\0';
    pcVar5[0x1453] = '\0';
    pcVar5[0x1454] = '\0';
    pcVar5[0x1455] = '\0';
    pcVar5[0x1456] = '\0';
    pcVar5[0x1457] = '\0';
    lStack_60 = 0x7ff70c8114d0;
    FUN_7ff70cb12b80(pcVar5 + 0x1c78,0xff,0x136);
    lVar7 = *(longlong *)(pcVar5 + 0x1db8);
    if (lVar7 != 0) {
      pcVar5[0x1db0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1db1] = '\0';
      pcVar5[0x1db2] = '\0';
      pcVar5[0x1db3] = '\0';
      pcVar5[0x1db4] = '\0';
      pcVar5[0x1db5] = '\0';
      pcVar5[0x1db6] = '\0';
      pcVar5[0x1db7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81158c;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1db8] = '\0';
      pcVar5[0x1db9] = '\0';
      pcVar5[0x1dba] = '\0';
      pcVar5[0x1dbb] = '\0';
      pcVar5[0x1dbc] = '\0';
      pcVar5[0x1dbd] = '\0';
      pcVar5[0x1dbe] = '\0';
      pcVar5[0x1dbf] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1dc8);
    if (lVar7 != 0) {
      pcVar5[0x1dc0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1dc1] = '\0';
      pcVar5[0x1dc2] = '\0';
      pcVar5[0x1dc3] = '\0';
      pcVar5[0x1dc4] = '\0';
      pcVar5[0x1dc5] = '\0';
      pcVar5[0x1dc6] = '\0';
      pcVar5[0x1dc7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811653;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1dc8] = '\0';
      pcVar5[0x1dc9] = '\0';
      pcVar5[0x1dca] = '\0';
      pcVar5[0x1dcb] = '\0';
      pcVar5[0x1dcc] = '\0';
      pcVar5[0x1dcd] = '\0';
      pcVar5[0x1dce] = '\0';
      pcVar5[0x1dcf] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1ef8);
    if (lVar7 != 0) {
      pcVar5[0x1ef0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1ef1] = '\0';
      pcVar5[0x1ef2] = '\0';
      pcVar5[0x1ef3] = '\0';
      pcVar5[0x1ef4] = '\0';
      pcVar5[0x1ef5] = '\0';
      pcVar5[0x1ef6] = '\0';
      pcVar5[0x1ef7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81171a;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1ef8] = '\0';
      pcVar5[0x1ef9] = '\0';
      pcVar5[0x1efa] = '\0';
      pcVar5[0x1efb] = '\0';
      pcVar5[0x1efc] = '\0';
      pcVar5[0x1efd] = '\0';
      pcVar5[0x1efe] = '\0';
      pcVar5[0x1eff] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1f08);
    if (lVar7 != 0) {
      pcVar5[0x1f00] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1f01] = '\0';
      pcVar5[0x1f02] = '\0';
      pcVar5[0x1f03] = '\0';
      pcVar5[0x1f04] = '\0';
      pcVar5[0x1f05] = '\0';
      pcVar5[0x1f06] = '\0';
      pcVar5[0x1f07] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8117e1;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1f08] = '\0';
      pcVar5[0x1f09] = '\0';
      pcVar5[0x1f0a] = '\0';
      pcVar5[0x1f0b] = '\0';
      pcVar5[0x1f0c] = '\0';
      pcVar5[0x1f0d] = '\0';
      pcVar5[0x1f0e] = '\0';
      pcVar5[0x1f0f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1f18);
    if (lVar7 != 0) {
      pcVar5[0x1f10] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1f11] = '\0';
      pcVar5[0x1f12] = '\0';
      pcVar5[0x1f13] = '\0';
      pcVar5[0x1f14] = '\0';
      pcVar5[0x1f15] = '\0';
      pcVar5[0x1f16] = '\0';
      pcVar5[0x1f17] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8118a8;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1f18] = '\0';
      pcVar5[0x1f19] = '\0';
      pcVar5[0x1f1a] = '\0';
      pcVar5[0x1f1b] = '\0';
      pcVar5[0x1f1c] = '\0';
      pcVar5[0x1f1d] = '\0';
      pcVar5[0x1f1e] = '\0';
      pcVar5[0x1f1f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1f58);
    if (lVar7 != 0) {
      pcVar5[0x1f50] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1f51] = '\0';
      pcVar5[0x1f52] = '\0';
      pcVar5[0x1f53] = '\0';
      pcVar5[0x1f54] = '\0';
      pcVar5[0x1f55] = '\0';
      pcVar5[0x1f56] = '\0';
      pcVar5[0x1f57] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81196f;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1f58] = '\0';
      pcVar5[0x1f59] = '\0';
      pcVar5[0x1f5a] = '\0';
      pcVar5[0x1f5b] = '\0';
      pcVar5[0x1f5c] = '\0';
      pcVar5[0x1f5d] = '\0';
      pcVar5[0x1f5e] = '\0';
      pcVar5[0x1f5f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1f68);
    if (lVar7 != 0) {
      pcVar5[0x1f60] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1f61] = '\0';
      pcVar5[0x1f62] = '\0';
      pcVar5[0x1f63] = '\0';
      pcVar5[0x1f64] = '\0';
      pcVar5[0x1f65] = '\0';
      pcVar5[0x1f66] = '\0';
      pcVar5[0x1f67] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811a36;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1f68] = '\0';
      pcVar5[0x1f69] = '\0';
      pcVar5[0x1f6a] = '\0';
      pcVar5[0x1f6b] = '\0';
      pcVar5[0x1f6c] = '\0';
      pcVar5[0x1f6d] = '\0';
      pcVar5[0x1f6e] = '\0';
      pcVar5[0x1f6f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x1f78);
    if (lVar7 != 0) {
      pcVar5[0x1f70] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x1f71] = '\0';
      pcVar5[0x1f72] = '\0';
      pcVar5[0x1f73] = '\0';
      pcVar5[0x1f74] = '\0';
      pcVar5[0x1f75] = '\0';
      pcVar5[0x1f76] = '\0';
      pcVar5[0x1f77] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811afd;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x1f78] = '\0';
      pcVar5[0x1f79] = '\0';
      pcVar5[0x1f7a] = '\0';
      pcVar5[0x1f7b] = '\0';
      pcVar5[0x1f7c] = '\0';
      pcVar5[0x1f7d] = '\0';
      pcVar5[0x1f7e] = '\0';
      pcVar5[0x1f7f] = '\0';
    }
    lStack_60 = 0x7ff70c811b14;
    FUN_7ff70c872c00(pcVar5 + 0x1f80);
    if (0 < *(int *)(pcVar5 + 0x22f8)) {
      lVar7 = 8;
      lVar13 = 0;
      do {
        pcVar6 = _DAT_7ff70cc1a3c0;
        if ((longlong)*(int *)(*(longlong *)(pcVar5 + 0x2300) + lVar7) != -1) {
          lVar10 = *(longlong *)(pcVar5 + 0x22f0);
          lVar17 = (longlong)*(int *)(*(longlong *)(pcVar5 + 0x2300) + lVar7) * 0xa8;
          lVar16 = *(longlong *)(lVar10 + 0xa0 + lVar17);
          if (lVar16 != 0) {
            if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + lVar15 * 8 + 0x2874) == *piVar1) {
                sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar15 * 8 + 0x287a) + 1;
              }
              else {
                iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
                lVar15 = (longlong)iVar14;
                *(int *)(pcVar6 + lVar15 * 8 + 0x2874) = *piVar1;
                pcVar3 = pcVar6 + lVar15 * 8 + 0x2878;
                pcVar3[0] = '\0';
                pcVar3[1] = '\0';
                pcVar3[2] = '\0';
                pcVar3[3] = '\0';
                sVar8 = 1;
              }
              *(short *)(pcVar6 + lVar15 * 8 + 0x287a) = sVar8;
              *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
            }
            lStack_60 = 0x7ff70c811c7e;
            (*_DAT_7ff70cbe9468)(lVar16,_DAT_7ff70cc1a3d0);
          }
          pcVar6 = _DAT_7ff70cc1a3c0;
          lVar10 = *(longlong *)(lVar10 + lVar17 + 0x10);
          if (lVar10 != 0) {
            if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x2874) == *piVar1) {
                sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x287a) + 1;
              }
              else {
                iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
                lVar16 = (longlong)iVar14;
                *(int *)(pcVar6 + lVar16 * 8 + 0x2874) = *piVar1;
                pcVar3 = pcVar6 + lVar16 * 8 + 0x2878;
                pcVar3[0] = '\0';
                pcVar3[1] = '\0';
                pcVar3[2] = '\0';
                pcVar3[3] = '\0';
                sVar8 = 1;
              }
              *(short *)(pcVar6 + lVar16 * 8 + 0x287a) = sVar8;
              *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
            }
            lStack_60 = 0x7ff70c811b95;
            (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
          }
        }
        lVar13 = lVar13 + 1;
        lVar7 = lVar7 + 0x10;
      } while (lVar13 < *(int *)(pcVar5 + 0x22f8));
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2300);
    if (lVar7 != 0) {
      pcVar5[0x22f8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x22f9] = '\0';
      pcVar5[0x22fa] = '\0';
      pcVar5[0x22fb] = '\0';
      pcVar5[0x22fc] = '\0';
      pcVar5[0x22fd] = '\0';
      pcVar5[0x22fe] = '\0';
      pcVar5[0x22ff] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811d8b;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2300] = '\0';
      pcVar5[0x2301] = '\0';
      pcVar5[0x2302] = '\0';
      pcVar5[0x2303] = '\0';
      pcVar5[0x2304] = '\0';
      pcVar5[0x2305] = '\0';
      pcVar5[0x2306] = '\0';
      pcVar5[0x2307] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x22f0);
    if (lVar7 != 0) {
      pcVar5[0x22e8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x22e9] = '\0';
      pcVar5[0x22ea] = '\0';
      pcVar5[0x22eb] = '\0';
      pcVar5[0x22ec] = '\0';
      pcVar5[0x22ed] = '\0';
      pcVar5[0x22ee] = '\0';
      pcVar5[0x22ef] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811e52;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x22f0] = '\0';
      pcVar5[0x22f1] = '\0';
      pcVar5[0x22f2] = '\0';
      pcVar5[0x22f3] = '\0';
      pcVar5[0x22f4] = '\0';
      pcVar5[0x22f5] = '\0';
      pcVar5[0x22f6] = '\0';
      pcVar5[0x22f7] = '\0';
    }
    pcVar5[0x2308] = '\0';
    pcVar5[0x2309] = '\0';
    pcVar5[0x230a] = '\0';
    pcVar5[0x230b] = '\0';
    pcVar5[0x230c] = '\0';
    pcVar5[0x230d] = '\0';
    pcVar5[0x230e] = '\0';
    pcVar5[0x230f] = '\0';
    lVar7 = *(longlong *)(pcVar5 + 0x2318);
    if (lVar7 != 0) {
      pcVar5[0x2310] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2311] = '\0';
      pcVar5[0x2312] = '\0';
      pcVar5[0x2313] = '\0';
      pcVar5[0x2314] = '\0';
      pcVar5[0x2315] = '\0';
      pcVar5[0x2316] = '\0';
      pcVar5[0x2317] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811f24;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2318] = '\0';
      pcVar5[0x2319] = '\0';
      pcVar5[0x231a] = '\0';
      pcVar5[0x231b] = '\0';
      pcVar5[0x231c] = '\0';
      pcVar5[0x231d] = '\0';
      pcVar5[0x231e] = '\0';
      pcVar5[0x231f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 9000);
    if (lVar7 != 0) {
      pcVar5[0x2320] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2321] = '\0';
      pcVar5[0x2322] = '\0';
      pcVar5[0x2323] = '\0';
      pcVar5[0x2324] = '\0';
      pcVar5[0x2325] = '\0';
      pcVar5[0x2326] = '\0';
      pcVar5[8999] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c811feb;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[9000] = '\0';
      pcVar5[0x2329] = '\0';
      pcVar5[0x232a] = '\0';
      pcVar5[0x232b] = '\0';
      pcVar5[0x232c] = '\0';
      pcVar5[0x232d] = '\0';
      pcVar5[0x232e] = '\0';
      pcVar5[0x232f] = '\0';
    }
    iVar14 = *(int *)(pcVar5 + 0x2268);
    if (0 < iVar14) {
      lVar7 = 0x20;
      lVar13 = 0;
      do {
        pcVar6 = _DAT_7ff70cc1a3c0;
        lVar10 = *(longlong *)(*(longlong *)(pcVar5 + 0x2270) + lVar7);
        if (lVar10 != 0) {
          if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x2874) == *piVar1) {
              sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x287a) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar16 = (longlong)iVar14;
              *(int *)(pcVar6 + lVar16 * 8 + 0x2874) = *piVar1;
              pcVar3 = pcVar6 + lVar16 * 8 + 0x2878;
              pcVar3[0] = '\0';
              pcVar3[1] = '\0';
              pcVar3[2] = '\0';
              pcVar3[3] = '\0';
              sVar8 = 1;
            }
            *(short *)(pcVar6 + lVar16 * 8 + 0x287a) = sVar8;
            *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
          }
          lStack_60 = 0x7ff70c812075;
          (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
          iVar14 = *(int *)(pcVar5 + 0x2268);
        }
        lVar13 = lVar13 + 1;
        lVar7 = lVar7 + 0x28;
      } while (lVar13 < iVar14);
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2270);
    if (lVar7 != 0) {
      pcVar5[0x2268] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2269] = '\0';
      pcVar5[0x226a] = '\0';
      pcVar5[0x226b] = '\0';
      pcVar5[0x226c] = '\0';
      pcVar5[0x226d] = '\0';
      pcVar5[0x226e] = '\0';
      pcVar5[0x226f] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812190;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2270] = '\0';
      pcVar5[0x2271] = '\0';
      pcVar5[0x2272] = '\0';
      pcVar5[0x2273] = '\0';
      pcVar5[0x2274] = '\0';
      pcVar5[0x2275] = '\0';
      pcVar5[0x2276] = '\0';
      pcVar5[0x2277] = '\0';
    }
    lStack_60 = 0x7ff70c8121a7;
    FUN_7ff70c8730e0(pcVar5 + 0x2298);
    if (0 < *(int *)(pcVar5 + 0x2288)) {
      lVar7 = 0x28;
      lVar13 = 0;
      do {
        lVar10 = *(longlong *)(pcVar5 + 0x2290);
        lStack_60 = 0x7ff70c812253;
        FUN_7ff70c7b6d40(lVar10 + lVar7);
        pcVar6 = _DAT_7ff70cc1a3c0;
        lVar16 = *(longlong *)(lVar10 + 0x10 + lVar7);
        if (lVar16 != 0) {
          if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x2874) == *piVar1) {
              sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar17 * 8 + 0x287a) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar17 = (longlong)iVar14;
              *(int *)(pcVar6 + lVar17 * 8 + 0x2874) = *piVar1;
              pcVar3 = pcVar6 + lVar17 * 8 + 0x2878;
              pcVar3[0] = '\0';
              pcVar3[1] = '\0';
              pcVar3[2] = '\0';
              pcVar3[3] = '\0';
              sVar8 = 1;
            }
            *(short *)(pcVar6 + lVar17 * 8 + 0x287a) = sVar8;
            *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
          }
          lStack_60 = 0x7ff70c812303;
          (*_DAT_7ff70cbe9468)(lVar16,_DAT_7ff70cc1a3d0);
        }
        pcVar6 = _DAT_7ff70cc1a3c0;
        lVar10 = *(longlong *)(lVar10 + -0x10 + lVar7);
        if (lVar10 != 0) {
          if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x2874) == *piVar1) {
              sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x287a) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar16 = (longlong)iVar14;
              *(int *)(pcVar6 + lVar16 * 8 + 0x2874) = *piVar1;
              pcVar3 = pcVar6 + lVar16 * 8 + 0x2878;
              pcVar3[0] = '\0';
              pcVar3[1] = '\0';
              pcVar3[2] = '\0';
              pcVar3[3] = '\0';
              sVar8 = 1;
            }
            *(short *)(pcVar6 + lVar16 * 8 + 0x287a) = sVar8;
            *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
          }
          lStack_60 = 0x7ff70c812228;
          (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
        }
        lVar13 = lVar13 + 1;
        lVar7 = lVar7 + 0x88;
      } while (lVar13 < *(int *)(pcVar5 + 0x2288));
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2290);
    if (lVar7 != 0) {
      pcVar5[0x2288] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2289] = '\0';
      pcVar5[0x228a] = '\0';
      pcVar5[0x228b] = '\0';
      pcVar5[0x228c] = '\0';
      pcVar5[0x228d] = '\0';
      pcVar5[0x228e] = '\0';
      pcVar5[0x228f] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81240e;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2290] = '\0';
      pcVar5[0x2291] = '\0';
      pcVar5[0x2292] = '\0';
      pcVar5[0x2293] = '\0';
      pcVar5[0x2294] = '\0';
      pcVar5[0x2295] = '\0';
      pcVar5[0x2296] = '\0';
      pcVar5[0x2297] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x22d8);
    if (lVar7 != 0) {
      pcVar5[0x22d0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x22d1] = '\0';
      pcVar5[0x22d2] = '\0';
      pcVar5[0x22d3] = '\0';
      pcVar5[0x22d4] = '\0';
      pcVar5[0x22d5] = '\0';
      pcVar5[0x22d6] = '\0';
      pcVar5[0x22d7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8124d5;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x22d8] = '\0';
      pcVar5[0x22d9] = '\0';
      pcVar5[0x22da] = '\0';
      pcVar5[0x22db] = '\0';
      pcVar5[0x22dc] = '\0';
      pcVar5[0x22dd] = '\0';
      pcVar5[0x22de] = '\0';
      pcVar5[0x22df] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x23d0);
    if (lVar7 != 0) {
      pcVar5[0x23c8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x23c9] = '\0';
      pcVar5[0x23ca] = '\0';
      pcVar5[0x23cb] = '\0';
      pcVar5[0x23cc] = '\0';
      pcVar5[0x23cd] = '\0';
      pcVar5[0x23ce] = '\0';
      pcVar5[0x23cf] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81259c;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x23d0] = '\0';
      pcVar5[0x23d1] = '\0';
      pcVar5[0x23d2] = '\0';
      pcVar5[0x23d3] = '\0';
      pcVar5[0x23d4] = '\0';
      pcVar5[0x23d5] = '\0';
      pcVar5[0x23d6] = '\0';
      pcVar5[0x23d7] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x23c0);
    if (lVar7 != 0) {
      pcVar5[0x23b8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x23b9] = '\0';
      pcVar5[0x23ba] = '\0';
      pcVar5[0x23bb] = '\0';
      pcVar5[0x23bc] = '\0';
      pcVar5[0x23bd] = '\0';
      pcVar5[0x23be] = '\0';
      pcVar5[0x23bf] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812663;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x23c0] = '\0';
      pcVar5[0x23c1] = '\0';
      pcVar5[0x23c2] = '\0';
      pcVar5[0x23c3] = '\0';
      pcVar5[0x23c4] = '\0';
      pcVar5[0x23c5] = '\0';
      pcVar5[0x23c6] = '\0';
      pcVar5[0x23c7] = '\0';
    }
    pcVar5[0x23d8] = '\0';
    pcVar5[0x23d9] = '\0';
    pcVar5[0x23da] = '\0';
    pcVar5[0x23db] = '\0';
    pcVar5[0x23dc] = '\0';
    pcVar5[0x23dd] = '\0';
    pcVar5[0x23de] = '\0';
    pcVar5[0x23df] = '\0';
    iVar14 = *(int *)(pcVar5 + 0x23a8);
    if (0 < iVar14) {
      lVar7 = 8;
      lVar13 = 0;
      do {
        pcVar6 = _DAT_7ff70cc1a3c0;
        lVar10 = *(longlong *)(*(longlong *)(pcVar5 + 0x23b0) + lVar7);
        if (lVar10 != 0) {
          if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x2874) == *piVar1) {
              sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar16 * 8 + 0x287a) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar16 = (longlong)iVar14;
              *(int *)(pcVar6 + lVar16 * 8 + 0x2874) = *piVar1;
              pcVar3 = pcVar6 + lVar16 * 8 + 0x2878;
              pcVar3[0] = '\0';
              pcVar3[1] = '\0';
              pcVar3[2] = '\0';
              pcVar3[3] = '\0';
              sVar8 = 1;
            }
            *(short *)(pcVar6 + lVar16 * 8 + 0x287a) = sVar8;
            *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
          }
          lStack_60 = 0x7ff70c812754;
          (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
          iVar14 = *(int *)(pcVar5 + 0x23a8);
        }
        lVar13 = lVar13 + 1;
        lVar7 = lVar7 + 0x60;
      } while (lVar13 < iVar14);
    }
    lVar7 = *(longlong *)(pcVar5 + 0x23b0);
    if (lVar7 != 0) {
      pcVar5[0x23a8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x23a9] = '\0';
      pcVar5[0x23aa] = '\0';
      pcVar5[0x23ab] = '\0';
      pcVar5[0x23ac] = '\0';
      pcVar5[0x23ad] = '\0';
      pcVar5[0x23ae] = '\0';
      pcVar5[0x23af] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c81281c;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x23b0] = '\0';
      pcVar5[0x23b1] = '\0';
      pcVar5[0x23b2] = '\0';
      pcVar5[0x23b3] = '\0';
      pcVar5[0x23b4] = '\0';
      pcVar5[0x23b5] = '\0';
      pcVar5[0x23b6] = '\0';
      pcVar5[0x23b7] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x25b8);
    if (lVar7 != 0) {
      pcVar5[0x25b0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x25b1] = '\0';
      pcVar5[0x25b2] = '\0';
      pcVar5[0x25b3] = '\0';
      pcVar5[0x25b4] = '\0';
      pcVar5[0x25b5] = '\0';
      pcVar5[0x25b6] = '\0';
      pcVar5[0x25b7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8128e3;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x25b8] = '\0';
      pcVar5[0x25b9] = '\0';
      pcVar5[0x25ba] = '\0';
      pcVar5[0x25bb] = '\0';
      pcVar5[0x25bc] = '\0';
      pcVar5[0x25bd] = '\0';
      pcVar5[0x25be] = '\0';
      pcVar5[0x25bf] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x25c8);
    if (lVar7 != 0) {
      pcVar5[0x25c0] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x25c1] = '\0';
      pcVar5[0x25c2] = '\0';
      pcVar5[0x25c3] = '\0';
      pcVar5[0x25c4] = '\0';
      pcVar5[0x25c5] = '\0';
      pcVar5[0x25c6] = '\0';
      pcVar5[0x25c7] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c8129aa;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x25c8] = '\0';
      pcVar5[0x25c9] = '\0';
      pcVar5[0x25ca] = '\0';
      pcVar5[0x25cb] = '\0';
      pcVar5[0x25cc] = '\0';
      pcVar5[0x25cd] = '\0';
      pcVar5[0x25ce] = '\0';
      pcVar5[0x25cf] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2438);
    if (lVar7 != 0) {
      pcVar5[0x2430] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2431] = '\0';
      pcVar5[0x2432] = '\0';
      pcVar5[0x2433] = '\0';
      pcVar5[0x2434] = '\0';
      pcVar5[0x2435] = '\0';
      pcVar5[0x2436] = '\0';
      pcVar5[0x2437] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812a71;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2438] = '\0';
      pcVar5[0x2439] = '\0';
      pcVar5[0x243a] = '\0';
      pcVar5[0x243b] = '\0';
      pcVar5[0x243c] = '\0';
      pcVar5[0x243d] = '\0';
      pcVar5[0x243e] = '\0';
      pcVar5[0x243f] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2448);
    if (lVar7 != 0) {
      pcVar5[0x2440] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2441] = '\0';
      pcVar5[0x2442] = '\0';
      pcVar5[0x2443] = '\0';
      pcVar5[0x2444] = '\0';
      pcVar5[0x2445] = '\0';
      pcVar5[0x2446] = '\0';
      pcVar5[0x2447] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812b38;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2448] = '\0';
      pcVar5[0x2449] = '\0';
      pcVar5[0x244a] = '\0';
      pcVar5[0x244b] = '\0';
      pcVar5[0x244c] = '\0';
      pcVar5[0x244d] = '\0';
      pcVar5[0x244e] = '\0';
      pcVar5[0x244f] = '\0';
    }
    pcVar5[0x2480] = '\0';
    pcVar5[0x2481] = '\0';
    pcVar5[0x2482] = '\0';
    pcVar5[0x2483] = '\0';
    lVar7 = *(longlong *)(pcVar5 + 0x2490);
    if (lVar7 != 0) {
      pcVar5[0x2488] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2489] = '\0';
      pcVar5[0x248a] = '\0';
      pcVar5[0x248b] = '\0';
      pcVar5[0x248c] = '\0';
      pcVar5[0x248d] = '\0';
      pcVar5[0x248e] = '\0';
      pcVar5[0x248f] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812c09;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2490] = '\0';
      pcVar5[0x2491] = '\0';
      pcVar5[0x2492] = '\0';
      pcVar5[0x2493] = '\0';
      pcVar5[0x2494] = '\0';
      pcVar5[0x2495] = '\0';
      pcVar5[0x2496] = '\0';
      pcVar5[0x2497] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x26a0);
    if (lVar7 != 0) {
      pcVar5[0x2698] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2699] = '\0';
      pcVar5[0x269a] = '\0';
      pcVar5[0x269b] = '\0';
      pcVar5[0x269c] = '\0';
      pcVar5[0x269d] = '\0';
      pcVar5[0x269e] = '\0';
      pcVar5[0x269f] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812cd0;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x26a0] = '\0';
      pcVar5[0x26a1] = '\0';
      pcVar5[0x26a2] = '\0';
      pcVar5[0x26a3] = '\0';
      pcVar5[0x26a4] = '\0';
      pcVar5[0x26a5] = '\0';
      pcVar5[0x26a6] = '\0';
      pcVar5[0x26a7] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2690);
    if (lVar7 != 0) {
      pcVar5[0x2688] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2689] = '\0';
      pcVar5[0x268a] = '\0';
      pcVar5[0x268b] = '\0';
      pcVar5[0x268c] = '\0';
      pcVar5[0x268d] = '\0';
      pcVar5[0x268e] = '\0';
      pcVar5[0x268f] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar10 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar10 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar10 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar10 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar10 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      lStack_60 = 0x7ff70c812d97;
      (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
      pcVar5[0x2690] = '\0';
      pcVar5[0x2691] = '\0';
      pcVar5[0x2692] = '\0';
      pcVar5[0x2693] = '\0';
      pcVar5[0x2694] = '\0';
      pcVar5[0x2695] = '\0';
      pcVar5[0x2696] = '\0';
      pcVar5[0x2697] = '\0';
    }
    lVar7 = *(longlong *)(pcVar5 + 0x2730);
    if (lVar7 != 0) {
      plVar12 = &lStack_60;
      lStack_60 = lVar13;
      lVar13 = func_0x7ff70d81209f(1);
      if (lVar7 != lVar13) {
        func_0x7ff70d9befe0(*(undefined8 *)(pcVar5 + 0x2730));
                    /* WARNING: Bad instruction - Truncating control flow here */
        halt_baddata();
      }
      pcVar5[0x2730] = '\0';
      pcVar5[0x2731] = '\0';
      pcVar5[0x2732] = '\0';
      pcVar5[0x2733] = '\0';
      pcVar5[0x2734] = '\0';
      pcVar5[0x2735] = '\0';
      pcVar5[0x2736] = '\0';
      pcVar5[0x2737] = '\0';
    }
    lVar13 = *(longlong *)(pcVar5 + 0x2740);
    if (lVar13 != 0) {
      pcVar5[0x2738] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x2739] = '\0';
      pcVar5[0x273a] = '\0';
      pcVar5[0x273b] = '\0';
      pcVar5[0x273c] = '\0';
      pcVar5[0x273d] = '\0';
      pcVar5[0x273e] = '\0';
      pcVar5[0x273f] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar7 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar7 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar7 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar7 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      *(undefined8 *)((longlong)plVar12 + -8) = 0x7ff70c812e92;
      (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
      pcVar5[0x2740] = '\0';
      pcVar5[0x2741] = '\0';
      pcVar5[0x2742] = '\0';
      pcVar5[0x2743] = '\0';
      pcVar5[0x2744] = '\0';
      pcVar5[0x2745] = '\0';
      pcVar5[0x2746] = '\0';
      pcVar5[0x2747] = '\0';
    }
    lVar13 = *(longlong *)(pcVar5 + 0x27c0);
    if (lVar13 != 0) {
      pcVar5[0x27b8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x27b9] = '\0';
      pcVar5[0x27ba] = '\0';
      pcVar5[0x27bb] = '\0';
      pcVar5[0x27bc] = '\0';
      pcVar5[0x27bd] = '\0';
      pcVar5[0x27be] = '\0';
      pcVar5[0x27bf] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar7 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar7 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar7 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar7 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      *(undefined8 *)((longlong)plVar12 + -8) = 0x7ff70c812f59;
      (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
      pcVar5[0x27c0] = '\0';
      pcVar5[0x27c1] = '\0';
      pcVar5[0x27c2] = '\0';
      pcVar5[0x27c3] = '\0';
      pcVar5[0x27c4] = '\0';
      pcVar5[0x27c5] = '\0';
      pcVar5[0x27c6] = '\0';
      pcVar5[0x27c7] = '\0';
    }
    lVar13 = *(longlong *)(pcVar5 + 0x27d0);
    if (lVar13 != 0) {
      pcVar5[0x27c8] = '\0';
      pcVar6 = _DAT_7ff70cc1a3c0;
      pcVar5[0x27c9] = '\0';
      pcVar5[0x27ca] = '\0';
      pcVar5[0x27cb] = '\0';
      pcVar5[0x27cc] = '\0';
      pcVar5[0x27cd] = '\0';
      pcVar5[0x27ce] = '\0';
      pcVar5[0x27cf] = '\0';
      if (_DAT_7ff70cc1a3c0 != (char *)0x0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x2874) == *piVar1) {
          sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + lVar7 * 8 + 0x287a) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar7 = (longlong)iVar14;
          *(int *)(pcVar6 + lVar7 * 8 + 0x2874) = *piVar1;
          pcVar3 = pcVar6 + lVar7 * 8 + 0x2878;
          pcVar3[0] = '\0';
          pcVar3[1] = '\0';
          pcVar3[2] = '\0';
          pcVar3[3] = '\0';
          sVar8 = 1;
        }
        *(short *)(pcVar6 + lVar7 * 8 + 0x287a) = sVar8;
        *(int *)(pcVar6 + 0x286c) = *(int *)(pcVar6 + 0x286c) + 1;
      }
      *(undefined8 *)((longlong)plVar12 + -8) = 0x7ff70c813020;
      (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
      pcVar5[0x27d0] = '\0';
      pcVar5[0x27d1] = '\0';
      pcVar5[0x27d2] = '\0';
      pcVar5[0x27d3] = '\0';
      pcVar5[0x27d4] = '\0';
      pcVar5[0x27d5] = '\0';
      pcVar5[0x27d6] = '\0';
      pcVar5[0x27d7] = '\0';
    }
    pcVar5[0x27d8] = '\0';
    pcVar5[0x27d9] = '\0';
    pcVar5[0x27da] = '\0';
    pcVar5[0x27db] = '\0';
    *pcVar5 = '\0';
  }
  return;
}


