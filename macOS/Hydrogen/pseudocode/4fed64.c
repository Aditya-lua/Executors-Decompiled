
undefined8 FUN_004fed64(long param_1)

{
  byte bVar1;
  long lVar2;
  long *plVar3;
  uint uVar4;
  undefined8 uVar5;
  code *pcVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  undefined *puVar12;
  byte bVar13;
  undefined1 auVar14 [16];
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined1 in_stack_00000058;
  byte bStack0000000000000059;
  
  func_0x00500450(param_1,0);
  if ((*(uint *)(param_1 + 700) >> 0x12 & 1) == 0) {
    uVar4 = *(uint *)(param_1 + 0x2c0) | *(uint *)(param_1 + 700);
    bVar1 = 2;
    if ((uVar4 & 0x20000000) == 0) {
      bVar1 = (byte)(uVar4 >> 0x1c) & 1;
    }
    bVar13 = 2;
    if ((*(uint *)(param_1 + 0x2c0) & 0x40000) == 0) {
      bVar13 = bVar1;
    }
  }
  else {
    bVar13 = 2;
  }
  lVar9 = 0;
  uStack0000000000000010 = 0;
  in_stack_00000018 = 1;
  in_stack_00000020 = 0;
  lVar10 = *(long *)(param_1 + 0xf0) << 4;
  uVar7 = 0xffffffffffffffff;
  plVar11 = *(long **)(param_1 + 0xe8);
  do {
    if (lVar10 == 0) {
      puVar12 = (undefined *)0x0;
      goto LAB_004fee6c;
    }
    lVar2 = *plVar11;
    plVar3 = plVar11 + 1;
    uVar7 = uVar7 + 1;
    lVar9 = lVar9 + 0x20;
    lVar10 = lVar10 + -0x10;
    plVar11 = plVar11 + 2;
  } while (lVar2 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
  if (uVar7 < *(ulong *)(param_1 + 0x108)) {
    lVar9 = *(long *)(param_1 + 0x100) + lVar9;
    lVar10 = *(long *)(lVar9 + -0x18);
    puVar12 = (undefined *)
              (*(long *)(lVar9 + -0x20) + (*(long *)(lVar10 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar14 = (**(code **)(lVar10 + 0x18))(puVar12);
    if (auVar14._0_8_ == 0x1414db8803bc16e0 && auVar14._8_8_ == 0x4f7557bbe08e4383) {
LAB_004fee6c:
      in_stack_00000030 = &UNK_008a7b62;
      if (puVar12 != (undefined *)0x0) {
        in_stack_00000030 = puVar12;
      }
      in_stack_00000038 = 0;
      uStack0000000000000028 = param_1;
      func_0x00523f08(&uStack0000000000000010,param_1,&uStack0000000000000028,0);
      uVar5 = in_stack_00000018;
      lVar9 = uStack0000000000000010;
      uStack0000000000000040 = uStack0000000000000010;
      in_stack_00000048 = in_stack_00000018;
      in_stack_00000050 = in_stack_00000020;
      in_stack_00000058 = 0;
      bStack0000000000000059 = bVar13;
      uVar8 = func_0x0051e748(&uStack0000000000000040);
      if (lVar9 != 0) {
        func_0x00187bd4(uVar5,lVar9,1);
      }
      return uVar8;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar7,*(ulong *)(param_1 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4feefc);
  (*pcVar6)();
}

