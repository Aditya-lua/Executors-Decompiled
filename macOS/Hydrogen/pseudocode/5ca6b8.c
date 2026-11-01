
void FUN_005ca6b8(long param_1)

{
  long lVar1;
  long *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 auStack_a0 [4];
  undefined8 uStack_80;
  long lStack_60;
  long lStack_58;
  undefined8 uStack_50;
  undefined8 uStack_30;
  
  while( true ) {
    func_0x0059e65c(param_1);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    param_1 = unaff_x22;
    unaff_x22 = unaff_x22 + 0x80;
  }
  if (*unaff_x20 != 0) {
    func_0x00187bd4();
    __Unwind_Resume();
    unaff_x21 = func_0x007a2668();
    func_0x005c98dc();
  }
  __Unwind_Resume(unaff_x21);
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

