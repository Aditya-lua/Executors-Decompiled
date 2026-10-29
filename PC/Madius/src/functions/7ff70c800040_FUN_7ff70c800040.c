/* 7ff70c800040 FUN_7ff70c800040 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c800040(longlong param_1,uint param_2,char param_3)

{
  int iVar1;
  longlong lVar2;
  bool bVar3;
  code *pcVar4;
  uint uVar5;
  float fVar6;
  longlong lVar7;
  short sVar8;
  int iVar9;
  int *piVar10;
  int iVar11;
  int iVar12;
  longlong lVar13;
  uint uVar14;
  longlong lVar15;
  longlong lVar16;
  float *pfVar17;
  int *piVar18;
  undefined1 auStack_78 [40];
  ulonglong uStack_50;
  
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*(char *)(param_1 + 0xba5) == '\x01') {
    fVar6 = _DAT_7ff70cb1ba2c;
    if (param_3 == '\0') {
      fVar6 = 0.0;
    }
    if (param_2 != 0) {
      lVar2 = *(longlong *)(param_1 + 0xd0);
      if (*(char *)(lVar2 + 0x59) == '\x01') {
        switch(param_2) {
        case 0x20f:
          param_2 = 0x212;
          break;
        case 0x210:
        case 0x211:
        case 0x214:
        case 0x215:
          break;
        case 0x212:
          param_2 = 0x20f;
          break;
        case 0x213:
          param_2 = 0x216;
          break;
        case 0x216:
          param_2 = 0x213;
          break;
        default:
          if (param_2 == 0x8000) {
            param_2 = 0x1000;
          }
          else if (param_2 == 0x1000) {
            param_2 = 0x8000;
          }
        }
      }
      iVar12 = *(int *)(lVar2 + 0x13b8);
      if (0 < iVar12) {
        piVar10 = (int *)((ulonglong)(iVar12 - 1) * 0x1c + *(longlong *)(lVar2 + 0x13c0));
        lVar7 = (ulonglong)(iVar12 - 1) + 1;
        do {
          if ((*piVar10 == 4) && (piVar10[3] == param_2)) goto LAB_7ff70c800137;
          piVar10 = piVar10 + -7;
          lVar15 = lVar7 + -1;
          bVar3 = 0 < lVar7;
          lVar7 = lVar15;
        } while (lVar15 != 0 && bVar3);
      }
      piVar10 = (int *)0x0;
LAB_7ff70c800137:
      uVar14 = param_2;
      if ((param_2 & param_2 - 1) == 0 && (param_2 & 0xf000) != 0) {
        uVar5 = 0;
        for (; (uVar14 & 1) == 0; uVar14 = uVar14 >> 1 | 0x80000000) {
          uVar5 = uVar5 + 1;
        }
        uVar14 = uVar5 + 0x28b;
        if ((uVar5 & 0x1c) != 0xc) {
          uVar14 = param_2;
        }
      }
      piVar18 = piVar10 + 4;
      if (piVar10 == (int *)0x0) {
        piVar18 = (int *)(lVar2 + (longlong)(int)uVar14 * 0x10 + -0x1efc);
      }
      if ((char)*piVar18 == param_3) {
        pfVar17 = (float *)(piVar10 + 5);
        if (piVar10 == (int *)0x0) {
          pfVar17 = (float *)((longlong)(int)uVar14 * 0x10 + lVar2 + -0x1ef0);
        }
        if ((*pfVar17 == fVar6) && (!NAN(*pfVar17) && !NAN(fVar6))) goto LAB_7ff70c8003ed;
      }
      iVar1 = *(int *)(lVar2 + 0x13dc);
      *(int *)(lVar2 + 0x13dc) = iVar1 + 1;
      if (iVar12 == *(int *)(lVar2 + 0x13bc)) {
        if (iVar12 == 0) {
          iVar9 = 8;
        }
        else {
          iVar9 = iVar12 / 2 + iVar12;
        }
        iVar11 = iVar12 + 1;
        if (iVar12 + 1 < iVar9) {
          iVar11 = iVar9;
        }
        lVar7 = (*_DAT_7ff70cbe9460)((longlong)iVar11 * 0x1c,_DAT_7ff70cc1a3d0);
        lVar15 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar10 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar10) {
            sVar8 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar16 * 8) + 1;
          }
          else {
            iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
            lVar16 = (longlong)iVar12;
            *(int *)(lVar15 + 0x2874 + lVar16 * 8) = *piVar10;
            *(undefined4 *)(lVar15 + 0x2878 + lVar16 * 8) = 0;
            sVar8 = 1;
          }
          *(short *)(lVar15 + 0x2878 + lVar16 * 8) = sVar8;
          *(int *)(lVar15 + 0x2868) = *(int *)(lVar15 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar2 + 0x13c0) != 0) {
          FUN_7ff70cb12b60(lVar7,*(longlong *)(lVar2 + 0x13c0),
                           (longlong)*(int *)(lVar2 + 0x13b8) * 0x1c);
          lVar16 = _DAT_7ff70cc1a3c0;
          lVar15 = *(longlong *)(lVar2 + 0x13c0);
          if ((lVar15 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar10 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar10) {
              sVar8 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar13 * 8) + 1;
            }
            else {
              iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
              lVar13 = (longlong)iVar12;
              *(int *)(lVar16 + 0x2874 + lVar13 * 8) = *piVar10;
              *(undefined4 *)(lVar16 + 0x2878 + lVar13 * 8) = 0;
              sVar8 = 1;
            }
            *(short *)(lVar16 + 0x287a + lVar13 * 8) = sVar8;
            *(int *)(lVar16 + 0x286c) = *(int *)(lVar16 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar15,_DAT_7ff70cc1a3d0);
        }
        *(longlong *)(lVar2 + 0x13c0) = lVar7;
        *(int *)(lVar2 + 0x13bc) = iVar11;
        iVar12 = *(int *)(lVar2 + 0x13b8);
      }
      else {
        lVar7 = *(longlong *)(lVar2 + 0x13c0);
      }
      lVar15 = (longlong)iVar12 * 0x1c;
      *(undefined4 *)(lVar7 + lVar15) = 4;
      *(uint *)(lVar7 + 4 + lVar15) = (param_2 - 0x278 < 0x18) + 2;
      *(int *)(lVar7 + 8 + lVar15) = iVar1;
      *(uint *)(lVar7 + 0xc + lVar15) = param_2;
      *(char *)(lVar7 + 0x10 + lVar15) = param_3;
      *(undefined2 *)(lVar7 + 0x11 + lVar15) = 0;
      *(undefined1 *)(lVar7 + 0x13 + lVar15) = 0;
      *(float *)(lVar7 + 0x14 + lVar15) = fVar6;
      *(undefined4 *)(lVar7 + 0x18 + lVar15) = 0;
      *(int *)(lVar2 + 0x13b8) = *(int *)(lVar2 + 0x13b8) + 1;
    }
  }
LAB_7ff70c8003ed:
  if (_DAT_7ff70cbebd80 != (uStack_50 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_78);
    pcVar4 = (code *)swi(3);
    (*pcVar4)();
    return;
  }
  return;
}


