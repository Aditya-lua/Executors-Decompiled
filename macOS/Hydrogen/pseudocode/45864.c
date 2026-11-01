
void FUN_00045864(long param_1,long param_2)

{
  ulong uVar1;
  long in_x9;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined4 *)(in_x9 + param_1 * 4) = 0;
  }
  uVar1 = *(ulong *)(param_2 + 0x58);
  if (*(ulong *)(param_2 + 0x60) <= *(ulong *)(param_2 + 0x58)) {
    uVar1 = *(ulong *)(param_2 + 0x60);
  }
  *(undefined1 *)(param_2 + 0x51) = 0;
  if ((*(long *)(param_2 + 0x68) == param_2 + 8) && (uVar1 != 0)) {
    do {
      *(undefined4 *)(param_2 + 4 + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return;
}

