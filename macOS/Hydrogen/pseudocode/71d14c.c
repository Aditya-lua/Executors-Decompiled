
ulong FUN_0071d14c(void)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long unaff_x19;
  undefined8 *unaff_x21;
  long lVar11;
  undefined8 uVar12;
  ulong unaff_x22;
  uint unaff_w27;
  uint unaff_w28;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000050;
  undefined8 in_stack_00000058;
  long *in_stack_00000060;
  long in_stack_00000068;
  ulong in_stack_00000070;
  long *in_stack_00000078;
  long in_stack_00000080;
  
  lVar6 = in_stack_00000080;
  if (unaff_x22 == 1 && ((unaff_w28 | unaff_w27) & 1) == 0) {
    uVar3 = *(ulong *)(*in_stack_00000078 + in_stack_00000080 * 8);
    goto LAB_0071d644;
  }
  if ((unaff_w28 & unaff_w27 & 1) == 0) {
    in_stack_00000058 = *(undefined8 *)(*(long *)(in_stack_00000078[1] + -8) + 0x14);
    if ((unaff_w28 & 1) == 0) {
      if ((unaff_w27 & 1) == 0) {
        func_0x0070f408();
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x71d7d4);
        (*pcVar1)();
      }
      uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
      if (unaff_x22 == 0) {
        uStack0000000000000030 = 0;
      }
      else {
        lVar2 = *in_stack_00000078;
        uStack0000000000000030 = func_0x00704c24(uVar12,unaff_x22 << 3);
        if ((unaff_x22 < 8) || ((ulong)((uStack0000000000000030 + lVar6 * -8) - lVar2) < 0x40)) {
          uVar3 = 0;
        }
        else {
          uVar3 = unaff_x22 & 0xfffffffffffffff8;
          puVar5 = (undefined8 *)(uStack0000000000000030 + 0x20);
          puVar9 = (undefined8 *)(lVar6 * 8 + lVar2 + 0x20);
          uVar8 = uVar3;
          do {
            uVar13 = puVar9[-4];
            uVar15 = puVar9[-1];
            uVar14 = puVar9[-2];
            uVar17 = puVar9[1];
            uVar16 = *puVar9;
            uVar19 = puVar9[3];
            uVar18 = puVar9[2];
            puVar5[-3] = puVar9[-3];
            puVar5[-4] = uVar13;
            puVar5[-1] = uVar15;
            puVar5[-2] = uVar14;
            puVar5[1] = uVar17;
            *puVar5 = uVar16;
            puVar5[3] = uVar19;
            puVar5[2] = uVar18;
            uVar8 = uVar8 - 8;
            puVar5 = puVar5 + 8;
            puVar9 = puVar9 + 8;
          } while (uVar8 != 0);
          if (unaff_x22 == uVar3) goto LAB_0071d398;
        }
        lVar11 = unaff_x22 - uVar3;
        puVar5 = (undefined8 *)(lVar2 + uVar3 * 8 + lVar6 * 8);
        puVar9 = (undefined8 *)(uStack0000000000000030 + uVar3 * 8);
        do {
          *puVar9 = *puVar5;
          lVar11 = lVar11 + -1;
          puVar5 = puVar5 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar11 != 0);
      }
LAB_0071d398:
      uVar3 = func_0x00704c24(uVar12,0x30);
      func_0x00708250(uVar3,&uStack0000000000000050,&uStack0000000000000030);
      uVar8 = in_stack_00000070;
      lVar6 = in_stack_00000068;
      if (*(char *)(unaff_x19 + 0x58) == '\0') goto LAB_0071d644;
      uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
      if (in_stack_00000070 != 0) {
        lVar11 = *in_stack_00000060;
        lVar2 = func_0x00704c24(uVar12,in_stack_00000070 << 3);
        if ((uVar8 < 8) || ((ulong)((lVar2 + lVar6 * -8) - lVar11) < 0x40)) {
          uVar4 = 0;
        }
        else {
          uVar4 = uVar8 & 0xfffffffffffffff8;
          puVar5 = (undefined8 *)(lVar2 + 0x20);
          puVar9 = (undefined8 *)(lVar6 * 8 + lVar11 + 0x20);
          uVar10 = uVar4;
          do {
            uVar13 = puVar9[-4];
            uVar15 = puVar9[-1];
            uVar14 = puVar9[-2];
            uVar17 = puVar9[1];
            uVar16 = *puVar9;
            uVar19 = puVar9[3];
            uVar18 = puVar9[2];
            puVar5[-3] = puVar9[-3];
            puVar5[-4] = uVar13;
            puVar5[-1] = uVar15;
            puVar5[-2] = uVar14;
            puVar5[1] = uVar17;
            *puVar5 = uVar16;
            puVar5[3] = uVar19;
            puVar5[2] = uVar18;
            uVar10 = uVar10 - 8;
            puVar5 = puVar5 + 8;
            puVar9 = puVar9 + 8;
          } while (uVar10 != 0);
          if (uVar8 == uVar4) goto code_r0x0071d54c;
        }
        lVar7 = uVar8 - uVar4;
        puVar5 = (undefined8 *)(lVar11 + uVar4 * 8 + lVar6 * 8);
        puVar9 = (undefined8 *)(lVar2 + uVar4 * 8);
        do {
          *puVar9 = *puVar5;
          lVar7 = lVar7 + -1;
          puVar5 = puVar5 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar7 != 0);
      }
code_r0x0071d54c:
      uVar12 = func_0x00704c24(uVar12,0x20);
      func_0x00709758();
      lVar6 = *(long *)(unaff_x19 + 0x420);
      if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
        if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar3 != *(ulong *)(unaff_x19 + 0x430))) {
          uVar8 = 0;
          uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
          do {
            uVar4 = uVar4 & lVar6 - 1U;
            uVar10 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar4 * 0x10);
            if (uVar10 == uVar3) goto code_r0x0071d5dc;
            uVar8 = uVar8 + 1;
            uVar4 = uVar8 + uVar4;
          } while (uVar10 != *(ulong *)(unaff_x19 + 0x430) && uVar8 <= lVar6 - 1U);
        }
        func_0x006db93c();
        lVar6 = *(long *)(unaff_x19 + 0x420);
      }
