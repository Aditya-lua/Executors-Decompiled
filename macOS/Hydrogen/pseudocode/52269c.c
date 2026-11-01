
undefined8 FUN_0052269c(void)

{
  undefined *puVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  code *pcVar6;
  int iVar7;
  ulong uVar8;
  undefined8 uVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  long unaff_x19;
  long lVar13;
  undefined8 *puVar14;
  undefined8 uVar15;
  long lVar16;
  long unaff_x24;
  undefined *puVar17;
  long unaff_x25;
  long unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar18 [16];
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack00000000000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  
  do {
    *(long *)(unaff_x29 + -0xd0) = unaff_x28 + 1;
    do {
      do {
        if (unaff_x26 == unaff_x24) {
          lVar16 = *(long *)(unaff_x29 + -0xd0);
          if (lVar16 != 0) {
            lVar10 = 0;
            lVar2 = *(long *)(unaff_x29 + -0xe0);
            lVar5 = *(long *)(unaff_x29 + -0xd8);
            lVar13 = *(long *)(unaff_x19 + 0x18);
            lVar11 = *(long *)(lVar13 + 0xf0) << 4;
            uVar8 = 0xffffffffffffffff;
            plVar12 = *(long **)(lVar13 + 0xe8);
            goto LAB_005226ec;
          }
          if (*(long *)(unaff_x29 + -0xe0) != 0) {
            func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
          }
          uVar9 = 0;
          goto joined_r0x00522e3c;
        }
        unaff_x24 = unaff_x24 + 600;
      } while ((*(long *)(unaff_x25 + unaff_x24 + 0x228) != 0) ||
              (*(int *)(unaff_x25 + unaff_x24 + 0x248) != 0x110000));
      iVar7 = func_0x005175a8();
    } while ((iVar7 != 0) ||
            ((lVar16 = unaff_x25 + unaff_x24, *(int *)(lVar16 + 0x28) == 1 &&
             (in_stack_00000028 <= *(ulong *)(lVar16 + 0x30)))));
    uVar15 = *(undefined8 *)(unaff_x25 + unaff_x24 + 0x218);
    uVar9 = *(undefined8 *)(lVar16 + 0x220);
    unaff_x28 = *(long *)(unaff_x29 + -0xd0);
    if (unaff_x28 == *(long *)(unaff_x29 + -0xe0)) {
      func_0x0050c0c0(unaff_x29 + -0xe0);
    }
    puVar14 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + unaff_x28 * 0x10);
    *puVar14 = uVar15;
    puVar14[1] = uVar9;
  } while( true );
  while( true ) {
    lVar3 = *plVar12;
    plVar4 = plVar12 + 1;
    uVar8 = uVar8 + 1;
    lVar10 = lVar10 + 0x20;
    lVar11 = lVar11 + -0x10;
    plVar12 = plVar12 + 2;
    if (lVar3 == 0x1414db8803bc16e0 && *plVar4 == 0x4f7557bbe08e4383) break;
LAB_005226ec:
    if (lVar11 == 0) {
      puVar17 = (undefined *)0x0;
      goto LAB_00522a40;
    }
  }
  if (uVar8 < *(ulong *)(lVar13 + 0x108)) {
    lVar10 = *(long *)(lVar13 + 0x100) + lVar10;
    lVar11 = *(long *)(lVar10 + -0x18);
    puVar17 = (undefined *)
              (*(long *)(lVar10 + -0x20) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar18 = (**(code **)(lVar11 + 0x18))(puVar17);
    if (auVar18._0_8_ == 0x1414db8803bc16e0 && auVar18._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
      puVar1 = &UNK_008a7b62;
      if (puVar17 != (undefined *)0x0) {
        puVar1 = puVar17;
      }
      *(long *)(unaff_x29 + -200) = lVar13;
      *(undefined **)(unaff_x29 + -0xc0) = puVar1;
      *(long *)(unaff_x29 + -0xb8) = unaff_x19;
      func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,lVar5,lVar16);
      lVar10 = uStack00000000000000e0;
      in_stack_000000f8 = in_stack_000000e8 + in_stack_000000f0 * 0x18;
      uStack00000000000000e0 = in_stack_000000e8;
      in_stack_000000f0 = lVar10;
      func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
      in_stack_000000f8 = lVar5 + lVar16 * 0x10;
      in_stack_00000100 = in_stack_00000030;
      in_stack_00000108 = in_stack_00000050;
      in_stack_00000110 = in_stack_00000038;
      in_stack_00000118 = in_stack_00000058;
      uStack00000000000000e0 = lVar5;
      in_stack_000000e8 = lVar5;
      in_stack_000000f0 = lVar2;
      in_stack_00000120 = lVar13;
      func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
      *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
      *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar15 = *(undefined8 *)(unaff_x29 + -0x88);
      func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar15,
                      *(undefined8 *)(unaff_x29 + -0x80));
      uVar9 = func_0x0051c5b4(lVar13,unaff_x29 + -0x70,&uStack00000000000000e0);
      if (*(long *)(unaff_x29 + -0x90) != 0) {
        func_0x00187bd4(uVar15,*(long *)(unaff_x29 + -0x90) << 4,8);
      }
joined_r0x00522e3c:
      if (in_stack_00000060 != 0) {
        func_0x00187bd4(in_stack_00000068,in_stack_00000060 << 4,8);
      }
      if (in_stack_00000088 != 0) {
        puVar14 = (undefined8 *)(in_stack_00000080 + 8);
        do {
          if (puVar14[-1] != 0) {
            func_0x00187bd4(*puVar14,puVar14[-1] << 4,8);
          }
          puVar14 = puVar14 + 3;
          in_stack_00000088 = in_stack_00000088 + -1;
        } while (in_stack_00000088 != 0);
      }
      if (in_stack_00000078 != 0) {
        func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x18,8);
      }
      return uVar9;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar8,*(ulong *)(lVar13 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x523028);
  (*pcVar6)();
}

