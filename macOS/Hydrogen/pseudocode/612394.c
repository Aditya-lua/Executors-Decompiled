
long FUN_00612394(undefined8 param_1,undefined8 *param_2)

{
  long *plVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 in_x9;
  undefined1 auVar6 [16];
  undefined1 uStack_31;
  
  param_2[2] = param_1;
  param_2[3] = in_x9;
  *(undefined1 *)(param_2 + 4) = 0;
  *(undefined1 *)((long)param_2 + 0x27) = 0x10;
  *param_2 = &UNK_009f60b8;
  uStack_31 = 0x8c;
  auVar6 = ___cxa_throw(param_2,&UNK_009f6090);
  lVar5 = auVar6._8_8_;
  plVar1 = auVar6._0_8_;
  (**(code **)(*plVar1 + 0x38))(plVar1,&uStack_31,1,0,1);
  lVar2 = func_0x00611648(plVar1,*(undefined8 *)(lVar5 + 0x10));
  uVar3 = func_0x006853e4(lVar5);
  uVar4 = func_0x0015665c(lVar5);
  (**(code **)(*plVar1 + 0x38))(plVar1,uVar3,uVar4,0,1);
  return lVar2 + *(long *)(lVar5 + 0x10) + 1;
}

