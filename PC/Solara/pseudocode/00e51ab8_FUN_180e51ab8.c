/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_180e51ab8(undefined8 param_1,undefined4 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  
  uVar3 = 0;
  iVar1 = WriteConsoleW(_DAT_1810c2350,param_1,param_2,param_3,0);
  if (iVar1 == 0) {
    iVar2 = GetLastError();
    if (iVar2 == 6) {
      if (_DAT_1810c2350 < 0xfffffffffffffffe) {
        CloseHandle();
      }
      _DAT_1810c2350 = CreateFileW(&UNK_181044f00,0x40000000,3,0,CONCAT44(uVar3,3),0,0);
      iVar1 = WriteConsoleW(_DAT_1810c2350,param_1,param_2,param_3,0);
    }
  }
  return iVar1;
}


