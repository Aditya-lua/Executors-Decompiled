
void FUN_000781bc(undefined4 param_1,undefined4 *param_2)

{
  *param_2 = param_1;
  *(byte *)(param_2 + 1) = *(byte *)(param_2 + 1) ^ 0xeb;
  *(byte *)((long)param_2 + 5) = *(byte *)((long)param_2 + 5) ^ 0xa1;
  *(byte *)((long)param_2 + 6) = *(byte *)((long)param_2 + 6) ^ 1;
  *(undefined1 *)((long)param_2 + 7) = 0;
  return;
}

