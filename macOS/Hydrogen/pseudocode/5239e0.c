
void FUN_005239e0(void)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  code *pcVar5;
  undefined1 in_ZR;
  int iVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long lVar9;
  undefined8 *puVar10;
  ulong uVar11;
  ulong *puVar12;
  long *plVar13;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long lVar14;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  long in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  while (!(bool)in_ZR) {
    lVar9 = unaff_x23;
    while( true ) {
      unaff_x23 = lVar9 + 0x60;
      if (*(long *)(lVar9 + 0x10) != 0) break;
LAB_005239ec:
      lVar9 = unaff_x23;
      if (unaff_x23 == unaff_x27) goto LAB_00523bec;
    }
    plVar13 = (long *)(*(long *)(lVar9 + 8) + 8);
    lVar14 = *(long *)(lVar9 + 0x10) << 4;
    while ((*plVar13 != unaff_x22 || (iVar6 = _memcmp(plVar13[-1]), iVar6 != 0))) {
      plVar13 = plVar13 + 2;
      lVar14 = lVar14 + -0x10;
      if (lVar14 == 0) goto LAB_005239ec;
    }
    uVar15 = *(undefined8 *)(lVar9 + 0x48);
    uVar2 = *(ulong *)(lVar9 + 0x50);
    puVar12 = in_stack_00000020;
    lVar9 = in_stack_00000018;
    while ((puVar12[3] != uVar2 || (iVar6 = _memcmp(puVar12[2],uVar15,uVar2), iVar6 != 0))) {
      puVar12 = puVar12 + 0xc;
      lVar9 = lVar9 + -0x60;
      if (lVar9 == 0) {
        func_0x007a23d8(&UNK_008a791f,99,&UNK_009ea570);
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x523dac);
        (*pcVar5)();
      }
    }
    uVar2 = *puVar12;
    uVar3 = puVar12[1];
    if ((ulong)(uStack0000000000000028 - unaff_x20) < uVar3) {
      func_0x007a5594(&uStack0000000000000028,unaff_x20,uVar3,8,0x10);
      unaff_x20 = in_stack_00000038;
      if (uVar3 < 4) {
LAB_00523abc:
        uVar8 = 0;
      }
      else {
code_r0x00523a9c:
        uVar11 = in_stack_00000030 + unaff_x20 * 0x10;
        if ((uVar11 < uVar2 + uVar3 * 0x10) && (uVar2 < uVar11 + uVar3 * 0x10)) goto LAB_00523abc;
        uVar8 = uVar3 & 0xfffffffffffffffc;
        unaff_x20 = unaff_x20 + uVar8;
        puVar7 = (undefined8 *)(uVar2 + 0x20);
        puVar10 = (undefined8 *)(uVar11 + 0x20);
        uVar11 = uVar8;
        do {
          uVar16 = puVar7[-3];
          uVar15 = puVar7[-2];
          uVar17 = puVar7[-1];
          uVar18 = *puVar7;
          uVar20 = puVar7[1];
          uVar19 = puVar7[2];
          uVar21 = puVar7[3];
          puVar10[-4] = puVar7[-4];
          puVar10[-3] = uVar16;
          puVar10[-2] = uVar15;
          puVar10[-1] = uVar17;
          *puVar10 = uVar18;
          puVar10[1] = uVar20;
          puVar10[2] = uVar19;
          puVar10[3] = uVar21;
          puVar7 = puVar7 + 8;
          puVar10 = puVar10 + 8;
          uVar11 = uVar11 - 4;
        } while (uVar11 != 0);
        if (uVar3 == uVar8) goto LAB_00523af4;
      }
      puVar7 = (undefined8 *)(in_stack_00000030 + unaff_x20 * 0x10 + 8);
      lVar9 = uVar3 - uVar8;
      puVar10 = (undefined8 *)(uVar2 + uVar8 * 0x10 + 8);
      unaff_x20 = (unaff_x20 + uVar3) - uVar8;
      do {
        uVar15 = *puVar10;
        puVar7[-1] = puVar10[-1];
        *puVar7 = uVar15;
        puVar7 = puVar7 + 2;
        puVar10 = puVar10 + 2;
        lVar9 = lVar9 + -1;
      } while (lVar9 != 0);
    }
    else if (uVar3 != 0) {
      if (3 < uVar3) goto code_r0x00523a9c;
      goto LAB_00523abc;
    }
