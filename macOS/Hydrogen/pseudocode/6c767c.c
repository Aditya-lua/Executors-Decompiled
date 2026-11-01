
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006c767c(long param_1)

{
  uint uVar1;
  undefined4 uVar2;
  code *pcVar3;
  bool bVar4;
  undefined1 in_ZR;
  bool bVar5;
  bool bVar6;
  bool bVar7;
  undefined1 uVar8;
  int iVar9;
  uint uVar10;
  undefined8 uVar11;
  char *pcVar12;
  ulong in_x3;
  long lVar13;
  ulong uVar14;
  long in_x9;
  ulong uVar15;
  uint in_w10;
  int *in_x11;
  long in_x12;
  ulong uVar16;
  ulong uVar17;
  undefined8 *unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  uint unaff_w22;
  ulong uVar18;
  uint unaff_w23;
  undefined8 *puVar19;
  long lVar20;
  uint uVar21;
  uint uVar22;
  double dVar23;
  uint uStack0000000000000014;
  uint uStack0000000000000018;
  uint uStack000000000000001c;
  undefined8 uStack0000000000000040;
  double in_stack_00000048;
  ulong in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  uint in_stack_000000c0;
  
  while( true ) {
    if ((bool)in_ZR) {
      unaff_w20 = unaff_w20 + 1;
    }
    in_x12 = in_x12 + -1;
    if (in_x12 == 0) break;
    if (*in_x11 == 0) {
      unaff_w23 = unaff_w23 + 1;
    }
    else {
      in_w10 = in_w10 + 1;
    }
    in_ZR = *in_x11 == 1;
    in_x11 = in_x11 + 6;
  }
  if (unaff_w23 == 0 && in_w10 != 0) {
    iVar9 = 0;
    if (unaff_x19[0x22] != 0) {
      iVar9 = 0;
      lVar20 = 0;
      do {
        uVar18 = *(ulong *)(param_1 + lVar20 * 0x18 + 8);
        if (uVar18 != unaff_x19[0x23]) {
          uVar14 = 0;
          uVar15 = uVar18 >> 4 ^ uVar18 >> 9;
          do {
            uVar15 = uVar15 & unaff_x19[0x21] - 1;
            uVar16 = *(ulong *)(unaff_x19[0x20] + uVar15 * 0x20);
            if (uVar16 == uVar18) {
              lVar13 = unaff_x19[0x20] + uVar15 * 0x20;
              if (*(int *)(lVar13 + 8) == 3) {
                iVar9 = iVar9 + (uint)(*(double *)(lVar13 + 0x10) == (double)(iVar9 + 1));
              }
              break;
            }
            if (uVar16 == unaff_x19[0x23]) break;
            uVar14 = uVar14 + 1;
            uVar15 = uVar14 + uVar15;
          } while (uVar14 <= unaff_x19[0x21] - 1);
        }
        lVar20 = lVar20 + 1;
      } while (lVar20 != in_x9);
    }
    uVar10 = unaff_w20;
    if (in_w10 != iVar9 + unaff_w20) {
      iVar9 = 0;
      uVar10 = in_w10;
    }
  }
  else {
    iVar9 = 0;
    uVar10 = in_w10;
  }
  uVar1 = 0xffffffff;
  do {
    uVar21 = uVar1;
    uVar1 = uVar21 + 1;
  } while ((uint)(1 << (ulong)(uVar1 & 0x1f)) < uVar10);
  uVar1 = 0;
  if (uVar10 != 0) {
    uVar1 = uVar21 + 2;
  }
  uStack0000000000000018 = *(uint *)((long)unaff_x19 + 0x484);
  uVar21 = unaff_w22;
  if ((in_x3 & 1) == 0) {
    uVar21 = uStack0000000000000018 + 1;
    if (0xff < uVar21) {
      func_0x006bc388(unaff_x21 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
      goto code_r0x006c7d14;
    }
    *(uint *)((long)unaff_x19 + 0x484) = uVar21;
    uVar22 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar21) {
      uVar22 = uVar21;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar22;
    uVar21 = uStack0000000000000018;
  }
  uStack000000000000001c = unaff_w22;
  if (((unaff_w23 == 0 && iVar9 == 0) && (unaff_w20 - 1 < 0x20)) && (uVar10 == unaff_w20)) {
    uVar18 = 0;
    in_stack_000000c0 = 0;
    lVar20 = 8;
    do {
      lVar13 = *(long *)(*(long *)(unaff_x21 + 0x20) + lVar20);
      if (*(int *)(lVar13 + 8) != iRam0000000000a27a88) {
        lVar13 = 0;
      }
      iVar9 = func_0x006b1354(*unaff_x19,*(undefined8 *)(lVar13 + 0x20),
                              *(undefined8 *)(lVar13 + 0x28));
      if (iVar9 < 0) {
        func_0x006bc388(lVar13 + 0xc,"Exceeded constant limit; simplify the code to compile");
        goto code_r0x006c7d14;
      }
      uVar14 = (ulong)in_stack_000000c0;
      in_stack_000000c0 = in_stack_000000c0 + 1;
      *(int *)((long)&uStack0000000000000040 + uVar14 * 4) = iVar9;
      uVar18 = uVar18 + 1;
      lVar20 = lVar20 + 0x18;
    } while (uVar18 < *(ulong *)(unaff_x21 + 0x28));
    uVar10 = func_0x006b1458(*unaff_x19,&uStack0000000000000040);
    if ((int)uVar10 < 0) {
      func_0x006bc388(unaff_x21 + 0xc,"Exceeded constant limit; simplify the code to compile");
      goto code_r0x006c7d14;
    }
    func_0x006b3160(*unaff_x19,"allocation: table template %d");
    if (uVar10 >> 0xf == 0) {
      func_0x006b1f78(*unaff_x19,0x36,uVar21 & 0xff,(int)(short)uVar10);
    }
    else {
      func_0x006b1ccc(*unaff_x19,0x35,uVar21 & 0xff,uVar1 & 0xff,0);
      func_0x006b24c4(*unaff_x19,0);
    }
  }
  else {
    if ((param_1 == 0) || (*(int *)(param_1 + (in_x9 + -1) * 0x18) != 0)) {
      iVar9 = iVar9 + unaff_w23;
      if (uVar10 == 0) goto LAB_006c78f8;
LAB_006c78b0:
      uVar11 = *unaff_x19;
      if (iVar9 == 0) {
        pcVar12 = "allocation: table hash %d";
        goto LAB_006c7914;
      }
      func_0x006b3160(uVar11,"allocation: table hash %d array %d");
    }
    else {
      iVar9 = (iVar9 + unaff_w23) -
              (uint)(*(int *)(*(long *)(param_1 + (in_x9 + -1) * 0x18 + 0x10) + 8) ==
                    iRam0000000000a27ab8);
      if (uVar10 != 0) goto LAB_006c78b0;
LAB_006c78f8:
      uVar11 = *unaff_x19;
      pcVar12 = "allocation: table array %d";
LAB_006c7914:
      func_0x006b3160(uVar11,pcVar12);
    }
    func_0x006b1ccc(*unaff_x19,0x35,uVar21 & 0xff,uVar1 & 0xff,0);
    func_0x006b24c4(*unaff_x19,iVar9);
  }
  if (0xf < unaff_w23) {
    unaff_w23 = 0x10;
  }
  uVar1 = *(uint *)((long)unaff_x19 + 0x484);
  uVar10 = uVar1 + unaff_w23;
  if (uVar10 < 0x100) {
    *(uint *)((long)unaff_x19 + 0x484) = uVar10;
    uVar22 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar10) {
      uVar22 = uVar10;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar22;
    uVar11 = _UNK_008174a8;
    if (*(long *)(unaff_x21 + 0x28) != 0) {
      uVar18 = 0;
      uStack0000000000000014 = 0;
      uVar10 = 0;
      puVar19 = (undefined8 *)((ulong)&uStack0000000000000040 | 4);
      iVar9 = 1;
code_r0x006c79a8:
      do {
        lVar20 = *(long *)(unaff_x21 + 0x20) + uVar18 * 0x18;
        uVar14 = *(ulong *)(lVar20 + 8);
        if (0 < *(int *)((long)unaff_x19 + 0xc)) {
          func_0x006b2e98(*unaff_x19,*(int *)(*(long *)(lVar20 + 0x10) + 0xc) + 1);
        }
        if (1 < *(int *)((long)unaff_x19 + 0x14)) {
          func_0x006b1ccc(*unaff_x19,0x45,0,0,0);
        }
        if (uVar10 != 0) {
          uVar22 = uVar10;
          if (uVar14 != 0 || uVar10 == unaff_w23) {
            func_0x006b1ccc(*unaff_x19,0x37,uVar21 & 0xff,uVar1 & 0xff,uVar10 + 1 & 0xff);
            func_0x006b24c4(*unaff_x19,iVar9);
            iVar9 = uVar10 + iVar9;
            goto LAB_006c7a3c;
          }
LAB_006c7b8c:
          uVar18 = uVar18 + 1;
          if (uVar18 == *(ulong *)(unaff_x21 + 0x28)) {
            uStack0000000000000014 = func_0x006c9e64();
            uVar10 = uVar22 + 1;
            if (uVar18 < *(ulong *)(unaff_x21 + 0x28)) goto code_r0x006c79a8;
          }
          else {
            uVar2 = *(undefined4 *)((long)unaff_x19 + 0x484);
            *(uint *)((long)unaff_x19 + 0x484) = (uVar22 + uVar1 & 0xff) + 1;
            func_0x006c6028();
            *(undefined4 *)((long)unaff_x19 + 0x484) = uVar2;
            uVar10 = uVar22 + 1;
            if (uVar18 < *(ulong *)(unaff_x21 + 0x28)) goto code_r0x006c79a8;
          }
          if (uVar22 != 0xffffffff) {
            uVar10 = 0;
            if ((uStack0000000000000014 & 1) == 0) {
              uVar10 = uVar22 + 2;
            }
            func_0x006b1ccc(*unaff_x19,0x37,uVar21 & 0xff,uVar1 & 0xff,uVar10 & 0xff);
            func_0x006b24c4(*unaff_x19,iVar9);
          }
          break;
        }
LAB_006c7a3c:
        if (uVar14 == 0) {
          uVar22 = 0;
          goto LAB_006c7b8c;
        }
        uVar2 = *(undefined4 *)((long)unaff_x19 + 0x484);
        uVar8 = (undefined1)uVar21;
        if ((unaff_x19[0x22] != 0) && (unaff_x19[0x23] != uVar14)) {
          uVar15 = 0;
          uVar16 = uVar14 >> 4 ^ uVar14 >> 9;
          do {
            uVar16 = uVar16 & unaff_x19[0x21] - 1;
            uVar17 = *(ulong *)(unaff_x19[0x20] + uVar16 * 0x20);
            if (uVar17 == uVar14) {
              lVar20 = unaff_x19[0x20] + uVar16 * 0x20;
              dVar23 = *(double *)(lVar20 + 0x10);
              bVar4 = true;
              bVar7 = false;
              if (*(int *)(lVar20 + 8) == 3) {
                bVar4 = false;
                bVar7 = true;
                if (!NAN(dVar23)) {
                  bVar4 = dVar23 < 1.0;
                  bVar7 = false;
                }
              }
              bVar5 = false;
              bVar6 = true;
              if (bVar4 == bVar7) {
                bVar5 = false;
                bVar6 = true;
                if (!NAN(dVar23)) {
                  bVar5 = dVar23 == 256.0;
                  bVar6 = 256.0 <= dVar23;
                }
              }
              if (!bVar6 || bVar5) {
                if (dVar23 == (double)(int)dVar23) {
                  *puVar19 = 0;
                  puVar19[1] = 0;
                  *(undefined4 *)(puVar19 + 2) = 0;
                  uStack0000000000000040._0_5_ = CONCAT14(uVar8,4);
                  uStack0000000000000040 =
                       CONCAT17((char)(int)dVar23 + -1,(undefined7)uStack0000000000000040);
                  goto code_r0x006c7ac8;
                }
              }
              else if (*(int *)(lVar20 + 8) == 5) {
                in_stack_00000050 = (ulong)*(uint *)(lVar20 + 0xc);
                uStack0000000000000040._5_3_ = (undefined3)((ulong)uVar11 >> 0x28);
                uStack0000000000000040._0_5_ = CONCAT14(uVar8,(int)uVar11);
                in_stack_00000048 = dVar23;
                goto code_r0x006c7ac8;
              }
              break;
            }
            uVar15 = uVar15 + 1;
            uVar16 = uVar15 + uVar16;
          } while (uVar17 != unaff_x19[0x23] && uVar15 <= unaff_x19[0x21] - 1);
        }
        puVar19[1] = 0;
        *puVar19 = 0;
        puVar19[3] = 0;
        puVar19[2] = 0;
        *(undefined4 *)(puVar19 + 4) = 0;
        uStack0000000000000040._0_5_ = CONCAT14(uVar8,5);
        uVar8 = func_0x006c5ed4();
        uStack0000000000000040._0_7_ = CONCAT16(uVar8,(undefined6)uStack0000000000000040);
code_r0x006c7ac8:
        in_stack_00000060 = *(undefined8 *)(uVar14 + 0x14);
        in_stack_00000058 = *(undefined8 *)(uVar14 + 0xc);
        func_0x006c5ed4();
        func_0x006ca134();
        uVar10 = 0;
        *(undefined4 *)((long)unaff_x19 + 0x484) = uVar2;
        uVar18 = uVar18 + 1;
      } while (uVar18 < *(ulong *)(unaff_x21 + 0x28));
    }
    if (uStack000000000000001c != (uVar21 & 0xff)) {
      func_0x006b1ccc(*unaff_x19,6,uStack000000000000001c,uVar21 & 0xff,0);
    }
    *(uint *)((long)unaff_x19 + 0x484) = uStack0000000000000018;
    return;
  }
  func_0x006bc388(unaff_x21 + 0xc,
                  "Out of registers when trying to allocate %d registers: exceeded limit %d");
code_r0x006c7d14:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x6c7d18);
  (*pcVar3)();
}

