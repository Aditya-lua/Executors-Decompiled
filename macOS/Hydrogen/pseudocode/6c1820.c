
void FUN_006c1820(undefined8 param_1)

{
  uint uVar1;
  byte bVar2;
  bool bVar3;
  code *pcVar4;
  undefined1 uVar5;
  int iVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong extraout_x1;
  char cVar10;
  long lVar11;
  long *plVar12;
  uint uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  long *unaff_x19;
  uint uVar22;
  char *pcVar23;
  int unaff_w21;
  undefined4 uVar24;
  bool bVar25;
  uint unaff_w22;
  uint unaff_w23;
  ulong unaff_x24;
  long lVar26;
  undefined8 uVar27;
  uint uVar28;
  double dVar29;
  undefined1 auVar30 [16];
  uint uStack0000000000000030;
  ulong in_stack_00000038;
  uint uStack0000000000000044;
  
  func_0x006b2e98(param_1,*(int *)(unaff_x24 + 0xc) + 1);
  uStack0000000000000044 = unaff_w23;
  if ((1 < (int)unaff_x19[1]) && (*(char *)(unaff_x24 + 0x48) == '\0')) {
    uVar14 = *(ulong *)(unaff_x24 + 0x20);
    while( true ) {
      while ((iVar6 = *(int *)(uVar14 + 8), uVar14 != 0 && (iVar6 == iRam0000000000a27a98))) {
        if (unaff_x19[0x1d] == 0) goto LAB_006c1844;
        uVar14 = *(ulong *)(uVar14 + 0x20);
        if (uVar14 == unaff_x19[0x1e]) goto LAB_006c1844;
        uVar15 = 0;
        lVar11 = unaff_x19[0x1b];
        uVar17 = uVar14 >> 4 ^ uVar14 >> 9;
        while( true ) {
          uVar17 = uVar17 & unaff_x19[0x1c] - 1U;
          uVar19 = *(ulong *)(lVar11 + uVar17 * 0x18);
          if (uVar19 == uVar14) break;
          uVar15 = uVar15 + 1;
          uVar17 = uVar15 + uVar17;
          if (uVar19 == unaff_x19[0x1e] || unaff_x19[0x1c] - 1U < uVar15) goto LAB_006c1844;
        }
        if ((*(char *)(lVar11 + uVar17 * 0x18 + 0x10) != '\0') ||
           (uVar14 = *(ulong *)(lVar11 + uVar17 * 0x18 + 8), uVar14 == 0)) goto LAB_006c1844;
      }
      if (((uVar14 == 0) || (iVar6 != iRam0000000000a27a48)) &&
         ((uVar14 == 0 || (iVar6 != iRam0000000000a27b38)))) break;
      uVar14 = *(ulong *)(uVar14 + 0x20);
    }
    if (iVar6 == iRam0000000000a27af8) {
      if ((unaff_x19[0xe] == 0) || (uVar14 == unaff_x19[0xf])) goto LAB_006c216c;
      uVar15 = 0;
      uVar17 = uVar14 >> 4 ^ uVar14 >> 9;
      goto LAB_006c2144;
    }
  }
  goto LAB_006c1844;
  while( true ) {
    uVar15 = uVar15 + 1;
    uVar17 = uVar15 + uVar17;
    if (uVar19 == unaff_x19[0xf] || unaff_x19[0xd] - 1U < uVar15) break;
LAB_006c2144:
    uVar17 = uVar17 & unaff_x19[0xd] - 1U;
    uVar19 = *(ulong *)(unaff_x19[0xc] + uVar17 * 0x38);
    if (uVar19 == uVar14) {
      pcVar23 = (char *)(unaff_x19[0xc] + uVar17 * 0x38 + 0x34);
      if (*pcVar23 != '\0') {
        uVar15 = func_0x006cbcf8();
        if ((uVar15 & 1) != 0) {
          return;
        }
        if (*pcVar23 != '\0') goto LAB_006c1844;
      }
      if (*(char *)(uVar14 + 0x70) != '\0') {
        pcVar23 = "inlining failed: function is variadic";
        goto LAB_006c2188;
      }
      unaff_w23 = uStack0000000000000044;
      if (*(char *)((long)unaff_x19 + 0x499) != '\0') {
        pcVar23 = "inlining failed: module uses getfenv/setfenv";
        goto LAB_006c2188;
      }
      if (*(char *)((long)unaff_x19 + 0x49a) == '\0') goto LAB_006c1844;
      pcVar23 = "inlining failed: module uses getfenv/setfenv";
      goto LAB_006c2188;
    }
  }
LAB_006c216c:
  pcVar23 = "inlining failed: can\'t inline recursive calls";
  if (*(char *)(uVar14 + 0x70) != '\0') {
    pcVar23 = "inlining failed: function is variadic";
  }
LAB_006c2188:
  func_0x006b3160(*unaff_x19,pcVar23);
LAB_006c1844:
  uVar1 = *(uint *)((long)unaff_x19 + 0x484);
  bVar2 = *(byte *)(unaff_x24 + 0x48);
  iVar6 = (uint)bVar2 + *(int *)(unaff_x24 + 0x40);
  uVar22 = unaff_w23;
  if (unaff_w23 < iVar6 + 1U) {
    uVar22 = iVar6 + 1;
  }
  if (unaff_w22 == 0) {
    uVar22 = uVar22 + uVar1;
    if (0xff < uVar22) goto LAB_006c2698;
    *(uint *)((long)unaff_x19 + 0x484) = uVar22;
    uVar28 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar22) {
      uVar28 = uVar22;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar28;
    bVar3 = false;
    uVar22 = 0xffffffff;
    uVar28 = uVar1;
    if (bVar2 == 0) goto LAB_006c18d8;
  }
  else {
    uVar22 = (uVar22 - unaff_w23) + uVar1;
    if (0xff < uVar22) {
LAB_006c2698:
      func_0x006bc388(unaff_x24 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
      goto LAB_006c26d8;
    }
    *(uint *)((long)unaff_x19 + 0x484) = uVar22;
    uVar28 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar22) {
      uVar28 = uVar22;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar28;
    uVar28 = uVar1 - unaff_w23;
    bVar3 = false;
    uVar22 = 0xffffffff;
    if (bVar2 == 0) {
LAB_006c18d8:
      uVar22 = 0xffffffff;
      bVar3 = false;
      if (0 < (int)unaff_x19[1]) {
        if ((unaff_x19[0x31] == 0) || (unaff_x19[0x32] == unaff_x24)) {
LAB_006c1a5c:
          bVar3 = false;
        }
        else {
          uVar14 = 0;
          uVar15 = unaff_x24 >> 4 ^ unaff_x24 >> 9;
          do {
            uVar15 = uVar15 & unaff_x19[0x30] - 1U;
            uVar17 = *(ulong *)(unaff_x19[0x2f] + uVar15 * 0x10);
            if (uVar17 == unaff_x24) {
              uVar22 = *(uint *)(unaff_x19[0x2f] + uVar15 * 0x10 + 8);
              if ((int)uVar22 < 0) goto LAB_006c1a5c;
              if ((*(byte *)(*unaff_x19 + 0x2d0) >> 4 & 1) != 0) {
                auVar30 = func_0x006d1ff8(*(undefined8 *)(unaff_x24 + 0x20),unaff_x19 + 0x16,
                                          unaff_x19 + 0x1b);
                if (*(long *)(unaff_x24 + 0x40) != 0) {
                  func_0x006ca314();
                }
                if (auVar30._0_8_ == 0) {
                  if (auVar30._8_8_ != 0) {
                    func_0x006b3160(*unaff_x19,"builtin %s/%d%s");
                  }
                }
                else {
                  func_0x006b3160(*unaff_x19,"builtin %s.%s/%d%s");
                }
              }
              if (uVar22 == 0x22) {
                lVar11 = *(long *)(unaff_x24 + 0x40);
                if (lVar11 == 3) {
                  plVar12 = *(long **)(unaff_x24 + 0x38);
                  if (unaff_x19[0x22] == 0) goto LAB_006c22a4;
                  uVar15 = plVar12[1];
                  uVar14 = unaff_x19[0x23];
                  if (uVar14 == uVar15) goto LAB_006c22a4;
                  uVar17 = 0;
                  lVar11 = unaff_x19[0x20];
                  uVar16 = unaff_x19[0x21] - 1;
                  uVar20 = uVar15 >> 4 ^ uVar15 >> 9;
                  uVar19 = uVar20;
                  goto LAB_006c20a8;
                }
                uVar22 = 0x22;
              }
              else {
                if (uVar22 == 0x39) {
                  bVar3 = false;
                  uVar22 = 0xffffffff;
                  if ((uStack0000000000000044 != 1) || ((in_stack_00000038 & 0x100000000) != 0))
                  goto LAB_006c1a60;
                  func_0x006cc0b4();
                  goto LAB_006c1f04;
                }
                lVar11 = *(long *)(unaff_x24 + 0x40);
                if (lVar11 == 3) {
                  plVar12 = *(long **)(unaff_x24 + 0x38);
                  goto LAB_006c22a8;
                }
              }
              if (lVar11 - 1U < 2) goto LAB_006c2484;
              goto LAB_006c256c;
            }
            if (uVar17 == unaff_x19[0x32]) break;
            uVar14 = uVar14 + 1;
            uVar15 = uVar14 + uVar15;
          } while (uVar14 <= unaff_x19[0x30] - 1U);
          bVar3 = false;
          uVar22 = 0xffffffff;
        }
      }
    }
  }
  goto LAB_006c1a60;
  while( true ) {
    if (uVar21 == uVar14) break;
    uVar17 = uVar17 + 1;
    uVar19 = uVar17 + uVar19;
    if (uVar16 < uVar17) break;
LAB_006c20a8:
    uVar19 = uVar19 & uVar16;
    uVar21 = *(ulong *)(lVar11 + uVar19 * 0x20);
    if (uVar21 == uVar15) {
      if ((*(int *)(lVar11 + uVar19 * 0x20 + 8) != 0) && (uVar17 = plVar12[2], uVar14 != uVar17)) {
        uVar19 = 0;
        uVar18 = uVar17 >> 4 ^ uVar17 >> 9;
        uVar21 = uVar18;
        goto LAB_006c21bc;
      }
      break;
    }
  }
  goto LAB_006c22a4;
  while( true ) {
    uVar19 = uVar19 + 1;
    uVar20 = uVar19 + uVar20;
    if (uVar16 < uVar19) break;
code_r0x006c2270:
    uVar20 = uVar20 & uVar16;
    uVar21 = *(ulong *)(lVar11 + uVar20 * 0x20);
    if (uVar21 == uVar15) {
      lVar26 = lVar11 + uVar20 * 0x20;
      iVar6 = *(int *)(lVar26 + 8);
      dVar29 = *(double *)(lVar26 + 0x10);
      goto code_r0x006c2598;
    }
    if (uVar21 == uVar14) break;
  }
  iVar6 = 0;
code_r0x006c2598:
  uVar15 = 0;
  do {
    uVar18 = uVar18 & uVar16;
    uVar19 = *(ulong *)(lVar11 + uVar18 * 0x20);
    if (uVar19 == uVar17) {
      lVar11 = lVar11 + uVar18 * 0x20;
      uVar13 = (uint)dVar29;
      if (iVar6 != 3) {
        uVar13 = 0xffffffff;
      }
      if (((*(int *)(lVar11 + 8) == 3) && (uVar22 = 0x22, -1 < (int)uVar13)) &&
         (iVar6 = (int)*(double *)(lVar11 + 0x10), 0 < iVar6)) {
        if (0x20 < (int)(uVar13 + iVar6)) goto LAB_006c22a8;
        iVar6 = func_0x006b1270((double)(int)(iVar6 * 0x20 - 0x20U | uVar13),*unaff_x19);
        if (-1 < iVar6) {
          func_0x006cc320();
          goto LAB_006c1f04;
        }
        func_0x006bc388(unaff_x24 + 0xc,"Exceeded constant limit; simplify the code to compile");
        goto LAB_006c26d8;
      }
      break;
    }
    if (uVar19 == uVar14) break;
    uVar15 = uVar15 + 1;
    uVar18 = uVar15 + uVar18;
  } while (uVar15 <= uVar16);
  uVar22 = 0x22;
  goto LAB_006c22a8;
LAB_006c2484:
  uVar14 = func_0x006ca314();
  if ((uVar14 & 1) == 0) {
    func_0x006cc320();
    goto LAB_006c1f04;
  }
  if ((int)unaff_x19[1] < 2) goto LAB_006c256c;
  iVar6 = func_0x006d22a0(uVar22);
  bVar3 = true;
  if ((*(int *)(unaff_x24 + 0x40) == iVar6) && ((extraout_x1 & 1) != 0)) {
    func_0x006cc320();
    goto LAB_006c1f04;
  }
  goto LAB_006c1a60;
  while( true ) {
    if (uVar9 == uVar14) break;
    uVar19 = uVar19 + 1;
    uVar21 = uVar19 + uVar21;
    if (uVar16 < uVar19) break;
LAB_006c21bc:
    uVar21 = uVar21 & uVar16;
    uVar9 = *(ulong *)(lVar11 + uVar21 * 0x20);
    if (uVar9 == uVar17) {
      if (*(int *)(lVar11 + uVar21 * 0x20 + 8) != 0) {
        uVar19 = 0;
        dVar29 = 0.0;
        goto code_r0x006c2270;
      }
      break;
    }
  }
LAB_006c22a4:
  uVar22 = 0x22;
LAB_006c22a8:
  lVar11 = *plVar12;
  iVar6 = *(int *)(lVar11 + 8);
  if ((lVar11 == 0) || (iVar6 != iRam0000000000a27a98)) {
    do {
      if ((iVar6 != iRam0000000000a27a48) && (iVar6 != iRam0000000000a27b38)) goto code_r0x006c2360;
      lVar11 = *(long *)(lVar11 + 0x20);
      iVar6 = *(int *)(lVar11 + 8);
    } while (lVar11 == 0 || iVar6 != iRam0000000000a27a98);
  }
  if (unaff_x19[0x13] != 0) {
    uVar14 = *(ulong *)(lVar11 + 0x20);
    if (uVar14 != unaff_x19[0x14]) {
      uVar15 = 0;
      uVar17 = uVar14 >> 4 ^ uVar14 >> 9;
      do {
        uVar17 = uVar17 & unaff_x19[0x12] - 1U;
        uVar19 = *(ulong *)(unaff_x19[0x11] + uVar17 * 0x18);
        if (uVar19 == uVar14) {
          if (*(char *)(unaff_x19[0x11] + uVar17 * 0x18 + 9) != '\0') goto LAB_006c2484;
          break;
        }
        uVar15 = uVar15 + 1;
        uVar17 = uVar15 + uVar17;
      } while (uVar19 != unaff_x19[0x14] && uVar15 <= unaff_x19[0x12] - 1U);
    }
  }
code_r0x006c2360:
  for (lVar11 = plVar12[1]; iVar6 = *(int *)(lVar11 + 8),
      lVar11 == 0 || iVar6 != iRam0000000000a27a98; lVar11 = *(long *)(lVar11 + 0x20)) {
    if ((iVar6 != iRam0000000000a27a48) && (iVar6 != iRam0000000000a27b38)) goto code_r0x006c23e8;
  }
  if (unaff_x19[0x13] != 0) {
    uVar14 = *(ulong *)(lVar11 + 0x20);
    if (uVar14 != unaff_x19[0x14]) {
      uVar15 = 0;
      uVar17 = uVar14 >> 4 ^ uVar14 >> 9;
      do {
        uVar17 = uVar17 & unaff_x19[0x12] - 1U;
        uVar19 = *(ulong *)(unaff_x19[0x11] + uVar17 * 0x18);
        if (uVar19 == uVar14) {
          if (*(char *)(unaff_x19[0x11] + uVar17 * 0x18 + 9) != '\0') goto LAB_006c2484;
          break;
        }
        uVar15 = uVar15 + 1;
        uVar17 = uVar15 + uVar17;
      } while (uVar19 != unaff_x19[0x14] && uVar15 <= unaff_x19[0x12] - 1U);
    }
  }
code_r0x006c23e8:
  for (lVar11 = plVar12[2]; iVar6 = *(int *)(lVar11 + 8),
      lVar11 == 0 || iVar6 != iRam0000000000a27a98; lVar11 = *(long *)(lVar11 + 0x20)) {
    if ((iVar6 != iRam0000000000a27a48) && (iVar6 != iRam0000000000a27b38)) goto LAB_006c256c;
  }
  if (unaff_x19[0x13] != 0) {
    uVar14 = *(ulong *)(lVar11 + 0x20);
    if (uVar14 != unaff_x19[0x14]) {
      uVar15 = 0;
      uVar17 = uVar14 >> 4 ^ uVar14 >> 9;
      do {
        uVar17 = uVar17 & unaff_x19[0x12] - 1U;
        uVar19 = *(ulong *)(unaff_x19[0x11] + uVar17 * 0x18);
        if (uVar19 == uVar14) {
          if (*(char *)(unaff_x19[0x11] + uVar17 * 0x18 + 9) != '\0') goto LAB_006c2484;
          break;
        }
        uVar15 = uVar15 + 1;
        uVar17 = uVar15 + uVar17;
      } while (uVar19 != unaff_x19[0x14] && uVar15 <= unaff_x19[0x12] - 1U);
    }
  }
LAB_006c256c:
  bVar3 = true;
LAB_006c1a60:
  if (*(char *)(unaff_x24 + 0x48) == '\0') {
    if ((int)uVar22 < 0) {
      uVar24 = *(undefined4 *)((long)unaff_x19 + 0x484);
      *(uint *)((long)unaff_x19 + 0x484) = (uVar28 & 0xff) + 1;
      func_0x006c6028();
      *(undefined4 *)((long)unaff_x19 + 0x484) = uVar24;
      uStack0000000000000030 = 0;
      uVar14 = *(ulong *)(unaff_x24 + 0x40);
      goto joined_r0x006c1f8c;
    }
    uStack0000000000000030 = 0;
    uVar14 = *(ulong *)(unaff_x24 + 0x40);
    if (uVar14 == 0) goto LAB_006c1d14;
LAB_006c1b70:
    bVar25 = false;
    uVar15 = 0;
    do {
      while( true ) {
        uVar17 = uVar15 + 1;
        lVar11 = *(long *)(*(long *)(unaff_x24 + 0x38) + uVar15 * 8);
        iVar6 = (uVar28 & 0xff) + 1 + (int)uVar15;
        uVar15 = uVar17;
        if (uVar17 == uVar14) break;
        uVar24 = *(undefined4 *)((long)unaff_x19 + 0x484);
        *(uint *)((long)unaff_x19 + 0x484) = (iVar6 + (uint)*(byte *)(unaff_x24 + 0x48) & 0xff) + 1;
        func_0x006c6028();
LAB_006c1bb0:
        *(undefined4 *)((long)unaff_x19 + 0x484) = uVar24;
        uVar14 = *(ulong *)(unaff_x24 + 0x40);
joined_r0x006c1ce8:
        if (uVar14 <= uVar17) goto LAB_006c1cec;
      }
      uVar13 = (uint)*(byte *)(unaff_x24 + 0x48) + iVar6;
      if (lVar11 != 0 && *(int *)(lVar11 + 8) == iRam0000000000a27ac8) {
        if ((1 < (int)unaff_x19[1]) && (uVar14 = func_0x006ca314(), (uVar14 & 1) == 0)) {
          func_0x006c6028();
          goto LAB_006c1cd8;
        }
        uVar24 = *(undefined4 *)((long)unaff_x19 + 0x484);
        *(uint *)((long)unaff_x19 + 0x484) = uVar13 & 0xff;
        bVar25 = true;
        func_0x006c17d8();
        goto LAB_006c1bb0;
      }
      if (lVar11 == 0 || *(int *)(lVar11 + 8) != iRam0000000000a27ab8) {
        func_0x006c6028();
LAB_006c1cd8:
        bVar25 = false;
        uVar14 = *(ulong *)(unaff_x24 + 0x40);
        goto joined_r0x006c1ce8;
      }
      uVar13 = uVar13 & 0xff;
      uVar24 = *(undefined4 *)((long)unaff_x19 + 0x484);
      *(uint *)((long)unaff_x19 + 0x484) = uVar13;
      lVar26 = *unaff_x19;
      if (0 < *(int *)((long)unaff_x19 + 0xc)) {
        func_0x006b2e98(lVar26,*(int *)(lVar11 + 0xc) + 1);
        lVar26 = *unaff_x19;
      }
      func_0x006b1ccc(lVar26,0x3f,uVar13,0,0);
      bVar25 = true;
      *(undefined4 *)((long)unaff_x19 + 0x484) = uVar24;
      uVar14 = *(ulong *)(unaff_x24 + 0x40);
    } while (uVar17 < uVar14);
LAB_006c1cec:
    iVar6 = *(int *)((long)unaff_x19 + 0xc);
  }
  else {
    lVar11 = *(long *)(unaff_x24 + 0x20);
    if (*(int *)(lVar11 + 8) != iRam0000000000a27ad8) {
      lVar11 = 0;
    }
    lVar11 = *(long *)(lVar11 + 0x20);
    iVar6 = *(int *)(lVar11 + 8);
    if (lVar11 == 0 || iVar6 != iRam0000000000a27a98) {
      do {
        if ((iVar6 != iRam0000000000a27a48) && (iVar6 != iRam0000000000a27b38)) goto LAB_006c1b3c;
        lVar11 = *(long *)(lVar11 + 0x20);
        iVar6 = *(int *)(lVar11 + 8);
      } while (lVar11 == 0 || iVar6 != iRam0000000000a27a98);
    }
    if (unaff_x19[0x13] != 0) {
      uVar14 = *(ulong *)(lVar11 + 0x20);
      if (uVar14 != unaff_x19[0x14]) {
        uVar15 = 0;
        lVar11 = unaff_x19[0x11];
        uVar17 = uVar14 >> 4 ^ uVar14 >> 9;
        do {
          uVar17 = uVar17 & unaff_x19[0x12] - 1U;
          uVar19 = *(ulong *)(lVar11 + uVar17 * 0x18);
          if (uVar19 == uVar14) {
            if (*(char *)(lVar11 + uVar17 * 0x18 + 9) != '\0') {
              uVar14 = *(ulong *)(unaff_x24 + 0x40);
              uStack0000000000000030 = (uint)*(byte *)(lVar11 + uVar17 * 0x18 + 8);
              goto joined_r0x006c1f8c;
            }
            break;
          }
          uVar15 = uVar15 + 1;
          uVar17 = uVar15 + uVar17;
        } while (uVar19 != unaff_x19[0x14] && uVar15 <= unaff_x19[0x12] - 1U);
      }
    }
LAB_006c1b3c:
    uVar24 = *(undefined4 *)((long)unaff_x19 + 0x484);
    *(uint *)((long)unaff_x19 + 0x484) = (uVar28 & 0xff) + 1;
    func_0x006c6028();
    *(undefined4 *)((long)unaff_x19 + 0x484) = uVar24;
    uVar14 = *(ulong *)(unaff_x24 + 0x40);
    uStack0000000000000030 = uVar28;
joined_r0x006c1f8c:
    if (uVar14 != 0) goto LAB_006c1b70;
LAB_006c1d14:
    bVar25 = false;
    iVar6 = *(int *)((long)unaff_x19 + 0xc);
  }
  if (0 < iVar6) {
    func_0x006b2e98(*unaff_x19,*(int *)(*(long *)(unaff_x24 + 0x20) + 0x14) + 1);
  }
  if (*(char *)(unaff_x24 + 0x48) == '\0') {
    if (bVar3) {
      uVar7 = func_0x006b2784(*unaff_x19);
      func_0x006b1ccc(*unaff_x19,0x44,uVar22 & 0xff,0,0);
      func_0x006c6028();
      uVar8 = func_0x006b2784(*unaff_x19);
      uVar14 = func_0x006b2964(*unaff_x19,uVar7,uVar8);
      if ((uVar14 & 1) == 0) {
        func_0x006bc388(*(long *)(unaff_x24 + 0x20) + 0xc,
                        "Exceeded jump distance limit; simplify the code to compile");
        goto LAB_006c26d8;
      }
    }
  }
  else {
    lVar11 = *(long *)(unaff_x24 + 0x20);
    if (*(int *)(lVar11 + 8) != iRam0000000000a27ad8) {
      lVar11 = 0;
    }
    lVar26 = *unaff_x19;
    if (0 < *(int *)((long)unaff_x19 + 0xc)) {
      func_0x006b2e98(lVar26,*(int *)(lVar11 + 0x30) + 1);
      lVar26 = *unaff_x19;
    }
    uVar27 = *(undefined8 *)(lVar11 + 0x28);
    uVar7 = _strlen(uVar27);
    uVar8 = func_0x006b1354(lVar26,uVar27,uVar7);
    if ((int)uVar8 < 0) {
      func_0x006bc388(lVar11 + 0xc,"Exceeded constant limit; simplify the code to compile");
LAB_006c26d8:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x6c26dc);
      (*pcVar4)();
    }
    lVar11 = *unaff_x19;
    uVar5 = func_0x006b401c(uVar27,uVar7);
    func_0x006b1ccc(lVar11,0x14,uVar28 & 0xff,uStack0000000000000030 & 0xff,uVar5);
    func_0x006b24c4(*unaff_x19,uVar8);
    func_0x006c9bf0();
  }
  if (bVar25) {
    cVar10 = '\0';
  }
  else {
    cVar10 = *(char *)(unaff_x24 + 0x48) + *(char *)(unaff_x24 + 0x40) + '\x01';
  }
  uVar22 = 0;
  if (in_stack_00000038._4_4_ == 0) {
    uVar22 = uStack0000000000000044 + 1;
  }
  func_0x006b1ccc(*unaff_x19,0x15,uVar28 & 0xff,cVar10,uVar22 & 0xff);
  if (((unaff_w22 & 1) == 0) && (uStack0000000000000044 != 0)) {
    uVar14 = 0;
    do {
      func_0x006b1ccc(*unaff_x19,6,(int)uVar14 + unaff_w21 & 0xff,uVar28 + (int)uVar14 & 0xff,0);
      uVar14 = uVar14 + 1;
    } while (uStack0000000000000044 != uVar14);
  }
LAB_006c1f04:
  *(uint *)((long)unaff_x19 + 0x484) = uVar1;
  return;
}

