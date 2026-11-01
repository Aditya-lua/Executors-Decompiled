
long FUN_006df278(undefined8 param_1,undefined8 param_2,long param_3)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  long unaff_x20;
  long lVar12;
  undefined **unaff_x22;
  undefined8 *puVar13;
  long lVar14;
  long *unaff_x25;
  undefined8 *puVar15;
  long *unaff_x26;
  undefined8 unaff_x27;
  long lVar16;
  undefined1 auVar17 [16];
  long in_stack_00000008;
  long in_stack_00000010;
  long *in_stack_00000018;
  ulong *in_stack_00000020;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  do {
    lVar14 = *unaff_x26;
    if (lVar14 != 0 && *(int *)(lVar14 + 8) == *(int *)(unaff_x22 + 0x18d)) {
      plVar1 = (long *)func_0x006db828(unaff_x27,lVar14 + 0x20);
      uVar11 = *(undefined8 *)(lVar14 + 0x20);
      lVar12 = *plVar1;
      puVar13 = *(undefined8 **)(unaff_x20 + 0x88);
      if (puVar13 < *(undefined8 **)(unaff_x20 + 0x90)) {
        *puVar13 = uVar11;
        puVar13[1] = lVar12;
        puVar10 = puVar13 + 2;
      }
      else {
        puVar15 = (undefined8 *)*in_stack_00000020;
        lVar16 = (long)puVar13 - (long)puVar15 >> 4;
        uVar3 = lVar16 + 1;
        if (uVar3 >> 0x3c != 0) {
          func_0x00017f90(in_stack_00000020);
LAB_006df3c4:
          auVar17 = func_0x00017514();
          uVar3 = auVar17._8_8_;
          lVar14 = auVar17._0_8_;
          if ((((param_3 == 0) || (*(int *)(param_3 + 8) != iRam0000000000a27cb8)) ||
              (*(char *)(param_3 + 0x28) != '\0')) || (*(long *)(lVar14 + 0x68) == 0))
          goto code_r0x006df408;
          uVar6 = *(ulong *)(param_3 + 0x48);
          if (uVar6 == *(ulong *)(lVar14 + 0x70)) goto code_r0x006df408;
          uVar4 = 0;
          uVar8 = *(long *)(lVar14 + 0x60) - 1;
          uVar7 = uVar6 >> 4 ^ uVar6 >> 9;
          break;
        }
        uVar4 = (long)*(undefined8 **)(unaff_x20 + 0x90) - (long)puVar15;
        uVar6 = (long)uVar4 >> 3;
        if (uVar6 <= uVar3) {
          uVar6 = uVar3;
        }
        if (0x7fffffffffffffef < uVar4) {
          uVar6 = 0xfffffffffffffff;
        }
        if (uVar6 == 0) {
          lVar2 = 0;
          puVar10 = (undefined8 *)(lVar16 * 0x10);
          *puVar10 = uVar11;
          puVar10[1] = lVar12;
        }
        else {
          if (uVar6 >> 0x3c != 0) goto LAB_006df3c4;
          lVar2 = __Znwm(uVar6 << 4);
          puVar10 = (undefined8 *)(lVar2 + lVar16 * 0x10);
          *puVar10 = uVar11;
          puVar10[1] = lVar12;
        }
        puVar5 = puVar10;
        if (puVar13 != puVar15) {
          do {
            uVar11 = puVar13[-2];
            puVar5[-1] = puVar13[-1];
            puVar5[-2] = uVar11;
            puVar5 = puVar5 + -2;
            puVar13 = puVar13 + -2;
          } while (puVar13 != puVar15);
          puVar13 = (undefined8 *)*in_stack_00000020;
        }
        unaff_x22 = &PTR_s_pixelFormat_00a27000;
        puVar10 = puVar10 + 2;
        *(undefined8 **)(unaff_x20 + 0x80) = puVar5;
        *(undefined8 **)(unaff_x20 + 0x88) = puVar10;
        *(ulong *)(unaff_x20 + 0x90) = lVar2 + uVar6 * 0x10;
        if (puVar13 != (undefined8 *)0x0) {
          __ZdlPv(puVar13);
        }
        unaff_x25 = in_stack_00000018;
      }
      *(undefined8 **)(unaff_x20 + 0x88) = puVar10;
      *plVar1 = lVar14;
    }
    unaff_x26 = unaff_x26 + 1;
    if (unaff_x26 == unaff_x25) {
      return in_stack_00000008 - in_stack_00000010 >> 4;
    }
  } while( true );
  while( true ) {
    uVar4 = uVar4 + 1;
    uVar7 = uVar4 + uVar7;
    if (uVar9 == *(ulong *)(lVar14 + 0x70) || uVar8 < uVar4) break;
    uVar7 = uVar7 & uVar8;
    uVar9 = *(ulong *)(*(long *)(lVar14 + 0x58) + uVar7 * 0x10);
    if (uVar9 == uVar6) {
      lVar12 = *(long *)(*(long *)(lVar14 + 0x58) + uVar7 * 0x10 + 8);
      if (lVar12 != 0) {
        param_3 = *(long *)(lVar12 + 0x58);
      }
      break;
    }
  }
