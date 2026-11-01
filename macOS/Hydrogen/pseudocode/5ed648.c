
undefined1  [16] FUN_005ed648(void)

{
  long *plVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined1 auStack_40 [16];
  
  plVar1 = (long *)func_0x007a2570();
  uVar2 = plVar1[4];
  if (uVar2 < (ulong)plVar1[1]) {
    return *(undefined1 (*) [16])(*plVar1 + uVar2 * 0x10);
  }
  auVar4 = func_0x007a2570(uVar2,plVar1[1],&UNK_009f44d8);
  func_0x00469240(auStack_40,auVar4._8_8_,&UNK_008ba468,8);
  uVar3 = func_0x004653b0(auStack_40,&UNK_008ba460,5,auVar4._0_8_,&UNK_009f44f0);
  func_0x004653b0(uVar3,&UNK_008b9e18,8,auVar4._0_8_ + 0x10,&UNK_009f4510);
  auVar4 = func_0x00465628();
  return auVar4;
}

