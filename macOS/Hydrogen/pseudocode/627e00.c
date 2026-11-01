
undefined8 * FUN_00627e00(void)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  
  func_0x0003e9ec();
  puVar2 = (undefined8 *)__Unwind_Resume();
  *puVar2 = &UNK_009fa470;
  puVar2[1] = &UNK_009fa4c8;
  uVar3 = puVar2[0x5c];
  if ((ulong)puVar2[0x5d] <= (ulong)puVar2[0x5c]) {
    uVar3 = puVar2[0x5d];
  }
  if ((undefined8 *)puVar2[0x5e] == puVar2 + 0x4b) {
    *(undefined1 *)((long)puVar2 + 0x2d9) = 0;
    for (; uVar3 != 0; uVar3 = uVar3 - 1) {
      puVar2[uVar3 + 0x4a] = 0;
    }
  }
  puVar2[0x34] = &UNK_009b2d90;
  uVar3 = puVar2[0x48];
  if ((ulong)puVar2[0x49] <= (ulong)puVar2[0x48]) {
    uVar3 = puVar2[0x49];
  }
  *(undefined1 *)((long)puVar2 + 0x239) = 0;
  if ((undefined8 *)puVar2[0x4a] == puVar2 + 0x37 && uVar3 != 0) {
    do {
      puVar2[uVar3 + 0x36] = 0;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
  }
  puVar2[0x2d] = &UNK_00a12330;
  puVar2[0x2e] = &UNK_00a123f0;
  lVar1 = puVar2[0x32];
  uVar3 = puVar2[0x30];
  if ((ulong)puVar2[0x31] <= (ulong)puVar2[0x30]) {
    uVar3 = puVar2[0x31];
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
  uVar3 = puVar2[0x2a];
  if ((ulong)puVar2[0x2b] <= (ulong)puVar2[0x2a]) {
    uVar3 = puVar2[0x2b];
  }
  if ((undefined8 *)puVar2[0x2c] == puVar2 + 0x19) {
    *(undefined1 *)((long)puVar2 + 0x149) = 0;
    for (; uVar3 != 0; uVar3 = uVar3 - 1) {
      puVar2[uVar3 + 0x18] = 0;
    }
  }
  puVar2[2] = &UNK_009b2d90;
  uVar3 = puVar2[0x16];
  if ((ulong)puVar2[0x17] <= (ulong)puVar2[0x16]) {
    uVar3 = puVar2[0x17];
  }
  *(undefined1 *)((long)puVar2 + 0xa9) = 0;
  if ((undefined8 *)puVar2[0x18] == puVar2 + 5 && uVar3 != 0) {
    do {
      puVar2[uVar3 + 4] = 0;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
  }
  return puVar2;
}

