
void FUN_00719628(void)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long extraout_x1;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined8 *puVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  undefined8 unaff_x25;
  byte bVar16;
  byte unaff_w26;
  ulong uVar17;
  undefined8 uVar18;
  long unaff_x29;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000018;
  long *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000078;
  long in_stack_00000080;
  ulong in_stack_00000088;
  
code_r0x00719628:
  iVar5 = *(int *)(unaff_x20 + 0x80);
  bVar16 = iVar5 == 0x106 | unaff_w26;
  if (iVar5 == 0x106 || (unaff_w26 & 1) != 0) goto LAB_00719600;
code_r0x0071963c:
  if (iVar5 == 0x3d && in_stack_00000028._4_4_ != 0) {
    uVar2 = *(undefined8 *)(unaff_x20 + 0x84);
    func_0x00710d48();
    uVar1 = *(undefined4 *)(unaff_x20 + 0x114);
    uVar18 = *unaff_x24;
    *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24[1];
    *(undefined8 *)(unaff_x29 + -0x80) = uVar18;
    if ((*(int *)(unaff_x20 + 0x80) != 0x26) && (*(int *)(unaff_x20 + 0x80) != 0x7c)) {
      func_0x0071f5c8();
      *(undefined4 *)(unaff_x20 + 0x114) = uVar1;
    }
    uVar18 = func_0x0071cf0c();
    *(undefined4 *)(unaff_x20 + 0x114) = uVar1;
    uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
    uVar18 = func_0x00705d98(uVar3,&uStack0000000000000030,unaff_x25,uVar18);
    *(undefined8 *)(unaff_x29 + -0x80) = uVar18;
    if (*(char *)(unaff_x20 + 0x58) == '\0') goto code_r0x00719be8;
    uVar18 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x10);
    func_0x00709650(uVar18,uVar2,1);
    uVar17 = *(ulong *)(unaff_x29 + -0x80);
    lVar6 = *(long *)(unaff_x20 + 0x420);
    if (*(ulong *)(unaff_x20 + 0x428) < (ulong)(lVar6 * 3) >> 2) goto code_r0x00719b80;
    if ((*(ulong *)(unaff_x20 + 0x428) == 0) || (uVar17 == *(ulong *)(unaff_x20 + 0x430)))
    goto code_r0x00719b74;
    uVar11 = 0;
    uVar14 = uVar17 >> 4 ^ uVar17 >> 9;
    goto code_r0x00719b4c;
  }
  if ((unaff_x22 & 1) != 0) {
    func_0x007181dc();
  }
  uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
  uVar2 = func_0x00705d98(uVar2,&uStack0000000000000030,unaff_x25,0);
  *(undefined8 *)(unaff_x29 + -0x80) = uVar2;
  if (*(char *)(unaff_x20 + 0x58) != '\0') {
    uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x10);
    func_0x00709650(uVar2,0,0);
    uVar17 = *(ulong *)(unaff_x29 + -0x80);
    lVar6 = *(long *)(unaff_x20 + 0x420);
    if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
      if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar17 != *(ulong *)(unaff_x20 + 0x430))) {
        uVar11 = 0;
        uVar14 = uVar17 >> 4 ^ uVar17 >> 9;
        do {
          uVar14 = uVar14 & lVar6 - 1U;
          uVar15 = *(ulong *)(*in_stack_00000020 + uVar14 * 0x10);
          if (uVar15 == uVar17) goto code_r0x0071971c;
          uVar11 = uVar11 + 1;
          uVar14 = uVar11 + uVar14;
        } while (uVar15 != *(ulong *)(unaff_x20 + 0x430) && uVar11 <= lVar6 - 1U);
      }
      func_0x006db93c(in_stack_00000020);
      lVar6 = *(long *)(unaff_x20 + 0x420);
    }
