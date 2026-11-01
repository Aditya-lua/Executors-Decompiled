
void FUN_0071974c(long param_1)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long extraout_x1;
  int iVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong in_x9;
  long lVar10;
  long lVar11;
  ulong in_x10;
  undefined8 *puVar12;
  ulong in_x11;
  long in_x12;
  ulong uVar13;
  ulong uVar14;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long lVar15;
  undefined8 uVar16;
  undefined8 unaff_x25;
  byte unaff_w26;
  byte bVar17;
  ulong unaff_x27;
  undefined8 uVar18;
  undefined8 uVar19;
  long unaff_x29;
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
  
code_r0x0071974c:
  in_x9 = in_x9 + in_x12 & in_x10;
  uVar13 = *(ulong *)(param_1 + in_x9 * 0x10);
  in_x12 = in_x12 + 1;
  if (uVar13 != in_x11) goto LAB_00719744;
code_r0x00719768:
  *(ulong *)(param_1 + in_x9 * 0x10) = unaff_x27;
  *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x0071977c:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x25;
code_r0x00719784:
  func_0x00711dac(&uStack0000000000000078,unaff_x29 + -0x80);
LAB_00719a5c:
  bVar17 = unaff_w26;
  if (*(int *)(unaff_x20 + 0x80) == 0x2c) {
    do {
      if (unaff_x21 != (long *)0x0) {
        func_0x00711dac(&uStack0000000000000048);
      }
      func_0x00710d48();
      if (*(int *)(unaff_x20 + 0x80) == 0x3e) {
        func_0x007181dc();
        break;
      }
      in_stack_00000038 = unaff_x24[1];
      uStack0000000000000030 = *unaff_x24;
      if (*(int *)(unaff_x20 + 0x80) == 0x119) {
        uVar16 = *(undefined8 *)(unaff_x20 + 0x98);
        func_0x00710d48();
        iVar5 = *(int *)(unaff_x20 + 0x80);
        unaff_w26 = iVar5 == 0x106 | bVar17;
        if (iVar5 == 0x106 || (bVar17 & 1) != 0) goto code_r0x00719600;
code_r0x0071963c:
        if (iVar5 != 0x3d || in_stack_00000028._4_4_ == 0) {
          if ((unaff_x22 & 1) != 0) {
            func_0x007181dc();
          }
          uVar19 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
          uVar16 = func_0x00705d98(uVar19,&uStack0000000000000030,uVar16,0);
          *(undefined8 *)(unaff_x29 + -0x80) = uVar16;
          if (*(char *)(unaff_x20 + 0x58) == '\0') goto code_r0x00719784;
          unaff_x25 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x10);
          func_0x00709650(unaff_x25,0,0);
          unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
          lVar6 = *(long *)(unaff_x20 + 0x420);
          if (*(ulong *)(unaff_x20 + 0x428) < (ulong)(lVar6 * 3) >> 2) goto code_r0x0071971c;
          if ((*(ulong *)(unaff_x20 + 0x428) == 0) || (unaff_x27 == *(ulong *)(unaff_x20 + 0x430)))
          goto code_r0x00719710;
          uVar13 = 0;
          uVar8 = unaff_x27 >> 4 ^ unaff_x27 >> 9;
          goto code_r0x007196e8;
        }
        uVar19 = *(undefined8 *)(unaff_x20 + 0x84);
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
        uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
        uVar16 = func_0x00705d98(uVar2,&uStack0000000000000030,uVar16,uVar18);
        *(undefined8 *)(unaff_x29 + -0x80) = uVar16;
        if (*(char *)(unaff_x20 + 0x58) != '\0') {
          uVar16 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x10);
          func_0x00709650(uVar16,uVar19,1);
          uVar13 = *(ulong *)(unaff_x29 + -0x80);
          lVar6 = *(long *)(unaff_x20 + 0x420);
          if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
            if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar13 != *(ulong *)(unaff_x20 + 0x430))) {
              uVar8 = 0;
              uVar7 = uVar13 >> 4 ^ uVar13 >> 9;
              do {
                uVar7 = uVar7 & lVar6 - 1U;
                uVar14 = *(ulong *)(*in_stack_00000020 + uVar7 * 0x10);
                if (uVar14 == uVar13) goto code_r0x00719b80;
                uVar8 = uVar8 + 1;
                uVar7 = uVar8 + uVar7;
              } while (uVar14 != *(ulong *)(unaff_x20 + 0x430) && uVar8 <= lVar6 - 1U);
            }
            func_0x006db93c(in_stack_00000020);
            lVar6 = *(long *)(unaff_x20 + 0x420);
          }
