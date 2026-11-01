
void FUN_005025b8(void)

{
  ulong uVar1;
  undefined1 uVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  bool bVar7;
  int iVar8;
  long lVar9;
  uint uVar10;
  undefined1 *puVar11;
  undefined8 uVar12;
  long lVar13;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  long *plVar17;
  undefined8 *puVar18;
  int *piVar19;
  undefined8 *puVar20;
  long lVar21;
  undefined8 unaff_x20;
  ulong uVar22;
  ulong unaff_x21;
  ulong uVar23;
  long lVar24;
  long lVar25;
  long unaff_x23;
  undefined8 *puVar26;
  long unaff_x24;
  long lVar27;
  long lVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  int iStack0000000000000010;
  int iStack0000000000000014;
  long in_stack_00000018;
  long in_stack_00000020;
  uint *in_stack_00000028;
  long in_stack_00000078;
  undefined8 *in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000220;
  long in_stack_00000230;
  undefined8 in_stack_00000df0;
  undefined8 in_stack_00000df8;
  undefined8 in_stack_00000e00;
  uint6 in_stack_0000114a;
  undefined1 auStack_7ffffffe [2147483646];
  
  do {
    _memcpy(unaff_x24,unaff_x20,unaff_x21);
    uVar12 = 0;
    uVar22 = *(ulong *)(unaff_x23 + 0x1e0);
    uVar23 = uVar22 * 0x20;
    if ((uVar22 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar23)) {
LAB_00503660:
      func_0x007a1f00(uVar12,uVar23,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar23 != 0) {
      puVar26 = *(undefined8 **)(unaff_x23 + 0x1d8);
      lVar9 = func_0x00187bd0(uVar23,8);
      uVar12 = 8;
      if (lVar9 == 0) goto LAB_00503660;
      if (uVar22 != 0) {
        puVar20 = (undefined8 *)(lVar9 + 0x10);
        do {
          if (uVar23 == 0) break;
          plVar17 = (long *)*puVar26;
          lVar9 = *plVar17;
          *plVar17 = lVar9 + 1;
          if (lVar9 < 0) goto LAB_005037ac;
          uVar12 = puVar26[1];
          uVar30 = puVar26[3];
          uVar29 = puVar26[2];
          puVar26 = puVar26 + 4;
          puVar20[-2] = plVar17;
          puVar20[-1] = uVar12;
          puVar20[1] = uVar30;
          *puVar20 = uVar29;
          uVar23 = uVar23 - 0x20;
          uVar22 = uVar22 - 1;
          puVar20 = puVar20 + 4;
        } while (uVar22 != 0);
      }
    }
    in_stack_00000080[2] = in_stack_00000e00;
    in_stack_00000080[1] = in_stack_00000df8;
    *in_stack_00000080 = in_stack_00000df0;
    lVar9 = *(long *)(in_stack_00000088 + 0x90);
    if (lVar9 == *(long *)(in_stack_00000088 + 0x80)) {
      func_0x0050c440(in_stack_00000088 + 0x80,&UNK_009e93a0);
    }
    _memcpy(*(long *)(in_stack_00000088 + 0x88) + lVar9 * 600,auStack_7ffffffe + 0x800013be,600);
    *(long *)(in_stack_00000088 + 0x90) = lVar9 + 1;
    lVar9 = in_stack_00000088;
code_r0x00501554:
    do {
      while( true ) {
        unaff_x23 = in_stack_00000220;
        lVar28 = lVar9;
        if (unaff_x23 != in_stack_00000078) break;
        do {
          lVar9 = lVar28 + 0x2c8;
          if (lVar9 == in_stack_00000020) {
            uVar10 = *(uint *)(in_stack_00000230 + 700);
            uVar3 = *(uint *)(in_stack_00000230 + 0x2c0);
            lVar9 = *(long *)(in_stack_00000230 + 0x90);
            if (lVar9 == 0) goto code_r0x00502aec;
            lVar24 = *(long *)(in_stack_00000230 + 0x88);
            lVar28 = 1;
            lVar21 = lVar24 + 600;
            lVar25 = lVar24;
            goto code_r0x005028dc;
          }
          if (*(long *)(lVar28 + 0x500) != 4) break;
          uVar10 = (**(uint **)(lVar28 + 0x4f8) & 0xff00ff00) >> 8 |
                   (**(uint **)(lVar28 + 0x4f8) & 0xff00ff) << 8;
          uVar3 = uVar10 >> 0x10 | uVar10 << 0x10;
          uVar10 = (uint)(0x68656c70 < uVar3);
          if (uVar3 < 0x68656c70) {
            uVar10 = 0xffffffff;
          }
          iVar8 = 0;
          if (uVar10 == 0 && iStack0000000000000010 == 0) {
            iVar8 = iStack0000000000000014;
          }
          lVar28 = lVar9;
        } while (iVar8 == 1);
        in_stack_00000220 = in_stack_00000018;
        in_stack_00000088 = lVar9;
      }
      in_stack_00000220 = unaff_x23 + 600;
    } while ((*(byte *)(unaff_x23 + 0x250) >> 1 & 1) == 0);
    lVar28 = *(long *)(unaff_x23 + 0x220);
    if (*(long *)(lVar9 + 0x90) != 0) {
      plVar17 = (long *)(*(long *)(lVar9 + 0x88) + 0x220);
      lVar21 = *(long *)(lVar9 + 0x90) * 600;
      while ((*plVar17 != lVar28 ||
             (iVar8 = _memcmp(plVar17[-1],*(undefined8 *)(unaff_x23 + 0x218),lVar28), iVar8 != 0)))
      {
        plVar17 = plVar17 + 0x4b;
        lVar21 = lVar21 + -600;
        if (lVar21 == 0) goto code_r0x005015c0;
      }
      goto code_r0x00501554;
    }
code_r0x005015c0:
    if (*(long *)(unaff_x23 + 0x1e8) == -0x8000000000000000) {
      in_stack_00000df0 = 0x8000000000000000;
      if (*(long *)(unaff_x23 + 0x200) == -0x8000000000000000) goto code_r0x00501650;
code_r0x005015e8:
      func_0x0045cd08(auStack_7ffffffe + 0x800010ee,unaff_x23 + 0x200);
      uVar22 = *(ulong *)(unaff_x23 + 0x50);
    }
    else {
      func_0x0045cd08(auStack_7ffffffe + 0x80000dee,unaff_x23 + 0x1e8);
      if (*(long *)(unaff_x23 + 0x200) != -0x8000000000000000) goto code_r0x005015e8;
code_r0x00501650:
      uVar22 = *(ulong *)(unaff_x23 + 0x50);
    }
    if ((uVar22 != 5) && (3 < uVar22)) {
      (**(code **)(*(long *)(unaff_x23 + 0x60) + 0x38))(*(undefined8 *)(unaff_x23 + 0x58));
    }
    uVar12 = 0;
    uVar22 = *(ulong *)(unaff_x23 + 0x78);
    uVar23 = uVar22 * 0x10;
    if ((uVar22 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar23)) {
code_r0x00503614:
      func_0x007a1f00(uVar12,uVar23,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar23 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x70);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar23,8);
      uVar12 = 8;
      if (puVar26 == (undefined8 *)0x0) goto code_r0x00503614;
      if (uVar22 == 0) goto code_r0x0050178c;
      uVar14 = uVar22 - 1;
      uVar23 = uVar22;
      if (uVar14 <= uVar22) {
        uVar23 = uVar14;
      }
      if (uVar23 < 4) {
code_r0x005016fc:
        lVar9 = 0;
        uVar23 = uVar22;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar22;
        if (uVar14 <= uVar22) {
          uVar1 = uVar14;
        }
        if ((puVar26 < puVar20 + uVar1 * 2 + 2) && (puVar20 < puVar26 + uVar1 * 2 + 2))
        goto code_r0x005016fc;
        uVar14 = uVar23 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar23 + 1) - uVar1;
        uVar23 = uVar22 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
        puVar18 = puVar26 + 4;
        puVar15 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar15[-3];
          uVar12 = puVar15[-2];
          uVar30 = puVar15[-1];
          uVar31 = *puVar15;
          uVar33 = puVar15[1];
          uVar32 = puVar15[2];
          uVar34 = puVar15[3];
          puVar18[-4] = puVar15[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar12;
          puVar18[-1] = uVar30;
          *puVar18 = uVar31;
          puVar18[1] = uVar33;
          puVar18[2] = uVar32;
          puVar18[3] = uVar34;
          puVar18 = puVar18 + 8;
          puVar15 = puVar15 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar22 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar23 = uVar23 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar23 != 0);
    }
code_r0x0050178c:
    uVar23 = *(ulong *)(unaff_x23 + 0x90);
    uVar22 = uVar23 * 0x10;
    if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x005036ec:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x88);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x005036ec;
      if (uVar23 == 0) goto code_r0x005018ac;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 4) {
code_r0x00501878:
        lVar9 = 0;
        uVar22 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 2 + 2 && puVar20 < puVar26 + uVar1 * 2 + 2)
        goto code_r0x00501878;
        uVar14 = uVar22 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar22 + 1) - uVar1;
        uVar22 = uVar23 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
        puVar18 = puVar26 + 4;
        puVar15 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar15[-3];
          uVar12 = puVar15[-2];
          uVar30 = puVar15[-1];
          uVar31 = *puVar15;
          uVar33 = puVar15[1];
          uVar32 = puVar15[2];
          uVar34 = puVar15[3];
          puVar18[-4] = puVar15[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar12;
          puVar18[-1] = uVar30;
          *puVar18 = uVar31;
          puVar18[1] = uVar33;
          puVar18[2] = uVar32;
          puVar18[3] = uVar34;
          puVar18 = puVar18 + 8;
          puVar15 = puVar15 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar23 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar22 = uVar22 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar22 != 0);
    }
