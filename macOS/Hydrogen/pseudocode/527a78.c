
void FUN_00527a78(void)

{
  long *plVar1;
  dword *pdVar2;
  dword *pdVar3;
  undefined1 *puVar4;
  undefined *puVar5;
  dword *pdVar6;
  code *pcVar7;
  bool bVar8;
  int iVar9;
  ulong uVar10;
  long lVar11;
  dword *pdVar12;
  int *piVar13;
  long lVar14;
  dword *pdVar15;
  long lVar16;
  undefined8 *puVar17;
  long *plVar18;
  long *plVar19;
  undefined8 *puVar20;
  dword *pdVar21;
  long unaff_x21;
  long lVar22;
  long unaff_x22;
  long lVar23;
  dword *unaff_x23;
  long lVar24;
  ulong uVar25;
  long *plVar26;
  long lVar27;
  long lVar28;
  undefined8 uVar29;
  undefined8 unaff_x26;
  undefined8 uVar30;
  long unaff_x27;
  undefined8 *puVar31;
  long unaff_x29;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  long *in_stack_00000060;
  undefined8 *in_stack_00000068;
  undefined1 uStack0000000000000080;
  undefined8 uStack00000000000000a0;
  undefined *in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  undefined8 uStack00000000000000e8;
  dword *in_stack_000000f0;
  long in_stack_000000f8;
  undefined8 uStack0000000000000100;
  long in_stack_00000108;
  long in_stack_00000110;
  undefined8 uStack0000000000000118;
  dword *in_stack_00000120;
  long in_stack_00000128;
  undefined1 uStack0000000000000130;
  undefined1 uStack0000000000000148;
  
code_r0x00527a78:
  lVar24 = unaff_x21;
  lVar14 = in_stack_00000028;
  lVar27 = in_stack_00000020;
  if (unaff_x21 != in_stack_00000020) {
LAB_005279c4:
    do {
      unaff_x21 = lVar24 + 0x60;
      if (*(long *)(lVar24 + 0x10) != 0) {
        plVar26 = (long *)(*(long *)(lVar24 + 8) + 8);
        lVar28 = *(long *)(lVar24 + 0x10) << 4;
        do {
          if ((*plVar26 == unaff_x27) &&
             (iVar9 = _memcmp(plVar26[-1],unaff_x26,unaff_x27), iVar9 == 0)) {
            uVar29 = *(undefined8 *)(lVar24 + 0x48);
            lVar24 = *(long *)(lVar24 + 0x50);
            puVar17 = in_stack_00000068;
            lVar27 = in_stack_00000050;
            goto code_r0x00527a3c;
          }
          plVar26 = plVar26 + 2;
          lVar28 = lVar28 + -0x10;
        } while (lVar28 != 0);
      }
      lVar24 = unaff_x21;
    } while (unaff_x21 != lVar27);
  }
code_r0x00527a88:
  uStack00000000000000a0 = &uStack0000000000000080;
  in_stack_000000a8 = &DAT_00524310;
  *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea718;
  *(undefined8 *)(unaff_x29 + -0xa8) = 3;
  *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
  *(undefined8 *)(unaff_x29 + -0x88) = 2;
  *(undefined8 **)(unaff_x29 + -0xa0) = &uStack00000000000000a0;
  *(undefined8 *)(unaff_x29 + -0x98) = 1;
  func_0x0046849c(in_stack_00000060,&UNK_009ea638,unaff_x29 + -0xb0);
code_r0x00527ae0:
  uStack00000000000000c0 = &uStack00000000000000c8;
  uStack00000000000000c8 = in_stack_00000010;
  puVar17 = *(undefined8 **)(in_stack_00000018 + 0x10);
  if (puVar17 == (undefined8 *)0x0) {
    func_0x005053c0(&uStack00000000000000d0);
    uStack00000000000000e8 = 0;
    in_stack_000000f8 = 0;
    puVar20 = &uStack00000000000000d0;
    lVar14 = in_stack_000000e0;
  }
  else {
    uStack00000000000000e8 = 0;
    in_stack_000000f8 = 0;
    lVar14 = puVar17[2];
    puVar20 = puVar17;
  }
  in_stack_000000f8 = 0;
  in_stack_000000f0 = &MACH_HEADER.cpusubtype;
  uStack00000000000000e8 = 0;
  if (lVar14 != 0) {
    in_stack_000000f8 = 0;
    in_stack_000000f0 = &MACH_HEADER.cpusubtype;
    uStack00000000000000e8 = 0;
    lVar28 = puVar20[1];
    lVar24 = lVar28 + 0x28;
    lVar27 = lVar28;
    do {
      lVar23 = lVar24;
      func_0x005059cc(unaff_x29 + -0xb0,unaff_x22,lVar27 + 0x18);
      lVar24 = *(long *)(unaff_x29 + -0xb0);
      puVar20 = *(undefined8 **)(unaff_x29 + -0xa8);
      lVar22 = *(long *)(unaff_x29 + -0xa0);
      if (lVar22 != 0) {
        lVar16 = in_stack_000000f8 << 4;
        puVar31 = puVar20;
        do {
          lVar11 = in_stack_000000f8;
          uVar29 = *puVar31;
          uVar30 = puVar31[1];
          if (in_stack_000000f8 == uStack00000000000000e8) {
            func_0x0050c0c0(&uStack00000000000000e8,&UNK_009ea8d0);
          }
          *(undefined8 *)((long)in_stack_000000f0 + lVar16) = uVar29;
          ((undefined8 *)((long)in_stack_000000f0 + lVar16))[1] = uVar30;
          in_stack_000000f8 = lVar11 + 1;
          lVar16 = lVar16 + 0x10;
          puVar31 = puVar31 + 2;
        } while (puVar31 != puVar20 + lVar22 * 2);
      }
      if (lVar24 != 0) {
        func_0x00187bd4(puVar20,lVar24 << 4,8);
      }
      lVar24 = in_stack_000000f8;
      uVar29 = *(undefined8 *)(lVar27 + 0x18);
      uVar30 = *(undefined8 *)(lVar27 + 0x20);
      if (in_stack_000000f8 == uStack00000000000000e8) {
        func_0x0050c0c0(&uStack00000000000000e8,&UNK_009ea8b8);
      }
      *(undefined8 *)(in_stack_000000f0 + lVar24 * 4) = uVar29;
      *(undefined8 *)(in_stack_000000f0 + lVar24 * 4 + 2) = uVar30;
      in_stack_000000f8 = lVar24 + 1;
      bVar8 = lVar23 != lVar28 + lVar14 * 0x28;
      lVar24 = 0;
      if (bVar8) {
        lVar24 = 0x28;
      }
      lVar24 = lVar23 + lVar24;
      lVar27 = lVar23;
    } while (bVar8);
  }
  uStack0000000000000100 = 0;
  in_stack_00000108 = 8;
  in_stack_00000110 = 0;
  uStack0000000000000118 = 0;
  pdVar21 = in_stack_000000f0 + in_stack_000000f8 * 4;
  in_stack_00000120 = &MACH_HEADER.cpusubtype;
  in_stack_00000128 = 0;
  pdVar2 = unaff_x23 + in_stack_00000038 * 4;
  pdVar12 = in_stack_000000f0;
  pdVar15 = unaff_x23;
LAB_00527c84:
  if ((pdVar12 == (dword *)0x0) || (pdVar12 == pdVar21)) {
    if (pdVar15 == pdVar2) goto LAB_00527d64;
    lVar14 = *(long *)(unaff_x22 + 0xd8);
    pdVar6 = (dword *)0x0;
    pdVar3 = pdVar15;
    pdVar15 = pdVar15 + 4;
  }
  else {
    lVar14 = *(long *)(unaff_x22 + 0xd8);
    pdVar6 = pdVar12 + 4;
    pdVar3 = pdVar12;
  }
  pdVar12 = pdVar6;
  if (lVar14 != 0) {
    uVar29 = *(undefined8 *)pdVar3;
    lVar24 = *(long *)(pdVar3 + 2);
    plVar26 = (long *)(*(long *)(unaff_x22 + 0xd0) + 0x50);
    lVar14 = lVar14 * 0x60;
    do {
      if ((*plVar26 == lVar24) && (iVar9 = _memcmp(plVar26[-1],uVar29,lVar24), iVar9 == 0)) {
        func_0x00505704(&uStack0000000000000130,unaff_x22,pdVar3);
        func_0x00504f80(&uStack0000000000000148,unaff_x22,pdVar3);
        func_0x0050b430(&uStack0000000000000118,&uStack0000000000000148);
        func_0x0050b5b4(&uStack0000000000000100,&uStack0000000000000130);
        break;
      }
      plVar26 = plVar26 + 0xc;
      lVar14 = lVar14 + -0x60;
    } while (lVar14 != 0);
  }
  goto LAB_00527c84;
  while( true ) {
    lVar14 = lVar28 + 0x60;
    puVar17 = puVar20 + 0xc;
    lVar27 = lVar22 + -0x60;
    if ((*(byte *)(lVar28 + 0x58) & 1) != 0) break;
code_r0x00527a3c:
    do {
      lVar22 = lVar27;
      puVar20 = puVar17;
      lVar28 = lVar14;
      if (lVar22 == 0) goto code_r0x00527a78;
      if (*(long *)(lVar28 + 0x50) != lVar24) {
        lVar14 = lVar28 + 0x60;
        puVar17 = puVar20 + 0xc;
        lVar27 = lVar22 + -0x60;
        goto code_r0x00527a3c;
      }
      iVar9 = _memcmp(*puVar20,uVar29,lVar24);
      lVar14 = lVar28 + 0x60;
      puVar17 = puVar20 + 0xc;
      lVar27 = lVar22 + -0x60;
    } while (iVar9 != 0);
  }
code_r0x005278e4:
  lVar14 = in_stack_00000030;
  if (lVar14 == in_stack_00000008) goto code_r0x00527ae0;
  in_stack_00000030 = lVar14 + 600;
  piVar13 = *(int **)(lVar14 + 0x228);
  if (piVar13 == (int *)0x0) {
    if (*(int *)(lVar14 + 0x248) == 0x110000) goto code_r0x005278e4;
  }
  else if (*(long *)(lVar14 + 0x230) == 7) {
    if (*piVar13 == 0x73726576 && *(int *)((long)piVar13 + 3) == 0x6e6f6973) goto code_r0x005278e4;
  }
  else if ((*(long *)(lVar14 + 0x230) == 4) && (*piVar13 == 0x706c6568)) goto code_r0x005278e4;
  if ((4 < *(byte *)(lVar14 + 0x254) && *(byte *)(lVar14 + 0x254) != 9) ||
     ((*(byte *)(lVar14 + 0x250) & 5) != 0)) goto code_r0x005278e4;
  in_stack_00000050 = *(long *)(unaff_x22 + 0xd8);
  if (in_stack_00000050 == 0) goto code_r0x00527a88;
  unaff_x26 = *(undefined8 *)(lVar14 + 0x218);
  unaff_x27 = *(long *)(lVar14 + 0x220);
  lVar14 = *(long *)(unaff_x22 + 0xd0);
  lVar27 = lVar14 + in_stack_00000050 * 0x60;
  in_stack_00000068 = (undefined8 *)(lVar14 + 0x48);
  in_stack_00000050 = in_stack_00000050 * 0x60;
  lVar24 = lVar14;
  in_stack_00000020 = lVar27;
  in_stack_00000028 = lVar14;
  goto LAB_005279c4;
LAB_00527d64:
  *(undefined8 *)(unaff_x29 + -0xf0) = 0;
  *(undefined8 *)(unaff_x29 + -0xe8) = 8;
  *(undefined8 *)(unaff_x29 + -0xe0) = 0;
  *(undefined8 *)(unaff_x29 + -0xd8) = 0;
  *(undefined8 *)(unaff_x29 + -0xd0) = 8;
  *(undefined8 *)(unaff_x29 + -200) = 0;
  pdVar21 = in_stack_000000f0 + in_stack_000000f8 * 4;
  pdVar12 = in_stack_000000f0;
LAB_00527da8:
  if ((pdVar12 == (dword *)0x0) || (pdVar12 == pdVar21)) {
    if (unaff_x23 == pdVar2) goto LAB_00527f20;
    lVar14 = *(long *)(unaff_x22 + 0x90);
    pdVar3 = (dword *)0x0;
    pdVar15 = unaff_x23;
    unaff_x23 = unaff_x23 + 4;
  }
  else {
    lVar14 = *(long *)(unaff_x22 + 0x90);
    pdVar3 = pdVar12 + 4;
    pdVar15 = pdVar12;
  }
  pdVar12 = pdVar3;
  if (lVar14 != 0) {
    lVar24 = *(long *)(unaff_x22 + 0x88);
    lVar14 = lVar14 * 600;
    uVar29 = *(undefined8 *)pdVar15;
    lVar27 = *(long *)(pdVar15 + 2);
    do {
      if (*(long *)(lVar24 + 0x220) == lVar27) {
        uVar30 = *(undefined8 *)(lVar24 + 0x218);
        iVar9 = _memcmp(uVar30,uVar29,lVar27);
        if (iVar9 == 0) {
          if (in_stack_00000110 == 0) goto LAB_00527e80;
          plVar26 = (long *)(in_stack_00000108 + 8);
          lVar14 = in_stack_00000110 << 4;
          goto LAB_00527e5c;
        }
      }
      lVar24 = lVar24 + 600;
      lVar14 = lVar14 + -600;
    } while (lVar14 != 0);
  }
  goto LAB_00527da8;
  while( true ) {
    plVar26 = plVar26 + 2;
    lVar14 = lVar14 + -0x10;
    if (lVar14 == 0) break;
LAB_00527e5c:
    if ((*plVar26 == lVar27) && (iVar9 = _memcmp(plVar26[-1],uVar30,lVar27), iVar9 == 0))
    goto LAB_00527da8;
  }
LAB_00527e80:
  func_0x0050d6e0(&uStack00000000000000a0,lVar24,in_stack_00000040,in_stack_00000048._4_4_);
  if (*(int *)(lVar24 + 0x28) == 1) {
    uVar25 = *(ulong *)(lVar24 + 0x30);
    uVar10 = *(ulong *)(unaff_x29 + -200);
    if (uVar10 < uVar25 + 1) {
      *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
      func_0x004e0e50(unaff_x29 + -0xd8,uVar25 + 1,unaff_x29 + -0xb0,&UNK_009ea888);
      uVar10 = *(ulong *)(unaff_x29 + -200);
    }
    if (uVar10 <= uVar25) {
      func_0x007a2570(uVar25,uVar10,&UNK_009ea8a0);
LAB_00528948:
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x52894c);
      (*pcVar7)();
    }
    plVar26 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar25 * 0x18);
    lVar14 = *plVar26;
    if (lVar14 != -0x8000000000000000 && lVar14 != 0) {
      func_0x00187bd4(plVar26[1],lVar14,1);
    }
    plVar26[1] = (long)in_stack_000000a8;
    *plVar26 = (long)uStack00000000000000a0;
    plVar26[2] = in_stack_000000b0;
  }
  else {
    *(undefined **)(unaff_x29 + -0xa8) = in_stack_000000a8;
    *(undefined1 **)(unaff_x29 + -0xb0) = uStack00000000000000a0;
    *(long *)(unaff_x29 + -0xa0) = in_stack_000000b0;
    func_0x0050b430(unaff_x29 + -0xf0,unaff_x29 + -0xb0);
  }
  goto LAB_00527da8;
