/* 7ff70c83e1d0 FUN_7ff70c83e1d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83e1d0(int param_1)

{
  int *piVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  code *pcVar4;
  longlong lVar5;
  int iVar6;
  undefined8 uVar7;
  longlong lVar8;
  short sVar9;
  longlong lVar10;
  longlong lVar11;
  int iVar12;
  int iVar13;
  longlong lVar14;
  longlong lVar15;
  ulonglong uVar16;
  undefined1 auStack_58 [32];
  ulonglong uStack_38;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  *(int *)(_DAT_7ff70cc1a3c0 + 0x1fa0) = param_1;
  iVar12 = *(int *)(lVar5 + 0x1fbc);
  if (iVar12 < 0) {
    uVar7 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
    lVar8 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar10 * 8) == *piVar1) {
        sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar10 * 8) + 1;
      }
      else {
        iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
        lVar10 = (longlong)iVar12;
        *(int *)(lVar8 + 0x2874 + lVar10 * 8) = *piVar1;
        *(undefined4 *)(lVar8 + 0x2878 + lVar10 * 8) = 0;
        sVar9 = 1;
      }
      *(short *)(lVar8 + 0x2878 + lVar10 * 8) = sVar9;
      *(int *)(lVar8 + 0x2868) = *(int *)(lVar8 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar5 + 0x1fc0) != 0) {
      FUN_7ff70cb12b60(uVar7,*(longlong *)(lVar5 + 0x1fc0),(longlong)*(int *)(lVar5 + 0x1fb8) << 3);
      lVar10 = _DAT_7ff70cc1a3c0;
      lVar8 = *(longlong *)(lVar5 + 0x1fc0);
      if ((lVar8 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar1) {
          sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar14 * 8) + 1;
        }
        else {
          iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
          lVar14 = (longlong)iVar12;
          *(int *)(lVar10 + 0x2874 + lVar14 * 8) = *piVar1;
          *(undefined4 *)(lVar10 + 0x2878 + lVar14 * 8) = 0;
          sVar9 = 1;
        }
        *(short *)(lVar10 + 0x287a + lVar14 * 8) = sVar9;
        *(int *)(lVar10 + 0x286c) = *(int *)(lVar10 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar8,_DAT_7ff70cc1a3d0);
    }
    *(undefined8 *)(lVar5 + 0x1fc0) = uVar7;
    *(undefined4 *)(lVar5 + 0x1fbc) = 0;
    iVar12 = 0;
  }
  *(undefined4 *)(lVar5 + 0x1fb8) = 0;
  if (param_1 != 0) {
    if (param_1 == *(int *)(lVar5 + 0x1ddc)) {
      if ((longlong)*(int *)(lVar5 + 0x1f20) < 1) {
        iVar12 = 0;
      }
      else {
        uVar16 = (longlong)*(int *)(lVar5 + 0x1f20) + 1;
        iVar12 = 0;
        do {
          lVar8 = *(longlong *)(lVar5 + 0x1f28);
          if (*(int *)(lVar8 + -0xc + uVar16 * 8) != *(int *)(*(longlong *)(lVar5 + 0x1440) + 0x10))
          break;
          if (iVar12 == *(int *)(lVar5 + 0x1fbc)) {
            if (iVar12 == 0) {
              iVar6 = 8;
            }
            else {
              iVar6 = iVar12 / 2 + iVar12;
            }
            iVar13 = iVar12 + 1;
            if (iVar12 + 1 < iVar6) {
              iVar13 = iVar6;
            }
            lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar13 << 3,_DAT_7ff70cc1a3d0);
            lVar14 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar11 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar11 * 8) == *piVar1) {
                sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar11 * 8) + 1;
              }
              else {
                iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
                lVar11 = (longlong)iVar12;
                *(int *)(lVar14 + 0x2874 + lVar11 * 8) = *piVar1;
                *(undefined4 *)(lVar14 + 0x2878 + lVar11 * 8) = 0;
                sVar9 = 1;
              }
              *(short *)(lVar14 + 0x2878 + lVar11 * 8) = sVar9;
              *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
            }
            if (*(longlong *)(lVar5 + 0x1fc0) != 0) {
              FUN_7ff70cb12b60(lVar10,*(longlong *)(lVar5 + 0x1fc0),
                               (longlong)*(int *)(lVar5 + 0x1fb8) << 3);
              lVar11 = _DAT_7ff70cc1a3c0;
              lVar14 = *(longlong *)(lVar5 + 0x1fc0);
              if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
                piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar1) {
                  sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar15 * 8) + 1;
                }
                else {
                  iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                  *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
                  lVar15 = (longlong)iVar12;
                  *(int *)(lVar11 + 0x2874 + lVar15 * 8) = *piVar1;
                  *(undefined4 *)(lVar11 + 0x2878 + lVar15 * 8) = 0;
                  sVar9 = 1;
                }
                *(short *)(lVar11 + 0x287a + lVar15 * 8) = sVar9;
                *(int *)(lVar11 + 0x286c) = *(int *)(lVar11 + 0x286c) + 1;
              }
              (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
            }
            *(longlong *)(lVar5 + 0x1fc0) = lVar10;
            *(int *)(lVar5 + 0x1fbc) = iVar13;
            iVar12 = *(int *)(lVar5 + 0x1fb8);
          }
          else {
            lVar10 = *(longlong *)(lVar5 + 0x1fc0);
          }
          *(undefined8 *)(lVar10 + (longlong)iVar12 * 8) =
               *(undefined8 *)(lVar8 + -0x10 + uVar16 * 8);
          iVar12 = *(int *)(lVar5 + 0x1fb8) + 1;
          *(int *)(lVar5 + 0x1fb8) = iVar12;
          uVar16 = uVar16 - 1;
        } while (1 < uVar16);
      }
    }
    else {
      if (param_1 != *(int *)(*(longlong *)(lVar5 + 0x1f98) + 0x428)) goto LAB_7ff70c83e94a;
      uVar2 = *(undefined4 *)(*(longlong *)(lVar5 + 0x1f98) + 0x10);
      if (iVar12 == 0) {
        lVar8 = (*_DAT_7ff70cbe9460)(0x40,_DAT_7ff70cc1a3d0);
        lVar10 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar14 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar14 * 8) == *piVar1) {
            sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar14 * 8) + 1;
          }
          else {
            iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
            lVar14 = (longlong)iVar12;
            *(int *)(lVar10 + 0x2874 + lVar14 * 8) = *piVar1;
            *(undefined4 *)(lVar10 + 0x2878 + lVar14 * 8) = 0;
            sVar9 = 1;
          }
          *(short *)(lVar10 + 0x2878 + lVar14 * 8) = sVar9;
          *(int *)(lVar10 + 0x2868) = *(int *)(lVar10 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar5 + 0x1fc0) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(lVar5 + 0x1fc0),
                           (longlong)*(int *)(lVar5 + 0x1fb8) << 3);
          lVar14 = _DAT_7ff70cc1a3c0;
          lVar10 = *(longlong *)(lVar5 + 0x1fc0);
          if ((lVar10 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar11 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar11 * 8) == *piVar1) {
              sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar11 * 8) + 1;
            }
            else {
              iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
              lVar11 = (longlong)iVar12;
              *(int *)(lVar14 + 0x2874 + lVar11 * 8) = *piVar1;
              *(undefined4 *)(lVar14 + 0x2878 + lVar11 * 8) = 0;
              sVar9 = 1;
            }
            *(short *)(lVar14 + 0x287a + lVar11 * 8) = sVar9;
            *(int *)(lVar14 + 0x286c) = *(int *)(lVar14 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar10,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar5 + 0x1fc0) = lVar8;
        *(undefined4 *)(lVar5 + 0x1fbc) = 8;
        lVar10 = (longlong)*(int *)(lVar5 + 0x1fb8);
      }
      else {
        lVar8 = *(longlong *)(lVar5 + 0x1fc0);
        lVar10 = 0;
      }
      *(ulonglong *)(lVar8 + lVar10 * 8) = CONCAT44(uVar2,param_1);
      iVar12 = *(int *)(lVar5 + 0x1fb8) + 1;
      *(int *)(lVar5 + 0x1fb8) = iVar12;
    }
    for (lVar8 = *(longlong *)(*(longlong *)(lVar5 + 0x1f98) + 0x3e0); lVar8 != 0;
        lVar8 = *(longlong *)(lVar8 + 0x3e0)) {
      uVar2 = *(undefined4 *)(lVar8 + 0x428);
      uVar3 = *(undefined4 *)(lVar8 + 0x10);
      if (iVar12 == *(int *)(lVar5 + 0x1fbc)) {
        if (iVar12 == 0) {
          iVar6 = 8;
        }
        else {
          iVar6 = iVar12 / 2 + iVar12;
        }
        iVar13 = iVar12 + 1;
        if (iVar12 + 1 < iVar6) {
          iVar13 = iVar6;
        }
        lVar10 = (*_DAT_7ff70cbe9460)((longlong)iVar13 << 3,_DAT_7ff70cc1a3d0);
        lVar14 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar11 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar11 * 8) == *piVar1) {
            sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar11 * 8) + 1;
          }
          else {
            iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
            lVar11 = (longlong)iVar12;
            *(int *)(lVar14 + 0x2874 + lVar11 * 8) = *piVar1;
            *(undefined4 *)(lVar14 + 0x2878 + lVar11 * 8) = 0;
            sVar9 = 1;
          }
          *(short *)(lVar14 + 0x2878 + lVar11 * 8) = sVar9;
          *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar5 + 0x1fc0) != 0) {
          FUN_7ff70cb12b60(lVar10,*(longlong *)(lVar5 + 0x1fc0),
                           (longlong)*(int *)(lVar5 + 0x1fb8) << 3);
          lVar11 = _DAT_7ff70cc1a3c0;
          lVar14 = *(longlong *)(lVar5 + 0x1fc0);
          if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar1) {
              sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar15 * 8) + 1;
            }
            else {
              iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
              lVar15 = (longlong)iVar12;
              *(int *)(lVar11 + 0x2874 + lVar15 * 8) = *piVar1;
              *(undefined4 *)(lVar11 + 0x2878 + lVar15 * 8) = 0;
              sVar9 = 1;
            }
            *(short *)(lVar11 + 0x287a + lVar15 * 8) = sVar9;
            *(int *)(lVar11 + 0x286c) = *(int *)(lVar11 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar5 + 0x1fc0) = lVar10;
        *(int *)(lVar5 + 0x1fbc) = iVar13;
        iVar12 = *(int *)(lVar5 + 0x1fb8);
      }
      else {
        lVar10 = *(longlong *)(lVar5 + 0x1fc0);
      }
      *(ulonglong *)(lVar10 + (longlong)iVar12 * 8) = CONCAT44(uVar3,uVar2);
      iVar12 = *(int *)(lVar5 + 0x1fb8) + 1;
      *(int *)(lVar5 + 0x1fb8) = iVar12;
    }
  }
LAB_7ff70c83e94a:
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_58)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_58);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


