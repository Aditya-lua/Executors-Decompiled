
void FUN_0049d8d8(undefined8 param_1)

{
  ulong uVar1;
  undefined4 *puVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  undefined4 *puVar6;
  ulong uVar7;
  undefined1 auVar8 [16];
  
  func_0x004b7e08();
  __Unwind_Resume(param_1);
  auVar8 = func_0x007a2668();
  plVar4 = auVar8._8_8_;
  lVar3 = auVar8._0_8_;
  puVar6 = (undefined4 *)*plVar4;
  puVar2 = (undefined4 *)plVar4[1];
  lVar5 = plVar4[2];
  uVar7 = (ulong)((long)puVar2 - (long)puVar6) >> 2;
  uVar1 = uVar7;
  if (*(long *)(lVar3 + 0x18) != 0) {
    uVar1 = uVar7 + 1 >> 1;
  }
  if (*(ulong *)(lVar3 + 0x10) < uVar1) {
    func_0x007acc40(lVar3,uVar1,lVar3 + 0x20,1);
  }
  if (puVar6 != puVar2) {
    do {
      func_0x0049e6ac(lVar3,*puVar6,lVar5);
      lVar5 = lVar5 + 1;
      uVar7 = uVar7 - 1;
      puVar6 = puVar6 + 1;
    } while (uVar7 != 0);
  }
  return;
}