LAB_00527f20:
  lVar14 = *(long *)(unaff_x22 + 0x90);
  if (lVar14 != 0) {
    lVar27 = *(long *)(unaff_x22 + 0x88);
    lVar24 = lVar27;
    do {
      lVar28 = lVar24 + 600;
      if (((*(long *)(lVar24 + 0x228) == 0) && (*(int *)(lVar24 + 0x248) == 0x110000)) &&
         ((*(byte *)(lVar24 + 0x250) >> 2 & 1) == 0)) {
        if (in_stack_00000110 != 0) {
          lVar23 = *(long *)(lVar24 + 0x220);
          uVar29 = *(undefined8 *)(lVar24 + 0x218);
          plVar26 = (long *)(in_stack_00000108 + 8);
          lVar22 = in_stack_00000110 << 4;
          do {
            if ((*plVar26 == lVar23) && (iVar9 = _memcmp(plVar26[-1],uVar29,lVar23), iVar9 == 0))
            goto code_r0x00527f40;
            plVar26 = plVar26 + 2;
            lVar22 = lVar22 + -0x10;
          } while (lVar22 != 0);
        }
        if (*(int *)(lVar24 + 0x28) != 1) {
          func_0x007a23bc(&UNK_009ea778);
          goto LAB_00528948;
        }
        uVar25 = *(ulong *)(lVar24 + 0x30);
        uVar10 = *(ulong *)(unaff_x29 + -200);
        if (uVar10 < uVar25 + 1) {
          *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
          func_0x004e0e50(unaff_x29 + -0xd8,uVar25 + 1,unaff_x29 + -0xb0,&UNK_009ea790);
          uVar10 = *(ulong *)(unaff_x29 + -200);
        }
        if (uVar10 <= uVar25) {
          func_0x007a2570(uVar25,uVar10,&UNK_009ea7a8);
          goto LAB_00528948;
        }
        plVar26 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar25 * 0x18);
        lVar22 = *plVar26;
        if (lVar22 == -0x8000000000000000) {
          if ((*(byte *)(lVar24 + 0x251) & 1) == 0) {
            func_0x0050d6e0(unaff_x29 + -0xb0,lVar24,in_stack_00000040,0);
            in_stack_000000a8 = *(undefined **)(unaff_x29 + -0xa8);
            uStack00000000000000a0 = *(undefined1 **)(unaff_x29 + -0xb0);
            in_stack_000000b0 = *(long *)(unaff_x29 + -0xa0);
          }
          else {
            uStack00000000000000a0 = (undefined1 *)0x0;
            in_stack_000000a8 = (undefined *)0x1;
            in_stack_000000b0 = 0;
            *(undefined8 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
            *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
            *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea808;
            *(undefined8 *)(unaff_x29 + -0xa8) = 3;
            *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
            *(undefined8 *)(unaff_x29 + -0x88) = 2;
            *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
            *(undefined8 *)(unaff_x29 + -0x98) = 1;
            func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
            func_0x0050d6e0(unaff_x29 + -0xb0,lVar24,in_stack_00000040,1);
            uVar29 = *(undefined8 *)(unaff_x29 + -0xa8);
            uVar10 = *(ulong *)(unaff_x29 + -0xa0);
            if ((ulong)((long)uStack00000000000000a0 - in_stack_000000b0) < uVar10) {
              func_0x007a5594(&uStack00000000000000a0,in_stack_000000b0,uVar10,1,1);
            }
            lVar22 = in_stack_000000b0;
            _memcpy(in_stack_000000a8 + in_stack_000000b0,uVar29,uVar10);
            in_stack_000000b0 = lVar22 + uVar10;
            if (*(long *)(unaff_x29 + -0xb0) != 0) {
              func_0x00187bd4(uVar29,*(long *)(unaff_x29 + -0xb0),1);
            }
            *(undefined8 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
            *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
            *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea838;
            *(undefined8 *)(unaff_x29 + -0xa8) = 2;
            *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
            *(undefined8 *)(unaff_x29 + -0x88) = 2;
            *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
            *(undefined8 *)(unaff_x29 + -0x98) = 1;
            func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
          }
          lVar22 = in_stack_000000b0;
          puVar5 = in_stack_000000a8;
          puVar4 = uStack00000000000000a0;
          if (*(ulong *)(unaff_x29 + -200) <= uVar25) {
            func_0x007a2570(uVar25,*(ulong *)(unaff_x29 + -200),&UNK_009ea858);
            goto LAB_00528948;
          }
          plVar26 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar25 * 0x18);
          lVar23 = *plVar26;
          if (lVar23 != -0x8000000000000000 && lVar23 != 0) {
            func_0x00187bd4(plVar26[1],lVar23,1);
          }
          *plVar26 = (long)puVar4;
          plVar26[1] = (long)puVar5;
          plVar26[2] = lVar22;
        }
        else if ((*(byte *)(lVar24 + 0x251) & 1) != 0) {
          lVar23 = plVar26[1];
          uVar10 = plVar26[2];
          *plVar26 = -0x8000000000000000;
          uStack00000000000000a0 = (undefined1 *)0x0;
          in_stack_000000a8 = (undefined *)0x1;
          in_stack_000000b0 = 0;
          *(undefined8 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
          *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
          *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea7c0;
          *(undefined8 *)(unaff_x29 + -0xa8) = 3;
          *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
          *(undefined8 *)(unaff_x29 + -0x88) = 2;
          *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
          *(undefined8 *)(unaff_x29 + -0x98) = 1;
          func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
          if ((ulong)((long)uStack00000000000000a0 - in_stack_000000b0) < uVar10) {
            func_0x007a5594(&uStack00000000000000a0,in_stack_000000b0,uVar10,1,1);
          }
          lVar16 = in_stack_000000b0;
          _memcpy(in_stack_000000a8 + in_stack_000000b0,lVar23,uVar10);
          puVar5 = in_stack_000000a8;
          puVar4 = uStack00000000000000a0;
          lVar16 = lVar16 + uVar10;
          in_stack_000000b0 = lVar16;
          if (*(ulong *)(unaff_x29 + -200) <= uVar25) {
            func_0x007a2570(uVar25,*(ulong *)(unaff_x29 + -200),&UNK_009ea7f0);
            goto LAB_00528948;
          }
          plVar26 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar25 * 0x18);
          lVar11 = *plVar26;
          if ((lVar11 != -0x8000000000000000) && (lVar11 != 0)) {
            func_0x00187bd4(plVar26[1],lVar11,1);
          }
          *plVar26 = (long)puVar4;
          plVar26[1] = (long)puVar5;
          plVar26[2] = lVar16;
          if (lVar22 != 0) {
            func_0x00187bd4(lVar23,lVar22,1);
          }
        }
        if (((in_stack_00000048 & 0x100000000) == 0) && ((*(uint *)(lVar24 + 0x250) >> 8 & 1) != 0))
        {
          if (*(ulong *)(unaff_x29 + -200) <= uVar25) {
            func_0x007a2570(uVar25,*(ulong *)(unaff_x29 + -200),&UNK_009ea870);
            goto LAB_00528948;
          }
          plVar26 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar25 * 0x18);
          lVar24 = *plVar26;
          if (lVar24 != -0x8000000000000000 && lVar24 != 0) {
            func_0x00187bd4(plVar26[1],lVar24,1);
          }
          *plVar26 = -0x8000000000000000;
        }
      }
code_r0x00527f40:
      lVar24 = lVar28;
    } while (lVar28 != lVar27 + lVar14 * 600);
  }
  if (in_stack_00000048._4_4_ != 0) {
    lVar14 = *(long *)(unaff_x29 + -0xf0);
    plVar19 = *(long **)(unaff_x29 + -0xe8);
    plVar18 = plVar19 + *(long *)(unaff_x29 + -0xe0) * 3;
    *(long **)(unaff_x29 + -0xb0) = plVar19;
    *(long **)(unaff_x29 + -0xa8) = plVar19;
    *(long *)(unaff_x29 + -0xa0) = lVar14;
    *(long **)(unaff_x29 + -0x98) = plVar18;
    plVar26 = plVar19;
    plVar1 = plVar19;
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      do {
        plVar26 = plVar1 + 3;
        lVar24 = *plVar1;
        if (lVar24 == -0x8000000000000000) goto LAB_0052843c;
        lVar28 = plVar1[1];
        uVar10 = plVar1[2];
        lVar27 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar27) < uVar10) {
          func_0x007a5594(in_stack_00000060,lVar27,uVar10,1,1);
          lVar27 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar27,lVar28,uVar10);
        lVar27 = lVar27 + uVar10;
        in_stack_00000060[2] = lVar27;
        if (*in_stack_00000060 == lVar27) {
          func_0x007a5594(in_stack_00000060,lVar27,1,1,1);
          lVar27 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar27) = 0x20;
          in_stack_00000060[2] = lVar27 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar27) = 0x20;
          in_stack_00000060[2] = lVar27 + 1;
        }
        if (lVar24 != 0) {
          func_0x00187bd4(lVar28,lVar24,1);
        }
        plVar1 = plVar26;
      } while (plVar26 != plVar18);
      plVar26 = plVar18;
