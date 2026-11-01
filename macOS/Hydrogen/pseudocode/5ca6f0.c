
void FUN_005ca6f0(void)

{
  long lVar1;
  undefined8 auStack_a0 [4];
  undefined8 uStack_80;
  long lStack_60;
  long lStack_58;
  undefined8 uStack_50;
  undefined8 uStack_30;
  
  func_0x005c98dc();
  __Unwind_Resume();
  lVar1 = func_0x007a2668();
  lStack_60 = *(long *)(lVar1 + 8);
  lStack_58 = lStack_60 + *(long *)(lVar1 + 0x10) * 0x80;
  auStack_a0[0] = 2;
  uStack_80 = 2;
  uStack_50 = 0;
  uStack_30 = 0;
  func_0x005a2700(auStack_a0,&UNK_009f2930);
  return;
}

