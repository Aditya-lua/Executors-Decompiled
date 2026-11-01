
void FUN_00504808(long param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  bool bVar5;
  int iVar6;
  ulong uVar7;
  undefined *puVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  long lVar11;
  long unaff_x21;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  long lVar15;
  long unaff_x25;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar16 [16];
  uint uVar17;
  long in_stack_00000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined1 uStack00000000000000b0;
  long lStack00000000000000c0;
  
  lVar12 = unaff_x21;
  do {
    lVar13 = param_1;
    *(undefined8 *)(unaff_x29 + -0x70) = 0;
    *(undefined8 *)(unaff_x29 + -0x68) = 1;
    *(undefined8 *)(unaff_x29 + -0x60) = 0;
    lStack00000000000000c0 = 0xe0000020;
    _uStack00000000000000b0 = (undefined *)(unaff_x29 + -0x70);
    uVar10 = *(undefined8 *)(lVar12 + 0x10);
    *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(lVar12 + 8);
    *(undefined8 *)(unaff_x29 + -0xa8) = uVar10;
    *(undefined1 *)(unaff_x29 + -0xa0) = 0xc;
    while( true ) {
      auVar16 = func_0x0051110c(unaff_x29 + -0xb0,unaff_x25 + 0x10);
      if (auVar16._0_8_ == 0) break;
      uVar7 = func_0x0046adc0(auVar16._0_8_,auVar16._8_8_,&uStack00000000000000b0);
      if ((uVar7 & 1) != 0) {
        func_0x007a2810(&UNK_008a4358,0x37,unaff_x29 + -0xb0,&UNK_009e8910,&UNK_009e88e0);
        goto LAB_00504eb0;
      }
    }
    lVar12 = *(long *)(unaff_x29 + -0x70);
    uVar10 = *(undefined8 *)(unaff_x29 + -0x68);
    uVar7 = *(ulong *)(unaff_x29 + -0x60);
    if ((ulong)(uStack0000000000000010 - in_stack_00000020) < uVar7) {
      func_0x007a5594(&uStack0000000000000010,in_stack_00000020,uVar7,1,1);
    }
    lVar2 = in_stack_00000020;
    _memcpy(in_stack_00000018 + in_stack_00000020,uVar10,uVar7);
    in_stack_00000020 = lVar2 + uVar7;
    if (lVar12 != 0) {
      func_0x00187bd4(uVar10,lVar12,1);
    }
    lVar12 = in_stack_00000020;
    if (uStack0000000000000010 == in_stack_00000020) {
      func_0x007a5594(&uStack0000000000000010,in_stack_00000020,1,1,1);
    }
    *(undefined1 *)(in_stack_00000018 + in_stack_00000020) = 0x20;
    in_stack_00000020 = lVar12 + 1;
    lVar12 = 0;
    if (lVar13 != unaff_x28) {
      lVar12 = 0x18;
    }
    param_1 = lVar13 + lVar12;
    lVar12 = lVar13;
  } while (lVar13 != unaff_x28);
  puVar9 = (undefined8 *)(unaff_x21 + 8);
  do {
    if (puVar9[-1] != 0) {
      func_0x00187bd4(*puVar9,puVar9[-1],1);
    }
    puVar9 = puVar9 + 3;
    unaff_x27 = unaff_x27 + -1;
  } while (unaff_x27 != 0);
  if (uStack0000000000000028 != 0) {
    func_0x00187bd4(unaff_x21,uStack0000000000000028 * 0x18,8);
  }
  if ((*(uint *)(in_stack_00000008 + 700) >> 0xb & 1) == 0) {
    if ((*(uint *)(in_stack_00000008 + 0x2c0) >> 0xb & 1) != 0) {
      uVar17 = *(uint *)(in_stack_00000008 + 0x2c0) >> 0xb & 1;
      if (*(long *)(in_stack_00000008 + 0x128) == -0x8000000000000000) goto code_r0x005049a8;
      goto LAB_005046d8;
    }
    uVar17 = 0;
    bVar5 = *(long *)(in_stack_00000008 + 0x128) != -0x8000000000000000;
    plVar1 = (long *)(in_stack_00000008 + 0x238);
    if (bVar5) {
      plVar1 = (long *)(in_stack_00000008 + 0x138);
    }
    lVar12 = *plVar1;
    puVar9 = (undefined8 *)(in_stack_00000008 + 0x230);
    if (bVar5) {
      puVar9 = (undefined8 *)(in_stack_00000008 + 0x130);
    }
    uVar10 = *puVar9;
code_r0x005046dc:
    if (lVar12 < 0) {
      uVar14 = 0;
code_r0x00504e8c:
      func_0x007a1f00(uVar14,lVar12,&UNK_009e8960);
LAB_00504eb0:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x504eb4);
      (*pcVar4)();
    }
    if (lVar12 != 0) {
      uVar14 = 1;
      lVar13 = func_0x00187bd0(lVar12,1);
      if (lVar13 == 0) goto code_r0x00504e8c;
      goto code_r0x005049b4;
    }
  }
  else {
    uVar17 = 1;
    if (*(long *)(in_stack_00000008 + 0x128) != -0x8000000000000000) {
LAB_005046d8:
      uVar10 = *(undefined8 *)(in_stack_00000008 + 0x130);
      lVar12 = *(long *)(in_stack_00000008 + 0x138);
      goto code_r0x005046dc;
    }
code_r0x005049a8:
    lVar12 = 0;
    uVar10 = 1;
  }
  lVar13 = 1;
