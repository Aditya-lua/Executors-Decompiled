
void FUN_002207d8(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  undefined8 extraout_x1;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  undefined1 uStack0000000000000008;
  undefined1 auStack_60 [16];
  
  func_0x00217d68(&uStack0000000000000008);
  __Unwind_Resume();
  lVar5 = func_0x007a2668();
  if ((*(char *)(lVar5 + 0x332) == '\x01') && ((*(byte *)(lVar5 + 0x333) & 1) != 0)) {
    func_0x007a2420(auStack_60 + 0x20,&UNK_009ca6c8);
    func_0x00469240(auStack_60,extraout_x1,&UNK_008280e2,0x16);
    func_0x00465628(auStack_60);
    return;
  }
  if (2 < *(long *)(lVar5 + 0x340) - 2U) {
    uVar9 = *(ulong *)(lVar5 + 0x368);
    uVar7 = *(ulong *)(lVar5 + 0x350);
    if (uVar9 != 0) {
      lVar3 = *(long *)(lVar5 + 0x358);
      uVar4 = *(ulong *)(lVar5 + 0x360);
      uVar1 = 0;
      if (uVar7 <= uVar4) {
        uVar1 = uVar7;
      }
      lVar6 = uVar4 - uVar1;
      uVar11 = uVar7 - lVar6;
      lVar8 = 0;
      if (uVar11 <= uVar9) {
        lVar8 = uVar9 - uVar11;
      }
      uVar2 = uVar7;
      if (uVar9 <= uVar11) {
        uVar2 = lVar6 + uVar9;
      }
      lVar6 = uVar2 - lVar6;
      if (lVar6 != 0) {
        puVar10 = (undefined8 *)(uVar4 * 0x18 + uVar1 * -0x18 + lVar3 + 8);
        do {
          if (puVar10[-1] != 0) {
            func_0x00187bd4(*puVar10,puVar10[-1],1);
          }
          puVar10 = puVar10 + 3;
          lVar6 = lVar6 + -1;
        } while (lVar6 != 0);
      }
      if (uVar11 < uVar9) {
        puVar10 = (undefined8 *)(lVar3 + 8);
        do {
          if (puVar10[-1] != 0) {
            func_0x00187bd4(*puVar10,puVar10[-1],1);
          }
          puVar10 = puVar10 + 3;
          lVar8 = lVar8 + -1;
        } while (lVar8 != 0);
      }
    }
    if (uVar7 != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar5 + 0x358),uVar7 * 0x18,8);
    }
  }
  *(long *)(lVar5 + 0x340) = 4;
  return;
}

