/* 7ff70c854dd0 FUN_7ff70c854dd0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c854dd0(void)

{
  undefined4 *puVar1;
  float fVar2;
  float fVar3;
  undefined8 uVar4;
  code *pcVar6;
  undefined4 uVar7;
  longlong lVar8;
  longlong lVar9;
  uint uVar10;
  longlong lVar11;
  uint *puVar12;
  int iVar13;
  int *piVar14;
  int iVar15;
  undefined *puVar16;
  longlong lVar17;
  ulonglong uVar18;
  longlong *plVar19;
  bool bVar20;
  undefined4 uVar21;
  undefined1 auStack_88 [32];
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  float fStack_50;
  float fStack_4c;
  ulonglong uStack_40;
  undefined8 uVar5;
  
  lVar8 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2078) == 0) {
    uVar10 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c);
    if (((byte)(uVar10 >> 10) & *(int *)(_DAT_7ff70cc1a3c0 + 0x20e8) == 0) == 1) {
      if (((*(int *)(_DAT_7ff70cc1a3c0 + 0x206c) != 1) &&
          (*(int *)(_DAT_7ff70cc1a3c0 + 0x2068) != 0)) ||
         (*(int *)(_DAT_7ff70cc1a3c0 + 0x2120) == 0)) {
        uVar18 = (ulonglong)((*(uint *)(_DAT_7ff70cc1a3c0 + 0x2038) & 0xfffffffe) == 2);
LAB_7ff70c8553a4:
        uVar10 = uVar10 | 0x4000;
        *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) = uVar10;
        goto LAB_7ff70c8553ab;
      }
      plVar19 = (longlong *)(_DAT_7ff70cc1a3c0 + 0x2118);
      goto LAB_7ff70c854e16;
    }
    bVar20 = (*(uint *)(_DAT_7ff70cc1a3c0 + 0x2038) & 0xfffffffe) == 2;
    uVar18 = (ulonglong)bVar20;
    if (*(int *)(_DAT_7ff70cc1a3c0 + 0x20e8) == 0) {
      if ((uVar10 & 0x400) != 0) goto LAB_7ff70c8553a4;
LAB_7ff70c8553ab:
      if ((*(int *)(lVar8 + 0x1f94) != 0) && ((uVar10 & 0x4000) == 0)) {
        if (*(char *)(lVar8 + 0x56) == '\x01') {
          *(undefined1 *)(lVar8 + 0x1f90) = 1;
        }
        *(undefined2 *)(lVar8 + 0x1f91) = 0x101;
      }
      *(undefined4 *)
       ((longlong)*(int *)(lVar8 + 0x1fa4) * 8 +
        *(longlong *)(*(longlong *)(lVar8 + 0x1f98) + 0x3d8) + 0x418 + uVar18 * 4) = 0x7f7fffff;
      if ((*(byte *)(lVar8 + 0x27b4) & 0x10) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb91f17);
      }
      goto LAB_7ff70c855375;
    }
    plVar19 = (longlong *)(_DAT_7ff70cc1a3c0 + 0x20e0);
  }
  else {
    plVar19 = (longlong *)(_DAT_7ff70cc1a3c0 + 0x2070);
    uVar10 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c);
LAB_7ff70c854e16:
    bVar20 = (*(uint *)(_DAT_7ff70cc1a3c0 + 0x2038) & 0xfffffffe) == 2;
  }
  if ((((uVar10 & 0x20) != 0) && (*(int *)(_DAT_7ff70cc1a3c0 + 0x20b0) != 0)) &&
     (*(int *)(_DAT_7ff70cc1a3c0 + 0x20b0) != *(int *)(_DAT_7ff70cc1a3c0 + 0x1f94))) {
    plVar19 = (longlong *)(_DAT_7ff70cc1a3c0 + 0x20a8);
  }
  piVar14 = (int *)(_DAT_7ff70cc1a3c0 + 0x2038);
  puVar12 = (uint *)(_DAT_7ff70cc1a3c0 + 0x202c);
  if (((plVar19 != (longlong *)(_DAT_7ff70cc1a3c0 + 0x20e0)) &&
      (*(int *)(_DAT_7ff70cc1a3c0 + 0x20e8) != 0)) &&
     (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x20e0) + 0x3b0) ==
      *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98))) {
    fVar2 = *(float *)(_DAT_7ff70cc1a3c0 + 0x2104);
    fVar3 = *(float *)((longlong)plVar19 + 0x24);
    if (fVar3 <= fVar2) {
      if (((fVar2 != fVar3) || (NAN(fVar2) || NAN(fVar3))) ||
         (*(float *)(plVar19 + 5) < *(float *)(_DAT_7ff70cc1a3c0 + 0x2108) ||
          *(float *)(plVar19 + 5) == *(float *)(_DAT_7ff70cc1a3c0 + 0x2108))) goto LAB_7ff70c854ea7;
    }
    plVar19 = (longlong *)(_DAT_7ff70cc1a3c0 + 0x20e0);
  }
LAB_7ff70c854ea7:
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) == 0) {
    uVar4 = *(undefined8 *)(*plVar19 + 0x128);
    uVar5 = *(undefined8 *)(*plVar19 + 0x128);
    fStack_50 = *(float *)(plVar19 + 3) + (float)uVar5;
    fStack_4c = *(float *)((longlong)plVar19 + 0x1c) + (float)((ulonglong)uVar5 >> 0x20);
    uStack_58 = CONCAT44(*(float *)((longlong)plVar19 + 0x14) + (float)((ulonglong)uVar4 >> 0x20),
                         *(float *)(plVar19 + 2) + (float)uVar4);
    FUN_7ff70c83f480(&uStack_60,*plVar19,&uStack_58,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2030));
    if ((*(byte *)(lVar8 + 0x202c) & 0x40) != 0) {
      lVar11 = *plVar19;
      uVar21 = 0;
      if (*piVar14 == 2) {
        uVar21 = *(undefined4 *)(lVar11 + 0xa4);
      }
      *(undefined4 *)(lVar11 + 0xac) = uVar21;
      *(undefined4 *)(lVar11 + 0xb4) = 0;
      *(undefined4 *)(lVar11 + 0xbc) = 0;
    }
  }
  lVar11 = *plVar19;
  if (*(longlong *)(lVar8 + 0x1f98) != lVar11) {
    if ((*(byte *)(lVar8 + 0x27b4) & 4) != 0) {
      FUN_7ff70c800cf0(&UNK_7ff70cb91b2e,*(undefined8 *)(lVar11 + 8));
      lVar11 = *plVar19;
    }
    *(longlong *)(lVar8 + 0x1f98) = lVar11;
    *(undefined8 *)(lVar8 + 0x1fe0) = 0xffffffffffffffff;
  }
  lVar11 = _DAT_7ff70cc1a3c0;
  iVar13 = *(int *)(lVar8 + 0x14b4);
  uVar10 = *(uint *)(lVar8 + 0x202c);
  if ((iVar13 != (int)plVar19[1]) && (iVar13 = (int)plVar19[1], -1 < (short)uVar10)) {
    iVar13 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
    if (iVar13 == 0) {
      *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x14c0) = 0;
    }
    else {
      if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
         (iVar13 == *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
        if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
          FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
          iVar13 = *(int *)(lVar11 + 0x14b4);
        }
        *(undefined8 *)(lVar11 + 0x1460) = 0;
      }
      *(int *)(lVar11 + 0x14e8) = iVar13;
      *(uint *)(lVar11 + 0x14ec) =
           (uint)(*(int *)(lVar11 + 0x1e20) != iVar13) + *(int *)(lVar11 + 5000);
      *(undefined1 *)(lVar11 + 0x14f0) = *(undefined1 *)(lVar11 + 0x14c4);
      *(bool *)(lVar11 + 0x14f1) = *(int *)(lVar11 + 0x14b8) == iVar13;
      if (*(int *)(lVar11 + 0x241c) == iVar13) {
        FUN_7ff70c8934e0(iVar13);
        iVar13 = *(int *)(lVar11 + 0x14b4);
      }
      *(bool *)(lVar11 + 0x14c0) = iVar13 != 0;
      if (iVar13 != 0) {
        if ((*(byte *)(lVar11 + 0x27b4) & 2) != 0) {
          puVar16 = &UNK_7ff70cb923a7;
          if (*(longlong *)(lVar11 + 0x14d8) != 0) {
            puVar16 = *(undefined **)(*(longlong *)(lVar11 + 0x14d8) + 8);
          }
          puStack_68 = &UNK_7ff70cb923a7;
          FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar13,puVar16,0);
        }
        *(undefined4 *)(lVar11 + 0x14bc) = 0;
        *(undefined2 *)(lVar11 + 0x14c3) = 0;
        *(undefined1 *)(lVar11 + 0x14c8) = 0xff;
      }
    }
    *(undefined4 *)(lVar11 + 0x14b4) = 0;
    *(undefined2 *)(lVar11 + 0x14c1) = 0;
    *(undefined8 *)(lVar11 + 0x14d8) = 0;
    *(undefined2 *)(lVar11 + 0x14c5) = 0;
    *(undefined4 *)(lVar11 + 0x1dd0) = 0;
    *(undefined1 *)(lVar11 + 0x1dd4) = 0;
    iVar13 = (int)plVar19[1];
    uVar10 = *puVar12;
  }
  if (((uVar10 & 0x800) != 0 || *(int *)(lVar8 + 0x1f94) != iVar13) && ((uVar10 & 0x2000) == 0)) {
    *(undefined4 *)(lVar8 + 0x2150) = *(undefined4 *)(lVar8 + 0x1fa0);
    *(int *)(lVar8 + 0x2154) = (int)plVar19[1];
    *(undefined4 *)(lVar8 + 0x2158) = *(undefined4 *)((longlong)plVar19 + 0xc);
    *(undefined4 *)(lVar8 + 0x215c) = *(undefined4 *)(lVar8 + 0x2034);
    *(byte *)(lVar8 + 0x2160) = (byte)(uVar10 >> 10) & 1;
    *(byte *)(lVar8 + 0x2161) = (byte)(*(uint *)(plVar19 + 4) >> 0x15) & 1;
    iVar13 = (int)plVar19[1];
  }
  lVar11 = *(longlong *)(lVar8 + 0x1f98);
  iVar15 = *(int *)(lVar8 + 0x1fa4);
  if ((*(byte *)(lVar8 + 0x27b4) & 0x10) != 0) {
    FUN_7ff70c800cf0(&UNK_7ff70cb91d74,iVar13,iVar15,*(undefined8 *)(lVar11 + 8));
    lVar11 = *(longlong *)(lVar8 + 0x1f98);
    iVar15 = *(int *)(lVar8 + 0x1fa4);
    iVar13 = (int)plVar19[1];
  }
  lVar9 = _DAT_7ff70cc1a3c0;
  lVar17 = (longlong)iVar15;
  uStack_58 = *(undefined8 *)(*(longlong *)(lVar11 + 0x3d8) + 0x418 + lVar17 * 8);
  uVar21 = *(undefined4 *)((longlong)plVar19 + 0xc);
  *(int *)(_DAT_7ff70cc1a3c0 + 0x1f94) = iVar13;
  *(int *)(lVar9 + 0x1fa4) = iVar15;
  FUN_7ff70c83e1d0(uVar21);
  *(int *)(*(longlong *)(lVar9 + 0x1f98) + 0x3f0 + lVar17 * 4) = iVar13;
  uVar21 = *(undefined4 *)((longlong)plVar19 + 0x14);
  lVar11 = plVar19[3];
  uVar7 = *(undefined4 *)((longlong)plVar19 + 0x1c);
  puVar1 = (undefined4 *)(*(longlong *)(lVar9 + 0x1f98) + 0x3f8 + lVar17 * 0x10);
  *puVar1 = (int)plVar19[2];
  puVar1[1] = uVar21;
  puVar1[2] = (int)lVar11;
  puVar1[3] = uVar7;
  *(undefined4 *)
   (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x418 +
   (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
  *(undefined4 *)
   (*(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3d8) + 0x41c +
   (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 8) = 0x7f7fffff;
  if (plVar19[6] != -1) {
    *(longlong *)(lVar8 + 0x1fe0) = plVar19[6];
  }
  uVar10 = *puVar12;
  if ((uVar10 & 0x400) == 0) {
    uStack_60 = CONCAT44(((float)((ulonglong)plVar19[3] >> 0x20) +
                         (float)((ulonglong)plVar19[2] >> 0x20)) * _UNK_7ff70cb1ba84,
                         ((float)plVar19[3] + (float)plVar19[2]) * _DAT_7ff70cb1ba80);
    *(undefined4 *)((longlong)&uStack_58 + (ulonglong)bVar20 * 4) =
         *(undefined4 *)((longlong)&uStack_60 + (ulonglong)bVar20 * 4);
    *(undefined8 *)
     (*(longlong *)(*(longlong *)(lVar8 + 0x1f98) + 0x3d8) + 0x418 +
     (longlong)*(int *)(lVar8 + 0x1fa4) * 8) = uStack_58;
    uVar10 = *(uint *)(lVar8 + 0x202c);
    if ((uVar10 & 0x400) != 0) goto LAB_7ff70c85531d;
  }
  else {
LAB_7ff70c85531d:
    if ((*(byte *)((longlong)plVar19 + 0x22) & 0x10) == 0) {
      uVar10 = uVar10 & 0xffffefff;
      *puVar12 = uVar10;
    }
  }
  if ((uVar10 & 0x1000) != 0) {
    *(int *)(lVar8 + 0x1fd0) = (int)plVar19[1];
    *(uint *)(lVar8 + 0x1fd4) = (int)(uVar10 << 0x15) >> 0x1f & 0xd;
    uVar10 = *(uint *)(lVar8 + 0x202c);
  }
  lVar8 = _DAT_7ff70cc1a3c0;
  if ((uVar10 & 0x4000) == 0) {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x56) == '\x01') {
      *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x1f90) = 1;
    }
    *(undefined2 *)(lVar8 + 0x1f91) = 0x101;
  }
LAB_7ff70c855375:
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_88)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_88);
  pcVar6 = (code *)swi(3);
  (*pcVar6)();
  return;
}


