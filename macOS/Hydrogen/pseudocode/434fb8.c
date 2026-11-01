
void FUN_00434fb8(long param_1,undefined4 param_2,undefined4 param_3)

{
  if (*(int *)(param_1 + 0x60) == 3) {
    _close(*(undefined4 *)(param_1 + 100));
  }
  *(undefined4 *)(param_1 + 0x60) = param_2;
  *(undefined4 *)(param_1 + 100) = param_3;
  return;
}

