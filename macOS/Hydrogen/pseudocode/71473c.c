
/* WARNING: Possible PIC construction at 0x00714c5c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00714c60) */
/* WARNING: Removing unreachable block (ram,0x00714c80) */
/* WARNING: Removing unreachable block (ram,0x00714c84) */
/* WARNING: Removing unreachable block (ram,0x00714c88) */
/* WARNING: Removing unreachable block (ram,0x00714c8c) */
/* WARNING: Removing unreachable block (ram,0x00714c90) */
/* WARNING: Removing unreachable block (ram,0x00714cbc) */

ulong FUN_0071473c(void)

{
  uint uVar1;
  undefined1 *puVar2;
  int iVar3;
  undefined1 *puVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined8 *puVar16;
  ulong uVar17;
  long unaff_x19;
  long unaff_x20;
  int *piVar18;
  char *unaff_x21;
  undefined8 uVar19;
  undefined8 unaff_x22;
  undefined **unaff_x23;
  undefined8 uVar20;
  undefined **unaff_x24;
  long lVar21;
  undefined **unaff_x25;
  undefined **unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  puVar22 = (undefined *)0x714754;
  auVar29 = __Unwind_Resume();
  puVar4 = (undefined1 *)register0x00000008;
  do {
    lVar11 = auVar29._0_8_;
    *(undefined8 *)(puVar4 + -0x60) = unaff_x28;
    *(long *)(puVar4 + -0x58) = unaff_x27;
    *(undefined ***)(puVar4 + -0x50) = unaff_x26;
    *(undefined ***)(puVar4 + -0x48) = unaff_x25;
    *(undefined ***)(puVar4 + -0x40) = unaff_x24;
    *(undefined ***)(puVar4 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar4 + -0x30) = unaff_x22;
    *(char **)(puVar4 + -0x28) = unaff_x21;
    *(long *)(puVar4 + -0x20) = unaff_x20;
    *(long *)(puVar4 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar4 + -0x10) = unaff_x29;
    *(undefined **)(puVar4 + -8) = puVar22;
    *(long *)(puVar4 + -0xa0) = lVar11 + 0x60;
    piVar18 = (int *)(lVar11 + 0x84);
    uVar20 = *(undefined8 *)piVar18;
    uVar5 = func_0x00721730();
    *(undefined4 *)(puVar4 + -0xac) = *(undefined4 *)(lVar11 + 0x114);
    *(long *)(puVar4 + -0xa8) = lVar11 + 0x418;
    puVar10 = (undefined8 *)(puVar4 + -0x90);
    unaff_x22 = 0xa33000;
    do {
      iVar3 = *(int *)(lVar11 + 0x80);
      if (iVar3 < 0x5b) {
        if (iVar3 == 0x28) {
          if (((auVar29._8_8_ & 1) == 0) && (*(int *)(uVar5 + 0x14) != *piVar18)) {
            func_0x00721ce8(lVar11);
            goto code_r0x00714af4;
          }
          goto code_r0x007147b4;
        }
        if (iVar3 != 0x2e) {
          if (iVar3 == 0x3a) {
            uVar5 = func_0x00721a60(lVar11,uVar20,uVar5);
          }
          else {
code_r0x00714838:
            if (((iVar3 != 0x3c) || (cRam0000000000a337b8 == '\0')) ||
               (func_0x0070c3d0(puVar4 + -0x98,*(undefined8 *)(puVar4 + -0xa0)),
               *(int *)(puVar4 + -0x98) != 0x3c)) {
code_r0x00714af4:
              *(undefined4 *)(lVar11 + 0x114) = *(undefined4 *)(puVar4 + -0xac);
              return uVar5;
            }
            uVar5 = func_0x00722484(lVar11,uVar20,uVar5);
          }
          goto code_r0x007147c4;
        }
        *(undefined8 *)(puVar4 + -0x78) = *(undefined8 *)(lVar11 + 0x84);
        func_0x00710d48(lVar11);
        if (*(int *)(lVar11 + 0x80) == 0x119) {
          unaff_x24 = *(undefined ***)(lVar11 + 0x98);
          uVar12 = *(undefined8 *)piVar18;
          *(undefined8 *)(puVar4 + -0x68) = *(undefined8 *)(lVar11 + 0x8c);
          *(undefined8 *)(puVar4 + -0x70) = uVar12;
          func_0x00710d48(lVar11);
          *(undefined ***)(puVar4 + -0x98) = unaff_x24;
          *(undefined8 *)(puVar4 + -0x88) = *(undefined8 *)(puVar4 + -0x68);
          *puVar10 = *(undefined8 *)(puVar4 + -0x70);
        }
        else {
          func_0x0072415c(lVar11,0);
          if ((*(int *)(lVar11 + 0x80) - 0x123U < 0x15) && (*piVar18 == *(int *)(puVar4 + -0x78))) {
            *(undefined8 *)(puVar4 + -0x98) = *(undefined8 *)(lVar11 + 0x98);
            uVar12 = *(undefined8 *)piVar18;
            *(undefined8 *)(puVar4 + -0x88) = *(undefined8 *)(lVar11 + 0x8c);
            *puVar10 = uVar12;
            func_0x00710d48(lVar11);
          }
          else {
            uVar12 = *(undefined8 *)(lVar11 + 0x84);
            *(undefined8 *)(puVar4 + -0x98) = *(undefined8 *)(lVar11 + 0x128);
            *(undefined8 *)(puVar4 + -0x90) = uVar12;
            *(undefined8 *)(puVar4 + -0x88) = uVar12;
          }
        }
        uVar12 = *(undefined8 *)(lVar11 + 0xd8);
        *(undefined8 *)(puVar4 + -0x70) = uVar20;
        *(undefined8 *)(puVar4 + -0x68) = *(undefined8 *)(puVar4 + -0x88);
        uVar7 = func_0x00704c24(uVar12,0x50);
        func_0x00706238(uVar7,puVar4 + -0x70,uVar5,puVar4 + -0x98,puVar10,puVar4 + -0x78,0x2e);
        uVar5 = uVar7;
      }
      else {
        if (1 < iVar3 - 0x116U) {
          if (iVar3 == 0x5b) {
            *(undefined4 *)(puVar4 + -0x70) = 0x5b;
            *(undefined8 *)(puVar4 + -0x6c) = *(undefined8 *)(lVar11 + 0x84);
            func_0x00710d48(lVar11);
            unaff_x24 = (undefined **)func_0x007168a8(lVar11,0);
            unaff_x28 = *(undefined8 *)(lVar11 + 0x84);
            uVar12 = *(undefined8 *)(lVar11 + 0x8c);
            if (*(int *)(lVar11 + 0x80) == 0x5d) {
              func_0x00710d48(lVar11);
            }
            else {
              func_0x00721808(lVar11,0x5d,puVar4 + -0x70,0);
              func_0x007244d4(lVar11,0x5d);
            }
            uVar19 = *(undefined8 *)(lVar11 + 0xd8);
            *(undefined8 *)(puVar4 + -0x98) = uVar20;
            *(undefined8 *)(puVar4 + -0x90) = uVar12;
            uVar7 = func_0x00704c24(uVar19,0x30);
            func_0x007062dc(uVar7,puVar4 + -0x98,uVar5,unaff_x24);
            uVar5 = uVar7;
            if (*(char *)(lVar11 + 0x58) != '\0') {
              uVar12 = func_0x00704c24(*(undefined8 *)(lVar11 + 0xd8),0x14);
              func_0x00709464(uVar12,*(undefined8 *)(puVar4 + -0x6c),unaff_x28);
              lVar15 = *(long *)(lVar11 + 0x420);
              unaff_x24 = (undefined **)(uVar7 >> 4);
              if ((ulong)(lVar15 * 3) >> 2 <= *(ulong *)(lVar11 + 0x428)) {
                if ((*(ulong *)(lVar11 + 0x428) != 0) && (uVar7 != *(ulong *)(lVar11 + 0x430))) {
                  uVar8 = 0;
                  uVar9 = (ulong)unaff_x24 ^ uVar7 >> 9;
                  do {
                    uVar9 = uVar9 & lVar15 - 1U;
                    uVar17 = *(ulong *)(**(long **)(puVar4 + -0xa8) + uVar9 * 0x10);
                    if (uVar17 == uVar7) goto code_r0x00714a80;
                    uVar8 = uVar8 + 1;
                    uVar9 = uVar8 + uVar9;
                  } while (uVar17 != *(ulong *)(lVar11 + 0x430) && uVar8 <= lVar15 - 1U);
                }
                func_0x006db93c(*(undefined8 *)(puVar4 + -0xa8));
                lVar15 = *(long *)(lVar11 + 0x420);
              }
code_r0x00714a80:
              lVar21 = *(long *)(lVar11 + 0x418);
              uVar8 = ((ulong)unaff_x24 ^ uVar7 >> 9) & lVar15 - 1U;
              uVar9 = *(ulong *)(lVar21 + uVar8 * 0x10);
              if (uVar9 != *(ulong *)(lVar11 + 0x430)) {
                lVar13 = 1;
                do {
                  if (uVar9 == uVar7) goto code_r0x00714ae0;
                  uVar8 = uVar8 + lVar13 & lVar15 - 1U;
                  uVar9 = *(ulong *)(lVar21 + uVar8 * 0x10);
                  lVar13 = lVar13 + 1;
                } while (uVar9 != *(ulong *)(lVar11 + 0x430));
              }
              *(ulong *)(lVar21 + uVar8 * 0x10) = uVar7;
              *(long *)(lVar11 + 0x428) = *(long *)(lVar11 + 0x428) + 1;
code_r0x00714ae0:
              *(undefined8 *)(lVar21 + uVar8 * 0x10 + 8) = uVar12;
            }
            goto code_r0x007147c8;
          }
          if (iVar3 != 0x7b) goto code_r0x00714838;
        }
code_r0x007147b4:
        uVar5 = func_0x00721cf8(lVar11,uVar5,0);
code_r0x007147c4:
      }
code_r0x007147c8:
      uVar1 = *(int *)(lVar11 + 0x114) + 1;
      *(uint *)(lVar11 + 0x114) = uVar1;
    } while (uVar1 <= uRam0000000000a33728);
    *(char **)(puVar4 + -0xc0) = "expression";
    auVar30 = func_0x0070f408(piVar18,
                              "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                             );
    lVar15 = auVar30._8_8_;
    unaff_x19 = auVar30._0_8_;
    *(undefined8 *)(puVar4 + -0x120) = unaff_x28;
    *(ulong *)(puVar4 + -0x118) = uVar5;
    *(ulong *)(puVar4 + -0x110) = uVar5;
    *(undefined8 **)(puVar4 + -0x108) = puVar10;
    *(undefined ***)(puVar4 + -0x100) = unaff_x24;
    *(undefined8 *)(puVar4 + -0xf8) = uVar20;
    *(undefined8 *)(puVar4 + -0xf0) = 0xa33000;
    *(ulong *)(puVar4 + -0xe8) = auVar29._8_8_;
    *(int **)(puVar4 + -0xe0) = piVar18;
    *(long *)(puVar4 + -0xd8) = lVar11;
    *(undefined1 **)(puVar4 + -0xd0) = puVar4 + -0x10;
    *(undefined **)(puVar4 + -200) = &DAT_00714b3c;
    unaff_x29 = puVar4 + -0xd0;
    *(long *)(puVar4 + -0x130) = lVar15;
    iVar3 = *(int *)(lVar15 + 8);
    unaff_x23 = &PTR_s_pixelFormat_00a27000;
    unaff_x24 = &PTR_s_pixelFormat_00a27000;
    unaff_x25 = &PTR_s_pixelFormat_00a27000;
    unaff_x26 = &PTR_s_pixelFormat_00a27000;
    if (((iRam0000000000a27a98 != iVar3 && iRam0000000000a27aa8 != iVar3) &&
        iRam0000000000a27ae8 != iVar3) && iRam0000000000a27ad8 != iVar3) {
      plVar6 = (long *)func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),8);
      *plVar6 = lVar15;
      *(long **)(puVar4 + -0x148) = plVar6;
      *(undefined8 *)(puVar4 + -0x140) = 1;
      uVar20 = func_0x0071b400(unaff_x19,lVar15 + 0xc,puVar4 + -0x148,
                               "Assigned expression must be a variable or a field");
      *(undefined8 *)(puVar4 + -0x130) = uVar20;
    }
    lVar11 = *(long *)(unaff_x19 + 0x240);
    lVar15 = *(long *)(unaff_x19 + 0x238);
    *(long *)(puVar4 + -0x148) = unaff_x19 + 0x238;
    *(long *)(puVar4 + -0x140) = lVar11 - lVar15 >> 3;
    *(undefined8 *)(puVar4 + -0x138) = 0;
    unaff_x27 = unaff_x19 + 0x3d0;
    lVar11 = *(long *)(unaff_x19 + 0x3d8);
    lVar15 = *(long *)(unaff_x19 + 0x3d0);
    *(long *)(puVar4 + -0x160) = unaff_x27;
    *(long *)(puVar4 + -0x158) = lVar11 - lVar15 >> 3;
    *(undefined8 *)(puVar4 + -0x150) = 0;
    func_0x00711dac(puVar4 + -0x148,puVar4 + -0x130);
    if (*(int *)(unaff_x19 + 0x80) != 0x2c) break;
    unaff_x20 = unaff_x19 + 0x84;
    unaff_x28 = 1;
    unaff_x21 = "Assigned expression must be a variable or a field";
    if (*(char *)(unaff_x19 + 0x58) != '\0') {
      func_0x00711dac(puVar4 + -0x160,unaff_x20);
    }
    func_0x00710d48(unaff_x19);
    auVar29._8_8_ = 1;
    auVar29._0_8_ = unaff_x19;
    puVar22 = &UNK_00714c60;
    puVar4 = puVar4 + -0x1c0;
  } while( true );
  uVar20 = *(undefined8 *)(unaff_x19 + 0x84);
  if (*(int *)(unaff_x19 + 0x80) == 0x3d) {
    func_0x00710d48(unaff_x19);
  }
  else {
    func_0x0072447c(unaff_x19,0x3d,"assignment");
  }
  lVar11 = *(long *)(unaff_x19 + 600);
  lVar15 = *(long *)(unaff_x19 + 0x250);
  *(long *)(puVar4 + -0x178) = unaff_x19 + 0x250;
  *(long *)(puVar4 + -0x170) = lVar11 - lVar15 >> 3;
  *(undefined8 *)(puVar4 + -0x168) = 0;
  lVar11 = *(long *)(unaff_x19 + 0x3d8);
  lVar15 = *(long *)(unaff_x19 + 0x3d0);
  *(long *)(puVar4 + -400) = unaff_x27;
  *(long *)(puVar4 + -0x188) = lVar11 - lVar15 >> 3;
  *(undefined8 *)(puVar4 + -0x180) = 0;
  puVar2 = (undefined1 *)0x0;
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    puVar2 = puVar4 + -400;
  }
  func_0x00717804(unaff_x19,puVar4 + -0x178,puVar2);
  uVar19 = *(undefined8 *)(unaff_x19 + 0xd8);
  uVar12 = *(undefined8 *)(*(long *)(*(long *)(*(long *)(puVar4 + -0x178) + 8) + -8) + 0x14);
  *(undefined8 *)(puVar4 + -0x1a0) = *(undefined8 *)(*(long *)(puVar4 + -0x130) + 0xc);
  *(undefined8 *)(puVar4 + -0x198) = uVar12;
  uVar5 = *(ulong *)(puVar4 + -0x138);
  if (uVar5 == 0) {
    lVar11 = 0;
  }
  else {
    lVar15 = *(long *)(puVar4 + -0x140);
    lVar21 = **(long **)(puVar4 + -0x148);
    lVar11 = func_0x00704c24(uVar19,uVar5 << 3);
    if ((uVar5 < 8) || ((ulong)((lVar11 + lVar15 * -8) - lVar21) < 0x40)) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar5 & 0xfffffffffffffff8;
      puVar10 = (undefined8 *)(lVar11 + 0x20);
      puVar16 = (undefined8 *)(lVar15 * 8 + lVar21 + 0x20);
      uVar8 = uVar7;
      do {
        uVar12 = puVar16[-4];
        uVar24 = puVar16[-1];
        uVar23 = puVar16[-2];
        uVar26 = puVar16[1];
        uVar25 = *puVar16;
        uVar28 = puVar16[3];
        uVar27 = puVar16[2];
        puVar10[-3] = puVar16[-3];
        puVar10[-4] = uVar12;
        puVar10[-1] = uVar24;
        puVar10[-2] = uVar23;
        puVar10[1] = uVar26;
        *puVar10 = uVar25;
        puVar10[3] = uVar28;
        puVar10[2] = uVar27;
        uVar8 = uVar8 - 8;
        puVar10 = puVar10 + 8;
        puVar16 = puVar16 + 8;
      } while (uVar8 != 0);
      if (uVar5 == uVar7) goto code_r0x00714dd8;
    }
    lVar13 = uVar5 - uVar7;
    puVar10 = (undefined8 *)(lVar21 + uVar7 * 8 + lVar15 * 8);
    puVar16 = (undefined8 *)(lVar11 + uVar7 * 8);
    do {
      *puVar16 = *puVar10;
      lVar13 = lVar13 + -1;
      puVar10 = puVar10 + 1;
      puVar16 = puVar16 + 1;
    } while (lVar13 != 0);
  }
