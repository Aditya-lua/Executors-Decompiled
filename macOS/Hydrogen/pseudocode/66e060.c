
long * FUN_0066e060(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   undefined1 param_5,int param_6,undefined8 *param_7,long *param_8)

{
  undefined8 *puVar1;
  long *plVar2;
  long *unaff_x19;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  undefined1 auVar7 [16];
  
  *unaff_x19 = param_1;
  unaff_x19[1] = param_1 + 0x1a8;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  auVar7 = __Unwind_Resume();
  plVar2 = auVar7._0_8_;
  puVar1 = (undefined8 *)func_0x005edf2c(plVar2,0);
  puVar1[3] = 0;
  puVar1[4] = 0;
  *(undefined4 *)(puVar1 + 5) = 0;
  puVar1[6] = &UNK_00a0cce0;
  puVar1[8] = 0xffffffffffffffff;
  puVar1[9] = 0;
  *puVar1 = &UNK_00a0cb08;
  puVar1[1] = &UNK_00a0ccb0;
  puVar1[10] = 0;
  puVar1[0xb] = auVar7._8_8_;
  *(undefined1 *)(puVar1 + 0xc) = param_5;
  *(undefined4 *)((long)puVar1 + 100) = 0;
  puVar1[0xd] = 0;
  if (*(char *)((long)param_7 + 0x17) < '\0') {
    func_0x00017634(puVar1 + 0xe,*param_7,param_7[1]);
  }
  else {
    uVar5 = param_7[1];
    uVar3 = *param_7;
    puVar1[0x10] = param_7[2];
    puVar1[0xf] = uVar5;
    puVar1[0xe] = uVar3;
  }
  if (*(char *)((long)param_8 + 0x17) < '\0') {
    func_0x00017634(plVar2 + 0x11,*param_8,param_8[1]);
  }
  else {
    lVar6 = param_8[1];
    lVar4 = *param_8;
    plVar2[0x13] = param_8[2];
    plVar2[0x12] = lVar6;
    plVar2[0x11] = lVar4;
  }
  if (param_6 < 0) {
    param_6 = (**(code **)(*(long *)plVar2[0xb] + 0x48))();
  }
  *(int *)((long)plVar2 + 100) = param_6;
  (**(code **)(*plVar2 + 0x170))(plVar2,param_4);
  return plVar2;
}

