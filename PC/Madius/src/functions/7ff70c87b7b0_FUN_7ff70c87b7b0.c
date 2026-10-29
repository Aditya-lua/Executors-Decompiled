/* 7ff70c87b7b0 FUN_7ff70c87b7b0 */

/* WARNING: Removing unreachable block (ram,0x7ff70c87b816) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c87b7b0(int param_1,byte *param_2,char *param_3)

{
  undefined4 *puVar1;
  int *piVar2;
  code *pcVar3;
  bool bVar4;
  longlong lVar5;
  char cVar6;
  int iVar7;
  undefined8 uVar8;
  longlong lVar9;
  longlong lVar10;
  longlong lVar11;
  byte bVar12;
  int iVar13;
  longlong lVar14;
  char cVar15;
  uint uVar16;
  uint uVar17;
  int iVar18;
  byte bVar19;
  uint uVar20;
  longlong lVar21;
  uint uVar22;
  longlong lVar23;
  char cVar24;
  bool bVar25;
  undefined1 auStack_a8 [40];
  int iStack_80;
  uint uStack_7c;
  uint uStack_78;
  uint uStack_74;
  longlong lStack_70;
  longlong lStack_68;
  byte *pbStack_60;
  char *pcStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  uStack_50 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uVar17 = (uint)*param_2;
  cVar15 = *param_3;
  piVar2 = *(int **)(_DAT_7ff70cc1a3c0 + 0x2398);
  if (cVar15 == '\x01') {
    *(undefined1 *)((longlong)piVar2 + 0x5a) = 1;
  }
  lVar21 = *(longlong *)(piVar2 + 10);
  if ((*(byte *)(lVar5 + 0x1e28) & 1) == 0) {
    cVar6 = '\0';
LAB_7ff70c87b82c:
    if (*(char *)((longlong)piVar2 + 0x5a) == '\0') goto LAB_7ff70c87bc94;
  }
  else {
    cVar6 = FUN_7ff70c8183c0(0x20);
    if (cVar6 == '\0') goto LAB_7ff70c87b82c;
  }
  if (*(int *)(lVar5 + 0x1f94) == param_1) {
    bVar25 = *(longlong *)(lVar21 + 0x18) == -1;
  }
  else {
    bVar25 = false;
  }
  uVar20 = piVar2[0x15];
  lStack_70 = *(longlong *)(lVar5 + 0x1df8);
  uVar16 = piVar2[0xd];
  iStack_80 = param_1;
  pbStack_60 = param_2;
  pcStack_58 = param_3;
  if (*(char *)((longlong)piVar2 + 0x59) == '\0') {
    if (piVar2[1] < 0) {
      uStack_78 = uVar16;
      lStack_68 = lVar21;
      uVar8 = FUN_7ff70c802100(0);
      if (*(longlong *)(piVar2 + 2) != 0) {
        FUN_7ff70cb12b60(uVar8,*(longlong *)(piVar2 + 2),(longlong)*piVar2 * 0x18);
        FUN_7ff70c802510(*(undefined8 *)(piVar2 + 2));
      }
      *(undefined8 *)(piVar2 + 2) = uVar8;
      piVar2[1] = 0;
      lVar21 = lStack_68;
      uVar16 = uStack_78;
    }
    *piVar2 = 0;
    *(undefined1 *)((longlong)piVar2 + 0x59) = 1;
  }
  uStack_74 = uVar20 & 0x1000;
  uVar22 = uVar20 & 0x2000;
  cVar24 = cVar15;
  if (*(int *)(lVar5 + 0x2154) == iStack_80) {
    if ((uVar16 & 8) == 0) {
      cVar24 = '\x01';
      if (((uVar20 & 0x3000) != 0x3000) && (cVar24 = cVar15, uStack_74 == 0)) {
        cVar24 = '\x01';
        uVar17 = 1;
      }
      goto joined_r0x7ff70c87b951;
    }
    cVar24 = '\x01';
    if (uVar22 == 0) {
      cVar24 = cVar15;
    }
    if ((uVar20 & 0x3000) == 0 || bVar25) goto LAB_7ff70c87b953;
  }
  else {
joined_r0x7ff70c87b951:
    if (bVar25) {
LAB_7ff70c87b953:
      *(longlong *)(lVar21 + 0x18) = lStack_70;
      *(char *)(lVar21 + 0x14) = (char)uVar17;
    }
  }
  if (((piVar2[0x14] != 0) && (*(int *)(_DAT_7ff70cc1a3c0 + 0x2330) == piVar2[0x14])) &&
     (*(char *)(_DAT_7ff70cc1a3c0 + 0x2334) == '\x01')) {
    if (((*(float *)(_DAT_7ff70cc1a3c0 + 0x2390) <= *(float *)(lVar5 + 0x1e30)) ||
        (*(float *)(lVar5 + 0x1e38) < *(float *)(_DAT_7ff70cc1a3c0 + 0x2388) ||
         *(float *)(lVar5 + 0x1e38) == *(float *)(_DAT_7ff70cc1a3c0 + 0x2388))) ||
       (*(float *)(_DAT_7ff70cc1a3c0 + 0x238c) < *(float *)(lVar5 + 0x1e2c) ||
        *(float *)(_DAT_7ff70cc1a3c0 + 0x238c) == *(float *)(lVar5 + 0x1e2c))) {
      bVar25 = false;
    }
    else {
      bVar25 = *(float *)(_DAT_7ff70cc1a3c0 + 0x2384) <= *(float *)(lVar5 + 0x1e34) &&
               *(float *)(lVar5 + 0x1e34) != *(float *)(_DAT_7ff70cc1a3c0 + 0x2384);
    }
    if (((*(float *)(_DAT_7ff70cc1a3c0 + 0x2380) <= *(float *)(lVar5 + 0x1e30)) ||
        (*(float *)(lVar5 + 0x1e38) < *(float *)(_DAT_7ff70cc1a3c0 + 0x2378) ||
         *(float *)(lVar5 + 0x1e38) == *(float *)(_DAT_7ff70cc1a3c0 + 0x2378))) ||
       (*(float *)(_DAT_7ff70cc1a3c0 + 0x237c) < *(float *)(lVar5 + 0x1e2c) ||
        *(float *)(_DAT_7ff70cc1a3c0 + 0x237c) == *(float *)(lVar5 + 0x1e2c))) {
      bVar4 = false;
    }
    else {
      bVar4 = *(float *)(_DAT_7ff70cc1a3c0 + 0x2374) <= *(float *)(lVar5 + 0x1e34) &&
              *(float *)(lVar5 + 0x1e34) != *(float *)(_DAT_7ff70cc1a3c0 + 0x2374);
    }
    if ((!(bool)(bVar4 ^ 1U | bVar25)) || (!(bool)(bVar4 | bVar25 ^ 1U) && (uVar17 & 1) == 0)) {
      if ((*(int *)(lVar21 + 0x10) < 1) && (*(char *)(_DAT_7ff70cc1a3c0 + 0x2337) == '\x01')) {
        *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2337) = 0;
        cVar24 = '\x01';
      }
      else {
        uVar17 = uVar17 ^ 1;
        iVar13 = *piVar2;
        lVar14 = (longlong)iVar13;
        if ((((lVar14 < 1) || ((*(byte *)(piVar2 + 0xd) & 4) != 0)) ||
            (*(int *)(*(longlong *)(piVar2 + 2) + -0x18 + lVar14 * 0x18) != 2)) ||
           ((lVar14 = *(longlong *)(piVar2 + 2) + lVar14 * 0x18,
            *(longlong *)(lVar14 + -8) != *(longlong *)(piVar2 + 0x12) ||
            (*(char *)(lVar14 + -0x14) != (char)uVar17)))) {
          if (iVar13 == piVar2[1]) {
            if (iVar13 == 0) {
              iVar7 = 8;
            }
            else {
              iVar7 = iVar13 / 2 + iVar13;
            }
            iVar18 = iVar13 + 1;
            if (iVar13 + 1 < iVar7) {
              iVar18 = iVar7;
            }
            uStack_7c = uVar17;
            uStack_78 = uVar16;
            lVar14 = FUN_7ff70c802100((longlong)iVar18 * 0x18);
            if (*(longlong *)(piVar2 + 2) != 0) {
              FUN_7ff70cb12b60(lVar14);
              FUN_7ff70c802510(*(undefined8 *)(piVar2 + 2));
            }
            *(longlong *)(piVar2 + 2) = lVar14;
            piVar2[1] = iVar18;
            iVar13 = *piVar2;
            uVar16 = uStack_78;
            uVar17 = uStack_7c;
          }
          else {
            lVar14 = *(longlong *)(piVar2 + 2);
          }
          lVar10 = (longlong)iVar13;
          *(undefined4 *)(lVar14 + lVar10 * 0x18) = 2;
          *(char *)(lVar14 + 4 + lVar10 * 0x18) = (char)uVar17;
          *(undefined1 *)(lVar14 + 5 + lVar10 * 0x18) = 1;
          *(longlong *)(lVar14 + 8 + lVar10 * 0x18) = lStack_70;
          *(longlong *)(lVar14 + 0x10 + lVar10 * 0x18) = lStack_70;
          *piVar2 = *piVar2 + 1;
        }
        else {
          *(longlong *)(lVar14 + -8) = lStack_70;
        }
      }
      iVar13 = 0;
      if (0 < *(int *)(lVar21 + 0x10)) {
        iVar13 = *(int *)(lVar21 + 0x10);
      }
      *(int *)(lVar21 + 0x10) = iVar13 + 1;
    }
  }
  lVar14 = lStack_70;
  cVar15 = (char)uVar17;
  if (((cVar6 == '\0') || (cVar6 = FUN_7ff70c834f40(1,0), cVar6 == '\0')) || ((uVar16 & 8) != 0)) {
LAB_7ff70c87bbfa:
    if (cVar24 != '\0') {
      uVar20 = uStack_74 >> 0xc;
      uVar22 = uVar22 >> 0xd;
      if (*(int *)(lVar5 + 0x1fa8) != iStack_80) goto LAB_7ff70c87bcd5;
LAB_7ff70c87bc1e:
      cVar24 = (char)uVar22;
      if ((*(byte *)(lVar5 + 0x1fb4) & 1) != 0) {
        cVar6 = '\x01';
        uVar22 = 1;
        if (cVar15 != '\0') {
          lVar10 = *(longlong *)(lVar21 + 0x18);
          goto joined_r0x7ff70c87bc69;
        }
      }
LAB_7ff70c87bce3:
      uVar22 = *(uint *)(lVar5 + 0x1fd8);
      goto LAB_7ff70c87bce9;
    }
    cVar6 = '\0';
    lVar10 = *(longlong *)(lVar21 + 0x18);
    uVar22 = uVar17;
joined_r0x7ff70c87bc69:
    iVar13 = iStack_80;
    if (lVar10 != lVar14) goto LAB_7ff70c87bc6b;
LAB_7ff70c87bc3d:
    bVar12 = (byte)uVar22;
    *(byte *)(lVar21 + 0x14) = bVar12;
    if (*(int *)(lVar5 + 0x1f94) == iVar13) goto LAB_7ff70c87bc7e;
LAB_7ff70c87bc54:
    if (*(longlong *)(lVar21 + 0x20) == lVar14) goto LAB_7ff70c87bc86;
  }
  else {
    if ((*(int *)(lVar5 + 0x14b4) != 0) && (*(int *)(lVar5 + 0x14b4) != iStack_80)) {
      FUN_7ff70c817fe0();
    }
    FUN_7ff70c854590(iStack_80,uStack_50);
    if (cVar15 != '\0' || cVar24 != '\0') goto LAB_7ff70c87bbfa;
    uVar20 = 0;
    if (*(int *)(lVar5 + 0x1fa8) == iStack_80) goto LAB_7ff70c87bc1e;
LAB_7ff70c87bcd5:
    cVar24 = (char)uVar22;
    uVar22 = 1;
    if (*(int *)(lVar5 + 0x2154) == iStack_80) goto LAB_7ff70c87bce3;
LAB_7ff70c87bce9:
    iVar13 = iStack_80;
    if (((((uVar16 & 0xc0) != 0) && (cVar15 == '\0')) && (*(char *)(lVar5 + 0x2334) == '\0')) &&
       ((uVar22 == 1 && *(char *)(lVar5 + 0x2335) == '\0' && (*(short *)(lVar5 + 0xb1a) == 1)))) {
      uStack_7c = uVar17;
      FUN_7ff70c8a0a60(piVar2[0x14],lVar14);
      lVar14 = lStack_70;
      uVar17 = uStack_7c;
    }
    bVar12 = (byte)uVar17;
    if ((uVar16 & 0x10) == 0) {
      if ((uVar16 & 1) == 0) {
        bVar19 = (byte)uVar20;
        if (uVar22 == 1) {
          if (bVar19 != 0) goto LAB_7ff70c87be7e;
LAB_7ff70c87bd6c:
          bVar19 = (byte)uVar16 >> 5 & bVar12;
        }
        else {
          if ((*(int *)(lVar5 + 0x1fa8) == iVar13) && (bVar19 == 0)) goto LAB_7ff70c87bd6c;
          if (((uVar22 & 0xfffffffe) != 2) || (cVar24 == '\0')) goto LAB_7ff70c87be7e;
        }
        if (bVar19 != 0) goto LAB_7ff70c87be7e;
      }
      uStack_74 = uVar20;
      if (piVar2[1] < 0) {
        uVar8 = FUN_7ff70c802100(0);
        if (*(longlong *)(piVar2 + 2) != 0) {
          FUN_7ff70cb12b60(uVar8,*(longlong *)(piVar2 + 2),(longlong)*piVar2 * 0x18);
          FUN_7ff70c802510(*(undefined8 *)(piVar2 + 2));
        }
        *(undefined8 *)(piVar2 + 2) = uVar8;
        piVar2[0] = 0;
        piVar2[1] = 0;
LAB_7ff70c87be02:
        lVar10 = FUN_7ff70c802100(0xc0);
        if (*(longlong *)(piVar2 + 2) != 0) {
          FUN_7ff70cb12b60(lVar10,*(longlong *)(piVar2 + 2),(longlong)*piVar2 * 0x18);
          FUN_7ff70c802510(*(undefined8 *)(piVar2 + 2));
        }
        *(longlong *)(piVar2 + 2) = lVar10;
        piVar2[1] = 8;
        lVar9 = (longlong)*piVar2;
      }
      else {
        *piVar2 = 0;
        if (piVar2[1] == 0) goto LAB_7ff70c87be02;
        lVar10 = *(longlong *)(piVar2 + 2);
        lVar9 = 0;
      }
      *(undefined4 *)(lVar10 + lVar9 * 0x18) = 1;
      *(undefined2 *)(lVar10 + 4 + lVar9 * 0x18) = 0;
      puVar1 = (undefined4 *)(lVar10 + 8 + lVar9 * 0x18);
      *puVar1 = 0xffffffff;
      puVar1[1] = 0xffffffff;
      puVar1[2] = 0xffffffff;
      puVar1[3] = 0xffffffff;
      *piVar2 = *piVar2 + 1;
      iVar13 = iStack_80;
      uVar20 = uStack_74;
    }
LAB_7ff70c87be7e:
    if ((cVar24 == '\0') || ((uVar16 & 1) != 0)) {
      iVar7 = -(uint)((uVar16 & 8) != 0);
      uStack_7c = CONCAT31((int3)((uint)iVar7 >> 8),((byte)iVar7 | (byte)uVar20) & bVar12) ^ 1;
      *(longlong *)(lVar21 + 0x18) = lVar14;
      uVar20 = 1;
      lVar10 = lVar14;
      uVar16 = uStack_7c;
    }
    else {
      lVar10 = *(longlong *)(lVar21 + 0x18);
      if (lVar10 == -1) {
        *(longlong *)(lVar21 + 0x18) = lVar14;
        lVar10 = lVar14;
        if ((uVar16 & 8) == 0) goto LAB_7ff70c87be9f;
LAB_7ff70c87bef0:
        if (*(char *)((longlong)piVar2 + 0x5b) == '\x01') {
          uVar16 = (uint)(*(char *)(lVar21 + 0x14) != '\0');
        }
        else {
          uVar16 = (uint)(bVar12 ^ 1);
        }
      }
      else {
        if ((uVar16 & 8) != 0) goto LAB_7ff70c87bef0;
LAB_7ff70c87be9f:
        uVar16 = 1;
        if (((byte)uVar20 != 0) && (*(char *)(lVar21 + 0x14) != -1)) {
          uVar16 = (uint)(*(char *)(lVar21 + 0x14) != '\0');
        }
      }
      uVar20 = *(byte *)((longlong)piVar2 + 0x5d) - 1 | 1;
      uStack_7c = uVar17;
    }
    iVar7 = *piVar2;
    lVar9 = (longlong)iVar7;
    if ((((lVar10 == lVar14 && 0 < lVar9) && ((*(byte *)(piVar2 + 0xd) & 4) == 0)) &&
        (*(int *)(*(longlong *)(piVar2 + 2) + -0x18 + lVar9 * 0x18) == 2)) &&
       ((lVar9 = *(longlong *)(piVar2 + 2) + lVar9 * 0x18,
        *(longlong *)(lVar9 + -8) == *(longlong *)(piVar2 + 0x12) &&
        (*(char *)(lVar9 + -0x14) == (char)uVar16)))) {
      *(longlong *)(lVar9 + -8) = lVar14;
      cVar6 = '\x01';
      uVar22 = uStack_7c;
      if (*(longlong *)(lVar21 + 0x18) != lVar14) goto LAB_7ff70c87bc6b;
      goto LAB_7ff70c87bc3d;
    }
    lVar23 = lVar10;
    lVar9 = lVar14;
    if (0 < (int)uVar20) {
      lVar23 = lVar14;
      lVar9 = lVar10;
    }
    if (iVar7 == piVar2[1]) {
      if (iVar7 == 0) {
        iVar13 = 8;
      }
      else {
        iVar13 = iVar7 / 2 + iVar7;
      }
      iVar18 = iVar7 + 1;
      if (iVar7 + 1 < iVar13) {
        iVar18 = iVar13;
      }
      lStack_68 = lVar21;
      lVar10 = FUN_7ff70c802100((longlong)iVar18 * 0x18);
      if (*(longlong *)(piVar2 + 2) != 0) {
        FUN_7ff70cb12b60(lVar10,*(longlong *)(piVar2 + 2),(longlong)*piVar2 * 0x18);
        FUN_7ff70c802510(*(undefined8 *)(piVar2 + 2));
      }
      *(longlong *)(piVar2 + 2) = lVar10;
      piVar2[1] = iVar18;
      iVar7 = *piVar2;
      lVar14 = lStack_70;
      lVar21 = lStack_68;
    }
    else {
      lVar10 = *(longlong *)(piVar2 + 2);
    }
    lVar11 = (longlong)iVar7;
    *(undefined4 *)(lVar10 + lVar11 * 0x18) = 2;
    *(char *)(lVar10 + 4 + lVar11 * 0x18) = (char)uVar16;
    *(char *)(lVar10 + 5 + lVar11 * 0x18) = (char)uVar20;
    *(longlong *)(lVar10 + 8 + lVar11 * 0x18) = lVar9;
    *(longlong *)(lVar10 + 0x10 + lVar11 * 0x18) = lVar23;
    *piVar2 = *piVar2 + 1;
    cVar6 = '\x01';
    iVar13 = iStack_80;
    uVar22 = uStack_7c;
    if (*(longlong *)(lVar21 + 0x18) == lVar14) goto LAB_7ff70c87bc3d;
LAB_7ff70c87bc6b:
    bVar12 = (byte)uVar22;
    if (*(int *)(lVar5 + 0x1f94) != iVar13) goto LAB_7ff70c87bc54;
LAB_7ff70c87bc7e:
    *(longlong *)(lVar21 + 0x20) = lVar14;
    *(byte *)(lVar21 + 0x15) = bVar12;
LAB_7ff70c87bc86:
    *(undefined1 *)(piVar2 + 0x17) = 1;
  }
  *(longlong *)(piVar2 + 0x12) = lVar14;
  *pbStack_60 = bVar12;
  *pcStack_58 = cVar6;
LAB_7ff70c87bc94:
  if (_DAT_7ff70cbebd80 != (uStack_48 ^ (ulonglong)auStack_a8)) {
    FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_a8);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


