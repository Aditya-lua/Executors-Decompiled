
bool FUN_006ed570(long param_1)

{
  if ((*(char *)(param_1 + 3) == '\0') && (*(long *)(param_1 + 0x18) != 0)) {
    return *(long *)(*(long *)(param_1 + 0x18) + 0x28) != 0;
  }
  return false;
}