code_r0x005018ac:
    uVar23 = *(ulong *)(unaff_x23 + 0xa8);
    uVar22 = uVar23 * 0x10;
    if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x005036b4:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0xa0);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x005036b4;
      if (uVar23 == 0) goto code_r0x005019d8;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 4) {
code_r0x005019a0:
        lVar9 = 0;
        uVar22 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 2 + 2 && puVar20 < puVar26 + uVar1 * 2 + 2)
        goto code_r0x005019a0;
        uVar14 = uVar22 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar22 + 1) - uVar1;
        puVar16 = puVar26 + 4;
        puVar18 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar18[-3];
          uVar12 = puVar18[-2];
          uVar30 = puVar18[-1];
          uVar31 = *puVar18;
          uVar33 = puVar18[1];
          uVar32 = puVar18[2];
          uVar34 = puVar18[3];
          puVar16[-4] = puVar18[-4];
          puVar16[-3] = uVar29;
          puVar16[-2] = uVar12;
          puVar16[-1] = uVar30;
          *puVar16 = uVar31;
          puVar16[1] = uVar33;
          puVar16[2] = uVar32;
          puVar16[3] = uVar34;
          puVar16 = puVar16 + 8;
          puVar18 = puVar18 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
        uVar22 = uVar23 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar23 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar22 = uVar22 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar22 != 0);
    }
