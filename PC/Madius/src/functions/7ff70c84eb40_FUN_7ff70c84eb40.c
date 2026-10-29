/* 7ff70c84eb40 FUN_7ff70c84eb40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c84eb40(int param_1,byte param_2)

{
  int *piVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  code *pcVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 uVar7;
  longlong lVar8;
  short sVar9;
  undefined8 *puVar10;
  uint uVar11;
  longlong lVar12;
  longlong lVar13;
  int iVar14;
  int iVar15;
  longlong lVar16;
  int iVar17;
  longlong lVar18;
  bool bVar19;
  undefined1 auStack_98 [32];
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  iVar15 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f60);
  if ((-1 < (char)param_2) || (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f50) <= iVar15)) {
    uVar7 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1f98);
    uVar2 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 5000);
    uVar3 = *(undefined4 *)
             (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x110) + -4 +
             (longlong)*(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x108) * 4);
    FUN_7ff70c84f430(&uStack_50);
    uStack_58 = uStack_50;
    puVar10 = &uStack_58;
    if (_DAT_7ff70cb1d744 <= *(float *)(lVar5 + 0xe4) &&
        _DAT_7ff70cb1d744 <= *(float *)(lVar5 + 0xe0)) {
      puVar10 = (undefined8 *)(lVar5 + 0xe0);
    }
    uStack_70 = *puVar10;
    if ((*(byte *)(lVar5 + 0x27b4) & 8) != 0) {
      FUN_7ff70c800cf0(&UNK_7ff70cb91a40,param_1);
    }
    lVar8 = _DAT_7ff70cc1a3c0;
    iVar17 = *(int *)(lVar5 + 0x1f50);
    if (iVar15 < iVar17) {
      uStack_68 = uStack_50;
      lVar13 = (longlong)iVar15;
      lVar18 = lVar13 * 0x38;
      uStack_60 = uVar7;
      if ((*(int *)(*(longlong *)(lVar5 + 0x1f58) + lVar18) == param_1) &&
         ((lVar6 = *(longlong *)(lVar5 + 0x1f58) + lVar18, (param_2 & 0x20) != 0 ||
          (*(int *)(lVar6 + 0x1c) == *(int *)(lVar5 + 5000) + -1)))) {
        *(undefined4 *)(lVar6 + 0x1c) = uVar2;
        goto LAB_7ff70c84f3b4;
      }
      uStack_78 = uVar3;
      uStack_74 = uVar2;
      if ((((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 8) != 0) &&
          (FUN_7ff70c800cf0(&UNK_7ff70cb912ce,iVar15,1), (*(byte *)(lVar8 + 0x27b4) & 8) != 0)) &&
         (iVar17 = *(int *)(lVar8 + 0x1f50), iVar15 < iVar17)) {
        lVar6 = lVar18 + 8;
        do {
          if ((*(byte *)(lVar8 + 0x27b4) & 8) != 0) {
            lVar12 = *(longlong *)(*(longlong *)(lVar8 + 0x1f58) + lVar6);
            if (lVar12 == 0) {
              uVar7 = 0;
            }
            else {
              uVar7 = *(undefined8 *)(lVar12 + 8);
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb91e00,
                             *(undefined4 *)(*(longlong *)(lVar8 + 0x1f58) + -8 + lVar6),uVar7);
            iVar17 = *(int *)(lVar8 + 0x1f50);
          }
          lVar13 = lVar13 + 1;
          lVar6 = lVar6 + 0x38;
        } while (lVar13 < iVar17);
      }
      lVar13 = *(longlong *)(*(longlong *)(lVar8 + 0x1f58) + 8 + lVar18);
      lVar18 = *(longlong *)(*(longlong *)(lVar8 + 0x1f58) + 0x10 + lVar18);
      iVar17 = *(int *)(lVar8 + 0x1f54);
      if (iVar17 < iVar15) {
        if (iVar17 == 0) {
          iVar17 = 8;
        }
        else {
          iVar17 = iVar17 / 2 + iVar17;
        }
        if (iVar17 <= iVar15) {
          iVar17 = iVar15;
        }
        uVar7 = (*_DAT_7ff70cbe9460)((longlong)iVar17 * 0x38,_DAT_7ff70cc1a3d0);
        lVar6 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
            sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar12 * 8) + 1;
          }
          else {
            iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
            lVar12 = (longlong)iVar14;
            *(int *)(lVar6 + 0x2874 + lVar12 * 8) = *piVar1;
            *(undefined4 *)(lVar6 + 0x2878 + lVar12 * 8) = 0;
            sVar9 = 1;
          }
          *(short *)(lVar6 + 0x2878 + lVar12 * 8) = sVar9;
          *(int *)(lVar6 + 0x2868) = *(int *)(lVar6 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar8 + 0x1f58) != 0) {
          FUN_7ff70cb12b60(uVar7,*(longlong *)(lVar8 + 0x1f58),
                           (longlong)*(int *)(lVar8 + 0x1f50) * 0x38);
          lVar12 = _DAT_7ff70cc1a3c0;
          lVar6 = *(longlong *)(lVar8 + 0x1f58);
          if ((lVar6 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar1) {
              sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar16 * 8) + 1;
            }
            else {
              iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
              lVar16 = (longlong)iVar14;
              *(int *)(lVar12 + 0x2874 + lVar16 * 8) = *piVar1;
              *(undefined4 *)(lVar12 + 0x2878 + lVar16 * 8) = 0;
              sVar9 = 1;
            }
            *(short *)(lVar12 + 0x287a + lVar16 * 8) = sVar9;
            *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar6,_DAT_7ff70cc1a3d0);
        }
        *(undefined8 *)(lVar8 + 0x1f58) = uVar7;
        *(int *)(lVar8 + 0x1f54) = iVar17;
      }
      uVar2 = uStack_74;
      *(int *)(lVar8 + 0x1f50) = iVar15;
      if (lVar13 != 0) {
        if ((*(uint *)(lVar13 + 0x14) & 0x10000000) != 0) {
          lVar18 = *(longlong *)(lVar13 + 0x3b0);
        }
        if (lVar18 == 0) {
          bVar19 = *(int *)(lVar8 + 0x1fa4) == 0;
          lVar18 = 0;
        }
        else if (*(char *)(lVar18 + 0xcd) == '\x01') {
          bVar19 = *(int *)(lVar8 + 0x1fa4) == 0;
        }
        else {
          iVar15 = -1;
          if ((*(uint *)(lVar13 + 0x14) & 0x1000000) != 0) {
            do {
              lVar13 = *(longlong *)(lVar13 + 0x3b0);
            } while ((*(byte *)(lVar13 + 0x17) & 1) != 0);
            iVar15 = 0;
          }
          uVar11 = *(short *)(lVar13 + 0xe2) + iVar15;
          if (-1 < (int)uVar11) {
            lVar8 = (ulonglong)uVar11 + 1;
            do {
              lVar18 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + -8 + lVar8 * 8);
              if (((lVar18 != 0) && (*(char *)(lVar18 + 0xcd) == '\x01')) &&
                 ((~*(uint *)(lVar18 + 0x14) & 0x10200) != 0)) goto LAB_7ff70c84f19c;
              lVar13 = lVar8 + -1;
              bVar19 = 0 < lVar8;
              lVar8 = lVar13;
            } while (lVar13 != 0 && bVar19);
          }
          lVar18 = 0;
LAB_7ff70c84f19c:
          bVar19 = true;
        }
        FUN_7ff70c819c70(lVar18,bVar19);
      }
      uVar3 = uStack_78;
      iVar15 = *(int *)(lVar5 + 0x1f50);
      if (iVar15 == *(int *)(lVar5 + 0x1f54)) {
        if (iVar15 == 0) {
          iVar17 = 8;
        }
        else {
          iVar17 = iVar15 / 2 + iVar15;
        }
        iVar14 = iVar15 + 1;
        if (iVar15 + 1 < iVar17) {
          iVar14 = iVar17;
        }
        lVar8 = (*_DAT_7ff70cbe9460)((longlong)iVar14 * 0x38,_DAT_7ff70cc1a3d0);
        lVar13 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar18 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar18 * 8) == *piVar1) {
            sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar18 * 8) + 1;
          }
          else {
            iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
            lVar18 = (longlong)iVar15;
            *(int *)(lVar13 + 0x2874 + lVar18 * 8) = *piVar1;
            *(undefined4 *)(lVar13 + 0x2878 + lVar18 * 8) = 0;
            sVar9 = 1;
          }
          *(short *)(lVar13 + 0x2878 + lVar18 * 8) = sVar9;
          *(int *)(lVar13 + 0x2868) = *(int *)(lVar13 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar5 + 0x1f58) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(lVar5 + 0x1f58),
                           (longlong)*(int *)(lVar5 + 0x1f50) * 0x38);
          lVar18 = _DAT_7ff70cc1a3c0;
          lVar13 = *(longlong *)(lVar5 + 0x1f58);
          if ((lVar13 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar6 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar6 * 8) == *piVar1) {
              sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar6 * 8) + 1;
            }
            else {
              iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
              lVar6 = (longlong)iVar15;
              *(int *)(lVar18 + 0x2874 + lVar6 * 8) = *piVar1;
              *(undefined4 *)(lVar18 + 0x2878 + lVar6 * 8) = 0;
              sVar9 = 1;
            }
            *(short *)(lVar18 + 0x287a + lVar6 * 8) = sVar9;
            *(int *)(lVar18 + 0x286c) = *(int *)(lVar18 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar5 + 0x1f58) = lVar8;
        *(int *)(lVar5 + 0x1f54) = iVar14;
        iVar15 = *(int *)(lVar5 + 0x1f50);
      }
      else {
        lVar8 = *(longlong *)(lVar5 + 0x1f58);
      }
      lVar13 = (longlong)iVar15 * 0x38;
      *(int *)(lVar8 + lVar13) = param_1;
      *(undefined4 *)(lVar8 + 4 + lVar13) = 0;
      *(undefined8 *)(lVar8 + 8 + lVar13) = 0;
      *(undefined8 *)(lVar8 + 0x10 + lVar13) = uStack_60;
      *(undefined4 *)(lVar8 + 0x18 + lVar13) = 0xffffffff;
      *(undefined4 *)(lVar8 + 0x1c + lVar13) = uVar2;
      *(undefined4 *)(lVar8 + 0x20 + lVar13) = uVar3;
      *(undefined8 *)(lVar8 + 0x24 + lVar13) = uStack_68;
    }
    else {
      if (iVar17 == *(int *)(lVar5 + 0x1f54)) {
        if (iVar17 == 0) {
          iVar15 = 8;
        }
        else {
          iVar15 = iVar17 / 2 + iVar17;
        }
        iVar14 = iVar17 + 1;
        if (iVar17 + 1 < iVar15) {
          iVar14 = iVar15;
        }
        lVar8 = (*_DAT_7ff70cbe9460)((longlong)iVar14 * 0x38,_DAT_7ff70cc1a3d0);
        lVar13 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar18 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar18 * 8) == *piVar1) {
            sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar18 * 8) + 1;
          }
          else {
            iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
            lVar18 = (longlong)iVar15;
            *(int *)(lVar13 + 0x2874 + lVar18 * 8) = *piVar1;
            *(undefined4 *)(lVar13 + 0x2878 + lVar18 * 8) = 0;
            sVar9 = 1;
          }
          *(short *)(lVar13 + 0x2878 + lVar18 * 8) = sVar9;
          *(int *)(lVar13 + 0x2868) = *(int *)(lVar13 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar5 + 0x1f58) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(lVar5 + 0x1f58),
                           (longlong)*(int *)(lVar5 + 0x1f50) * 0x38);
          lVar18 = _DAT_7ff70cc1a3c0;
          lVar13 = *(longlong *)(lVar5 + 0x1f58);
          if ((lVar13 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar6 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar6 * 8) == *piVar1) {
              sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar6 * 8) + 1;
            }
            else {
              iVar15 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar15;
              lVar6 = (longlong)iVar15;
              *(int *)(lVar18 + 0x2874 + lVar6 * 8) = *piVar1;
              *(undefined4 *)(lVar18 + 0x2878 + lVar6 * 8) = 0;
              sVar9 = 1;
            }
            *(short *)(lVar18 + 0x287a + lVar6 * 8) = sVar9;
            *(int *)(lVar18 + 0x286c) = *(int *)(lVar18 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar13,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar5 + 0x1f58) = lVar8;
        *(int *)(lVar5 + 0x1f54) = iVar14;
        iVar17 = *(int *)(lVar5 + 0x1f50);
      }
      else {
        lVar8 = *(longlong *)(lVar5 + 0x1f58);
      }
      lVar13 = (longlong)iVar17 * 0x38;
      *(int *)(lVar8 + lVar13) = param_1;
      *(undefined4 *)(lVar8 + 4 + lVar13) = 0;
      *(undefined8 *)(lVar8 + 8 + lVar13) = 0;
      *(undefined8 *)(lVar8 + 0x10 + lVar13) = uVar7;
      *(undefined4 *)(lVar8 + 0x18 + lVar13) = 0xffffffff;
      *(undefined4 *)(lVar8 + 0x1c + lVar13) = uVar2;
      *(undefined4 *)(lVar8 + 0x20 + lVar13) = uVar3;
      *(undefined8 *)(lVar8 + 0x24 + lVar13) = uStack_50;
    }
    *(undefined8 *)(lVar8 + 0x2c + lVar13) = uStack_70;
    *(undefined4 *)(lVar8 + 0x34 + lVar13) = 0;
    *(int *)(lVar5 + 0x1f50) = *(int *)(lVar5 + 0x1f50) + 1;
  }
LAB_7ff70c84f3b4:
  if (_DAT_7ff70cbebd80 != (uStack_48 ^ (ulonglong)auStack_98)) {
    FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_98);
    pcVar4 = (code *)swi(3);
    (*pcVar4)();
    return;
  }
  return;
}


