/* 7ff70c815ba0 FUN_7ff70c815ba0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c815ba0(longlong *param_1,longlong param_2,longlong param_3)

{
  longlong *plVar1;
  int *piVar2;
  undefined8 *puVar3;
  char cVar4;
  longlong lVar5;
  bool bVar6;
  int iVar7;
  uint uVar8;
  int iVar9;
  uint uVar10;
  longlong lVar11;
  longlong lVar12;
  longlong lVar13;
  undefined8 uVar14;
  short sVar15;
  longlong lVar16;
  longlong lVar17;
  ulonglong uVar18;
  char *pcVar19;
  int iVar20;
  int iVar21;
  longlong lVar22;
  
  param_1[0x36] = 0;
  param_1[0x37] = 0;
  *(undefined8 *)((longlong)param_1 + 0x15c) = 0;
  *(undefined8 *)((longlong)param_1 + 0x164) = 0;
  *(undefined4 *)((longlong)param_1 + 0x16c) = 0;
  *(undefined8 *)((longlong)param_1 + 0x17c) = 0;
  *(undefined8 *)((longlong)param_1 + 0x184) = 0;
  *(undefined8 *)((longlong)param_1 + 0x18c) = 0;
  *(undefined8 *)((longlong)param_1 + 0x194) = 0;
  *(undefined4 *)((longlong)param_1 + 0x19c) = 0;
  plVar1 = param_1 + 0x5a;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[0x13] = 0;
  param_1[0x14] = 0;
  param_1[0x15] = 0;
  param_1[0x16] = 0;
  param_1[0x17] = 0;
  param_1[0x18] = 0;
  *(undefined8 *)((longlong)param_1 + 0xf4) = 0;
  *(undefined8 *)((longlong)param_1 + 0xfc) = 0;
  param_1[0x21] = 0;
  param_1[0x22] = 0;
  param_1[0x23] = 0;
  param_1[0x24] = 0;
  param_1[0x25] = 0;
  param_1[0x26] = 0;
  param_1[0x27] = 0;
  param_1[0x28] = 0;
  param_1[0x29] = 0;
  param_1[0x4e] = 0;
  param_1[0x4f] = 0;
  param_1[0x4c] = 0;
  param_1[0x4d] = 0;
  param_1[0x4a] = 0;
  param_1[0x4b] = 0;
  param_1[0x48] = 0;
  param_1[0x49] = 0;
  param_1[0x46] = 0;
  param_1[0x47] = 0;
  param_1[0x44] = 0;
  param_1[0x45] = 0;
  param_1[0x42] = 0;
  param_1[0x43] = 0;
  param_1[0x40] = 0;
  param_1[0x41] = 0;
  param_1[0x3e] = 0;
  param_1[0x3f] = 0;
  param_1[0x50] = 0;
  param_1[0x55] = 0;
  param_1[0x56] = 0;
  param_1[0x53] = 0;
  param_1[0x54] = 0;
  FUN_7ff70c7b5780(plVar1,0);
  FUN_7ff70cb12b80(param_1 + 1,0,0x430);
  *param_1 = param_2;
  lVar11 = FUN_7ff70cb12e80(param_3);
  lVar12 = (*_DAT_7ff70cbe9460)(lVar11 + 1,_DAT_7ff70cc1a3d0);
  lVar13 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cc1a3c0 != 0) {
    piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
    sVar15 = *(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + (longlong)sVar15 * 8) == *piVar2) {
      lVar16 = _DAT_7ff70cc1a3c0 + (longlong)sVar15 * 8 + 0x2874;
    }
    else {
      lVar16 = _DAT_7ff70cc1a3c0 + 0x2874;
      iVar7 = (sVar15 + 1) % 6;
      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
      lVar17 = (longlong)iVar7;
      lVar16 = lVar16 + lVar17 * 8;
      *(int *)(lVar13 + 0x2874 + lVar17 * 8) = *piVar2;
      *(undefined4 *)(lVar13 + 0x2878 + lVar17 * 8) = 0;
    }
    if (lVar11 + 1 == -1) {
      *(short *)(lVar16 + 6) = *(short *)(lVar16 + 6) + 1;
      *(int *)(lVar13 + 0x286c) = *(int *)(lVar13 + 0x286c) + 1;
    }
    else {
      *(short *)(lVar16 + 4) = *(short *)(lVar16 + 4) + 1;
      *(int *)(lVar13 + 0x2868) = *(int *)(lVar13 + 0x2868) + 1;
    }
  }
  FUN_7ff70cb12b60(lVar12,param_3);
  param_1[1] = lVar12;
  iVar7 = FUN_7ff70cb12e80(param_3);
  *(int *)(param_1 + 0x11) = iVar7 + 1;
  pcVar19 = (char *)(param_3 + 2);
  uVar8 = 0xffffffff;
  do {
    cVar4 = pcVar19[-2];
    if (cVar4 == '#') {
      if ((pcVar19[-1] == '#') && (*pcVar19 == '#')) {
        uVar8 = 0xffffffff;
      }
    }
    else if (cVar4 == '\0') {
      uVar8 = ~uVar8;
      *(uint *)(param_1 + 2) = uVar8;
      iVar7 = (int)param_1[0x21];
      if (iVar7 == *(int *)((longlong)param_1 + 0x10c)) {
        if (iVar7 == 0) {
          iVar9 = 8;
        }
        else {
          iVar9 = iVar7 / 2 + iVar7;
        }
        iVar20 = iVar7 + 1;
        if (iVar7 + 1 < iVar9) {
          iVar20 = iVar9;
        }
        lVar13 = (*_DAT_7ff70cbe9460)((longlong)iVar20 << 2,_DAT_7ff70cc1a3d0);
        lVar11 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar2) {
            sVar15 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar12 * 8) + 1;
          }
          else {
            iVar7 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
            lVar12 = (longlong)iVar7;
            *(int *)(lVar11 + 0x2874 + lVar12 * 8) = *piVar2;
            *(undefined4 *)(lVar11 + 0x2878 + lVar12 * 8) = 0;
            sVar15 = 1;
          }
          *(short *)(lVar11 + 0x2878 + lVar12 * 8) = sVar15;
          *(int *)(lVar11 + 0x2868) = *(int *)(lVar11 + 0x2868) + 1;
        }
        if (param_1[0x22] != 0) {
          FUN_7ff70cb12b60(lVar13);
          lVar12 = _DAT_7ff70cc1a3c0;
          lVar11 = param_1[0x22];
          if ((lVar11 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar2) {
              sVar15 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar16 * 8) + 1;
            }
            else {
              iVar7 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
              lVar16 = (longlong)iVar7;
              *(int *)(lVar12 + 0x2874 + lVar16 * 8) = *piVar2;
              *(undefined4 *)(lVar12 + 0x2878 + lVar16 * 8) = 0;
              sVar15 = 1;
            }
            *(short *)(lVar12 + 0x287a + lVar16 * 8) = sVar15;
            *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar11,_DAT_7ff70cc1a3d0);
        }
        param_1[0x22] = lVar13;
        *(int *)((longlong)param_1 + 0x10c) = iVar20;
        uVar8 = *(uint *)(param_1 + 2);
        iVar7 = (int)param_1[0x21];
      }
      else {
        lVar13 = param_1[0x22];
      }
      *(uint *)(lVar13 + (longlong)iVar7 * 4) = uVar8;
      lVar13 = param_1[0x21];
      *(int *)(param_1 + 0x21) = (int)lVar13 + 1;
      lVar11 = _DAT_7ff70cc1a3c0;
      uVar10 = ~*(uint *)(param_1[0x22] + (longlong)(int)lVar13 * 4);
      pcVar19 = "OVE";
      uVar8 = uVar10;
      do {
        cVar4 = pcVar19[-2];
        if (cVar4 == '#') {
          if ((pcVar19[-1] == '#') && (*pcVar19 == '#')) {
            uVar8 = uVar10;
          }
        }
        else if (cVar4 == '\0') {
          uVar8 = ~uVar8;
          if (*(uint *)(*param_1 + 0x1498) == uVar8) {
            lVar13 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
            lVar12 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x2834);
            if (lVar12 == -1) {
              *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2834) = 0;
              iVar7 = *(int *)(lVar13 + 0x108);
              lVar12 = (longlong)iVar7 + 1;
              iVar9 = *(int *)(lVar11 + 0x2844);
              iVar20 = (int)lVar12;
              if (iVar9 <= iVar7) {
                if (iVar9 == 0) {
                  iVar9 = 8;
                }
                else {
                  iVar9 = iVar9 / 2 + iVar9;
                }
                if (iVar9 <= iVar20) {
                  iVar9 = iVar20;
                }
                uVar14 = (*_DAT_7ff70cbe9460)((longlong)iVar9 * 0x48,_DAT_7ff70cc1a3d0);
                lVar16 = _DAT_7ff70cc1a3c0;
                if (_DAT_7ff70cc1a3c0 != 0) {
                  piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                  lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar17 * 8) == *piVar2) {
                    sVar15 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar17 * 8) + 1;
                  }
                  else {
                    iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                    *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
                    lVar17 = (longlong)iVar21;
                    *(int *)(lVar16 + 0x2874 + lVar17 * 8) = *piVar2;
                    *(undefined4 *)(lVar16 + 0x2878 + lVar17 * 8) = 0;
                    sVar15 = 1;
                  }
                  *(short *)(lVar16 + 0x2878 + lVar17 * 8) = sVar15;
                  *(int *)(lVar16 + 0x2868) = *(int *)(lVar16 + 0x2868) + 1;
                }
                if (*(longlong *)(lVar11 + 0x2848) != 0) {
                  FUN_7ff70cb12b60(uVar14);
                  lVar17 = _DAT_7ff70cc1a3c0;
                  lVar16 = *(longlong *)(lVar11 + 0x2848);
                  if ((lVar16 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                    piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                    lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar2) {
                      sVar15 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar22 * 8) + 1;
                    }
                    else {
                      iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                      *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
                      lVar22 = (longlong)iVar21;
                      *(int *)(lVar17 + 0x2874 + lVar22 * 8) = *piVar2;
                      *(undefined4 *)(lVar17 + 0x2878 + lVar22 * 8) = 0;
                      sVar15 = 1;
                    }
                    *(short *)(lVar17 + 0x287a + lVar22 * 8) = sVar15;
                    *(int *)(lVar17 + 0x286c) = *(int *)(lVar17 + 0x286c) + 1;
                  }
                  (*_DAT_7ff70cbe9468)(lVar16,_DAT_7ff70cc1a3d0);
                }
                *(undefined8 *)(lVar11 + 0x2848) = uVar14;
                *(int *)(lVar11 + 0x2844) = iVar9;
              }
              iVar9 = *(int *)(lVar11 + 0x2840);
              lVar16 = (longlong)iVar9;
              if (iVar9 <= iVar7) {
                uVar10 = iVar20 - iVar9 & 3;
                lVar17 = lVar16;
                if (uVar10 != 0) {
                  lVar22 = lVar16 * 0x48;
                  lVar17 = 0;
                  do {
                    lVar5 = *(longlong *)(lVar11 + 0x2848);
                    puVar3 = (undefined8 *)(lVar5 + 0x30 + lVar22);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar5 + 0x20 + lVar22);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar5 + 0x10 + lVar22);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    *(undefined8 *)(lVar5 + lVar22) = 0;
                    ((undefined8 *)(lVar5 + lVar22))[1] = 0;
                    *(undefined8 *)(lVar5 + 0x40 + lVar22) = 0;
                    lVar17 = lVar17 + -1;
                    lVar22 = lVar22 + 0x48;
                  } while (-lVar17 != (ulonglong)uVar10);
                  lVar17 = lVar16 - lVar17;
                }
                if ((ulonglong)(lVar16 - lVar12) < 0xfffffffffffffffd) {
                  lVar16 = lVar17 * 0x48;
                  lVar12 = lVar12 - lVar17;
                  do {
                    lVar17 = *(longlong *)(lVar11 + 0x2848);
                    puVar3 = (undefined8 *)(lVar17 + 0x30 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0x20 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0x10 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    *(undefined8 *)(lVar17 + lVar16) = 0;
                    ((undefined8 *)(lVar17 + lVar16))[1] = 0;
                    *(undefined8 *)(lVar17 + 0x40 + lVar16) = 0;
                    lVar17 = *(longlong *)(lVar11 + 0x2848);
                    puVar3 = (undefined8 *)(lVar17 + 0x78 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0x68 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0x58 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0x48 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    *(undefined8 *)(lVar17 + 0x88 + lVar16) = 0;
                    lVar17 = *(longlong *)(lVar11 + 0x2848);
                    puVar3 = (undefined8 *)(lVar17 + 0xc0 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0xb0 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0xa0 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0x90 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    *(undefined8 *)(lVar17 + 0xd0 + lVar16) = 0;
                    lVar17 = *(longlong *)(lVar11 + 0x2848);
                    puVar3 = (undefined8 *)(lVar17 + 0x108 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0xf8 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0xe8 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    puVar3 = (undefined8 *)(lVar17 + 0xd8 + lVar16);
                    *puVar3 = 0;
                    puVar3[1] = 0;
                    *(undefined8 *)(lVar17 + 0x118 + lVar16) = 0;
                    lVar16 = lVar16 + 0x120;
                    lVar12 = lVar12 + -4;
                  } while (lVar12 != 0);
                }
              }
              *(int *)(lVar11 + 0x2840) = iVar20;
              uVar18 = (ulonglong)*(uint *)(lVar13 + 0x108);
              if (-1 < (int)*(uint *)(lVar13 + 0x108)) {
                lVar16 = 0;
                lVar12 = 0;
                do {
                  uVar10 = uVar8;
                  if (lVar12 < (int)uVar18) {
                    uVar10 = *(uint *)(*(longlong *)(lVar13 + 0x110) + lVar12 * 4);
                  }
                  *(uint *)(*(longlong *)(lVar11 + 0x2848) + lVar16) = uVar10;
                  uVar18 = (ulonglong)*(int *)(lVar13 + 0x108);
                  lVar16 = lVar16 + 0x48;
                  bVar6 = lVar12 < (longlong)uVar18;
                  lVar12 = lVar12 + 1;
                } while (bVar6);
              }
            }
            else if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2834) == *(int *)(lVar13 + 0x108)) {
              lVar13 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2848);
              FUN_7ff70c802a20(lVar13 + lVar12 * 0x48 + 0xc,0x39,&UNK_7ff70cb8235d,5,
                               &UNK_7ff70cb8a465);
              lVar13 = lVar13 + lVar12 * 0x48;
              *(undefined1 *)(lVar13 + 5) = 1;
              *(undefined1 *)(lVar13 + 8) = 0xb;
            }
          }
          *(uint *)((longlong)param_1 + 0x8c) = uVar8;
          lVar13 = _UNK_7ff70cb1d708;
          param_1[0x15] = _DAT_7ff70cb1d700;
          param_1[0x16] = lVar13;
          *(undefined2 *)((longlong)param_1 + 0xe4) = 0xffff;
          *(undefined4 *)(param_1 + 0x1d) = 0xffffffff;
          *(uint *)(param_1 + 0x1e) = (uint)*(byte *)((longlong)param_1 + 0xf3) << 0x18;
          lVar11 = _UNK_7ff70cb1d718;
          lVar13 = _DAT_7ff70cb1d710;
          *(longlong *)((longlong)param_1 + 0xf4) = _DAT_7ff70cb1d710;
          *(longlong *)((longlong)param_1 + 0xfc) = lVar11;
          param_1[0x51] = -0x407fffff00000001;
          param_1[0x58] = -0x100000000;
          param_1[0x57] = _DAT_7ff70cb1bb60;
          param_1[0x59] = (longlong)plVar1;
          param_1[0x75] = param_1[1];
          FUN_7ff70c7b5930(plVar1,*param_1 + 0x1148);
          param_1[0x83] = lVar13;
          param_1[0x84] = lVar11;
          return;
        }
        uVar8 = crc32(uVar8,cVar4);
        pcVar19 = pcVar19 + 1;
      } while( true );
    }
    uVar8 = crc32(uVar8,cVar4);
    pcVar19 = pcVar19 + 1;
  } while( true );
}


