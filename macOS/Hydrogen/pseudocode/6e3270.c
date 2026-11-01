
undefined8 FUN_006e3270(long param_1,int param_2)

{
  long *plVar1;
  long lVar2;
  
  plVar1 = (long *)(*(long *)(param_1 + 8) + (long)param_2 * 0x10);
  if ((*(int *)((long)plVar1 + 0xc) == 7) && (lVar2 = *plVar1, *(char *)(lVar2 + 3) != '\0')) {
    return *(undefined8 *)(lVar2 + 0x18);
  }
  return 0;
}

