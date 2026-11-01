undefined8 FUN_180df3950(undefined8 param_1,undefined8 param_2,ulonglong param_3,ulonglong *param_4)

{
  int iVar1;
  undefined8 uStackX_20;
  
  *param_4 = 0;
  iVar1 = CryptAcquireContextA(&uStackX_20,0,0,1,0xf0000000);
  if (iVar1 != 0) {
    iVar1 = CryptGenRandom(uStackX_20,param_3 & 0xffffffff,param_2);
    if (iVar1 != 0) {
      CryptReleaseContext(uStackX_20,0);
      *param_4 = param_3;
      return 0;
    }
    CryptReleaseContext();
  }
  return 0xffffffc4;
}


