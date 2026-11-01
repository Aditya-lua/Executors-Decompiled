
long thunk_FUN_00042938(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  
  *(undefined **)(unaff_x19 + 0x58) = &UNK_00a15670;
  *(undefined **)(unaff_x19 + 0x60) = &UNK_00a15720;
  lVar1 = *(long *)(unaff_x19 + 0xa8);
  uVar3 = *(ulong *)(unaff_x19 + 0x98);
  if (*(ulong *)(unaff_x19 + 0xa0) <= *(ulong *)(unaff_x19 + 0x98)) {
    uVar3 = *(ulong *)(unaff_x19 + 0xa0);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar3) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  lVar1 = *(long *)(unaff_x19 + 0x88);
  uVar3 = *(ulong *)(unaff_x19 + 0x78);
  if (*(ulong *)(unaff_x19 + 0x80) <= *(ulong *)(unaff_x19 + 0x78)) {
    uVar3 = *(ulong *)(unaff_x19 + 0x80);
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined4 *)(lVar1 + -4 + uVar3 * 4) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  func_0x0001753c();
  lVar1 = func_0x0001753c();
  lVar2 = func_0x00041f4c();
  *(undefined **)(lVar2 + 0x58) = &UNK_00a15670;
  *(undefined **)(lVar2 + 0x60) = &UNK_00a15720;
  lVar2 = *(long *)(lVar2 + 0xa8);
  uVar3 = *(ulong *)(lVar1 + 0x98);
  if (*(ulong *)(lVar1 + 0xa0) <= *(ulong *)(lVar1 + 0x98)) {
    uVar3 = *(ulong *)(lVar1 + 0xa0);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lVar2 + -1 + uVar3) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  lVar2 = *(long *)(lVar1 + 0x88);
  uVar3 = *(ulong *)(lVar1 + 0x78);
  if (*(ulong *)(lVar1 + 0x80) <= *(ulong *)(lVar1 + 0x78)) {
    uVar3 = *(ulong *)(lVar1 + 0x80);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined4 *)(lVar2 + -4 + uVar3 * 4) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return lVar1;
}

