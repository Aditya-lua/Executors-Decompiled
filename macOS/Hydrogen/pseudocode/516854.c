
void FUN_00516854(void)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  long *plVar6;
  ulong uVar7;
  code *pcVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  long *unaff_x19;
  long *unaff_x22;
  long *unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined8 *puVar13;
  undefined8 *unaff_x26;
  long unaff_x27;
  long lVar14;
  long lVar15;
  undefined1 auVar16 [16];
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  
LAB_00516764:
  do {
    if (unaff_x22 == unaff_x23) {
      return;
    }
    if (unaff_x26 == unaff_x24) {
      auVar16 = func_0x007a23bc(&UNK_009e9bf8);
      goto code_r0x005168e4;
    }
    lVar15 = unaff_x22[1];
    lVar14 = *unaff_x22;
    puVar13 = unaff_x26 + 4;
    lVar9 = *(long *)*unaff_x26;
    *(long *)*unaff_x26 = lVar9 + unaff_x25;
    if (lVar9 < 0) goto code_r0x005168f0;
    lVar9 = 0;
    unaff_x22 = unaff_x22 + 2;
    plVar1 = (long *)*unaff_x26;
    uVar3 = unaff_x26[1];
    uVar2 = unaff_x26[2];
    uVar4 = unaff_x26[3];
    lVar10 = unaff_x19[1];
    lVar5 = unaff_x19[2];
    lVar12 = lVar5 << 4;
    uVar7 = 0;
    do {
      uVar11 = uVar7;
      unaff_x26 = puVar13;
      if (lVar12 == 0) {
        if (lVar5 == *unaff_x19) {
          func_0x0050c0c0();
          lVar10 = unaff_x19[1];
        }
        plVar6 = (long *)(lVar10 + lVar5 * 0x10);
        plVar6[1] = lVar15;
        *plVar6 = lVar14;
        unaff_x19[2] = lVar5 + 1;
        lVar9 = unaff_x19[5];
        uStack0000000000000050 = plVar1;
        in_stack_00000058 = uVar3;
        in_stack_00000060 = uVar2;
        in_stack_00000068 = uVar4;
        if (lVar9 == unaff_x19[3]) {
          func_0x0050c2ec(unaff_x19 + 3);
        }
        puVar13 = (undefined8 *)(unaff_x19[4] + lVar9 * 0x20);
        puVar13[1] = uVar3;
        *puVar13 = plVar1;
        puVar13[3] = uVar4;
        puVar13[2] = uVar2;
        unaff_x19[5] = lVar9 + 1;
        goto LAB_00516764;
      }
      plVar6 = (long *)(lVar10 + uVar11 * 0x10);
      lVar12 = lVar12 + -0x10;
      lVar9 = lVar9 + 0x20;
      uVar7 = uVar11 + 1;
    } while (*plVar6 != lVar14 || plVar6[1] != lVar15);
    auVar16._8_8_ = unaff_x19[5];
    auVar16._0_8_ = uVar11;
    if ((ulong)unaff_x19[5] <= uVar11) {
code_r0x005168e4:
      func_0x007a2570(auVar16._0_8_,auVar16._8_8_,&UNK_009e9af0);
code_r0x005168f0:
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x5168f4);
      (*pcVar8)();
    }
    lVar9 = unaff_x19[4] + lVar9;
    uStack0000000000000050 = *(long **)(lVar9 + -0x20);
    *(long **)(lVar9 + -0x20) = plVar1;
    in_stack_00000058 = *(undefined8 *)(lVar9 + -0x18);
    *(undefined8 *)(lVar9 + -0x18) = uVar3;
    in_stack_00000060 = *(undefined8 *)(lVar9 + -0x10);
    *(undefined8 *)(lVar9 + -0x10) = uVar2;
    in_stack_00000068 = *(undefined8 *)(lVar9 + -8);
    *(undefined8 *)(lVar9 + -8) = uVar4;
    if (uStack0000000000000050 != (long *)0x0) {
      lVar9 = *uStack0000000000000050;
      *uStack0000000000000050 = lVar9 + unaff_x27;
      LORelease();
      if (lVar9 == 1) {
        DataMemoryBarrier(2,1);
        func_0x00525414(&uStack0000000000000050);
      }
    }
  } while( true );
}