code_r0x005019d8:
    uVar23 = *(ulong *)(unaff_x23 + 0xc0);
    uVar22 = uVar23 * 0x20;
    if (uVar23 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x00503740:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0xb8);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x00503740;
      if (uVar23 == 0) goto code_r0x00501af4;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 2) {
code_r0x00501ab4:
        uVar22 = 0;
        uVar14 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 4 + 4 && puVar20 < puVar26 + uVar1 * 4 + 4)
        goto code_r0x00501ab4;
        uVar22 = uVar22 & 0x7fffffffffffffe;
        uVar14 = uVar22;
        puVar16 = puVar20;
        puVar18 = puVar26;
        do {
          uVar31 = puVar16[5];
          uVar30 = puVar16[4];
          uVar29 = puVar16[7];
          uVar12 = puVar16[6];
          uVar34 = puVar16[1];
          uVar33 = puVar16[3];
          uVar32 = puVar16[2];
          *puVar18 = *puVar16;
          puVar18[1] = uVar34;
          puVar18[2] = uVar32;
          puVar18[3] = uVar33;
          puVar18[4] = uVar30;
          puVar18[5] = uVar31;
          puVar18[6] = uVar12;
          puVar18[7] = uVar29;
          puVar18 = puVar18 + 8;
          uVar14 = uVar14 - 2;
          puVar16 = puVar16 + 8;
        } while (uVar14 != 0);
        uVar14 = uVar23 - uVar22;
        puVar16 = puVar20 + uVar22 * 4;
      }
      puVar26 = puVar26 + uVar22 * 4 + 2;
      do {
        if (puVar16 == puVar20 + uVar23 * 4) break;
        uVar30 = *puVar16;
        uVar12 = puVar16[2];
        uVar29 = puVar16[3];
        puVar26[-1] = puVar16[1];
        puVar26[-2] = uVar30;
        *puVar26 = uVar12;
        puVar26[1] = uVar29;
        puVar16 = puVar16 + 4;
        uVar14 = uVar14 - 1;
        puVar26 = puVar26 + 4;
      } while (uVar14 != 0);
    }
code_r0x00501af4:
    uVar23 = *(ulong *)(unaff_x23 + 0xd8);
    uVar22 = uVar23 * 0x20;
    if (uVar23 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x00503708:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0xd0);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x00503708;
      if (uVar23 == 0) goto code_r0x00501c10;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 2) {
code_r0x00501bd0:
        uVar22 = 0;
        uVar14 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 4 + 4 && puVar20 < puVar26 + uVar1 * 4 + 4)
        goto code_r0x00501bd0;
        uVar22 = uVar22 & 0x7fffffffffffffe;
        uVar14 = uVar22;
        puVar16 = puVar20;
        puVar18 = puVar26;
        do {
          uVar31 = puVar16[5];
          uVar30 = puVar16[4];
          uVar29 = puVar16[7];
          uVar12 = puVar16[6];
          uVar34 = puVar16[1];
          uVar33 = puVar16[3];
          uVar32 = puVar16[2];
          *puVar18 = *puVar16;
          puVar18[1] = uVar34;
          puVar18[2] = uVar32;
          puVar18[3] = uVar33;
          puVar18[4] = uVar30;
          puVar18[5] = uVar31;
          puVar18[6] = uVar12;
          puVar18[7] = uVar29;
          puVar18 = puVar18 + 8;
          uVar14 = uVar14 - 2;
          puVar16 = puVar16 + 8;
        } while (uVar14 != 0);
        uVar14 = uVar23 - uVar22;
        puVar16 = puVar20 + uVar22 * 4;
      }
      puVar26 = puVar26 + uVar22 * 4 + 2;
      do {
        if (puVar16 == puVar20 + uVar23 * 4) break;
        uVar30 = *puVar16;
        uVar12 = puVar16[2];
        uVar29 = puVar16[3];
        puVar26[-1] = puVar16[1];
        puVar26[-2] = uVar30;
        *puVar26 = uVar12;
        puVar26[1] = uVar29;
        puVar16 = puVar16 + 4;
        uVar14 = uVar14 - 1;
        puVar26 = puVar26 + 4;
      } while (uVar14 != 0);
    }