code_r0x00719b80:
          lVar4 = *(long *)(unaff_x20 + 0x418);
          uVar8 = (uVar13 >> 4 ^ uVar13 >> 9) & lVar6 - 1U;
          uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
          if (uVar7 != *(ulong *)(unaff_x20 + 0x430)) {
            lVar15 = 1;
            do {
              if (uVar7 == uVar13) goto code_r0x00719be0;
              uVar8 = uVar8 + lVar15 & lVar6 - 1U;
              uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
              lVar15 = lVar15 + 1;
            } while (uVar7 != *(ulong *)(unaff_x20 + 0x430));
          }
          *(ulong *)(lVar4 + uVar8 * 0x10) = uVar13;
          *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x00719be0:
          *(undefined8 *)(lVar4 + uVar8 * 0x10 + 8) = uVar16;
        }
        func_0x00711dac(&uStack0000000000000078,unaff_x29 + -0x80);
      }
      else {
        func_0x0072415c();
        uVar16 = *(undefined8 *)(unaff_x20 + 0x128);
        iVar5 = *(int *)(unaff_x20 + 0x80);
        unaff_w26 = iVar5 == 0x106 | bVar17;
        if (iVar5 != 0x106 && (bVar17 & 1) == 0) goto code_r0x0071963c;
code_r0x00719600:
        uVar19 = *unaff_x24;
        if (iVar5 == 0x106) {
          func_0x00710d48();
        }
        else {
          func_0x007181dc();
        }
        if ((in_stack_00000028._4_4_ == 0) || (*(int *)(unaff_x20 + 0x80) != 0x3d))
        goto code_r0x00719914;
        uVar18 = *(undefined8 *)(unaff_x20 + 0x84);
        func_0x00710d48();
        if ((*(int *)(unaff_x20 + 0x80) == 0x106) ||
           ((*(int *)(unaff_x20 + 0x80) == 0x119 &&
            (func_0x0070c3d0(unaff_x29 + -0x80,in_stack_00000008),
            *(int *)(unaff_x29 + -0x80) == 0x106)))) {
          uVar2 = func_0x0071bcec();
          uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
          uVar16 = func_0x00705e24(uVar3,&uStack0000000000000030,uVar16,uVar2);
          *(undefined8 *)(unaff_x29 + -0x80) = uVar16;
          if (*(char *)(unaff_x20 + 0x58) != '\0') {
            uVar16 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x18);
            func_0x00709668(uVar16,uVar19,uVar18,1);
            uVar13 = *(ulong *)(unaff_x29 + -0x80);
            lVar6 = *(long *)(unaff_x20 + 0x420);
            if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
              if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar13 != *(ulong *)(unaff_x20 + 0x430)))
              {
                uVar8 = 0;
                uVar7 = uVar13 >> 4 ^ uVar13 >> 9;
                do {
                  uVar7 = uVar7 & lVar6 - 1U;
                  uVar14 = *(ulong *)(*in_stack_00000020 + uVar7 * 0x10);
                  if (uVar14 == uVar13) goto code_r0x0071989c;
                  uVar8 = uVar8 + 1;
                  uVar7 = uVar8 + uVar7;
                } while (uVar14 != *(ulong *)(unaff_x20 + 0x430) && uVar8 <= lVar6 - 1U);
              }
              func_0x006db93c(in_stack_00000020);
              lVar6 = *(long *)(unaff_x20 + 0x420);
            }