code_r0x0071971c:
    lVar7 = *(long *)(unaff_x20 + 0x418);
    uVar11 = (uVar17 >> 4 ^ uVar17 >> 9) & lVar6 - 1U;
    uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
    if (uVar14 != *(ulong *)(unaff_x20 + 0x430)) {
      lVar13 = 1;
      do {
        if (uVar14 == uVar17) goto code_r0x0071977c;
        uVar11 = uVar11 + lVar13 & lVar6 - 1U;
        uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
        lVar13 = lVar13 + 1;
      } while (uVar14 != *(ulong *)(unaff_x20 + 0x430));
    }
    *(ulong *)(lVar7 + uVar11 * 0x10) = uVar17;
    *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x0071977c:
    *(undefined8 *)(lVar7 + uVar11 * 0x10 + 8) = uVar2;
  }
  func_0x00711dac(&uStack0000000000000078,unaff_x29 + -0x80);
  while (unaff_w26 = bVar16, *(int *)(unaff_x20 + 0x80) == 0x2c) {
    while( true ) {
      if (unaff_x21 != (long *)0x0) {
        func_0x00711dac(&uStack0000000000000048);
      }
      func_0x00710d48();
      if (*(int *)(unaff_x20 + 0x80) == 0x3e) {
        func_0x007181dc();
        goto LAB_00719e04;
      }
      in_stack_00000038 = unaff_x24[1];
      uStack0000000000000030 = *unaff_x24;
      if (*(int *)(unaff_x20 + 0x80) != 0x119) {
        func_0x0072415c();
        unaff_x25 = *(undefined8 *)(unaff_x20 + 0x128);
        goto code_r0x00719628;
      }
      unaff_x25 = *(undefined8 *)(unaff_x20 + 0x98);
      func_0x00710d48();
      iVar5 = *(int *)(unaff_x20 + 0x80);
      bVar16 = iVar5 == 0x106 | unaff_w26;
      if (iVar5 != 0x106 && (unaff_w26 & 1) == 0) goto code_r0x0071963c;
LAB_00719600:
      uVar2 = *unaff_x24;
      if (iVar5 == 0x106) {
        func_0x00710d48();
      }
      else {
        func_0x007181dc();
      }
      if ((in_stack_00000028._4_4_ == 0) || (*(int *)(unaff_x20 + 0x80) != 0x3d)) break;
      uVar18 = *(undefined8 *)(unaff_x20 + 0x84);
      func_0x00710d48();
      if ((*(int *)(unaff_x20 + 0x80) == 0x106) ||
         ((*(int *)(unaff_x20 + 0x80) == 0x119 &&
          (func_0x0070c3d0(unaff_x29 + -0x80,in_stack_00000008),
          *(int *)(unaff_x29 + -0x80) == 0x106)))) {
        uVar3 = func_0x0071bcec();
        uVar4 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
        uVar3 = func_0x00705e24(uVar4,&uStack0000000000000030,unaff_x25,uVar3);
        *(undefined8 *)(unaff_x29 + -0x80) = uVar3;
        if (*(char *)(unaff_x20 + 0x58) != '\0') {
          uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x18);
          func_0x00709668(uVar3,uVar2,uVar18,1);
          uVar17 = *(ulong *)(unaff_x29 + -0x80);
          lVar6 = *(long *)(unaff_x20 + 0x420);
          if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
            if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar17 != *(ulong *)(unaff_x20 + 0x430))) {
              uVar11 = 0;
              uVar14 = uVar17 >> 4 ^ uVar17 >> 9;
              do {
                uVar14 = uVar14 & lVar6 - 1U;
                uVar15 = *(ulong *)(*in_stack_00000020 + uVar14 * 0x10);
                if (uVar15 == uVar17) goto code_r0x0071989c;
                uVar11 = uVar11 + 1;
                uVar14 = uVar11 + uVar14;
              } while (uVar15 != *(ulong *)(unaff_x20 + 0x430) && uVar11 <= lVar6 - 1U);
            }
            func_0x006db93c(in_stack_00000020);
            lVar6 = *(long *)(unaff_x20 + 0x420);
          }
