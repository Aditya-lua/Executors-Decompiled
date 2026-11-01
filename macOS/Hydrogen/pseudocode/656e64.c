
long FUN_00656e64(code *param_1)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  undefined8 uVar4;
  long lVar5;
  long *unaff_x19;
  long *unaff_x21;
  
  lVar1 = (*param_1)();
  plVar2 = (long *)(**(code **)(*unaff_x19 + 0x88))();
  plVar3 = (long *)(**(code **)(*unaff_x21 + 0x18))();
  uVar4 = (**(code **)(*plVar3 + 0x10))();
  lVar5 = (**(code **)(*plVar2 + 0x30))(plVar2,uVar4);
  return lVar5 + lVar1;
}

