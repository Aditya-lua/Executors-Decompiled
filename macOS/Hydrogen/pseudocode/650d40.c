
undefined8 * FUN_00650d40(ulong param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  ulong in_x9;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x0001753c();
  puVar1[10] = &UNK_009f5d60;
  lVar2 = puVar1[0xe];
  uVar3 = puVar1[0xc];
  if ((ulong)puVar1[0xd] <= (ulong)puVar1[0xc]) {
    uVar3 = puVar1[0xd];
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
  *puVar1 = &UNK_00a09a70;
  lVar2 = puVar1[8];
  uVar3 = puVar1[6];
  if ((ulong)puVar1[7] <= (ulong)puVar1[6]) {
    uVar3 = puVar1[7];
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
  lVar2 = puVar1[4];
  uVar3 = puVar1[2];
  if ((ulong)puVar1[3] <= (ulong)puVar1[2]) {
    uVar3 = puVar1[3];
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
  return puVar1;
}