code_r0x00714dd8:
  *(long *)(puVar4 + -0x1b0) = lVar11;
  *(ulong *)(puVar4 + -0x1a8) = uVar5;
  uVar5 = *(ulong *)(puVar4 + -0x168);
  if (uVar5 == 0) {
    lVar11 = 0;
  }
  else {
    lVar15 = *(long *)(puVar4 + -0x170);
    lVar21 = **(long **)(puVar4 + -0x178);
    lVar11 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),uVar5 << 3);
    if ((uVar5 < 8) || (lVar13 = lVar15 * 8 + lVar21, (ulong)(lVar11 - lVar13) < 0x40)) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar5 & 0xfffffffffffffff8;
      puVar10 = (undefined8 *)(lVar11 + 0x20);
      puVar16 = (undefined8 *)(lVar13 + 0x20);
      uVar8 = uVar7;
      do {
        uVar12 = puVar16[-4];
        uVar24 = puVar16[-1];
        uVar23 = puVar16[-2];
        uVar26 = puVar16[1];
        uVar25 = *puVar16;
        uVar28 = puVar16[3];
        uVar27 = puVar16[2];
        puVar10[-3] = puVar16[-3];
        puVar10[-4] = uVar12;
        puVar10[-1] = uVar24;
        puVar10[-2] = uVar23;
        puVar10[1] = uVar26;
        *puVar10 = uVar25;
        puVar10[3] = uVar28;
        puVar10[2] = uVar27;
        uVar8 = uVar8 - 8;
        puVar10 = puVar10 + 8;
        puVar16 = puVar16 + 8;
      } while (uVar8 != 0);
      if (uVar5 == uVar7) goto code_r0x00714e44;
    }
    lVar13 = uVar5 - uVar7;
    puVar10 = (undefined8 *)(lVar21 + uVar7 * 8 + lVar15 * 8);
    puVar16 = (undefined8 *)(lVar11 + uVar7 * 8);
    do {
      *puVar16 = *puVar10;
      lVar13 = lVar13 + -1;
      puVar10 = puVar10 + 1;
      puVar16 = puVar16 + 1;
    } while (lVar13 != 0);
  }
