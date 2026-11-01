
/* WARNING: Type propagation algorithm not settling */

void FUN_006cd190(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 *puVar3;
  uint uVar4;
  undefined1 uVar5;
  char cVar6;
  code *pcVar7;
  undefined1 in_CY;
  bool bVar8;
  int iVar9;
  undefined4 uVar10;
  undefined8 uVar11;
  ulong uVar12;
  ulong *puVar13;
  uint in_w8;
  long lVar14;
  ulong *puVar15;
  long *plVar16;
  long lVar17;
  byte bVar18;
  byte bVar19;
  ulong uVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  ulong uVar24;
  ulong uVar25;
  ulong *puVar26;
  undefined8 *unaff_x19;
  long unaff_x21;
  ulong unaff_x22;
  undefined8 *puVar27;
  uint unaff_w23;
  ulong unaff_x24;
  ulong *puVar28;
  ulong uVar29;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong unaff_d8;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  int iStack0000000000000040;
  undefined4 uStack0000000000000044;
  long in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined7 uStack0000000000000078;
  char cStack000000000000007f;
  undefined1 uStack0000000000000080;
  undefined1 uStack0000000000000081;
  undefined5 uStack0000000000000082;
  undefined1 uStack0000000000000087;
  undefined7 uStack0000000000000088;
  undefined1 uStack000000000000008f;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  
code_r0x006cd190:
  if ((bool)in_CY) {
    func_0x006bc388(unaff_x24 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
  }
  else {
    *(uint *)((long)unaff_x19 + 0x484) = in_w8;
    uVar1 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= in_w8) {
      uVar1 = in_w8;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar1;
    uVar10 = func_0x006b3150(*unaff_x19);
    func_0x006c6028();
    puVar13 = in_stack_00000060;
    puVar28 = uStack0000000000000058;
    if (in_stack_00000060 < in_stack_00000068) goto LAB_006ccd20;
    lVar17 = (long)in_stack_00000060 - (long)uStack0000000000000058 >> 3;
    uVar29 = lVar17 * 0x6db6db6db6db6db7 + 1;
    if (uVar29 < 0x492492492492493) {
      lVar14 = (long)in_stack_00000068 - (long)uStack0000000000000058 >> 3;
      uVar20 = lVar14 * -0x2492492492492492;
      if (uVar20 <= uVar29) {
        uVar20 = uVar29;
      }
      if (0x249249249249248 < (ulong)(lVar14 * 0x6db6db6db6db6db7)) {
        uVar20 = 0x492492492492492;
      }
      if (uVar20 == 0) {
        lVar14 = 0;
      }
      else {
        if (0x492492492492492 < uVar20) {
          func_0x00017514();
          goto code_r0x006ce104;
        }
        lVar14 = __Znwm(uVar20 * 0x38);
      }
      puVar15 = (ulong *)(lVar14 + lVar17 * 8);
      *puVar15 = unaff_x27;
      *(char *)(puVar15 + 1) = (char)unaff_w23;
      puVar15[2] = 0;
      puVar15[3] = 0;
      *(undefined4 *)(puVar15 + 5) = uVar10;
      puVar15[6] = 0;
      uStack0000000000000058 = puVar15;
      if (puVar13 == puVar28) goto LAB_006cd2d4;
      do {
        uVar24 = puVar13[-6];
        uVar29 = puVar13[-7];
        uVar12 = puVar13[-4];
        uVar25 = puVar13[-5];
        uVar31 = puVar13[-2];
        uVar30 = puVar13[-3];
        puVar26 = puVar13 + -1;
        puVar13 = puVar13 + -7;
        uStack0000000000000058[-1] = *puVar26;
        uStack0000000000000058[-2] = uVar31;
        uStack0000000000000058[-3] = uVar30;
        uStack0000000000000058[-4] = uVar12;
        uStack0000000000000058[-5] = uVar25;
        uStack0000000000000058[-6] = uVar24;
        uStack0000000000000058[-7] = uVar29;
        uStack0000000000000058 = uStack0000000000000058 + -7;
      } while (puVar13 != puVar28);
code_r0x006cd2d0:
      puVar13 = puVar28;
LAB_006cd2d4:
      unaff_x21 = 0x38;
      in_stack_00000068 = (ulong *)(lVar14 + uVar20 * 0x38);
      unaff_x28 = in_stack_00000048;
joined_r0x006cd2e8:
      puVar15 = puVar15 + 7;
      if (puVar13 != (ulong *)0x0) {
        __ZdlPv(puVar13);
      }
LAB_006ccd38:
      uVar29 = *(ulong *)(unaff_x28 + 0x60);
      in_stack_00000060 = puVar15;
      if (uVar29 <= unaff_x22) goto code_r0x006cd954;
      uVar20 = *(ulong *)(in_stack_00000050 + 0x40);
      if (unaff_x22 < uVar20) {
        unaff_x24 = *(ulong *)(*(long *)(in_stack_00000050 + 0x38) + unaff_x22 * 8);
        unaff_x27 = *(ulong *)(*(long *)(unaff_x28 + 0x58) + unaff_x22 * 8);
        bVar8 = unaff_x22 + 1 != uVar20;
        if ((!bVar8 && uVar20 <= uVar29) && (bVar8 || uVar29 != uVar20)) goto code_r0x006ccd9c;
      }
      else {
        unaff_x24 = 0;
        unaff_x27 = *(ulong *)(*(long *)(unaff_x28 + 0x58) + unaff_x22 * 8);
        if (unaff_x22 + 1 == uVar20 && uVar20 < uVar29) {
code_r0x006ccd9c:
          iVar9 = func_0x006ca314();
          if (iVar9 != 0) {
            iVar9 = *(int *)(unaff_x28 + 0x60) - *(int *)(in_stack_00000050 + 0x40);
            uVar4 = *(uint *)((long)unaff_x19 + 0x484);
            uVar1 = iVar9 + 1 + uVar4;
            if (0xff < uVar1) {
              func_0x006bc388(unaff_x24 + 0xc,
                              "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             );
              goto code_r0x006ce104;
            }
            *(uint *)((long)unaff_x19 + 0x484) = uVar1;
            uVar2 = *(uint *)(unaff_x19 + 0x91);
            if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
              uVar2 = uVar1;
            }
            *(uint *)(unaff_x19 + 0x91) = uVar2;
            uVar10 = func_0x006b3150(*unaff_x19);
            if ((*(int *)(unaff_x24 + 8) == iRam0000000000a27ac8) && (unaff_x24 != 0)) {
              func_0x006c17d8();
            }
            else if ((*(int *)(unaff_x24 + 8) == iRam0000000000a27ab8) && (unaff_x24 != 0)) {
              if (0 < *(int *)((long)unaff_x19 + 0xc)) {
                func_0x006b2e98(*unaff_x19,*(int *)(unaff_x24 + 0xc) + 1);
              }
              func_0x006b1ccc(*unaff_x19,0x3f,uVar4 & 0xff,iVar9 + 2U & 0xff,0);
            }
            uVar29 = *(ulong *)(unaff_x28 + 0x60);
            if (uVar29 <= unaff_x22) goto code_r0x006cd954;
            uVar20 = unaff_x22;
            goto code_r0x006cd7e8;
          }
        }
      }
      puVar13 = in_stack_00000060;
      puVar28 = uStack0000000000000058;
      unaff_x22 = unaff_x22 + 1;
      if ((unaff_x19[0x1d] != 0) && (unaff_x27 != unaff_x19[0x1e])) {
        uVar29 = 0;
        uVar20 = unaff_x27 >> 4 ^ unaff_x27 >> 9;
        while( true ) {
          uVar20 = uVar20 & unaff_x19[0x1c] - 1;
          uVar24 = *(ulong *)(unaff_x19[0x1b] + uVar20 * unaff_x26);
          if (uVar24 == unaff_x27) break;
          uVar29 = uVar29 + 1;
          uVar20 = uVar29 + uVar20;
          if (!(uVar24 != unaff_x19[0x1e] && uVar29 <= unaff_x19[0x1c] - 1)) goto code_r0x006ccdfc;
        }
        if (*(char *)(unaff_x19[0x1b] + uVar20 * unaff_x26 + 0x10) == '\0') goto code_r0x006ccdfc;
        unaff_w23 = *(uint *)((long)unaff_x19 + 0x484);
        uVar1 = unaff_w23 + 1;
        if (0xff < uVar1) {
          func_0x006bc388(unaff_x24 + 0xc,
                          "Out of registers when trying to allocate %d registers: exceeded limit %d"
                         );
          goto code_r0x006ce104;
        }
        *(uint *)((long)unaff_x19 + 0x484) = uVar1;
        uVar4 = *(uint *)(unaff_x19 + 0x91);
        if (*(uint *)(unaff_x19 + 0x91) <= uVar1) {
          uVar4 = uVar1;
        }
        *(uint *)(unaff_x19 + 0x91) = uVar4;
        uVar10 = func_0x006b3150(*unaff_x19);
        if (unaff_x24 == 0) {
          func_0x006b1ccc(*unaff_x19,2,unaff_w23 & 0xff,0,0);
        }
        else {
          func_0x006c6028();
        }
        puVar13 = in_stack_00000060;
        puVar28 = uStack0000000000000058;
        if (in_stack_00000060 < in_stack_00000068) goto LAB_006ccd20;
        lVar17 = (long)in_stack_00000060 - (long)uStack0000000000000058 >> 3;
        uVar29 = lVar17 * 0x6db6db6db6db6db7 + 1;
        if (0x492492492492492 < uVar29) {
          func_0x00017f90(&uStack0000000000000058);
          goto code_r0x006ce104;
        }
        lVar14 = (long)in_stack_00000068 - (long)uStack0000000000000058 >> 3;
        uVar20 = lVar14 * -0x2492492492492492;
        if (uVar20 <= uVar29) {
          uVar20 = uVar29;
        }
        if (0x249249249249248 < (ulong)(lVar14 * 0x6db6db6db6db6db7)) {
          uVar20 = 0x492492492492492;
        }
        if (uVar20 == 0) {
          lVar14 = 0;
        }
        else {
          if (0x492492492492492 < uVar20) {
            func_0x00017514();
            goto code_r0x006ce104;
          }
          lVar14 = __Znwm(uVar20 * 0x38);
        }
        puVar15 = (ulong *)(lVar14 + lVar17 * 8);
        *puVar15 = unaff_x27;
        *(char *)(puVar15 + 1) = (char)unaff_w23;
        puVar15[2] = 0;
        puVar15[3] = 0;
        *(undefined4 *)(puVar15 + 5) = uVar10;
        puVar15[6] = 0;
        uStack0000000000000058 = puVar15;
        if (puVar13 == puVar28) goto LAB_006cd2d4;
        do {
          uVar24 = puVar13[-6];
          uVar29 = puVar13[-7];
          uVar12 = puVar13[-4];
          uVar25 = puVar13[-5];
          uVar31 = puVar13[-2];
          uVar30 = puVar13[-3];
          puVar26 = puVar13 + -1;
          puVar13 = puVar13 + -7;
          uStack0000000000000058[-1] = *puVar26;
          uStack0000000000000058[-2] = uVar31;
          uStack0000000000000058[-3] = uVar30;
          uStack0000000000000058[-4] = uVar12;
          uStack0000000000000058[-5] = uVar25;
          uStack0000000000000058[-6] = uVar24;
          uStack0000000000000058[-7] = uVar29;
          uStack0000000000000058 = uStack0000000000000058 + -7;
        } while (puVar13 != puVar28);
        goto code_r0x006cd2d0;
      }
code_r0x006ccdfc:
      if (unaff_x24 == 0) {
        if (in_stack_00000060 < in_stack_00000068) {
          *in_stack_00000060 = unaff_x27;
          *(undefined1 *)(in_stack_00000060 + 1) = 0xff;
          in_stack_00000060[2] = unaff_d8;
          in_stack_00000060[3] = 0;
          *(undefined4 *)(in_stack_00000060 + 5) = 0;
          goto code_r0x006ccd30;
        }
        lVar17 = ((long)in_stack_00000060 - (long)uStack0000000000000058 >> 3) * 0x6db6db6db6db6db7;
        uVar29 = lVar17 + 1;
        if (0x492492492492492 < uVar29) {
          func_0x00017f90(&uStack0000000000000058);
          goto code_r0x006ce104;
        }
        lVar14 = (long)in_stack_00000068 - (long)uStack0000000000000058 >> 3;
        uVar20 = lVar14 * -0x2492492492492492;
        if (uVar20 <= uVar29) {
          uVar20 = uVar29;
        }
        if (0x249249249249248 < (ulong)(lVar14 * 0x6db6db6db6db6db7)) {
          uVar20 = 0x492492492492492;
        }
        if (uVar20 == 0) {
          lVar14 = 0;
        }
        else {
          if (0x492492492492492 < uVar20) {
            func_0x00017514();
            goto code_r0x006ce104;
          }
          lVar14 = __Znwm(uVar20 * 0x38);
        }
        puVar15 = (ulong *)(lVar14 + lVar17 * unaff_x21);
        *puVar15 = unaff_x27;
        *(undefined1 *)(puVar15 + 1) = 0xff;
        puVar15[2] = unaff_d8;
        puVar15[3] = 0;
        *(undefined4 *)(puVar15 + 5) = 0;
        puVar15[6] = 0;
        uStack0000000000000058 = puVar15;
        if (puVar13 != puVar28) goto code_r0x006cd114;
        goto code_r0x006cd14c;
      }
      if ((unaff_x19[0x22] != 0) && (unaff_x24 != unaff_x19[0x23])) goto code_r0x006cce14;
code_r0x006cce50:
      iVar9 = *(int *)(unaff_x24 + 8);
      uVar29 = unaff_x24;
      if (iVar9 != iRam0000000000a27a98) {
        do {
          if ((iVar9 != iRam0000000000a27a48) && (iVar9 != iRam0000000000a27b38))
          goto code_r0x006cd184;
          uVar29 = *(ulong *)(uVar29 + 0x20);
          iVar9 = *(int *)(uVar29 + 8);
        } while (uVar29 == 0 || iVar9 != iRam0000000000a27a98);
      }
      puVar15 = (ulong *)0x0;
      if (unaff_x19[0x1d] == 0) {
code_r0x006ccecc:
        lVar17 = unaff_x19[0x13];
      }
      else {
        uVar20 = *(ulong *)(uVar29 + 0x20);
        if (uVar20 != unaff_x19[0x1e]) {
          uVar24 = 0;
          uVar25 = uVar20 >> 4 ^ uVar20 >> 9;
          do {
            uVar25 = uVar25 & unaff_x19[0x1c] - 1;
            puVar26 = (ulong *)(unaff_x19[0x1b] + uVar25 * unaff_x26);
            if (*puVar26 == uVar20) goto code_r0x006ccec0;
            if (*puVar26 == unaff_x19[0x1e]) break;
            uVar24 = uVar24 + 1;
            uVar25 = uVar24 + uVar25;
          } while (uVar24 <= unaff_x19[0x1c] - 1);
          puVar26 = (ulong *)0x0;
code_r0x006ccec0:
          puVar15 = (ulong *)0x0;
          if (puVar26 != (ulong *)0x0) {
            puVar15 = puVar26 + 1;
          }
          goto code_r0x006ccecc;
        }
        puVar15 = (ulong *)0x0;
        lVar17 = unaff_x19[0x13];
      }
      if (lVar17 != 0) {
        uVar29 = *(ulong *)(uVar29 + 0x20);
        if (uVar29 != unaff_x19[0x14]) {
          uVar20 = 0;
          lVar17 = unaff_x19[0x11];
          uVar24 = uVar29 >> 4 ^ uVar29 >> 9;
          while( true ) {
            uVar24 = uVar24 & unaff_x19[0x12] - 1;
            uVar25 = *(ulong *)(lVar17 + uVar24 * unaff_x26);
            if (uVar25 == uVar29) break;
            uVar20 = uVar20 + 1;
            uVar24 = uVar20 + uVar24;
            if (uVar25 == unaff_x19[0x14] || unaff_x19[0x12] - 1 < uVar20) goto code_r0x006cd184;
          }
          if (*(char *)(lVar17 + uVar24 * unaff_x26 + 9) != '\0') {
            uVar5 = *(undefined1 *)(lVar17 + uVar24 * unaff_x26 + 8);
            if (puVar15 == (ulong *)0x0) {
              uVar29 = 0;
            }
            else {
              if ((char)puVar15[1] != '\0') goto code_r0x006cd184;
              uVar29 = *puVar15;
            }
            if (in_stack_00000060 < in_stack_00000068) {
              *in_stack_00000060 = unaff_x27;
              *(undefined1 *)(in_stack_00000060 + 1) = uVar5;
              *(undefined4 *)((long)in_stack_00000060 + 9) = (undefined4)uStack0000000000000070;
              *(undefined4 *)((long)in_stack_00000060 + 0xc) = uStack0000000000000070._3_4_;
              in_stack_00000060[2] = 0;
              in_stack_00000060[3] = 0;
              *(undefined4 *)(in_stack_00000060 + 5) = 0xffffffff;
              in_stack_00000060[6] = uVar29;
              puVar15 = in_stack_00000060 + 7;
            }
            else {
              lVar17 = ((long)in_stack_00000060 - (long)uStack0000000000000058 >> 3) *
                       0x6db6db6db6db6db7;
              uVar20 = lVar17 + 1;
              if (0x492492492492492 < uVar20) {
                func_0x00017f90(&uStack0000000000000058);
                goto code_r0x006ce104;
              }
              lVar14 = (long)in_stack_00000068 - (long)uStack0000000000000058 >> 3;
              uVar24 = lVar14 * -0x2492492492492492;
              if (uVar24 <= uVar20) {
                uVar24 = uVar20;
              }
              if (0x249249249249248 < (ulong)(lVar14 * 0x6db6db6db6db6db7)) {
                uVar24 = 0x492492492492492;
              }
              if (uVar24 == 0) {
                lVar14 = 0;
              }
              else {
                if (0x492492492492492 < uVar24) {
                  func_0x00017514();
                  goto code_r0x006ce104;
                }
                lVar14 = __Znwm(uVar24 * 0x38);
              }
              puVar15 = (ulong *)(lVar14 + lVar17 * unaff_x21);
              *puVar15 = unaff_x27;
              *(undefined1 *)(puVar15 + 1) = uVar5;
              *(undefined4 *)((long)puVar15 + 9) = (undefined4)uStack0000000000000070;
              *(undefined4 *)((long)puVar15 + 0xc) = uStack0000000000000070._3_4_;
              puVar15[2] = 0;
              puVar15[3] = 0;
              *(undefined4 *)(puVar15 + 5) = 0xffffffff;
              puVar15[6] = uVar29;
              uStack0000000000000058 = puVar15;
              if (puVar13 != puVar28) {
                do {
                  uVar20 = puVar13[-6];
                  uVar29 = puVar13[-7];
                  uVar12 = puVar13[-4];
                  uVar25 = puVar13[-5];
                  uVar31 = puVar13[-2];
                  uVar30 = puVar13[-3];
                  puVar26 = puVar13 + -1;
                  puVar13 = puVar13 + -7;
                  uStack0000000000000058[-1] = *puVar26;
                  uStack0000000000000058[-2] = uVar31;
                  uStack0000000000000058[-3] = uVar30;
                  uStack0000000000000058[-4] = uVar12;
                  uStack0000000000000058[-5] = uVar25;
                  uStack0000000000000058[-6] = uVar20;
                  uStack0000000000000058[-7] = uVar29;
                  uStack0000000000000058 = uStack0000000000000058 + -7;
                } while (puVar13 != puVar28);
                puVar13 = puVar28;
              }
              in_stack_00000068 = (ulong *)(lVar14 + uVar24 * unaff_x21);
              puVar15 = puVar15 + 7;
              if (puVar13 != (ulong *)0x0) {
                __ZdlPv(puVar13);
              }
              unaff_x28 = in_stack_00000048;
            }
            goto LAB_006ccd38;
          }
        }
      }
code_r0x006cd184:
      unaff_w23 = *(uint *)((long)unaff_x19 + 0x484);
      in_w8 = unaff_w23 + 1;
      in_CY = 0xff < in_w8;
      goto code_r0x006cd190;
    }
    func_0x00017f90(&uStack0000000000000058);
  }
  goto code_r0x006ce104;
LAB_006ccd20:
  *in_stack_00000060 = unaff_x27;
  *(char *)(in_stack_00000060 + 1) = (char)unaff_w23;
  in_stack_00000060[2] = 0;
  in_stack_00000060[3] = 0;
  *(undefined4 *)(in_stack_00000060 + 5) = uVar10;
code_r0x006ccd30:
  puVar15 = in_stack_00000060 + 7;
  in_stack_00000060[6] = 0;
  goto LAB_006ccd38;
code_r0x006cce14:
  uVar29 = 0;
  uVar20 = unaff_x24 >> 4 ^ unaff_x24 >> 9;
  while( true ) {
    uVar20 = uVar20 & unaff_x19[0x21] - 1;
    uVar24 = *(ulong *)(unaff_x19[0x20] + uVar20 * 0x20);
    if (uVar24 == unaff_x24) break;
    uVar29 = uVar29 + 1;
    uVar20 = uVar29 + uVar20;
    if (!(uVar24 != unaff_x19[0x23] && uVar29 <= unaff_x19[0x21] - 1)) goto code_r0x006cce50;
  }
  lVar17 = unaff_x19[0x20] + uVar20 * 0x20;
  if (*(int *)(lVar17 + 8) == 0) goto code_r0x006cce50;
  uVar11 = *(undefined8 *)(lVar17 + 8);
  in_stack_00000020[1] = *(undefined8 *)(lVar17 + 0x10);
  *in_stack_00000020 = uVar11;
  in_stack_00000020[2] = *(undefined8 *)(lVar17 + 0x18);
  if (in_stack_00000060 < in_stack_00000068) {
    *in_stack_00000060 = unaff_x27;
    *(undefined1 *)(in_stack_00000060 + 1) = 0xff;
    *(ulong *)((long)in_stack_00000060 + 0x11) =
         CONCAT17(cStack000000000000007f,uStack0000000000000078);
    *(long *)((long)in_stack_00000060 + 9) = uStack0000000000000070;
    in_stack_00000060[4] = CONCAT71(uStack0000000000000088,uStack0000000000000087);
    in_stack_00000060[3] =
         CONCAT53(uStack0000000000000082,
                  CONCAT12(uStack0000000000000081,
                           CONCAT11(uStack0000000000000080,cStack000000000000007f)));
    *(undefined4 *)(in_stack_00000060 + 5) = 0;
    in_stack_00000060[6] = 0;
    puVar15 = in_stack_00000060 + 7;
    goto LAB_006ccd38;
  }
  lVar17 = ((long)in_stack_00000060 - (long)uStack0000000000000058 >> 3) * 0x6db6db6db6db6db7;
  uVar29 = lVar17 + 1;
  if (0x492492492492492 < uVar29) {
    func_0x00017f90(&uStack0000000000000058);
    goto code_r0x006ce104;
  }
  lVar14 = (long)in_stack_00000068 - (long)uStack0000000000000058 >> 3;
  uVar20 = lVar14 * -0x2492492492492492;
  if (uVar20 <= uVar29) {
    uVar20 = uVar29;
  }
  if (0x249249249249248 < (ulong)(lVar14 * 0x6db6db6db6db6db7)) {
    uVar20 = 0x492492492492492;
  }
  if (uVar20 == 0) {
    lVar14 = 0;
  }
  else {
    if (0x492492492492492 < uVar20) {
      func_0x00017514();
      goto code_r0x006ce104;
    }
    lVar14 = __Znwm(uVar20 * 0x38);
  }
  puVar15 = (ulong *)(lVar14 + lVar17 * unaff_x21);
  *puVar15 = unaff_x27;
  *(undefined1 *)(puVar15 + 1) = 0xff;
  *(ulong *)((long)puVar15 + 0x11) = CONCAT17(cStack000000000000007f,uStack0000000000000078);
  *(long *)((long)puVar15 + 9) = uStack0000000000000070;
  puVar15[4] = CONCAT71(uStack0000000000000088,uStack0000000000000087);
  puVar15[3] = CONCAT53(uStack0000000000000082,
                        CONCAT12(uStack0000000000000081,
                                 CONCAT11(uStack0000000000000080,cStack000000000000007f)));
  *(undefined4 *)(puVar15 + 5) = 0;
  puVar15[6] = 0;
  uStack0000000000000058 = puVar15;
  if (puVar13 == puVar28) goto code_r0x006cd14c;
  do {
    uVar24 = puVar13[-6];
    uVar29 = puVar13[-7];
    uVar12 = puVar13[-4];
    uVar25 = puVar13[-5];
    uVar31 = puVar13[-2];
    uVar30 = puVar13[-3];
    puVar26 = puVar13 + -1;
    puVar13 = puVar13 + -7;
    uStack0000000000000058[-1] = *puVar26;
    uStack0000000000000058[-2] = uVar31;
    uStack0000000000000058[-3] = uVar30;
    uStack0000000000000058[-4] = uVar12;
    uStack0000000000000058[-5] = uVar25;
    uStack0000000000000058[-6] = uVar24;
    uStack0000000000000058[-7] = uVar29;
    uStack0000000000000058 = uStack0000000000000058 + -7;
  } while (puVar13 != puVar28);
code_r0x006cd148:
  puVar13 = puVar28;
code_r0x006cd14c:
  in_stack_00000068 = (ulong *)(lVar14 + uVar20 * unaff_x21);
  goto joined_r0x006cd2e8;
code_r0x006cd114:
  do {
    uVar24 = puVar13[-6];
    uVar29 = puVar13[-7];
    uVar12 = puVar13[-4];
    uVar25 = puVar13[-5];
    uVar31 = puVar13[-2];
    uVar30 = puVar13[-3];
    puVar26 = puVar13 + -1;
    puVar13 = puVar13 + -7;
    uStack0000000000000058[-1] = *puVar26;
    uStack0000000000000058[-2] = uVar31;
    uStack0000000000000058[-3] = uVar30;
    uStack0000000000000058[-4] = uVar12;
    uStack0000000000000058[-5] = uVar25;
    uStack0000000000000058[-6] = uVar24;
    uStack0000000000000058[-7] = uVar29;
    uStack0000000000000058 = uStack0000000000000058 + -7;
  } while (puVar13 != puVar28);
  goto code_r0x006cd148;
code_r0x006cd7e8:
  do {
    puVar13 = in_stack_00000060;
    puVar28 = uStack0000000000000058;
    uVar29 = *(ulong *)(*(long *)(unaff_x28 + 0x58) + uVar20 * 8);
    cVar6 = ((char)uVar20 - (char)unaff_x22) + (char)uVar4;
    if (in_stack_00000060 < in_stack_00000068) {
      *in_stack_00000060 = uVar29;
      *(char *)(in_stack_00000060 + 1) = cVar6;
      in_stack_00000060[2] = 0;
      in_stack_00000060[3] = 0;
      *(undefined4 *)(in_stack_00000060 + 5) = uVar10;
      in_stack_00000060[6] = 0;
      puVar15 = in_stack_00000060;
    }
    else {
      lVar17 = (long)in_stack_00000060 - (long)uStack0000000000000058 >> 3;
      uVar24 = lVar17 * 0x6db6db6db6db6db7 + 1;
      if (0x492492492492492 < uVar24) {
        func_0x00017f90(&uStack0000000000000058);
        goto code_r0x006ce104;
      }
      lVar14 = (long)in_stack_00000068 - (long)uStack0000000000000058 >> 3;
      uVar25 = lVar14 * -0x2492492492492492;
      if (uVar25 <= uVar24) {
        uVar25 = uVar24;
      }
      if (0x249249249249248 < (ulong)(lVar14 * 0x6db6db6db6db6db7)) {
        uVar25 = 0x492492492492492;
      }
      if (uVar25 == 0) {
        lVar14 = 0;
      }
      else {
        if (0x492492492492492 < uVar25) {
          func_0x00017514();
          goto code_r0x006ce104;
        }
        lVar14 = __Znwm(uVar25 * 0x38);
      }
      puVar15 = (ulong *)(lVar14 + lVar17 * 8);
      *puVar15 = uVar29;
      *(char *)(puVar15 + 1) = cVar6;
      puVar15[2] = 0;
      puVar15[3] = 0;
      *(undefined4 *)(puVar15 + 5) = uVar10;
      puVar15[6] = 0;
      uStack0000000000000058 = puVar15;
      puVar26 = puVar13;
      for (; puVar13 != puVar28; puVar13 = puVar13 + -7) {
        uVar24 = puVar13[-6];
        uVar29 = puVar13[-7];
        uVar30 = puVar13[-4];
        uVar12 = puVar13[-5];
        uVar32 = puVar13[-2];
        uVar31 = puVar13[-3];
        uStack0000000000000058[-1] = puVar13[-1];
        uStack0000000000000058[-2] = uVar32;
        uStack0000000000000058[-3] = uVar31;
        uStack0000000000000058[-4] = uVar30;
        uStack0000000000000058[-5] = uVar12;
        uStack0000000000000058[-6] = uVar24;
        uStack0000000000000058[-7] = uVar29;
        uStack0000000000000058 = uStack0000000000000058 + -7;
        puVar26 = puVar28;
      }
      in_stack_00000068 = (ulong *)(lVar14 + uVar25 * 0x38);
      if (puVar26 != (ulong *)0x0) {
        __ZdlPv(puVar26);
      }
    }
    in_stack_00000060 = puVar15 + 7;
    uVar20 = uVar20 + 1;
    uVar29 = *(ulong *)(in_stack_00000048 + 0x60);
    unaff_x28 = in_stack_00000048;
  } while (uVar20 < uVar29);
code_r0x006cd954:
  if (uVar29 < *(ulong *)(in_stack_00000050 + 0x40)) {
    do {
      func_0x006c27d4();
      uVar29 = uVar29 + 1;
    } while (uVar29 < *(ulong *)(in_stack_00000050 + 0x40));
  }
  puVar13 = in_stack_00000060;
  if (uStack0000000000000058 != in_stack_00000060) {
    puVar28 = uStack0000000000000058;
    do {
      if ((int)puVar28[2] == 0) {
        func_0x006bea90();
        if ((puVar28[6] != 0) && (unaff_x19[0x1d] != 0)) {
          uVar29 = *puVar28;
          if (uVar29 != unaff_x19[0x1e]) {
            uVar20 = 0;
            uVar24 = uVar29 >> 4 ^ uVar29 >> 9;
            do {
              uVar24 = uVar24 & unaff_x19[0x1c] - 1;
              uVar25 = *(ulong *)(unaff_x19[0x1b] + uVar24 * 0x18);
              if (uVar25 == uVar29) {
                *(ulong *)(unaff_x19[0x1b] + uVar24 * 0x18 + 8) = puVar28[6];
                break;
              }
              uVar20 = uVar20 + 1;
              uVar24 = uVar20 + uVar24;
            } while (uVar25 != unaff_x19[0x1e] && uVar20 <= unaff_x19[0x1c] - 1);
          }
        }
      }
      else {
        puVar15 = (ulong *)func_0x006ce3fc(unaff_x19 + 0x25,puVar28);
        uVar20 = puVar28[3];
        uVar29 = puVar28[2];
        puVar15[2] = puVar28[4];
        puVar15[1] = uVar20;
        *puVar15 = uVar29;
      }
      puVar28 = puVar28 + 7;
    } while (puVar28 != puVar13);
  }
  uVar29 = in_stack_00000030 - in_stack_00000028 >> 3;
  uStack0000000000000078 = (undefined7)uVar29;
  cStack000000000000007f = (char)(in_stack_00000030 - in_stack_00000028 >> 0x3b);
  uStack0000000000000080 = (undefined1)_iStack0000000000000040;
  uStack0000000000000081 = (undefined1)((ulong)in_stack_00000038 >> 0x20);
  in_stack_00000090 = 0;
  in_stack_00000098 = 0;
  uStack0000000000000088 = 0;
  uStack000000000000008f = 0;
  plVar16 = (long *)unaff_x19[0xa1];
  uStack0000000000000070 = unaff_x28;
  if (plVar16 < (long *)unaff_x19[0xa2]) {
    *(ushort *)(plVar16 + 2) = CONCAT11(uStack0000000000000081,uStack0000000000000080);
    plVar16[1] = CONCAT17(cStack000000000000007f,uStack0000000000000078);
    *plVar16 = unaff_x28;
    plVar16[4] = 0;
    plVar16[5] = 0;
    plVar16[3] = 0;
    plVar16[4] = 0;
    plVar16[3] = 0;
    plVar16[5] = 0;
    unaff_x19[0xa1] = plVar16 + 6;
  }
  else {
    uVar11 = func_0x006ce644(unaff_x19 + 0xa0,&uStack0000000000000070);
    unaff_x19[0xa1] = uVar11;
    if (CONCAT17(uStack000000000000008f,uStack0000000000000088) != 0) {
      in_stack_00000090 = CONCAT17(uStack000000000000008f,uStack0000000000000088);
      __ZdlPv();
    }
  }
  func_0x006d621c(unaff_x19 + 0x20,unaff_x19 + 0x1b,unaff_x19 + 0x25,unaff_x19[0x8f],
                  *(undefined1 *)(unaff_x19 + 0x90),unaff_x19[10],*(undefined8 *)(unaff_x28 + 0x90),
                  unaff_x19[0x8e]);
  lVar17 = *(long *)(unaff_x28 + 0x90);
  if (cRam0000000000a33610 == '\0') {
    if (*(long *)(lVar17 + 0x28) != 0) {
      uVar20 = 0;
      do {
        lVar17 = *(long *)(*(long *)(lVar17 + 0x20) + uVar20 * 8);
        if (lVar17 != 0 && *(int *)(lVar17 + 8) == iRam0000000000a27bd8) {
          func_0x006c0ef4();
          goto LAB_006cde28;
        }
        func_0x006bed0c();
        uVar20 = uVar20 + 1;
        lVar17 = *(long *)(unaff_x28 + 0x90);
      } while (uVar20 < *(ulong *)(lVar17 + 0x28));
    }
    uVar20 = func_0x006bf528();
    if ((uVar20 & 1) == 0) {
      if (in_stack_00000038._4_4_ != 0) {
        uVar20 = 0;
        do {
          func_0x006b1ccc(*unaff_x19,2,(int)uVar20 + iStack0000000000000040 & 0xff,0,0);
          uVar20 = uVar20 + 1;
        } while (in_stack_00000038._4_4_ != uVar20);
      }
      uVar20 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
      if ((uVar29 < uVar20) && (unaff_x19[0x13] != 0)) {
        bVar8 = false;
        bVar18 = 0xff;
LAB_006cdd1c:
        do {
          uVar24 = *(ulong *)(unaff_x19[0x94] + uVar29 * 8);
          if (uVar24 != unaff_x19[0x14]) {
            uVar25 = 0;
            uVar12 = uVar24 >> 4 ^ uVar24 >> 9;
            do {
              uVar12 = uVar12 & unaff_x19[0x12] - 1;
              puVar13 = (ulong *)(unaff_x19[0x11] + uVar12 * 0x18);
              if (*puVar13 == uVar24) goto LAB_006cdd6c;
              if (*puVar13 == unaff_x19[0x14]) break;
              uVar25 = uVar25 + 1;
              uVar12 = uVar25 + uVar12;
            } while (uVar25 <= unaff_x19[0x12] - 1);
          }
          puVar13 = (ulong *)0x0;
LAB_006cdd6c:
          puVar28 = (ulong *)0x0;
          if (puVar13 != (ulong *)0x0) {
            puVar28 = puVar13 + 1;
          }
          if (*(byte *)((long)puVar28 + 2) != 0) {
            bVar19 = (byte)*puVar28;
            if (bVar18 <= (byte)*puVar28) {
              bVar19 = bVar18;
            }
            uVar29 = uVar29 + 1;
            bVar8 = true;
            bVar18 = bVar19;
            if (uVar29 == uVar20) goto LAB_006cdff0;
            goto LAB_006cdd1c;
          }
          uVar29 = uVar29 + 1;
        } while (uVar29 != uVar20);
        bVar19 = bVar18;
        if (bVar8) {
LAB_006cdff0:
          func_0x006b1ccc(*unaff_x19,0xb,bVar19,0,0);
        }
      }
    }
  }
  else {
    if (*(long *)(lVar17 + 0x28) != 0) {
      uVar20 = 0;
      do {
        func_0x006bed0c();
        iVar9 = func_0x006bf528();
        if (iVar9 != 0) {
          lVar17 = unaff_x19[0xa1];
          unaff_x28 = in_stack_00000048;
          if (*(long *)(lVar17 + -0x18) != *(long *)(lVar17 + -0x10)) {
            lVar21 = *(long *)(*(long *)(lVar17 + -0x10) + -8);
            lVar14 = func_0x006b2784(*unaff_x19);
            if (lVar21 == lVar14 + -1) {
              func_0x006b2768(*unaff_x19,0x17);
              *(long *)(lVar17 + -0x10) = *(long *)(lVar17 + -0x10) + -8;
            }
          }
          goto LAB_006cde28;
        }
        uVar20 = uVar20 + 1;
        unaff_x28 = in_stack_00000048;
      } while (uVar20 < *(ulong *)(*(long *)(in_stack_00000048 + 0x90) + 0x28));
    }
    if (in_stack_00000038._4_4_ != 0) {
      uVar20 = 0;
      do {
        func_0x006b1ccc(*unaff_x19,2,(int)uVar20 + iStack0000000000000040 & 0xff,0,0);
        uVar20 = uVar20 + 1;
      } while (in_stack_00000038._4_4_ != uVar20);
    }
    uVar20 = (long)(unaff_x19[0x95] - unaff_x19[0x94]) >> 3;
    if ((uVar29 < uVar20) && (unaff_x19[0x13] != 0)) {
      bVar8 = false;
      bVar18 = 0xff;
LAB_006cdbcc:
      do {
        uVar24 = *(ulong *)(unaff_x19[0x94] + uVar29 * 8);
        if (uVar24 != unaff_x19[0x14]) {
          uVar25 = 0;
          uVar12 = uVar24 >> 4 ^ uVar24 >> 9;
          do {
            uVar12 = uVar12 & unaff_x19[0x12] - 1;
            puVar13 = (ulong *)(unaff_x19[0x11] + uVar12 * 0x18);
            if (*puVar13 == uVar24) goto LAB_006cdc1c;
            if (*puVar13 == unaff_x19[0x14]) break;
            uVar25 = uVar25 + 1;
            uVar12 = uVar25 + uVar12;
          } while (uVar25 <= unaff_x19[0x12] - 1);
        }
        puVar13 = (ulong *)0x0;
LAB_006cdc1c:
        puVar28 = (ulong *)0x0;
        if (puVar13 != (ulong *)0x0) {
          puVar28 = puVar13 + 1;
        }
        if (*(byte *)((long)puVar28 + 2) != 0) {
          bVar19 = (byte)*puVar28;
          if (bVar18 <= (byte)*puVar28) {
            bVar19 = bVar18;
          }
          uVar29 = uVar29 + 1;
          bVar8 = true;
          bVar18 = bVar19;
          if (uVar29 == uVar20) goto LAB_006cde00;
          goto LAB_006cdbcc;
        }
        uVar29 = uVar29 + 1;
      } while (uVar29 != uVar20);
      bVar19 = bVar18;
      if (bVar8) {
LAB_006cde00:
        func_0x006b1ccc(*unaff_x19,0xb,bVar19,0,0);
      }
    }
  }
LAB_006cde28:
  func_0x006bf744();
  uVar11 = func_0x006b2784(*unaff_x19);
  lVar17 = unaff_x19[0xa1];
  puVar27 = *(undefined8 **)(lVar17 + -0x18);
  puVar3 = *(undefined8 **)(lVar17 + -0x10);
  if (puVar27 != puVar3) {
    do {
      uVar29 = func_0x006b2794(*unaff_x19,*puVar27,uVar11);
      if ((uVar29 & 1) == 0) {
        func_0x006bc388(in_stack_00000050 + 0xc,
                        "Exceeded jump distance limit; simplify the code to compile");
        goto code_r0x006ce104;
      }
      puVar27 = puVar27 + 1;
    } while (puVar27 != puVar3);
    lVar17 = unaff_x19[0xa1];
    puVar27 = *(undefined8 **)(lVar17 + -0x18);
  }
  if (puVar27 != (undefined8 *)0x0) {
    *(undefined8 **)(lVar17 + -0x10) = puVar27;
    __ZdlPv(puVar27);
  }
  unaff_x19[0xa1] = lVar17 + -0x30;
  lVar17 = *(long *)(unaff_x28 + 0x60);
  if (lVar17 != 0) {
    lVar14 = 0;
    lVar21 = *(long *)(unaff_x28 + 0x58);
    lVar22 = unaff_x19[0x27];
    lVar23 = unaff_x19[0x1d];
    do {
      uVar29 = *(ulong *)(lVar21 + lVar14 * 8);
      if ((lVar22 != 0) && (uVar29 != unaff_x19[0x28])) {
        uVar20 = 0;
        uVar24 = uVar29 >> 4 ^ uVar29 >> 9;
        do {
          uVar24 = uVar24 & unaff_x19[0x26] - 1;
          uVar25 = *(ulong *)(unaff_x19[0x25] + uVar24 * 0x20);
          if (uVar25 == uVar29) {
            *(undefined4 *)(unaff_x19[0x25] + uVar24 * 0x20 + 8) = 0;
            break;
          }
          uVar20 = uVar20 + 1;
          uVar24 = uVar20 + uVar24;
        } while (uVar25 != unaff_x19[0x28] && uVar20 <= unaff_x19[0x26] - 1);
      }
      if ((lVar23 != 0) && (uVar29 != unaff_x19[0x1e])) {
        uVar20 = 0;
        uVar24 = uVar29 >> 4 ^ uVar29 >> 9;
        do {
          uVar24 = uVar24 & unaff_x19[0x1c] - 1;
          uVar25 = *(ulong *)(unaff_x19[0x1b] + uVar24 * 0x18);
          if (uVar25 == uVar29) {
            *(undefined8 *)(unaff_x19[0x1b] + uVar24 * 0x18 + 8) = 0;
            break;
          }
          uVar20 = uVar20 + 1;
          uVar24 = uVar20 + uVar24;
        } while (uVar25 != unaff_x19[0x1e] && uVar20 <= unaff_x19[0x1c] - 1);
      }
      lVar14 = lVar14 + 1;
    } while (lVar14 != lVar17);
  }
  func_0x006d621c(unaff_x19 + 0x20,unaff_x19 + 0x1b,unaff_x19 + 0x25,unaff_x19[0x8f],
                  *(undefined1 *)(unaff_x19 + 0x90),unaff_x19[10],*(undefined8 *)(unaff_x28 + 0x90),
                  unaff_x19[0x8e]);
  if (uStack0000000000000058 != (ulong *)0x0) {
    in_stack_00000060 = uStack0000000000000058;
    __ZdlPv();
  }
  *(undefined4 *)((long)unaff_x19 + 0x484) = uStack0000000000000044;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  ___stack_chk_fail();
  func_0x00017f90(&uStack0000000000000058);
code_r0x006ce104:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x6ce108);
  (*pcVar7)();
}

