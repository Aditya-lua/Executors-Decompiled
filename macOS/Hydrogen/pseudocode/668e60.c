
undefined8 * FUN_00668e60(long param_1)

{
  long lVar1;
  undefined1 in_ZR;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long in_x9;
  undefined1 uStack0000000000000030;
  
  while (!(bool)in_ZR) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  func_0x00087574();
  func_0x00087574(&uStack0000000000000030);
  lVar2 = __Unwind_Resume();
  func_0x00087574(&uStack0000000000000030);
  uVar3 = __Unwind_Resume(lVar2);
  *(undefined **)(lVar2 + 8) = &UNK_009f5d60;
  lVar1 = *(long *)(lVar2 + 0x28);
  uVar5 = *(ulong *)(lVar2 + 0x18);
  if (*(ulong *)(lVar2 + 0x20) <= *(ulong *)(lVar2 + 0x18)) {
    uVar5 = *(ulong *)(lVar2 + 0x20);
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
  __Unwind_Resume(uVar3);
  puVar4 = (undefined8 *)func_0x0001753c();
  *puVar4 = &UNK_00a0c0d0;
  puVar4[1] = &UNK_00a0c190;
  func_0x0064f6d0(puVar4 + 0xf);
  puVar4[9] = &UNK_009f5d60;
  lVar1 = puVar4[0xd];
  uVar5 = puVar4[0xb];
  if ((ulong)puVar4[0xc] <= (ulong)puVar4[0xb]) {
    uVar5 = puVar4[0xc];
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
  puVar4[3] = &UNK_009f5d60;
  lVar1 = puVar4[7];
  uVar5 = puVar4[5];
  if ((ulong)puVar4[6] <= (ulong)puVar4[5]) {
    uVar5 = puVar4[6];
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
  if ((long *)puVar4[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar4[2] + 8))();
  }
  return puVar4;
}