code_r0x0071989c:
          lVar7 = *(long *)(unaff_x20 + 0x418);
          uVar11 = (uVar17 >> 4 ^ uVar17 >> 9) & lVar6 - 1U;
          uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
          if (uVar14 != *(ulong *)(unaff_x20 + 0x430)) {
            lVar13 = 1;
            do {
              if (uVar14 == uVar17) goto code_r0x007198fc;
              uVar11 = uVar11 + lVar13 & lVar6 - 1U;
              uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
              lVar13 = lVar13 + 1;
            } while (uVar14 != *(ulong *)(unaff_x20 + 0x430));
          }
          *(ulong *)(lVar7 + uVar11 * 0x10) = uVar17;
          *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x007198fc:
          *(undefined8 *)(lVar7 + uVar11 * 0x10 + 8) = uVar3;
        }
        func_0x00711dac(&uStack0000000000000060,unaff_x29 + -0x80);
      }
      else {
        uVar1 = *(undefined4 *)(unaff_x20 + 0x114);
        uVar3 = *unaff_x24;
        *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24[1];
        *(undefined8 *)(unaff_x29 + -0x80) = uVar3;
        func_0x0071f5c8();
        lVar6 = extraout_x1;
        if (extraout_x1 == 0) {
          *(undefined4 *)(unaff_x20 + 0x114) = uVar1;
          lVar6 = func_0x0071cf0c();
          if (lVar6 != 0) {
            func_0x007181dc();
          }
          lVar6 = 0;
        }
        uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
        uVar3 = func_0x00705e24(uVar3,&uStack0000000000000030,unaff_x25,lVar6);
        *(undefined8 *)(unaff_x29 + -0x80) = uVar3;
        if (*(char *)(unaff_x20 + 0x58) != '\0') {
          uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x18);
          func_0x00709668(uVar3,uVar2,uVar18,1);
          uVar17 = *(ulong *)(unaff_x29 + -0x80);
          lVar6 = *(long *)(unaff_x20 + 0x420);
          if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
            if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar17 != *(ulong *)(unaff_x20 + 0x430))) {
              uVar11 = 0;
              uVar14 = uVar17 >> 4 ^ uVar17 >> 9;
              do {
                uVar14 = uVar14 & lVar6 - 1U;
                uVar15 = *(ulong *)(*in_stack_00000020 + uVar14 * 0x10);
                if (uVar15 == uVar17) goto code_r0x00719d78;
                uVar11 = uVar11 + 1;
                uVar14 = uVar11 + uVar14;
              } while (uVar15 != *(ulong *)(unaff_x20 + 0x430) && uVar11 <= lVar6 - 1U);
            }
            func_0x006db93c(in_stack_00000020);
            lVar6 = *(long *)(unaff_x20 + 0x420);
          }
code_r0x00719d78:
          lVar7 = *(long *)(unaff_x20 + 0x418);
          uVar11 = (uVar17 >> 4 ^ uVar17 >> 9) & lVar6 - 1U;
          uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
          if (uVar14 != *(ulong *)(unaff_x20 + 0x430)) {
            lVar13 = 1;
            do {
              if (uVar14 == uVar17) goto code_r0x00719dd8;
              uVar11 = uVar11 + lVar13 & lVar6 - 1U;
              uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
              lVar13 = lVar13 + 1;
            } while (uVar14 != *(ulong *)(unaff_x20 + 0x430));
          }
          *(ulong *)(lVar7 + uVar11 * 0x10) = uVar17;
          *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x00719dd8:
          *(undefined8 *)(lVar7 + uVar11 * 0x10 + 8) = uVar3;
        }
        func_0x00711dac(&uStack0000000000000060,unaff_x29 + -0x80);
      }
code_r0x00719bf4:
      unaff_x22 = 1;
      unaff_w26 = bVar16;
      if (*(int *)(unaff_x20 + 0x80) != 0x2c) goto LAB_00719e04;
    }
    if ((unaff_x22 & 1) != 0) {
      func_0x007181dc();
    }
    uVar18 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
    uVar18 = func_0x00705e24(uVar18,&uStack0000000000000030,unaff_x25,0);
    *(undefined8 *)(unaff_x29 + -0x80) = uVar18;
    if (*(char *)(unaff_x20 + 0x58) != '\0') {
      uVar18 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x18);
      func_0x00709668(uVar18,uVar2,0,0);
      uVar17 = *(ulong *)(unaff_x29 + -0x80);
      lVar6 = *(long *)(unaff_x20 + 0x420);
      if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
        if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar17 != *(ulong *)(unaff_x20 + 0x430))) {
          uVar11 = 0;
          uVar14 = uVar17 >> 4 ^ uVar17 >> 9;
          do {
            uVar14 = uVar14 & lVar6 - 1U;
            uVar15 = *(ulong *)(*in_stack_00000020 + uVar14 * 0x10);
            if (uVar15 == uVar17) goto code_r0x007199e8;
            uVar11 = uVar11 + 1;
            uVar14 = uVar11 + uVar14;
          } while (uVar15 != *(ulong *)(unaff_x20 + 0x430) && uVar11 <= lVar6 - 1U);
        }
        func_0x006db93c(in_stack_00000020);
        lVar6 = *(long *)(unaff_x20 + 0x420);
      }
code_r0x007199e8:
      lVar7 = *(long *)(unaff_x20 + 0x418);
      uVar11 = (uVar17 >> 4 ^ uVar17 >> 9) & lVar6 - 1U;
      uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
      if (uVar14 != *(ulong *)(unaff_x20 + 0x430)) {
        lVar13 = 1;
        do {
          if (uVar14 == uVar17) goto code_r0x00719a48;
          uVar11 = uVar11 + lVar13 & lVar6 - 1U;
          uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
          lVar13 = lVar13 + 1;
        } while (uVar14 != *(ulong *)(unaff_x20 + 0x430));
      }
      *(ulong *)(lVar7 + uVar11 * 0x10) = uVar17;
      *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x00719a48:
      *(undefined8 *)(lVar7 + uVar11 * 0x10 + 8) = uVar18;
    }
    func_0x00711dac(&uStack0000000000000060,unaff_x29 + -0x80);
  }