code_r0x00501c10:
    uVar23 = *(ulong *)(unaff_x23 + 0xf0);
    uVar22 = uVar23 * 0x20;
    if (uVar23 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x00503698:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0xe8);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x00503698;
      if (uVar23 == 0) goto code_r0x00501d2c;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 2) {
code_r0x00501cec:
        uVar22 = 0;
        uVar14 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 4 + 4 && puVar20 < puVar26 + uVar1 * 4 + 4)
        goto code_r0x00501cec;
        uVar22 = uVar22 & 0x7fffffffffffffe;
        uVar14 = uVar22;
        puVar16 = puVar20;
        puVar18 = puVar26;
        do {
          uVar31 = puVar16[5];
          uVar30 = puVar16[4];
          uVar29 = puVar16[7];
          uVar12 = puVar16[6];
          uVar34 = puVar16[1];
          uVar33 = puVar16[3];
          uVar32 = puVar16[2];
          *puVar18 = *puVar16;
          puVar18[1] = uVar34;
          puVar18[2] = uVar32;
          puVar18[3] = uVar33;
          puVar18[4] = uVar30;
          puVar18[5] = uVar31;
          puVar18[6] = uVar12;
          puVar18[7] = uVar29;
          puVar18 = puVar18 + 8;
          uVar14 = uVar14 - 2;
          puVar16 = puVar16 + 8;
        } while (uVar14 != 0);
        uVar14 = uVar23 - uVar22;
        puVar16 = puVar20 + uVar22 * 4;
      }
      puVar26 = puVar26 + uVar22 * 4 + 2;
      do {
        if (puVar16 == puVar20 + uVar23 * 4) break;
        uVar30 = *puVar16;
        uVar12 = puVar16[2];
        uVar29 = puVar16[3];
        puVar26[-1] = puVar16[1];
        puVar26[-2] = uVar30;
        *puVar26 = uVar12;
        puVar26[1] = uVar29;
        puVar16 = puVar16 + 4;
        uVar14 = uVar14 - 1;
        puVar26 = puVar26 + 4;
      } while (uVar14 != 0);
    }
code_r0x00501d2c:
    uVar22 = *(ulong *)(unaff_x23 + 0x108);
    uVar23 = uVar22 * 0x10;
    if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar23) {
      in_stack_00000008 = 0;
code_r0x00503760:
      func_0x007a1f00(in_stack_00000008,uVar23,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar23 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x100);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar23,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x00503760;
      if (uVar22 == 0) goto code_r0x00501e68;
      uVar14 = uVar22 - 1;
      uVar23 = uVar22;
      if (uVar14 <= uVar22) {
        uVar23 = uVar14;
      }
      if (uVar23 < 4) {
code_r0x00501e28:
        lVar9 = 0;
        uVar23 = uVar22;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar22;
        if (uVar14 <= uVar22) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 2 + 2 && puVar20 < puVar26 + uVar1 * 2 + 2)
        goto code_r0x00501e28;
        uVar14 = uVar23 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar23 + 1) - uVar1;
        puVar16 = puVar26 + 4;
        puVar18 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar18[-3];
          uVar12 = puVar18[-2];
          uVar30 = puVar18[-1];
          uVar31 = *puVar18;
          uVar33 = puVar18[1];
          uVar32 = puVar18[2];
          uVar34 = puVar18[3];
          puVar16[-4] = puVar18[-4];
          puVar16[-3] = uVar29;
          puVar16[-2] = uVar12;
          puVar16[-1] = uVar30;
          *puVar16 = uVar31;
          puVar16[1] = uVar33;
          puVar16[2] = uVar32;
          puVar16[3] = uVar34;
          puVar16 = puVar16 + 8;
          puVar18 = puVar18 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
        uVar23 = uVar22 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar22 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar23 = uVar23 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar23 != 0);
    }
code_r0x00501e68:
    uVar23 = *(ulong *)(unaff_x23 + 0x120);
    uVar22 = uVar23 * 0x10;
    if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x005036d0:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x118);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x005036d0;
      if (uVar23 == 0) goto code_r0x00501f98;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 4) {
code_r0x00501f60:
        lVar9 = 0;
        uVar22 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 2 + 2 && puVar20 < puVar26 + uVar1 * 2 + 2)
        goto code_r0x00501f60;
        uVar14 = uVar22 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar22 + 1) - uVar1;
        puVar16 = puVar26 + 4;
        puVar18 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar18[-3];
          uVar12 = puVar18[-2];
          uVar30 = puVar18[-1];
          uVar31 = *puVar18;
          uVar33 = puVar18[1];
          uVar32 = puVar18[2];
          uVar34 = puVar18[3];
          puVar16[-4] = puVar18[-4];
          puVar16[-3] = uVar29;
          puVar16[-2] = uVar12;
          puVar16[-1] = uVar30;
          *puVar16 = uVar31;
          puVar16[1] = uVar33;
          puVar16[2] = uVar32;
          puVar16[3] = uVar34;
          puVar16 = puVar16 + 8;
          puVar18 = puVar18 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
        uVar22 = uVar23 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar23 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar22 = uVar22 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar22 != 0);
    }