code_r0x006df408:
  lVar12 = *(long *)(lVar14 + 0xa0);
  if ((ulong)(lVar12 * 3) >> 2 <= *(ulong *)(lVar14 + 0xa8)) {
    if ((*(ulong *)(lVar14 + 0xa8) != 0) && (*(ulong *)(lVar14 + 0xb0) != uVar3)) {
      uVar6 = 0;
      uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
      do {
        uVar4 = uVar4 & lVar12 - 1U;
        uVar7 = *(ulong *)(*(long *)(lVar14 + 0x98) + uVar4 * 0x10);
        if (uVar7 == uVar3) goto code_r0x006df470;
        uVar6 = uVar6 + 1;
        uVar4 = uVar6 + uVar4;
      } while (uVar7 != *(ulong *)(lVar14 + 0xb0) && uVar6 <= lVar12 - 1U);
    }
    func_0x006db93c();
    lVar12 = *(long *)(lVar14 + 0xa0);
  }
code_r0x006df470:
  uVar4 = uVar3 >> 4 ^ uVar3 >> 9;
  lVar16 = *(long *)(lVar14 + 0x98);
  uVar6 = uVar4 & lVar12 - 1U;
  uVar7 = *(ulong *)(lVar16 + uVar6 * 0x10);
  if (uVar7 != *(ulong *)(lVar14 + 0xb0)) {
    lVar2 = 1;
    do {
      if (uVar7 == uVar3) goto code_r0x006df4d0;
      uVar6 = uVar6 + lVar2 & lVar12 - 1U;
      uVar7 = *(ulong *)(lVar16 + uVar6 * 0x10);
      lVar2 = lVar2 + 1;
    } while (uVar7 != *(ulong *)(lVar14 + 0xb0));
  }
  *(ulong *)(lVar16 + uVar6 * 0x10) = uVar3;
  *(long *)(lVar14 + 0xa8) = *(long *)(lVar14 + 0xa8) + 1;
code_r0x006df4d0:
  *(long *)(lVar16 + uVar6 * 0x10 + 8) = param_3;
  uStack_40 = 0;
  uStack_38 = 0;
  lVar12 = func_0x006deab4(param_3,&uStack_40,lVar14 + 0x58,1,*(undefined8 *)(lVar14 + 0x20),
                           *(undefined8 *)(lVar14 + 0x28),*(undefined8 *)(lVar14 + 0x50));
  if ((int)lVar12 != 0xf) {
    plVar1 = *(long **)(lVar14 + 0x10);
    lVar14 = plVar1[1];
    if ((ulong)(lVar14 * 3) >> 2 <= (ulong)plVar1[2]) {
      if ((plVar1[2] != 0) && (plVar1[3] != uVar3)) {
        uVar6 = 0;
        uVar7 = uVar4;
        do {
          uVar7 = uVar7 & lVar14 - 1U;
          uVar8 = *(ulong *)(*plVar1 + uVar7 * 0x10);
          if (uVar8 == uVar3) goto code_r0x006df56c;
          uVar6 = uVar6 + 1;
          uVar7 = uVar6 + uVar7;
        } while (uVar8 != plVar1[3] && uVar6 <= lVar14 - 1U);
      }
      func_0x006d3810(plVar1);
      lVar14 = plVar1[1];
    }
code_r0x006df56c:
    lVar16 = *plVar1;
    uVar4 = uVar4 & lVar14 - 1U;
    uVar6 = *(ulong *)(lVar16 + uVar4 * 0x10);
    if (uVar6 != plVar1[3]) {
      lVar2 = 1;
      do {
        if (uVar6 == uVar3) goto code_r0x006df5c8;
        uVar4 = uVar4 + lVar2 & lVar14 - 1U;
        uVar6 = *(ulong *)(lVar16 + uVar4 * 0x10);
        lVar2 = lVar2 + 1;
      } while (uVar6 != plVar1[3]);
    }
    *(ulong *)(lVar16 + uVar4 * 0x10) = uVar3;
    plVar1[2] = plVar1[2] + 1;
code_r0x006df5c8:
    *(int *)(lVar16 + uVar4 * 0x10 + 8) = (int)lVar12;
  }
  return lVar12;
}