LAB_00719e04:
  if (unaff_x23 != (undefined8 *)0x0) {
    *unaff_x23 = *unaff_x24;
  }
  *(undefined4 *)(unaff_x29 + -0x80) = 0x3c;
  *(undefined8 *)(unaff_x29 + -0x7c) = in_stack_00000018;
  if (*(int *)(unaff_x20 + 0x80) == 0x3e) {
    func_0x00710d48();
  }
  else {
    func_0x00721808();
    func_0x007244d4();
  }
  uVar17 = in_stack_00000058;
  lVar6 = in_stack_00000050;
  if (unaff_x21 == (long *)0x0) goto code_r0x00719ecc;
  if (in_stack_00000058 == 0) {
    lVar7 = 0;
  }
  else {
    lVar13 = *uStack0000000000000048;
    lVar7 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),in_stack_00000058 << 3);
    if ((uVar17 < 8) || ((ulong)((lVar7 + lVar6 * -8) - lVar13) < 0x40)) {
      uVar11 = 0;
    }
    else {
      uVar11 = uVar17 & 0xfffffffffffffff8;
      puVar8 = (undefined8 *)(lVar7 + 0x20);
      puVar12 = (undefined8 *)(lVar6 * 8 + lVar13 + 0x20);
      uVar14 = uVar11;
      do {
        uVar2 = puVar12[-4];
        uVar3 = puVar12[-1];
        uVar18 = puVar12[-2];
        uVar19 = puVar12[1];
        uVar4 = *puVar12;
        uVar21 = puVar12[3];
        uVar20 = puVar12[2];
        puVar8[-3] = puVar12[-3];
        puVar8[-4] = uVar2;
        puVar8[-1] = uVar3;
        puVar8[-2] = uVar18;
        puVar8[1] = uVar19;
        *puVar8 = uVar4;
        puVar8[3] = uVar21;
        puVar8[2] = uVar20;
        uVar14 = uVar14 - 8;
        puVar8 = puVar8 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar14 != 0);
      if (uVar17 == uVar11) goto code_r0x00719ec8;
    }
    lVar9 = uVar17 - uVar11;
    puVar8 = (undefined8 *)(lVar13 + uVar11 * 8 + lVar6 * 8);
    puVar12 = (undefined8 *)(lVar7 + uVar11 * 8);
    do {
      *puVar12 = *puVar8;
      lVar9 = lVar9 + -1;
      puVar8 = puVar8 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar9 != 0);
  }
code_r0x00719ec8:
  *unaff_x21 = lVar7;
  unaff_x21[1] = uVar17;
code_r0x00719ecc:
  uVar17 = in_stack_00000088;
  lVar6 = in_stack_00000080;
  if (in_stack_00000088 == 0) {
    lVar7 = 0;
  }
  else {
    lVar13 = *uStack0000000000000078;
    lVar7 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),in_stack_00000088 << 3);
    if ((uVar17 < 8) || ((ulong)((lVar7 + lVar6 * -8) - lVar13) < 0x40)) {
      uVar11 = 0;
    }
    else {
      uVar11 = uVar17 & 0xfffffffffffffff8;
      puVar8 = (undefined8 *)(lVar7 + 0x20);
      puVar12 = (undefined8 *)(lVar6 * 8 + lVar13 + 0x20);
      uVar14 = uVar11;
      do {
        uVar2 = puVar12[-4];
        uVar3 = puVar12[-1];
        uVar18 = puVar12[-2];
        uVar19 = puVar12[1];
        uVar4 = *puVar12;
        uVar21 = puVar12[3];
        uVar20 = puVar12[2];
        puVar8[-3] = puVar12[-3];
        puVar8[-4] = uVar2;
        puVar8[-1] = uVar3;
        puVar8[-2] = uVar18;
        puVar8[1] = uVar19;
        *puVar8 = uVar4;
        puVar8[3] = uVar21;
        puVar8[2] = uVar20;
        uVar14 = uVar14 - 8;
        puVar8 = puVar8 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar14 != 0);
      if (uVar17 == uVar11) goto code_r0x00719f38;
    }
    lVar9 = uVar17 - uVar11;
    puVar8 = (undefined8 *)(lVar13 + uVar11 * 8 + lVar6 * 8);
    puVar12 = (undefined8 *)(lVar7 + uVar11 * 8);
    do {
      *puVar12 = *puVar8;
      lVar9 = lVar9 + -1;
      puVar8 = puVar8 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar9 != 0);
  }
