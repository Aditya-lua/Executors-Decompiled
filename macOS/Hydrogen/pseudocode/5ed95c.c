
undefined8 FUN_005ed95c(long *param_1)

{
  long *plVar1;
  long in_x10;
  long lVar2;
  
  if (in_x10 != 0) {
    plVar1 = (long *)(*param_1 + 8);
    lVar2 = in_x10 * 0x18;
    do {
      if ((*plVar1 != 0) && (*(long *)(plVar1[-1] + 0x10) == *(long *)(param_1[2] + 0x10))) {
        return 0;
      }
      plVar1 = plVar1 + 3;
      lVar2 = lVar2 + -0x18;
    } while (lVar2 != 0);
  }
  return 1;
}

