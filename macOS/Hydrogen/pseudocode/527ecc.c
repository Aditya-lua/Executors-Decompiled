
void FUN_00527ecc(long param_1,ulong param_2,long param_3,undefined *param_4)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  code *pcVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *plVar12;
  long *plVar13;
  undefined8 *puVar14;
  undefined8 *unaff_x21;
  long lVar15;
  long unaff_x22;
  long lVar16;
  undefined8 *puVar17;
  long lVar18;
  ulong unaff_x23;
  long *plVar19;
  long lVar20;
  undefined8 uVar21;
  ulong uVar22;
  undefined8 uVar23;
  undefined8 *unaff_x28;
  long unaff_x29;
  long in_stack_00000030;
  undefined8 in_stack_00000040;
  ulong in_stack_00000048;
  long *in_stack_00000060;
  undefined8 *in_stack_00000068;
  undefined8 uStack00000000000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  undefined1 uStack00000000000000c0;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  long in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long *in_stack_00000120;
  long in_stack_00000128;
  
code_r0x00527ecc:
  func_0x004e0e50(param_1,param_2,param_3,param_4 + 0x888);
  uVar7 = *(ulong *)(unaff_x29 + -200);
code_r0x00527ed8:
  if (unaff_x23 < uVar7) {
    plVar19 = (long *)(*(long *)(unaff_x29 + -0xd0) + unaff_x23 * 0x18);
    lVar8 = *plVar19;
    if (lVar8 != -0x8000000000000000 && lVar8 != 0) {
      func_0x00187bd4(plVar19[1],lVar8,1);
    }
    plVar19[1] = in_stack_000000a8;
    *plVar19 = uStack00000000000000a0;
    plVar19[2] = in_stack_000000b0;
LAB_00527da0:
    do {
      puVar14 = unaff_x21;
      puVar17 = unaff_x20;
      do {
        while ((puVar11 = puVar14, puVar11 == (undefined8 *)0x0 || (puVar11 == unaff_x28))) {
          if (puVar17 == in_stack_00000068) {
            lVar8 = *(long *)(unaff_x22 + 0x90);
            if (lVar8 == 0) goto code_r0x00528310;
            lVar20 = *(long *)(unaff_x22 + 0x88);
            lVar18 = lVar20;
            goto code_r0x00527f48;
          }
          unaff_x21 = (undefined8 *)0x0;
          unaff_x20 = puVar17 + 2;
          lVar8 = *(long *)(unaff_x22 + 0x90);
          puVar14 = (undefined8 *)0x0;
          puVar11 = puVar17;
          puVar17 = unaff_x20;
          if (lVar8 != 0) goto code_r0x00527df8;
        }
        unaff_x21 = puVar11 + 2;
        lVar8 = *(long *)(unaff_x22 + 0x90);
        puVar14 = unaff_x21;
        unaff_x20 = puVar17;
      } while (lVar8 == 0);
code_r0x00527df8:
      lVar18 = *(long *)(unaff_x22 + 0x88);
      lVar8 = lVar8 * unaff_x19;
      uVar21 = *puVar11;
      lVar20 = puVar11[1];
      do {
        if (*(long *)(lVar18 + 0x220) == lVar20) {
          uVar23 = *(undefined8 *)(lVar18 + 0x218);
          iVar6 = _memcmp(uVar23,uVar21,lVar20);
          if (iVar6 == 0) {
            if (in_stack_00000110 == 0) goto code_r0x00527e80;
            plVar19 = (long *)(in_stack_00000108 + 8);
            lVar8 = in_stack_00000110 << 4;
            goto code_r0x00527e5c;
          }
        }
        lVar18 = lVar18 + 600;
        lVar8 = lVar8 + -600;
      } while (lVar8 != 0);
    } while( true );
  }
  func_0x007a2570(unaff_x23,uVar7,&UNK_009ea8a0);
  goto code_r0x00528948;
  while( true ) {
    plVar19 = plVar19 + 2;
    lVar8 = lVar8 + -0x10;
    if (lVar8 == 0) break;
code_r0x00527e5c:
    if ((*plVar19 == lVar20) && (iVar6 = _memcmp(plVar19[-1],uVar23,lVar20), iVar6 == 0))
    goto LAB_00527da0;
  }
