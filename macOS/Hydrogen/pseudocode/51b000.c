
void FUN_0051b000(undefined8 param_1,undefined8 param_2)

{
  byte bVar1;
  undefined8 *puVar2;
  long lVar3;
  long *plVar4;
  uint uVar5;
  code *pcVar6;
  ulong uVar7;
  byte bVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *puVar12;
  undefined8 *unaff_x21;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  
  func_0x00187bd4(param_1,param_2,1);
  *unaff_x21 = 1;
  uVar13 = *unaff_x19;
  unaff_x21[2] = unaff_x19[1];
  unaff_x21[1] = uVar13;
  unaff_x21[3] = unaff_x19[2];
  lVar9 = 0;
  lVar10 = *(long *)(unaff_x20 + 0xf0) << 4;
  uVar7 = 0xffffffffffffffff;
  plVar11 = *(long **)(unaff_x20 + 0xe8);
  do {
    if (lVar10 == 0) {
      puVar12 = (undefined8 *)0x0;
      goto code_r0x0051abd0;
    }
    lVar3 = *plVar11;
    plVar4 = plVar11 + 1;
    uVar7 = uVar7 + 1;
    lVar9 = lVar9 + 0x20;
    lVar10 = lVar10 + -0x10;
    plVar11 = plVar11 + 2;
  } while (lVar3 != 0x1414db8803bc16e0 || *plVar4 != 0x4f7557bbe08e4383);
  if (uVar7 < *(ulong *)(unaff_x20 + 0x108)) {
    lVar9 = *(long *)(unaff_x20 + 0x100) + lVar9;
    lVar10 = *(long *)(lVar9 + -0x18);
    puVar12 = (undefined8 *)
              (*(long *)(lVar9 + -0x20) + (*(long *)(lVar10 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar25 = (**(code **)(lVar10 + 0x18))(puVar12);
    if (auVar25._0_8_ == 0x1414db8803bc16e0 && auVar25._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0051abd0:
      puVar2 = (undefined8 *)&UNK_008a6e36;
      if (puVar12 != (undefined8 *)0x0) {
        puVar2 = puVar12;
      }
      uVar14 = puVar2[1];
      uVar13 = *puVar2;
      uVar16 = puVar2[3];
      uVar15 = puVar2[2];
      uVar18 = puVar2[5];
      uVar17 = puVar2[4];
      uVar20 = puVar2[7];
      uVar19 = puVar2[6];
      uVar22 = puVar2[9];
      uVar21 = puVar2[8];
      uVar24 = puVar2[0xb];
      uVar23 = puVar2[10];
      *(undefined2 *)(unaff_x21 + 0x1b) = *(undefined2 *)(puVar2 + 0xc);
      unaff_x21[0x1a] = uVar24;
      unaff_x21[0x19] = uVar23;
      unaff_x21[0x18] = uVar22;
      unaff_x21[0x17] = uVar21;
      unaff_x21[0x16] = uVar20;
      unaff_x21[0x15] = uVar19;
      unaff_x21[0x14] = uVar18;
      unaff_x21[0x13] = uVar17;
      unaff_x21[0x12] = uVar16;
      unaff_x21[0x11] = uVar15;
      unaff_x21[0x10] = uVar14;
      unaff_x21[0xf] = uVar13;
      uVar5 = *(uint *)(unaff_x20 + 700);
      if ((uVar5 >> 0x1d & 1) == 0) {
        bVar1 = 2;
        if ((*(uint *)(unaff_x20 + 0x2c0) & 0x20000000) == 0) {
          bVar1 = (byte)((byte)(*(uint *)(unaff_x20 + 0x2c0) >> 0x18) | (byte)(uVar5 >> 0x18)) >> 4
                  & 1;
        }
        *(byte *)((long)unaff_x21 + 0xdb) = bVar1;
      }
      else {
        *(undefined1 *)((long)unaff_x21 + 0xdb) = 2;
      }
      if ((uVar5 >> 0x12 & 1) == 0) {
        uVar5 = *(uint *)(unaff_x20 + 0x2c0) | uVar5;
        bVar1 = 2;
        if ((uVar5 & 0x20000000) == 0) {
          bVar1 = (byte)(uVar5 >> 0x1c) & 1;
        }
        bVar8 = 2;
        if ((*(uint *)(unaff_x20 + 0x2c0) & 0x40000) == 0) {
          bVar8 = bVar1;
        }
      }
      else {
        bVar8 = 2;
      }
      *(byte *)((long)unaff_x21 + 0xdc) = bVar8;
      func_0x00530da8(&uStack00000000000000b8);
      lVar9 = unaff_x21[10];
      if ((-0x7fffffffffffffff < lVar9) && (lVar9 != 0)) {
        func_0x00187bd4(unaff_x21[0xb],lVar9,1);
      }
      unaff_x21[0xb] = in_stack_000000c0;
      unaff_x21[10] = uStack00000000000000b8;
      unaff_x21[0xc] = in_stack_000000c8;
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar7,*(ulong *)(unaff_x20 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x51ace0);
  (*pcVar6)();
}

