
void FUN_001b6ea4(void)

{
  undefined1 auVar1 [16];
  undefined *puVar2;
  undefined1 *puVar3;
  undefined2 **ppuVar4;
  long lVar5;
  undefined2 uVar6;
  uint uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  undefined2 extraout_w1;
  undefined2 extraout_w1_00;
  uint extraout_w1_01;
  undefined8 *extraout_x8;
  code *pcVar12;
  code *pcVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined1 auVar16 [16];
  undefined *puStack_a8;
  undefined1 *puStack_a0;
  undefined2 **ppuStack_98;
  long lStack_90;
  undefined8 uStack_88;
  undefined2 *puStack_78;
  undefined *puStack_70;
  undefined2 uStack_64;
  undefined2 uStack_62;
  
  func_0x00187bd4();
  auVar16 = __Unwind_Resume();
  lVar8 = auVar16._8_8_;
  uVar14 = auVar16._0_8_;
  pcVar12 = *(code **)(lVar8 + 0x48);
  uVar7 = (*pcVar12)();
  uVar7 = 1 << (ulong)(uVar7 & 0x1f);
  if (((uVar7 & 0x7c1f) == 0) && (((uVar7 & 0x3e0) != 0 || ((extraout_w1_01 & 0xff00) == 0x100)))) {
    (**(code **)(lVar8 + 0x40))(&puStack_a8,uVar14);
    lVar5 = lStack_90;
    ppuVar4 = ppuStack_98;
    puVar3 = puStack_a0;
    puVar2 = puStack_a8;
    auVar1._8_8_ = puStack_a0;
    auVar1._0_8_ = uVar14;
    auVar16._8_8_ = puStack_a0;
    auVar16._0_8_ = uVar14;
    if (puStack_a8 == (undefined *)0x0) {
      uStack_64 = (*pcVar12)(uVar14);
      puStack_78 = &uStack_64;
      puStack_70 = &
                   __ZN68__LT_rustls__msgs__enums__NamedGroup_u20_as_u20_core__fmt__Debug_GT_3fmt17hf082b03dd8206e95E
      ;
      puStack_a8 = &UNK_009c26b8;
      puStack_a0 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      lStack_90 = 1;
      uStack_88 = 0;
      ppuStack_98 = &puStack_78;
      uStack_62 = extraout_w1_00;
      func_0x007a2420(&puStack_a8,&UNK_009c26c8);
      goto LAB_001b7140;
    }
    if ((long)puStack_a0 < 0) goto LAB_001b7158;
    if (puStack_a0 == (undefined1 *)0x0) {
      lVar9 = 1;
      _memcpy(1,puStack_a8,0);
      if (-1 < lVar5) goto code_r0x001b6fc0;
LAB_001b7030:
      uVar15 = 0;
LAB_001b7034:
      func_0x007a1f00(uVar15,lVar5,&UNK_009c2560);
      goto code_r0x001b7188;
    }
    uVar15 = 1;
    lVar9 = func_0x00187bd0(puStack_a0,1);
    if (lVar9 == 0) goto LAB_001b715c;
    _memcpy(lVar9,puVar2,puVar3);
    if (lVar5 < 0) goto LAB_001b7030;
code_r0x001b6fc0:
    if (lVar5 == 0) {
      lVar10 = 1;
    }
    else {
      uVar15 = 1;
      lVar10 = func_0x00187bd0(lVar5,1);
      if (lVar10 == 0) goto LAB_001b7034;
    }
    _memcpy(lVar10,ppuVar4,lVar5);
    auVar16 = (**(code **)(lVar8 + 0x38))(uVar14);
    lVar8 = auVar16._8_8_;
    if (lVar8 < 0) goto code_r0x001b7170;
    if (lVar8 == 0) {
      lVar11 = 1;
code_r0x001b70a0:
      _memcpy(lVar11,auVar16._0_8_,lVar8);
      *extraout_x8 = puVar3;
      extraout_x8[1] = lVar9;
      extraout_x8[2] = puVar3;
      extraout_x8[3] = lVar5;
      extraout_x8[4] = lVar10;
      extraout_x8[5] = lVar5;
      extraout_x8[6] = lVar8;
      extraout_x8[7] = lVar11;
      extraout_x8[8] = lVar8;
      return;
    }
    uVar14 = 1;
    lVar11 = func_0x00187bd0(lVar8,1);
    if (lVar11 != 0) goto code_r0x001b70a0;
  }
  else {
    pcVar13 = *(code **)(lVar8 + 0x38);
    uVar6 = (*pcVar12)(uVar14);
    auVar16 = (*pcVar13)(uVar14);
    pcVar12 = auVar16._8_8_;
    if ((long)pcVar12 < 0) {
LAB_001b7140:
      auVar16._8_8_ = pcVar12;
      auVar16._0_8_ = uVar14;
      uVar14 = 0;
    }
    else {
      if (pcVar12 == (code *)0x0) {
        lVar8 = 1;
LAB_001b6fe8:
        _memcpy(lVar8,auVar16._0_8_,pcVar12);
        extraout_x8[2] = lVar8;
        extraout_x8[3] = pcVar12;
        *(undefined2 *)(extraout_x8 + 4) = uVar6;
        *(undefined2 *)((long)extraout_x8 + 0x22) = extraout_w1;
        *(undefined1 *)((long)extraout_x8 + 0x24) = 2;
        *extraout_x8 = 0x8000000000000000;
        extraout_x8[1] = pcVar12;
        return;
      }
      uVar14 = 1;
      lVar8 = func_0x00187bd0(pcVar12,1);
      if (lVar8 != 0) goto LAB_001b6fe8;
    }
    func_0x007a1f00(uVar14,auVar16._8_8_,&UNK_009c2560);
LAB_001b7158:
    uVar15 = 0;
    auVar1 = auVar16;
LAB_001b715c:
    lVar8 = auVar1._0_8_;
    func_0x007a1f00(uVar15,auVar1._8_8_,&UNK_009c2560);
code_r0x001b7170:
    uVar14 = 0;
  }
  func_0x007a1f00(uVar14,lVar8,&UNK_009c2560);
code_r0x001b7188:
                    /* WARNING: Does not return */
  pcVar12 = (code *)SoftwareBreakpoint(1,0x1b718c);
  (*pcVar12)();
}

