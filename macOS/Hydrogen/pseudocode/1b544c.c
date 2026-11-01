
void FUN_001b544c(long *param_1,long *param_2)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined2 uStack0000000000000000;
  
  lVar6 = *param_1;
  if (lVar6 == -0x7fffffffffffffff) {
    uStack0000000000000000 = 5;
  }
  else {
    uStack0000000000000000 = (undefined2)param_1[3];
  }
  func_0x001f0f84();
  lVar5 = param_2[2];
  if ((ulong)(*param_2 - lVar5) < 2) {
    func_0x0079b61c(param_2,lVar5,2,1,1);
    lVar5 = param_2[2];
  }
  *(undefined2 *)(param_2[1] + lVar5) = 0xffff;
  lVar3 = lVar5 + 2;
  param_2[2] = lVar3;
  uStack0000000000000000 = CONCAT11(uStack0000000000000000._1_1_,0x16);
  if (lVar6 == -0x7fffffffffffffff) {
    if (lVar3 == *param_2) {
      func_0x00458a18(param_2,&UNK_009c9a90);
    }
    *(undefined1 *)(param_2[1] + lVar3) = 1;
    lVar5 = lVar5 + 3;
    param_2[2] = lVar5;
    lVar6 = param_1[2];
    uVar1 = param_1[3];
    lVar3 = *param_2;
    if ((ulong)(lVar3 - lVar5) < 3) {
      func_0x0079b61c(param_2,lVar5,3,1,1);
      lVar5 = param_2[2];
      lVar3 = *param_2;
    }
    uVar2 = (uint)uVar1 & 0xff00ff;
    lVar4 = param_2[1];
    *(char *)((ushort *)(lVar4 + lVar5) + 1) = (char)uVar2;
    *(ushort *)(lVar4 + lVar5) =
         (ushort)(byte)(uVar2 >> 0x10) | (ushort)(((((uint)uVar1 & 0xff00ff00) >> 8) << 0x10) >> 8);
    lVar5 = lVar5 + 3;
    param_2[2] = lVar5;
    if ((ulong)(lVar3 - lVar5) < uVar1) {
      func_0x0079b61c(param_2,lVar5,uVar1,1,1);
      lVar4 = param_2[1];
      lVar5 = param_2[2];
    }
    _memcpy(lVar4 + lVar5,lVar6,uVar1);
    lVar5 = lVar5 + uVar1;
  }
  else {
    lVar6 = param_1[1];
    uVar1 = param_1[2];
    if ((ulong)(*param_2 - lVar3) < uVar1) {
      func_0x0079b61c(param_2,lVar3,uVar1,1,1);
      lVar3 = param_2[2];
    }
    _memcpy(param_2[1] + lVar3,lVar6,uVar1);
    lVar5 = lVar3 + uVar1;
  }
  param_2[2] = lVar5;
  func_0x0024031c();
  return;
}