LAB_0052843c:
      *(long **)(unaff_x29 + -0xa8) = plVar26;
    }
    if ((long)plVar18 - (long)plVar26 != 0) {
      uVar10 = (ulong)((long)plVar18 - (long)plVar26) / 0x18;
      plVar26 = plVar26 + 1;
      do {
        if (plVar26[-1] != 0) {
          func_0x00187bd4(*plVar26,plVar26[-1],1);
        }
        plVar26 = plVar26 + 3;
        uVar10 = uVar10 - 1;
      } while (uVar10 != 0);
    }
    if (lVar14 != 0) {
      func_0x00187bd4(plVar19,lVar14 * 0x18,8);
    }
    pdVar12 = in_stack_00000120;
    lVar14 = uStack0000000000000118;
    pdVar15 = in_stack_00000120 + in_stack_00000128 * 6;
    *(dword **)(unaff_x29 + -0xb0) = in_stack_00000120;
    *(dword **)(unaff_x29 + -0xa8) = in_stack_00000120;
    *(long *)(unaff_x29 + -0xa0) = uStack0000000000000118;
    *(dword **)(unaff_x29 + -0x98) = pdVar15;
    pdVar21 = in_stack_00000120;
    pdVar2 = in_stack_00000120;
    if (in_stack_00000128 != 0) {
      do {
        pdVar21 = pdVar2 + 6;
        lVar24 = *(long *)pdVar2;
        if (lVar24 == -0x8000000000000000) goto LAB_005285c4;
        uVar29 = *(undefined8 *)(pdVar2 + 2);
        uVar10 = *(ulong *)(pdVar2 + 4);
        lVar27 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar27) < uVar10) {
          func_0x007a5594(in_stack_00000060,lVar27,uVar10,1,1);
          lVar27 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar27,uVar29,uVar10);
        lVar27 = lVar27 + uVar10;
        in_stack_00000060[2] = lVar27;
        if (*in_stack_00000060 == lVar27) {
          func_0x007a5594(in_stack_00000060,lVar27,1,1,1);
          lVar27 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar27) = 0x20;
          in_stack_00000060[2] = lVar27 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar27) = 0x20;
          in_stack_00000060[2] = lVar27 + 1;
        }
        if (lVar24 != 0) {
          func_0x00187bd4(uVar29,lVar24,1);
        }
        pdVar2 = pdVar21;
      } while (pdVar21 != pdVar15);
      pdVar21 = pdVar15;