code_r0x00527e80:
  func_0x0050d6e0(&uStack00000000000000a0,lVar18,in_stack_00000040,in_stack_00000048._4_4_);
  if (*(int *)(lVar18 + 0x28) != 1) {
    *(long *)(unaff_x29 + -0xa8) = in_stack_000000a8;
    *(long *)(unaff_x29 + -0xb0) = uStack00000000000000a0;
    *(long *)(unaff_x29 + -0xa0) = in_stack_000000b0;
    func_0x0050b430(unaff_x29 + -0xf0,unaff_x29 + -0xb0);
    goto LAB_00527da0;
  }
  unaff_x23 = *(ulong *)(lVar18 + 0x30);
  param_2 = unaff_x23 + 1;
  uVar7 = *(ulong *)(unaff_x29 + -200);
  if (uVar7 < param_2) goto code_r0x00527eb4;
  goto code_r0x00527ed8;
code_r0x00527eb4:
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
  param_1 = unaff_x29 + -0xd8;
  param_3 = unaff_x29 + -0xb0;
  param_4 = &UNK_009ea000;
  goto code_r0x00527ecc;
code_r0x00527f48:
  do {
    lVar1 = lVar18 + 600;
    if (((*(long *)(lVar18 + 0x228) == 0) && (*(int *)(lVar18 + 0x248) == 0x110000)) &&
       ((*(byte *)(lVar18 + 0x250) >> 2 & 1) == 0)) {
      if (in_stack_00000110 != 0) {
        lVar16 = *(long *)(lVar18 + 0x220);
        uVar21 = *(undefined8 *)(lVar18 + 0x218);
        plVar19 = (long *)(in_stack_00000108 + 8);
        lVar15 = in_stack_00000110 << 4;
        do {
          if ((*plVar19 == lVar16) && (iVar6 = _memcmp(plVar19[-1],uVar21,lVar16), iVar6 == 0))
          goto code_r0x00527f40;
          plVar19 = plVar19 + 2;
          lVar15 = lVar15 + -0x10;
        } while (lVar15 != 0);
      }
      if (*(int *)(lVar18 + 0x28) != 1) {
        func_0x007a23bc(&UNK_009ea778);
code_r0x00528948:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x52894c);
        (*pcVar5)();
      }
      uVar22 = *(ulong *)(lVar18 + 0x30);
      uVar7 = *(ulong *)(unaff_x29 + -200);
      if (uVar7 < uVar22 + 1) {
        *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000000;
        func_0x004e0e50(unaff_x29 + -0xd8,uVar22 + 1,unaff_x29 + -0xb0,&UNK_009ea790);
        uVar7 = *(ulong *)(unaff_x29 + -200);
      }
      if (uVar7 <= uVar22) {
        func_0x007a2570(uVar22,uVar7,&UNK_009ea7a8);
        goto code_r0x00528948;
      }
      plVar19 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar22 * 0x18);
      lVar15 = *plVar19;
      if (lVar15 == -0x8000000000000000) {
        if ((*(byte *)(lVar18 + 0x251) & 1) == 0) {
          func_0x0050d6e0(unaff_x29 + -0xb0,lVar18,in_stack_00000040,0);
          in_stack_000000a8 = *(long *)(unaff_x29 + -0xa8);
          uStack00000000000000a0 = *(long *)(unaff_x29 + -0xb0);
          in_stack_000000b0 = *(long *)(unaff_x29 + -0xa0);
        }
        else {
          uStack00000000000000a0 = 0;
          in_stack_000000a8 = 1;
          in_stack_000000b0 = 0;
          *(undefined1 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
          *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
          *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea808;
          *(undefined8 *)(unaff_x29 + -0xa8) = 3;
          *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
          *(undefined8 *)(unaff_x29 + -0x88) = 2;
          *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
          *(undefined8 *)(unaff_x29 + -0x98) = 1;
          func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
          func_0x0050d6e0(unaff_x29 + -0xb0,lVar18,in_stack_00000040,1);
          uVar21 = *(undefined8 *)(unaff_x29 + -0xa8);
          uVar7 = *(ulong *)(unaff_x29 + -0xa0);
          if ((ulong)(uStack00000000000000a0 - in_stack_000000b0) < uVar7) {
            func_0x007a5594(&uStack00000000000000a0,in_stack_000000b0,uVar7,1,1);
          }
          lVar15 = in_stack_000000b0;
          _memcpy(in_stack_000000a8 + in_stack_000000b0,uVar21,uVar7);
          in_stack_000000b0 = lVar15 + uVar7;
          if (*(long *)(unaff_x29 + -0xb0) != 0) {
            func_0x00187bd4(uVar21,*(long *)(unaff_x29 + -0xb0),1);
          }
          *(undefined1 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
          *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
          *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea838;
          *(undefined8 *)(unaff_x29 + -0xa8) = 2;
          *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
          *(undefined8 *)(unaff_x29 + -0x88) = 2;
          *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
          *(undefined8 *)(unaff_x29 + -0x98) = 1;
          func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
        }
        lVar2 = in_stack_000000b0;
        lVar16 = in_stack_000000a8;
        lVar15 = uStack00000000000000a0;
        if (*(ulong *)(unaff_x29 + -200) <= uVar22) {
          func_0x007a2570(uVar22,*(ulong *)(unaff_x29 + -200),&UNK_009ea858);
          goto code_r0x00528948;
        }
        plVar19 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar22 * 0x18);
        lVar10 = *plVar19;
        if (lVar10 != -0x8000000000000000 && lVar10 != 0) {
          func_0x00187bd4(plVar19[1],lVar10,1);
        }
        *plVar19 = lVar15;
        plVar19[1] = lVar16;
        plVar19[2] = lVar2;
      }
      else if ((*(byte *)(lVar18 + 0x251) & 1) != 0) {
        lVar16 = plVar19[1];
        uVar7 = plVar19[2];
        *plVar19 = -0x8000000000000000;
        uStack00000000000000a0 = 0;
        in_stack_000000a8 = 1;
        in_stack_000000b0 = 0;
        *(undefined1 **)(unaff_x29 + -0xc0) = &uStack00000000000000c0;
        *(undefined **)(unaff_x29 + -0xb8) = &DAT_00524310;
        *(undefined **)(unaff_x29 + -0xb0) = &UNK_009ea7c0;
        *(undefined8 *)(unaff_x29 + -0xa8) = 3;
        *(undefined **)(unaff_x29 + -0x90) = &UNK_008a7c70;
        *(undefined8 *)(unaff_x29 + -0x88) = 2;
        *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0xc0;
        *(undefined8 *)(unaff_x29 + -0x98) = 1;
        func_0x0046849c(&uStack00000000000000a0,&UNK_009ea638,unaff_x29 + -0xb0);
        if ((ulong)(uStack00000000000000a0 - in_stack_000000b0) < uVar7) {
          func_0x007a5594(&uStack00000000000000a0,in_stack_000000b0,uVar7,1,1);
        }
        lVar2 = in_stack_000000b0;
        _memcpy(in_stack_000000a8 + in_stack_000000b0,lVar16,uVar7);
        lVar4 = in_stack_000000a8;
        lVar10 = uStack00000000000000a0;
        lVar2 = lVar2 + uVar7;
        in_stack_000000b0 = lVar2;
        if (*(ulong *)(unaff_x29 + -200) <= uVar22) {
          func_0x007a2570(uVar22,*(ulong *)(unaff_x29 + -200),&UNK_009ea7f0);
          goto code_r0x00528948;
        }
        plVar19 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar22 * 0x18);
        lVar9 = *plVar19;
        if ((lVar9 != -0x8000000000000000) && (lVar9 != 0)) {
          func_0x00187bd4(plVar19[1],lVar9,1);
        }
        *plVar19 = lVar10;
        plVar19[1] = lVar4;
        plVar19[2] = lVar2;
        if (lVar15 != 0) {
          func_0x00187bd4(lVar16,lVar15,1);
        }
      }
      if (((in_stack_00000048 & 0x100000000) == 0) && ((*(uint *)(lVar18 + 0x250) >> 8 & 1) != 0)) {
        if (*(ulong *)(unaff_x29 + -200) <= uVar22) {
          func_0x007a2570(uVar22,*(ulong *)(unaff_x29 + -200),&UNK_009ea870);
          goto code_r0x00528948;
        }
        plVar19 = (long *)(*(long *)(unaff_x29 + -0xd0) + uVar22 * 0x18);
        lVar18 = *plVar19;
        if (lVar18 != -0x8000000000000000 && lVar18 != 0) {
          func_0x00187bd4(plVar19[1],lVar18,1);
        }
        *plVar19 = -0x8000000000000000;
      }
    }
