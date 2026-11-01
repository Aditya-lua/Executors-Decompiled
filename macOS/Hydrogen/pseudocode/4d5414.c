
long * FUN_004d5414(long param_1,uint param_2)

{
  long *plVar1;
  long *plVar2;
  
  if (*(ulong *)(param_1 + 0x28) <= (ulong)param_2) {
    return (long *)0x0;
  }
  plVar2 = (long *)(*(long *)(param_1 + 0x20) + (ulong)param_2 * 0x30);
  plVar1 = (long *)0x0;
  if (*plVar2 != -0x8000000000000000) {
    plVar1 = plVar2;
  }
  return plVar1;
}

