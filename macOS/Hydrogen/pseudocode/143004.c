
/* WARNING: Removing unreachable block (ram,0x00143264) */
/* WARNING: Removing unreachable block (ram,0x00143260) */
/* WARNING: Removing unreachable block (ram,0x00143274) */
/* WARNING: Type propagation algorithm not settling */

void FUN_00143004(ulong param_1)

{
  undefined1 uVar1;
  byte bVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined8 *extraout_x8;
  ulong uVar8;
  long in_x9;
  undefined8 *puVar9;
  undefined8 *puVar10;
  long in_x10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong in_x12;
  long lVar15;
  long in_x13;
  long lVar16;
  long in_x14;
  int iVar17;
  long lVar18;
  undefined8 *in_x15;
  long lVar19;
  byte bVar20;
  long *plVar21;
  long unaff_x20;
  undefined1 *puVar22;
  long lVar23;
  uint uVar24;
  long *plVar25;
  undefined8 *puVar26;
  undefined8 *puVar27;
  byte unaff_w23;
  int iVar28;
  int iVar29;
  ulong uVar30;
  uint uVar31;
  ulong unaff_x24;
  undefined8 *puVar32;
  undefined8 *puVar33;
  long *unaff_x27;
  long *plVar34;
  long in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  ulong uStack0000000000000018;
  undefined8 *puStack0000000000000020;
  long in_stack_00000028;
  
  do {
    plVar21 = (long *)(in_x10 + in_x9);
    puVar26 = (undefined8 *)*plVar21;
    uStack0000000000000018 = unaff_x24;
    puStack0000000000000020 = in_x15;
    if ((ulong)((*(long *)(unaff_x20 + 0x10) - (long)puVar26 >> 2) * in_x14) < param_1) {
      if (in_x12 < param_1) {
LAB_001432e8:
        uVar6 = func_0x00017f90(plVar21);
        if (in_stack_00000028 != 0) {
          __ZdlPv();
        }
        lVar5 = __Unwind_Resume(uVar6);
        *extraout_x8 = 0;
        extraout_x8[1] = 0;
        extraout_x8[2] = 0;
        uVar24 = *(uint *)(lVar5 + 0x20);
        uVar3 = *(uint *)(lVar5 + 0x28);
        uVar7 = (ulong)(int)uVar3;
        uVar8 = (ulong)(int)uVar24;
        lVar23 = *(long *)(lVar5 + 8);
        uVar12 = (*(long *)(lVar5 + 0x10) - lVar23 >> 3) * -0x5555555555555555;
        if (uVar12 <= uVar8) {
          uVar30 = 0xffffffff;
          goto code_r0x0013786c;
        }
        plVar21 = (long *)(lVar23 + (long)(int)uVar24 * 0x18);
        lVar15 = *plVar21;
        lVar16 = plVar21[1] - lVar15;
        if (lVar16 == 0 || *(int *)(lVar5 + 0x24) < 1) {
          uVar30 = 0;
          goto code_r0x0013786c;
        }
        iVar29 = 0;
        uVar30 = 0;
        break;
      }
      plVar25 = (long *)(in_x10 + unaff_x24 * in_x13 + 8);
      puVar32 = (undefined8 *)*plVar25;
      lVar5 = __Znwm(param_1 * 0xc);
      unaff_x24 = uStack0000000000000018;
      lVar23 = (long)puVar32 - (long)puVar26;
      puVar11 = (undefined8 *)(lVar5 + lVar23);
      puVar9 = puVar11;
      if (lVar23 != 0) {
        puVar10 = puVar11;
        do {
          puVar33 = (undefined8 *)((long)puVar32 + -0xc);
          uVar1 = *(undefined1 *)((long)puVar32 + -4);
          puVar9 = (undefined8 *)((long)puVar10 + -0xc);
          *puVar9 = *puVar33;
          *(undefined1 *)((long)puVar10 + -4) = uVar1;
          puVar10 = puVar9;
          puVar32 = puVar33;
        } while (puVar33 != puVar26);
      }
      *plVar21 = (long)puVar9;
      *plVar25 = (long)puVar11;
      *(long *)(unaff_x20 + 0x10) = lVar5 + param_1 * 0xc;
      in_x12 = 0x1555555555555555;
      in_x13 = 0x18;
      in_x14 = -0x5555555555555555;
      if (puVar26 != (undefined8 *)0x0) {
        __ZdlPv(puVar26);
        in_x14 = -0x5555555555555555;
        in_x13 = 0x18;
        in_x12 = 0x1555555555555555;
      }
    }
    plVar21 = (long *)0x0;
    bVar20 = unaff_w23 & 0xf8;
    puVar26 = puStack0000000000000020;
    while( true ) {
      bVar2 = *(byte *)((long)puVar26 + 0x17);
      plVar25 = (long *)(ulong)bVar2;
      if ((char)bVar2 < '\0') {
        plVar25 = (long *)puVar26[1];
      }
      if (plVar25 <= plVar21) break;
      puVar11 = puVar26;
      if ((char)bVar2 < '\0') {
        puVar11 = (undefined8 *)*puVar26;
      }
      uVar1 = *(undefined1 *)((long)puVar11 + (long)plVar21);
      lVar23 = *unaff_x27 + unaff_x24 * in_x13;
      plVar34 = (long *)(lVar23 + 8);
      puVar11 = (undefined8 *)*plVar34;
      plVar25 = (long *)(lVar23 + 0x10);
      puVar9 = (undefined8 *)*plVar25;
      if (puVar11 < puVar9) {
        *(undefined1 *)puVar11 = uVar1;
        *(undefined4 *)((long)puVar11 + 4) = 0;
        puVar22 = (undefined1 *)((long)puVar11 + 0xc);
        *(byte *)(puVar11 + 1) = bVar20;
      }
      else {
        puVar32 = (undefined8 *)(*unaff_x27 + unaff_x24 * in_x13);
        puVar26 = (undefined8 *)*puVar32;
        lVar23 = ((long)puVar11 - (long)puVar26 >> 2) * in_x14;
        uVar8 = lVar23 + 1;
        if (in_x12 < uVar8) {
          func_0x00017f90(puVar32);
LAB_001432e4:
          func_0x00017514();
          goto LAB_001432e8;
        }
        uVar7 = ((long)puVar9 - (long)puVar26 >> 2) * in_x14;
        uVar12 = uVar7 * 2;
        if (uVar12 <= uVar8) {
          uVar12 = uVar8;
        }
        if (0xaaaaaaaaaaaaaa9 < uVar7) {
          uVar12 = in_x12;
        }
        if (uVar12 == 0) {
          lVar5 = 0;
        }
        else {
          if (in_x12 < uVar12) goto LAB_001432e4;
          lVar5 = __Znwm(uVar12 * 0xc);
        }
        unaff_x24 = uStack0000000000000018;
        puVar33 = (undefined8 *)(lVar5 + lVar23 * 0xc);
        *(undefined1 *)puVar33 = uVar1;
        *(undefined4 *)((long)puVar33 + 4) = 0;
        *(byte *)(puVar33 + 1) = bVar20;
        puVar9 = puVar33;
        puVar10 = puVar33;
        if (puVar11 != puVar26) {
          do {
            puVar27 = (undefined8 *)((long)puVar11 + -0xc);
            uVar1 = *(undefined1 *)((long)puVar11 + -4);
            puVar10 = (undefined8 *)((long)puVar9 + -0xc);
            *puVar10 = *puVar27;
            *(undefined1 *)((long)puVar9 + -4) = uVar1;
            puVar9 = puVar10;
            puVar11 = puVar27;
          } while (puVar27 != puVar26);
          puVar11 = (undefined8 *)*puVar32;
        }
        *puVar32 = puVar10;
        puVar22 = (undefined1 *)((long)puVar33 + 0xc);
        *plVar34 = (long)puVar22;
        *plVar25 = lVar5 + uVar12 * 0xc;
        if (puVar11 != (undefined8 *)0x0) {
          __ZdlPv(puVar11);
        }
        in_x12 = 0x1555555555555555;
        in_x13 = 0x18;
        in_x14 = -0x5555555555555555;
        puVar26 = puStack0000000000000020;
        unaff_x27 = in_stack_00000010;
      }
      *plVar34 = (long)puVar22;
      plVar21 = (long *)((long)plVar21 + 1);
      unaff_w23 = bVar20;
    }
    unaff_x24 = unaff_x24 + 1;
    if ((ulong)((in_stack_00000008[1] - *in_stack_00000008 >> 3) * in_x14) <= unaff_x24) {
      *(undefined2 *)(in_stack_00000000 + 0x5c) = 0x101;
      for (lVar23 = *(long *)(in_stack_00000000 + 0x40);
          lVar23 != *(long *)(in_stack_00000000 + 0x38); lVar23 = lVar23 + -0x80) {
      }
      *(long *)(in_stack_00000000 + 0x40) = *(long *)(in_stack_00000000 + 0x38);
      *(undefined4 *)(in_stack_00000000 + 0x50) = 0;
      uVar3 = (int)((ulong)(*(long *)(in_stack_00000000 + 0x10) - *(long *)(in_stack_00000000 + 8))
                   >> 3) * -0x55555555;
      uVar24 = *(uint *)(in_stack_00000000 + 0x70);
      if ((int)*(uint *)(in_stack_00000000 + 0x70) <= (int)uVar3) {
        uVar24 = uVar3;
      }
      *(undefined4 *)(in_stack_00000000 + 0x6c) = 0;
      *(uint *)(in_stack_00000000 + 0x70) = uVar24 & ((int)uVar24 >> 0x1f ^ 0xffffffffU);
      *(undefined1 *)(in_stack_00000000 + 0x248) = 1;
      return;
    }
    in_x9 = unaff_x24 * 0x18;
    in_x15 = (undefined8 *)(*in_stack_00000008 + in_x9);
    if ((char)*(byte *)((long)in_x15 + 0x17) < '\0') {
      param_1 = in_x15[1];
    }
    else {
      param_1 = (ulong)*(byte *)((long)in_x15 + 0x17);
    }
    in_x10 = *unaff_x27;
    unaff_x20 = in_x10 + unaff_x24 * in_x13;
  } while( true );
  while ((uVar30 = (ulong)uVar31, uVar30 < (ulong)((lVar16 >> 2) * -0x5555555555555555) &&
         (iVar29 < *(int *)(lVar5 + 0x24)))) {
    bVar20 = *(byte *)(lVar15 + uVar30 * 0xc);
    iVar28 = (int)uVar30;
    if (bVar20 == 9) {
      iVar17 = *(int *)(lVar5 + 0x54);
      iVar4 = 0;
      if (iVar17 != 0) {
        iVar4 = iVar29 / iVar17;
      }
      iVar29 = iVar17 + iVar4 * iVar17;
      bVar20 = 0;
code_r0x00137918:
      iVar17 = 1;
      if ((bVar20 & 0xe0) == 0xc0) {
        iVar17 = 2;
      }
      uVar31 = iVar17 + iVar28;
    }
    else {
      iVar29 = iVar29 + 1;
      if ((bVar20 & 0xfe) == 0xfc) {
        uVar31 = iVar28 + 6;
      }
      else if ((bVar20 & 0xfc) == 0xf8) {
        uVar31 = iVar28 + 5;
      }
      else if ((bVar20 & 0xf8) == 0xf0) {
        uVar31 = iVar28 + 4;
      }
      else {
        if ((bVar20 & 0xf0) != 0xe0) goto code_r0x00137918;
        uVar31 = iVar28 + 3;
      }
    }
  }
code_r0x0013786c:
  if (uVar7 < uVar12) {
    plVar21 = (long *)(lVar23 + (long)(int)uVar3 * 0x18);
    lVar15 = *plVar21;
    lVar16 = plVar21[1] - lVar15;
    if (lVar16 == 0 || *(int *)(lVar5 + 0x2c) < 1) {
      uVar31 = 0;
    }
    else {
      iVar29 = 0;
      uVar12 = 0;
      do {
        bVar20 = *(byte *)(lVar15 + uVar12 * 0xc);
        iVar28 = (int)uVar12;
        if (bVar20 == 9) {
          iVar17 = *(int *)(lVar5 + 0x54);
          iVar4 = 0;
          if (iVar17 != 0) {
            iVar4 = iVar29 / iVar17;
          }
          iVar29 = iVar17 + iVar4 * iVar17;
          bVar20 = 0;
code_r0x00137a24:
          iVar17 = 1;
          if ((bVar20 & 0xe0) == 0xc0) {
            iVar17 = 2;
          }
          uVar31 = iVar17 + iVar28;
        }
        else {
          iVar29 = iVar29 + 1;
          if ((bVar20 & 0xfe) == 0xfc) {
            uVar31 = iVar28 + 6;
          }
          else if ((bVar20 & 0xfc) == 0xf8) {
            uVar31 = iVar28 + 5;
          }
          else if ((bVar20 & 0xf8) == 0xf0) {
            uVar31 = iVar28 + 4;
          }
          else {
            if ((bVar20 & 0xf0) != 0xe0) goto code_r0x00137a24;
            uVar31 = iVar28 + 3;
          }
        }
        uVar12 = (ulong)uVar31;
      } while ((uVar12 < (ulong)((lVar16 >> 2) * -0x5555555555555555)) &&
              (iVar29 < *(int *)(lVar5 + 0x2c)));
    }
  }
  else {
    uVar31 = 0xffffffff;
  }
  if (uVar24 < uVar3) {
    uVar13 = uVar7;
    if (uVar7 < uVar8 + 1) {
      uVar13 = uVar8 + 1;
    }
    uVar13 = uVar13 - uVar8;
    if (uVar13 < 4) {
      uVar12 = 0;
    }
    else {
      lVar16 = 0;
      lVar19 = 0;
      lVar15 = 0;
      lVar18 = 0;
      uVar14 = uVar13 & 0xfffffffffffffffc;
      uVar8 = uVar14 + uVar8;
      plVar21 = (long *)(lVar23 + (long)(int)uVar24 * 0x18 + 0x30);
      uVar12 = uVar14;
      do {
        lVar16 = lVar16 + (plVar21[-5] - plVar21[-6] >> 2) * -0x5555555555555555;
        lVar19 = lVar19 + (plVar21[-2] - plVar21[-3] >> 2) * -0x5555555555555555;
        lVar15 = lVar15 + (plVar21[1] - *plVar21 >> 2) * -0x5555555555555555;
        lVar18 = lVar18 + (plVar21[4] - plVar21[3] >> 2) * -0x5555555555555555;
        plVar21 = plVar21 + 0xc;
        uVar12 = uVar12 - 4;
      } while (uVar12 != 0);
      uVar12 = lVar18 + lVar15 + lVar19 + lVar16;
      if (uVar13 == uVar14) goto code_r0x00137ba4;
    }
    plVar21 = (long *)(lVar23 + uVar8 * 0x18 + 8);
    do {
      uVar12 = uVar12 + (*plVar21 - plVar21[-1] >> 2) * -0x5555555555555555;
      uVar8 = uVar8 + 1;
      plVar21 = plVar21 + 3;
    } while (uVar8 < uVar7);
  }
  else {
    uVar12 = 0;
  }
code_r0x00137ba4:
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (extraout_x8,uVar12 + (uVar12 >> 3));
  while (((iVar29 = (int)uVar30, iVar29 < (int)uVar31 || ((int)uVar24 < (int)uVar3)) &&
         ((int)uVar24 <
          (int)((ulong)(*(long *)(lVar5 + 0x10) - *(long *)(lVar5 + 8)) >> 3) * -0x55555555))) {
    plVar21 = (long *)(*(long *)(lVar5 + 8) + (long)(int)uVar24 * 0x18);
    lVar23 = *plVar21;
    if (iVar29 < (int)((ulong)(plVar21[1] - lVar23) >> 2) * -0x55555555) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                (extraout_x8,(long)*(char *)(lVar23 + (long)iVar29 * 0xc));
      uVar30 = (ulong)(iVar29 + 1);
    }
    else {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(extraout_x8,10);
      uVar30 = 0;
      uVar24 = uVar24 + 1;
    }
  }
  return;
}