LAB_005285c4:
      *(dword **)(unaff_x29 + -0xa8) = pdVar21;
    }
    if ((long)pdVar15 - (long)pdVar21 != 0) {
      uVar10 = (ulong)((long)pdVar15 - (long)pdVar21) / 0x18;
      pdVar21 = pdVar21 + 2;
      do {
        if (*(long *)(pdVar21 + -2) != 0) {
          func_0x00187bd4(*(undefined8 *)pdVar21,*(long *)(pdVar21 + -2),1);
        }
        pdVar21 = pdVar21 + 6;
        uVar10 = uVar10 - 1;
      } while (uVar10 != 0);
    }
    if (lVar14 != 0) {
      func_0x00187bd4(pdVar12,lVar14 * 0x18,8);
    }
  }
  plVar26 = *(long **)(unaff_x29 + -0xd0);
  lVar14 = *(long *)(unaff_x29 + -200);
  plVar19 = plVar26 + lVar14 * 3;
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar26;
  *(long **)(unaff_x29 + -0x78) = plVar26;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xd8);
  *(long **)(unaff_x29 + -0x68) = plVar19;
  if (lVar14 != 0) {
    lVar14 = lVar14 * 0x18;
    lVar24 = *plVar26;
    while( true ) {
      lVar14 = lVar14 + -0x18;
      plVar26 = plVar26 + 3;
      if (lVar24 != -0x8000000000000000) {
        if (lVar24 == -0x7fffffffffffffff) goto LAB_00528764;
        lVar28 = plVar26[-2];
        uVar10 = plVar26[-1];
        lVar27 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar27) < uVar10) {
          func_0x007a5594(in_stack_00000060,lVar27,uVar10,1,1);
          lVar27 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar27,lVar28,uVar10);
        lVar27 = lVar27 + uVar10;
        in_stack_00000060[2] = lVar27;
        if (*in_stack_00000060 == lVar27) {
          func_0x007a5594(in_stack_00000060,lVar27,1,1,1);
          lVar27 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar27) = 0x20;
          in_stack_00000060[2] = lVar27 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar27) = 0x20;
          in_stack_00000060[2] = lVar27 + 1;
        }
        if (lVar24 != 0) {
          func_0x00187bd4(lVar28,lVar24,1);
        }
      }
      if (lVar14 == 0) break;
      lVar24 = *plVar26;
    }
    plVar26 = plVar19;
  }
