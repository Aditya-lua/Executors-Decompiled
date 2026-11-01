
/* WARNING: Possible PIC construction at 0x006c1c60: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006c1c64) */
/* WARNING: Type propagation algorithm not settling */

void FUN_006c17bc(undefined8 param_1,undefined8 param_2,ulong param_3,ulong param_4,
                 undefined8 param_5,undefined8 param_6)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  code *pcVar4;
  undefined1 *puVar5;
  undefined1 uVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  long *plVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  ulong extraout_x1;
  char cVar16;
  long lVar17;
  long *plVar18;
  uint uVar19;
  ulong uVar20;
  int iVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  long *unaff_x19;
  undefined **unaff_x20;
  char *pcVar30;
  ulong unaff_x21;
  bool bVar31;
  undefined4 uVar32;
  undefined8 unaff_x22;
  uint uVar33;
  ulong unaff_x23;
  ulong unaff_x24;
  undefined4 uVar34;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 uVar35;
  ulong unaff_x27;
  undefined **unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar36;
  double dVar37;
  undefined1 auVar38 [16];
  
  uVar32 = (undefined4)unaff_x22;
  *(undefined4 *)((long)unaff_x19 + 0x484) = uVar32;
  __Unwind_Resume();
  *(int *)((long)unaff_x19 + 0x484) = (int)unaff_x24;
  *(undefined4 *)((long)unaff_x19 + 0x484) = uVar32;
  __Unwind_Resume();
  *(undefined4 *)((long)unaff_x19 + 0x484) = uVar32;
  puVar36 = (undefined *)0x6c17d8;
  auVar38 = __Unwind_Resume();
  plVar10 = auVar38._0_8_;
  puVar5 = (undefined1 *)register0x00000008;
  uVar22 = auVar38._8_8_;
LAB_006c17d8:
  uVar14 = uVar22;
  *(undefined ***)(puVar5 + -0x60) = unaff_x28;
  *(ulong *)(puVar5 + -0x58) = unaff_x27;
  *(ulong *)(puVar5 + -0x50) = unaff_x26;
  *(long *)(puVar5 + -0x48) = unaff_x25;
  *(ulong *)(puVar5 + -0x40) = unaff_x24;
  *(ulong *)(puVar5 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar5 + -0x30) = unaff_x22;
  *(ulong *)(puVar5 + -0x28) = unaff_x21;
  *(undefined ***)(puVar5 + -0x20) = unaff_x20;
  *(long **)(puVar5 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar5 + -0x10) = unaff_x29;
  *(undefined **)(puVar5 + -8) = puVar36;
  unaff_x29 = puVar5 + -0x10;
  *(int *)(puVar5 + -0x74) = (int)param_6;
  if (0 < *(int *)((long)plVar10 + 0xc)) {
    func_0x006b2e98(*plVar10,*(int *)(uVar14 + 0xc) + 1);
  }
  lVar17 = plVar10[1];
  *(int *)(puVar5 + -0x6c) = (int)param_4;
  if ((1 < (int)lVar17) && (*(char *)(uVar14 + 0x48) == '\0')) {
    uVar22 = *(ulong *)(uVar14 + 0x20);
    while( true ) {
      while ((iVar9 = *(int *)(uVar22 + 8), uVar22 != 0 && (iVar9 == iRam0000000000a27a98))) {
        if (plVar10[0x1d] == 0) goto code_r0x006c1844;
        uVar22 = *(ulong *)(uVar22 + 0x20);
        if (uVar22 == plVar10[0x1e]) goto code_r0x006c1844;
        uVar20 = 0;
        lVar17 = plVar10[0x1b];
        uVar23 = uVar22 >> 4 ^ uVar22 >> 9;
        while( true ) {
          uVar23 = uVar23 & plVar10[0x1c] - 1U;
          uVar25 = *(ulong *)(lVar17 + uVar23 * 0x18);
          if (uVar25 == uVar22) break;
          uVar20 = uVar20 + 1;
          uVar23 = uVar20 + uVar23;
          if (uVar25 == plVar10[0x1e] || plVar10[0x1c] - 1U < uVar20) goto code_r0x006c1844;
        }
        if ((*(char *)(lVar17 + uVar23 * 0x18 + 0x10) != '\0') ||
           (uVar22 = *(ulong *)(lVar17 + uVar23 * 0x18 + 8), uVar22 == 0)) goto code_r0x006c1844;
      }
      if (((uVar22 == 0) || (iVar9 != iRam0000000000a27a48)) &&
         ((uVar22 == 0 || (iVar9 != iRam0000000000a27b38)))) break;
      uVar22 = *(ulong *)(uVar22 + 0x20);
    }
    if (iVar9 == iRam0000000000a27af8) {
      if ((plVar10[0xe] == 0) || (uVar22 == plVar10[0xf])) goto code_r0x006c216c;
      uVar20 = 0;
      uVar23 = uVar22 >> 4 ^ uVar22 >> 9;
      goto code_r0x006c2144;
    }
  }
  goto code_r0x006c1844;
  while( true ) {
    uVar20 = uVar20 + 1;
    uVar23 = uVar20 + uVar23;
    if (uVar25 == plVar10[0xf] || plVar10[0xd] - 1U < uVar20) break;
code_r0x006c2144:
    uVar23 = uVar23 & plVar10[0xd] - 1U;
    uVar25 = *(ulong *)(plVar10[0xc] + uVar23 * 0x38);
    if (uVar25 == uVar22) {
      pcVar30 = (char *)(plVar10[0xc] + uVar23 * 0x38 + 0x34);
      if (*pcVar30 != '\0') {
        *(undefined4 *)(puVar5 + -0xb0) = uRam0000000000a335f8;
        uVar20 = func_0x006cbcf8(plVar10,uVar14,uVar22,param_3,param_4,
                                 *(undefined4 *)(puVar5 + -0x74),uRam0000000000a335c8,
                                 uRam0000000000a335e0);
        if ((uVar20 & 1) != 0) {
          return;
        }
        if (*pcVar30 != '\0') goto code_r0x006c1844;
      }
      if (*(char *)(uVar22 + 0x70) != '\0') {
        pcVar30 = "inlining failed: function is variadic";
        goto code_r0x006c2188;
      }
      if (*(char *)((long)plVar10 + 0x499) != '\0') {
        pcVar30 = "inlining failed: module uses getfenv/setfenv";
        param_4 = (ulong)*(uint *)(puVar5 + -0x6c);
        goto code_r0x006c2188;
      }
      param_4 = (ulong)*(uint *)(puVar5 + -0x6c);
      if (*(char *)((long)plVar10 + 0x49a) == '\0') goto code_r0x006c1844;
      pcVar30 = "inlining failed: module uses getfenv/setfenv";
      goto code_r0x006c2188;
    }
  }