code_r0x00714e44:
  *(long *)(puVar4 + -0x1c0) = lVar11;
  *(ulong *)(puVar4 + -0x1b8) = uVar5;
  uVar5 = func_0x00704c24(uVar19,0x40);
  func_0x007074bc(uVar5,puVar4 + -0x1a0,puVar4 + -0x1b0,puVar4 + -0x1c0);
  uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
  uVar7 = *(ulong *)(puVar4 + -0x150);
  if (uVar7 == 0) {
    lVar11 = 0;
  }
  else {
    lVar15 = *(long *)(puVar4 + -0x158);
    lVar21 = **(long **)(puVar4 + -0x160);
    lVar11 = func_0x00704c24(uVar12,uVar7 << 3);
    if ((uVar7 < 8) || ((ulong)((lVar11 + lVar15 * -8) - lVar21) < 0x40)) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar7 & 0xfffffffffffffff8;
      puVar10 = (undefined8 *)(lVar11 + 0x20);
      puVar16 = (undefined8 *)(lVar15 * 8 + lVar21 + 0x20);
      uVar9 = uVar8;
      do {
        uVar19 = puVar16[-4];
        uVar24 = puVar16[-1];
        uVar23 = puVar16[-2];
        uVar26 = puVar16[1];
        uVar25 = *puVar16;
        uVar28 = puVar16[3];
        uVar27 = puVar16[2];
        puVar10[-3] = puVar16[-3];
        puVar10[-4] = uVar19;
        puVar10[-1] = uVar24;
        puVar10[-2] = uVar23;
        puVar10[1] = uVar26;
        *puVar10 = uVar25;
        puVar10[3] = uVar28;
        puVar10[2] = uVar27;
        uVar9 = uVar9 - 8;
        puVar10 = puVar10 + 8;
        puVar16 = puVar16 + 8;
      } while (uVar9 != 0);
      if (uVar7 == uVar8) goto code_r0x00714ed8;
    }
    lVar13 = uVar7 - uVar8;
    puVar10 = (undefined8 *)(lVar21 + uVar8 * 8 + lVar15 * 8);
    puVar16 = (undefined8 *)(lVar11 + uVar8 * 8);
    do {
      *puVar16 = *puVar10;
      lVar13 = lVar13 + -1;
      puVar10 = puVar10 + 1;
      puVar16 = puVar16 + 1;
    } while (lVar13 != 0);
  }
