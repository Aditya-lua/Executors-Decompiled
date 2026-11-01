
undefined8 * FUN_00631c88(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long unaff_x19;
  undefined8 *puVar6;
  
  lVar1 = *(long *)(unaff_x19 + 0x20);
  uVar5 = *(ulong *)(unaff_x19 + 0x10);
  if (*(ulong *)(unaff_x19 + 0x18) <= *(ulong *)(unaff_x19 + 0x10)) {
    uVar5 = *(ulong *)(unaff_x19 + 0x18);
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
  __Unwind_Resume(param_1);
  puVar2 = (undefined8 *)func_0x0001753c();
  *puVar2 = &UNK_009fb068;
  puVar6 = (undefined8 *)puVar2[0x16];
  if (puVar6 != (undefined8 *)0x0) {
    puVar4 = (undefined8 *)puVar2[0x17];
    puVar3 = puVar6;
    if (puVar4 != puVar6) {
      do {
        puVar4 = puVar4 + -0xe;
        (**(code **)*puVar4)(puVar4);
      } while (puVar4 != puVar6);
      puVar3 = (undefined8 *)puVar2[0x16];
    }
    puVar2[0x17] = puVar6;
    __ZdlPv(puVar3);
  }
  puVar2[0x10] = &UNK_009f5d60;
  lVar1 = puVar2[0x14];
  uVar5 = puVar2[0x12];
  if ((ulong)puVar2[0x13] <= (ulong)puVar2[0x12]) {
    uVar5 = puVar2[0x13];
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
  func_0x0064f6d0(puVar2 + 1);
  return puVar2;
}

