
bool FUN_006e2328(long *param_1)

{
  if (*(int *)((long)param_1 + 0xc) == 7) {
    return *(char *)(*param_1 + 3) != '\0';
  }
  return false;
}

