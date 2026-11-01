
void thunk_FUN_001ec434(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  char cVar3;
  undefined1 uVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined1 (*extraout_x8) [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auStack_b0 [16];
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined1 uStack_90;
  undefined1 auStack_88 [16];
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined1 uStack_68;
  
  __Unwind_Resume();
  puVar5 = (undefined8 *)func_0x007a2668();
  cVar3 = *(char *)((long)puVar5 + 0xa9);
  puVar7 = puVar5 + 0xb;
  if (cVar3 == '\0') {
    puVar7 = puVar5 + 2;
  }
  uVar4 = *(undefined1 *)(puVar5 + 0x15);
  uVar1 = *puVar5;
  uVar2 = puVar5[1];
  uVar6 = *(undefined8 *)(puVar5[0x14] + 0x10);
  lVar8 = *(long *)(puVar5[0x14] + 0x18);
  auStack_b0 = (**(code **)(lVar8 + 0x30))(uVar6,puVar7);
  uStack_a0 = uVar1;
  uStack_98 = uVar2;
  uStack_90 = uVar4;
  auVar9 = func_0x001ecb24(auStack_b0);
  puVar7 = puVar5 + 2;
  if (cVar3 == '\0') {
    puVar7 = puVar5 + 0xb;
  }
  auStack_88 = (**(code **)(lVar8 + 0x30))(uVar6,puVar7);
  puVar7 = auStack_88._8_8_;
  uVar6 = auStack_88._0_8_;
  uStack_78 = uVar1;
  uStack_70 = uVar2;
  uStack_68 = uVar4;
  auVar10 = func_0x001ecb24(auStack_88);
  if ((code *)*puVar7 != (code *)0x0) {
    (*(code *)*puVar7)(uVar6);
  }
  if (puVar7[1] != 0) {
    func_0x00187bd4(uVar6,puVar7[1],puVar7[2]);
  }
  uVar6 = auStack_b0._8_8_;
  uVar1 = auStack_b0._0_8_;
  if (*(code **)auStack_b0._8_8_ != (code *)0x0) {
    (**(code **)auStack_b0._8_8_)(auStack_b0._0_8_);
  }
  lVar8 = *(long *)(uVar6 + 8);
  if (lVar8 != 0) {
    func_0x00187bd4(uVar1,lVar8,*(undefined8 *)(uVar6 + 0x10));
  }
  func_0x001ec608(puVar5);
  *extraout_x8 = auVar9;
  extraout_x8[1] = auVar10;
  return;
}

