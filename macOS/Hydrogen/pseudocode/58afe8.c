
undefined8 FUN_0058afe8(long *param_1,undefined8 param_2)

{
  byte *pbVar1;
  bool bVar2;
  byte bVar3;
  undefined8 uVar4;
  long lVar5;
  byte bVar6;
  byte in_wzr;
  long lStack_38;
  undefined1 auStack_30 [16];
  
  lVar5 = *param_1;
  pbVar1 = (byte *)(lVar5 + 8);
  bVar3 = *pbVar1;
  do {
    if ((bVar3 & 1) != 0) {
      func_0x00469240(auStack_30,param_2,&UNK_008ae122,5);
      func_0x004653b0(auStack_30,&UNK_008ae127,4,1,&UNK_009f1730);
      uVar4 = func_0x00465628();
      return uVar4;
    }
    bVar6 = bVar3 | 1;
    bVar2 = *pbVar1 != bVar3;
    bVar3 = *pbVar1;
  } while (bVar2);
  *pbVar1 = bVar6;
  func_0x00469240(auStack_30,param_2,&UNK_008ae122,5);
  lStack_38 = lVar5 + 0x10;
  func_0x004653b0(auStack_30,&UNK_008ae127,4,&lStack_38,&UNK_009f1790);
  uVar4 = func_0x00465628();
  if (*pbVar1 == 1) {
    *pbVar1 = in_wzr;
  }
  else {
    func_0x007b05dc(pbVar1,0);
  }
  return uVar4;
}

