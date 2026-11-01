
void FUN_005ec190(ulong param_1)

{
  bool in_ZR;
  long *plVar1;
  ulong *unaff_x19;
  code *unaff_x22;
  
  if (in_ZR) {
    param_1 = 0;
  }
  if (param_1 < *unaff_x19) {
    *unaff_x19 = param_1;
  }
  plVar1 = (long *)(*unaff_x22)();
  *plVar1 = *plVar1 + -1;
  *(undefined1 *)(plVar1 + 4) = 1;
  return;
}

