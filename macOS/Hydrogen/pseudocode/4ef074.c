
undefined8 FUN_004ef074(undefined8 param_1)

{
  undefined *puVar1;
  long *plVar2;
  code *pcVar3;
  bool bVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  int *piVar11;
  long *plVar12;
  long unaff_x19;
  undefined *puVar13;
  long lVar14;
  long unaff_x23;
  undefined8 uVar15;
  long lVar16;
  undefined8 uVar17;
  long unaff_x29;
  undefined1 auVar18 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  long in_stack_00000088;
  ulong in_stack_00000090;
  undefined8 uStack0000000000000098;
  long in_stack_000000a0;
  ulong in_stack_000000a8;
  
  uStack0000000000000078 = param_1;
  func_0x005147bc(&uStack0000000000000008);
  if (unaff_x23 != 0) {
    func_0x00187bd4();
  }
  if ((*(ulong *)(unaff_x29 + -0x70) | 0x8000000000000000) == 0x8000000000000000) {
    lVar14 = *(long *)(unaff_x19 + 0x10);
  }
  else {
    func_0x00187bd4();
    lVar14 = *(long *)(unaff_x19 + 0x10);
  }
  if (in_stack_00000018 == 0) {
    if (*(long *)(lVar14 + 0x90) != 0) {
      lVar8 = *(long *)(lVar14 + 0x90) * 600;
      piVar11 = (int *)(*(long *)(lVar14 + 0x88) + 0x248);
      do {
        if ((*(long *)(piVar11 + -8) == 0) && (*piVar11 == 0x110000)) {
          if (((*(byte *)(lVar14 + 0x2bd) & 1) == 0) && ((*(byte *)(lVar14 + 0x2c1) & 1) == 0)) {
            func_0x0016b01c(&uStack0000000000000008);
            uVar15 = *(undefined8 *)(unaff_x19 + 0x10);
            func_0x00538438(unaff_x29 + -0xa0);
            lVar8 = *(long *)(unaff_x29 + -0x98);
            uVar6 = *(ulong *)(unaff_x29 + -0x90);
            if ((long)uVar6 < 0) {
              uVar17 = 0;
LAB_004ef7f4:
              func_0x007a1f00(uVar17,uVar6,&UNK_009e80a0);
              goto LAB_004ef8e4;
            }
            if (uVar6 == 0) {
              lVar14 = 1;
            }
            else {
              uVar17 = 1;
              lVar14 = func_0x00187bd0(uVar6,1);
              if (lVar14 == 0) goto LAB_004ef7f4;
            }
            _memcpy(lVar14,lVar8,uVar6);
            lVar5 = 0;
            uStack0000000000000020 = -0x8000000000000000;
            lVar9 = *(long *)(unaff_x19 + 0x10);
            lVar10 = *(long *)(lVar9 + 0xf0) << 4;
            uVar7 = 0xffffffffffffffff;
            plVar12 = *(long **)(lVar9 + 0xe8);
            goto LAB_004ef570;
          }
          break;
        }
        piVar11 = piVar11 + 0x96;
        lVar8 = lVar8 + -600;
      } while (lVar8 != 0);
    }
    func_0x00538438(unaff_x29 + -0x88);
    uVar17 = *(undefined8 *)(unaff_x29 + -0x80);
    lVar8 = *(long *)(unaff_x29 + -0x78);
    if (lVar8 < 0) {
      uVar15 = 0;
code_r0x004ef8b0:
      func_0x007a1f00(uVar15,lVar8,&UNK_009e80a0);
      goto LAB_004ef8e4;
    }
    if (lVar8 == 0) {
      lVar5 = 1;
    }
    else {
      uVar15 = 1;
      lVar5 = func_0x00187bd0(lVar8,1);
      if (lVar5 == 0) goto code_r0x004ef8b0;
    }
    _memcpy(lVar5,uVar17,lVar8);
    lVar10 = 0;
    *(long *)(unaff_x29 + -0xa0) = lVar8;
    *(long *)(unaff_x29 + -0x98) = lVar5;
    *(long *)(unaff_x29 + -0x90) = lVar8;
    lVar5 = *(long *)(unaff_x19 + 0x10);
    lVar8 = *(long *)(lVar5 + 0xf0) << 4;
    uVar6 = 0xffffffffffffffff;
    plVar12 = *(long **)(lVar5 + 0xe8);
    do {
      if (lVar8 == 0) {
        puVar13 = (undefined *)0x0;
        goto LAB_004ef74c;
      }
      lVar9 = *plVar12;
      plVar2 = plVar12 + 1;
      uVar6 = uVar6 + 1;
      lVar10 = lVar10 + 0x20;
      lVar8 = lVar8 + -0x10;
      plVar12 = plVar12 + 2;
    } while (lVar9 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
    if (*(ulong *)(lVar5 + 0x108) <= uVar6) {
      func_0x007a2570(uVar6,*(ulong *)(lVar5 + 0x108),&UNK_009e9b68);
      goto LAB_004ef8e4;
    }
    lVar10 = *(long *)(lVar5 + 0x100) + lVar10;
    lVar8 = *(long *)(lVar10 + -0x18);
    puVar13 = (undefined *)
              (*(long *)(lVar10 + -0x20) + (*(long *)(lVar8 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar18 = (**(code **)(lVar8 + 0x18))(puVar13);
    if (auVar18._0_8_ != 0x1414db8803bc16e0 || auVar18._8_8_ != 0x4f7557bbe08e4383) {
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      goto LAB_004ef8e4;
    }
LAB_004ef74c:
    in_stack_00000028 = &UNK_008a7b62;
    if (puVar13 != (undefined *)0x0) {
      in_stack_00000028 = puVar13;
    }
    in_stack_00000030 = 0;
    uStack0000000000000020 = lVar5;
    func_0x00525f7c(unaff_x29 + -0x70,&uStack0000000000000020,8,0);
    uVar15 = func_0x0051c36c(lVar14,unaff_x29 + -0xa0,unaff_x29 + -0x70);
    if ((*(ulong *)(unaff_x29 + -0x88) | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(uVar17,*(ulong *)(unaff_x29 + -0x88),1);
    }
    if (uStack0000000000000008 == 0) {
      return uVar15;
    }
    uVar6 = uStack0000000000000008 * 0x18;
    uVar17 = 8;
    lVar8 = in_stack_00000010;
    goto LAB_004ef654;
  }
  func_0x00538438(&uStack0000000000000098);
  uVar6 = in_stack_000000a8;
  lVar8 = in_stack_000000a0;
  if ((long)in_stack_000000a8 < 0) {
    uVar15 = 0;
LAB_004ef858:
    func_0x007a1f00(uVar15,uVar6,&UNK_009e80a0);
    goto LAB_004ef8e4;
  }
  if (in_stack_000000a8 == 0) {
    lVar5 = 1;
  }
  else {
    uVar15 = 1;
    lVar5 = func_0x00187bd0(in_stack_000000a8,1);
    if (lVar5 == 0) goto LAB_004ef858;
  }
  _memcpy(lVar5,lVar8,uVar6);
  uStack0000000000000080 = uVar6;
  in_stack_00000090 = uVar6;
  *(long *)(unaff_x29 + -0x98) = in_stack_00000010;
  *(long *)(unaff_x29 + -0xa0) = uStack0000000000000008;
  *(long *)(unaff_x29 + -0x90) = in_stack_00000018;
  lVar9 = *(long *)(unaff_x19 + 0x10);
  bVar4 = *(long *)(lVar9 + 0x128) != -0x8000000000000000;
  lVar10 = 0x230;
  if (bVar4) {
    lVar10 = 0x130;
  }
  lVar16 = 0x238;
  if (bVar4) {
    lVar16 = 0x138;
  }
  lVar16 = *(long *)(lVar9 + lVar16);
  in_stack_00000088 = lVar5;
  if (lVar16 < 0) {
    uVar15 = 0;
code_r0x004ef874:
    func_0x007a1f00(uVar15,lVar16,&UNK_009e80a0);
LAB_004ef8e4:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
    (*pcVar3)();
  }
  uVar17 = *(undefined8 *)(lVar9 + lVar10);
  if (lVar16 == 0) {
    lVar5 = 1;
  }
  else {
    uVar15 = 1;
    lVar5 = func_0x00187bd0(lVar16,1);
    if (lVar5 == 0) goto code_r0x004ef874;
  }
  _memcpy(lVar5,uVar17,lVar16);
  lVar10 = 0;
  *(long *)(unaff_x29 + -0x88) = lVar16;
  *(long *)(unaff_x29 + -0x80) = lVar5;
  *(long *)(unaff_x29 + -0x78) = lVar16;
  lVar9 = *(long *)(unaff_x19 + 0x10);
  lVar5 = *(long *)(lVar9 + 0xf0) << 4;
  uVar6 = 0xffffffffffffffff;
  plVar12 = *(long **)(lVar9 + 0xe8);
  do {
    if (lVar5 == 0) {
      puVar13 = (undefined *)0x0;
      goto code_r0x004ef454;
    }
    lVar16 = *plVar12;
    plVar2 = plVar12 + 1;
    uVar6 = uVar6 + 1;
    lVar10 = lVar10 + 0x20;
    lVar5 = lVar5 + -0x10;
    plVar12 = plVar12 + 2;
  } while (lVar16 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (*(ulong *)(lVar9 + 0x108) <= uVar6) {
    func_0x007a2570(uVar6,*(ulong *)(lVar9 + 0x108),&UNK_009e9b68);
    goto LAB_004ef8e4;
  }
  lVar10 = *(long *)(lVar9 + 0x100) + lVar10;
  lVar5 = *(long *)(lVar10 + -0x18);
  puVar13 = (undefined *)
            (*(long *)(lVar10 + -0x20) + (*(long *)(lVar5 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10)
  ;
  auVar18 = (**(code **)(lVar5 + 0x18))(puVar13);
  if (auVar18._0_8_ != 0x1414db8803bc16e0 || auVar18._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto LAB_004ef8e4;
  }
code_r0x004ef454:
  in_stack_00000028 = &UNK_008a7b62;
  if (puVar13 != (undefined *)0x0) {
    in_stack_00000028 = puVar13;
  }
  in_stack_00000030 = 0;
  uStack0000000000000020 = lVar9;
  func_0x00525f7c(unaff_x29 + -0x70,&uStack0000000000000020,8,0);
  uVar15 = func_0x0051be3c(lVar14,&uStack0000000000000080,unaff_x29 + -0xa0,unaff_x29 + -0x88);
  if ((uStack0000000000000098 | 0x8000000000000000) == 0x8000000000000000) {
    return uVar15;
  }
  uVar6 = uStack0000000000000098;
  goto code_r0x004ef650;
  while( true ) {
    lVar16 = *plVar12;
    plVar2 = plVar12 + 1;
    uVar7 = uVar7 + 1;
    lVar5 = lVar5 + 0x20;
    lVar10 = lVar10 + -0x10;
    plVar12 = plVar12 + 2;
    if (lVar16 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
LAB_004ef570:
    uStack0000000000000098 = uVar6;
    in_stack_000000a0 = lVar14;
    in_stack_000000a8 = uVar6;
    if (lVar10 == 0) {
      puVar13 = (undefined *)0x0;
      goto LAB_004ef5f0;
    }
  }
  if (*(ulong *)(lVar9 + 0x108) <= uVar7) {
    func_0x007a2570(uVar7,*(ulong *)(lVar9 + 0x108),&UNK_009e9b68);
    goto LAB_004ef8e4;
  }
  lVar5 = *(long *)(lVar9 + 0x100) + lVar5;
  lVar14 = *(long *)(lVar5 + -0x18);
  puVar13 = (undefined *)
            (*(long *)(lVar5 + -0x20) + (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10)
  ;
  auVar18 = (**(code **)(lVar14 + 0x18))(puVar13);
  if (auVar18._0_8_ != 0x1414db8803bc16e0 || auVar18._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto LAB_004ef8e4;
  }
LAB_004ef5f0:
  puVar1 = &UNK_008a7b62;
  if (puVar13 != (undefined *)0x0) {
    puVar1 = puVar13;
  }
  *(long *)(unaff_x29 + -0x70) = lVar9;
  *(undefined **)(unaff_x29 + -0x68) = puVar1;
  *(undefined8 *)(unaff_x29 + -0x60) = 0;
  func_0x00525f7c(unaff_x29 + -0x88,unaff_x29 + -0x70,8,0);
  uVar15 = func_0x0051d650(uVar15,&uStack0000000000000098,&uStack0000000000000020);
  uVar6 = *(ulong *)(unaff_x29 + -0xa0);
  if ((uVar6 | 0x8000000000000000) == 0x8000000000000000) {
    return uVar15;
  }
code_r0x004ef650:
  uVar17 = 1;
LAB_004ef654:
  func_0x00187bd4(lVar8,uVar6,uVar17);
  return uVar15;
}

