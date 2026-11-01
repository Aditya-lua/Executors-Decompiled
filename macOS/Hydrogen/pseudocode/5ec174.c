
void FUN_005ec174(long param_1)

{
  ulong uVar1;
  long *plVar2;
  long in_x10;
  ulong *unaff_x19;
  code *unaff_x22;
  
  uVar1 = (**(code **)(in_x10 + 0x30))(param_1 + 0x10);
  if (uVar1 != 5) {
    if (uVar1 == 6) {
      uVar1 = 0;
    }
    if (uVar1 < *unaff_x19) {
      *unaff_x19 = uVar1;
    }
  }
  plVar2 = (long *)(*unaff_x22)();
  *plVar2 = *plVar2 + -1;
  *(undefined1 *)(plVar2 + 4) = 1;
  return;
}

