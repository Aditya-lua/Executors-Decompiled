
void FUN_005c5b90(long *param_1,uint *param_2)

{
  undefined8 uVar1;
  ushort uVar2;
  ulong uVar3;
  long *plVar4;
  code *pcVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  long extraout_x8;
  ulong uVar9;
  long *plVar10;
  long *plVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  
  if (*(long *)(param_2 + 0x10) != 0) {
    *(long *)(param_2 + 0x10) = *(long *)(param_2 + 0x10) + -1;
    if (((int)*(long *)(param_2 + 8) == 1) && (*(long *)(param_2 + 10) == 0)) {
      lVar7 = *(long *)(param_2 + 0xc);
      for (lVar13 = *(long *)(param_2 + 0xe); lVar13 != 0; lVar13 = lVar13 + -1) {
        lVar7 = *(long *)(lVar7 + (ulong)*(ushort *)(lVar7 + 0x37a) * 8 + 0x380);
      }
      uVar2 = *(ushort *)(lVar7 + 0x37a);
      param_2[8] = 1;
      param_2[9] = 0;
      *(long *)(param_2 + 10) = lVar7;
      param_2[0xc] = 0;
      param_2[0xd] = 0;
      *(ulong *)(param_2 + 0xe) = (ulong)uVar2;
      plVar10 = *(long **)(param_2 + 10);
      lVar13 = *(long *)(param_2 + 0xc);
      uVar12 = *(ulong *)(param_2 + 0xe);
    }
    else {
      if (*(long *)(param_2 + 8) == 0) {
        plVar6 = (long *)func_0x007a23bc(&UNK_009f27c8);
        lVar7 = extraout_x8;
LAB_005c5d98:
        uVar1 = 0x380;
        if (lVar7 != 0) {
          uVar1 = 0x3e0;
        }
        func_0x00187bd4(plVar6,uVar1,8);
        func_0x007a23bc(&UNK_009f2780);
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x5c5dc0);
        (*pcVar5)();
      }
      plVar10 = *(long **)(param_2 + 10);
      lVar13 = *(long *)(param_2 + 0xc);
      uVar12 = *(ulong *)(param_2 + 0xe);
    }
    if (uVar12 == 0) {
      plVar6 = plVar10;
      lVar7 = lVar13;
      do {
        plVar10 = (long *)*plVar6;
        if (plVar10 == (long *)0x0) goto LAB_005c5d98;
        lVar13 = lVar7 + 1;
        uVar12 = (ulong)*(ushort *)(plVar6 + 0x6f);
        uVar1 = 0x380;
        if (lVar7 != 0) {
          uVar1 = 0x3e0;
        }
        func_0x00187bd4(plVar6,uVar1,8);
        plVar6 = plVar10;
        lVar7 = lVar13;
      } while (uVar12 == 0);
    }
    uVar3 = uVar12 - 1;
    if (lVar13 == 0) {
      plVar6 = plVar10;
      uVar9 = uVar3;
    }
    else {
      plVar6 = (long *)plVar10[uVar12 + 0x6f];
      while (lVar13 = lVar13 + -1, lVar13 != 0) {
        plVar6 = (long *)plVar6[(ulong)*(ushort *)((long)plVar6 + 0x37a) + 0x70];
      }
      uVar9 = (ulong)*(ushort *)((long)plVar6 + 0x37a);
    }
    lVar14 = plVar10[uVar3 * 9 + 0xd];
    lVar13 = plVar10[uVar3 * 9 + 0xc];
    lVar7 = plVar10[uVar3 * 9 + 0xe];
    param_1[4] = plVar10[uVar3 * 9 + 0xf];
    param_1[3] = lVar7;
    lVar7 = plVar10[uVar3 * 9 + 0x10];
    lVar16 = plVar10[uVar3 * 9 + 0x13];
    lVar15 = plVar10[uVar3 * 9 + 0x12];
    param_1[6] = plVar10[uVar3 * 9 + 0x11];
    param_1[5] = lVar7;
    param_1[8] = lVar16;
    param_1[7] = lVar15;
    *(long **)(param_2 + 10) = plVar6;
    param_2[0xc] = 0;
    param_2[0xd] = 0;
    *(ulong *)(param_2 + 0xe) = uVar9;
    lVar7 = plVar10[uVar12];
    param_1[9] = plVar10[uVar3 * 9 + 0x14];
    param_1[2] = lVar14;
    param_1[1] = lVar13;
    *param_1 = lVar7;
    return;
  }
  plVar6 = *(long **)(param_2 + 2);
  plVar10 = *(long **)(param_2 + 4);
  lVar7 = *(long *)(param_2 + 6);
  param_2[0] = 0;
  param_2[1] = 0;
  if ((*param_2 & 1) == 0) goto LAB_005c5d68;
  if (plVar6 == (long *)0x0) {
    for (; plVar6 = plVar10, lVar7 != 0; lVar7 = lVar7 + -1) {
      plVar10 = (long *)plVar6[0x70];
    }
    plVar8 = (long *)0x0;
    plVar10 = (long *)0x0;
    plVar4 = (long *)*plVar6;
    if ((long *)*plVar6 != (long *)0x0) goto LAB_005c5c38;
LAB_005c5d44:
    plVar11 = plVar6;
  }
  else {
    plVar8 = plVar10;
    plVar4 = (long *)*plVar6;
    if ((long *)*plVar6 == (long *)0x0) goto LAB_005c5d44;
LAB_005c5c38:
    do {
      plVar11 = plVar4;
      plVar8 = (long *)((long)plVar10 + 1);
      uVar1 = 0x380;
      if (plVar10 != (long *)0x0) {
        uVar1 = 0x3e0;
      }
      func_0x00187bd4(plVar6,uVar1,8);
      plVar6 = plVar11;
      plVar10 = plVar8;
      plVar4 = (long *)*plVar11;
    } while ((long *)*plVar11 != (long *)0x0);
  }
  uVar1 = 0x380;
  if (plVar8 != (long *)0x0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(plVar11,uVar1,8);
LAB_005c5d68:
  param_1[1] = -0x8000000000000000;
  return;
}