code_r0x00527f40:
    lVar18 = lVar1;
  } while (lVar1 != lVar20 + lVar8 * 600);
code_r0x00528310:
  if (in_stack_00000048._4_4_ != 0) {
    lVar8 = *(long *)(unaff_x29 + -0xf0);
    plVar13 = *(long **)(unaff_x29 + -0xe8);
    plVar12 = plVar13 + *(long *)(unaff_x29 + -0xe0) * 3;
    *(long **)(unaff_x29 + -0xb0) = plVar13;
    *(long **)(unaff_x29 + -0xa8) = plVar13;
    *(long *)(unaff_x29 + -0xa0) = lVar8;
    *(long **)(unaff_x29 + -0x98) = plVar12;
    plVar19 = plVar13;
    plVar3 = plVar13;
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      do {
        plVar19 = plVar3 + 3;
        lVar18 = *plVar3;
        if (lVar18 == -0x8000000000000000) goto code_r0x0052843c;
        lVar1 = plVar3[1];
        uVar7 = plVar3[2];
        lVar20 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar20) < uVar7) {
          func_0x007a5594(in_stack_00000060,lVar20,uVar7,1,1);
          lVar20 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar20,lVar1,uVar7);
        lVar20 = lVar20 + uVar7;
        in_stack_00000060[2] = lVar20;
        if (*in_stack_00000060 == lVar20) {
          func_0x007a5594(in_stack_00000060,lVar20,1,1,1);
          lVar20 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar20) = 0x20;
          in_stack_00000060[2] = lVar20 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar20) = 0x20;
          in_stack_00000060[2] = lVar20 + 1;
        }
        if (lVar18 != 0) {
          func_0x00187bd4(lVar1,lVar18,1);
        }
        plVar3 = plVar19;
      } while (plVar19 != plVar12);
      plVar19 = plVar12;
