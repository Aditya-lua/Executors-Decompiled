ulonglong FUN_180e11b70(undefined8 param_1)

{
  int iVar1;
  uint uStackX_10;
  undefined1 auStack_28 [16];
  byte bStack_18;
  
  iVar1 = CreateDirectoryW(param_1,0);
  if (iVar1 != 0) {
    uStackX_10 = CONCAT31(uStackX_10._1_3_,1);
    return (ulonglong)uStackX_10;
  }
  iVar1 = GetLastError();
  if (iVar1 == 0xb7) {
    iVar1 = FUN_180e11d50(param_1,auStack_28,3,0xffffffff);
    if ((iVar1 == 0) && ((bStack_18 & 0x10) == 0)) {
      iVar1 = 0xb7;
    }
  }
  return CONCAT44(iVar1,uStackX_10) & 0xffffffffffffff00;
}


