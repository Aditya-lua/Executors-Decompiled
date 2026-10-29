/* 7ff70c8165d0 FUN_7ff70c8165d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8165d0(longlong *param_1,ulonglong param_2,longlong param_3)

{
  int *piVar1;
  undefined8 *puVar2;
  char cVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  code *pcVar7;
  uint uVar8;
  undefined8 uVar9;
  longlong lVar10;
  short sVar11;
  longlong lVar12;
  char *pcVar13;
  int iVar14;
  longlong lVar15;
  longlong lVar16;
  longlong lVar17;
  uint uVar18;
  ulonglong uVar19;
  int iVar20;
  int iVar21;
  bool bVar22;
  undefined1 auStack_68 [32];
  ulonglong uStack_48;
  ulonglong uStack_40;
  
  lVar12 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  lVar17 = param_3 - param_2;
  uVar18 = ~*(uint *)(param_1[0x22] + -4 + (longlong)(int)param_1[0x21] * 4);
  uVar8 = uVar18;
  if ((param_3 != 0) && (lVar17 != 0)) {
    uVar19 = ~param_2 + param_3;
    pcVar13 = (char *)(param_2 + 2);
    do {
      if (((1 < uVar19 && pcVar13[-2] == '#') && (pcVar13[-1] == '#')) && (*pcVar13 == '#')) {
        uVar8 = uVar18;
      }
      uVar8 = crc32(uVar8,pcVar13[-2]);
      pcVar13 = pcVar13 + 1;
      bVar22 = uVar19 != 0;
      uVar19 = uVar19 - 1;
    } while (bVar22);
LAB_7ff70c816698:
    uVar8 = ~uVar8;
    if (*(uint *)(*param_1 + 0x1498) == uVar8) {
      lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      iVar4 = *(int *)(_DAT_7ff70cc1a3c0 + 0x2834);
      if ((longlong)iVar4 == -1) {
        *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2834) = 0;
        iVar4 = *(int *)(lVar5 + 0x108);
        lVar17 = (longlong)iVar4 + 1;
        iVar21 = *(int *)(lVar12 + 0x2844);
        iVar20 = (int)lVar17;
        if (iVar21 <= iVar4) {
          if (iVar21 == 0) {
            iVar21 = 8;
          }
          else {
            iVar21 = iVar21 / 2 + iVar21;
          }
          if (iVar21 <= iVar20) {
            iVar21 = iVar20;
          }
          uVar9 = (*_DAT_7ff70cbe9460)((longlong)iVar21 * 0x48,_DAT_7ff70cc1a3d0);
          lVar10 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar1) {
              sVar11 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar15 * 8) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar15 = (longlong)iVar14;
              *(int *)(lVar10 + 0x2874 + lVar15 * 8) = *piVar1;
              *(undefined4 *)(lVar10 + 0x2878 + lVar15 * 8) = 0;
              sVar11 = 1;
            }
            *(short *)(lVar10 + 0x2878 + lVar15 * 8) = sVar11;
            *(int *)(lVar10 + 0x2868) = *(int *)(lVar10 + 0x2868) + 1;
          }
          if (*(longlong *)(lVar12 + 0x2848) != 0) {
            FUN_7ff70cb12b60(uVar9,*(longlong *)(lVar12 + 0x2848),
                             (longlong)*(int *)(lVar12 + 0x2840) * 0x48);
            lVar10 = _DAT_7ff70cc1a3c0;
            if ((*(longlong *)(lVar12 + 0x2848) != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar1) {
                sVar11 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar15 * 8) + 1;
              }
              else {
                iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
                lVar15 = (longlong)iVar14;
                *(int *)(lVar10 + 0x2874 + lVar15 * 8) = *piVar1;
                *(undefined4 *)(lVar10 + 0x2878 + lVar15 * 8) = 0;
                sVar11 = 1;
              }
              *(short *)(lVar10 + 0x287a + lVar15 * 8) = sVar11;
              *(int *)(lVar10 + 0x286c) = *(int *)(lVar10 + 0x286c) + 1;
            }
            (*_DAT_7ff70cbe9468)();
          }
          *(undefined8 *)(lVar12 + 0x2848) = uVar9;
          *(int *)(lVar12 + 0x2844) = iVar21;
        }
        iVar21 = *(int *)(lVar12 + 0x2840);
        lVar10 = (longlong)iVar21;
        if (iVar21 <= iVar4) {
          uVar18 = iVar20 - iVar21 & 3;
          lVar15 = lVar10;
          if (uVar18 != 0) {
            lVar16 = lVar10 * 0x48;
            lVar15 = 0;
            do {
              lVar6 = *(longlong *)(lVar12 + 0x2848);
              puVar2 = (undefined8 *)(lVar6 + 0x30 + lVar16);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar6 + 0x20 + lVar16);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar6 + 0x10 + lVar16);
              *puVar2 = 0;
              puVar2[1] = 0;
              *(undefined8 *)(lVar6 + lVar16) = 0;
              ((undefined8 *)(lVar6 + lVar16))[1] = 0;
              *(undefined8 *)(lVar6 + 0x40 + lVar16) = 0;
              lVar15 = lVar15 + -1;
              lVar16 = lVar16 + 0x48;
            } while (-lVar15 != (ulonglong)uVar18);
            lVar15 = lVar10 - lVar15;
          }
          if ((ulonglong)(lVar10 - lVar17) < 0xfffffffffffffffd) {
            lVar10 = lVar15 * 0x48;
            lVar17 = lVar17 - lVar15;
            do {
              lVar15 = *(longlong *)(lVar12 + 0x2848);
              puVar2 = (undefined8 *)(lVar15 + 0x30 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0x20 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0x10 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              *(undefined8 *)(lVar15 + lVar10) = 0;
              ((undefined8 *)(lVar15 + lVar10))[1] = 0;
              *(undefined8 *)(lVar15 + 0x40 + lVar10) = 0;
              lVar15 = *(longlong *)(lVar12 + 0x2848);
              puVar2 = (undefined8 *)(lVar15 + 0x78 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0x68 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0x58 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0x48 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              *(undefined8 *)(lVar15 + 0x88 + lVar10) = 0;
              lVar15 = *(longlong *)(lVar12 + 0x2848);
              puVar2 = (undefined8 *)(lVar15 + 0xc0 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0xb0 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0xa0 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0x90 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              *(undefined8 *)(lVar15 + 0xd0 + lVar10) = 0;
              lVar15 = *(longlong *)(lVar12 + 0x2848);
              puVar2 = (undefined8 *)(lVar15 + 0x108 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0xf8 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0xe8 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              puVar2 = (undefined8 *)(lVar15 + 0xd8 + lVar10);
              *puVar2 = 0;
              puVar2[1] = 0;
              *(undefined8 *)(lVar15 + 0x118 + lVar10) = 0;
              lVar10 = lVar10 + 0x120;
              lVar17 = lVar17 + -4;
            } while (lVar17 != 0);
          }
        }
        *(int *)(lVar12 + 0x2840) = iVar20;
        uVar19 = (ulonglong)*(uint *)(lVar5 + 0x108);
        if (-1 < (int)*(uint *)(lVar5 + 0x108)) {
          lVar10 = 0;
          lVar17 = 0;
          do {
            uVar18 = uVar8;
            if (lVar17 < (int)uVar19) {
              uVar18 = *(uint *)(*(longlong *)(lVar5 + 0x110) + lVar17 * 4);
            }
            *(uint *)(*(longlong *)(lVar12 + 0x2848) + lVar10) = uVar18;
            uVar19 = (ulonglong)*(int *)(lVar5 + 0x108);
            lVar10 = lVar10 + 0x48;
            bVar22 = lVar17 < (longlong)uVar19;
            lVar17 = lVar17 + 1;
          } while (bVar22);
        }
      }
      else if (iVar4 == *(int *)(lVar5 + 0x108)) {
        lVar12 = (longlong)iVar4 * 0x48 + *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2848);
        if (param_3 == 0) {
          lVar17 = FUN_7ff70cb12e80(param_2);
        }
        uStack_48 = param_2;
        FUN_7ff70c802a20(lVar12 + 0xc,0x39,&UNK_7ff70cb8235d,lVar17);
        *(undefined1 *)(lVar12 + 5) = 1;
        *(undefined1 *)(lVar12 + 8) = 0xb;
      }
    }
    if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
      FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
      pcVar7 = (code *)swi(3);
      uVar19 = (*pcVar7)();
      return uVar19;
    }
    return (ulonglong)uVar8;
  }
  pcVar13 = (char *)(param_2 + 2);
  do {
    cVar3 = pcVar13[-2];
    if (cVar3 == '#') {
      if ((pcVar13[-1] == '#') && (*pcVar13 == '#')) {
        uVar8 = uVar18;
      }
    }
    else if (cVar3 == '\0') goto LAB_7ff70c816698;
    uVar8 = crc32(uVar8,cVar3);
    pcVar13 = pcVar13 + 1;
  } while( true );
}