code_r0x00501f98:
    uVar12 = 0;
    uVar23 = *(ulong *)(unaff_x23 + 0x138);
    auVar4._8_8_ = 0;
    auVar4._0_8_ = uVar23;
    uVar22 = uVar23 * 0x18;
    if ((SUB168(auVar4 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar22)) {
code_r0x0050364c:
      func_0x007a1f00(uVar12,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar26 = *(undefined8 **)(unaff_x23 + 0x130);
      lVar9 = func_0x00187bd0(uVar22,8);
      uVar12 = 8;
      if (lVar9 == 0) goto code_r0x0050364c;
      if (uVar23 != 0) {
        puVar11 = (undefined1 *)(lVar9 + 0x10);
        do {
          if (uVar22 == 0) break;
          uVar12 = *puVar26;
          uVar29 = puVar26[1];
          uVar2 = *(undefined1 *)(puVar26 + 2);
          puVar26 = puVar26 + 3;
          *(undefined8 *)(puVar11 + -0x10) = uVar12;
          *(undefined8 *)(puVar11 + -8) = uVar29;
          *puVar11 = uVar2;
          uVar22 = uVar22 - 0x18;
          uVar23 = uVar23 - 1;
          puVar11 = puVar11 + 0x18;
        } while (uVar23 != 0);
      }
    }
    uVar22 = *(ulong *)(unaff_x23 + 0x150) * 8;
    if (*(ulong *)(unaff_x23 + 0x150) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar22) {
      in_stack_00000000 = 0;
code_r0x00503724:
      func_0x007a1f00(in_stack_00000000,uVar22,&UNK_009e7fe0);
      goto LAB_005037ac;
    }
    uVar12 = *(undefined8 *)(unaff_x23 + 0x148);
    if (uVar22 == 0) {
      lVar9 = 4;
    }
    else {
      lVar9 = func_0x00187bd0(uVar22,4);
      if (lVar9 == 0) goto code_r0x00503724;
    }
    _memcpy(lVar9,uVar12,uVar22);
    uVar12 = 0;
    uVar23 = *(ulong *)(unaff_x23 + 0x168);
    uVar22 = uVar23 * 0x10;
    if ((uVar23 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar22)) {
code_r0x0050363c:
      func_0x007a1f00(uVar12,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x160);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      uVar12 = 8;
      if (puVar26 == (undefined8 *)0x0) goto code_r0x0050363c;
      if (uVar23 == 0) goto code_r0x00502208;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 4) {
code_r0x00502170:
        lVar9 = 0;
        uVar22 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if ((puVar26 < puVar20 + uVar1 * 2 + 2) && (puVar20 < puVar26 + uVar1 * 2 + 2))
        goto code_r0x00502170;
        uVar14 = uVar22 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar22 + 1) - uVar1;
        uVar22 = uVar23 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
        puVar18 = puVar26 + 4;
        puVar15 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar15[-3];
          uVar12 = puVar15[-2];
          uVar30 = puVar15[-1];
          uVar31 = *puVar15;
          uVar33 = puVar15[1];
          uVar32 = puVar15[2];
          uVar34 = puVar15[3];
          puVar18[-4] = puVar15[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar12;
          puVar18[-1] = uVar30;
          *puVar18 = uVar31;
          puVar18[1] = uVar33;
          puVar18[2] = uVar32;
          puVar18[3] = uVar34;
          puVar18 = puVar18 + 8;
          puVar15 = puVar15 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar23 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar22 = uVar22 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar22 != 0);
    }
code_r0x00502208:
    uVar23 = *(ulong *)(unaff_x23 + 0x180);
    uVar22 = uVar23 * 0x10;
    if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x0050367c:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x178);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x0050367c;
      if (uVar23 == 0) goto code_r0x0050237c;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 4) {
code_r0x005022ec:
        lVar28 = 0;
        uVar22 = uVar23;
        puVar15 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if ((puVar26 < puVar20 + uVar1 * 2 + 2) && (puVar20 < puVar26 + uVar1 * 2 + 2))
        goto code_r0x005022ec;
        uVar14 = uVar22 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar28 = (uVar22 + 1) - uVar1;
        uVar22 = uVar23 - lVar28;
        puVar15 = puVar20 + lVar28 * 2;
        puVar16 = puVar26 + 4;
        puVar18 = puVar20 + 4;
        lVar9 = lVar28;
        do {
          uVar29 = puVar18[-3];
          uVar12 = puVar18[-2];
          uVar30 = puVar18[-1];
          uVar31 = *puVar18;
          uVar33 = puVar18[1];
          uVar32 = puVar18[2];
          uVar34 = puVar18[3];
          puVar16[-4] = puVar18[-4];
          puVar16[-3] = uVar29;
          puVar16[-2] = uVar12;
          puVar16[-1] = uVar30;
          *puVar16 = uVar31;
          puVar16[1] = uVar33;
          puVar16[2] = uVar32;
          puVar16[3] = uVar34;
          puVar16 = puVar16 + 8;
          puVar18 = puVar18 + 8;
          lVar9 = lVar9 + -4;
        } while (lVar9 != 0);
      }
      puVar26 = puVar26 + lVar28 * 2 + 1;
      do {
        if (puVar15 == puVar20 + uVar23 * 2) break;
        uVar12 = puVar15[1];
        puVar26[-1] = *puVar15;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar22 = uVar22 - 1;
        puVar15 = puVar15 + 2;
      } while (uVar22 != 0);
    }
