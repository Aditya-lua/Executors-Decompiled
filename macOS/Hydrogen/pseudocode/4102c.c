
undefined8 * FUN_0004102c(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  long in_x9;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined4 *)(in_x9 + param_1 * 4) = 0;
  }
  func_0x00611644();
  __Unwind_Resume();
  func_0x0001753c();
  puVar1 = (undefined8 *)func_0x0001753c();
  *puVar1 = &UNK_00a15670;
  puVar1[1] = &UNK_00a15720;
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
  lVar2 = puVar1[6];
  uVar3 = puVar1[4];
  if ((ulong)puVar1[5] <= (ulong)puVar1[4]) {
    uVar3 = puVar1[5];
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
  return puVar1;
}

