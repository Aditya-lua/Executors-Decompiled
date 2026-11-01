
void FUN_0073626c(undefined8 *param_1,undefined8 param_2)

{
  long *plVar1;
  long *plVar2;
  
  plVar2 = (long *)*param_1;
  if (plVar2 != (long *)0x0) {
    *param_1 = 0;
    do {
      plVar1 = (long *)plVar2[1];
      plVar2[1] = 0;
      (**(code **)(*plVar2 + 0x10))(plVar2,param_2);
      (*pcRam0000000000a2b5f0)(plVar2);
      plVar2 = plVar1;
    } while (plVar1 != (long *)0x0);
  }
  return;
}

