
void FUN_00680e80(long *param_1)

{
  long *plVar1;
  
  if ((char)param_1[6] != '\0') {
    plVar1 = (long *)(**(code **)(*param_1 + 0xa8))();
    (**(code **)(*plVar1 + 0x40))();
    *(undefined1 *)(param_1 + 6) = 0;
  }
  return;
}