code_r0x0050237c:
    uVar12 = 0;
    uVar23 = *(ulong *)(unaff_x23 + 0x198);
    auVar5._8_8_ = 0;
    auVar5._0_8_ = uVar23;
    uVar22 = uVar23 * 0x30;
    if ((SUB168(auVar5 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar22)) {
code_r0x00503628:
      func_0x007a1f00(uVar12,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar26 = *(undefined8 **)(unaff_x23 + 400);
      lVar9 = func_0x00187bd0(uVar22,8);
      uVar12 = 8;
      if (lVar9 == 0) goto code_r0x00503628;
      if (uVar23 != 0) {
        puVar20 = (undefined8 *)(lVar9 + 0x18);
        do {
          if (uVar22 == 0) break;
          puVar16 = puVar26 + 1;
          uVar30 = *puVar26;
          uVar32 = puVar26[3];
          uVar31 = puVar26[2];
          uVar12 = puVar26[4];
          uVar29 = puVar26[5];
          puVar26 = puVar26 + 6;
          puVar20[-2] = *puVar16;
          puVar20[-3] = uVar30;
          *puVar20 = uVar32;
          puVar20[-1] = uVar31;
          puVar20[1] = uVar12;
          puVar20[2] = uVar29;
          uVar22 = uVar22 - 0x30;
          puVar20 = puVar20 + 6;
          uVar23 = uVar23 - 1;
        } while (uVar23 != 0);
      }
    }
    uVar23 = *(ulong *)(unaff_x23 + 0x1b0);
    uVar22 = uVar23 * 0x10;
    if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar22) {
      in_stack_00000008 = 0;
code_r0x00503798:
      func_0x007a1f00(in_stack_00000008,uVar22,&UNK_009e7fc8);
      goto LAB_005037ac;
    }
    if (uVar22 != 0) {
      puVar20 = *(undefined8 **)(unaff_x23 + 0x1a8);
      puVar26 = (undefined8 *)func_0x00187bd0(uVar22,8);
      if (puVar26 == (undefined8 *)0x0) goto code_r0x00503798;
      if (uVar23 == 0) goto code_r0x0050253c;
      uVar14 = uVar23 - 1;
      uVar22 = uVar23;
      if (uVar14 <= uVar23) {
        uVar22 = uVar14;
      }
      if (uVar22 < 4) {
code_r0x00502508:
        lVar9 = 0;
        uVar22 = uVar23;
        puVar16 = puVar20;
      }
      else {
        uVar1 = uVar23;
        if (uVar14 <= uVar23) {
          uVar1 = uVar14;
        }
        if (puVar26 < puVar20 + uVar1 * 2 + 2 && puVar20 < puVar26 + uVar1 * 2 + 2)
        goto code_r0x00502508;
        uVar14 = uVar22 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar9 = (uVar22 + 1) - uVar1;
        uVar22 = uVar23 - lVar9;
        puVar16 = puVar20 + lVar9 * 2;
        puVar18 = puVar26 + 4;
        puVar15 = puVar20 + 4;
        lVar28 = lVar9;
        do {
          uVar29 = puVar15[-3];
          uVar12 = puVar15[-2];
          uVar30 = puVar15[-1];
          uVar31 = *puVar15;
          uVar33 = puVar15[1];
          uVar32 = puVar15[2];
          uVar34 = puVar15[3];
          puVar18[-4] = puVar15[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar12;
          puVar18[-1] = uVar30;
          *puVar18 = uVar31;
          puVar18[1] = uVar33;
          puVar18[2] = uVar32;
          puVar18[3] = uVar34;
          puVar18 = puVar18 + 8;
          puVar15 = puVar15 + 8;
          lVar28 = lVar28 + -4;
        } while (lVar28 != 0);
      }
      puVar26 = puVar26 + lVar9 * 2 + 1;
      do {
        if (puVar16 == puVar20 + uVar23 * 2) break;
        uVar12 = puVar16[1];
        puVar26[-1] = *puVar16;
        *puVar26 = uVar12;
        puVar26 = puVar26 + 2;
        uVar22 = uVar22 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar22 != 0);
    }
code_r0x0050253c:
    unaff_x21 = *(ulong *)(unaff_x23 + 0x1c8) * 0x10;
    if (*(ulong *)(unaff_x23 + 0x1c8) >> 0x3c != 0 || 0x7ffffffffffffff8 < unaff_x21) {
      in_stack_00000008 = 0;
      goto code_r0x0050377c;
    }
    unaff_x20 = *(undefined8 *)(unaff_x23 + 0x1c0);
    if (unaff_x21 == 0) {
      unaff_x24 = 8;
    }
    else {
      unaff_x24 = func_0x00187bd0(unaff_x21,8);
      if (unaff_x24 == 0) {
code_r0x0050377c:
        func_0x007a1f00(in_stack_00000008,unaff_x21,&UNK_009e7fe0);
LAB_005037ac:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x5037b0);
        (*pcVar6)();
      }
    }
  } while( true );
