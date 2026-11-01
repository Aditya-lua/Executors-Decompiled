
void FUN_00686a5c(long *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 auStack_28 [2];
  
  (**(code **)(*(long *)param_1[2] + 0x38))((long *)param_1[2],param_2,param_3);
  (**(code **)(*param_1 + 0x98))(param_1);
  iVar1 = (**(code **)(*param_1 + 0x40))(param_1);
  if (iVar1 < 4) {
    uVar2 = func_0x005eede0(param_1,param_4,auStack_28);
    (**(code **)(*param_1 + 0x60))(param_1,uVar2,auStack_28[0]);
  }
  return;
}

