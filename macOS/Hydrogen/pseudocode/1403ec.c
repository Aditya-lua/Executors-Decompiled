
/* WARNING: Possible PIC construction at 0x0014050c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001405bc: Changing call to branch */

void FUN_001403ec(undefined1 param_1 [16],double param_2)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  long lVar4;
  undefined1 *puVar5;
  ulong uVar6;
  bool bVar7;
  int iVar8;
  undefined8 uVar9;
  long lVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 uVar14;
  ulong uVar15;
  long *plVar16;
  uint uVar17;
  byte bVar18;
  ulong unaff_x20;
  ulong *puVar19;
  undefined8 unaff_x21;
  ulong *puVar20;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar21;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  ulong uVar22;
  undefined1 *unaff_x29;
  double dVar23;
  float fVar24;
  undefined4 uVar25;
  undefined1 uStack0000000000000080;
  undefined1 auStack_50 [8];
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined8 uStack_8;
  
  func_0x00143508();
  uVar9 = __Unwind_Resume();
  func_0x00143508(&uStack0000000000000080);
  lVar10 = __Unwind_Resume(uVar9);
  func_0x00143508(&uStack0000000000000080);
  lVar11 = __Unwind_Resume(lVar10);
  uStack_8 = 0x140420;
  puVar5 = auStack_50;
  uVar12 = func_0x000c2db8();
  cVar2 = *(char *)(uVar12 + 0xe55);
  bVar7 = *(char *)(uVar12 + 0x51) != '\0';
  uVar17 = (uint)*(byte *)(uVar12 + 0xe54);
  if (bVar7) {
    uVar17 = (uint)*(byte *)(uVar12 + 0xe57);
  }
  uVar21 = (ulong)uVar17;
  uVar1 = (uint)*(byte *)(uVar12 + 0xe56);
  if (bVar7) {
    uVar1 = (uint)*(byte *)(uVar12 + 0xe54);
  }
  iVar8 = func_0x000d3a04(0);
  if (iVar8 == 0) {
    return;
  }
  if (uVar1 != 0 || cVar2 != '\0') {
    return;
  }
  uVar9 = func_0x000cfd38(0,0);
  uVar13 = func_0x000d7098(0);
  dVar23 = (double)func_0x000c2de8();
  if (((int)uVar9 == 0) || ((uVar13 & 1) != 0)) {
LAB_00140530:
    uVar25 = SUB84(param_2,0);
    if ((int)uVar13 == 0) {
      if ((int)uVar9 == 0) {
        iVar8 = func_0x000d7228(0xbf800000,0);
        if ((iVar8 == 0) || (iVar8 = func_0x000cece8(0), iVar8 == 0)) {
          return;
        }
        *(undefined1 *)(uVar12 + 0xc2) = 1;
        uStack_48 = func_0x000d726c();
        uStack_44 = uVar25;
        uVar9 = func_0x00139b18(lVar11,&uStack_48);
        *(undefined8 *)(lVar11 + 0x2a0) = uVar9;
        *(undefined8 *)(lVar11 + 0x30) = uVar9;
        iVar8 = *(int *)(lVar11 + 0x74);
        goto SUB_0014064c;
      }
      uVar15 = (ulong)(uVar21 != 0);
      uStack_48 = func_0x000d726c();
      uStack_44 = uVar25;
      uVar14 = func_0x00139b18(lVar11,&uStack_48);
      *(undefined8 *)(lVar11 + 0x2a0) = uVar14;
      *(undefined8 *)(lVar11 + 0x298) = uVar14;
      *(undefined8 *)(lVar11 + 0x30) = uVar14;
      *(uint *)(lVar11 + 0x74) = (uint)(uVar21 != 0);
      unaff_x20 = uVar15;
    }
    else {
      if (uVar17 != 0) {
        dVar23 = (double)func_0x000c2de8();
        *(float *)(lVar11 + 0x2c8) = (float)dVar23;
        return;
      }
      uStack_48 = func_0x000d726c();
      uStack_44 = uVar25;
      uVar14 = func_0x00139b18(lVar11,&uStack_48);
      *(undefined8 *)(lVar11 + 0x2a0) = uVar14;
      *(undefined8 *)(lVar11 + 0x298) = uVar14;
      *(undefined8 *)(lVar11 + 0x30) = uVar14;
      bVar7 = *(int *)(lVar11 + 0x74) != 2;
      uVar15 = (ulong)bVar7;
      *(uint *)(lVar11 + 0x74) = (uint)bVar7;
      unaff_x20 = uVar12;
    }
    iVar8 = (int)uVar15;
    uStack_8 = 0x1405c0;
    register0x00000008 = (BADSPACEBASE *)auStack_50;
    lVar10 = lVar11;
    unaff_x21 = uVar9;
    unaff_x22 = uVar13;
    unaff_x23 = uVar21;
    unaff_x29 = puVar5 + 0x40;
  }
  else {
    fVar24 = *(float *)(lVar11 + 0x2c8);
    param_2 = (double)(ulong)(uint)fVar24;
    if ((fVar24 == -1.0) ||
       (param_2 = (double)*(float *)(uVar12 + 0x5c), param_2 <= dVar23 - (double)fVar24))
    goto LAB_00140530;
    if (uVar17 != 0) {
      *(undefined4 *)(lVar11 + 0x2c8) = 0xbf800000;
      return;
    }
    uStack_48 = func_0x000d726c();
    uStack_44 = SUB84(param_2,0);
    uVar14 = func_0x00139b18(lVar11,&uStack_48);
    *(undefined8 *)(lVar11 + 0x2a0) = uVar14;
    *(undefined8 *)(lVar11 + 0x298) = uVar14;
    *(undefined8 *)(lVar11 + 0x30) = uVar14;
    *(undefined4 *)(lVar11 + 0x74) = 2;
    iVar8 = 2;
    uStack_8 = 0x140510;
    register0x00000008 = (BADSPACEBASE *)auStack_50;
    lVar10 = lVar11;
    unaff_x20 = uVar12;
    unaff_x21 = uVar9;
    unaff_x22 = uVar13;
    unaff_x23 = uVar21;
    unaff_x29 = puVar5 + 0x40;
  }
