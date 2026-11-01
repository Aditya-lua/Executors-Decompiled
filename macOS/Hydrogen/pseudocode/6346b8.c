
long * FUN_006346b8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  undefined1 auVar4 [16];
  
  (**(code **)(param_1 + 8))();
  auVar4 = __Unwind_Resume();
  plVar2 = auVar4._8_8_;
  plVar1 = auVar4._0_8_;
  lVar3 = plVar2[4];
  *plVar1 = lVar3;
  *(long *)((long)plVar1 + *(long *)(lVar3 + -0x70)) = plVar2[5];
  lVar3 = plVar2[3];
  *plVar1 = lVar3;
  *(long *)((long)plVar1 + *(long *)(lVar3 + -0x70)) = plVar2[6];
  lVar3 = plVar2[2];
  *plVar1 = lVar3;
  *(long *)((long)plVar1 + *(long *)(lVar3 + -0x70)) = plVar2[7];
  *(undefined4 *)(plVar1 + 1) = 0;
  lVar3 = plVar2[1];
  *plVar1 = lVar3;
  *(long *)((long)plVar1 + *(long *)(lVar3 + -0x70)) = plVar2[8];
  plVar1[2] = (long)&UNK_00a09aa0;
  plVar1[3] = 0;
  plVar1[4] = 0;
  func_0x00631da4(plVar1 + 5);
  lVar3 = *plVar2;
  *plVar1 = lVar3;
  *(long *)((long)plVar1 + *(long *)(lVar3 + -0x70)) = plVar2[9];
  plVar1[0x1e] = (long)&UNK_009f6678;
  plVar1[0x1f] = 0;
  plVar1[0x20] = 0;
  plVar1[0x21] = 0;
  func_0x005fdd18(plVar1 + 0x22);
  func_0x005fdd18(plVar1 + 0x28);
  *(undefined2 *)(plVar1 + 0x2e) = 0x100;
  func_0x00635108(plVar1 + 2,param_4);
  (**(code **)(*plVar1 + 0x70))(plVar1,param_5);
  func_0x005ffccc(plVar1 + 0x22,param_6);
  func_0x005ffccc(plVar1 + 0x28,param_7);
  return plVar1;
}

