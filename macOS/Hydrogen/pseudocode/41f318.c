
undefined * FUN_0041f318(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  ulong uVar4;
  undefined *puVar5;
  uint *puVar6;
  long extraout_x1;
  undefined *puVar7;
  long lVar8;
  long *plVar9;
  ulong *puVar10;
  undefined *unaff_x19;
  undefined8 *puVar11;
  long *unaff_x20;
  undefined8 uVar12;
  ulong unaff_x21;
  undefined *puVar13;
  undefined8 *puVar14;
  ulong unaff_x22;
  ulong unaff_x23;
  undefined1 auVar15 [16];
  undefined8 uStack_e0;
  undefined *puStack_d8;
  undefined *puStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a0;
  undefined *puStack_98;
  long *plStack_90;
  undefined *puStack_88;
  undefined1 *puStack_80;
  undefined *puStack_78;
  undefined *puStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined1 auStack_6 [6];
  
  while( true ) {
    while( true ) {
      if (unaff_x21 == 0) {
        return (undefined *)0x0;
      }
      uVar4 = unaff_x21;
      if (unaff_x23 <= unaff_x21) {
        uVar4 = unaff_x23;
      }
      uVar4 = _write(2,unaff_x20,uVar4);
      if (uVar4 != 0xffffffffffffffff) break;
      puVar6 = (uint *)___error();
      if (*puVar6 != 4) {
        return (undefined *)(unaff_x22 & 0xffffffff | (ulong)*puVar6 << 0x20);
      }
    }
    if (uVar4 == 0) {
      return unaff_x19;
    }
    if (unaff_x21 < uVar4) break;
    unaff_x20 = (long *)((long)unaff_x20 + uVar4);
    unaff_x21 = unaff_x21 - uVar4;
  }
  puVar7 = &UNK_009da7a0;
  func_0x007a28a4(uVar4,unaff_x21);
  if (puVar7 != (undefined *)0x0) {
    puVar5 = (undefined *)0x0;
    lVar8 = (long)puVar7 << 4;
    plVar9 = (long *)(extraout_x1 + 8);
    do {
      if (*plVar9 != 0) goto LAB_0041f3d4;
      puVar5 = puVar5 + 1;
      lVar8 = lVar8 + -0x10;
      plVar9 = plVar9 + 2;
    } while (lVar8 != 0);
    puVar5 = (undefined *)(((ulong)(puVar7 + -1) & 0xfffffffffffffff) + 1);
LAB_0041f3d4:
    puVar13 = puVar7 + -(long)puVar5;
    if (puVar7 < puVar5) {
LAB_0041f540:
      auVar15 = func_0x007a28a4(puVar5,puVar7,&UNK_009da738);
      uStack_e0 = auVar15._0_8_;
      puStack_78 = &SUB_0041f554;
      puStack_d8 = (undefined *)0x0;
      uStack_a0 = unaff_x22;
      puStack_98 = puVar13;
      plStack_90 = unaff_x20;
      puStack_88 = unaff_x19;
      puStack_80 = auStack_6 + -10;
      iVar3 = func_0x0046849c(&uStack_e0,&UNK_009d9ae0,auVar15._8_8_);
      if (iVar3 == 0) {
        if (((ulong)puStack_d8 & 3) == 1) {
          puVar11 = (undefined8 *)(puStack_d8 + -1);
          uVar12 = *puVar11;
          puVar14 = *(undefined8 **)(puStack_d8 + 7);
          if ((code *)*puVar14 != (code *)0x0) {
            (*(code *)*puVar14)(uVar12);
          }
          if (puVar14[1] != 0) {
            func_0x00187bd4(uVar12,puVar14[1],puVar14[2]);
          }
          func_0x00187bd4(puVar11,0x18,8);
        }
        puStack_d8 = (undefined *)0x0;
      }
      else if (puStack_d8 == (undefined *)0x0) {
        puStack_d0 = &UNK_009da710;
        uStack_c8 = 1;
        uStack_b8 = 0;
        uStack_b0 = 0;
        uStack_c0 = 8;
        func_0x007a2420(&puStack_d0,&UNK_009da720);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x41f5c0);
        (*pcVar2)();
      }
      return puStack_d8;
    }
    if (puVar13 != (undefined *)0x0) {
      unaff_x20 = (long *)(extraout_x1 + (long)puVar5 * 0x10);
      unaff_x22 = 2;
      unaff_x19 = &UNK_009da470;
      do {
        puVar7 = puVar13;
        if ((undefined *)0x3ff < puVar13) {
          puVar7 = (undefined *)0x400;
        }
        uVar4 = _writev(2,unaff_x20,puVar7);
        if (uVar4 == 0xffffffffffffffff) {
          puVar6 = (uint *)___error();
          if (*puVar6 != 4) {
            return (undefined *)((ulong)*puVar6 << 0x20 | 2);
          }
          goto LAB_0041f42c;
        }
        if (uVar4 == 0) {
          return unaff_x19;
        }
        puVar5 = (undefined *)0x0;
        lVar8 = (long)puVar13 << 4;
        puVar10 = (ulong *)(unaff_x20 + 1);
        do {
          uVar1 = uVar4 - *puVar10;
          if (uVar4 < *puVar10) goto LAB_0041f48c;
          puVar5 = puVar5 + 1;
          lVar8 = lVar8 + -0x10;
          uVar4 = uVar1;
          puVar10 = puVar10 + 2;
        } while (lVar8 != 0);
        puVar5 = (undefined *)(((ulong)(puVar13 + -1) & 0xfffffffffffffff) + 1);
LAB_0041f48c:
        if (puVar13 < puVar5) {
          puVar7 = &UNK_009da738;
          func_0x007a28a4(puVar5,puVar13,&UNK_009da738);
code_r0x0041f4e8:
          puStack_70 = &UNK_009da778;
          uStack_68 = 1;
          uStack_58 = 0;
          uStack_50 = 0;
          uStack_60 = 8;
          func_0x007a2420(&puStack_70,&UNK_009da788);
LAB_0041f514:
          puStack_70 = &UNK_009da750;
          uStack_68 = 1;
          uStack_58 = 0;
          uStack_50 = 0;
          uStack_60 = 8;
          puVar5 = (undefined *)func_0x007a2420(&puStack_70,&UNK_009da760);
          goto LAB_0041f540;
        }
        unaff_x20 = unaff_x20 + (long)puVar5 * 2;
        if (puVar13 + -(long)puVar5 == (undefined *)0x0) {
          if (uVar4 != 0) goto LAB_0041f514;
          puVar13 = (undefined *)0x0;
        }
        else {
          if ((ulong)unaff_x20[1] < uVar4) goto code_r0x0041f4e8;
          *unaff_x20 = *unaff_x20 + uVar4;
          unaff_x20[1] = unaff_x20[1] - uVar4;
          puVar13 = puVar13 + -(long)puVar5;
        }
LAB_0041f42c:
      } while (puVar13 != (undefined *)0x0);
    }
  }
  return (undefined *)0x0;
}