code_r0x0052843c:
      *(long **)(unaff_x29 + -0xa8) = plVar19;
    }
    if ((long)plVar12 - (long)plVar19 != 0) {
      uVar7 = (ulong)((long)plVar12 - (long)plVar19) / 0x18;
      plVar19 = plVar19 + 1;
      do {
        if (plVar19[-1] != 0) {
          func_0x00187bd4(*plVar19,plVar19[-1],1);
        }
        plVar19 = plVar19 + 3;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    if (lVar8 != 0) {
      func_0x00187bd4(plVar13,lVar8 * 0x18,8);
    }
    plVar3 = in_stack_00000120;
    lVar8 = in_stack_00000118;
    plVar12 = in_stack_00000120 + in_stack_00000128 * 3;
    *(long **)(unaff_x29 + -0xb0) = in_stack_00000120;
    *(long **)(unaff_x29 + -0xa8) = in_stack_00000120;
    *(long *)(unaff_x29 + -0xa0) = in_stack_00000118;
    *(long **)(unaff_x29 + -0x98) = plVar12;
    plVar19 = in_stack_00000120;
    plVar13 = in_stack_00000120;
    if (in_stack_00000128 != 0) {
      do {
        plVar19 = plVar13 + 3;
        lVar18 = *plVar13;
        if (lVar18 == -0x8000000000000000) goto code_r0x005285c4;
        lVar1 = plVar13[1];
        uVar7 = plVar13[2];
        lVar20 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar20) < uVar7) {
          func_0x007a5594(in_stack_00000060,lVar20,uVar7,1,1);
          lVar20 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar20,lVar1,uVar7);
        lVar20 = lVar20 + uVar7;
        in_stack_00000060[2] = lVar20;
        if (*in_stack_00000060 == lVar20) {
          func_0x007a5594(in_stack_00000060,lVar20,1,1,1);
          lVar20 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar20) = 0x20;
          in_stack_00000060[2] = lVar20 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar20) = 0x20;
          in_stack_00000060[2] = lVar20 + 1;
        }
        if (lVar18 != 0) {
          func_0x00187bd4(lVar1,lVar18,1);
        }
        plVar13 = plVar19;
      } while (plVar19 != plVar12);
      plVar19 = plVar12;
