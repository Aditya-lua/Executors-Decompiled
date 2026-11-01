
bool thunk_FUN_0062d1d8(void)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  long lVar10;
  long *plVar11;
  ulong uVar12;
  undefined1 *unaff_x19;
  undefined1 auVar13 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000050;
  undefined1 uStack00000000000000b0;
  
  do {
    unaff_x19 = unaff_x19 + -0x20;
    func_0x0062a89c(unaff_x19);
  } while (unaff_x19 != &uStack00000000000000b0);
  __Unwind_Resume();
  uVar4 = func_0x0001753c();
  func_0x0062a89c(&uStack0000000000000030);
  func_0x0062a89c(&uStack0000000000000010);
  func_0x0062a89c(in_stack_00000000);
  func_0x0062a89c();
  func_0x0062a89c(&uStack0000000000000050);
  func_0x0062a89c(unaff_x19);
  func_0x0062a89c(in_stack_00000008);
  func_0x0062a89c(&uStack00000000000000b0);
  auVar13 = __Unwind_Resume(uVar4);
  lVar5 = auVar13._8_8_;
  lVar7 = auVar13._0_8_;
  uVar9 = *(ulong *)(lVar7 + 0x80);
  uVar6 = *(ulong *)(lVar5 + 0x80);
  uVar1 = uVar6;
  if (uVar9 <= uVar6) {
    uVar1 = uVar9;
  }
  if (uVar1 != 0) {
    plVar8 = *(long **)(lVar7 + 0x88);
    plVar11 = *(long **)(lVar5 + 0x88);
    uVar12 = uVar1;
    do {
      if (*plVar8 != *plVar11) {
        return false;
      }
      uVar12 = uVar12 - 1;
      plVar8 = plVar8 + 1;
      plVar11 = plVar11 + 1;
    } while (uVar12 != 0);
  }
  if (uVar6 < uVar9) {
    lVar10 = uVar9 - uVar1;
    plVar8 = (long *)(*(long *)(lVar7 + 0x88) + uVar1 * 8);
    do {
      if (*plVar8 != 0) {
        return false;
      }
      lVar10 = lVar10 + -1;
      plVar8 = plVar8 + 1;
    } while (lVar10 != 0);
  }
  if (uVar6 <= uVar9) {
    return true;
  }
  lVar7 = ~uVar1 + uVar6;
  plVar8 = (long *)(*(long *)(lVar5 + 0x88) + uVar1 * 8);
  do {
    bVar3 = *plVar8 == 0;
    bVar2 = lVar7 != 0;
    lVar7 = lVar7 + -1;
    if (*plVar8 != 0) {
      return bVar3;
    }
    plVar8 = plVar8 + 1;
  } while (bVar2);
  return bVar3;
}

