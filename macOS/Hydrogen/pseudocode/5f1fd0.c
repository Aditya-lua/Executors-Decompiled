
undefined8 FUN_005f1fd0(long *param_1)

{
  long *plVar1;
  undefined8 uVar2;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x50))();
  (**(code **)(*param_1 + 0x58))(param_1,plVar1);
  (**(code **)(*plVar1 + 0x28))(plVar1);
  uVar2 = (**(code **)(*param_1 + 0x68))(param_1,plVar1);
  (**(code **)(*plVar1 + 8))(plVar1);
  return uVar2;
}

