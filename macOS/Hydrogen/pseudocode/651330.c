
void FUN_00651330(void)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  long unaff_x22;
  long lVar7;
  undefined8 *unaff_x23;
  long unaff_x24;
  long lVar8;
  undefined1 auVar9 [16];
  undefined1 uStack0000000000000008;
  
  func_0x00017f90();
  uVar2 = func_0x00017514();
  *unaff_x23 = &UNK_009f5d60;
  lVar5 = unaff_x22 + unaff_x24 * 0x70;
  lVar7 = *(long *)(lVar5 + 0x28);
  uVar6 = *(ulong *)(lVar5 + 0x18);
  if (*(ulong *)(lVar5 + 0x20) <= *(ulong *)(lVar5 + 0x18)) {
    uVar6 = *(ulong *)(lVar5 + 0x20);
  }
  if (lVar7 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar7 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  func_0x0064fcb8(&uStack0000000000000008);
  auVar9 = __Unwind_Resume(uVar2);
  puVar4 = auVar9._8_8_;
  plVar3 = auVar9._0_8_;
  lVar5 = *plVar3;
  lVar1 = plVar3[1];
  lVar7 = puVar4[1];
  if (lVar1 != lVar5) {
    lVar8 = 0;
    do {
      func_0x00651558(lVar7 + lVar8 + -0xa0,lVar1 + lVar8 + -0xa0);
      lVar8 = lVar8 + -0xa0;
    } while (lVar1 + lVar8 != lVar5);
    lVar7 = lVar7 + lVar8;
  }
  puVar4[1] = lVar7;
  lVar5 = *plVar3;
  *plVar3 = lVar7;
  puVar4[1] = lVar5;
  lVar7 = plVar3[1];
  plVar3[1] = puVar4[2];
  puVar4[2] = lVar7;
  lVar7 = plVar3[2];
  plVar3[2] = puVar4[3];
  puVar4[3] = lVar7;
  *puVar4 = puVar4[1];
  return;
}

