
long FUN_006df37c(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 *unaff_x19;
  long unaff_x20;
  long *plVar12;
  long lVar13;
  undefined **unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  undefined8 *puVar14;
  long *unaff_x25;
  long *unaff_x26;
  long lVar15;
  undefined8 unaff_x27;
  undefined1 auVar16 [16];
  long in_stack_00000008;
  long in_stack_00000010;
  long *in_stack_00000018;
  ulong *in_stack_00000020;
  long *in_stack_00000028;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  while( true ) {
    if (unaff_x23 != (undefined8 *)0x0) {
      __ZdlPv(unaff_x23);
    }
    while( true ) {
      *(undefined8 **)(unaff_x20 + 0x88) = unaff_x19;
      *in_stack_00000028 = unaff_x24;
      do {
        unaff_x26 = unaff_x26 + 1;
        if (unaff_x26 == unaff_x25) {
          return in_stack_00000008 - in_stack_00000010 >> 4;
        }
        unaff_x24 = *unaff_x26;
      } while (unaff_x24 == 0 || *(int *)(unaff_x24 + 8) != *(int *)(unaff_x22 + 0x18d));
      in_stack_00000028 = (long *)func_0x006db828(unaff_x27,unaff_x24 + 0x20);
      uVar11 = *(undefined8 *)(unaff_x24 + 0x20);
      lVar13 = *in_stack_00000028;
      unaff_x23 = *(undefined8 **)(unaff_x20 + 0x88);
      if (*(undefined8 **)(unaff_x20 + 0x90) <= unaff_x23) break;
      *unaff_x23 = uVar11;
      unaff_x23[1] = lVar13;
      unaff_x19 = unaff_x23 + 2;
    }
    puVar14 = (undefined8 *)*in_stack_00000020;
    lVar15 = (long)unaff_x23 - (long)puVar14 >> 4;
    uVar3 = lVar15 + 1;
    if (uVar3 >> 0x3c != 0) break;
    uVar4 = (long)*(undefined8 **)(unaff_x20 + 0x90) - (long)puVar14;
    uVar6 = (long)uVar4 >> 3;
    if (uVar6 <= uVar3) {
      uVar6 = uVar3;
    }
    if (0x7fffffffffffffef < uVar4) {
      uVar6 = 0xfffffffffffffff;
    }
    if (uVar6 == 0) {
      lVar2 = 0;
      puVar1 = (undefined8 *)(lVar15 * 0x10);
      *puVar1 = uVar11;
      puVar1[1] = lVar13;
    }
    else {
      if (uVar6 >> 0x3c != 0) goto code_r0x006df3c4;
      lVar2 = __Znwm(uVar6 << 4);
      puVar1 = (undefined8 *)(lVar2 + lVar15 * 0x10);
      *puVar1 = uVar11;
      puVar1[1] = lVar13;
    }
    puVar5 = puVar1;
    if (unaff_x23 != puVar14) {
      do {
        uVar11 = unaff_x23[-2];
        puVar5[-1] = unaff_x23[-1];
        puVar5[-2] = uVar11;
        puVar5 = puVar5 + -2;
        unaff_x23 = unaff_x23 + -2;
      } while (unaff_x23 != puVar14);
      unaff_x23 = (undefined8 *)*in_stack_00000020;
    }
    unaff_x22 = &PTR_s_pixelFormat_00a27000;
    unaff_x19 = puVar1 + 2;
    *(undefined8 **)(unaff_x20 + 0x80) = puVar5;
    *(undefined8 **)(unaff_x20 + 0x88) = unaff_x19;
    *(ulong *)(unaff_x20 + 0x90) = lVar2 + uVar6 * 0x10;
    unaff_x25 = in_stack_00000018;
  }
  func_0x00017f90(in_stack_00000020);
code_r0x006df3c4:
  auVar16 = func_0x00017514();
  uVar3 = auVar16._8_8_;
  lVar13 = auVar16._0_8_;
  if ((((param_3 != 0) && (*(int *)(param_3 + 8) == iRam0000000000a27cb8)) &&
      (*(char *)(param_3 + 0x28) == '\0')) && (*(long *)(lVar13 + 0x68) != 0)) {
    uVar6 = *(ulong *)(param_3 + 0x48);
    if (uVar6 != *(ulong *)(lVar13 + 0x70)) {
      uVar4 = 0;
      uVar9 = *(long *)(lVar13 + 0x60) - 1;
      uVar8 = uVar6 >> 4 ^ uVar6 >> 9;
      do {
        uVar8 = uVar8 & uVar9;
        uVar10 = *(ulong *)(*(long *)(lVar13 + 0x58) + uVar8 * 0x10);
        if (uVar10 == uVar6) {
          lVar15 = *(long *)(*(long *)(lVar13 + 0x58) + uVar8 * 0x10 + 8);
          if (lVar15 != 0) {
            param_3 = *(long *)(lVar15 + 0x58);
          }
          break;
        }
        uVar4 = uVar4 + 1;
        uVar8 = uVar4 + uVar8;
      } while (uVar10 != *(ulong *)(lVar13 + 0x70) && uVar4 <= uVar9);
    }
  }
  lVar15 = *(long *)(lVar13 + 0xa0);
  if ((ulong)(lVar15 * 3) >> 2 <= *(ulong *)(lVar13 + 0xa8)) {
    if ((*(ulong *)(lVar13 + 0xa8) != 0) && (*(ulong *)(lVar13 + 0xb0) != uVar3)) {
      uVar6 = 0;
      uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
      do {
        uVar4 = uVar4 & lVar15 - 1U;
        uVar8 = *(ulong *)(*(long *)(lVar13 + 0x98) + uVar4 * 0x10);
        if (uVar8 == uVar3) goto code_r0x006df470;
        uVar6 = uVar6 + 1;
        uVar4 = uVar6 + uVar4;
      } while (uVar8 != *(ulong *)(lVar13 + 0xb0) && uVar6 <= lVar15 - 1U);
    }
    func_0x006db93c();
    lVar15 = *(long *)(lVar13 + 0xa0);
  }
code_r0x006df470:
  uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
  lVar2 = *(long *)(lVar13 + 0x98);
  uVar6 = uVar4 & lVar15 - 1U;
  uVar8 = *(ulong *)(lVar2 + uVar6 * 0x10);
  if (uVar8 != *(ulong *)(lVar13 + 0xb0)) {
    lVar7 = 1;
    do {
      if (uVar8 == uVar3) goto code_r0x006df4d0;
      uVar6 = uVar6 + lVar7 & lVar15 - 1U;
      uVar8 = *(ulong *)(lVar2 + uVar6 * 0x10);
      lVar7 = lVar7 + 1;
    } while (uVar8 != *(ulong *)(lVar13 + 0xb0));
  }
  *(ulong *)(lVar2 + uVar6 * 0x10) = uVar3;
  *(long *)(lVar13 + 0xa8) = *(long *)(lVar13 + 0xa8) + 1;
code_r0x006df4d0:
  *(long *)(lVar2 + uVar6 * 0x10 + 8) = param_3;
  uStack_40 = 0;
  uStack_38 = 0;
  lVar15 = func_0x006deab4(param_3,&uStack_40,lVar13 + 0x58,1,*(undefined8 *)(lVar13 + 0x20),
                           *(undefined8 *)(lVar13 + 0x28),*(undefined8 *)(lVar13 + 0x50));
  if ((int)lVar15 != 0xf) {
    plVar12 = *(long **)(lVar13 + 0x10);
    lVar13 = plVar12[1];
    if ((ulong)(lVar13 * 3) >> 2 <= (ulong)plVar12[2]) {
      if ((plVar12[2] != 0) && (plVar12[3] != uVar3)) {
        uVar6 = 0;
        uVar8 = uVar4;
        do {
          uVar8 = uVar8 & lVar13 - 1U;
          uVar9 = *(ulong *)(*plVar12 + uVar8 * 0x10);
          if (uVar9 == uVar3) goto code_r0x006df56c;
          uVar6 = uVar6 + 1;
          uVar8 = uVar6 + uVar8;
        } while (uVar9 != plVar12[3] && uVar6 <= lVar13 - 1U);
      }
      func_0x006d3810(plVar12);
      lVar13 = plVar12[1];
    }
code_r0x006df56c:
    lVar2 = *plVar12;
    uVar4 = uVar4 & lVar13 - 1U;
    uVar6 = *(ulong *)(lVar2 + uVar4 * 0x10);
    if (uVar6 != plVar12[3]) {
      lVar7 = 1;
      do {
        if (uVar6 == uVar3) goto code_r0x006df5c8;
        uVar4 = uVar4 + lVar7 & lVar13 - 1U;
        uVar6 = *(ulong *)(lVar2 + uVar4 * 0x10);
        lVar7 = lVar7 + 1;
      } while (uVar6 != plVar12[3]);
    }
    *(ulong *)(lVar2 + uVar4 * 0x10) = uVar3;
    plVar12[2] = plVar12[2] + 1;
code_r0x006df5c8:
    *(int *)(lVar2 + uVar4 * 0x10 + 8) = (int)lVar15;
  }
  return lVar15;
}

