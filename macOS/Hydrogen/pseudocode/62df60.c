
undefined8 * FUN_0062df60(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long in_x9;
  long unaff_x19;
  undefined8 *puVar7;
  undefined1 uStack0000000000000048;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
  }
  func_0x00611644();
  __Unwind_Resume();
  uVar2 = func_0x0001753c();
  *(undefined **)(unaff_x19 + 8) = &UNK_009f5d60;
  lVar1 = *(long *)(unaff_x19 + 0x28);
  uVar5 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar5 = *(ulong *)(unaff_x19 + 0x20);
  }
  if (lVar1 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  FUN_0062e018(&uStack0000000000000048);
  puVar3 = (undefined8 *)__Unwind_Resume(uVar2);
  puVar7 = (undefined8 *)*puVar3;
  if (puVar7 != (undefined8 *)0x0) {
    puVar6 = (undefined8 *)puVar3[1];
    puVar4 = puVar7;
    if (puVar6 != puVar7) {
      do {
        puVar6 = puVar6 + -0xe;
        (**(code **)*puVar6)(puVar6);
      } while (puVar6 != puVar7);
      puVar4 = (undefined8 *)*puVar3;
    }
    puVar3[1] = puVar7;
    __ZdlPv(puVar4);
  }
  return puVar3;
}