code_r0x005285c4:
      *(long **)(unaff_x29 + -0xa8) = plVar19;
    }
    if ((long)plVar12 - (long)plVar19 != 0) {
      uVar7 = (ulong)((long)plVar12 - (long)plVar19) / 0x18;
      plVar19 = plVar19 + 1;
      do {
        if (plVar19[-1] != 0) {
          func_0x00187bd4(*plVar19,plVar19[-1],1);
        }
        plVar19 = plVar19 + 3;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    if (lVar8 != 0) {
      func_0x00187bd4(plVar3,lVar8 * 0x18,8);
    }
  }
  plVar19 = *(long **)(unaff_x29 + -0xd0);
  lVar8 = *(long *)(unaff_x29 + -200);
  plVar13 = plVar19 + lVar8 * 3;
  *(undefined8 *)(unaff_x29 + -0xb0) = 0x8000000000000001;
  *(undefined8 *)(unaff_x29 + -0x98) = 0x8000000000000001;
  *(long **)(unaff_x29 + -0x80) = plVar19;
  *(long **)(unaff_x29 + -0x78) = plVar19;
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xd8);
  *(long **)(unaff_x29 + -0x68) = plVar13;
  if (lVar8 != 0) {
    lVar8 = lVar8 * 0x18;
    lVar18 = *plVar19;
    while( true ) {
      lVar8 = lVar8 + -0x18;
      plVar19 = plVar19 + 3;
      if (lVar18 != -0x8000000000000000) {
        if (lVar18 == -0x7fffffffffffffff) goto code_r0x00528764;
        lVar1 = plVar19[-2];
        uVar7 = plVar19[-1];
        lVar20 = in_stack_00000060[2];
        if ((ulong)(*in_stack_00000060 - lVar20) < uVar7) {
          func_0x007a5594(in_stack_00000060,lVar20,uVar7,1,1);
          lVar20 = in_stack_00000060[2];
        }
        _memcpy(in_stack_00000060[1] + lVar20,lVar1,uVar7);
        lVar20 = lVar20 + uVar7;
        in_stack_00000060[2] = lVar20;
        if (*in_stack_00000060 == lVar20) {
          func_0x007a5594(in_stack_00000060,lVar20,1,1,1);
          lVar20 = in_stack_00000060[2];
          *(undefined1 *)(in_stack_00000060[1] + lVar20) = 0x20;
          in_stack_00000060[2] = lVar20 + 1;
        }
        else {
          *(undefined1 *)(in_stack_00000060[1] + lVar20) = 0x20;
          in_stack_00000060[2] = lVar20 + 1;
        }
        if (lVar18 != 0) {
          func_0x00187bd4(lVar1,lVar18,1);
        }
      }
      if (lVar8 == 0) break;
      lVar18 = *plVar19;
    }
    plVar19 = plVar13;
  }
code_r0x00528764:
  *(long **)(unaff_x29 + -0x78) = plVar19;
  func_0x00524a34(unaff_x29 + -0xb0);
  if ((in_stack_00000048 & 0x100000000) == 0) {
    lVar8 = *(long *)(unaff_x29 + -0xe0);
    if (lVar8 != 0) {
      puVar14 = (undefined8 *)(*(long *)(unaff_x29 + -0xe8) + 8);
      do {
        if (puVar14[-1] != 0) {
          func_0x00187bd4(*puVar14,puVar14[-1],1);
        }
        puVar14 = puVar14 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (*(long *)(unaff_x29 + -0xf0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18,8);
    }
    if (in_stack_00000128 != 0) {
      plVar19 = in_stack_00000120 + 1;
      lVar8 = in_stack_00000128;
      do {
        if (plVar19[-1] != 0) {
          func_0x00187bd4(*plVar19,plVar19[-1],1);
        }
        plVar19 = plVar19 + 3;
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
    }
    if (in_stack_00000118 != 0) {
      func_0x00187bd4(in_stack_00000120,in_stack_00000118 * 0x18,8);
    }
  }
  if (in_stack_00000100 != 0) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000100 << 4,8);
  }
  if (in_stack_000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8 << 4,8);
  }
  lVar8 = in_stack_000000d8;
  if (in_stack_00000030 == 0) {
    if (in_stack_000000e0 != 0) {
      puVar14 = (undefined8 *)(in_stack_000000d8 + 8);
      lVar18 = in_stack_000000e0;
      do {
        if (puVar14[-1] != 0) {
          func_0x00187bd4(*puVar14,puVar14[-1] << 3,8);
        }
        puVar14 = puVar14 + 5;
        lVar18 = lVar18 + -1;
      } while (lVar18 != 0);
    }
    if (in_stack_000000d0 != 0) {
      func_0x00187bd4(lVar8,in_stack_000000d0 * 0x28,8);
    }
  }
  return;
}