code_r0x0071989c:
            lVar4 = *(long *)(unaff_x20 + 0x418);
            uVar8 = (uVar13 >> 4 ^ uVar13 >> 9) & lVar6 - 1U;
            uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
            if (uVar7 != *(ulong *)(unaff_x20 + 0x430)) {
              lVar15 = 1;
              do {
                if (uVar7 == uVar13) goto code_r0x007198fc;
                uVar8 = uVar8 + lVar15 & lVar6 - 1U;
                uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
                lVar15 = lVar15 + 1;
              } while (uVar7 != *(ulong *)(unaff_x20 + 0x430));
            }
            *(ulong *)(lVar4 + uVar8 * 0x10) = uVar13;
            *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x007198fc:
            *(undefined8 *)(lVar4 + uVar8 * 0x10 + 8) = uVar16;
          }
          func_0x00711dac(&uStack0000000000000060,unaff_x29 + -0x80);
        }
        else {
          uVar1 = *(undefined4 *)(unaff_x20 + 0x114);
          uVar2 = *unaff_x24;
          *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24[1];
          *(undefined8 *)(unaff_x29 + -0x80) = uVar2;
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
          uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
          uVar16 = func_0x00705e24(uVar2,&uStack0000000000000030,uVar16,lVar6);
          *(undefined8 *)(unaff_x29 + -0x80) = uVar16;
          if (*(char *)(unaff_x20 + 0x58) != '\0') {
            uVar16 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x18);
            func_0x00709668(uVar16,uVar19,uVar18,1);
            uVar13 = *(ulong *)(unaff_x29 + -0x80);
            lVar6 = *(long *)(unaff_x20 + 0x420);
            if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
              if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar13 != *(ulong *)(unaff_x20 + 0x430)))
              {
                uVar8 = 0;
                uVar7 = uVar13 >> 4 ^ uVar13 >> 9;
                do {
                  uVar7 = uVar7 & lVar6 - 1U;
                  uVar14 = *(ulong *)(*in_stack_00000020 + uVar7 * 0x10);
                  if (uVar14 == uVar13) goto code_r0x00719d78;
                  uVar8 = uVar8 + 1;
                  uVar7 = uVar8 + uVar7;
                } while (uVar14 != *(ulong *)(unaff_x20 + 0x430) && uVar8 <= lVar6 - 1U);
              }
              func_0x006db93c(in_stack_00000020);
              lVar6 = *(long *)(unaff_x20 + 0x420);
            }
code_r0x00719d78:
            lVar4 = *(long *)(unaff_x20 + 0x418);
            uVar8 = (uVar13 >> 4 ^ uVar13 >> 9) & lVar6 - 1U;
            uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
            if (uVar7 != *(ulong *)(unaff_x20 + 0x430)) {
              lVar15 = 1;
              do {
                if (uVar7 == uVar13) goto code_r0x00719dd8;
                uVar8 = uVar8 + lVar15 & lVar6 - 1U;
                uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
                lVar15 = lVar15 + 1;
              } while (uVar7 != *(ulong *)(unaff_x20 + 0x430));
            }
            *(ulong *)(lVar4 + uVar8 * 0x10) = uVar13;
            *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x00719dd8:
            *(undefined8 *)(lVar4 + uVar8 * 0x10 + 8) = uVar16;
          }
          func_0x00711dac(&uStack0000000000000060,unaff_x29 + -0x80);
        }
      }
      unaff_x22 = 1;
      bVar17 = unaff_w26;
      if (*(int *)(unaff_x20 + 0x80) != 0x2c) break;
    } while( true );
  }
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
  uVar13 = in_stack_00000058;
  lVar6 = in_stack_00000050;
  if (unaff_x21 == (long *)0x0) goto code_r0x00719ecc;
  if (in_stack_00000058 == 0) {
    lVar4 = 0;
    goto code_r0x00719ec8;
  }
  lVar15 = *uStack0000000000000048;
  lVar4 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),in_stack_00000058 << 3);
  if ((uVar13 < 8) || ((ulong)((lVar4 + lVar6 * -8) - lVar15) < 0x40)) {
    uVar7 = 0;
    goto code_r0x00719e9c;
  }
  uVar7 = uVar13 & 0xfffffffffffffff8;
  puVar9 = (undefined8 *)(lVar4 + 0x20);
  puVar12 = (undefined8 *)(lVar6 * 8 + lVar15 + 0x20);
  uVar8 = uVar7;
  do {
    uVar16 = puVar12[-4];
    uVar18 = puVar12[-1];
    uVar19 = puVar12[-2];
    uVar3 = puVar12[1];
    uVar2 = *puVar12;
    uVar21 = puVar12[3];
    uVar20 = puVar12[2];
    puVar9[-3] = puVar12[-3];
    puVar9[-4] = uVar16;
    puVar9[-1] = uVar18;
    puVar9[-2] = uVar19;
    puVar9[1] = uVar3;
    *puVar9 = uVar2;
    puVar9[3] = uVar21;
    puVar9[2] = uVar20;
    uVar8 = uVar8 - 8;
    puVar9 = puVar9 + 8;
    puVar12 = puVar12 + 8;
  } while (uVar8 != 0);
  if (uVar13 != uVar7) {
code_r0x00719e9c:
    lVar10 = uVar13 - uVar7;
    puVar9 = (undefined8 *)(lVar15 + uVar7 * 8 + lVar6 * 8);
    puVar12 = (undefined8 *)(lVar4 + uVar7 * 8);
    do {
      *puVar12 = *puVar9;
      lVar10 = lVar10 + -1;
      puVar9 = puVar9 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar10 != 0);
  }