code_r0x00714ed8:
  uVar8 = *(ulong *)(puVar4 + -0x180);
  if (uVar8 == 0) {
    lVar15 = 0;
  }
  else {
    lVar21 = *(long *)(puVar4 + -0x188);
    lVar13 = **(long **)(puVar4 + -400);
    lVar15 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),uVar8 << 3);
    if ((uVar8 < 8) || (lVar14 = lVar21 * 8 + lVar13, (ulong)(lVar15 - lVar14) < 0x40)) {
      uVar9 = 0;
    }
    else {
      uVar9 = uVar8 & 0xfffffffffffffff8;
      puVar10 = (undefined8 *)(lVar15 + 0x20);
      puVar16 = (undefined8 *)(lVar14 + 0x20);
      uVar17 = uVar9;
      do {
        uVar19 = puVar16[-4];
        uVar24 = puVar16[-1];
        uVar23 = puVar16[-2];
        uVar26 = puVar16[1];
        uVar25 = *puVar16;
        uVar28 = puVar16[3];
        uVar27 = puVar16[2];
        puVar10[-3] = puVar16[-3];
        puVar10[-4] = uVar19;
        puVar10[-1] = uVar24;
        puVar10[-2] = uVar23;
        puVar10[1] = uVar26;
        *puVar10 = uVar25;
        puVar10[3] = uVar28;
        puVar10[2] = uVar27;
        uVar17 = uVar17 - 8;
        puVar10 = puVar10 + 8;
        puVar16 = puVar16 + 8;
      } while (uVar17 != 0);
      if (uVar8 == uVar9) goto code_r0x00714f44;
    }
    lVar14 = uVar8 - uVar9;
    puVar10 = (undefined8 *)(lVar13 + uVar9 * 8 + lVar21 * 8);
    puVar16 = (undefined8 *)(lVar15 + uVar9 * 8);
    do {
      *puVar16 = *puVar10;
      lVar14 = lVar14 + -1;
      puVar10 = puVar10 + 1;
      puVar16 = puVar16 + 1;
    } while (lVar14 != 0);
  }
