
long FUN_0066a1ac(long param_1)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long in_x9;
  
  *(long *)(param_1 + 8) = in_x9 + 0x10;
  lVar1 = *(long *)(param_1 + 0x28);
  uVar3 = *(ulong *)(param_1 + 0x18);
  if (*(ulong *)(param_1 + 0x20) <= *(ulong *)(param_1 + 0x18)) {
    uVar3 = *(ulong *)(param_1 + 0x20);
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
  __Unwind_Resume();
  lVar1 = func_0x0001753c();
  *(undefined **)(lVar1 + 0x188) = &UNK_009f5d60;
  lVar2 = *(long *)(lVar1 + 0x1a8);
  uVar3 = *(ulong *)(lVar1 + 0x198);
  if (*(ulong *)(lVar1 + 0x1a0) <= *(ulong *)(lVar1 + 0x198)) {
    uVar3 = *(ulong *)(lVar1 + 0x1a0);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(lVar1 + 0x158) = &UNK_009f5d60;
  lVar2 = *(long *)(lVar1 + 0x178);
  uVar3 = *(ulong *)(lVar1 + 0x168);
  if (*(ulong *)(lVar1 + 0x170) <= *(ulong *)(lVar1 + 0x168)) {
    uVar3 = *(ulong *)(lVar1 + 0x170);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(lVar1 + 0x128) = &UNK_009f5d60;
  lVar2 = *(long *)(lVar1 + 0x148);
  uVar3 = *(ulong *)(lVar1 + 0x138);
  if (*(ulong *)(lVar1 + 0x140) <= *(ulong *)(lVar1 + 0x138)) {
    uVar3 = *(ulong *)(lVar1 + 0x140);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(lVar1 + 0xf8) = &UNK_009f5d60;
  lVar2 = *(long *)(lVar1 + 0x118);
  uVar3 = *(ulong *)(lVar1 + 0x108);
  if (*(ulong *)(lVar1 + 0x110) <= *(ulong *)(lVar1 + 0x108)) {
    uVar3 = *(ulong *)(lVar1 + 0x110);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(lVar1 + 200) = &UNK_009f5d60;
  lVar2 = *(long *)(lVar1 + 0xe8);
  uVar3 = *(ulong *)(lVar1 + 0xd8);
  if (*(ulong *)(lVar1 + 0xe0) <= *(ulong *)(lVar1 + 0xd8)) {
    uVar3 = *(ulong *)(lVar1 + 0xe0);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(lVar1 + 0x98) = &UNK_009f5d60;
  lVar2 = *(long *)(lVar1 + 0xb8);
  uVar3 = *(ulong *)(lVar1 + 0xa8);
  if (*(ulong *)(lVar1 + 0xb0) <= *(ulong *)(lVar1 + 0xa8)) {
    uVar3 = *(ulong *)(lVar1 + 0xb0);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x00669d7c(lVar1 + 8);
  return lVar1;
}

