/* 7ff70c86f190 FUN_7ff70c86f190 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c86f190(undefined8 param_1,undefined8 param_2)

{
  int *piVar1;
  code *pcVar2;
  longlong lVar3;
  int iVar4;
  longlong lVar5;
  short sVar6;
  longlong lVar7;
  longlong lVar8;
  longlong lVar9;
  int iVar10;
  int iVar11;
  ulonglong uVar12;
  longlong lVar13;
  longlong lVar14;
  ulonglong uVar15;
  int iVar16;
  undefined1 auStack_78 [40];
  longlong lStack_50;
  ulonglong uStack_48;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  iVar16 = *(int *)(_DAT_7ff70cc1a3c0 + 0x27b8) + -1 +
           (uint)(*(int *)(_DAT_7ff70cc1a3c0 + 0x27b8) == 0);
  lVar14 = _DAT_7ff70cc1a3c0 + 0x27b8;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x13a8) == '\0') {
    FUN_7ff70c8074e0(lVar14,&UNK_7ff70cb909d6,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 5000));
  }
  else {
    FUN_7ff70c8074e0(lVar14,&UNK_7ff70cb909d1,_DAT_7ff70cc1a3c0 + 0x13a8);
  }
  FUN_7ff70c807540(lVar14,param_1,param_2);
  iVar11 = *(int *)(lVar3 + 0x27b8) + -1 + (uint)(*(int *)(lVar3 + 0x27b8) == 0);
  lVar14 = *(longlong *)(lVar3 + 0x27c0);
  if (lVar14 == 0) {
    lVar14 = 0x7ff70cc1a3c8;
  }
  lVar7 = (longlong)iVar16;
  if (iVar16 != iVar11) {
    iVar16 = *(int *)(lVar3 + 0x27d8);
    if (((longlong)iVar16 == 0) || (*(char *)(lVar14 + -1 + (longlong)iVar16) == '\n')) {
      iVar4 = *(int *)(lVar3 + 0x27c8);
      if (iVar4 == *(int *)(lVar3 + 0x27cc)) {
        if (iVar4 == 0) {
          iVar16 = 8;
        }
        else {
          iVar16 = iVar4 / 2 + iVar4;
        }
        iVar10 = iVar4 + 1;
        if (iVar4 + 1 < iVar16) {
          iVar10 = iVar16;
        }
        lVar5 = (*_DAT_7ff70cbe9460)((longlong)iVar10 << 2,_DAT_7ff70cc1a3d0);
        lVar9 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
            sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar8 * 8) + 1;
          }
          else {
            iVar16 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar16;
            lVar8 = (longlong)iVar16;
            *(int *)(lVar9 + 0x2874 + lVar8 * 8) = *piVar1;
            *(undefined4 *)(lVar9 + 0x2878 + lVar8 * 8) = 0;
            sVar6 = 1;
          }
          *(short *)(lVar9 + 0x2878 + lVar8 * 8) = sVar6;
          *(int *)(lVar9 + 0x2868) = *(int *)(lVar9 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar3 + 0x27d0) != 0) {
          FUN_7ff70cb12b60(lVar5,*(longlong *)(lVar3 + 0x27d0),
                           (longlong)*(int *)(lVar3 + 0x27c8) << 2);
          lVar8 = _DAT_7ff70cc1a3c0;
          lVar9 = *(longlong *)(lVar3 + 0x27d0);
          if ((lVar9 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar1) {
              sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar13 * 8) + 1;
            }
            else {
              iVar16 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar16;
              lVar13 = (longlong)iVar16;
              *(int *)(lVar8 + 0x2874 + lVar13 * 8) = *piVar1;
              *(undefined4 *)(lVar8 + 0x2878 + lVar13 * 8) = 0;
              sVar6 = 1;
            }
            *(short *)(lVar8 + 0x287a + lVar13 * 8) = sVar6;
            *(int *)(lVar8 + 0x286c) = *(int *)(lVar8 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar9,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar3 + 0x27d0) = lVar5;
        *(int *)(lVar3 + 0x27cc) = iVar10;
        iVar4 = *(int *)(lVar3 + 0x27c8);
        iVar16 = *(int *)(lVar3 + 0x27d8);
      }
      else {
        lVar5 = *(longlong *)(lVar3 + 0x27d0);
      }
      *(int *)(lVar5 + (longlong)iVar4 * 4) = iVar16;
      *(int *)(lVar3 + 0x27c8) = *(int *)(lVar3 + 0x27c8) + 1;
    }
    lStack_50 = lVar7;
    lVar7 = FUN_7ff70cb12b40(lVar14 + lVar7,10,iVar11 - lVar7);
    if (lVar7 != 0) {
      uVar15 = iVar11 + lVar14;
      do {
        uVar12 = lVar7 + 1;
        if (uVar12 < uVar15) {
          iVar16 = *(int *)(lVar3 + 0x27c8);
          if (iVar16 == *(int *)(lVar3 + 0x27cc)) {
            if (iVar16 == 0) {
              iVar4 = 8;
            }
            else {
              iVar4 = iVar16 / 2 + iVar16;
            }
            iVar10 = iVar16 + 1;
            if (iVar16 + 1 < iVar4) {
              iVar10 = iVar4;
            }
            lVar7 = (*_DAT_7ff70cbe9460)((longlong)iVar10 << 2,_DAT_7ff70cc1a3d0);
            lVar5 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
                sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar9 * 8) + 1;
              }
              else {
                iVar16 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar16;
                lVar9 = (longlong)iVar16;
                *(int *)(lVar5 + 0x2874 + lVar9 * 8) = *piVar1;
                *(undefined4 *)(lVar5 + 0x2878 + lVar9 * 8) = 0;
                sVar6 = 1;
              }
              *(short *)(lVar5 + 0x2878 + lVar9 * 8) = sVar6;
              *(int *)(lVar5 + 0x2868) = *(int *)(lVar5 + 0x2868) + 1;
            }
            if (*(longlong *)(lVar3 + 0x27d0) != 0) {
              FUN_7ff70cb12b60(lVar7,*(longlong *)(lVar3 + 0x27d0),
                               (longlong)*(int *)(lVar3 + 0x27c8) << 2);
              lVar9 = _DAT_7ff70cc1a3c0;
              lVar5 = *(longlong *)(lVar3 + 0x27d0);
              if ((lVar5 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
                  sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar8 * 8) + 1;
                }
                else {
                  iVar16 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar16;
                  lVar8 = (longlong)iVar16;
                  *(int *)(lVar9 + 0x2874 + lVar8 * 8) = *piVar1;
                  *(undefined4 *)(lVar9 + 0x2878 + lVar8 * 8) = 0;
                  sVar6 = 1;
                }
                *(short *)(lVar9 + 0x287a + lVar8 * 8) = sVar6;
                *(int *)(lVar9 + 0x286c) = *(int *)(lVar9 + 0x286c) + 1;
              }
              (*_DAT_7ff70cbe9468)(lVar5,_DAT_7ff70cc1a3d0);
            }
            *(longlong *)(lVar3 + 0x27d0) = lVar7;
            *(int *)(lVar3 + 0x27cc) = iVar10;
            iVar16 = *(int *)(lVar3 + 0x27c8);
          }
          else {
            lVar7 = *(longlong *)(lVar3 + 0x27d0);
          }
          *(int *)(lVar7 + (longlong)iVar16 * 4) = (int)uVar12 - (int)lVar14;
          *(int *)(lVar3 + 0x27c8) = *(int *)(lVar3 + 0x27c8) + 1;
        }
        lVar7 = FUN_7ff70cb12b40(uVar12,10,uVar15 - uVar12);
      } while (lVar7 != 0);
    }
    if (iVar11 < *(int *)(lVar3 + 0x27d8)) {
      iVar11 = *(int *)(lVar3 + 0x27d8);
    }
    *(int *)(lVar3 + 0x27d8) = iVar11;
    lVar7 = lStack_50;
  }
  if ((*(byte *)(lVar3 + 0x27b6) & 0x10) != 0) {
    lVar14 = 0x7ff70cc1a3c8;
    if (*(longlong *)(lVar3 + 0x27c0) != 0) {
      lVar14 = *(longlong *)(lVar3 + 0x27c0);
    }
    FUN_7ff70ca61e00(&UNK_7ff70cb8320d,lVar14 + lVar7);
  }
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_78);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


