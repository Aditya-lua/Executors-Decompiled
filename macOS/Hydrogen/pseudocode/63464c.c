
long * thunk_FUN_00634654(undefined8 param_1,undefined8 param_2,undefined8 param_3,
                         undefined8 param_4,undefined8 param_5,undefined8 param_6)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  undefined8 unaff_x20;
  long *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined1 auVar4 [16];
  
  func_0x00087574();
  *(undefined8 *)(unaff_x19 + 0xf0) = unaff_x23;
  if (*(long *)(unaff_x19 + 0xf8) != 0) {
    *(long *)(unaff_x19 + 0x100) = *(long *)(unaff_x19 + 0xf8);
    __ZdlPv();
  }
  func_0x00633b94();
  do {
    unaff_x20 = __Unwind_Resume(unaff_x20);
    *(undefined8 *)(unaff_x19 + 0x10) = unaff_x22;
    if (*(long **)(unaff_x19 + 0x20) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x19 + 0x20) + 8))();
    }
  } while ((long *)*unaff_x21 == (long *)0x0);
  (**(code **)(*(long *)*unaff_x21 + 8))();
  auVar4 = __Unwind_Resume(unaff_x20);
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
  func_0x00635108(plVar1 + 2,param_3);
  (**(code **)(*plVar1 + 0x70))(plVar1,param_4);
  func_0x005ffccc(plVar1 + 0x22,param_5);
  func_0x005ffccc(plVar1 + 0x28,param_6);
  return plVar1;
}