code_r0x00714f44:
  uVar12 = func_0x00704c24(uVar12,0x30);
  func_0x007095f4(uVar12,lVar11,uVar7,uVar20,lVar15,uVar8);
  lVar11 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar11 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar5 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar7 = 0;
      uVar8 = uVar5 >> 4 ^ uVar5 >> 9;
      do {
        uVar8 = uVar8 & lVar11 - 1U;
        uVar9 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar8 * 0x10);
        if (uVar9 == uVar5) goto code_r0x00714fd8;
        uVar7 = uVar7 + 1;
        uVar8 = uVar7 + uVar8;
      } while (uVar9 != *(ulong *)(unaff_x19 + 0x430) && uVar7 <= lVar11 - 1U);
    }
    func_0x006db93c();
    lVar11 = *(long *)(unaff_x19 + 0x420);
  }
code_r0x00714fd8:
  lVar15 = *(long *)(unaff_x19 + 0x418);
  uVar7 = (uVar5 >> 4 ^ uVar5 >> 9) & lVar11 - 1U;
  uVar8 = *(ulong *)(lVar15 + uVar7 * 0x10);
  if (uVar8 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar21 = 1;
    do {
      if (uVar8 == uVar5) goto code_r0x00715038;
      uVar7 = uVar7 + lVar21 & lVar11 - 1U;
      uVar8 = *(ulong *)(lVar15 + uVar7 * 0x10);
      lVar21 = lVar21 + 1;
    } while (uVar8 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar15 + uVar7 * 0x10) = uVar5;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00715038:
  *(undefined8 *)(lVar15 + uVar7 * 0x10 + 8) = uVar12;
  plVar6 = *(long **)(puVar4 + -400);
  if (*plVar6 + *(long *)(puVar4 + -0x188) * 8 != plVar6[1]) {
    plVar6[1] = *plVar6 + *(long *)(puVar4 + -0x188) * 8;
  }
  plVar6 = *(long **)(puVar4 + -0x178);
  if (*plVar6 + *(long *)(puVar4 + -0x170) * 8 != plVar6[1]) {
    plVar6[1] = *plVar6 + *(long *)(puVar4 + -0x170) * 8;
  }
  plVar6 = *(long **)(puVar4 + -0x160);
  if (*plVar6 + *(long *)(puVar4 + -0x158) * 8 != plVar6[1]) {
    plVar6[1] = *plVar6 + *(long *)(puVar4 + -0x158) * 8;
  }
  plVar6 = *(long **)(puVar4 + -0x148);
  if (*plVar6 + *(long *)(puVar4 + -0x140) * 8 != plVar6[1]) {
    plVar6[1] = *plVar6 + *(long *)(puVar4 + -0x140) * 8;
  }
  return uVar5;
}

