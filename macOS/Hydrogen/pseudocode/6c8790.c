
/* WARNING: Possible PIC construction at 0x006c8524: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006caff0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006c8528) */
/* WARNING: Removing unreachable block (ram,0x006c8560) */
/* WARNING: Removing unreachable block (ram,0x006c8574) */
/* WARNING: Removing unreachable block (ram,0x006c8580) */
/* WARNING: Removing unreachable block (ram,0x006c89ec) */
/* WARNING: Removing unreachable block (ram,0x006c8594) */
/* WARNING: Removing unreachable block (ram,0x006c859c) */
/* WARNING: Removing unreachable block (ram,0x006c85a4) */
/* WARNING: Removing unreachable block (ram,0x006caff4) */

void FUN_006c8790(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 ulong param_5)

{
  undefined4 *puVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  uint *puVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  int iVar8;
  int iVar9;
  ulong uVar10;
  ulong uVar11;
  uint uVar12;
  long lVar13;
  uint *puVar14;
  undefined4 *puVar15;
  long in_x9;
  int in_w10;
  ulong in_x11;
  uint *puVar16;
  long in_x12;
  ulong in_x13;
  int in_w14;
  undefined8 *puVar17;
  undefined8 *puVar18;
  int in_w15;
  int in_w16;
  ulong uVar19;
  ulong uVar20;
  long unaff_x19;
  uint *puVar21;
  undefined4 *puVar22;
  undefined4 *puVar23;
  uint *unaff_x20;
  uint *puVar24;
  undefined4 *puVar25;
  uint *unaff_x21;
  uint *unaff_x22;
  long lVar26;
  long unaff_x24;
  ulong unaff_x25;
  uint *puVar27;
  uint *unaff_x26;
  undefined1 *unaff_x29;
  undefined *puVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined1 auVar35 [12];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  uint *in_stack_00000040;
  undefined8 in_stack_00000048;
  uint *in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  undefined1 uStack0000000000000070;
  
  puVar27 = uStack0000000000000020;
  uVar19 = param_1;
  if ((param_1 == 0) || (in_w16 != in_w10)) {
    do {
      if ((in_w16 != iRam0000000000a27a48) && (in_w16 != iRam0000000000a27b38)) goto LAB_006c8938;
      uVar19 = *(ulong *)(uVar19 + 0x20);
      in_w16 = *(int *)(uVar19 + 8);
    } while (uVar19 == 0 || in_w16 != in_w10);
  }
  uVar19 = *(ulong *)(uVar19 + 0x20);
  if (uVar19 != in_x11) {
    uVar20 = 0;
    uVar10 = uVar19 >> 4 ^ uVar19 >> 9;
    do {
      uVar10 = uVar10 & in_x13;
      uVar11 = *(ulong *)(in_x12 + uVar10 * 0x18);
      if (uVar11 == uVar19) {
        if (*(char *)(in_x12 + uVar10 * 0x18 + 9) != '\0') goto LAB_006c89a8;
        break;
      }
      uVar20 = uVar20 + 1;
      uVar10 = uVar20 + uVar10;
    } while (uVar11 != in_x11 && uVar20 <= in_x13);
  }
LAB_006c8938:
  if ((in_x9 != 0) && (*(ulong *)(unaff_x20 + 0x46) != param_1)) {
    uVar19 = 0;
    uVar20 = param_1 >> 4 ^ param_1 >> 9;
    do {
      uVar20 = uVar20 & *(long *)(unaff_x20 + 0x42) - 1U;
      uVar10 = *(ulong *)(*(long *)(unaff_x20 + 0x40) + uVar20 * 0x20);
      if (uVar10 == param_1) {
        if (*(int *)(*(long *)(unaff_x20 + 0x40) + uVar20 * 0x20 + 8) != 0) goto LAB_006c89a8;
        break;
      }
      uVar19 = uVar19 + 1;
      uVar20 = uVar19 + uVar20;
    } while (uVar10 != *(ulong *)(unaff_x20 + 0x46) && uVar19 <= *(long *)(unaff_x20 + 0x42) - 1U);
  }
  lVar13 = *(long *)(unaff_x19 + 0x40);
  iVar8 = *(int *)(lVar13 + 8);
  if (lVar13 == 0 || iVar8 != in_w10) {
    do {
      if ((iVar8 != iRam0000000000a27a48) && (iVar8 != iRam0000000000a27b38)) goto code_r0x006c84d8;
      lVar13 = *(long *)(lVar13 + 0x20);
      iVar8 = *(int *)(lVar13 + 8);
    } while (lVar13 == 0 || iVar8 != in_w10);
  }
  uVar19 = *(ulong *)(lVar13 + 0x20);
  if (uVar19 != in_x11) {
    uVar20 = 0;
    uVar10 = uVar19 >> 4 ^ uVar19 >> 9;
    do {
      uVar10 = uVar10 & in_x13;
      uVar11 = *(ulong *)(in_x12 + uVar10 * 0x18);
      if (uVar11 == uVar19) {
        if ((*(char *)(in_x12 + uVar10 * 0x18 + 9) != '\0') &&
           ((uint)param_4 == (uint)*(byte *)(in_x12 + uVar10 * 0x18 + 8))) {
          uVar19 = param_5;
          if (in_w15 != 0) goto code_r0x006c8840;
          goto code_r0x006c8854;
        }
        break;
      }
      uVar20 = uVar20 + 1;
      uVar10 = uVar20 + uVar10;
    } while (uVar11 != in_x11 && uVar20 <= in_x13);
  }
  goto code_r0x006c84d8;
LAB_006c89a8:
  uVar7 = 0;
  goto LAB_006c89cc;
code_r0x006c89c4:
  uVar7 = 1;
  param_1 = param_5;
LAB_006c89cc:
  puVar18 = &uStack0000000000000020;
  puVar17 = &uStack0000000000000060;
  uVar2 = func_0x006cad00();
  if (uVar2 < 0x100) {
    unaff_x19 = *(long *)unaff_x20;
    uVar12 = 0x2f;
    if ((int)uVar7 == 0) {
      uVar12 = 0x30;
    }
    uVar2 = uVar2 & 0xff;
    puVar18 = (undefined8 *)&uStack0000000000000070;
    uVar7 = in_stack_00000048;
    unaff_x22 = in_stack_00000040;
    puVar17 = uStack0000000000000060;
    puVar28 = in_stack_00000068;
  }
  else {
    uStack0000000000000020 = unaff_x20;
    uVar2 = func_0x006c5ed4(unaff_x20,param_1,&uStack0000000000000020);
    unaff_x19 = *(long *)unaff_x20;
    uVar12 = 0x2d;
    if ((int)uVar7 == 0) {
      uVar12 = 0x2e;
    }
    puVar28 = &UNK_006caff4;
    in_stack_00000058 = param_4;
    in_stack_00000050 = unaff_x21;
    unaff_x22 = unaff_x20;
    in_stack_00000038 = param_1;
  }
  register0x00000008 = (BADSPACEBASE *)((long)puVar18 + -0x50);
  *(uint **)((long)puVar18 + -0x50) = puVar27;
  *(undefined8 *)((long)puVar18 + -0x48) = in_stack_00000028;
  *(undefined8 *)((long)puVar18 + -0x40) = in_stack_00000030;
  *(ulong *)((long)puVar18 + -0x38) = in_stack_00000038;
  *(uint **)((long)puVar18 + -0x30) = unaff_x22;
  *(undefined8 *)((long)puVar18 + -0x28) = uVar7;
  *(uint **)((long)puVar18 + -0x20) = in_stack_00000050;
  *(undefined8 *)((long)puVar18 + -0x18) = in_stack_00000058;
  *(undefined8 **)((long)puVar18 + -0x10) = puVar17;
  *(undefined **)((long)puVar18 + -8) = puVar28;
  unaff_x29 = (undefined1 *)((long)puVar18 + -0x10);
  uVar2 = uVar12 | (int)unaff_x21 << 8 | (uint)param_4 << 0x10 | uVar2 << 0x18;
  unaff_x25 = (ulong)uVar2;
  puVar16 = *(uint **)(unaff_x19 + 0x30);
  if (puVar16 < *(uint **)(unaff_x19 + 0x38)) {
    unaff_x22 = puVar16 + 1;
    *puVar16 = uVar2;
code_r0x006b1e28:
    iVar8 = (int)unaff_x21;
    iVar9 = (int)param_4;
    *(uint **)(unaff_x19 + 0x30) = unaff_x22;
    puVar16 = *(uint **)(unaff_x19 + 0x48);
    if (puVar16 < *(uint **)(unaff_x19 + 0x50)) {
      puVar27 = puVar16 + 1;
      *puVar16 = *(uint *)(unaff_x19 + 0x1b8);
      goto code_r0x006b1f50;
    }
    unaff_x20 = *(uint **)(unaff_x19 + 0x40);
    unaff_x24 = (long)puVar16 - (long)unaff_x20;
    puVar5 = (uint *)(unaff_x24 >> 2);
    puVar14 = (uint *)((long)puVar5 + 1);
    if ((ulong)puVar14 >> 0x3e == 0) {
      uVar19 = (long)*(uint **)(unaff_x19 + 0x50) - (long)unaff_x20;
      unaff_x22 = (uint *)((long)uVar19 >> 1);
      if (unaff_x22 <= puVar14) {
        unaff_x22 = puVar14;
      }
      if (0x7ffffffffffffffb < uVar19) {
        unaff_x22 = (uint *)0x3fffffffffffffff;
      }
      if (unaff_x22 == (uint *)0x0) {
        lVar13 = 0;
      }
      else {
        if ((ulong)unaff_x22 >> 0x3e != 0) goto code_r0x006b1f6c;
        lVar13 = __Znwm((long)unaff_x22 << 2);
      }
      puVar14 = (uint *)(lVar13 + (long)puVar5 * 4);
      puVar27 = puVar14 + 1;
      *puVar14 = *(uint *)(unaff_x19 + 0x1b8);
      if ((long)puVar16 - (long)unaff_x20 != 0) {
        uVar19 = ((long)puVar16 - (long)unaff_x20) - 4;
        puVar21 = puVar16;
        if ((0x3b < uVar19) && (0x3f < (ulong)((long)puVar16 + (-unaff_x24 - lVar13)))) {
          uVar19 = (uVar19 >> 2) + 1;
          uVar10 = uVar19 & 0x7ffffffffffffff0;
          puVar21 = puVar16 + -uVar10;
          puVar14 = puVar14 + -uVar10;
          puVar16 = puVar16 + -8;
          puVar17 = (undefined8 *)(lVar13 + (long)puVar5 * 4 + -0x20);
          uVar20 = uVar10;
          do {
            uVar30 = *(undefined8 *)puVar16;
            uVar29 = *(undefined8 *)(puVar16 + 6);
            uVar7 = *(undefined8 *)(puVar16 + 4);
            uVar34 = *(undefined8 *)(puVar16 + -6);
            uVar33 = *(undefined8 *)(puVar16 + -8);
            uVar32 = *(undefined8 *)(puVar16 + -2);
            uVar31 = *(undefined8 *)(puVar16 + -4);
            puVar17[1] = *(undefined8 *)(puVar16 + 2);
            *puVar17 = uVar30;
            puVar17[3] = uVar29;
            puVar17[2] = uVar7;
            puVar17[-3] = uVar34;
            puVar17[-4] = uVar33;
            puVar17[-1] = uVar32;
            puVar17[-2] = uVar31;
            puVar16 = puVar16 + -0x10;
            puVar17 = puVar17 + -8;
            uVar20 = uVar20 - 0x10;
          } while (uVar20 != 0);
          if (uVar19 == uVar10) goto code_r0x006b1f3c;
        }
        do {
          puVar21 = puVar21 + -1;
          puVar14 = puVar14 + -1;
          *puVar14 = *puVar21;
        } while (puVar21 != unaff_x20);
      }
code_r0x006b1f3c:
      *(uint **)(unaff_x19 + 0x40) = puVar14;
      *(uint **)(unaff_x19 + 0x48) = puVar27;
      *(long *)(unaff_x19 + 0x50) = lVar13 + (long)unaff_x22 * 4;
      if (unaff_x20 != (uint *)0x0) {
        __ZdlPv(unaff_x20);
      }
code_r0x006b1f50:
      *(uint **)(unaff_x19 + 0x48) = puVar27;
      return;
    }
  }
  else {
    unaff_x20 = *(uint **)(unaff_x19 + 0x28);
    puVar27 = (uint *)((long)puVar16 - (long)unaff_x20);
    unaff_x24 = (long)puVar27 >> 2;
    puVar14 = (uint *)(unaff_x24 + 1);
    puVar5 = puVar16;
    if ((ulong)puVar14 >> 0x3e == 0) {
      uVar19 = (long)*(uint **)(unaff_x19 + 0x38) - (long)unaff_x20;
      unaff_x22 = (uint *)((long)uVar19 >> 1);
      if (unaff_x22 <= puVar14) {
        unaff_x22 = puVar14;
      }
      if (0x7ffffffffffffffb < uVar19) {
        unaff_x22 = (uint *)0x3fffffffffffffff;
      }
      if (unaff_x22 == (uint *)0x0) {
        lVar26 = 0;
        puVar14 = (uint *)(unaff_x24 * 4);
        lVar13 = 0;
        *puVar14 = uVar2;
joined_r0x006b1d94:
        unaff_x22 = puVar14 + 1;
        if ((long)puVar16 - (long)unaff_x20 != 0) {
          uVar19 = ((long)puVar16 - (long)unaff_x20) - 4;
          if ((0x3b < uVar19) && (0x3f < (ulong)((long)puVar16 - ((long)puVar27 + lVar26)))) {
            uVar19 = (uVar19 >> 2) + 1;
            uVar10 = uVar19 & 0x7ffffffffffffff0;
            puVar5 = puVar16 + -uVar10;
            puVar14 = puVar14 + -uVar10;
            puVar16 = puVar16 + -8;
            puVar17 = (undefined8 *)(lVar26 + unaff_x24 * 4 + -0x20);
            uVar20 = uVar10;
            do {
              uVar30 = *(undefined8 *)puVar16;
              uVar29 = *(undefined8 *)(puVar16 + 6);
              uVar7 = *(undefined8 *)(puVar16 + 4);
              uVar34 = *(undefined8 *)(puVar16 + -6);
              uVar33 = *(undefined8 *)(puVar16 + -8);
              uVar32 = *(undefined8 *)(puVar16 + -2);
              uVar31 = *(undefined8 *)(puVar16 + -4);
              puVar17[1] = *(undefined8 *)(puVar16 + 2);
              *puVar17 = uVar30;
              puVar17[3] = uVar29;
              puVar17[2] = uVar7;
              puVar17[-3] = uVar34;
              puVar17[-4] = uVar33;
              puVar17[-1] = uVar32;
              puVar17[-2] = uVar31;
              puVar16 = puVar16 + -0x10;
              puVar17 = puVar17 + -8;
              uVar20 = uVar20 - 0x10;
            } while (uVar20 != 0);
            if (uVar19 == uVar10) goto code_r0x006b1e14;
          }
          do {
            puVar5 = puVar5 + -1;
            puVar14 = puVar14 + -1;
            *puVar14 = *puVar5;
          } while (puVar5 != unaff_x20);
        }
code_r0x006b1e14:
        *(uint **)(unaff_x19 + 0x28) = puVar14;
        *(uint **)(unaff_x19 + 0x30) = unaff_x22;
        *(long *)(unaff_x19 + 0x38) = lVar13;
        if (unaff_x20 != (uint *)0x0) {
          __ZdlPv(unaff_x20);
        }
        goto code_r0x006b1e28;
      }
      if ((ulong)unaff_x22 >> 0x3e == 0) {
        lVar26 = __Znwm((long)unaff_x22 << 2);
        puVar14 = (uint *)(lVar26 + unaff_x24 * 4);
        lVar13 = lVar26 + (long)unaff_x22 * 4;
        *puVar14 = uVar2;
        goto joined_r0x006b1d94;
      }
code_r0x006b1f6c:
      func_0x00017514();
    }
    iVar8 = (int)unaff_x21;
    iVar9 = (int)param_4;
    func_0x00017f90();
  }
  puVar28 = &DAT_006b1f78;
  auVar35 = func_0x00017f90();
  goto code_r0x006b1f78;
  while( true ) {
    uVar19 = *(ulong *)(uVar19 + 0x20);
    in_w14 = *(int *)(uVar19 + 8);
    if (uVar19 != 0 && in_w14 == in_w10) break;
code_r0x006c8840:
    if ((in_w14 != iRam0000000000a27a48) && (in_w14 != iRam0000000000a27b38)) goto code_r0x006c8898;
  }
code_r0x006c8854:
  uVar19 = *(ulong *)(uVar19 + 0x20);
  if (uVar19 != in_x11) {
    uVar20 = 0;
    uVar10 = uVar19 >> 4 ^ uVar19 >> 9;
    do {
      uVar10 = uVar10 & in_x13;
      uVar11 = *(ulong *)(in_x12 + uVar10 * 0x18);
      if (uVar11 == uVar19) {
        if (*(char *)(in_x12 + uVar10 * 0x18 + 9) != '\0') goto code_r0x006c89c4;
        break;
      }
      uVar20 = uVar20 + 1;
      uVar10 = uVar20 + uVar10;
    } while (uVar11 != in_x11 && uVar20 <= in_x13);
  }
code_r0x006c8898:
  if ((in_x9 != 0) && (*(ulong *)(unaff_x20 + 0x46) != param_5)) {
    uVar19 = 0;
    uVar20 = param_5 >> 4 ^ param_5 >> 9;
    do {
      uVar20 = uVar20 & *(long *)(unaff_x20 + 0x42) - 1U;
      uVar10 = *(ulong *)(*(long *)(unaff_x20 + 0x40) + uVar20 * 0x20);
      if (uVar10 == param_5) {
        if (*(int *)(*(long *)(unaff_x20 + 0x40) + uVar20 * 0x20 + 8) != 0) goto code_r0x006c89c4;
        break;
      }
      uVar19 = uVar19 + 1;
      uVar20 = uVar19 + uVar20;
    } while (uVar10 != *(ulong *)(unaff_x20 + 0x46) && uVar19 <= *(long *)(unaff_x20 + 0x42) - 1U);
  }
code_r0x006c84d8:
  in_stack_00000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  func_0x006c526c();
  func_0x006c6028();
  puVar5 = (uint *)func_0x006b2784(*(undefined8 *)unaff_x20);
  auVar35._8_4_ = 0x17;
  auVar35._0_8_ = *(undefined8 *)unaff_x20;
  iVar8 = 0;
  iVar9 = 0;
  puVar28 = &UNK_006c8528;
  puVar16 = unaff_x21;
  puVar27 = unaff_x26;
code_r0x006b1f78:
  lVar13 = auVar35._0_8_;
  *(uint **)((long)register0x00000008 + -0x50) = puVar27;
  *(ulong *)((long)register0x00000008 + -0x48) = unaff_x25;
  *(long *)((long)register0x00000008 + -0x40) = unaff_x24;
  *(uint **)((long)register0x00000008 + -0x38) = puVar5;
  *(uint **)((long)register0x00000008 + -0x30) = unaff_x22;
  *(uint **)((long)register0x00000008 + -0x28) = puVar16;
  *(uint **)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar28;
  uVar2 = auVar35._8_4_ | iVar8 << 8 | iVar9 << 0x10;
  puVar16 = *(uint **)(lVar13 + 0x30);
  if (puVar16 < *(uint **)(lVar13 + 0x38)) {
    unaff_x22 = puVar16 + 1;
    *puVar16 = uVar2;
code_r0x006b20d0:
    *(uint **)(lVar13 + 0x30) = unaff_x22;
    puVar16 = *(uint **)(lVar13 + 0x48);
    if (puVar16 < *(uint **)(lVar13 + 0x50)) {
      puVar27 = puVar16 + 1;
      *puVar16 = *(uint *)(lVar13 + 0x1b8);
      goto code_r0x006b21f8;
    }
    puVar21 = *(uint **)(lVar13 + 0x40);
    lVar26 = (long)puVar16 - (long)puVar21;
    puVar5 = (uint *)(lVar26 >> 2);
    puVar14 = (uint *)((long)puVar5 + 1);
    if ((ulong)puVar14 >> 0x3e == 0) {
      uVar19 = (long)*(uint **)(lVar13 + 0x50) - (long)puVar21;
      unaff_x22 = (uint *)((long)uVar19 >> 1);
      if (unaff_x22 <= puVar14) {
        unaff_x22 = puVar14;
      }
      if (0x7ffffffffffffffb < uVar19) {
        unaff_x22 = (uint *)0x3fffffffffffffff;
      }
      if (unaff_x22 == (uint *)0x0) {
        lVar3 = 0;
      }
      else {
        if ((ulong)unaff_x22 >> 0x3e != 0) goto code_r0x006b2214;
        lVar3 = __Znwm((long)unaff_x22 << 2);
      }
      puVar14 = (uint *)(lVar3 + (long)puVar5 * 4);
      puVar27 = puVar14 + 1;
      *puVar14 = *(uint *)(lVar13 + 0x1b8);
      if ((long)puVar16 - (long)puVar21 != 0) {
        uVar19 = ((long)puVar16 - (long)puVar21) - 4;
        puVar24 = puVar16;
        if ((0x3b < uVar19) && (0x3f < (ulong)((long)puVar16 + (-lVar26 - lVar3)))) {
          uVar19 = (uVar19 >> 2) + 1;
          uVar10 = uVar19 & 0x7ffffffffffffff0;
          puVar24 = puVar16 + -uVar10;
          puVar14 = puVar14 + -uVar10;
          puVar16 = puVar16 + -8;
          puVar17 = (undefined8 *)(lVar3 + (long)puVar5 * 4 + -0x20);
          uVar20 = uVar10;
          do {
            uVar30 = *(undefined8 *)puVar16;
            uVar29 = *(undefined8 *)(puVar16 + 6);
            uVar7 = *(undefined8 *)(puVar16 + 4);
            uVar34 = *(undefined8 *)(puVar16 + -6);
            uVar33 = *(undefined8 *)(puVar16 + -8);
            uVar32 = *(undefined8 *)(puVar16 + -2);
            uVar31 = *(undefined8 *)(puVar16 + -4);
            puVar17[1] = *(undefined8 *)(puVar16 + 2);
            *puVar17 = uVar30;
            puVar17[3] = uVar29;
            puVar17[2] = uVar7;
            puVar17[-3] = uVar34;
            puVar17[-4] = uVar33;
            puVar17[-1] = uVar32;
            puVar17[-2] = uVar31;
            puVar16 = puVar16 + -0x10;
            puVar17 = puVar17 + -8;
            uVar20 = uVar20 - 0x10;
          } while (uVar20 != 0);
          if (uVar19 == uVar10) goto code_r0x006b21e4;
        }
        do {
          puVar24 = puVar24 + -1;
          puVar14 = puVar14 + -1;
          *puVar14 = *puVar24;
        } while (puVar24 != puVar21);
      }
code_r0x006b21e4:
      *(uint **)(lVar13 + 0x40) = puVar14;
      *(uint **)(lVar13 + 0x48) = puVar27;
      *(long *)(lVar13 + 0x50) = lVar3 + (long)unaff_x22 * 4;
      if (puVar21 != (uint *)0x0) {
        __ZdlPv(puVar21);
      }
code_r0x006b21f8:
      *(uint **)(lVar13 + 0x48) = puVar27;
      return;
    }
  }
  else {
    puVar21 = *(uint **)(lVar13 + 0x28);
    puVar27 = (uint *)((long)puVar16 - (long)puVar21);
    lVar26 = (long)puVar27 >> 2;
    puVar14 = (uint *)(lVar26 + 1);
    puVar5 = puVar16;
    if ((ulong)puVar14 >> 0x3e == 0) {
      uVar19 = (long)*(uint **)(lVar13 + 0x38) - (long)puVar21;
      unaff_x22 = (uint *)((long)uVar19 >> 1);
      if (unaff_x22 <= puVar14) {
        unaff_x22 = puVar14;
      }
      if (0x7ffffffffffffffb < uVar19) {
        unaff_x22 = (uint *)0x3fffffffffffffff;
      }
      if (unaff_x22 == (uint *)0x0) {
        lVar4 = 0;
        puVar14 = (uint *)(lVar26 * 4);
        lVar3 = 0;
        *puVar14 = uVar2;
joined_r0x006b203c:
        unaff_x22 = puVar14 + 1;
        if ((long)puVar16 - (long)puVar21 != 0) {
          uVar19 = ((long)puVar16 - (long)puVar21) - 4;
          if ((0x3b < uVar19) && (0x3f < (ulong)((long)puVar16 + (-(long)puVar27 - lVar4)))) {
            uVar19 = (uVar19 >> 2) + 1;
            uVar10 = uVar19 & 0x7ffffffffffffff0;
            puVar5 = puVar16 + -uVar10;
            puVar14 = puVar14 + -uVar10;
            puVar16 = puVar16 + -8;
            puVar17 = (undefined8 *)(lVar4 + lVar26 * 4 + -0x20);
            uVar20 = uVar10;
            do {
              uVar30 = *(undefined8 *)puVar16;
              uVar29 = *(undefined8 *)(puVar16 + 6);
              uVar7 = *(undefined8 *)(puVar16 + 4);
              uVar34 = *(undefined8 *)(puVar16 + -6);
              uVar33 = *(undefined8 *)(puVar16 + -8);
              uVar32 = *(undefined8 *)(puVar16 + -2);
              uVar31 = *(undefined8 *)(puVar16 + -4);
              puVar17[1] = *(undefined8 *)(puVar16 + 2);
              *puVar17 = uVar30;
              puVar17[3] = uVar29;
              puVar17[2] = uVar7;
              puVar17[-3] = uVar34;
              puVar17[-4] = uVar33;
              puVar17[-1] = uVar32;
              puVar17[-2] = uVar31;
              puVar16 = puVar16 + -0x10;
              puVar17 = puVar17 + -8;
              uVar20 = uVar20 - 0x10;
            } while (uVar20 != 0);
            if (uVar19 == uVar10) goto code_r0x006b20bc;
          }
          do {
            puVar5 = puVar5 + -1;
            puVar14 = puVar14 + -1;
            *puVar14 = *puVar5;
          } while (puVar5 != puVar21);
        }
code_r0x006b20bc:
        *(uint **)(lVar13 + 0x28) = puVar14;
        *(uint **)(lVar13 + 0x30) = unaff_x22;
        *(long *)(lVar13 + 0x38) = lVar3;
        if (puVar21 != (uint *)0x0) {
          __ZdlPv(puVar21);
        }
        goto code_r0x006b20d0;
      }
      if ((ulong)unaff_x22 >> 0x3e == 0) {
        lVar4 = __Znwm((long)unaff_x22 << 2);
        puVar14 = (uint *)(lVar4 + lVar26 * 4);
        lVar3 = lVar4 + (long)unaff_x22 * 4;
        *puVar14 = uVar2;
        goto joined_r0x006b203c;
      }
code_r0x006b2214:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar35 = func_0x00017f90();
  lVar3 = auVar35._0_8_;
  *(uint **)((long)register0x00000008 + -0xa0) = puVar27;
  *(ulong *)((long)register0x00000008 + -0x98) = (ulong)uVar2;
  *(long *)((long)register0x00000008 + -0x90) = lVar26;
  *(uint **)((long)register0x00000008 + -0x88) = puVar5;
  *(uint **)((long)register0x00000008 + -0x80) = unaff_x22;
  *(uint **)((long)register0x00000008 + -0x78) = puVar16;
  *(uint **)((long)register0x00000008 + -0x70) = puVar21;
  *(long *)((long)register0x00000008 + -0x68) = lVar13;
  *(undefined1 **)((long)register0x00000008 + -0x60) =
       (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x58) = &DAT_006b2220;
  uVar2 = auVar35._8_4_ | iVar8 << 8;
  puVar16 = *(uint **)(lVar3 + 0x30);
  if (puVar16 < *(uint **)(lVar3 + 0x38)) {
    unaff_x22 = puVar16 + 1;
    *puVar16 = uVar2;
code_r0x006b2374:
    *(uint **)(lVar3 + 0x30) = unaff_x22;
    puVar16 = *(uint **)(lVar3 + 0x48);
    if (puVar16 < *(uint **)(lVar3 + 0x50)) {
      puVar27 = puVar16 + 1;
      *puVar16 = *(uint *)(lVar3 + 0x1b8);
      goto code_r0x006b249c;
    }
    puVar21 = *(uint **)(lVar3 + 0x40);
    lVar13 = (long)puVar16 - (long)puVar21;
    puVar5 = (uint *)(lVar13 >> 2);
    puVar14 = (uint *)((long)puVar5 + 1);
    if ((ulong)puVar14 >> 0x3e == 0) {
      uVar19 = (long)*(uint **)(lVar3 + 0x50) - (long)puVar21;
      unaff_x22 = (uint *)((long)uVar19 >> 1);
      if (unaff_x22 <= puVar14) {
        unaff_x22 = puVar14;
      }
      if (0x7ffffffffffffffb < uVar19) {
        unaff_x22 = (uint *)0x3fffffffffffffff;
      }
      if (unaff_x22 == (uint *)0x0) {
        lVar26 = 0;
      }
      else {
        if ((ulong)unaff_x22 >> 0x3e != 0) goto code_r0x006b24b8;
        lVar26 = __Znwm((long)unaff_x22 << 2);
      }
      puVar14 = (uint *)(lVar26 + (long)puVar5 * 4);
      puVar27 = puVar14 + 1;
      *puVar14 = *(uint *)(lVar3 + 0x1b8);
      if ((long)puVar16 - (long)puVar21 != 0) {
        uVar19 = ((long)puVar16 - (long)puVar21) - 4;
        puVar24 = puVar16;
        if ((0x3b < uVar19) && (0x3f < (ulong)((long)puVar16 + (-lVar13 - lVar26)))) {
          uVar19 = (uVar19 >> 2) + 1;
          uVar10 = uVar19 & 0x7ffffffffffffff0;
          puVar24 = puVar16 + -uVar10;
          puVar14 = puVar14 + -uVar10;
          puVar16 = puVar16 + -8;
          puVar17 = (undefined8 *)(lVar26 + (long)puVar5 * 4 + -0x20);
          uVar20 = uVar10;
          do {
            uVar30 = *(undefined8 *)puVar16;
            uVar29 = *(undefined8 *)(puVar16 + 6);
            uVar7 = *(undefined8 *)(puVar16 + 4);
            uVar34 = *(undefined8 *)(puVar16 + -6);
            uVar33 = *(undefined8 *)(puVar16 + -8);
            uVar32 = *(undefined8 *)(puVar16 + -2);
            uVar31 = *(undefined8 *)(puVar16 + -4);
            puVar17[1] = *(undefined8 *)(puVar16 + 2);
            *puVar17 = uVar30;
            puVar17[3] = uVar29;
            puVar17[2] = uVar7;
            puVar17[-3] = uVar34;
            puVar17[-4] = uVar33;
            puVar17[-1] = uVar32;
            puVar17[-2] = uVar31;
            puVar16 = puVar16 + -0x10;
            puVar17 = puVar17 + -8;
            uVar20 = uVar20 - 0x10;
          } while (uVar20 != 0);
          if (uVar19 == uVar10) goto code_r0x006b2488;
        }
        do {
          puVar24 = puVar24 + -1;
          puVar14 = puVar14 + -1;
          *puVar14 = *puVar24;
        } while (puVar24 != puVar21);
      }
code_r0x006b2488:
      *(uint **)(lVar3 + 0x40) = puVar14;
      *(uint **)(lVar3 + 0x48) = puVar27;
      *(long *)(lVar3 + 0x50) = lVar26 + (long)unaff_x22 * 4;
      if (puVar21 != (uint *)0x0) {
        __ZdlPv(puVar21);
      }
code_r0x006b249c:
      *(uint **)(lVar3 + 0x48) = puVar27;
      return;
    }
  }
  else {
    puVar21 = *(uint **)(lVar3 + 0x28);
    puVar27 = (uint *)((long)puVar16 - (long)puVar21);
    lVar13 = (long)puVar27 >> 2;
    puVar14 = (uint *)(lVar13 + 1);
    puVar5 = puVar16;
    if ((ulong)puVar14 >> 0x3e == 0) {
      uVar19 = (long)*(uint **)(lVar3 + 0x38) - (long)puVar21;
      unaff_x22 = (uint *)((long)uVar19 >> 1);
      if (unaff_x22 <= puVar14) {
        unaff_x22 = puVar14;
      }
      if (0x7ffffffffffffffb < uVar19) {
        unaff_x22 = (uint *)0x3fffffffffffffff;
      }
      if (unaff_x22 == (uint *)0x0) {
        lVar4 = 0;
        puVar14 = (uint *)(lVar13 * 4);
        lVar26 = 0;
        *puVar14 = uVar2;
joined_r0x006b22e0:
        unaff_x22 = puVar14 + 1;
        if ((long)puVar16 - (long)puVar21 != 0) {
          uVar19 = ((long)puVar16 - (long)puVar21) - 4;
          if ((0x3b < uVar19) && (0x3f < (ulong)((long)puVar16 - ((long)puVar27 + lVar4)))) {
            uVar19 = (uVar19 >> 2) + 1;
            uVar10 = uVar19 & 0x7ffffffffffffff0;
            puVar5 = puVar16 + -uVar10;
            puVar14 = puVar14 + -uVar10;
            puVar16 = puVar16 + -8;
            puVar17 = (undefined8 *)(lVar4 + lVar13 * 4 + -0x20);
            uVar20 = uVar10;
            do {
              uVar30 = *(undefined8 *)puVar16;
              uVar29 = *(undefined8 *)(puVar16 + 6);
              uVar7 = *(undefined8 *)(puVar16 + 4);
              uVar34 = *(undefined8 *)(puVar16 + -6);
              uVar33 = *(undefined8 *)(puVar16 + -8);
              uVar32 = *(undefined8 *)(puVar16 + -2);
              uVar31 = *(undefined8 *)(puVar16 + -4);
              puVar17[1] = *(undefined8 *)(puVar16 + 2);
              *puVar17 = uVar30;
              puVar17[3] = uVar29;
              puVar17[2] = uVar7;
              puVar17[-3] = uVar34;
              puVar17[-4] = uVar33;
              puVar17[-1] = uVar32;
              puVar17[-2] = uVar31;
              puVar16 = puVar16 + -0x10;
              puVar17 = puVar17 + -8;
              uVar20 = uVar20 - 0x10;
            } while (uVar20 != 0);
            if (uVar19 == uVar10) goto code_r0x006b2360;
          }
          do {
            puVar5 = puVar5 + -1;
            puVar14 = puVar14 + -1;
            *puVar14 = *puVar5;
          } while (puVar5 != puVar21);
        }
code_r0x006b2360:
        *(uint **)(lVar3 + 0x28) = puVar14;
        *(uint **)(lVar3 + 0x30) = unaff_x22;
        *(long *)(lVar3 + 0x38) = lVar26;
        if (puVar21 != (uint *)0x0) {
          __ZdlPv(puVar21);
        }
        goto code_r0x006b2374;
      }
      if ((ulong)unaff_x22 >> 0x3e == 0) {
        lVar4 = __Znwm((long)unaff_x22 << 2);
        puVar14 = (uint *)(lVar4 + lVar13 * 4);
        lVar26 = lVar4 + (long)unaff_x22 * 4;
        *puVar14 = uVar2;
        goto joined_r0x006b22e0;
      }
code_r0x006b24b8:
      func_0x00017514();
    }
    func_0x00017f90();
  }
  auVar35 = func_0x00017f90();
  uVar6 = auVar35._8_4_;
  lVar26 = auVar35._0_8_;
  *(uint **)((long)register0x00000008 + -0xf0) = puVar27;
  *(ulong *)((long)register0x00000008 + -0xe8) = (ulong)uVar2;
  *(long *)((long)register0x00000008 + -0xe0) = lVar13;
  *(uint **)((long)register0x00000008 + -0xd8) = puVar5;
  *(uint **)((long)register0x00000008 + -0xd0) = unaff_x22;
  *(uint **)((long)register0x00000008 + -200) = puVar16;
  *(uint **)((long)register0x00000008 + -0xc0) = puVar21;
  *(long *)((long)register0x00000008 + -0xb8) = lVar3;
  *(undefined1 **)((long)register0x00000008 + -0xb0) =
       (undefined1 *)((long)register0x00000008 + -0x60);
  *(undefined **)((long)register0x00000008 + -0xa8) = &DAT_006b24c4;
  puVar1 = *(undefined4 **)(lVar26 + 0x30);
  if (*(undefined4 **)(lVar26 + 0x38) <= puVar1) {
    puVar22 = *(undefined4 **)(lVar26 + 0x28);
    lVar13 = (long)puVar1 - (long)puVar22 >> 2;
    uVar19 = lVar13 + 1;
    if (uVar19 >> 0x3e == 0) {
      uVar10 = (long)*(undefined4 **)(lVar26 + 0x38) - (long)puVar22;
      uVar20 = (long)uVar10 >> 1;
      if (uVar20 <= uVar19) {
        uVar20 = uVar19;
      }
      if (0x7ffffffffffffffb < uVar10) {
        uVar20 = 0x3fffffffffffffff;
      }
      if (uVar20 == 0) {
        lVar4 = 0;
        puVar23 = (undefined4 *)(lVar13 * 4);
        lVar3 = 0;
        *puVar23 = uVar6;
joined_r0x006b2584:
        puVar15 = puVar23 + 1;
        if ((long)puVar1 - (long)puVar22 != 0) {
          uVar19 = ((long)puVar1 - (long)puVar22) - 4;
          puVar25 = puVar1;
          if ((0x3b < uVar19) &&
             (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar22) - lVar4)))) {
            uVar19 = (uVar19 >> 2) + 1;
            uVar10 = uVar19 & 0x7ffffffffffffff0;
            puVar25 = puVar1 + -uVar10;
            puVar23 = puVar23 + -uVar10;
            puVar17 = (undefined8 *)(puVar1 + -8);
            puVar18 = (undefined8 *)(lVar4 + lVar13 * 4 + -0x20);
            uVar20 = uVar10;
            do {
              uVar30 = *puVar17;
              uVar29 = puVar17[3];
              uVar7 = puVar17[2];
              uVar34 = puVar17[-3];
              uVar33 = puVar17[-4];
              uVar32 = puVar17[-1];
              uVar31 = puVar17[-2];
              puVar18[1] = puVar17[1];
              *puVar18 = uVar30;
              puVar18[3] = uVar29;
              puVar18[2] = uVar7;
              puVar18[-3] = uVar34;
              puVar18[-4] = uVar33;
              puVar18[-1] = uVar32;
              puVar18[-2] = uVar31;
              puVar17 = puVar17 + -8;
              puVar18 = puVar18 + -8;
              uVar20 = uVar20 - 0x10;
            } while (uVar20 != 0);
            if (uVar19 == uVar10) goto code_r0x006b2604;
          }
          do {
            puVar25 = puVar25 + -1;
            puVar23 = puVar23 + -1;
            *puVar23 = *puVar25;
          } while (puVar25 != puVar22);
        }
code_r0x006b2604:
        *(undefined4 **)(lVar26 + 0x28) = puVar23;
        *(undefined4 **)(lVar26 + 0x30) = puVar15;
        *(long *)(lVar26 + 0x38) = lVar3;
        if (puVar22 != (undefined4 *)0x0) {
          __ZdlPv(puVar22);
        }
        goto code_r0x006b2618;
      }
      if (uVar20 >> 0x3e == 0) {
        lVar4 = __Znwm(uVar20 << 2);
        puVar23 = (undefined4 *)(lVar4 + lVar13 * 4);
        lVar3 = lVar4 + uVar20 * 4;
        *puVar23 = uVar6;
        goto joined_r0x006b2584;
      }
code_r0x006b275c:
      func_0x00017514();
    }
    func_0x00017f90();
code_r0x006b2764:
    lVar13 = func_0x00017f90();
    *(long *)(lVar13 + 0x30) = *(long *)(lVar13 + 0x30) + -4;
    *(long *)(lVar13 + 0x48) = *(long *)(lVar13 + 0x48) + -4;
    return;
  }
  puVar15 = puVar1 + 1;
  *puVar1 = uVar6;
