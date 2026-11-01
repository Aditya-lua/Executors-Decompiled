
void thunk_FUN_004b568c(void)

{
  undefined8 uVar1;
  long lVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  undefined *puVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong *puVar13;
  ulong *puVar12;
  undefined1 auVar14 [16];
  
  func_0x004b7e08();
  __Unwind_Resume();
  func_0x007a2668();
  auVar14 = func_0x007a2668();
  puVar5 = auVar14._8_8_;
  puVar4 = auVar14._0_8_;
  puVar11 = (ulong *)puVar4[3];
  if ((ulong *)puVar4[1] != puVar11) {
    uVar1 = *puVar5;
    lVar2 = puVar5[1];
    puVar9 = &UNK_009e5560;
    uVar10 = puVar5[2];
    puVar12 = (ulong *)puVar4[1];
    do {
      puVar13 = puVar12 + 1;
      uVar7 = *puVar12;
      puVar4[1] = puVar13;
      uVar6 = *(ulong *)(lVar2 + 0x10);
      if (uVar6 <= uVar10) {
LAB_004b5784:
        func_0x007a2570(uVar10,uVar6,puVar9);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x4b5794);
        (*pcVar3)();
      }
      if (uVar6 <= uVar7) {
        puVar9 = &UNK_009e5578;
        uVar10 = uVar7;
        goto LAB_004b5784;
      }
      lVar8 = *(long *)(lVar2 + 8);
      func_0x0049eb60(uVar1,*(undefined4 *)(lVar8 + uVar10 * 4),*(undefined4 *)(lVar8 + uVar7 * 4));
      uVar10 = uVar10 + 1;
      puVar5[2] = uVar10;
      puVar12 = puVar13;
    } while (puVar13 != puVar11);
  }
  if (puVar4[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*puVar4,puVar4[2] << 3,8);
  return;
}

