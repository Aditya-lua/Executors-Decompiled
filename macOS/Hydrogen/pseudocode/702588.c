
long * FUN_00702588(long param_1,long *param_2,undefined8 *param_3,long *param_4)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  long *plVar5;
  long lVar6;
  int iVar7;
  uint uVar8;
  long *plVar9;
  long unaff_x22;
  long lVar10;
  long *unaff_x23;
  int iVar11;
  undefined8 uVar12;
  undefined1 auVar13 [16];
  long in_stack_00000000;
  long in_stack_00000008;
  
  if (*(int *)((long)param_2 + 0xc) == 6) {
    lVar10 = *param_2;
    unaff_x23 = (long *)func_0x006fb89c(lVar10,param_3);
    if (*(int *)((long)unaff_x23 + 0xc) == 0) {
      while (((lVar6 = *(long *)(lVar10 + 0x10), lVar6 != 0 &&
              ((*(byte *)(lVar6 + 3) >> 1 & 1) == 0)) &&
             (plVar5 = (long *)func_0x006fe740(lVar6,1,*(undefined8 *)
                                                        (*(long *)(param_1 + 0x18) + 0x3e0)),
             plVar5 != (long *)0x0))) {
        unaff_x22 = lVar10;
        if (*(int *)((long)plVar5 + 0xc) == 7) goto LAB_00702744;
LAB_00702668:
        in_stack_00000008 = plVar5[1];
        in_stack_00000000 = *plVar5;
        iVar11 = 99;
        do {
          lVar10 = in_stack_00000000;
          if (in_stack_00000008._4_4_ == 6) {
            unaff_x23 = (long *)func_0x006fb89c(in_stack_00000000,param_3);
            if (((*(int *)((long)unaff_x23 + 0xc) != 0) ||
                (lVar6 = *(long *)(lVar10 + 0x10), lVar6 == 0)) ||
               (((*(byte *)(lVar6 + 3) >> 1 & 1) != 0 ||
                (plVar5 = (long *)func_0x006fe740(lVar6,1,*(undefined8 *)
                                                           (*(long *)(param_1 + 0x18) + 0x3e0)),
                plVar5 == (long *)0x0)))) goto LAB_007025c0;
            iVar7 = *(int *)((long)plVar5 + 0xc);
            unaff_x22 = lVar10;
          }
          else {
            plVar5 = (long *)func_0x006fe794(param_1);
            iVar7 = *(int *)((long)plVar5 + 0xc);
            param_2 = (long *)register0x00000008;
            if (iVar7 == 0) goto LAB_007027c8;
          }
          if (iVar7 == 7) {
            param_2 = (long *)register0x00000008;
            goto LAB_00702744;
          }
          in_stack_00000008 = plVar5[1];
          in_stack_00000000 = *plVar5;
          iVar11 = iVar11 + -1;
        } while (iVar11 != 0);
        func_0x006eceb0(param_1,"\'__newindex\' chain too long; possible loop");
        lVar10 = unaff_x22;
      }
    }
LAB_007025c0:
    if (*(char *)(lVar10 + 4) != '\0') {
LAB_007027d8:
      auVar13 = func_0x006ed124(param_1);
      lVar6 = auVar13._8_8_;
      lVar10 = auVar13._0_8_;
      if (lVar10 == lVar6) {
        return (long *)0x0;
      }
      uVar3 = (uint)*(byte *)(lVar10 + 0x18) - (uint)*(byte *)(lVar6 + 0x18);
      if (uVar3 == 0) {
        uVar1 = *(uint *)(lVar10 + 0x14);
        uVar2 = *(uint *)(lVar6 + 0x14);
        uVar4 = uVar1;
        if (uVar2 <= uVar1) {
          uVar4 = uVar2;
        }
        uVar8 = 1;
        if (uVar2 > uVar1) {
          uVar8 = 0xffffffff;
        }
        uVar3 = 0;
        if (uVar1 != uVar2) {
          uVar3 = uVar8;
        }
        uVar4 = _memcmp((byte *)(lVar10 + 0x18),(byte *)(lVar6 + 0x18),uVar4);
        if (uVar4 != 0) {
          uVar3 = uVar4;
        }
      }
      return (long *)(ulong)uVar3;
    }
    *(undefined1 *)(lVar10 + 3) = 0;
    plVar5 = (long *)__dyld_get_image_header(0);
    if (unaff_x23 == plVar5 + 0x9d1ba1) {
      plVar5 = (long *)func_0x006fbbdc(param_1,lVar10,param_3);
      unaff_x23 = plVar5;
    }
    *(int *)(param_1 + 0x54) = (int)((ulong)((long)unaff_x23 - *(long *)(lVar10 + 0x20)) >> 5);
    lVar6 = *param_4;
    unaff_x23[1] = param_4[1];
    *unaff_x23 = lVar6;
    if (((4 < *(int *)((long)param_4 + 0xc)) && ((*(byte *)(lVar10 + 1) >> 2 & 1) != 0)) &&
       ((*(byte *)(*param_4 + 1) & 3) != 0)) {
      plVar5 = (long *)func_0x006f0ea0(param_1,lVar10);
    }
  }
  else {
    plVar5 = (long *)func_0x006fe794(param_1,param_2,1);
    if (*(int *)((long)plVar5 + 0xc) == 0) {
LAB_007027c8:
      func_0x006ed074(param_1,param_2,param_3);
      goto LAB_007027d8;
    }
    if (*(int *)((long)plVar5 + 0xc) != 7) goto LAB_00702668;
LAB_00702744:
    plVar9 = *(long **)(param_1 + 8);
    lVar10 = *plVar5;
    plVar9[1] = plVar5[1];
    *plVar9 = lVar10;
    lVar10 = *(long *)(param_1 + 8);
    lVar6 = *param_2;
    *(long *)(lVar10 + 0x18) = param_2[1];
    *(long *)(lVar10 + 0x10) = lVar6;
    lVar10 = *(long *)(param_1 + 8);
    uVar12 = *param_3;
    *(undefined8 *)(lVar10 + 0x28) = param_3[1];
    *(undefined8 *)(lVar10 + 0x20) = uVar12;
    lVar10 = *(long *)(param_1 + 8);
    lVar6 = *param_4;
    *(long *)(lVar10 + 0x38) = param_4[1];
    *(long *)(lVar10 + 0x30) = lVar6;
    lVar10 = *(long *)(param_1 + 8);
    if (*(long *)(param_1 + 0x28) - lVar10 < 0x41) {
      func_0x006ee1d4(param_1,4);
      lVar10 = *(long *)(param_1 + 8);
    }
    *(long *)(param_1 + 8) = lVar10 + 0x40;
    plVar5 = (long *)func_0x006ee550(param_1,lVar10,0);
  }
  return plVar5;
}

