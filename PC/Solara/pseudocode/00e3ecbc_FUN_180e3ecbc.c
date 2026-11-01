longlong FUN_180e3ecbc(uint param_1,undefined8 param_2,undefined4 param_3,longlong param_4)

{
  byte *pbVar1;
  int iVar2;
  undefined4 uVar3;
  longlong lVar4;
  longlong alStack_18 [2];
  
  lVar4 = FUN_180e433cc(param_1);
  if (lVar4 == -1) {
    *(undefined1 *)(param_4 + 0x30) = 1;
    *(undefined4 *)(param_4 + 0x2c) = 9;
  }
  else {
    alStack_18[0] = 0;
    iVar2 = SetFilePointerEx(lVar4,param_2,alStack_18,param_3);
    if (iVar2 == 0) {
      uVar3 = GetLastError();
      FUN_180e1dad8(uVar3,param_4);
    }
    else if (alStack_18[0] != -1) {
      pbVar1 = (byte *)(*(longlong *)(((longlong)(int)param_1 >> 6) * 8 + 0x1810d49f0) + 0x38 +
                       (ulonglong)(param_1 & 0x3f) * 0x48);
      *pbVar1 = *pbVar1 & 0xfd;
      return alStack_18[0];
    }
  }
  return -1;
}


