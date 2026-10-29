/* 7ff70c8355a0 FUN_7ff70c8355a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8355a0(longlong param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  int *piVar1;
  undefined8 *puVar2;
  char cVar3;
  longlong *plVar4;
  longlong lVar5;
  longlong lVar6;
  bool bVar7;
  code *pcVar8;
  undefined4 uVar9;
  longlong lVar10;
  undefined8 uVar11;
  longlong lVar12;
  uint uVar13;
  short sVar14;
  uint uVar15;
  int iVar16;
  longlong lVar17;
  char *pcVar18;
  longlong lVar19;
  ulonglong uVar20;
  int iVar21;
  int iVar22;
  undefined1 auStack_88 [32];
  longlong lStack_68;
  uint uStack_5c;
  undefined4 uStack_58;
  int iStack_54;
  longlong lStack_50;
  ulonglong uStack_48;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  plVar4 = *(longlong **)(lVar5 + 0x1440);
  lVar10 = (longlong)(int)plVar4[0x21];
  uVar15 = ~*(uint *)(plVar4[0x22] + -4 + lVar10 * 4);
  pcVar18 = (char *)(param_1 + 2);
  uVar13 = uVar15;
  do {
    cVar3 = pcVar18[-2];
    if (cVar3 == '#') {
      if ((pcVar18[-1] == '#') && (*pcVar18 == '#')) {
        uVar13 = uVar15;
      }
    }
    else if (cVar3 == '\0') {
      uVar13 = ~uVar13;
      if (*(uint *)(*plVar4 + 0x1498) == uVar13) {
        if (*(int *)(lVar5 + 0x2834) == -1) {
          *(undefined4 *)(lVar5 + 0x2834) = 0;
          iVar16 = (int)plVar4[0x21];
          lVar10 = (longlong)iVar16 + 1;
          iVar22 = *(int *)(lVar5 + 0x2844);
          iVar21 = (int)lVar10;
          if (iVar22 <= iVar16) {
            if (iVar22 == 0) {
              iVar22 = 8;
            }
            else {
              iVar22 = iVar22 / 2 + iVar22;
            }
            if (iVar22 <= iVar21) {
              iVar22 = iVar21;
            }
            uStack_5c = uVar13;
            iStack_54 = iVar16;
            lStack_50 = param_1;
            uVar11 = (*_DAT_7ff70cbe9460)((longlong)iVar22 * 0x48,_DAT_7ff70cc1a3d0);
            lVar12 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar19 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar19 * 8) == *piVar1) {
                sVar14 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar19 * 8) + 1;
              }
              else {
                iVar16 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar16;
                lVar19 = (longlong)iVar16;
                *(int *)(lVar12 + 0x2874 + lVar19 * 8) = *piVar1;
                *(undefined4 *)(lVar12 + 0x2878 + lVar19 * 8) = 0;
                sVar14 = 1;
              }
              *(short *)(lVar12 + 0x2878 + lVar19 * 8) = sVar14;
              *(int *)(lVar12 + 0x2868) = *(int *)(lVar12 + 0x2868) + 1;
            }
            if (*(longlong *)(lVar5 + 0x2848) != 0) {
              uStack_58 = param_4;
              FUN_7ff70cb12b60(uVar11,*(longlong *)(lVar5 + 0x2848),
                               (longlong)*(int *)(lVar5 + 0x2840) * 0x48);
              lVar19 = _DAT_7ff70cc1a3c0;
              lVar12 = *(longlong *)(lVar5 + 0x2848);
              if ((lVar12 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar17 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar17 * 8) == *piVar1) {
                  sVar14 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar17 * 8) + 1;
                }
                else {
                  iVar16 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar16;
                  lVar17 = (longlong)iVar16;
                  *(int *)(lVar19 + 0x2874 + lVar17 * 8) = *piVar1;
                  *(undefined4 *)(lVar19 + 0x2878 + lVar17 * 8) = 0;
                  sVar14 = 1;
                }
                *(short *)(lVar19 + 0x287a + lVar17 * 8) = sVar14;
                *(int *)(lVar19 + 0x286c) = *(int *)(lVar19 + 0x286c) + 1;
              }
              (*_DAT_7ff70cbe9468)(lVar12,_DAT_7ff70cc1a3d0);
              param_4 = uStack_58;
            }
            *(undefined8 *)(lVar5 + 0x2848) = uVar11;
            *(int *)(lVar5 + 0x2844) = iVar22;
            param_1 = lStack_50;
            iVar16 = iStack_54;
            uVar13 = uStack_5c;
          }
          iVar22 = *(int *)(lVar5 + 0x2840);
          lVar12 = (longlong)iVar22;
          if (iVar22 <= iVar16) {
            uVar15 = iVar21 - iVar22 & 3;
            lVar19 = lVar12;
            if (uVar15 != 0) {
              lVar17 = lVar12 * 0x48;
              lVar19 = 0;
              do {
                lVar6 = *(longlong *)(lVar5 + 0x2848);
                puVar2 = (undefined8 *)(lVar6 + 0x30 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar6 + 0x20 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar6 + 0x10 + lVar17);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar6 + lVar17) = 0;
                ((undefined8 *)(lVar6 + lVar17))[1] = 0;
                *(undefined8 *)(lVar6 + 0x40 + lVar17) = 0;
                lVar19 = lVar19 + -1;
                lVar17 = lVar17 + 0x48;
              } while (-lVar19 != (ulonglong)uVar15);
              lVar19 = lVar12 - lVar19;
            }
            if ((ulonglong)(lVar12 - lVar10) < 0xfffffffffffffffd) {
              lVar12 = lVar19 * 0x48;
              lVar10 = lVar10 - lVar19;
              do {
                lVar19 = *(longlong *)(lVar5 + 0x2848);
                puVar2 = (undefined8 *)(lVar19 + 0x30 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0x20 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0x10 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar19 + lVar12) = 0;
                ((undefined8 *)(lVar19 + lVar12))[1] = 0;
                *(undefined8 *)(lVar19 + 0x40 + lVar12) = 0;
                lVar19 = *(longlong *)(lVar5 + 0x2848);
                puVar2 = (undefined8 *)(lVar19 + 0x78 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0x68 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0x58 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0x48 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar19 + 0x88 + lVar12) = 0;
                lVar19 = *(longlong *)(lVar5 + 0x2848);
                puVar2 = (undefined8 *)(lVar19 + 0xc0 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0xb0 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0xa0 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0x90 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar19 + 0xd0 + lVar12) = 0;
                lVar19 = *(longlong *)(lVar5 + 0x2848);
                puVar2 = (undefined8 *)(lVar19 + 0x108 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0xf8 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0xe8 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                puVar2 = (undefined8 *)(lVar19 + 0xd8 + lVar12);
                *puVar2 = 0;
                puVar2[1] = 0;
                *(undefined8 *)(lVar19 + 0x118 + lVar12) = 0;
                lVar12 = lVar12 + 0x120;
                lVar10 = lVar10 + -4;
              } while (lVar10 != 0);
            }
          }
          *(int *)(lVar5 + 0x2840) = iVar21;
          uVar20 = (ulonglong)*(uint *)(plVar4 + 0x21);
          if (-1 < (int)*(uint *)(plVar4 + 0x21)) {
            lVar12 = 0;
            lVar10 = 0;
            do {
              uVar15 = uVar13;
              if (lVar10 < (int)uVar20) {
                uVar15 = *(uint *)(plVar4[0x22] + lVar10 * 4);
              }
              *(uint *)(*(longlong *)(lVar5 + 0x2848) + lVar12) = uVar15;
              uVar20 = (ulonglong)(int)plVar4[0x21];
              lVar12 = lVar12 + 0x48;
              bVar7 = lVar10 < (longlong)uVar20;
              lVar10 = lVar10 + 1;
            } while (bVar7);
          }
        }
        else if (*(int *)(lVar5 + 0x2834) == (int)plVar4[0x21]) {
          lVar5 = *(longlong *)(lVar5 + 0x2848);
          uVar9 = FUN_7ff70cb12e80();
          lStack_68 = param_1;
          FUN_7ff70c802a20(lVar5 + lVar10 * 0x48 + 0xc,0x39,&UNK_7ff70cb8235d,uVar9);
          *(undefined1 *)(lVar5 + 5 + lVar10 * 0x48) = 1;
          *(undefined1 *)(lVar5 + 8 + lVar10 * 0x48) = 0xb;
        }
      }
      lStack_68 = CONCAT44(lStack_68._4_4_,param_4);
      FUN_7ff70c835ab0(param_1,uVar13,param_2,param_3);
      if (_DAT_7ff70cbebd80 != (uStack_48 ^ (ulonglong)auStack_88)) {
        FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_88);
        pcVar8 = (code *)swi(3);
        (*pcVar8)();
        return;
      }
      return;
    }
    uVar13 = crc32(uVar13,cVar3);
    pcVar18 = pcVar18 + 1;
  } while( true );
}


