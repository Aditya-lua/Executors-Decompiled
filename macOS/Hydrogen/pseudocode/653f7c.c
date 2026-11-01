
undefined8 * FUN_00653f7c(code *param_1)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  
  (*param_1)();
  puVar2 = (undefined8 *)__Unwind_Resume();
  *puVar2 = &UNK_00a0c0d0;
  puVar2[1] = &UNK_00a0c190;
  func_0x0064f6d0(puVar2 + 0xf);
  puVar2[9] = &UNK_009f5d60;
  lVar1 = puVar2[0xd];
  uVar3 = puVar2[0xb];
  if ((ulong)puVar2[0xc] <= (ulong)puVar2[0xb]) {
    uVar3 = puVar2[0xc];
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  puVar2[3] = &UNK_009f5d60;
  lVar1 = puVar2[7];
  uVar3 = puVar2[5];
  if ((ulong)puVar2[6] <= (ulong)puVar2[5]) {
    uVar3 = puVar2[6];
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  if ((long *)puVar2[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar2[2] + 8))();
  }
  return puVar2;
}

