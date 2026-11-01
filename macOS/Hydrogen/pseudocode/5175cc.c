
long * FUN_005175cc(long param_1,long param_2,undefined8 *param_3,long *param_4)

{
  byte bVar1;
  byte bVar2;
  undefined8 uVar3;
  uint uVar4;
  byte bVar5;
  int iVar6;
  long *plVar7;
  long lVar8;
  uint uVar9;
  undefined8 *puVar10;
  undefined *puVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long *plVar16;
  undefined1 auVar17 [16];
  undefined8 uStack0000000000000008;
  long *in_stack_00000010;
  undefined8 uStack0000000000000018;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  undefined8 uStack_b8;
  undefined1 auStack_b0 [16];
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  byte bStack_58;
  undefined1 uStack_57;
  long *plStack_50;
  long lStack_48;
  long lStack_40;
  undefined8 uStack_38;
  long lStack_30;
  ulong uStack_28;
  long lStack_20;
  long *plStack_18;
  
  lVar14 = 0;
  uVar12 = 0;
  uVar3 = *param_3;
  lVar15 = param_3[1];
  param_1 = param_1 << 4;
  plVar7 = (long *)(*(long *)(param_2 + 0x48) + 8);
  while ((plVar16 = plVar7 + 2, *plVar7 != lVar15 ||
         (iVar6 = _memcmp(plVar7[-1],uVar3,lVar15), iVar6 != 0))) {
    lVar14 = lVar14 + 0x68;
    uVar12 = uVar12 + 1;
    param_1 = param_1 + -0x10;
    plVar7 = plVar16;
    if (param_1 == 0) {
      return (long *)0x0;
    }
  }
  if (uVar12 < *(ulong *)(param_2 + 0x68)) {
    uStack0000000000000008 = *(long *)(param_2 + 0x60) + lVar14;
    if (*(char *)(uStack0000000000000008 + 0x61) == '\0') {
      return (long *)0x0;
    }
    if (*param_4 == 0) {
LAB_005176c4:
      return (long *)((long)&MACH_HEADER.magic + 1);
    }
    lVar14 = *(long *)(param_2 + 0x60) + lVar14;
    lVar15 = *(long *)(lVar14 + 0x50);
    lVar14 = *(long *)(lVar14 + 0x58);
    if (lVar14 == 0) {
      return (long *)0x0;
    }
    lVar14 = lVar15 + lVar14 * 0x18;
    in_stack_00000010 = param_4;
    do {
      plVar7 = (long *)(lVar15 + 8);
      plVar16 = (long *)(lVar15 + 0x10);
      lVar15 = lVar15 + 0x18;
      lVar13 = *plVar16 * 0x18;
      lVar8 = *plVar7;
      uStack0000000000000018 = &uStack0000000000000008;
      while (lVar13 != 0) {
        uVar12 = func_0x0052467c(&uStack0000000000000018,lVar8);
        lVar13 = lVar13 + -0x18;
        lVar8 = lVar8 + 0x18;
        if ((uVar12 & 1) != 0) goto LAB_005176c4;
      }
      if (lVar15 == lVar14) {
        return (long *)0x0;
      }
    } while( true );
  }
  uVar9 = 0x9e9b68;
  auVar17 = func_0x007a2570(uVar12);
  lVar13 = auVar17._8_8_;
  lVar8 = auVar17._0_8_;
  lStack_c8 = *(long *)(lVar13 + 0x218);
  lStack_c0 = *(long *)(lVar13 + 0x220);
  plStack_50 = plVar16;
  lStack_48 = param_1;
  lStack_40 = lVar14;
  uStack_38 = uVar3;
  lStack_30 = lVar15;
  uStack_28 = uVar12;
  lStack_20 = param_2;
  plStack_18 = param_4;
  if (*(long *)(lVar8 + 0x50) != 0) {
    lVar14 = 0;
    lVar15 = *(long *)(lVar8 + 0x50) << 4;
    plVar7 = (long *)(*(long *)(lVar8 + 0x48) + 8);
    do {
      if ((*plVar7 == lStack_c0) && (iVar6 = _memcmp(plVar7[-1],lStack_c8,lStack_c0), iVar6 == 0)) {
        lStack_d0 = 0;
        lStack_c8 = lVar8 + 0x40;
        lStack_c0 = lVar14;
        goto LAB_00517770;
      }
      lVar14 = lVar14 + 1;
      lVar15 = lVar15 + -0x10;
      plVar7 = plVar7 + 2;
    } while (lVar15 != 0);
  }
  lStack_d0 = lVar8 + 0x40;
LAB_00517770:
  uVar4 = *(uint *)(lVar13 + 0x250);
  plVar7 = (long *)&__ZN12clap_builder7builder3arg3Arg16get_value_parser7DEFAULT17h30dba9b248d4334fE
  ;
  if (*(long *)(lVar13 + 0x50) != 5) {
    plVar7 = (long *)(lVar13 + 0x50);
  }
  lVar14 = *plVar7;
  if (lVar14 < 2) {
    if (lVar14 == 0) {
      puVar11 = &UNK_009eaae0;
    }
    else {
      puVar11 = &UNK_009eab20;
    }
  }
  else if (lVar14 == 2) {
    puVar11 = &UNK_009eab60;
  }
  else {
    if (lVar14 != 3) {
      lVar14 = plVar7[1];
      puVar11 = (undefined *)plVar7[2];
      goto LAB_005177e0;
    }
    puVar11 = &UNK_009eaba0;
  }
  lVar14 = 1;
LAB_005177e0:
  auStack_b0 = (**(code **)(puVar11 + 0x28))(lVar14);
  uStack_57 = 3;
  uStack_a0 = 0;
  uStack_98 = 8;
  uStack_b8 = 1;
  uStack_88 = 0;
  uStack_90 = 0;
  uStack_80 = 8;
  uStack_70 = 0;
  uStack_78 = 0;
  uStack_68 = 8;
  uStack_60 = 0;
  bStack_58 = (byte)(uVar4 >> 0xb) & 1;
  lVar14 = func_0x00518d98(&lStack_d0,&uStack_b8);
  bVar5 = *(byte *)(lVar14 + 0x61);
  bVar1 = (byte)uVar9;
  if ((uVar9 & 0xff) <= (uint)bVar5) {
    bVar1 = bVar5;
  }
  bVar2 = (byte)uVar9;
  if (bVar5 != 3) {
    bVar2 = bVar1;
  }
  *(byte *)(lVar14 + 0x61) = bVar2;
  uStack_38 = 0;
  lStack_30 = 8;
  uStack_28 = 0;
  lVar15 = *(long *)(lVar14 + 0x40);
  if (lVar15 == *(long *)(lVar14 + 0x30)) {
    func_0x0050c174((long *)(lVar14 + 0x30),&UNK_009e9648);
  }
  puVar10 = (undefined8 *)(*(long *)(lVar14 + 0x38) + lVar15 * 0x18);
  puVar10[1] = lStack_30;
  *puVar10 = uStack_38;
  puVar10[2] = uStack_28;
  *(long *)(lVar14 + 0x40) = lVar15 + 1;
  plVar7 = (long *)(lVar14 + 0x48);
  uStack_38 = 0;
  lStack_30 = 8;
  uStack_28 = 0;
  lVar15 = *(long *)(lVar14 + 0x58);
  if (lVar15 == *plVar7) {
    plVar7 = (long *)func_0x0050c174(plVar7,&UNK_009e9660);
  }
  puVar10 = (undefined8 *)(*(long *)(lVar14 + 0x50) + lVar15 * 0x18);
  puVar10[1] = lStack_30;
  *puVar10 = uStack_38;
  puVar10[2] = uStack_28;
  *(long *)(lVar14 + 0x58) = lVar15 + 1;
  return plVar7;
}

