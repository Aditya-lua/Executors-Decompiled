
ulong FUN_00594d0c(undefined8 param_1)

{
  long *plVar1;
  uint uVar2;
  ulong uVar3;
  uint uVar4;
  code *pcVar5;
  ulong *puVar6;
  long *plVar7;
  ulong uVar8;
  undefined *puVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  undefined1 auVar17 [16];
  
  func_0x0059388c();
  __Unwind_Resume(param_1);
  auVar17 = func_0x007a2668();
  plVar7 = auVar17._8_8_;
  puVar6 = auVar17._0_8_;
  uVar13 = (ulong)(uint)puVar6[8];
  if ((uint)puVar6[8] == 0xffffffff) {
    puVar6[6] = puVar6[6] + 1;
    lVar15 = plVar7[1];
    lVar14 = *plVar7;
    lVar10 = plVar7[2];
    uVar13 = puVar6[2];
    if ((int)uVar13 == -1) {
      func_0x007a247c(&UNK_008acce2,0x58,&UNK_009f05b8);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x57f2bc);
      (*pcVar5)();
    }
    if (uVar13 == *puVar6) {
      func_0x00582c4c(puVar6,&UNK_009f05d0);
    }
    plVar7 = (long *)(puVar6[1] + uVar13 * 0x20);
    plVar7[1] = lVar15;
    *plVar7 = lVar14;
    plVar7[3] = -1;
    plVar7[2] = lVar10;
    puVar6[2] = uVar13 + 1;
    return uVar13;
  }
  uVar8 = puVar6[2];
  if (uVar8 <= uVar13) {
    func_0x007a2570(uVar13,uVar8,&UNK_009f14c8);
    goto LAB_00594ee0;
  }
  uVar12 = puVar6[1];
  plVar1 = (long *)(uVar12 + uVar13 * 0x20);
  lVar16 = plVar1[1];
  lVar14 = *plVar1;
  lVar10 = plVar1[2];
  lVar15 = *plVar7;
  plVar1[1] = plVar7[1];
  *plVar1 = lVar15;
  plVar1[2] = plVar7[2];
  uVar2 = *(uint *)(plVar1 + 3);
  uVar3 = (ulong)uVar2;
  uVar4 = *(uint *)((long)plVar1 + 0x1c);
  uVar11 = (ulong)uVar4;
  plVar1[3] = -1;
  if (uVar4 == 0xffffffff) {
LAB_00594df4:
    if (uVar2 == 0xffffffff) {
LAB_00594e0c:
      *(uint *)(puVar6 + 8) = uVar2;
      puVar6[6] = puVar6[6] + 1;
      if (lVar14 != -0x8000000000000000) {
        lVar10 = lVar10 + 1;
        lVar15 = lVar16;
        while (lVar10 = lVar10 + -1, lVar10 != 0) {
          func_0x00554164(lVar15);
          lVar15 = lVar15 + 0x108;
        }
        if (lVar14 != 0) {
          func_0x00187bd4(lVar16,lVar14 * 0x108,8);
        }
      }
      return uVar13;
    }
    if (uVar3 < uVar8) {
      *(uint *)(uVar12 + uVar3 * 0x20 + 0x1c) = uVar4;
      goto LAB_00594e0c;
    }
    puVar9 = &UNK_009f14f8;
    uVar11 = uVar3;
  }
  else {
    if (uVar11 < uVar8) {
      *(uint *)(uVar12 + uVar11 * 0x20 + 0x18) = uVar2;
      goto LAB_00594df4;
    }
    puVar9 = &UNK_009f14e0;
  }
  func_0x007a2570(uVar11,uVar8,puVar9);
LAB_00594ee0:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x594ee4);
  (*pcVar5)();
}