code_r0x00719ec8:
  *unaff_x21 = lVar4;
  unaff_x21[1] = uVar13;
code_r0x00719ecc:
  uVar13 = in_stack_00000088;
  lVar6 = in_stack_00000080;
  if (in_stack_00000088 == 0) {
    lVar4 = 0;
  }
  else {
    lVar15 = *uStack0000000000000078;
    lVar4 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),in_stack_00000088 << 3);
    if ((uVar13 < 8) || ((ulong)((lVar4 + lVar6 * -8) - lVar15) < 0x40)) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar13 & 0xfffffffffffffff8;
      puVar9 = (undefined8 *)(lVar4 + 0x20);
      puVar12 = (undefined8 *)(lVar6 * 8 + lVar15 + 0x20);
      uVar7 = uVar8;
      do {
        uVar16 = puVar12[-4];
        uVar18 = puVar12[-1];
        uVar19 = puVar12[-2];
        uVar3 = puVar12[1];
        uVar2 = *puVar12;
        uVar21 = puVar12[3];
        uVar20 = puVar12[2];
        puVar9[-3] = puVar12[-3];
        puVar9[-4] = uVar16;
        puVar9[-1] = uVar18;
        puVar9[-2] = uVar19;
        puVar9[1] = uVar3;
        *puVar9 = uVar2;
        puVar9[3] = uVar21;
        puVar9[2] = uVar20;
        uVar7 = uVar7 - 8;
        puVar9 = puVar9 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar7 != 0);
      if (uVar13 == uVar8) goto code_r0x00719f38;
    }
    lVar10 = uVar13 - uVar8;
    puVar9 = (undefined8 *)(lVar15 + uVar8 * 8 + lVar6 * 8);
    puVar12 = (undefined8 *)(lVar4 + uVar8 * 8);
    do {
      *puVar12 = *puVar9;
      lVar10 = lVar10 + -1;
      puVar9 = puVar9 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar10 != 0);
  }
code_r0x00719f38:
  uVar8 = in_stack_00000070;
  lVar6 = in_stack_00000068;
  if (in_stack_00000070 == 0) {
    lVar15 = 0;
  }
  else {
    lVar10 = *uStack0000000000000060;
    lVar15 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),in_stack_00000070 << 3);
    if ((uVar8 < 8) || (lVar11 = lVar6 * 8 + lVar10, (ulong)(lVar15 - lVar11) < 0x40)) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar8 & 0xfffffffffffffff8;
      puVar9 = (undefined8 *)(lVar15 + 0x20);
      puVar12 = (undefined8 *)(lVar11 + 0x20);
      uVar14 = uVar7;
      do {
        uVar16 = puVar12[-4];
        uVar18 = puVar12[-1];
        uVar19 = puVar12[-2];
        uVar3 = puVar12[1];
        uVar2 = *puVar12;
        uVar21 = puVar12[3];
        uVar20 = puVar12[2];
        puVar9[-3] = puVar12[-3];
        puVar9[-4] = uVar16;
        puVar9[-1] = uVar18;
        puVar9[-2] = uVar19;
        puVar9[1] = uVar3;
        *puVar9 = uVar2;
        puVar9[3] = uVar21;
        puVar9[2] = uVar20;
        uVar14 = uVar14 - 8;
        puVar9 = puVar9 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar14 != 0);
      if (uVar8 == uVar7) goto code_r0x00719fa0;
    }
    lVar11 = uVar8 - uVar7;
    puVar9 = (undefined8 *)(lVar10 + uVar7 * 8 + lVar6 * 8);
    puVar12 = (undefined8 *)(lVar15 + uVar7 * 8);
    do {
      *puVar12 = *puVar9;
      lVar11 = lVar11 + -1;
      puVar9 = puVar9 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar11 != 0);
  }
