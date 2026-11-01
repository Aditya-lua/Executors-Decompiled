
/* WARNING: Removing unreachable block (ram,0x00648e90) */

void FUN_00648e60(long param_1,long param_2,undefined8 param_3)

{
  long *plVar1;
  ulong uVar2;
  long *plVar3;
  undefined8 uStack0000000000000008;
  
  plVar1 = (long *)(param_2 + *(long *)(param_1 + -0x28));
  uVar2 = func_0x00662d8c(param_3,plVar1);
  if ((uVar2 & 1) == 0) {
    plVar3 = (long *)(**(code **)(*plVar1 + 0x18))(plVar1);
    (**(code **)(*(long *)((long)plVar3 + *(long *)(*plVar3 + -0x70)) + 0x18))();
    uStack0000000000000008 = plVar1;
    func_0x00663114();
    func_0x00662ee4(&uStack0000000000000008,"PrivateExponent",0x28,1);
  }
  return;
}