code_r0x006c216c:
  pcVar30 = "inlining failed: can\'t inline recursive calls";
  if (*(char *)(uVar22 + 0x70) != '\0') {
    pcVar30 = "inlining failed: function is variadic";
  }
code_r0x006c2188:
  func_0x006b3160(*plVar10,pcVar30);
code_r0x006c1844:
  uVar19 = *(uint *)((long)plVar10 + 0x484);
  uVar22 = (ulong)uVar19;
  bVar3 = *(byte *)(uVar14 + 0x48);
  iVar9 = (uint)bVar3 + *(int *)(uVar14 + 0x40);
  uVar33 = (uint)param_4;
  uVar2 = uVar33;
  if (uVar33 < iVar9 + 1U) {
    uVar2 = iVar9 + 1;
  }
  *(uint *)(puVar5 + -0x70) = uVar19;
  iVar9 = (int)param_5;
  if (iVar9 == 0) {
    uVar19 = uVar2 + uVar19;
    if (0xff < uVar19) goto code_r0x006c2698;
    *(uint *)((long)plVar10 + 0x484) = uVar19;
    uVar2 = *(uint *)(plVar10 + 0x91);
    if (*(uint *)(plVar10 + 0x91) <= uVar19) {
      uVar2 = uVar19;
    }
    *(uint *)(plVar10 + 0x91) = uVar2;
    uVar32 = 0;
    iVar21 = -1;
    *(ulong *)(puVar5 + -0x68) = uVar22;
    if (bVar3 == 0) goto code_r0x006c18d8;
  }
  else {
    uVar2 = uVar2 - uVar33;
    uVar1 = uVar2 + uVar19;
    if (0xff < uVar1) {
code_r0x006c2698:
      *(ulong *)(puVar5 + -0xb0) = (ulong)uVar2;
      *(undefined8 *)(puVar5 + -0xa8) = 0xff;
      func_0x006bc388(uVar14 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
      goto code_r0x006c26d8;
    }
    *(uint *)((long)plVar10 + 0x484) = uVar1;
    uVar2 = *(uint *)(plVar10 + 0x91);
    if (*(uint *)(plVar10 + 0x91) <= uVar1) {
      uVar2 = uVar1;
    }
    *(uint *)(plVar10 + 0x91) = uVar2;
    uVar22 = (ulong)(uVar19 - uVar33);
    uVar32 = 0;
    iVar21 = -1;
    *(ulong *)(puVar5 + -0x68) = uVar22;
    if (bVar3 == 0) {
code_r0x006c18d8:
      iVar21 = -1;
      uVar32 = 0;
      if (0 < (int)plVar10[1]) {
        if ((plVar10[0x31] == 0) || (plVar10[0x32] == uVar14)) {
code_r0x006c1a5c:
          uVar32 = 0;
        }
        else {
          uVar20 = 0;
          uVar23 = uVar14 >> 4 ^ uVar14 >> 9;
          do {
            uVar23 = uVar23 & plVar10[0x30] - 1U;
            uVar25 = *(ulong *)(plVar10[0x2f] + uVar23 * 0x10);
            if (uVar25 == uVar14) {
              iVar21 = *(int *)(plVar10[0x2f] + uVar23 * 0x10 + 8);
              if (iVar21 < 0) goto code_r0x006c1a5c;
              if ((*(byte *)(*plVar10 + 0x2d0) >> 4 & 1) != 0) {
                auVar38 = func_0x006d1ff8(*(undefined8 *)(uVar14 + 0x20),plVar10 + 0x16,
                                          plVar10 + 0x1b);
                unaff_x27 = auVar38._0_8_;
                if (*(long *)(uVar14 + 0x40) == 0) {
                  iVar7 = 0;
                }
                else {
                  iVar7 = func_0x006ca314(plVar10,*(undefined8 *)
                                                   (*(long *)(uVar14 + 0x38) +
                                                    *(long *)(uVar14 + 0x40) * 8 + -8));
                }
                if (unaff_x27 == 0) {
                  if (auVar38._8_8_ != 0) {
                    lVar17 = *plVar10;
                    pcVar30 = "+";
                    if (iVar7 == 0) {
                      pcVar30 = "";
                    }
                    *(undefined8 *)(puVar5 + -0xa8) = *(undefined8 *)(uVar14 + 0x40);
                    *(char **)(puVar5 + -0xa0) = pcVar30;
                    *(long *)(puVar5 + -0xb0) = auVar38._8_8_;
                    func_0x006b3160(lVar17,"builtin %s/%d%s");
                  }
                }
                else {
                  lVar17 = *plVar10;
                  pcVar30 = "+";
                  if (iVar7 == 0) {
                    pcVar30 = "";
                  }
                  *(undefined8 *)(puVar5 + -0xa0) = *(undefined8 *)(uVar14 + 0x40);
                  *(char **)(puVar5 + -0x98) = pcVar30;
                  *(undefined1 (*) [16])(puVar5 + -0xb0) = auVar38;
                  func_0x006b3160(lVar17,"builtin %s.%s/%d%s");
                }
              }
              if (iVar21 == 0x22) {
                lVar17 = *(long *)(uVar14 + 0x40);
                uVar34 = *(undefined4 *)(puVar5 + -0x70);
                iVar7 = *(int *)(puVar5 + -0x6c);
                if (lVar17 == 3) {
                  plVar18 = *(long **)(uVar14 + 0x38);
                  if (plVar10[0x22] == 0) goto code_r0x006c22a4;
                  uVar23 = plVar18[1];
                  uVar20 = plVar10[0x23];
                  if (uVar20 == uVar23) goto code_r0x006c22a4;
                  uVar25 = 0;
                  lVar17 = plVar10[0x20];
                  uVar24 = plVar10[0x21] - 1;
                  uVar28 = uVar23 >> 4 ^ uVar23 >> 9;
                  uVar27 = uVar28;
                  goto code_r0x006c20a8;
                }
                iVar21 = 0x22;
              }
              else {
                uVar34 = *(undefined4 *)(puVar5 + -0x70);
                iVar7 = *(int *)(puVar5 + -0x6c);
                if (iVar21 == 0x39) {
                  uVar32 = 0;
                  iVar21 = -1;
                  if ((iVar7 != 1) || ((*(uint *)(puVar5 + -0x74) & 1) != 0)) goto code_r0x006c1a60;
                  func_0x006cc0b4(plVar10,uVar14,param_3,1,param_5,0,(uint)uVar22 & 0xff);
                  goto code_r0x006c1f04;
                }
                lVar17 = *(long *)(uVar14 + 0x40);
                if (lVar17 == 3) {
                  plVar18 = *(long **)(uVar14 + 0x38);
                  goto code_r0x006c22a8;
                }
              }
              uVar20 = lVar17 - 1;
              if (uVar20 < 2) goto code_r0x006c2484;
              goto code_r0x006c256c;
            }
            if (uVar25 == plVar10[0x32]) break;
            uVar20 = uVar20 + 1;
            uVar23 = uVar20 + uVar23;
          } while (uVar20 <= plVar10[0x30] - 1U);
          uVar32 = 0;
          iVar21 = -1;
        }
      }
    }
  }
  goto code_r0x006c1a60;
  while( true ) {
    if (uVar29 == uVar20) break;
    uVar25 = uVar25 + 1;
    uVar27 = uVar25 + uVar27;
    if (uVar24 < uVar25) break;
code_r0x006c20a8:
    uVar27 = uVar27 & uVar24;
    uVar29 = *(ulong *)(lVar17 + uVar27 * 0x20);
    if (uVar29 == uVar23) {
      if ((*(int *)(lVar17 + uVar27 * 0x20 + 8) != 0) && (uVar25 = plVar18[2], uVar20 != uVar25)) {
        uVar27 = 0;
        uVar26 = uVar25 >> 4 ^ uVar25 >> 9;
        uVar29 = uVar26;
        goto code_r0x006c21bc;
      }
      break;
    }
  }
  goto code_r0x006c22a4;
  while( true ) {
    uVar22 = uVar22 + 1;
    uVar28 = uVar22 + uVar28;
    if (uVar24 < uVar22) break;
code_r0x006c2270:
    uVar28 = uVar28 & uVar24;
    uVar27 = *(ulong *)(lVar17 + uVar28 * 0x20);
    if (uVar27 == uVar23) {
      lVar15 = lVar17 + uVar28 * 0x20;
      iVar21 = *(int *)(lVar15 + 8);
      dVar37 = *(double *)(lVar15 + 0x10);
      goto code_r0x006c2598;
    }
    if (uVar27 == uVar20) break;
  }
  iVar21 = 0;
code_r0x006c2598:
  uVar22 = 0;
  do {
    uVar26 = uVar26 & uVar24;
    uVar23 = *(ulong *)(lVar17 + uVar26 * 0x20);
    if (uVar23 == uVar25) {
      lVar17 = lVar17 + uVar26 * 0x20;
      uVar19 = (uint)dVar37;
      if (iVar21 != 3) {
        uVar19 = 0xffffffff;
      }
      if (((*(int *)(lVar17 + 8) == 3) && (iVar21 = 0x22, -1 < (int)uVar19)) &&
         (iVar8 = (int)*(double *)(lVar17 + 0x10), 0 < iVar8)) {
        uVar34 = *(undefined4 *)(puVar5 + -0x70);
        iVar7 = *(int *)(puVar5 + -0x6c);
        uVar22 = *(ulong *)(puVar5 + -0x68);
        if (0x20 < (int)(uVar19 + iVar8)) goto code_r0x006c22a8;
        iVar9 = func_0x006b1270((double)(int)(iVar8 * 0x20 - 0x20U | uVar19),*plVar10);
        if (-1 < iVar9) {
          *(int *)(puVar5 + -0xb0) = iVar9;
          uVar34 = *(undefined4 *)(puVar5 + -0x70);
          func_0x006cc320(plVar10,uVar14,param_3,*(undefined4 *)(puVar5 + -0x6c),param_5,
                          *(undefined4 *)(puVar5 + -0x74),
                          (uint)*(undefined8 *)(puVar5 + -0x68) & 0xff,0x3b);
          goto code_r0x006c1f04;
        }
        func_0x006bc388(uVar14 + 0xc,"Exceeded constant limit; simplify the code to compile");
        goto code_r0x006c26d8;
      }
      break;
    }
    if (uVar23 == uVar20) break;
    uVar22 = uVar22 + 1;
    uVar26 = uVar22 + uVar26;
  } while (uVar22 <= uVar24);
  iVar21 = 0x22;
  uVar34 = *(undefined4 *)(puVar5 + -0x70);
  iVar7 = *(int *)(puVar5 + -0x6c);
  uVar22 = *(ulong *)(puVar5 + -0x68);
  goto code_r0x006c22a8;
code_r0x006c2558:
  uVar20 = 2;
code_r0x006c2484:
  uVar20 = func_0x006ca314(plVar10,*(undefined8 *)(*(long *)(uVar14 + 0x38) + uVar20 * 8));
  if ((uVar20 & 1) == 0) {
    *(undefined4 *)(puVar5 + -0xb0) = 0xffffffff;
    func_0x006cc320(plVar10,uVar14,param_3,iVar7,param_5,*(undefined4 *)(puVar5 + -0x74),
                    (uint)uVar22 & 0xff,iVar21);
    goto code_r0x006c1f04;
  }
  if (1 < (int)plVar10[1]) {
    iVar8 = func_0x006d22a0(iVar21);
    uVar32 = 1;
    if ((*(int *)(uVar14 + 0x40) == iVar8) && ((extraout_x1 & 1) != 0)) {
      *(undefined4 *)(puVar5 + -0xb0) = 0xffffffff;
      func_0x006cc320(plVar10,uVar14,param_3,iVar7,param_5,*(undefined4 *)(puVar5 + -0x74),
                      (uint)uVar22 & 0xff,iVar21);
      goto code_r0x006c1f04;
    }
    goto code_r0x006c1a60;
  }
  goto code_r0x006c256c;
code_r0x006c1c3c:
  param_3 = (ulong)(uVar19 & 0xff);
  unaff_x21 = (ulong)*(uint *)((long)plVar10 + 0x484);
  *(uint *)((long)plVar10 + 0x484) = uVar19 & 0xff;
  unaff_x22 = 1;
  param_4 = 0;
  param_5 = 1;
  param_6 = 1;
  puVar36 = &UNK_006c1c64;
  puVar5 = puVar5 + -0xb0;
  uVar22 = unaff_x26;
  unaff_x19 = plVar10;
  unaff_x24 = uVar14;
  goto LAB_006c17d8;
  while( true ) {
    if (uVar13 == uVar20) break;
    uVar27 = uVar27 + 1;
    uVar29 = uVar27 + uVar29;
    if (uVar24 < uVar27) break;
code_r0x006c21bc:
    uVar29 = uVar29 & uVar24;
    uVar13 = *(ulong *)(lVar17 + uVar29 * 0x20);
    if (uVar13 == uVar25) {
      if (*(int *)(lVar17 + uVar29 * 0x20 + 8) != 0) {
        uVar22 = 0;
        dVar37 = 0.0;
        goto code_r0x006c2270;
      }
      break;
    }
  }
code_r0x006c22a4:
  iVar21 = 0x22;
code_r0x006c22a8:
  lVar17 = *plVar18;
  iVar8 = *(int *)(lVar17 + 8);
  if ((lVar17 == 0) || (iVar8 != iRam0000000000a27a98)) {
    do {
      if ((iVar8 != iRam0000000000a27a48) && (iVar8 != iRam0000000000a27b38)) goto code_r0x006c2360;
      lVar17 = *(long *)(lVar17 + 0x20);
      iVar8 = *(int *)(lVar17 + 8);
    } while (lVar17 == 0 || iVar8 != iRam0000000000a27a98);
  }
  if (plVar10[0x13] != 0) {
    uVar20 = *(ulong *)(lVar17 + 0x20);
    if (uVar20 != plVar10[0x14]) {
      uVar23 = 0;
      uVar25 = uVar20 >> 4 ^ uVar20 >> 9;
      do {
        uVar25 = uVar25 & plVar10[0x12] - 1U;
        uVar27 = *(ulong *)(plVar10[0x11] + uVar25 * 0x18);
        if (uVar27 == uVar20) {
          if (*(char *)(plVar10[0x11] + uVar25 * 0x18 + 9) != '\0') goto code_r0x006c2558;
          break;
        }
        uVar23 = uVar23 + 1;
        uVar25 = uVar23 + uVar25;
      } while (uVar27 != plVar10[0x14] && uVar23 <= plVar10[0x12] - 1U);
    }
  }
code_r0x006c2360:
  for (lVar17 = plVar18[1]; iVar8 = *(int *)(lVar17 + 8),
      lVar17 == 0 || iVar8 != iRam0000000000a27a98; lVar17 = *(long *)(lVar17 + 0x20)) {
    if ((iVar8 != iRam0000000000a27a48) && (iVar8 != iRam0000000000a27b38)) goto code_r0x006c23e8;
  }
  if (plVar10[0x13] != 0) {
    uVar20 = *(ulong *)(lVar17 + 0x20);
    if (uVar20 != plVar10[0x14]) {
      uVar23 = 0;
      uVar25 = uVar20 >> 4 ^ uVar20 >> 9;
      do {
        uVar25 = uVar25 & plVar10[0x12] - 1U;
        uVar27 = *(ulong *)(plVar10[0x11] + uVar25 * 0x18);
        if (uVar27 == uVar20) {
          if (*(char *)(plVar10[0x11] + uVar25 * 0x18 + 9) != '\0') goto code_r0x006c2558;
          break;
        }
        uVar23 = uVar23 + 1;
        uVar25 = uVar23 + uVar25;
      } while (uVar27 != plVar10[0x14] && uVar23 <= plVar10[0x12] - 1U);
    }
  }
code_r0x006c23e8:
  for (lVar17 = plVar18[2]; iVar8 = *(int *)(lVar17 + 8),
      lVar17 == 0 || iVar8 != iRam0000000000a27a98; lVar17 = *(long *)(lVar17 + 0x20)) {
    if ((iVar8 != iRam0000000000a27a48) && (iVar8 != iRam0000000000a27b38)) goto code_r0x006c256c;
  }
  if (plVar10[0x13] != 0) {
    uVar20 = *(ulong *)(lVar17 + 0x20);
    if (uVar20 != plVar10[0x14]) {
      uVar23 = 0;
      uVar25 = uVar20 >> 4 ^ uVar20 >> 9;
      do {
        uVar25 = uVar25 & plVar10[0x12] - 1U;
        uVar27 = *(ulong *)(plVar10[0x11] + uVar25 * 0x18);
        if (uVar27 == uVar20) {
          if (*(char *)(plVar10[0x11] + uVar25 * 0x18 + 9) != '\0') goto code_r0x006c2558;
          break;
        }
        uVar23 = uVar23 + 1;
        uVar25 = uVar23 + uVar25;
      } while (uVar27 != plVar10[0x14] && uVar23 <= plVar10[0x12] - 1U);
    }
  }
code_r0x006c256c:
  uVar32 = 1;
code_r0x006c1a60:
  cVar16 = *(char *)(uVar14 + 0x48);
  *(int *)(puVar5 + -0x88) = iVar21;
  *(undefined4 *)(puVar5 + -0x84) = uVar32;
  uVar19 = (uint)uVar22;
  uVar32 = (undefined4)param_3;
  if (cVar16 == '\0') {
    if (iVar21 < 0) {
      uVar11 = *(undefined8 *)(uVar14 + 0x20);
      uVar34 = *(undefined4 *)((long)plVar10 + 0x484);
      *(uint *)((long)plVar10 + 0x484) = (uVar19 & 0xff) + 1;
      func_0x006c6028(plVar10,uVar11,uVar19 & 0xff,1);
      *(undefined4 *)((long)plVar10 + 0x484) = uVar34;
      *(undefined4 *)(puVar5 + -0x80) = 0;
      *(int *)(puVar5 + -0x7c) = iVar9;
      *(undefined4 *)(puVar5 + -0x78) = uVar32;
      uVar20 = *(ulong *)(uVar14 + 0x40);
    }
    else {
      *(undefined4 *)(puVar5 + -0x80) = 0;
      *(int *)(puVar5 + -0x7c) = iVar9;
      *(undefined4 *)(puVar5 + -0x78) = uVar32;
      uVar20 = *(ulong *)(uVar14 + 0x40);
    }
  }
  else {
    lVar17 = *(long *)(uVar14 + 0x20);
    if (*(int *)(lVar17 + 8) != iRam0000000000a27ad8) {
      lVar17 = 0;
    }
    lVar15 = *(long *)(lVar17 + 0x20);
    iVar21 = *(int *)(lVar15 + 8);
    lVar17 = lVar15;
    if (lVar15 == 0 || iVar21 != iRam0000000000a27a98) {
      do {
        if ((iVar21 != iRam0000000000a27a48) && (iVar21 != iRam0000000000a27b38))
        goto code_r0x006c1b3c;
        lVar17 = *(long *)(lVar17 + 0x20);
        iVar21 = *(int *)(lVar17 + 8);
      } while (lVar17 == 0 || iVar21 != iRam0000000000a27a98);
    }
    if (plVar10[0x13] != 0) {
      uVar20 = *(ulong *)(lVar17 + 0x20);
      if (uVar20 != plVar10[0x14]) {
        uVar23 = 0;
        lVar17 = plVar10[0x11];
        uVar25 = uVar20 >> 4 ^ uVar20 >> 9;
        do {
          uVar25 = uVar25 & plVar10[0x12] - 1U;
          uVar27 = *(ulong *)(lVar17 + uVar25 * 0x18);
          if (uVar27 == uVar20) {
            if (*(char *)(lVar17 + uVar25 * 0x18 + 9) != '\0') {
              *(uint *)(puVar5 + -0x80) = (uint)*(byte *)(lVar17 + uVar25 * 0x18 + 8);
              *(int *)(puVar5 + -0x7c) = iVar9;
              *(undefined4 *)(puVar5 + -0x78) = uVar32;
              uVar20 = *(ulong *)(uVar14 + 0x40);
              goto joined_r0x006c1f8c;
            }
            break;
          }
          uVar23 = uVar23 + 1;
          uVar25 = uVar23 + uVar25;
        } while (uVar27 != plVar10[0x14] && uVar23 <= plVar10[0x12] - 1U);
      }
    }
code_r0x006c1b3c:
    uVar34 = *(undefined4 *)((long)plVar10 + 0x484);
    *(uint *)((long)plVar10 + 0x484) = (uVar19 & 0xff) + 1;
    func_0x006c6028(plVar10,lVar15,uVar19 & 0xff,1);
    *(undefined4 *)((long)plVar10 + 0x484) = uVar34;
    *(uint *)(puVar5 + -0x80) = uVar19;
    *(int *)(puVar5 + -0x7c) = iVar9;
    *(undefined4 *)(puVar5 + -0x78) = uVar32;
    uVar20 = *(ulong *)(uVar14 + 0x40);
  }
joined_r0x006c1f8c:
  if (uVar20 != 0) {
    bVar31 = false;
    unaff_x25 = (uVar22 & 0xff) + 1;
    unaff_x28 = &PTR_s_pixelFormat_00a27000;
    unaff_x20 = &PTR_s_pixelFormat_00a27000;
    uVar22 = 0;
    do {
      unaff_x23 = uVar22 + 1;
      unaff_x26 = *(ulong *)(*(long *)(uVar14 + 0x38) + uVar22 * 8);
      iVar9 = (int)unaff_x25 + (int)uVar22;
      if (unaff_x23 == uVar20) {
        uVar19 = (uint)*(byte *)(uVar14 + 0x48) + iVar9;
        if (unaff_x26 == 0 || *(int *)(unaff_x26 + 8) != iRam0000000000a27ac8) {
          if (unaff_x26 != 0 && *(int *)(unaff_x26 + 8) == iRam0000000000a27ab8) {
            unaff_x27 = (ulong)(uVar19 & 0xff);
            uVar32 = *(undefined4 *)((long)plVar10 + 0x484);
            *(uint *)((long)plVar10 + 0x484) = uVar19 & 0xff;
            lVar17 = *plVar10;
            if (0 < *(int *)((long)plVar10 + 0xc)) {
              func_0x006b2e98(lVar17,*(int *)(unaff_x26 + 0xc) + 1);
              lVar17 = *plVar10;
            }
            func_0x006b1ccc(lVar17,0x3f,unaff_x27,0,0);
            bVar31 = true;
            *(undefined4 *)((long)plVar10 + 0x484) = uVar32;
            uVar20 = *(ulong *)(uVar14 + 0x40);
            goto joined_r0x006c1cbc;
          }
          func_0x006c6028(plVar10,unaff_x26,uVar19 & 0xff,1);
        }
        else {
          if (((int)plVar10[1] < 2) ||
             (uVar22 = func_0x006ca314(plVar10,unaff_x26), (uVar22 & 1) != 0))
          goto code_r0x006c1c3c;
          func_0x006c6028(plVar10,unaff_x26,uVar19 & 0xff,1);
        }
        bVar31 = false;
        uVar20 = *(ulong *)(uVar14 + 0x40);
      }
      else {
        uVar19 = iVar9 + (uint)*(byte *)(uVar14 + 0x48) & 0xff;
        uVar32 = *(undefined4 *)((long)plVar10 + 0x484);
        *(uint *)((long)plVar10 + 0x484) = uVar19 + 1;
        func_0x006c6028(plVar10,unaff_x26,uVar19,1);
        *(undefined4 *)((long)plVar10 + 0x484) = uVar32;
        uVar20 = *(ulong *)(uVar14 + 0x40);
      }
joined_r0x006c1cbc:
      uVar22 = unaff_x23;
      if (uVar20 <= unaff_x23) {
        iVar9 = *(int *)((long)plVar10 + 0xc);
        goto joined_r0x006c1cf4;
      }
    } while( true );
  }
  bVar31 = false;
  iVar9 = *(int *)((long)plVar10 + 0xc);
joined_r0x006c1cf4:
  if (0 < iVar9) {
    func_0x006b2e98(*plVar10,*(int *)(*(long *)(uVar14 + 0x20) + 0x14) + 1);
  }
  if (*(char *)(uVar14 + 0x48) == '\0') {
    if (*(int *)(puVar5 + -0x84) != 0) {
      uVar11 = func_0x006b2784(*plVar10);
      uVar12 = *(undefined8 *)(puVar5 + -0x68);
      func_0x006b1ccc(*plVar10,0x44,*(uint *)(puVar5 + -0x88) & 0xff,0,0);
      func_0x006c6028(plVar10,*(undefined8 *)(uVar14 + 0x20),(uint)uVar12 & 0xff,1);
      uVar12 = func_0x006b2784(*plVar10);
      uVar22 = func_0x006b2964(*plVar10,uVar11,uVar12);
      if ((uVar22 & 1) == 0) {
        func_0x006bc388(*(long *)(uVar14 + 0x20) + 0xc,
                        "Exceeded jump distance limit; simplify the code to compile");
        goto code_r0x006c26d8;
      }
    }
  }
  else {
    lVar17 = *(long *)(uVar14 + 0x20);
    if (*(int *)(lVar17 + 8) != iRam0000000000a27ad8) {
      lVar17 = 0;
    }
    lVar15 = *plVar10;
    if (*(int *)((long)plVar10 + 0xc) < 1) {
      uVar19 = *(uint *)(puVar5 + -0x80);
    }
    else {
      func_0x006b2e98(lVar15,*(int *)(lVar17 + 0x30) + 1);
      uVar19 = *(uint *)(puVar5 + -0x80);
      lVar15 = *plVar10;
    }
    uVar35 = *(undefined8 *)(lVar17 + 0x28);
    uVar11 = _strlen(uVar35);
    uVar12 = func_0x006b1354(lVar15,uVar35,uVar11);
    if ((int)uVar12 < 0) {
      func_0x006bc388(lVar17 + 0xc,"Exceeded constant limit; simplify the code to compile");
code_r0x006c26d8:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x6c26dc);
      (*pcVar4)();
    }
    lVar15 = *plVar10;
    uVar6 = func_0x006b401c(uVar35,uVar11);
    func_0x006b1ccc(lVar15,0x14,(uint)*(undefined8 *)(puVar5 + -0x68) & 0xff,uVar19 & 0xff,uVar6);
    func_0x006b24c4(*plVar10,uVar12);
    func_0x006c9bf0(plVar10,*(undefined8 *)(lVar17 + 0x20),uVar19 & 0xff,4,2);
  }
  if (bVar31) {
    cVar16 = '\0';
  }
  else {
    cVar16 = *(char *)(uVar14 + 0x48) + *(char *)(uVar14 + 0x40) + '\x01';
  }
  uVar34 = *(undefined4 *)(puVar5 + -0x70);
  uVar2 = *(uint *)(puVar5 + -0x6c);
  uVar11 = *(undefined8 *)(puVar5 + -0x68);
  uVar19 = 0;
  if (*(int *)(puVar5 + -0x74) == 0) {
    uVar19 = uVar2 + 1;
  }
  func_0x006b1ccc(*plVar10,0x15,(uint)uVar11 & 0xff,cVar16,uVar19 & 0xff);
  iVar9 = *(int *)(puVar5 + -0x78);
  if (((*(uint *)(puVar5 + -0x7c) & 1) == 0) && (uVar2 != 0)) {
    uVar22 = 0;
    do {
      func_0x006b1ccc(*plVar10,6,(int)uVar22 + iVar9 & 0xff,(uint)uVar11 + (int)uVar22 & 0xff,0);
      uVar22 = uVar22 + 1;
    } while (uVar2 != uVar22);
  }
code_r0x006c1f04:
  *(undefined4 *)((long)plVar10 + 0x484) = uVar34;
  return;
}

