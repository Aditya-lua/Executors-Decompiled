
/* WARNING: Type propagation algorithm not settling */

void FUN_001c0320(void)

{
  ulong *puVar1;
  uint *puVar2;
  ulong *puVar3;
  undefined2 uVar4;
  undefined2 uVar5;
  uint uVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long *plVar10;
  ulong uVar11;
  ulong extraout_x1;
  undefined8 *extraout_x1_00;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined1 uVar12;
  ulong *in_x9;
  long lVar13;
  uint *puVar14;
  uint *puVar15;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *puVar16;
  ulong unaff_x22;
  undefined8 uVar17;
  long unaff_x23;
  undefined8 *puVar18;
  ulong unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *puVar19;
  ulong unaff_x27;
  undefined8 *unaff_x28;
  undefined1 *in_stack_00000000;
  long in_stack_00000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000028;
  ulong *in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  do {
    uVar11 = unaff_x27 - 1;
    in_x9[2] = uVar11;
    puVar19 = unaff_x25;
    if (uVar11 <= unaff_x22) {
LAB_001c0578:
      func_0x007a2080(-(long)unaff_x20,uVar11,&UNK_009c2960);
LAB_001c0588:
      func_0x007a28bc(puVar19,unaff_x28,&UNK_009c2978);
      in_stack_00000010 = extraout_x1_00;
LAB_001c059c:
      func_0x007a28b0(unaff_x28,in_stack_00000010,&UNK_009c2978);
LAB_001c05ac:
      uStack0000000000000040 = &UNK_009c9d40;
      in_stack_00000048 = 1;
      in_stack_00000058 = 0;
      in_stack_00000060 = 0;
      in_stack_00000050 = 8;
      func_0x007a2420(&uStack0000000000000040,&UNK_009c2978);
      lVar9 = func_0x00187bd0(0x280,8);
      if (lVar9 != 0) {
        *extraout_x8 = 0x10;
        extraout_x8[1] = lVar9;
        extraout_x8[2] = 0;
        extraout_x8[3] = 0;
        return;
      }
      plVar10 = (long *)func_0x007a1f00(8,0x280,&UNK_009c29a8);
      uVar11 = plVar10[1];
      if (uVar11 == 0) {
        *extraout_x8_00 = 2;
        return;
      }
      lVar9 = *plVar10;
      *plVar10 = 1;
      plVar10[1] = 0;
      if (uVar11 < 4) {
        lVar13 = *(long *)plVar10[2];
        lVar7 = plVar10[3];
        *extraout_x8_00 = 0;
        extraout_x8_00[2] = lVar9 - lVar13;
        extraout_x8_00[3] = (lVar9 - lVar13) + uVar11;
        *(int *)(extraout_x8_00 + 4) = (int)lVar7;
        return;
      }
      uVar6 = ((uint)*(byte *)(lVar9 + 1) << 8 | (uint)*(byte *)(lVar9 + 3) << 0x18) >> 8;
      uVar8 = (ulong)((uVar6 | (uint)*(byte *)(lVar9 + 2) << 0x18) >> 0x10 | uVar6 << 0x10);
      lVar7 = (uVar11 - 4) - uVar8;
      if (uVar8 <= uVar11 - 4 && lVar7 != 0) {
        *plVar10 = lVar9 + uVar8 + 4;
        plVar10[1] = lVar7;
        uVar11 = uVar8 + 4;
      }
      lVar13 = *(long *)plVar10[2];
      lVar7 = plVar10[3];
      *extraout_x8_00 = 1;
      extraout_x8_00[1] = uVar8;
      extraout_x8_00[2] = lVar9 - lVar13;
      extraout_x8_00[3] = (lVar9 - lVar13) + uVar11;
      *(int *)(extraout_x8_00 + 4) = (int)lVar7;
      return;
    }
    lVar9 = in_x9[1] + unaff_x21;
    unaff_x20 = *(undefined8 **)(lVar9 + 0x10);
    uVar8 = *(ulong *)(lVar9 + 0x18);
    uVar4 = *(undefined2 *)(lVar9 + 0x20);
    uVar5 = *(undefined2 *)(lVar9 + 0x22);
    _memmove(lVar9,lVar9 + 0x28,(unaff_x27 * unaff_x23 - unaff_x21) + -0x50);
    uVar11 = unaff_x27 - 2;
    in_x9[2] = uVar11;
    if (unaff_x28 < unaff_x25) goto LAB_001c0588;
    if (in_stack_00000010 < unaff_x28) goto LAB_001c059c;
    if ((ulong)((long)in_stack_00000010 - ((long)unaff_x28 - (long)unaff_x25)) < uVar8)
    goto LAB_001c05ac;
    _memmove(in_stack_00000028 + uVar8,(undefined1 *)((long)unaff_x25 + in_stack_00000028));
    puVar19 = (undefined8 *)(uVar8 + ((long)unaff_x28 - (long)unaff_x25));
    unaff_x28 = in_stack_00000010;
    if (in_stack_00000010 < puVar19 || puVar19 < unaff_x20) {
LAB_001c055c:
      uVar8 = func_0x007a23bc(&UNK_009c2900);
      puVar19 = unaff_x25;
      uVar11 = unaff_x27;
code_r0x001c0568:
      func_0x007a2080(uVar8,uVar11,&UNK_009c2948);
      uVar11 = extraout_x1;
      goto LAB_001c0578;
    }
    puVar19 = (undefined8 *)((long)puVar19 - (long)unaff_x20);
    if (puVar19 != (undefined8 *)0x0) {
      lVar9 = unaff_x27 * 0x28;
      puVar18 = (undefined8 *)((long)unaff_x20 + in_stack_00000028);
      do {
        if ((undefined8 *)((long)&MACH_HEADER.magic + 3) < puVar19) {
          uVar6 = ((uint)(byte)*(undefined1 *)((long)puVar18 + 1) << 8 |
                  (uint)*(byte *)((long)puVar18 + 3) << 0x18) >> 8;
          in_stack_00000038 =
               (ulong)((uVar6 | (uint)(byte)*(undefined1 *)((long)puVar18 + 2) << 0x18) >> 0x10 |
                      uVar6 << 0x10);
          puVar16 = (undefined8 *)(((long)puVar19 + 0xfffffffffffffffcU) - in_stack_00000038);
          if ((ulong)((long)puVar19 + 0xfffffffffffffffcU) < in_stack_00000038 ||
              puVar16 == (undefined8 *)0x0) {
            puVar16 = (undefined8 *)0x0;
            unaff_x20 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            puVar19 = (undefined8 *)(in_stack_00000038 + 4);
            unaff_x20 = (undefined8 *)((long)puVar18 + (long)puVar19);
          }
          uVar17 = 1;
          unaff_x25 = puVar19;
        }
        else {
          uVar17 = 0;
          unaff_x20 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
          puVar16 = (undefined8 *)0x0;
          unaff_x25 = puVar19;
        }
        puVar19 = puVar16;
        if (uVar11 < unaff_x24) {
          func_0x007a204c(unaff_x24,uVar11,&UNK_009c2990);
          goto LAB_001c055c;
        }
        if (uVar11 == *in_stack_00000030) {
          func_0x001d9010(in_stack_00000030,&UNK_009c2990);
        }
        unaff_x27 = in_stack_00000030[1] + unaff_x19;
        unaff_x28 = (undefined8 *)(unaff_x27 - 0x28);
        if (unaff_x24 < uVar11) {
          _memmove(unaff_x27,unaff_x28,(lVar9 - unaff_x21) + -0x50);
        }
        *unaff_x28 = uVar17;
        *(ulong *)(unaff_x27 - 0x20) = in_stack_00000038;
        *(long *)(unaff_x27 - 0x18) = (long)puVar18 - in_stack_00000028;
        *(undefined1 **)(unaff_x27 - 0x10) =
             (undefined1 *)((long)unaff_x25 + ((long)puVar18 - in_stack_00000028));
        *(undefined2 *)(unaff_x27 - 8) = uVar4;
        uVar11 = uVar11 + 1;
        unaff_x19 = unaff_x19 + 0x28;
        *(undefined2 *)(unaff_x27 - 6) = uVar5;
        unaff_x24 = unaff_x24 + 1;
        in_stack_00000030[2] = uVar11;
        puVar18 = unaff_x20;
      } while (puVar19 != (undefined8 *)0x0);
    }
    puVar15 = (uint *)in_stack_00000030[1];
    unaff_x23 = 0x28;
    if (uVar11 == 0) {
code_r0x001c04e4:
      lVar9 = uVar11 * 0x28;
      break;
    }
    puVar18 = (undefined8 *)0x0;
    lVar9 = 0;
    uVar8 = 0;
    puVar14 = puVar15;
    lVar7 = 0x28;
    do {
      unaff_x19 = lVar7;
      unaff_x24 = uVar8;
      unaff_x21 = lVar9;
      unaff_x20 = puVar18;
      if (in_stack_00000008 + uVar11 * 0x28 == unaff_x21) goto code_r0x001c04e4;
      if ((*puVar14 & 1) == 0) {
        uVar8 = 1 - (long)unaff_x20;
        goto code_r0x001c02ec;
      }
      puVar2 = puVar14 + 2;
      puVar3 = (ulong *)(puVar14 + 4);
      puVar1 = (ulong *)(puVar14 + 6);
      puVar14 = puVar14 + 10;
      lVar13 = 0;
      if (*puVar3 <= *puVar1) {
        lVar13 = *puVar1 - *puVar3;
      }
      puVar18 = (undefined8 *)((long)unaff_x20 + 0xffffffffffffffffU);
      lVar9 = unaff_x21 + 0x28;
      uVar8 = unaff_x24 + 1;
      lVar7 = unaff_x19 + 0x28;
    } while (*(long *)puVar2 + 4 == lVar13);
    uVar8 = -((long)unaff_x20 + 0xffffffffffffffffU);
code_r0x001c02ec:
    if (uVar11 <= uVar8) goto code_r0x001c0568;
    unaff_x22 = -(long)unaff_x20;
    puVar15 = puVar15 + uVar8 * 10;
    unaff_x25 = *(undefined8 **)(puVar15 + 4);
    unaff_x28 = *(undefined8 **)(puVar15 + 6);
    _memmove(puVar15,puVar15 + 10,(uVar11 + ~uVar8) * 0x28);
    in_x9 = in_stack_00000030;
    unaff_x27 = uVar11;
  } while( true );
  while( true ) {
    lVar9 = lVar9 + -0x28;
    puVar15 = puVar14 + 10;
    if ((*puVar14 == 1) && (0xffff < *(ulong *)(puVar14 + 2))) break;
    puVar14 = puVar15;
    if (lVar9 == 0) {
      uVar12 = 0x15;
      goto code_r0x001c0524;
    }
  }
  uVar12 = 1;
code_r0x001c0524:
  *in_stack_00000000 = uVar12;
  return;
}