code_r0x005028dc:
  do {
    lVar13 = lVar21;
    if (*(long *)(lVar25 + 0xa8) != 0) {
      puVar20 = *(undefined8 **)(lVar25 + 0xa0);
      puVar26 = puVar20 + *(long *)(lVar25 + 0xa8) * 2;
      puVar16 = puVar20 + 2;
code_r0x0050294c:
      do {
        if (*(long *)(in_stack_00000230 + 0xd8) != 0) {
          plVar17 = *(long **)(in_stack_00000230 + 0xd0);
          lVar27 = puVar20[1];
          lVar21 = *(long *)(in_stack_00000230 + 0xd8) * 0x60;
          do {
            if ((plVar17[10] == lVar27) && (iVar8 = _memcmp(plVar17[9],*puVar20,lVar27), iVar8 == 0)
               ) {
              uVar12 = *(undefined8 *)(lVar25 + 0x218);
              uVar29 = *(undefined8 *)(lVar25 + 0x220);
              lVar21 = plVar17[2];
              if (lVar21 == *plVar17) {
                func_0x0050c0c0(plVar17,&UNK_009e8a18);
              }
              puVar20 = (undefined8 *)(plVar17[1] + lVar21 * 0x10);
              *puVar20 = uVar12;
              puVar20[1] = uVar29;
              plVar17[2] = lVar21 + 1;
              bVar7 = puVar16 != puVar26;
              puVar20 = puVar16;
              puVar16 = puVar16 + (ulong)bVar7 * 2;
              if (bVar7) goto code_r0x0050294c;
              goto code_r0x00502a98;
            }
            plVar17 = plVar17 + 0xc;
            lVar21 = lVar21 + -0x60;
          } while (lVar21 != 0);
        }
        uVar12 = *puVar20;
        uVar29 = puVar20[1];
        uVar30 = *(undefined8 *)(lVar25 + 0x218);
        uVar31 = *(undefined8 *)(lVar25 + 0x220);
        func_0x0050c0c0(auStack_7ffffffe + 0x800010ee,&UNK_009e8a30);
        lVar21 = *(long *)(in_stack_00000230 + 0xd8);
        MACH_HEADER._8_8_ = uVar30;
        MACH_HEADER._16_8_ = uVar31;
        if (lVar21 == *(long *)(in_stack_00000230 + 200)) {
          func_0x0050c500(in_stack_00000230 + 200,&UNK_009e8a48);
        }
        puVar20 = (undefined8 *)(*(long *)(in_stack_00000230 + 0xd0) + lVar21 * 0x60);
        puVar20[5] = 0;
        puVar20[4] = 8;
        puVar20[7] = 8;
        puVar20[6] = 0;
        puVar20[9] = uVar12;
        puVar20[8] = 0;
        puVar20[0xb] = (ulong)in_stack_0000114a << 0x10;
        puVar20[10] = uVar29;
        puVar20[1] = 8;
        *puVar20 = 0;
        puVar20[3] = 0;
        puVar20[2] = 1;
        *(long *)(in_stack_00000230 + 0xd8) = lVar21 + 1;
        bVar7 = puVar16 != puVar26;
        puVar20 = puVar16;
        puVar16 = puVar16 + (ulong)bVar7 * 2;
      } while (bVar7);
    }
code_r0x00502a98:
    func_0x0050d2e0(lVar25);
    if ((((uVar10 | uVar3) >> 0x18 & 1) != 0) &&
       (((*(uint *)(lVar25 + 0x10) & 1) == 0 || (*(long *)(lVar25 + 0x20) != 0)))) {
      *(uint *)(lVar25 + 0x250) = *(uint *)(lVar25 + 0x250) | 0x10;
    }
    if (((*(long *)(lVar25 + 0x228) == 0) && (*(int *)(lVar25 + 0x248) == 0x110000)) &&
       (*(long *)(lVar25 + 0x28) == 0)) {
      *(undefined8 *)(lVar25 + 0x28) = 1;
      *(long *)(lVar25 + 0x30) = lVar28;
      lVar28 = lVar28 + 1;
    }
    bVar7 = lVar13 != lVar24 + lVar9 * 600;
    lVar21 = 0;
    if (bVar7) {
      lVar21 = 600;
    }
    lVar21 = lVar13 + lVar21;
    lVar25 = lVar13;
  } while (bVar7);
