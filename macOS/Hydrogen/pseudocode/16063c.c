
long FUN_0016063c(int param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  int unaff_w22;
  
  if (param_1 < iRam0000000000a39834) {
  }
  else {
    iVar1 = iRam0000000000a39834;
    if (iRam0000000000a39834 < 0) {
      iVar1 = iRam0000000000a39834 + 1;
    }
    iVar2 = 8;
    if (iRam0000000000a39834 != 0) {
      iVar2 = iRam0000000000a39834 + (iVar1 >> 1);
    }
    if (iVar2 <= unaff_w22) {
      iVar2 = unaff_w22;
    }
    lVar3 = func_0x000b810c((long)iVar2);
    if (lRam0000000000a39838 != 0) {
      _memcpy(lVar3,lRam0000000000a39838,(long)iRam0000000000a39830);
      func_0x000b83d4(lRam0000000000a39838);
    }
    iRam0000000000a39834 = iVar2;
    lRam0000000000a39838 = lVar3;
  }
  iRam0000000000a39830 = unaff_w22;
  _strcpy(lRam0000000000a39838);
  return lRam0000000000a39838;
}

