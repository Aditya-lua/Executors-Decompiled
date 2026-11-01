
void FUN_0066ad04(long *param_1,undefined4 param_2)

{
  undefined4 uVar1;
  long *plVar2;
  long lVar3;
  
  plVar2 = (long *)(**(code **)(*param_1 + 0x160))();
  lVar3 = (**(code **)(*plVar2 + 0x138))();
  uVar1 = 0;
  if (lVar3 != 0) {
    uVar1 = param_2;
  }
  *(undefined4 *)(param_1 + 5) = uVar1;
  return;
}

