
bool FUN_006e2390(long param_1)

{
  if (*(int *)(param_1 + 0x4e8dd14) == 7) {
    return *(char *)(*(long *)(param_1 + 0x4e8dd08) + 3) == '\0';
  }
  return false;
}

