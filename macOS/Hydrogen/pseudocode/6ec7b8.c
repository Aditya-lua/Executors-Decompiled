
undefined8 FUN_006ec7b8(long param_1,long param_2,undefined8 param_3,uint param_4)

{
  long *plVar1;
  long in_x9;
  long *plVar2;
  long lVar3;
  
  plVar1 = (long *)(param_1 + in_x9 * -0x28);
  if (((*(byte *)((long)plVar1 + 0x24) >> 2 & 1) != 0) ||
     (plVar2 = (long *)plVar1[1], *(int *)((long)plVar2 + 0xc) != 7)) {
    return 0;
  }
  if ((*(char *)(*plVar2 + 3) != '\0') ||
     (((int)param_4 < 1 || (lVar3 = *(long *)(*plVar2 + 0x18), lVar3 == 0)))) {
    return 0;
  }
  if (*(byte *)(lVar3 + 4) < param_4) {
    if (*(char *)(lVar3 + 5) == '\0') {
      return 0;
    }
    if (*plVar1 - (long)plVar2 >> 4 <= (long)(ulong)param_4) {
      return 0;
    }
    if ((*(byte *)(param_2 + 1) >> 2 & 1) != 0) {
      func_0x006f0ed4(param_2,param_2,param_2 + 0x68);
      plVar2 = *(long **)(param_1 + in_x9 * -0x28 + 8);
    }
    plVar2 = plVar2 + (ulong)param_4 * 2;
  }
  else {
    if ((*(byte *)(param_2 + 1) >> 2 & 1) != 0) {
      func_0x006f0ed4(param_2,param_2,param_2 + 0x68);
    }
    plVar2 = (long *)(*plVar1 + (ulong)(param_4 - 1) * 0x10);
  }
  func_0x006e178c(param_2,plVar2);
  return 1;
}