LAB_00528764:
  *(long **)(unaff_x29 + -0x78) = plVar26;
  func_0x00524a34(unaff_x29 + -0xb0);
  if ((in_stack_00000048 & 0x100000000) == 0) {
    lVar14 = *(long *)(unaff_x29 + -0xe0);
    if (lVar14 != 0) {
      puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xe8) + 8);
      do {
        if (puVar20[-1] != 0) {
          func_0x00187bd4(*puVar20,puVar20[-1],1);
        }
        puVar20 = puVar20 + 3;
        lVar14 = lVar14 + -1;
      } while (lVar14 != 0);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    if (in_stack_00000128 != 0) {
      pdVar21 = in_stack_00000120 + 2;
      lVar14 = in_stack_00000128;
      do {
        if (*(long *)(pdVar21 + -2) != 0) {
          func_0x00187bd4(*(undefined8 *)pdVar21,*(long *)(pdVar21 + -2),1);
        }
        pdVar21 = pdVar21 + 6;
        lVar14 = lVar14 + -1;
      } while (lVar14 != 0);
    }
    if (uStack0000000000000118 != 0) {
      func_0x00187bd4(in_stack_00000120,uStack0000000000000118 * 0x18,8);
    }
  }
  if (uStack0000000000000100 != 0) {
    func_0x00187bd4(in_stack_00000108,uStack0000000000000100 << 4,8);
  }
  if (uStack00000000000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,uStack00000000000000e8 << 4,8);
  }
  lVar14 = in_stack_000000d8;
  if (puVar17 == (undefined8 *)0x0) {
    if (in_stack_000000e0 != 0) {
      puVar17 = (undefined8 *)(in_stack_000000d8 + 8);
      lVar24 = in_stack_000000e0;
      do {
        if (puVar17[-1] != 0) {
          func_0x00187bd4(*puVar17,puVar17[-1] << 3,8);
        }
        puVar17 = puVar17 + 5;
        lVar24 = lVar24 + -1;
      } while (lVar24 != 0);
    }
    if (uStack00000000000000d0 != 0) {
      func_0x00187bd4(lVar14,uStack00000000000000d0 * 0x28,8);
    }
  }
  return;
}

