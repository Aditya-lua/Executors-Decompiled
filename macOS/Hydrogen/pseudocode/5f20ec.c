
undefined1  [16]
FUN_005f20ec(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6)

{
  long *plVar1;
  long *plVar2;
  undefined1 auVar3 [16];
  
  auVar3 = __Unwind_Resume();
  plVar1 = auVar3._0_8_;
  plVar2 = (long *)(**(code **)(*plVar1 + 0x50))();
  (**(code **)(*plVar1 + 0x58))(plVar1,plVar2,param_5,param_6);
  (**(code **)(*plVar2 + 0x28))(plVar2,param_3,param_4);
  auVar3 = (**(code **)(*plVar1 + 0x80))(plVar1,auVar3._8_8_,plVar2);
  (**(code **)(*plVar2 + 8))(plVar2);
  return auVar3;
}