code_r0x0071d5dc:
      lVar2 = *(long *)(unaff_x19 + 0x418);
      uVar8 = (uVar3 >> 4 ^ uVar3 >> 9) & lVar6 - 1U;
      uVar4 = *(ulong *)(lVar2 + uVar8 * 0x10);
      if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
        lVar11 = 1;
        do {
          if (uVar4 == uVar3) goto code_r0x0071d63c;
          uVar8 = uVar8 + lVar11 & lVar6 - 1U;
          uVar4 = *(ulong *)(lVar2 + uVar8 * 0x10);
          lVar11 = lVar11 + 1;
        } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
      }
    }
    else {
      uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
      if (unaff_x22 == 0) {
        uStack0000000000000030 = 0;
      }
      else {
        lVar2 = *in_stack_00000078;
        uStack0000000000000030 = func_0x00704c24(uVar12,unaff_x22 << 3);
        if ((unaff_x22 < 8) || ((ulong)((uStack0000000000000030 + lVar6 * -8) - lVar2) < 0x40)) {
          uVar3 = 0;
        }
        else {
          uVar3 = unaff_x22 & 0xfffffffffffffff8;
          puVar5 = (undefined8 *)(uStack0000000000000030 + 0x20);
          puVar9 = (undefined8 *)(lVar6 * 8 + lVar2 + 0x20);
          uVar8 = uVar3;
          do {
            uVar13 = puVar9[-4];
            uVar15 = puVar9[-1];
            uVar14 = puVar9[-2];
            uVar17 = puVar9[1];
            uVar16 = *puVar9;
            uVar19 = puVar9[3];
            uVar18 = puVar9[2];
            puVar5[-3] = puVar9[-3];
            puVar5[-4] = uVar13;
            puVar5[-1] = uVar15;
            puVar5[-2] = uVar14;
            puVar5[1] = uVar17;
            *puVar5 = uVar16;
            puVar5[3] = uVar19;
            puVar5[2] = uVar18;
            uVar8 = uVar8 - 8;
            puVar5 = puVar5 + 8;
            puVar9 = puVar9 + 8;
          } while (uVar8 != 0);
          if (unaff_x22 == uVar3) goto LAB_0071d300;
        }
        lVar11 = unaff_x22 - uVar3;
        puVar5 = (undefined8 *)(lVar2 + uVar3 * 8 + lVar6 * 8);
        puVar9 = (undefined8 *)(uStack0000000000000030 + uVar3 * 8);
        do {
          *puVar9 = *puVar5;
          lVar11 = lVar11 + -1;
          puVar5 = puVar5 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar11 != 0);
      }
LAB_0071d300:
      uVar3 = func_0x00704c24(uVar12,0x30);
      func_0x007081ac(uVar3,&uStack0000000000000050,&uStack0000000000000030);
      uVar8 = in_stack_00000070;
      lVar6 = in_stack_00000068;
      if (*(char *)(unaff_x19 + 0x58) == '\0') goto LAB_0071d644;
      uVar12 = *(undefined8 *)(unaff_x19 + 0xd8);
      if (in_stack_00000070 != 0) {
        lVar11 = *in_stack_00000060;
        lVar2 = func_0x00704c24(uVar12,in_stack_00000070 << 3);
        if ((uVar8 < 8) || ((ulong)((lVar2 + lVar6 * -8) - lVar11) < 0x40)) {
          uVar4 = 0;
        }
        else {
          uVar4 = uVar8 & 0xfffffffffffffff8;
          puVar5 = (undefined8 *)(lVar2 + 0x20);
          puVar9 = (undefined8 *)(lVar6 * 8 + lVar11 + 0x20);
          uVar10 = uVar4;
          do {
            uVar13 = puVar9[-4];
            uVar15 = puVar9[-1];
            uVar14 = puVar9[-2];
            uVar17 = puVar9[1];
            uVar16 = *puVar9;
            uVar19 = puVar9[3];
            uVar18 = puVar9[2];
            puVar5[-3] = puVar9[-3];
            puVar5[-4] = uVar13;
            puVar5[-1] = uVar15;
            puVar5[-2] = uVar14;
            puVar5[1] = uVar17;
            *puVar5 = uVar16;
            puVar5[3] = uVar19;
            puVar5[2] = uVar18;
            uVar10 = uVar10 - 8;
            puVar5 = puVar5 + 8;
            puVar9 = puVar9 + 8;
          } while (uVar10 != 0);
          if (uVar8 == uVar4) goto LAB_0071d468;
        }
        lVar7 = uVar8 - uVar4;
        puVar5 = (undefined8 *)(lVar11 + uVar4 * 8 + lVar6 * 8);
        puVar9 = (undefined8 *)(lVar2 + uVar4 * 8);
        do {
          *puVar9 = *puVar5;
          lVar7 = lVar7 + -1;
          puVar5 = puVar5 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar7 != 0);
      }
LAB_0071d468:
      uVar12 = func_0x00704c24(uVar12,0x20);
      func_0x0070973c();
      lVar6 = *(long *)(unaff_x19 + 0x420);
      if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
        if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar3 != *(ulong *)(unaff_x19 + 0x430))) {
          uVar8 = 0;
          uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
          do {
            uVar4 = uVar4 & lVar6 - 1U;
            uVar10 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar4 * 0x10);
            if (uVar10 == uVar3) goto code_r0x0071d4f8;
            uVar8 = uVar8 + 1;
            uVar4 = uVar8 + uVar4;
          } while (uVar10 != *(ulong *)(unaff_x19 + 0x430) && uVar8 <= lVar6 - 1U);
        }
        func_0x006db93c();
        lVar6 = *(long *)(unaff_x19 + 0x420);
      }