code_r0x00719f38:
  uVar11 = in_stack_00000070;
  lVar6 = in_stack_00000068;
  if (in_stack_00000070 == 0) {
    lVar13 = 0;
  }
  else {
    lVar9 = *uStack0000000000000060;
    lVar13 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),in_stack_00000070 << 3);
    if ((uVar11 < 8) || (lVar10 = lVar6 * 8 + lVar9, (ulong)(lVar13 - lVar10) < 0x40)) {
      uVar14 = 0;
    }
    else {
      uVar14 = uVar11 & 0xfffffffffffffff8;
      puVar8 = (undefined8 *)(lVar13 + 0x20);
      puVar12 = (undefined8 *)(lVar10 + 0x20);
      uVar15 = uVar14;
      do {
        uVar2 = puVar12[-4];
        uVar3 = puVar12[-1];
        uVar18 = puVar12[-2];
        uVar19 = puVar12[1];
        uVar4 = *puVar12;
        uVar21 = puVar12[3];
        uVar20 = puVar12[2];
        puVar8[-3] = puVar12[-3];
        puVar8[-4] = uVar2;
        puVar8[-1] = uVar3;
        puVar8[-2] = uVar18;
        puVar8[1] = uVar19;
        *puVar8 = uVar4;
        puVar8[3] = uVar21;
        puVar8[2] = uVar20;
        uVar15 = uVar15 - 8;
        puVar8 = puVar8 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar15 != 0);
      if (uVar11 == uVar14) goto code_r0x00719fa0;
    }
    lVar10 = uVar11 - uVar14;
    puVar8 = (undefined8 *)(lVar9 + uVar14 * 8 + lVar6 * 8);
    puVar12 = (undefined8 *)(lVar13 + uVar14 * 8);
    do {
      *puVar12 = *puVar8;
      lVar10 = lVar10 + -1;
      puVar8 = puVar8 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar10 != 0);
  }
code_r0x00719fa0:
  *unaff_x19 = lVar7;
  unaff_x19[1] = uVar17;
  unaff_x19[2] = lVar13;
  unaff_x19[3] = uVar11;
  lVar6 = *uStack0000000000000048 + in_stack_00000050 * 8;
  if (lVar6 != uStack0000000000000048[1]) {
    uStack0000000000000048[1] = lVar6;
  }
  lVar6 = *uStack0000000000000060 + in_stack_00000068 * 8;
  if (lVar6 != uStack0000000000000060[1]) {
    uStack0000000000000060[1] = lVar6;
  }
  lVar6 = *uStack0000000000000078 + in_stack_00000080 * 8;
  if (lVar6 != uStack0000000000000078[1]) {
    uStack0000000000000078[1] = lVar6;
  }
  return;
  while( true ) {
    uVar11 = uVar11 + 1;
    uVar14 = uVar11 + uVar14;
    if (uVar15 == *(ulong *)(unaff_x20 + 0x430) || lVar6 - 1U < uVar11) break;
code_r0x00719b4c:
    uVar14 = uVar14 & lVar6 - 1U;
    uVar15 = *(ulong *)(*in_stack_00000020 + uVar14 * 0x10);
    if (uVar15 == uVar17) goto code_r0x00719b80;
  }
code_r0x00719b74:
  func_0x006db93c(in_stack_00000020);
  lVar6 = *(long *)(unaff_x20 + 0x420);
code_r0x00719b80:
  lVar7 = *(long *)(unaff_x20 + 0x418);
  uVar11 = (uVar17 >> 4 ^ uVar17 >> 9) & lVar6 - 1U;
  uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
  if (uVar14 != *(ulong *)(unaff_x20 + 0x430)) {
    lVar13 = 1;
    do {
      if (uVar14 == uVar17) goto code_r0x00719be0;
      uVar11 = uVar11 + lVar13 & lVar6 - 1U;
      uVar14 = *(ulong *)(lVar7 + uVar11 * 0x10);
      lVar13 = lVar13 + 1;
    } while (uVar14 != *(ulong *)(unaff_x20 + 0x430));
  }
  *(ulong *)(lVar7 + uVar11 * 0x10) = uVar17;
  *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x00719be0:
  *(undefined8 *)(lVar7 + uVar11 * 0x10 + 8) = uVar18;
code_r0x00719be8:
  func_0x00711dac(&uStack0000000000000078,unaff_x29 + -0x80);
  goto code_r0x00719bf4;
}