code_r0x00502aec:
  func_0x00510488(in_stack_00000230 + 0x80);
  lVar9 = 0;
  lVar28 = *(long *)(in_stack_00000230 + 0xa0);
  lVar21 = *(long *)(in_stack_00000230 + 0xa8) * 0x20;
  do {
    if (lVar21 == lVar9) {
      uVar22 = 0;
      goto code_r0x00502b4c;
    }
    piVar19 = (int *)(lVar28 + lVar9);
    lVar9 = lVar9 + 0x20;
  } while (*piVar19 != 2);
  uVar22 = *(ulong *)(lVar28 + lVar9 + -0x18);
  uVar23 = lVar21 - lVar9;
  if (uVar23 != 0) {
    if ((uVar23 >> 5) - 1 < 7) {
      lVar21 = 0;
    }
    else {
      lVar21 = 0;
      piVar19 = (int *)(lVar28 + lVar9 + 0x80);
      do {
        if (piVar19[-0x20] == 2) {
          uVar14 = *(ulong *)(piVar19 + -0x1e);
          if (*(ulong *)(piVar19 + -0x1e) <= uVar22) {
            uVar14 = uVar22;
          }
          uVar22 = uVar14;
          if (piVar19[-0x18] == 2) goto code_r0x00502d04;
code_r0x00502c88:
          if (piVar19[-0x10] != 2) goto code_r0x00502d1c;
code_r0x00502c94:
          uVar22 = *(ulong *)(piVar19 + -0xe);
          if (*(ulong *)(piVar19 + -0xe) <= uVar14) {
            uVar22 = uVar14;
          }
          uVar14 = uVar22;
          if (piVar19[-8] == 2) goto code_r0x00502d28;
code_r0x00502cac:
          if (*piVar19 != 2) goto code_r0x00502d40;
code_r0x00502cb8:
          uVar14 = *(ulong *)(piVar19 + 2);
          if (*(ulong *)(piVar19 + 2) <= uVar22) {
            uVar14 = uVar22;
          }
          uVar22 = uVar14;
          if (piVar19[8] == 2) goto code_r0x00502d4c;
code_r0x00502cd0:
          if (piVar19[0x10] != 2) goto code_r0x00502d64;
code_r0x00502cdc:
          uVar1 = *(ulong *)(piVar19 + 0x12);
          if (*(ulong *)(piVar19 + 0x12) <= uVar14) {
            uVar1 = uVar14;
          }
          iVar8 = piVar19[0x18];
        }
        else {
          uVar14 = uVar22;
          if (piVar19[-0x18] != 2) goto code_r0x00502c88;
code_r0x00502d04:
          uVar14 = *(ulong *)(piVar19 + -0x16);
          if (*(ulong *)(piVar19 + -0x16) <= uVar22) {
            uVar14 = uVar22;
          }
          if (piVar19[-0x10] == 2) goto code_r0x00502c94;
code_r0x00502d1c:
          uVar22 = uVar14;
          if (piVar19[-8] != 2) goto code_r0x00502cac;
code_r0x00502d28:
          uVar22 = *(ulong *)(piVar19 + -6);
          if (*(ulong *)(piVar19 + -6) <= uVar14) {
            uVar22 = uVar14;
          }
          if (*piVar19 == 2) goto code_r0x00502cb8;
code_r0x00502d40:
          uVar14 = uVar22;
          if (piVar19[8] != 2) goto code_r0x00502cd0;
code_r0x00502d4c:
          uVar14 = *(ulong *)(piVar19 + 10);
          if (*(ulong *)(piVar19 + 10) <= uVar22) {
            uVar14 = uVar22;
          }
          if (piVar19[0x10] == 2) goto code_r0x00502cdc;
code_r0x00502d64:
          iVar8 = piVar19[0x18];
          uVar1 = uVar14;
        }
        uVar22 = uVar1;
        if ((iVar8 == 2) &&
           (uVar22 = *(ulong *)(piVar19 + 0x1a), *(ulong *)(piVar19 + 0x1a) <= uVar1)) {
          uVar22 = uVar1;
        }
        piVar19 = piVar19 + 0x40;
        lVar21 = lVar21 + -8;
      } while (-lVar21 != (uVar23 >> 8) * 8);
      lVar21 = -lVar21;
    }
    if ((uVar23 >> 5 & 7) != 0) {
      lVar21 = lVar21 << 5;
      uVar23 = uVar23 & 0xe0;
      uVar14 = uVar22;
      do {
        uVar22 = uVar14;
        if ((*(int *)(lVar28 + lVar21 + lVar9) == 2) &&
           (uVar22 = *(ulong *)(lVar28 + lVar21 + lVar9 + 8), uVar22 <= uVar14)) {
          uVar22 = uVar14;
        }
        lVar21 = lVar21 + 0x20;
        uVar23 = uVar23 - 0x20;
        uVar14 = uVar22;
      } while (uVar23 != 0);
    }
  }
code_r0x00502b4c:
  uVar10 = *(uint *)(in_stack_00000230 + 700);
  lVar9 = *(long *)(in_stack_00000230 + 0x90);
  if (lVar9 != 0) {
    lVar28 = 0;
    uVar10 = uVar10 | *(uint *)(in_stack_00000230 + 0x2c0);
    lVar21 = *(long *)(in_stack_00000230 + 0x88);
    do {
      if (((uVar10 >> 1 & 1) != 0) &&
         ((lVar25 = lVar21 + lVar28, (*(uint *)(lVar25 + 0x10) & 1) == 0 ||
          (*(long *)(lVar25 + 0x20) != 0)))) {
        *(uint *)(lVar25 + 0x250) = *(uint *)(lVar25 + 0x250) | 0x20;
      }
      if (((uVar10 >> 2 & 1) != 0) &&
         ((lVar25 = lVar21 + lVar28, (*(uint *)(lVar25 + 0x10) & 1) == 0 ||
          (*(long *)(lVar25 + 0x20) != 0)))) {
        *(uint *)(lVar25 + 0x250) = *(uint *)(lVar25 + 0x250) | 0x40;
      }
      if (((uVar10 >> 5 & 1) != 0) &&
         (lVar25 = lVar21 + lVar28,
         *(int *)(lVar25 + 0x28) == 1 && *(ulong *)(lVar25 + 0x30) == uVar22)) {
        *(uint *)(lVar25 + 0x250) = *(uint *)(lVar25 + 0x250) | 0x200;
      }
      lVar28 = lVar28 + 600;
    } while (lVar9 * 600 != lVar28);
    uVar10 = *in_stack_00000028;
  }
  *in_stack_00000028 = uVar10 | 0x40000000;
  return;
}

