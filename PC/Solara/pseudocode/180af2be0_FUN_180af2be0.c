/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180af2be0(undefined8 param_1,undefined8 *param_2)

{
  longlong *plVar1;
  int iVar2;
  longlong lVar3;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined1 auStack_48 [24];
  longlong lStack_30;
  ulonglong uStack_28;
  
  uStack_28 = _DAT_1810c1700 ^ (ulonglong)auStack_78;
  uStack_58 = CONCAT44(uStack_58._4_4_,4);
  lVar3 = VirtualAllocEx(param_1,0,param_2[2] + 0x21,0x3000);
  if (lVar3 != 0) {
    uStack_58 = 0;
    lStack_30 = lVar3;
    iVar2 = WriteProcessMemory(param_1,lVar3,auStack_48,0x20);
    if (iVar2 != 0) {
      plVar1 = param_2 + 2;
      if (0xf < (ulonglong)param_2[3]) {
        param_2 = (undefined8 *)*param_2;
      }
      uStack_58 = 0;
      iVar2 = WriteProcessMemory(param_1,lVar3 + 0x20,param_2,*plVar1 + 1);
      if (iVar2 != 0) goto LAB_180af2cab;
    }
    VirtualFreeEx(param_1,lVar3,0,0x8000);
  }
LAB_180af2cab:
  FUN_180e155e0(uStack_28 ^ (ulonglong)auStack_78);
  return;
}

