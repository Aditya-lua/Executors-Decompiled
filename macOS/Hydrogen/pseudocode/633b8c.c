
long * FUN_00633b8c(void)

{
  long *plVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  func_0x0001753c();
  auVar3 = func_0x0001753c();
  plVar1 = auVar3._0_8_;
  lVar2 = *auVar3._8_8_;
  *plVar1 = lVar2;
  *(long *)((long)plVar1 + *(long *)(lVar2 + -0x70)) = auVar3._8_8_[7];
  func_0x00631cc8(plVar1 + 5);
  plVar1[2] = (long)&UNK_00a09aa0;
  if ((long *)plVar1[4] != (long *)0x0) {
    (**(code **)(*(long *)plVar1[4] + 8))();
  }
  if ((long *)plVar1[3] != (long *)0x0) {
    (**(code **)(*(long *)plVar1[3] + 8))();
  }
  return plVar1;
}