LAB_00523af4:
    in_stack_00000038 = unaff_x20;
    if (((*(byte *)((long)puVar12 + 0x21) & 1) == 0) && (puVar12[-5] != 0)) {
      plVar13 = (long *)(puVar12[-6] + 8);
      lVar9 = puVar12[-5] << 4;
      do {
        lVar14 = plVar13[-1];
        lVar4 = *plVar13;
        if ((lVar4 != *(long *)(unaff_x28 + 0x220)) ||
           (iVar6 = _memcmp(lVar14,*(undefined8 *)(unaff_x28 + 0x218),lVar4), iVar6 != 0)) {
          if (unaff_x20 == uStack0000000000000028) {
            func_0x0050c0c0(&uStack0000000000000028,&UNK_009ea588);
          }
          plVar1 = (long *)(in_stack_00000030 + unaff_x20 * 0x10);
          *plVar1 = lVar14;
          plVar1[1] = lVar4;
          unaff_x20 = unaff_x20 + 1;
          in_stack_00000038 = unaff_x20;
        }
        plVar13 = plVar13 + 2;
        lVar9 = lVar9 + -0x10;
      } while (lVar9 != 0);
    }
    unaff_x27 = in_stack_00000010;
    in_ZR = unaff_x23 == in_stack_00000010;
  }
LAB_00523bec:
  uVar2 = *(ulong *)(in_stack_00000000 + unaff_x26 + 0x88);
  uVar3 = *(ulong *)(in_stack_00000000 + unaff_x26 + 0x90);
  if ((ulong)(uStack0000000000000028 - unaff_x20) < uVar3) {
    func_0x007a5594(&uStack0000000000000028,unaff_x20,uVar3,8,0x10);
    unaff_x20 = in_stack_00000038;
    if (uVar3 < 6) goto code_r0x00523d28;
code_r0x00523c1c:
    uVar11 = in_stack_00000030 + unaff_x20 * 0x10;
    if (uVar11 < uVar2 + uVar3 * 0x10 && uVar2 < uVar11 + uVar3 * 0x10) goto code_r0x00523d28;
    uVar8 = uVar3 & 0xfffffffffffffffc;
    unaff_x20 = unaff_x20 + uVar8;
    puVar7 = (undefined8 *)(uVar2 + 0x20);
    puVar10 = (undefined8 *)(uVar11 + 0x20);
    uVar11 = uVar8;
    do {
      uVar16 = puVar7[-3];
      uVar15 = puVar7[-2];
      uVar17 = puVar7[-1];
      uVar18 = *puVar7;
      uVar20 = puVar7[1];
      uVar19 = puVar7[2];
      uVar21 = puVar7[3];
      puVar10[-4] = puVar7[-4];
      puVar10[-3] = uVar16;
      puVar10[-2] = uVar15;
      puVar10[-1] = uVar17;
      *puVar10 = uVar18;
      puVar10[1] = uVar20;
      puVar10[2] = uVar19;
      puVar10[3] = uVar21;
      puVar7 = puVar7 + 8;
      puVar10 = puVar10 + 8;
      uVar11 = uVar11 - 4;
    } while (uVar11 != 0);
    if (uVar3 == uVar8) goto code_r0x00523d64;
  }
  else {
    if (uVar3 == 0) goto code_r0x00523d64;
    if (5 < uVar3) goto code_r0x00523c1c;
code_r0x00523d28:
    uVar8 = 0;
  }
  puVar7 = (undefined8 *)(in_stack_00000030 + unaff_x20 * 0x10 + 8);
  lVar9 = uVar3 - uVar8;
  puVar10 = (undefined8 *)(uVar2 + uVar8 * 0x10 + 8);
  unaff_x20 = (unaff_x20 + uVar3) - uVar8;
  do {
    uVar15 = *puVar10;
    puVar7[-1] = puVar10[-1];
    *puVar7 = uVar15;
    puVar7 = puVar7 + 2;
    puVar10 = puVar10 + 2;
    lVar9 = lVar9 + -1;
  } while (lVar9 != 0);
code_r0x00523d64:
  *in_stack_00000008 = uStack0000000000000028;
  in_stack_00000008[1] = in_stack_00000030;
  in_stack_00000008[2] = unaff_x20;
  return;
}

