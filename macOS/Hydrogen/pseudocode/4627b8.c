
undefined4 FUN_004627b8(long param_1,long param_2)

{
  *(long *)(param_2 + 8) = param_1 + -1;
  return *(undefined4 *)(param_2 + (param_1 + -1) * 4 + 0x10);
}

