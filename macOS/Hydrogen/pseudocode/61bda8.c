
undefined8 * FUN_0061bda8(undefined8 param_1)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long unaff_x19;
  
  if (*(long **)(unaff_x19 + 0x18) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x18) + 8))();
  }
  __Unwind_Resume(param_1);
  puVar2 = (undefined8 *)func_0x0001753c();
  *puVar2 = &UNK_00a12c48;
  puVar2[1] = &UNK_00a12d38;
  puVar2[7] = &UNK_00a12dd0;
  lVar1 = puVar2[0xb];
  uVar3 = puVar2[9];
  if ((ulong)puVar2[10] <= (ulong)puVar2[9]) {
    uVar3 = puVar2[10];
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
  *puVar2 = &UNK_00a12ae8;
  puVar2[1] = &UNK_00a12b98;
  lVar1 = puVar2[6];
  uVar3 = puVar2[4];
  if ((ulong)puVar2[5] <= (ulong)puVar2[4]) {
    uVar3 = puVar2[5];
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
  return puVar2;
}

