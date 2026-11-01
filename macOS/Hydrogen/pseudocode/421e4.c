
undefined8 * FUN_000421e4(void)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  
  func_0x00042254();
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_00a13298;
  puVar1[1] = &UNK_00a13378;
  lVar2 = puVar1[0xe];
  uVar3 = puVar1[0xc];
  if ((ulong)puVar1[0xd] <= (ulong)puVar1[0xc]) {
    uVar3 = puVar1[0xd];
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
  *puVar1 = &UNK_00a13118;
  puVar1[1] = &UNK_00a131e8;
  lVar2 = puVar1[10];
  uVar3 = puVar1[8];
  if ((ulong)puVar1[9] <= (ulong)puVar1[8]) {
    uVar3 = puVar1[9];
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
  *puVar1 = &UNK_00a12ae8;
  puVar1[1] = &UNK_00a12b98;
  lVar2 = puVar1[6];
  uVar3 = puVar1[4];
  if ((ulong)puVar1[5] <= (ulong)puVar1[4]) {
    uVar3 = puVar1[5];
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
  return puVar1;
}

