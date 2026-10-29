/* 7ff70c841a90 FUN_7ff70c841a90 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c841a90(longlong param_1)

{
  int *piVar1;
  undefined8 *puVar2;
  char cVar3;
  longlong *plVar4;
  longlong lVar5;
  bool bVar6;
  code *pcVar7;
  undefined4 uVar8;
  undefined8 uVar9;
  ulonglong uVar10;
  longlong lVar11;
  short sVar12;
  uint uVar13;
  int iVar14;
  longlong lVar15;
  longlong lVar16;
  longlong lVar17;
  uint uVar18;
  uint uVar19;
  int iVar20;
  int iVar21;
  longlong lVar22;
  char *pcVar23;
  int iVar24;
  undefined1 auStack_68 [32];
  longlong lStack_48;
  ulonglong uStack_40;
  
  lVar11 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  plVar4 = *(longlong **)(_DAT_7ff70cc1a3c0 + 0x1440);
  uVar13 = *(uint *)(plVar4 + 0x21);
  uVar10 = (ulonglong)uVar13;
  lVar15 = (longlong)(int)uVar13;
  uVar19 = ~*(uint *)(plVar4[0x22] + -4 + lVar15 * 4);
  pcVar23 = (char *)(param_1 + 2);
  uVar18 = uVar19;
  do {
    cVar3 = pcVar23[-2];
    if (cVar3 == '#') {
      if ((pcVar23[-1] == '#') && (*pcVar23 == '#')) {
        uVar18 = uVar19;
      }
    }
    else if (cVar3 == '\0') {
      uVar18 = ~uVar18;
      if (*(uint *)(*plVar4 + 0x1498) == uVar18) {
        if (*(uint *)(_DAT_7ff70cc1a3c0 + 0x2834) == 0xffffffff) {
          *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2834) = 0;
          iVar21 = (int)plVar4[0x21];
          lVar15 = (longlong)iVar21 + 1;
          iVar14 = *(int *)(lVar11 + 0x2844);
          iVar24 = (int)lVar15;
          if (iVar14 <= iVar21) {
            if (iVar14 == 0) {
              iVar14 = 8;
            }
            else {
              iVar14 = iVar14 / 2 + iVar14;
            }
            if (iVar14 <= iVar24) {
              iVar14 = iVar24;
            }
            uVar9 = (*_DAT_7ff70cbe9460)((longlong)iVar14 * 0x48,_DAT_7ff70cc1a3d0);
            lVar17 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar1) {
                sVar12 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar22 * 8) + 1;
              }
              else {
                iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
                lVar22 = (longlong)iVar20;
                *(int *)(lVar17 + 0x2874 + lVar22 * 8) = *piVar1;
                *(undefined4 *)(lVar17 + 0x2878 + lVar22 * 8) = 0;
                sVar12 = 1;
              }
              *(short *)(lVar17 + 0x2878 + lVar22 * 8) = sVar12;
              *(int *)(lVar17 + 0x2868) = *(int *)(lVar17 + 0x2868) + 1;
            }
            if (*(longlong *)(lVar11 + 0x2848) != 0) {
              FUN_7ff70cb12b60(uVar9);
              lVar17 = _DAT_7ff70cc1a3c0;
              if ((*(longlong *)(lVar11 + 0x2848) != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar1) {
                  sVar12 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar22 * 8) + 1;
                }
                else {
                  iVar20 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar20;
                  lVar22 = (longlong)iVar20;
                  *(int *)(lVar17 + 0x2874 + lVar22 * 8) = *piVar1;
                  *(undefined4 *)(lVar17 + 0x2878 + lVar22 * 8) = 0;
                  sVar12 = 1;
                }
                *(short *)(lVar17 + 0x287a + lVar22 * 8) = sVar12;
                *(int *)(lVar17 + 0x286c) = *(int *)(lVar17 + 0x286c) + 1;
              }
              (*_DAT_7ff70cbe9468)();
            }
            *(undefined8 *)(lVar11 + 0x2848) = uVar9;
            *(int *)(lVar11 + 0x2844) = iVar14;
          }
          iVar14 = *(int *)(lVar11 + 0x2840);
          lVar17 = (longlong)iVar14;
          if (iVar14 <= iVar21) {
            uVar13 = iVar24 - iVar14 & 3;
            lVar22 = lVar17;
            if (uVar13 != 0) {
              lVar16 = lVar17 * 0x48;
              lVar22 = 0;
              do {
                lVar5 = *(longlong *)(lVar11 + 0x2848);
                puVar2 = (undefined8 *)(lVar5 + 0x30 + lVar16);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar5 + 0x20 + lVar16);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar5 + 0x10 + lVar16);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar5 + lVar16) = 0;
                ((undefined8 *)(lVar5 + lVar16))[1] = 0;
                *(undefined8 *)(lVar5 + 0x40 + lVar16) = 0;
                lVar22 = lVar22 + -1;
                lVar16 = lVar16 + 0x48;
              } while (-lVar22 != (ulonglong)uVar13);
              lVar22 = lVar17 - lVar22;
            }
            if ((ulonglong)(lVar17 - lVar15) < 0xfffffffffffffffd) {
              lVar17 = lVar22 * 0x48;
              lVar15 = lVar15 - lVar22;
              do {
                lVar22 = *(longlong *)(lVar11 + 0x2848);
                puVar2 = (undefined8 *)(lVar22 + 0x30 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0x20 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0x10 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar22 + lVar17) = 0;
                ((undefined8 *)(lVar22 + lVar17))[1] = 0;
                *(undefined8 *)(lVar22 + 0x40 + lVar17) = 0;
                lVar22 = *(longlong *)(lVar11 + 0x2848);
                puVar2 = (undefined8 *)(lVar22 + 0x78 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0x68 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0x58 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0x48 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar22 + 0x88 + lVar17) = 0;
                lVar22 = *(longlong *)(lVar11 + 0x2848);
                puVar2 = (undefined8 *)(lVar22 + 0xc0 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0xb0 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0xa0 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0x90 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar22 + 0xd0 + lVar17) = 0;
                lVar22 = *(longlong *)(lVar11 + 0x2848);
                puVar2 = (undefined8 *)(lVar22 + 0x108 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0xf8 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0xe8 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar22 + 0xd8 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar22 + 0x118 + lVar17) = 0;
                lVar17 = lVar17 + 0x120;
                lVar15 = lVar15 + -4;
              } while (lVar15 != 0);
            }
          }
          *(int *)(lVar11 + 0x2840) = iVar24;
          uVar10 = (ulonglong)*(uint *)(plVar4 + 0x21);
          if (-1 < (int)*(uint *)(plVar4 + 0x21)) {
            lVar17 = 0;
            lVar15 = 0;
            do {
              uVar13 = uVar18;
              if (lVar15 < (int)uVar10) {
                uVar13 = *(uint *)(plVar4[0x22] + lVar15 * 4);
              }
              *(uint *)(*(longlong *)(lVar11 + 0x2848) + lVar17) = uVar13;
              uVar10 = (ulonglong)(int)plVar4[0x21];
              lVar17 = lVar17 + 0x48;
              bVar6 = lVar15 < (longlong)uVar10;
              lVar15 = lVar15 + 1;
            } while (bVar6);
          }
        }
        else if (*(uint *)(_DAT_7ff70cc1a3c0 + 0x2834) == uVar13) {
          lVar11 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2848);
          uVar8 = FUN_7ff70cb12e80();
          lStack_48 = param_1;
          FUN_7ff70c802a20(lVar11 + lVar15 * 0x48 + 0xc,0x39,&UNK_7ff70cb8235d,uVar8);
          *(undefined1 *)(lVar11 + 5 + lVar15 * 0x48) = 1;
          *(undefined1 *)(lVar11 + 8 + lVar15 * 0x48) = 0xb;
          uVar10 = (ulonglong)*(uint *)(plVar4 + 0x21);
        }
      }
      iVar21 = (int)uVar10;
      if (iVar21 == *(int *)((longlong)plVar4 + 0x10c)) {
        if (iVar21 == 0) {
          iVar14 = 8;
        }
        else {
          iVar14 = ((int)(((uint)(uVar10 >> 0x1f) & 1) + iVar21) >> 1) + iVar21;
        }
        iVar24 = iVar21 + 1;
        if (iVar21 + 1 < iVar14) {
          iVar24 = iVar14;
        }
        lVar11 = (*_DAT_7ff70cbe9460)((longlong)iVar24 << 2,_DAT_7ff70cc1a3d0);
        lVar15 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar17 * 8) == *piVar1) {
            sVar12 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar17 * 8) + 1;
          }
          else {
            iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
            lVar17 = (longlong)iVar21;
            *(int *)(lVar15 + 0x2874 + lVar17 * 8) = *piVar1;
            *(undefined4 *)(lVar15 + 0x2878 + lVar17 * 8) = 0;
            sVar12 = 1;
          }
          *(short *)(lVar15 + 0x2878 + lVar17 * 8) = sVar12;
          *(int *)(lVar15 + 0x2868) = *(int *)(lVar15 + 0x2868) + 1;
        }
        if (plVar4[0x22] != 0) {
          FUN_7ff70cb12b60(lVar11,plVar4[0x22],(longlong)(int)plVar4[0x21] << 2);
          lVar17 = _DAT_7ff70cc1a3c0;
          lVar15 = plVar4[0x22];
          if ((lVar15 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar1) {
              sVar12 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar22 * 8) + 1;
            }
            else {
              iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
              lVar22 = (longlong)iVar21;
              *(int *)(lVar17 + 0x2874 + lVar22 * 8) = *piVar1;
              *(undefined4 *)(lVar17 + 0x2878 + lVar22 * 8) = 0;
              sVar12 = 1;
            }
            *(short *)(lVar17 + 0x287a + lVar22 * 8) = sVar12;
            *(int *)(lVar17 + 0x286c) = *(int *)(lVar17 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar15,_DAT_7ff70cc1a3d0);
        }
        plVar4[0x22] = lVar11;
        *(int *)((longlong)plVar4 + 0x10c) = iVar24;
        iVar21 = (int)plVar4[0x21];
      }
      else {
        lVar11 = plVar4[0x22];
      }
      *(uint *)(lVar11 + (longlong)iVar21 * 4) = uVar18;
      *(int *)(plVar4 + 0x21) = (int)plVar4[0x21] + 1;
      if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
        FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
        pcVar7 = (code *)swi(3);
        (*pcVar7)();
        return;
      }
      return;
    }
    uVar18 = crc32(uVar18,cVar3);
    pcVar23 = pcVar23 + 1;
  } while( true );
}