code_r0x00719fa0:
  *unaff_x19 = lVar4;
  unaff_x19[1] = uVar13;
  unaff_x19[2] = lVar15;
  unaff_x19[3] = uVar8;
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
    uVar13 = uVar13 + 1;
    uVar8 = uVar13 + uVar8;
    if (uVar7 == *(ulong *)(unaff_x20 + 0x430) || lVar6 - 1U < uVar13) break;
code_r0x007196e8:
    uVar8 = uVar8 & lVar6 - 1U;
    uVar7 = *(ulong *)(*in_stack_00000020 + uVar8 * 0x10);
    if (uVar7 == unaff_x27) goto code_r0x0071971c;
  }
code_r0x00719710:
  func_0x006db93c(in_stack_00000020);
  lVar6 = *(long *)(unaff_x20 + 0x420);
code_r0x0071971c:
  in_x10 = lVar6 - 1;
  param_1 = *(long *)(unaff_x20 + 0x418);
  in_x11 = *(ulong *)(unaff_x20 + 0x430);
  in_x9 = (unaff_x27 >> 4 ^ unaff_x27 >> 9) & in_x10;
  uVar13 = *(ulong *)(param_1 + in_x9 * 0x10);
  if (uVar13 == in_x11) goto code_r0x00719768;
  in_x12 = 1;
LAB_00719744:
  if (uVar13 != unaff_x27) goto code_r0x0071974c;
  goto code_r0x0071977c;
code_r0x00719914:
  if ((unaff_x22 & 1) != 0) {
    func_0x007181dc();
  }
  uVar18 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x30);
  uVar16 = func_0x00705e24(uVar18,&uStack0000000000000030,uVar16,0);
  *(undefined8 *)(unaff_x29 + -0x80) = uVar16;
  if (*(char *)(unaff_x20 + 0x58) != '\0') {
    uVar16 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x18);
    func_0x00709668(uVar16,uVar19,0,0);
    uVar13 = *(ulong *)(unaff_x29 + -0x80);
    lVar6 = *(long *)(unaff_x20 + 0x420);
    if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x428)) {
      if ((*(ulong *)(unaff_x20 + 0x428) != 0) && (uVar13 != *(ulong *)(unaff_x20 + 0x430))) {
        uVar8 = 0;
        uVar7 = uVar13 >> 4 ^ uVar13 >> 9;
        do {
          uVar7 = uVar7 & lVar6 - 1U;
          uVar14 = *(ulong *)(*in_stack_00000020 + uVar7 * 0x10);
          if (uVar14 == uVar13) goto code_r0x007199e8;
          uVar8 = uVar8 + 1;
          uVar7 = uVar8 + uVar7;
        } while (uVar14 != *(ulong *)(unaff_x20 + 0x430) && uVar8 <= lVar6 - 1U);
      }
      func_0x006db93c(in_stack_00000020);
      lVar6 = *(long *)(unaff_x20 + 0x420);
    }
code_r0x007199e8:
    lVar4 = *(long *)(unaff_x20 + 0x418);
    uVar8 = (uVar13 >> 4 ^ uVar13 >> 9) & lVar6 - 1U;
    uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
    if (uVar7 != *(ulong *)(unaff_x20 + 0x430)) {
      lVar15 = 1;
      do {
        if (uVar7 == uVar13) goto code_r0x00719a48;
        uVar8 = uVar8 + lVar15 & lVar6 - 1U;
        uVar7 = *(ulong *)(lVar4 + uVar8 * 0x10);
        lVar15 = lVar15 + 1;
      } while (uVar7 != *(ulong *)(unaff_x20 + 0x430));
    }
    *(ulong *)(lVar4 + uVar8 * 0x10) = uVar13;
    *(long *)(unaff_x20 + 0x428) = *(long *)(unaff_x20 + 0x428) + 1;
code_r0x00719a48:
    *(undefined8 *)(lVar4 + uVar8 * 0x10 + 8) = uVar16;
  }
  func_0x00711dac(&uStack0000000000000060,unaff_x29 + -0x80);
  goto LAB_00719a5c;
}

