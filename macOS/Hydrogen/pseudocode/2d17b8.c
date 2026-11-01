
void FUN_002d17b8(code *param_1)

{
  int iVar1;
  long lVar2;
  ushort *puVar3;
  ulong uVar4;
  ulong uVar5;
  undefined2 uVar6;
  uint uVar7;
  undefined2 *puVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long lVar10;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 uStack00000000000000a8;
  
  (*param_1)();
  lVar10 = unaff_x19 + unaff_x28 * 0x150;
  (**(code **)(unaff_x23 + 0x50))(lVar10,lVar10 + unaff_x21,lVar10 + unaff_x20);
  lVar2 = unaff_x19 + unaff_x28 * 0x168;
  uVar4 = lVar2 + unaff_x20;
  (**(code **)(unaff_x23 + 0x50))
            (lVar2,lVar2 + unaff_x21,uVar4,lVar10,lVar10 + unaff_x21,lVar10 + unaff_x20,0,
             &uStack00000000000000a8);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar11 = ___stack_chk_fail();
  puVar3 = auVar11._8_8_;
  uVar7 = *puVar3 & 0x3e | 1;
  uVar6 = (undefined2)uVar7;
  lVar2 = (uVar4 + 4) / 5 - 1;
  if (lVar2 != 0) {
    uVar5 = 10;
    puVar8 = auVar11._0_8_;
    lVar10 = lVar2;
    do {
      iVar1 = (uVar7 & 0x3f) - 0x20;
      *puVar8 = (short)iVar1;
      uVar7 = (short)uVar7 - iVar1;
      uVar9 = uVar5 - 4;
      if (uVar9 < uVar4) {
        uVar7 = ((uint)(*(ulong *)((long)puVar3 + (uVar9 >> 3 & 0x1ffffffffffffff8)) >>
                       (uVar9 & 0x3f)) & 1) << 1 | uVar7 >> 5;
      }
      else {
        uVar7 = (int)uVar7 >> 5;
      }
      if (uVar5 - 3 < uVar4) {
        uVar7 = uVar7 | ((uint)(*(ulong *)((long)puVar3 + (uVar5 - 3 >> 3 & 0x1ffffffffffffff8)) >>
                               (uVar5 - 3 & 0x3f)) & 1) << 2;
      }
      uVar9 = uVar5 - 2;
      if (uVar9 < uVar4) {
        uVar7 = uVar7 | ((uint)(*(ulong *)((long)puVar3 + (uVar9 >> 3 & 0x1ffffffffffffff8)) >>
                               (uVar9 & 0x3f)) & 1) << 3;
      }
      if (uVar5 - 1 < uVar4) {
        uVar7 = uVar7 | ((uint)(*(ulong *)((long)puVar3 + (uVar5 - 1 >> 3 & 0x1ffffffffffffff8)) >>
                               (uVar5 - 1 & 0x3f)) & 1) << 4;
      }
      if (uVar5 < uVar4) {
        uVar7 = uVar7 | ((uint)(*(ulong *)((long)puVar3 + (uVar5 >> 3 & 0x1ffffffffffffff8)) >>
                               (uVar5 & 0x3f)) & 1) << 5;
      }
      uVar6 = (undefined2)uVar7;
      puVar8 = puVar8 + 1;
      uVar5 = uVar5 + 5;
      lVar10 = lVar10 + -1;
    } while (lVar10 != 0);
  }
  auVar11._0_8_[lVar2] = uVar6;
  return;
}

