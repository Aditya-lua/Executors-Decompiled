
undefined1  [16] FUN_00429254(long param_1,int param_2)

{
  long lVar1;
  undefined8 uVar2;
  int iVar3;
  undefined1 auVar4 [16];
  undefined1 auStack_50 [16];
  
  if (!SBORROW8(param_1,1)) {
    auVar4._8_4_ = param_2 + 1000000000;
    auVar4._0_8_ = param_1 + -1;
    auVar4._12_4_ = 0;
    return auVar4;
  }
  iVar3 = 0x9dae30;
  auVar4 = func_0x007a23d8(&UNK_008868a4,0x2f);
  auVar4._8_8_ = auVar4._8_8_;
  auVar4._0_8_ = auVar4._0_8_;
  lVar1 = *auVar4._0_8_ - auVar4._8_8_;
  if (auVar4._8_8_ < 0 == SBORROW8(*auVar4._0_8_,auVar4._8_8_)) {
    iVar3 = (int)auVar4._0_8_[1] - iVar3;
    if (-1 < iVar3) {
      *auVar4._0_8_ = lVar1;
      *(int *)(auVar4._0_8_ + 1) = iVar3;
      return auVar4;
    }
    if (!SBORROW8(lVar1,1)) {
      *auVar4._0_8_ = lVar1 + -1;
      *(int *)(auVar4._0_8_ + 1) = iVar3 + 1000000000;
      return auVar4;
    }
  }
  auVar4 = func_0x007a23d8(&UNK_008868a4,0x2f,&UNK_009dae30);
  func_0x00469240(auStack_50,auVar4._8_8_,&UNK_008872c8,10);
  uVar2 = func_0x004653b0(auStack_50,&UNK_008872d2,6,auVar4._0_8_,&UNK_009db9b8);
  func_0x004653b0(uVar2,&UNK_008872d8,7,auVar4._0_8_ + 8,&UNK_009db9d8);
  auVar4 = func_0x00465628();
  return auVar4;
}

