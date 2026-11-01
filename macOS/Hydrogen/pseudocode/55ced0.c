
void FUN_0055ced0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  ushort uVar1;
  ushort uVar2;
  long lVar3;
  long *plVar4;
  code *pcVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 *extraout_x8;
  long **pplVar8;
  long lVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long *plVar13;
  ulong uVar12;
  long *plVar14;
  long *plVar15;
  long *unaff_x23;
  long lVar16;
  ulong uVar17;
  long *plVar18;
  long lVar19;
  undefined1 auVar20 [16];
  undefined8 uStack0000000000000018;
  long *plStack_d0;
  long *plStack_c0;
  long lStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long *plStack_90;
  long *plStack_88;
  long lStack_80;
  long *plStack_78;
  long alStack_70 [2];
  
  lVar6 = *unaff_x23;
  *unaff_x23 = lVar6 + -1;
  LORelease();
  if (lVar6 == 1) {
    func_0x005d2ac4(&uStack0000000000000018);
  }
  lVar6 = 8;
  func_0x00187bd4();
  __Unwind_Resume(param_1);
  auVar20 = func_0x007a2668();
  plVar15 = auVar20._8_8_;
  puVar10 = auVar20._0_8_;
  plVar18 = (long *)*puVar10;
  uVar1 = *(ushort *)((long)plVar18 + 0x16a);
  if (uVar1 < 0xb) {
    lVar9 = puVar10[1];
    uVar17 = puVar10[2];
    plVar14 = plVar18 + uVar17 * 3 + 1;
    if ((ulong)uVar1 < uVar17 + 1) {
      lVar16 = *plVar15;
      plVar14[1] = plVar15[1];
      *plVar14 = lVar16;
      plVar14[2] = plVar15[2];
    }
    else {
      lVar16 = uVar1 - uVar17;
      _memmove(plVar18 + (uVar17 + 1) * 3 + 1,plVar14,lVar16 * 0x18);
      lVar19 = *plVar15;
      plVar14[1] = plVar15[1];
      *plVar14 = lVar19;
      plVar14[2] = plVar15[2];
      _memmove(plVar18 + uVar17 + 0x23,plVar18 + uVar17 + 0x22,lVar16 * 8);
    }
    plVar18[uVar17 + 0x22] = lVar6;
    *(ushort *)((long)plVar18 + 0x16a) = uVar1 + 1;
    goto LAB_0055d45c;
  }
  lStack_b8 = puVar10[1];
  uVar17 = puVar10[2];
  plStack_c0 = plVar18;
  if (uVar17 < 5) {
    uStack_b0 = 4;
code_r0x0055d034:
    func_0x0055cd88(&lStack_a8,&plStack_c0);
    plVar18 = &lStack_80;
    pplVar8 = &plStack_88;
  }
  else {
    uStack_b0 = uVar17;
    if (uVar17 == 5) goto code_r0x0055d034;
    plVar18 = alStack_70;
    if (uVar17 == 6) {
      uStack_b0 = 5;
      func_0x0055cd88(&lStack_a8,&plStack_c0);
      uVar17 = 0;
    }
    else {
      uStack_b0 = 6;
      func_0x0055cd88(&lStack_a8,&plStack_c0);
      uVar17 = uVar17 - 7;
    }
    pplVar8 = &plStack_78;
  }
  lVar9 = *plVar18;
  plVar18 = *pplVar8;
  uVar1 = *(ushort *)((long)plVar18 + 0x16a);
  plVar14 = plVar18 + uVar17 * 3 + 1;
  lVar16 = uVar1 - uVar17;
  if (uVar1 < uVar17 || lVar16 == 0) {
    lVar16 = *plVar15;
    plVar14[1] = plVar15[1];
    *plVar14 = lVar16;
    plVar14[2] = plVar15[2];
  }
  else {
    _memmove(plVar18 + (uVar17 + 1) * 3 + 1,plVar14,lVar16 * 0x18);
    lVar19 = *plVar15;
    plVar14[1] = plVar15[1];
    *plVar14 = lVar19;
    plVar14[2] = plVar15[2];
    _memmove(plVar18 + uVar17 + 0x23,plVar18 + uVar17 + 0x22,lVar16 * 8);
  }
  plVar18[uVar17 + 0x22] = lVar6;
  *(ushort *)((long)plVar18 + 0x16a) = uVar1 + 1;
  if (lStack_a0 == 2) {
LAB_0055d45c:
    *extraout_x8 = plVar18;
    extraout_x8[1] = lVar9;
    extraout_x8[2] = uVar17;
    return;
  }
  plStack_d0 = plStack_78;
  plVar14 = (long *)*plStack_88;
  lVar6 = alStack_70[0];
  plVar15 = plStack_90;
  if (plVar14 != (long *)0x0) {
    plVar13 = plStack_88;
    do {
      plVar4 = plStack_78;
      plVar15 = plStack_90;
      lVar19 = lStack_98;
      lVar16 = lStack_a0;
      lVar6 = lStack_a8;
      uVar1 = *(ushort *)(plVar13 + 0x2d);
      uVar12 = (ulong)uVar1;
      if (alStack_70[0] != lStack_80) {
        func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
        goto LAB_0055d5d8;
      }
      uVar2 = *(ushort *)((long)plVar14 + 0x16a);
      uVar11 = (ulong)uVar2;
      if (uVar2 < 0xb) {
        plVar15 = plVar14 + uVar12 * 3 + 1;
        if (uVar1 < uVar2) {
          _memmove(plVar14 + (uVar12 + 1) * 3 + 1,plVar15,(uVar11 - uVar12) * 0x18);
          *plVar15 = lStack_a8;
          plVar15[1] = lStack_a0;
          plVar15[2] = lStack_98;
          lVar6 = (uVar11 - uVar12) * 8;
          _memmove(plVar14 + uVar12 + 0x23,plVar14 + uVar12 + 0x22,lVar6);
          plVar14[uVar12 + 0x22] = (long)plStack_90;
          _memmove(plVar14 + uVar12 + 0x30,plVar14 + uVar12 + 0x2f,lVar6);
        }
        else {
          *plVar15 = lStack_a8;
          plVar15[1] = lStack_a0;
          plVar15[2] = lStack_98;
          plVar14[uVar12 + 0x22] = (long)plStack_90;
        }
        plVar14[uVar12 + 0x2f] = (long)plStack_78;
        *(ushort *)((long)plVar14 + 0x16a) = uVar2 + 1;
        if (uVar12 + 1 < uVar11 + 2) {
          lVar6 = uVar12 + 0x2f;
          do {
            puVar10 = (undefined8 *)plVar14[lVar6];
            *puVar10 = plVar14;
            *(short *)(puVar10 + 0x2d) = (short)lVar6 + -0x2e;
            lVar6 = lVar6 + 1;
          } while (lVar6 - uVar11 != 0x30);
        }
        goto LAB_0055d45c;
      }
      lStack_b8 = lStack_80 + 1;
      plStack_c0 = plVar14;
      if (uVar1 < 5) {
        uStack_b0 = 4;
        func_0x0055e0a4(&lStack_a8,&plStack_c0);
        pplVar8 = &plStack_88;
LAB_0055d274:
        plVar14 = *pplVar8;
        uVar1 = *(ushort *)((long)plVar14 + 0x16a);
        uVar11 = (ulong)uVar1;
        plVar13 = plVar14 + (long)(int)uVar12 * 3 + 1;
        lVar3 = uVar11 - uVar12;
        if (uVar11 < uVar12 || lVar3 == 0) {
          *plVar13 = lVar6;
          plVar13[1] = lVar16;
          plVar13[2] = lVar19;
          plVar14[uVar12 + 0x22] = (long)plVar15;
        }
        else {
          _memmove(plVar14 + (long)(int)(uVar12 + 1) * 3 + 1,plVar13,lVar3 * 0x18);
          *plVar13 = lVar6;
          plVar13[1] = lVar16;
          plVar13[2] = lVar19;
          _memmove(plVar14 + uVar12 + 0x23,plVar14 + uVar12 + 0x22,lVar3 * 8);
          plVar14[uVar12 + 0x22] = (long)plVar15;
          _memmove(plVar14 + uVar12 + 0x30,plVar14 + uVar12 + 0x2f,lVar3 * 8);
        }
        plVar14[uVar12 + 0x2f] = (long)plVar4;
        *(ushort *)((long)plVar14 + 0x16a) = uVar1 + 1;
        plVar15 = plStack_90;
        plVar13 = plStack_88;
        plStack_d0 = plStack_78;
        lVar6 = alStack_70[0];
        if (uVar12 + 1 < uVar11 + 2) {
          lVar16 = uVar12 + 0x2f;
          do {
            puVar10 = (undefined8 *)plVar14[lVar16];
            *puVar10 = plVar14;
            *(short *)(puVar10 + 0x2d) = (short)lVar16 + -0x2e;
            lVar16 = lVar16 + 1;
          } while (lVar16 - uVar11 != 0x30);
        }
      }
      else {
        if (uVar1 != 5) {
          if (uVar1 == 6) {
            uStack_b0 = 5;
            func_0x0055e0a4(&lStack_a8,&plStack_c0);
            uVar12 = 0;
          }
          else {
            uStack_b0 = 6;
            func_0x0055e0a4(&lStack_a8,&plStack_c0);
            uVar12 = uVar12 - 7;
          }
          pplVar8 = &plStack_78;
          goto LAB_0055d274;
        }
        uStack_b0 = 5;
        func_0x0055e0a4(&lStack_a8,&plStack_c0);
        plVar13 = plStack_88;
        uVar1 = *(ushort *)((long)plStack_88 + 0x16a);
        uVar12 = (ulong)uVar1;
        if (uVar12 < 6) {
          plStack_88[0x10] = lVar6;
          plStack_88[0x11] = lVar16;
          plStack_88[0x12] = lVar19;
          plStack_88[0x27] = (long)plVar15;
          plStack_88[0x34] = (long)plVar4;
          *(ushort *)((long)plStack_88 + 0x16a) = uVar1 + 1;
          plVar15 = plStack_90;
          plStack_d0 = plStack_78;
          lVar6 = alStack_70[0];
          if (uVar1 == 5) goto code_r0x0055d374;
        }
        else {
          _memmove(plStack_88 + 0x13,plStack_88 + 0x10,(uVar12 - 5) * 0x18);
          plVar13[0x10] = lVar6;
          plVar13[0x11] = lVar16;
          plVar13[0x12] = lVar19;
          _memmove(plVar13 + 0x28,plVar13 + 0x27,(uVar12 - 5) * 8);
          plVar13[0x27] = (long)plVar15;
          _memmove(plVar13 + 0x35,plVar13 + 0x34,uVar12 * 8 + -0x28);
          plVar13[0x34] = (long)plVar4;
          *(ushort *)((long)plVar13 + 0x16a) = uVar1 + 1;
code_r0x0055d374:
          lVar16 = 0x34;
          do {
            puVar10 = (undefined8 *)plVar13[lVar16];
            *puVar10 = plVar13;
            *(short *)(puVar10 + 0x2d) = (short)lVar16 + -0x2e;
            lVar16 = lVar16 + 1;
            plVar15 = plStack_90;
            plStack_d0 = plStack_78;
            lVar6 = alStack_70[0];
          } while ((4 - uVar12) + lVar16 != 0x34);
        }
      }
      if (lStack_a0 == 2) goto LAB_0055d45c;
      plVar14 = (long *)*plVar13;
      plStack_90 = plVar15;
      plStack_78 = plStack_d0;
      alStack_70[0] = lVar6;
    } while (plVar14 != (long *)0x0);
  }
  plStack_78 = plStack_d0;
  param_4 = (undefined8 *)*param_4;
  puVar10 = (undefined8 *)*param_4;
  if (puVar10 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009ee038);
  }
  else {
    lVar16 = param_4[1];
    puVar7 = (undefined8 *)func_0x00187bd0(0x1d0,8);
    if (puVar7 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x1d0);
    }
    else {
      *puVar7 = 0;
      *(undefined2 *)((long)puVar7 + 0x16a) = 0;
      puVar7[0x2e] = puVar10;
      *puVar10 = puVar7;
      *(undefined2 *)(puVar10 + 0x2d) = 0;
      *param_4 = puVar7;
      param_4[1] = lVar16 + 1;
      if (lVar6 == lVar16) {
        *(undefined2 *)((long)puVar7 + 0x16a) = 1;
        puVar7[2] = lStack_a0;
        puVar7[1] = lStack_a8;
        puVar7[3] = lStack_98;
        puVar7[0x22] = plVar15;
        puVar7[0x2f] = plStack_d0;
        *plStack_d0 = (long)puVar7;
        *(undefined2 *)(plStack_d0 + 0x2d) = 1;
        goto LAB_0055d45c;
      }
      plStack_c0 = plVar15;
      func_0x007a247c(&UNK_008ab894,0x30,&UNK_009ee068);
    }
  }
LAB_0055d5d8:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x55d5dc);
  (*pcVar5)();
}