SUB_0014064c:
  *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
  *(undefined8 *)((long)register0x00000008 + -0x48) = unaff_x25;
  *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
  *(ulong *)((long)register0x00000008 + -0x38) = unaff_x23;
  *(ulong *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(undefined8 *)((long)register0x00000008 + -0x28) = unaff_x21;
  *(ulong *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long *)((long)register0x00000008 + -0x18) = lVar10;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
  puVar20 = (ulong *)(lVar11 + 0x20);
  uVar22 = *puVar20;
  puVar19 = (ulong *)(lVar11 + 0x28);
  uVar15 = *puVar19;
  uVar21 = func_0x00137dcc(lVar11,lVar11 + 0x298);
  *puVar20 = uVar21;
  uVar13 = func_0x00137dcc(lVar11,lVar11 + 0x2a0);
  *puVar19 = uVar13;
  uVar12 = uVar21;
  if ((int)uVar21 == (int)uVar13) {
    uVar6 = uVar21;
    if ((int)(uVar13 >> 0x20) < (int)(uVar21 >> 0x20)) goto LAB_001406cc;
  }
  else {
    uVar6 = uVar13;
    if ((int)uVar13 < (int)uVar21) {
LAB_001406cc:
      *puVar20 = uVar13;
      *puVar19 = uVar21;
      uVar12 = uVar13;
      uVar6 = uVar21;
    }
  }
  if (iVar8 == 2) {
    *(ulong *)(lVar11 + 0x20) = uVar12 & 0xffffffff;
    if ((ulong)(long)(int)uVar6 <
        (ulong)((*(long *)(lVar11 + 0x10) - *(long *)(lVar11 + 8) >> 3) * -0x5555555555555555)) {
      plVar16 = (long *)(*(long *)(lVar11 + 8) + (long)(int)uVar6 * 0x18);
      lVar10 = *plVar16;
      lVar4 = plVar16[1] - lVar10;
      if (lVar4 != 0) {
        uVar12 = 0;
        uVar17 = 0;
        do {
          bVar18 = *(byte *)(lVar10 + uVar12 * 0xc);
          if (bVar18 == 9) {
            iVar8 = *(int *)(lVar11 + 0x54);
            iVar3 = 0;
            if (iVar8 != 0) {
              iVar3 = (int)uVar17 / iVar8;
            }
            uVar17 = iVar8 + iVar3 * iVar8;
            bVar18 = 0;
LAB_001407ec:
            iVar8 = 1;
            if ((bVar18 & 0xe0) == 0xc0) {
              iVar8 = 2;
            }
          }
          else {
            uVar17 = uVar17 + 1;
            if ((bVar18 & 0xfe) == 0xfc) {
              iVar8 = 6;
            }
            else if ((bVar18 & 0xfc) == 0xf8) {
              iVar8 = 5;
            }
            else if ((bVar18 & 0xf8) == 0xf0) {
              iVar8 = 4;
            }
            else {
              if ((bVar18 & 0xf0) != 0xe0) goto LAB_001407ec;
              iVar8 = 3;
            }
          }
          uVar12 = (ulong)(uint)(iVar8 + (int)uVar12);
        } while (uVar12 < (ulong)((lVar4 >> 2) * -0x5555555555555555));
        *puVar19 = (ulong)uVar17 << 0x20 | uVar6 & 0xffffffff;
        iVar8 = *(int *)puVar20;
        goto joined_r0x00140880;
      }
    }
    *puVar19 = uVar6 & 0xffffffff;
    iVar8 = *(int *)puVar20;
  }
  else {
    if (iVar8 == 1) {
      uVar9 = func_0x00139e40(lVar11,puVar20);
      *(undefined8 *)(lVar11 + 0x20) = uVar9;
      uVar12 = func_0x0013ac98(lVar11,puVar19);
      if ((uVar12 & 1) == 0) {
        uVar9 = func_0x00139e40(lVar11,puVar19);
        *(undefined8 *)((long)register0x00000008 + -0x58) = uVar9;
        uVar9 = func_0x0013a1dc(lVar11,(undefined1 *)((long)register0x00000008 + -0x58));
        *(undefined8 *)(lVar11 + 0x28) = uVar9;
      }
    }
    iVar8 = *(int *)puVar20;
  }
joined_r0x00140880:
  if ((((iVar8 != (int)uVar22) || (*(int *)(lVar11 + 0x24) != (int)(uVar22 >> 0x20))) ||
      (*(int *)puVar19 != (int)uVar15)) || (*(int *)(lVar11 + 0x2c) != (int)(uVar15 >> 0x20))) {
    *(undefined1 *)(lVar11 + 0x68) = 1;
  }
  return;
}

