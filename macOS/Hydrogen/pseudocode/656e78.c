
long FUN_00656e78(code *param_1)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x20;
  long *unaff_x21;
  
  plVar1 = (long *)(*param_1)();
  plVar2 = (long *)(**(code **)(*unaff_x21 + 0x18))();
  uVar3 = (**(code **)(*plVar2 + 0x10))();
  lVar4 = (**(code **)(*plVar1 + 0x30))(plVar1,uVar3);
  return lVar4 + unaff_x20;
}

