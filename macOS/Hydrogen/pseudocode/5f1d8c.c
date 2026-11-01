
undefined8
FUN_005f1d8c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long *unaff_x19;
  undefined1 auVar4 [16];
  
  (**(code **)(*unaff_x19 + 8))();
  auVar4 = __Unwind_Resume();
  plVar1 = auVar4._0_8_;
  plVar2 = (long *)(**(code **)(*plVar1 + 0x50))();
  (**(code **)(*plVar2 + 0x28))(plVar2,param_3,param_4);
  uVar3 = (**(code **)(*plVar1 + 0x68))(plVar1,auVar4._8_8_,plVar2,param_5,0);
  (**(code **)(*plVar2 + 8))(plVar2);
  return uVar3;
}

