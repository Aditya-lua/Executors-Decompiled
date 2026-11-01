/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180b09c10(undefined8 param_1,undefined8 param_2)

{
  undefined1 auStack_48 [32];
  undefined8 uStack_28;
  undefined1 auStack_18 [8];
  ulonglong uStack_10;
  
  uStack_10 = _DAT_1810c1700 ^ (ulonglong)auStack_48;
  uStack_28 = 0;
  ReadProcessMemory(param_1,param_2,auStack_18,4);
  FUN_180e155e0(uStack_10 ^ (ulonglong)auStack_48);
  return;
}