code_r0x006b2618:
  *(undefined4 **)(lVar26 + 0x30) = puVar15;
  puVar1 = *(undefined4 **)(lVar26 + 0x48);
  if (puVar1 < *(undefined4 **)(lVar26 + 0x50)) {
    puVar22 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(lVar26 + 0x1b8);
    goto code_r0x006b2740;
  }
  puVar23 = *(undefined4 **)(lVar26 + 0x40);
  lVar13 = (long)puVar1 - (long)puVar23 >> 2;
  uVar19 = lVar13 + 1;
  if (uVar19 >> 0x3e != 0) goto code_r0x006b2764;
  uVar10 = (long)*(undefined4 **)(lVar26 + 0x50) - (long)puVar23;
  uVar20 = (long)uVar10 >> 1;
  if (uVar20 <= uVar19) {
    uVar20 = uVar19;
  }
  if (0x7ffffffffffffffb < uVar10) {
    uVar20 = 0x3fffffffffffffff;
  }
  if (uVar20 == 0) {
    lVar3 = 0;
  }
  else {
    if (uVar20 >> 0x3e != 0) goto code_r0x006b275c;
    lVar3 = __Znwm(uVar20 << 2);
  }
  puVar15 = (undefined4 *)(lVar3 + lVar13 * 4);
  puVar22 = puVar15 + 1;
  *puVar15 = *(undefined4 *)(lVar26 + 0x1b8);
  if ((long)puVar1 - (long)puVar23 != 0) {
    uVar19 = ((long)puVar1 - (long)puVar23) - 4;
    puVar25 = puVar1;
    if ((0x3b < uVar19) &&
       (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar23) - lVar3)))) {
      uVar19 = (uVar19 >> 2) + 1;
      uVar11 = uVar19 & 0x7ffffffffffffff0;
      puVar25 = puVar1 + -uVar11;
      puVar15 = puVar15 + -uVar11;
      puVar17 = (undefined8 *)(puVar1 + -8);
      puVar18 = (undefined8 *)(lVar3 + lVar13 * 4 + -0x20);
      uVar10 = uVar11;
      do {
        uVar30 = *puVar17;
        uVar29 = puVar17[3];
        uVar7 = puVar17[2];
        uVar34 = puVar17[-3];
        uVar33 = puVar17[-4];
        uVar32 = puVar17[-1];
        uVar31 = puVar17[-2];
        puVar18[1] = puVar17[1];
        *puVar18 = uVar30;
        puVar18[3] = uVar29;
        puVar18[2] = uVar7;
        puVar18[-3] = uVar34;
        puVar18[-4] = uVar33;
        puVar18[-1] = uVar32;
        puVar18[-2] = uVar31;
        puVar17 = puVar17 + -8;
        puVar18 = puVar18 + -8;
        uVar10 = uVar10 - 0x10;
      } while (uVar10 != 0);
      if (uVar19 == uVar11) goto code_r0x006b272c;
    }
    do {
      puVar25 = puVar25 + -1;
      puVar15 = puVar15 + -1;
      *puVar15 = *puVar25;
    } while (puVar25 != puVar23);
  }
code_r0x006b272c:
  *(undefined4 **)(lVar26 + 0x40) = puVar15;
  *(undefined4 **)(lVar26 + 0x48) = puVar22;
  *(ulong *)(lVar26 + 0x50) = lVar3 + uVar20 * 4;
  if (puVar23 != (undefined4 *)0x0) {
    __ZdlPv(puVar23);
  }
code_r0x006b2740:
  *(undefined4 **)(lVar26 + 0x48) = puVar22;
  return;
}

