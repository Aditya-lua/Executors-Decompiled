
void FUN_0003771c(long param_1)

{
  long *plVar1;
  long in_x9;
  long lVar2;
  long *in_x10;
  long lVar3;
  long in_x11;
  
  *(long **)(param_1 + (ulong)(in_x11 != in_x9) * 8) = in_x10;
  *in_x10 = in_x9;
  *(long **)(in_x9 + 0x10) = in_x10;
  plVar1 = (long *)in_x10[2];
  lVar2 = *plVar1;
  *(undefined1 *)(in_x10 + 3) = 1;
  *(undefined1 *)(plVar1 + 3) = 0;
  lVar3 = *(long *)(lVar2 + 8);
  *plVar1 = lVar3;
  if (lVar3 != 0) {
    *(long **)(lVar3 + 0x10) = plVar1;
  }
  *(long *)(lVar2 + 0x10) = plVar1[2];
  ((undefined8 *)plVar1[2])[*(long **)plVar1[2] != plVar1] = lVar2;
  *(long **)(lVar2 + 8) = plVar1;
  plVar1[2] = lVar2;
  return;
}

