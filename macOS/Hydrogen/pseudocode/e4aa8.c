
/* WARNING: Possible PIC construction at 0x000e52d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000e52ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000e5470: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e52d4) */
/* WARNING: Removing unreachable block (ram,0x000e5474) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e4aa8(long param_1)

{
  undefined1 *puVar1;
  int *piVar2;
  char *pcVar3;
  undefined1 *puVar4;
  byte bVar5;
  int iVar6;
  int iVar7;
  char *pcVar8;
  uint *puVar9;
  char *in_x3;
  long lVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  uint uVar17;
  uint uVar18;
  char *unaff_x19;
  float *pfVar19;
  undefined8 *puVar20;
  undefined8 *unaff_x20;
  long unaff_x21;
  dword *unaff_x22;
  long unaff_x23;
  char *pcVar21;
  char *pcVar22;
  dword *unaff_x24;
  dword *pdVar23;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined1 *puVar24;
  undefined *puVar25;
  float fVar26;
  float fVar27;
  float fVar28;
  undefined8 uVar29;
  float fVar30;
  float fVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined1 auVar35 [12];
  long lStack0000000000000000;
  undefined1 uStack0000000000000014;
  long in_stack_00000028;
  
  do {
    lStack0000000000000000 = param_1;
    func_0x000b875c(&uStack0000000000000014,0x14);
    func_0x000e6884(unaff_x22,&uStack0000000000000014);
    lVar10 = *(long *)(unaff_x24 + 0x130);
    lVar11 = *(long *)(lVar10 + 0x4000);
    *(char *)(lVar11 + 0xc0) = (char)unaff_x25;
    fVar26 = *(float *)(&UNK_00003954 + lVar10) + *(float *)(lVar11 + 0x154);
    *(float *)(lVar11 + 0x154) = fVar26;
    *(float *)(lVar11 + 0x110) = fVar26 + *(float *)(lVar11 + 0x28) + *(float *)(lVar11 + 0x158);
    pdVar23 = unaff_x22;
    func_0x000e4a34(unaff_x20,(int)unaff_x23 + -1);
    lVar10 = *(long *)(unaff_x24 + 0x130);
    lVar11 = *(long *)(lVar10 + 0x4000);
    *(char *)(lVar11 + 0xc0) = (char)unaff_x25;
    fVar26 = *(float *)(lVar11 + 0x154) - *(float *)(&UNK_00003954 + lVar10);
    *(float *)(lVar11 + 0x154) = fVar26;
    *(float *)(lVar11 + 0x110) = fVar26 + *(float *)(lVar11 + 0x28) + *(float *)(lVar11 + 0x158);
    puVar20 = unaff_x20;
    do {
      unaff_x20 = puVar20 + 1;
      unaff_x23 = unaff_x23 + -1;
      if (unaff_x23 == 0) {
        if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
          return;
        }
        puVar25 = &SUB_000e4b74;
        pcVar8 = (char *)___stack_chk_fail();
        puVar4 = (undefined1 *)register0x00000008;
        pcVar21 = (char *)0x0;
        goto code_r0x000e4b74;
      }
      unaff_x22 = (dword *)*puVar20;
      puVar20 = unaff_x20;
    } while (*(char **)(unaff_x22 + 0xe0) != unaff_x19);
    param_1 = (long)*(short *)((long)unaff_x22 + 0xd2);
  } while( true );
code_r0x000e4b74:
  pcVar22 = pcRam0000000000a334c0;
  *(undefined8 *)(puVar4 + -0x70) = unaff_d9;
  *(undefined8 *)(puVar4 + -0x68) = unaff_d8;
  *(undefined8 *)(puVar4 + -0x60) = unaff_x28;
  *(undefined8 *)(puVar4 + -0x58) = unaff_x27;
  *(undefined8 *)(puVar4 + -0x50) = unaff_x26;
  *(undefined8 *)(puVar4 + -0x48) = unaff_x25;
  *(dword **)(puVar4 + -0x40) = unaff_x24;
  *(char **)(puVar4 + -0x38) = pcVar21;
  *(dword **)(puVar4 + -0x30) = unaff_x22;
  *(long *)(puVar4 + -0x28) = unaff_x21;
  *(undefined8 **)(puVar4 + -0x20) = unaff_x20;
  *(char **)(puVar4 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar4 + -0x10) = unaff_x29;
  *(undefined **)(puVar4 + -8) = puVar25;
  puVar24 = puVar4 + -0x10;
  *(undefined8 *)(puVar4 + -0x80) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  uVar18 = *pdVar23;
  pfVar19 = (float *)(ulong)uVar18;
  uVar17 = uVar18 - 1;
  if ((0 < (int)uVar18) && (*(int *)(*(long *)(pdVar23 + 2) + (ulong)uVar17 * 0x38 + 0x20) == 0)) {
    if (*(long *)(*(long *)(pdVar23 + 2) + (ulong)uVar17 * 0x38 + 0x28) != 0) {
      uVar17 = uVar18;
    }
    pfVar19 = (float *)(ulong)uVar17;
  }
  lVar10 = 0xa33000;
  pcVar21 = "";
  if (*(char **)(pdVar23 + 0x10) != (char *)0x0) {
    pcVar21 = *(char **)(pdVar23 + 0x10);
  }
  uVar17 = pdVar23[8];
  *(ulong *)(puVar4 + -0x248) = (ulong)pdVar23[4];
  *(float **)(puVar4 + -0x240) = pfVar19;
  *(char **)(puVar4 + -600) = pcVar21;
  *(ulong *)(puVar4 + -0x250) = (ulong)uVar17;
  *(char **)(puVar4 + -0x260) = in_x3;
  unaff_x22 = (dword *)func_0x001227f4(pdVar23,"%s: \'%s\' %d vtx, %d indices, %d cmds");
  pcVar3 = pcRam0000000000a334c0;
  lVar11 = *(long *)(pcRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar11 + 0xc0) = 1;
  pcVar21 = pcVar22;
  unaff_x24 = pdVar23;
  if (*(uint **)(lVar11 + 0x2a8) == pdVar23) {
    if (*(char *)(lVar11 + 0xc3) == '\0') {
      *(float *)(lVar11 + 0x110) = *(float *)(pcVar3 + 0x3934) + *(float *)(lVar11 + 0x118);
      *(undefined4 *)(lVar11 + 0x114) = *(undefined4 *)(lVar11 + 0x11c);
      *(undefined8 *)(lVar11 + 0x138) = *(undefined8 *)(lVar11 + 0x140);
      *(undefined4 *)(lVar11 + 0x148) = *(undefined4 *)(lVar11 + 0x14c);
      *(undefined1 *)(lVar11 + 0x150) = 1;
    }
    *(undefined8 *)(puVar4 + -0x1b8) = _UNK_0080c358;
    *(undefined8 *)(puVar4 + -0x1c0) = _UNK_0080c350;
    func_0x0010ae94(puVar4 + -0x1c0,"CURRENTLY APPENDING");
    if (((ulong)unaff_x22 & 1) != 0) goto LAB_000e52ec;
  }
  else {
    lVar10 = func_0x000c2e18(**(undefined8 **)(pcVar3 + 0x4b10),1,"##Foreground");
    *(dword **)(puVar4 + -0x218) = pdVar23;
    if (pcVar8 == (char *)0x0) {
      if (((ulong)unaff_x22 & 1) != 0) goto LAB_000e4d28;
    }
    else {
      iVar6 = func_0x000c2648(0);
      if ((iVar6 != 0) && (lVar10 != 0)) {
        uVar29 = *(undefined8 *)(pcVar8 + 0x28);
        *(ulong *)(puVar4 + -0x1c0) =
             CONCAT44((float)((ulong)uVar29 >> 0x20) +
                      (float)((ulong)*(undefined8 *)(pcVar8 + 0x30) >> 0x20),
                      (float)uVar29 + (float)*(undefined8 *)(pcVar8 + 0x30));
        func_0x000f3af4(0,0x3f800000,lVar10,pcVar8 + 0x28,puVar4 + -0x1c0,0xff00ffff,0);
        pdVar23 = *(dword **)(puVar4 + -0x218);
      }
      unaff_x24 = pdVar23;
      if (((ulong)unaff_x22 & 1) != 0) {
        if (pcVar8[0xbf] == '\0') {
          func_0x0010afc0("Warning: owning Window is inactive. This DrawList is not being rendered!"
                         );
          pdVar23 = *(dword **)(puVar4 + -0x218);
        }
LAB_000e4d28:
        unaff_x24 = pdVar23;
        if ((int)pfVar19 < 1) goto LAB_000e52ec;
        pcVar21 = pcVar22 + 0x6095;
        *(char **)(puVar4 + -0x228) = pcVar21;
        *(long *)(puVar4 + -0x220) = (long)(int)pfVar19;
        pfVar19 = *(float **)(pdVar23 + 2);
        unaff_x22 = &MACH_HEADER.sizeofcmds;
        pcVar8 = "     ";
        goto code_r0x000e4da4;
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar4 + -0x80)) {
    return;
  }
  auVar35 = ___stack_chk_fail();
  uVar29 = auVar35._0_8_;
  if (auVar35._8_4_ == 0) {
    __Unwind_Resume(uVar29);
  }
  puVar9 = (uint *)func_0x0001753c(uVar29);
  *(dword **)(puVar4 + -0x290) = unaff_x22;
  *(char **)(puVar4 + -0x288) = pcVar8;
  *(long *)(puVar4 + -0x280) = lVar10;
  *(undefined8 *)(puVar4 + -0x278) = uVar29;
  *(undefined1 **)(puVar4 + -0x270) = puVar24;
  *(undefined **)(puVar4 + -0x268) = &DAT_000e536c;
  unaff_x29 = puVar4 + -0x270;
  func_0x001237f8(1,2);
  *(undefined8 *)(puVar4 + -0x2d0) = 0;
  iVar6 = func_0x001226d4("viewport0","Viewport #%d");
  if (iVar6 == 0) {
    return;
  }
  uVar17 = *puVar9;
  fVar26 = (float)puVar9[1];
  fVar27 = (float)puVar9[2];
  fVar30 = (float)puVar9[3];
  fVar32 = (float)puVar9[4];
  fVar28 = (float)puVar9[0x2a];
  fVar31 = (float)puVar9[0x2b];
  fVar33 = (float)puVar9[0x2d];
  *(double *)(puVar4 + -0x2a0) = (double)(float)puVar9[0x2c];
  *(double *)(puVar4 + -0x298) = (double)fVar33;
  *(double *)(puVar4 + -0x2b0) = (double)fVar28;
  *(double *)(puVar4 + -0x2a8) = (double)fVar31;
  *(double *)(puVar4 + -0x2c0) = (double)fVar30;
  *(double *)(puVar4 + -0x2b8) = (double)fVar32;
  *(double *)(puVar4 + -0x2d0) = (double)fVar26;
  *(double *)(puVar4 + -0x2c8) = (double)fVar27;
  func_0x0010b3a8(
                 "Main Pos: (%.0f,%.0f), Size: (%.0f,%.0f)\nWorkArea Offset Left: %.0f Top: %.0f, Right: %.0f, Bottom: %.0f"
                 );
  pcVar8 = "";
  if ((uVar17 & 1) != 0) {
    pcVar8 = " IsPlatformWindow";
  }
  pcVar21 = "";
  if ((uVar17 & 2) != 0) {
    pcVar21 = " IsPlatformMonitor";
  }
  pcVar3 = "";
  if ((uVar17 & 4) != 0) {
    pcVar3 = " OwnedByApp";
  }
  uVar17 = *puVar9;
  *(char **)(puVar4 + -0x2c0) = pcVar21;
  *(char **)(puVar4 + -0x2b8) = pcVar3;
  *(ulong *)(puVar4 + -0x2d0) = (ulong)uVar17;
  *(char **)(puVar4 + -0x2c8) = pcVar8;
  func_0x0010b3a8("Flags: 0x%04X =%s%s%s");
  if (puVar9[0x16] == 0) goto code_r0x000e547c;
  unaff_x21 = (long)(int)puVar9[0x16] << 3;
  unaff_x19 = "DrawList";
  unaff_x20 = *(undefined8 **)(puVar9 + 0x18) + 1;
  pdVar23 = (dword *)**(undefined8 **)(puVar9 + 0x18);
  pcVar8 = (char *)0x0;
  in_x3 = "DrawList";
  puVar25 = &UNK_000e5474;
  puVar4 = puVar4 + -0x2d0;
  pcVar21 = pcVar22;
  goto code_r0x000e4b74;
code_r0x000e547c:
  puVar24 = *(undefined1 **)(puVar4 + -0x270);
  puVar25 = *(undefined **)(puVar4 + -0x268);
  lVar10 = *(long *)(puVar4 + -0x280);
  pfVar19 = *(float **)(puVar4 + -0x278);
  unaff_x22 = *(dword **)(puVar4 + -0x290);
  pcVar8 = *(char **)(puVar4 + -0x288);
  goto code_r0x00123710;
code_r0x000e4da4:
  do {
    if (*(long *)(pfVar19 + 10) == 0) {
      *(undefined8 *)(puVar4 + -0x260) = *(undefined8 *)(pfVar19 + 4);
      func_0x000b875c(puVar4 + -0x94,0x14,"0x%p");
      fVar26 = pfVar19[8];
      fVar27 = *pfVar19;
      fVar30 = pfVar19[1];
      fVar32 = pfVar19[3];
      *(double *)(puVar4 + -0x240) = (double)pfVar19[2];
      *(double *)(puVar4 + -0x238) = (double)fVar32;
      *(double *)(puVar4 + -0x250) = (double)fVar27;
      *(double *)(puVar4 + -0x248) = (double)fVar30;
      *(ulong *)(puVar4 + -0x260) = (ulong)(uint)fVar26 / 3;
      *(undefined1 **)(puVar4 + -600) = puVar4 + -0x94;
      func_0x000b875c(puVar4 + -0x1c0,300,
                      "DrawCmd:%5d tris, Tex %s, ClipRect (%4.0f,%4.0f)-(%4.0f,%4.0f)");
      lVar11 = *(long *)(pdVar23 + 2);
      *(float **)(puVar4 + -0x210) = pfVar19;
      *(undefined1 **)(puVar4 + -0x260) = puVar4 + -0x1c0;
      iVar6 = func_0x001227f4(((long)pfVar19 - lVar11 >> 3) * 0x6db6db6db6db6db7,"%s");
      iVar7 = func_0x000c2648(0);
      pdVar23 = *(dword **)(puVar4 + -0x218);
      pfVar19 = *(float **)(puVar4 + -0x210);
      if (iVar7 != 0) {
        if (*pcVar21 == '\0') {
          if ((pcVar22[0x6096] != '\0') && (lVar10 != 0)) {
            func_0x000e6400(lVar10,pdVar23,pfVar19,0,1);
            goto code_r0x000e4eb0;
          }
        }
        else if (lVar10 != 0) {
          func_0x000e6400(lVar10,pdVar23,pfVar19,1,pcVar22[0x6096]);
code_r0x000e4eb0:
          pdVar23 = *(dword **)(puVar4 + -0x218);
          pfVar19 = *(float **)(puVar4 + -0x210);
        }
      }
      if (iVar6 != 0) {
        if ((int)pdVar23[4] < 1) {
          lVar11 = 0;
        }
        else {
          lVar11 = *(long *)(pdVar23 + 6);
        }
        fVar27 = pfVar19[6];
        fVar30 = pfVar19[7];
        unaff_x24 = (dword *)(*(long *)(pdVar23 + 10) + (ulong)(uint)fVar27 * 0x14);
        fVar32 = pfVar19[8];
        fVar28 = 0.0;
        fVar26 = (float)((int)fVar32 + (int)fVar30);
        if ((uint)fVar30 < (uint)fVar26) {
          uVar15 = (ulong)(uint)fVar30;
          do {
            iVar6 = (int)uVar15;
            if (lVar11 == 0) {
              uVar17 = iVar6 + 1;
              uVar18 = iVar6 + 2;
            }
            else {
              uVar15 = (ulong)*(ushort *)(lVar11 + uVar15 * 2);
              uVar17 = (uint)*(ushort *)(lVar11 + (ulong)(iVar6 + 1) * 2);
              uVar18 = (uint)*(ushort *)(lVar11 + (ulong)(iVar6 + 2) * 2);
            }
            fVar31 = (float)(unaff_x24 + (ulong)uVar18 * 5)[1];
            fVar33 = (float)(unaff_x24 + (ulong)uVar17 * 5)[1];
            lVar13 = uVar15 * 5;
            fVar34 = (float)(unaff_x24 + lVar13)[1];
            uVar15 = (ulong)(iVar6 + 3U);
            fVar28 = fVar28 + ABS((float)unaff_x24[(ulong)uVar17 * 5] * (fVar31 - fVar34) +
                                  (fVar33 - fVar31) * (float)unaff_x24[lVar13] +
                                  (fVar34 - fVar33) * (float)unaff_x24[(ulong)uVar18 * 5]) * 0.5;
          } while (iVar6 + 3U < (uint)fVar26);
        }
        pfVar19 = (float *)(ulong)(lVar10 != 0);
        *(double *)(puVar4 + -0x248) = (double)fVar28;
        *(ulong *)(puVar4 + -600) = (ulong)(uint)fVar27;
        *(ulong *)(puVar4 + -0x250) = (ulong)(uint)fVar30;
        *(ulong *)(puVar4 + -0x260) = (ulong)(uint)fVar32;
        func_0x000b875c(puVar4 + -0x1c0,300,
                        "Mesh: ElemCount: %d, VtxOffset: +%d, IdxOffset: +%d, Area: ~%0.f px");
        *(undefined8 *)(puVar4 + -0x200) = 0;
        func_0x0010f27c(puVar4 + -0x1c0,0,0,puVar4 + -0x200);
        bVar5 = func_0x000c2648(0);
        if ((bVar5 & lVar10 != 0) != 0) {
          func_0x000e6400(lVar10,*(undefined8 *)(puVar4 + -0x218),*(undefined8 *)(puVar4 + -0x210),1
                          ,0);
        }
        *(undefined8 *)(puVar4 + -0x1e0) = 0;
        *(undefined8 *)(puVar4 + -0x1f8) = 0;
        *(undefined8 *)(puVar4 + -0x200) = 0;
        *(undefined8 *)(puVar4 + -0x1e8) = 0;
        *(undefined8 *)(puVar4 + -0x1f0) = 0;
        func_0x000bab98(0xbf800000,puVar4 + -0x200,
                        (ulong)*(uint *)(*(long *)(puVar4 + -0x210) + 0x20) / 3);
        while (iVar6 = func_0x000bb10c(puVar4 + -0x200), iVar6 != 0) {
          uVar17 = *(uint *)(puVar4 + -0x1f8);
          pcVar21 = (char *)(ulong)uVar17;
          if ((int)uVar17 < *(int *)(puVar4 + -500)) {
            uVar17 = *(int *)(*(long *)(puVar4 + -0x210) + 0x1c) + uVar17 * 3;
            do {
              *(undefined8 *)(puVar4 + -0x1d8) = 0;
              *(undefined8 *)(puVar4 + -0x1d0) = 0;
              *(undefined8 *)(puVar4 + -0x1c8) = 0;
              pfVar19 = (float *)(long)(int)uVar17;
              uVar18 = uVar17;
              if (lVar11 != 0) {
                uVar18 = (uint)*(ushort *)(lVar11 + (long)pfVar19 * 2);
              }
              pdVar23 = unaff_x24 + (long)(int)uVar18 * 5;
              *(undefined8 *)(puVar4 + -0x1d8) = *(undefined8 *)pdVar23;
              fVar26 = (float)*pdVar23;
              fVar27 = (float)pdVar23[1];
              fVar30 = (float)pdVar23[2];
              fVar32 = (float)pdVar23[3];
              *(ulong *)(puVar4 + -0x230) = (ulong)pdVar23[4];
              *(double *)(puVar4 + -0x240) = (double)fVar30;
              *(double *)(puVar4 + -0x238) = (double)fVar32;
              *(double *)(puVar4 + -0x250) = (double)fVar26;
              *(double *)(puVar4 + -0x248) = (double)fVar27;
              *(char **)(puVar4 + -0x260) = "Vert:";
              *(float **)(puVar4 + -600) = pfVar19;
              iVar6 = func_0x000b875c(puVar4 + -0x1c0,300,
                                      "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
              uVar15 = (long)pfVar19 + 1;
              if (lVar11 == 0) {
                uVar12 = uVar15;
              }
              else {
                uVar12 = (ulong)*(ushort *)(lVar11 + uVar15 * 2);
              }
              puVar1 = puVar4 + (long)iVar6 + -0x1c0;
              pdVar23 = unaff_x24 + (long)(int)uVar12 * 5;
              *(undefined8 *)(puVar4 + -0x1d0) = *(undefined8 *)pdVar23;
              fVar26 = (float)*pdVar23;
              fVar27 = (float)pdVar23[1];
              fVar30 = (float)pdVar23[2];
              fVar32 = (float)pdVar23[3];
              *(ulong *)(puVar4 + -0x230) = (ulong)pdVar23[4];
              *(double *)(puVar4 + -0x240) = (double)fVar30;
              *(double *)(puVar4 + -0x238) = (double)fVar32;
              *(double *)(puVar4 + -0x250) = (double)fVar26;
              *(double *)(puVar4 + -0x248) = (double)fVar27;
              *(char **)(puVar4 + -0x260) = "     ";
              *(ulong *)(puVar4 + -600) = uVar15;
              iVar6 = func_0x000b875c(puVar1,300 - (long)iVar6,
                                      "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
              uVar15 = (long)pfVar19 + 2;
              if (lVar11 == 0) {
                uVar12 = uVar15;
              }
              else {
                uVar12 = (ulong)*(ushort *)(lVar11 + uVar15 * 2);
              }
              pdVar23 = unaff_x24 + (long)(int)uVar12 * 5;
              *(undefined8 *)(puVar4 + -0x1c8) = *(undefined8 *)pdVar23;
              fVar26 = (float)*pdVar23;
              fVar27 = (float)pdVar23[1];
              fVar30 = (float)pdVar23[2];
              fVar32 = (float)pdVar23[3];
              *(ulong *)(puVar4 + -0x230) = (ulong)pdVar23[4];
              *(double *)(puVar4 + -0x240) = (double)fVar30;
              *(double *)(puVar4 + -0x238) = (double)fVar32;
              *(double *)(puVar4 + -0x250) = (double)fVar26;
              *(double *)(puVar4 + -0x248) = (double)fVar27;
              *(char **)(puVar4 + -0x260) = "     ";
              *(ulong *)(puVar4 + -600) = uVar15;
              func_0x000b875c(puVar1 + iVar6,puVar4 + (-0x94 - (long)(puVar1 + iVar6)),
                              "%s %04d: pos (%8.2f,%8.2f), uv (%.6f,%.6f), col %08X\n");
              *(undefined8 *)(puVar4 + -0x208) = 0;
              func_0x0010f27c(puVar4 + -0x1c0,0,0,puVar4 + -0x208);
              if (lVar10 != 0) {
                lVar13 = *(long *)(pcRam0000000000a334c0 + 0x4000);
                if ((pcRam0000000000a334c0[0x4b7b] == '\0') ||
                   (pcRam0000000000a334c0[0x4b7a] != '\0')) {
                  if (((*(uint *)(pcRam0000000000a334c0 + 0x49b0) & 1) != 0) &&
                     (((*(uint *)(pcRam0000000000a334c0 + 0x49b0) >> 7 & 1) != 0 ||
                      (*(long *)(pcRam0000000000a334c0 + 0x4008) == lVar13)))) {
                    iVar6 = *(int *)(pcRam0000000000a334c0 + 0x49a8);
                    iVar7 = *(int *)(pcRam0000000000a334c0 + 0x4064);
                    if ((iVar7 == 0) ||
                       (((iVar7 == iVar6 || (pcRam0000000000a334c0[0x4071] != '\0')) ||
                        (iVar7 == *(int *)(lVar13 + 0x84))))) {
                      if ((((*(long *)(pcRam0000000000a334c0 + 0x4b18) != 0) &&
                           (lVar14 = *(long *)(*(long *)(pcRam0000000000a334c0 + 0x4b18) + 0x388),
                           lVar14 != 0)) &&
                          ((*(char *)(lVar14 + 0xbf) != '\0' &&
                           ((lVar16 = *(long *)(lVar13 + 0x388), lVar14 != lVar16 &&
                            ((*(byte *)(lVar14 + 0x17) & 0xc) != 0)))))) &&
                         (*(long *)(lVar16 + 0x388) != lVar14)) {
                        do {
                          if (lVar16 == lVar14) goto code_r0x000e5258;
                          lVar16 = *(long *)(lVar16 + 0x380);
                        } while (lVar16 != 0);
                        if ((pcRam0000000000a334c0[0x49ad] & 1U) == 0) goto code_r0x000e5038;
                      }
code_r0x000e5258:
                      if ((((*(uint *)(pcRam0000000000a334c0 + 0x49ac) >> 2 & 1) == 0) &&
                          ((iVar6 != *(int *)(lVar13 + 0x84) || (*(char *)(lVar13 + 0xc0) == '\0')))
                          ) && (((*(uint *)(pcRam0000000000a334c0 + 0x49ac) >> 9 & 1) == 0 ||
                                ((iVar6 == 0 || (*(int *)(pcRam0000000000a334c0 + 0x4054) == iVar6))
                                )))) goto code_r0x000e52a0;
                    }
                  }
                }
                else if ((((byte)pcRam0000000000a334c0[0x49ac] >> 2 & 1) == 0) &&
                        ((*(int *)(pcRam0000000000a334c0 + 0x4b20) != 0 &&
                         (*(int *)(pcRam0000000000a334c0 + 0x4b20) ==
                          *(int *)(pcRam0000000000a334c0 + 0x49a8))))) {
code_r0x000e52a0:
                  uVar18 = *(uint *)(lVar10 + 0x30);
                  *(uint *)(lVar10 + 0x30) = uVar18 & 0xfffffffe;
                  func_0x000f0ff4(0x3f800000,lVar10,puVar4 + -0x1d8,3,0xff00ffff,1);
                  *(uint *)(lVar10 + 0x30) = uVar18;
                }
              }
code_r0x000e5038:
              uVar17 = uVar17 + 3;
              uVar18 = (int)pcVar21 + 1;
              pcVar21 = (char *)(ulong)uVar18;
            } while ((int)uVar18 < *(int *)(puVar4 + -500));
          }
        }
        puVar25 = &UNK_000e52d4;
        pcVar22 = pcVar21;
        goto code_r0x00123710;
      }
    }
    else {
      uVar29 = *(undefined8 *)(pfVar19 + 0xc);
      *(long *)(puVar4 + -0x260) = *(long *)(pfVar19 + 10);
      *(undefined8 *)(puVar4 + -600) = uVar29;
      func_0x0010b3a8("Callback %p, user_data %p");
      pdVar23 = *(dword **)(puVar4 + -0x218);
    }
    pfVar19 = pfVar19 + 0xe;
    unaff_x24 = pdVar23;
  } while (pfVar19 < (float *)(*(long *)(pdVar23 + 2) +
                              (long)(int)*(undefined8 *)(puVar4 + -0x220) * 0x38));
LAB_000e52ec:
  pcVar22 = pcVar21;
  puVar25 = &LAB_000e52f0;
code_r0x00123710:
  pcVar21 = pcRam0000000000a334c0;
  *(dword **)(puVar4 + -0x2a0) = unaff_x24;
  *(char **)(puVar4 + -0x298) = pcVar22;
  *(dword **)(puVar4 + -0x290) = unaff_x22;
  *(char **)(puVar4 + -0x288) = pcVar8;
  *(long *)(puVar4 + -0x280) = lVar10;
  *(float **)(puVar4 + -0x278) = pfVar19;
  *(undefined1 **)(puVar4 + -0x270) = puVar24;
  *(undefined **)(puVar4 + -0x268) = puVar25;
  lVar10 = *(long *)(pcRam0000000000a334c0 + 0x4000);
  func_0x000d8674(0);
  uVar17 = *(int *)(lVar10 + 0x198) - 1;
  *(uint *)(lVar10 + 0x198) = uVar17;
  uVar18 = 1 << (ulong)(uVar17 & 0x1f);
  uVar17 = *(uint *)(lVar10 + 0x19c);
  if ((uVar17 & uVar18) != 0) {
    piVar2 = (int *)(pcVar21 + 0x4af0);
    if (((pcVar21[0x4b78] != '\0') && (*(int *)(pcVar21 + 0x4bd0) == 0)) &&
       (*(long *)(pcVar21 + 0x4b18) == lVar10)) {
      lVar11 = *(long *)(pcVar21 + 0x4af8);
      iVar6 = *piVar2;
      iVar7 = func_0x000daf30();
      if (iVar7 != 0) {
        func_0x000daf68(pcVar21 + 0x4c08,lVar11 + (long)iVar6 * 0x18 + -0x18);
      }
    }
    *piVar2 = *piVar2 + -1;
    uVar17 = *(uint *)(lVar10 + 0x19c);
  }
  *(uint *)(lVar10 + 0x19c) = uVar17 & uVar18 - 1;
  *(int *)(*(long *)(pcRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(pcRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  return;
}

