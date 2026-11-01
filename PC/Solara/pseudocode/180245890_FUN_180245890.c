/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180245890(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined1 auStack_48 [32];
  undefined8 uStack_28;
  undefined8 uStack_18;
  ulonglong uStack_10;
  
  uStack_10 = _DAT_1810c1700 ^ (ulonglong)auStack_48;
  uStack_28 = 0;
  uStack_18 = param_3;
  WriteProcessMemory(param_1,param_2,&uStack_18,8);
  FUN_180e155e0(uStack_10 ^ (ulonglong)auStack_48);
  return;
}

