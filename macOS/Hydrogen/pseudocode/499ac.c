
void FUN_000499ac(long param_1)

{
  ulong uVar1;
  long in_x9;
  long in_x10;
  ulong in_x11;
  
  uVar1 = *(ulong *)(param_1 + 0xd8);
  if (in_x11 <= *(ulong *)(param_1 + 0xd8)) {
    uVar1 = in_x11;
  }
  *(undefined1 *)(param_1 + 0xd1) = 0;
  if (in_x10 == in_x9 && uVar1 != 0) {
    do {
      *(undefined8 *)(param_1 + uVar1 * 8) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return;
}

