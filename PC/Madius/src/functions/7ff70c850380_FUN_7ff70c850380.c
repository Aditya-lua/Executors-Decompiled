/* 7ff70c850380 FUN_7ff70c850380 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c850380(void)

{
  int *piVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  undefined8 uVar5;
  short sVar6;
  longlong lVar7;
  uint uVar8;
  longlong lVar9;
  longlong lVar10;
  int iVar11;
  ulonglong uVar12;
  int iVar13;
  longlong lVar14;
  longlong lVar15;
  ulonglong uVar16;
  bool bVar17;
  undefined1 auStack_68 [40];
  ulonglong uStack_40;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  iVar11 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f60);
  if ((0 < iVar11) && (iVar11 <= *(int *)(_DAT_7ff70cc1a3c0 + 0x1f50))) {
    uVar8 = iVar11 - 1;
    lVar10 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58);
    if (*(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f68) + (ulonglong)uVar8 * 0x38) ==
        *(int *)(lVar10 + (ulonglong)uVar8 * 0x38)) {
      uVar16 = (ulonglong)uVar8;
      while (uVar12 = uVar16, 0 < (int)uVar12) {
        lVar15 = *(longlong *)(lVar10 + 8 + uVar12 * 0x38);
        if ((lVar15 == 0) || ((*(byte *)(lVar15 + 0x17) & 0x10) == 0)) goto LAB_7ff70c850428;
        uVar16 = (ulonglong)((int)uVar12 - 1);
        lVar15 = *(longlong *)(lVar10 + 8 + uVar16 * 0x38);
        if ((lVar15 == 0) || ((*(byte *)(lVar15 + 0x15) & 4) != 0)) goto LAB_7ff70c850428;
      }
      uVar12 = 0;
LAB_7ff70c850428:
      iVar11 = (int)uVar12;
      lVar10 = _DAT_7ff70cc1a3c0;
      if (((((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0) &&
           (FUN_7ff70c800cf0(&UNK_7ff70cb913cc,uVar8,uVar12), lVar10 = _DAT_7ff70cc1a3c0,
           (*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0)) &&
          (FUN_7ff70c800cf0(&UNK_7ff70cb912ce,uVar12,1), (*(byte *)(lVar10 + 0x27b4) & 8) != 0)) &&
         (iVar13 = *(int *)(lVar10 + 0x1f50), iVar11 < iVar13)) {
        lVar15 = uVar12 * 0x38 + 8;
        uVar16 = uVar12;
        do {
          if ((*(byte *)(lVar10 + 0x27b4) & 8) != 0) {
            lVar7 = *(longlong *)(*(longlong *)(lVar10 + 0x1f58) + lVar15);
            if (lVar7 == 0) {
              uVar5 = 0;
            }
            else {
              uVar5 = *(undefined8 *)(lVar7 + 8);
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb91e00,
                             *(undefined4 *)(*(longlong *)(lVar10 + 0x1f58) + -8 + lVar15),uVar5);
            iVar13 = *(int *)(lVar10 + 0x1f50);
          }
          uVar16 = uVar16 + 1;
          lVar15 = lVar15 + 0x38;
        } while ((longlong)uVar16 < (longlong)iVar13);
      }
      lVar15 = *(longlong *)(*(longlong *)(lVar10 + 0x1f58) + 8 + uVar12 * 0x38);
      lVar7 = *(longlong *)(*(longlong *)(lVar10 + 0x1f58) + 0x10 + uVar12 * 0x38);
      iVar13 = *(int *)(lVar10 + 0x1f54);
      if (iVar13 < iVar11) {
        if (iVar13 == 0) {
          uVar8 = 8;
        }
        else {
          uVar8 = iVar13 / 2 + iVar13;
        }
        uVar16 = (ulonglong)uVar8;
        if ((int)uVar8 <= iVar11) {
          uVar16 = uVar12;
        }
        uVar5 = (*_DAT_7ff70cbe9460)(uVar16 * 0x38,_DAT_7ff70cc1a3d0);
        lVar2 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
            sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar9 * 8) + 1;
          }
          else {
            iVar13 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar13;
            lVar9 = (longlong)iVar13;
            *(int *)(lVar2 + 0x2874 + lVar9 * 8) = *piVar1;
            *(undefined4 *)(lVar2 + 0x2878 + lVar9 * 8) = 0;
            sVar6 = 1;
          }
          *(short *)(lVar2 + 0x2878 + lVar9 * 8) = sVar6;
          *(int *)(lVar2 + 0x2868) = *(int *)(lVar2 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar10 + 0x1f58) != 0) {
          FUN_7ff70cb12b60(uVar5,*(longlong *)(lVar10 + 0x1f58),
                           (longlong)*(int *)(lVar10 + 0x1f50) * 0x38);
          lVar9 = _DAT_7ff70cc1a3c0;
          lVar2 = *(longlong *)(lVar10 + 0x1f58);
          if ((lVar2 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar1) {
              sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar14 * 8) + 1;
            }
            else {
              iVar13 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar13;
              lVar14 = (longlong)iVar13;
              *(int *)(lVar9 + 0x2874 + lVar14 * 8) = *piVar1;
              *(undefined4 *)(lVar9 + 0x2878 + lVar14 * 8) = 0;
              sVar6 = 1;
            }
            *(short *)(lVar9 + 0x287a + lVar14 * 8) = sVar6;
            *(int *)(lVar9 + 0x286c) = *(int *)(lVar9 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar2,_DAT_7ff70cc1a3d0);
        }
        *(undefined8 *)(lVar10 + 0x1f58) = uVar5;
        *(int *)(lVar10 + 0x1f54) = (int)uVar16;
      }
      *(int *)(lVar10 + 0x1f50) = iVar11;
      if (lVar15 != 0) {
        if ((*(uint *)(lVar15 + 0x14) & 0x10000000) != 0) {
          lVar7 = *(longlong *)(lVar15 + 0x3b0);
        }
        if (lVar7 == 0) {
          bVar17 = *(int *)(lVar10 + 0x1fa4) == 0;
          lVar7 = 0;
        }
        else if (*(char *)(lVar7 + 0xcd) == '\x01') {
          bVar17 = *(int *)(lVar10 + 0x1fa4) == 0;
        }
        else {
          iVar11 = -1;
          if ((*(uint *)(lVar15 + 0x14) & 0x1000000) != 0) {
            do {
              lVar15 = *(longlong *)(lVar15 + 0x3b0);
            } while ((*(byte *)(lVar15 + 0x17) & 1) != 0);
            iVar11 = 0;
          }
          uVar8 = *(short *)(lVar15 + 0xe2) + iVar11;
          if (-1 < (int)uVar8) {
            lVar10 = (ulonglong)uVar8 + 1;
            do {
              lVar7 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + -8 + lVar10 * 8);
              if (((lVar7 != 0) && (*(char *)(lVar7 + 0xcd) == '\x01')) &&
                 ((~*(uint *)(lVar7 + 0x14) & 0x10200) != 0)) goto LAB_7ff70c85076c;
              lVar15 = lVar10 + -1;
              bVar17 = 0 < lVar10;
              lVar10 = lVar15;
            } while (lVar15 != 0 && bVar17);
          }
          lVar7 = 0;
LAB_7ff70c85076c:
          bVar17 = true;
        }
        FUN_7ff70c819c70(lVar7,bVar17);
      }
      if (*(longlong *)(lVar4 + 0x1f98) != 0) {
        *(undefined1 *)(*(longlong *)(lVar4 + 0x1f98) + 0x179) = 1;
      }
    }
  }
  if (_DAT_7ff70cbebd80 != (uStack_40 ^ (ulonglong)auStack_68)) {
    FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