code_r0x005049b4:
  _memcpy(lVar13,uVar10,lVar12);
  lVar2 = *(long *)(in_stack_00000008 + 0xb8);
  lVar3 = *(long *)(in_stack_00000008 + 0xc0);
  lVar11 = lVar2;
  uStack0000000000000028 = lVar12;
  in_stack_00000030 = lVar13;
  in_stack_00000038 = lVar12;
  do {
    if (lVar11 == lVar2 + lVar3 * 0x2c8) {
      *(uint *)(in_stack_00000008 + 700) = *(uint *)(in_stack_00000008 + 700) | 0x80000000;
      if (uStack0000000000000028 != 0) {
        func_0x00187bd4(in_stack_00000030,uStack0000000000000028,1);
      }
      if (uStack0000000000000010 != 0) {
        func_0x00187bd4(in_stack_00000018,uStack0000000000000010,1);
      }
      return;
    }
    if (*(long *)(lVar11 + 0x1e8) == -0x8000000000000000) {
      lVar13 = 0;
      *(undefined8 *)(unaff_x29 + -0x70) = 0;
      *(undefined8 *)(unaff_x29 + -0x68) = 1;
      *(undefined8 *)(unaff_x29 + -0x60) = 0;
      uVar10 = *(undefined8 *)(lVar11 + 0x230);
      lVar12 = 1;
      lVar15 = *(long *)(lVar11 + 0x238);
      if (lVar15 != 0) {
        func_0x007a5594(unaff_x29 + -0x70,0,lVar15,1,1);
        lVar12 = *(long *)(unaff_x29 + -0x68);
        lVar13 = *(long *)(unaff_x29 + -0x60);
      }
      _memcpy(lVar12 + lVar13,uVar10,lVar15);
      *(long *)(unaff_x29 + -0x60) = lVar13 + lVar15;
      if (*(long *)(lVar11 + 0x240) == 0) {
        iVar6 = *(int *)(lVar11 + 0x2b8);
        if (iVar6 != 0x110000) {
LAB_00504ad0:
          *(int *)(unaff_x29 + -0x80) = iVar6;
          _uStack00000000000000b0 = (undefined *)(unaff_x29 + -0x80);
          *(undefined **)(unaff_x29 + -0xb0) = &UNK_009e8a88;
          *(undefined8 *)(unaff_x29 + -0xa8) = 1;
          *(undefined8 *)(unaff_x29 + -0x98) = 1;
          *(undefined8 *)(unaff_x29 + -0x90) = 0;
          *(undefined1 **)(unaff_x29 + -0xa0) = &uStack00000000000000b0;
          iVar6 = func_0x0046849c(unaff_x29 + -0x70,&UNK_009e88b0,unaff_x29 + -0xb0);
          if (iVar6 != 0) {
            puVar8 = &UNK_009e8ae8;
            goto LAB_00504e2c;
          }
          goto LAB_00504b20;
        }
      }
      else {
        uVar10 = *(undefined8 *)(lVar11 + 0x248);
        *(long *)(unaff_x29 + -0x80) = *(long *)(lVar11 + 0x240);
        *(undefined8 *)(unaff_x29 + -0x78) = uVar10;
        _uStack00000000000000b0 = (undefined *)(unaff_x29 + -0x80);
        *(undefined **)(unaff_x29 + -0xb0) = &UNK_009e8a60;
        *(undefined8 *)(unaff_x29 + -0xa8) = 1;
        *(undefined8 *)(unaff_x29 + -0x98) = 1;
        *(undefined8 *)(unaff_x29 + -0x90) = 0;
        *(undefined1 **)(unaff_x29 + -0xa0) = &uStack00000000000000b0;
        uVar7 = func_0x0046849c(unaff_x29 + -0x70,&UNK_009e88b0,unaff_x29 + -0xb0);
        if ((uVar7 & 1) != 0) {
          puVar8 = &UNK_009e8ad0;
LAB_00504e2c:
          func_0x007a2810(&UNK_008a4476,0x2b,unaff_x29 + -0xb0,&UNK_009e8910,puVar8);
          goto LAB_00504eb0;
        }
        iVar6 = *(int *)(lVar11 + 0x2b8);
        if (iVar6 != 0x110000) goto LAB_00504ad0;
LAB_00504b20:
        _uStack00000000000000b0 = (undefined *)(unaff_x29 + -0x70);
        *(undefined **)(unaff_x29 + -0xb0) = &UNK_009e8ab0;
        *(undefined8 *)(unaff_x29 + -0xa8) = 2;
        *(undefined8 *)(unaff_x29 + -0x98) = 1;
        *(undefined8 *)(unaff_x29 + -0x90) = 0;
        *(undefined1 **)(unaff_x29 + -0xa0) = &uStack00000000000000b0;
        func_0x00459f08(&uStack0000000000000040,unaff_x29 + -0xb0);
        if (*(long *)(unaff_x29 + -0x70) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68),*(long *)(unaff_x29 + -0x70),1);
        }
        *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000048;
        *(undefined8 *)(unaff_x29 + -0x70) = uStack0000000000000040;
        *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000050;
      }
      *(undefined8 **)(unaff_x29 + -0xb0) = &uStack0000000000000028;
      *(undefined **)(unaff_x29 + -0xa8) = &DAT_004fe494;
      *(undefined8 **)(unaff_x29 + -0xa0) = &uStack0000000000000010;
      *(undefined **)(unaff_x29 + -0x98) = &DAT_004fe494;
      *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x70;
      *(undefined **)(unaff_x29 + -0x88) = &DAT_004fe494;
      _uStack00000000000000b0 = &UNK_008a45e0;
      lStack00000000000000c0 = unaff_x29 + -0xb0;
      func_0x00459f08(&uStack0000000000000058,&uStack00000000000000b0);
      lVar12 = *(long *)(lVar11 + 0x1e8);
      if ((lVar12 != -0x8000000000000000) && (lVar12 != 0)) {
        func_0x00187bd4(*(undefined8 *)(lVar11 + 0x1f0),lVar12,1);
      }
      *(undefined8 *)(lVar11 + 0x1f0) = in_stack_00000060;
      *(long *)(lVar11 + 0x1e8) = uStack0000000000000058;
      *(undefined8 *)(lVar11 + 0x1f8) = in_stack_00000068;
      if (*(long *)(unaff_x29 + -0x70) != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68),*(long *)(unaff_x29 + -0x70),1);
      }
    }
    if (*(long *)(lVar11 + 0x128) == -0x8000000000000000) {
      puVar8 = &UNK_008a45d6;
      if (in_stack_00000038 == 0) {
        puVar8 = (undefined *)0x1;
      }
      *(undefined **)(unaff_x29 + -0x80) = puVar8;
      *(ulong *)(unaff_x29 + -0x78) = (ulong)(in_stack_00000038 != 0);
      uVar10 = *(undefined8 *)(lVar11 + 0x238);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar11 + 0x230);
      *(undefined8 *)(unaff_x29 + -0x68) = uVar10;
      *(undefined8 **)(unaff_x29 + -0xb0) = &uStack0000000000000028;
      *(undefined **)(unaff_x29 + -0xa8) = &DAT_004fe494;
      *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0x80;
      *(undefined **)(unaff_x29 + -0x98) = &DAT_00519924;
      *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x70;
      *(undefined **)(unaff_x29 + -0x88) = &DAT_00519924;
      _uStack00000000000000b0 = &UNK_008a45e0;
      lStack00000000000000c0 = unaff_x29 + -0xb0;
      func_0x00459f08(&uStack0000000000000070,&uStack00000000000000b0);
      lVar12 = *(long *)(lVar11 + 0x128);
      if ((lVar12 != -0x8000000000000000) && (lVar12 != 0)) {
        func_0x00187bd4(*(undefined8 *)(lVar11 + 0x130),lVar12,1);
      }
      *(undefined8 *)(lVar11 + 0x130) = in_stack_00000078;
      *(long *)(lVar11 + 0x128) = uStack0000000000000070;
      *(undefined8 *)(lVar11 + 0x138) = in_stack_00000080;
    }
    if (*(long *)(lVar11 + 0x110) == -0x8000000000000000) {
      lVar12 = *(long *)(in_stack_00000008 + 0x110);
      if (uVar17 == 0) {
        plVar1 = (long *)(in_stack_00000008 + 0x238);
        if (lVar12 != -0x8000000000000000) {
          plVar1 = (long *)(in_stack_00000008 + 0x120);
        }
        in_stack_00000090 = *plVar1;
        puVar9 = (undefined8 *)(in_stack_00000008 + 0x230);
        if (lVar12 != -0x8000000000000000) {
          puVar9 = (undefined8 *)(in_stack_00000008 + 0x118);
        }
        uStack0000000000000088 = *puVar9;
LAB_00504d1c:
        uVar7 = (ulong)(in_stack_00000090 != 0);
        puVar8 = &UNK_008a4610;
        if (in_stack_00000090 == 0) {
          puVar8 = (undefined *)0x1;
        }
      }
      else {
        if (lVar12 != -0x8000000000000000) {
          uStack0000000000000088 = *(undefined8 *)(in_stack_00000008 + 0x118);
          in_stack_00000090 = *(long *)(in_stack_00000008 + 0x120);
          goto LAB_00504d1c;
        }
        uVar7 = 0;
        uStack0000000000000088 = 1;
        in_stack_00000090 = 0;
        puVar8 = (undefined *)0x1;
      }
      *(undefined **)(unaff_x29 + -0x80) = puVar8;
      *(ulong *)(unaff_x29 + -0x78) = uVar7;
      uVar10 = *(undefined8 *)(lVar11 + 0x238);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar11 + 0x230);
      *(undefined8 *)(unaff_x29 + -0x68) = uVar10;
      *(undefined8 **)(unaff_x29 + -0xb0) = &uStack0000000000000088;
      *(undefined **)(unaff_x29 + -0xa8) = &DAT_00519924;
      *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0x80;
      *(undefined **)(unaff_x29 + -0x98) = &DAT_00519924;
      *(long *)(unaff_x29 + -0x90) = unaff_x29 + -0x70;
      *(undefined **)(unaff_x29 + -0x88) = &DAT_00519924;
      _uStack00000000000000b0 = &UNK_008a45e0;
      lStack00000000000000c0 = unaff_x29 + -0xb0;
      func_0x00459f08(&uStack0000000000000098,&uStack00000000000000b0);
      lVar12 = *(long *)(lVar11 + 0x110);
      if ((lVar12 != -0x8000000000000000) && (lVar12 != 0)) {
        func_0x00187bd4(*(undefined8 *)(lVar11 + 0x118),lVar12,1);
      }
      *(undefined8 *)(lVar11 + 0x118) = in_stack_000000a0;
      *(undefined8 *)(lVar11 + 0x110) = uStack0000000000000098;
      *(undefined8 *)(lVar11 + 0x120) = in_stack_000000a8;
    }
    func_0x005045fc(lVar11);
    lVar11 = lVar11 + 0x2c8;
  } while( true );
}