code_r0x0071d4f8:
      lVar2 = *(long *)(unaff_x19 + 0x418);
      uVar8 = (uVar3 >> 4 ^ uVar3 >> 9) & lVar6 - 1U;
      uVar4 = *(ulong *)(lVar2 + uVar8 * 0x10);
      if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
        lVar11 = 1;
        do {
          if (uVar4 == uVar3) goto code_r0x0071d63c;
          uVar8 = uVar8 + lVar11 & lVar6 - 1U;
          uVar4 = *(ulong *)(lVar2 + uVar8 * 0x10);
          lVar11 = lVar11 + 1;
        } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
      }
    }
    *(ulong *)(lVar2 + uVar8 * 0x10) = uVar3;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x0071d63c:
    *(undefined8 *)(lVar2 + uVar8 * 0x10 + 8) = uVar12;
    goto LAB_0071d644;
  }
  uStack0000000000000030 = *unaff_x21;
  if (unaff_x22 != 0) {
    lVar11 = *in_stack_00000078;
    lVar2 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),unaff_x22 << 3);
    if ((unaff_x22 < 8) || ((ulong)((lVar2 + lVar6 * -8) - lVar11) < 0x40)) {
      uVar3 = 0;
    }
    else {
      uVar3 = unaff_x22 & 0xfffffffffffffff8;
      puVar5 = (undefined8 *)(lVar2 + 0x20);
      puVar9 = (undefined8 *)(lVar6 * 8 + lVar11 + 0x20);
      uVar8 = uVar3;
      do {
        uVar12 = puVar9[-4];
        uVar14 = puVar9[-1];
        uVar13 = puVar9[-2];
        uVar16 = puVar9[1];
        uVar15 = *puVar9;
        uVar18 = puVar9[3];
        uVar17 = puVar9[2];
        puVar5[-3] = puVar9[-3];
        puVar5[-4] = uVar12;
        puVar5[-1] = uVar14;
        puVar5[-2] = uVar13;
        puVar5[1] = uVar16;
        *puVar5 = uVar15;
        puVar5[3] = uVar18;
        puVar5[2] = uVar17;
        uVar8 = uVar8 - 8;
        puVar5 = puVar5 + 8;
        puVar9 = puVar9 + 8;
      } while (uVar8 != 0);
      if (unaff_x22 == uVar3) goto LAB_0071d2d8;
    }
    lVar7 = unaff_x22 - uVar3;
    puVar5 = (undefined8 *)(lVar11 + uVar3 * 8 + lVar6 * 8);
    puVar9 = (undefined8 *)(lVar2 + uVar3 * 8);
    do {
      *puVar9 = *puVar5;
      lVar7 = lVar7 + -1;
      puVar5 = puVar5 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar7 != 0);
  }
LAB_0071d2d8:
  uVar3 = func_0x0071a964();
LAB_0071d644:
  lVar6 = *in_stack_00000060 + in_stack_00000068 * 8;
  if (lVar6 != in_stack_00000060[1]) {
    in_stack_00000060[1] = lVar6;
  }
  lVar6 = *in_stack_00000078 + in_stack_00000080 * 8;
  if (lVar6 != in_stack_00000078[1]) {
    in_stack_00000078[1] = lVar6;
  }
  return uVar3;
}

