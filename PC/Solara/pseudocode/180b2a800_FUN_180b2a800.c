/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180b2a800(undefined8 *param_1)

{
  longlong *plVar1;
  int *piVar2;
  longlong *plVar3;
  longlong lVar4;
  undefined8 uVar5;
  undefined1 auStack_58 [32];
  undefined8 uStack_38;
  undefined8 *puStack_28;
  longlong lStack_20;
  ulonglong uStack_18;
  
  uStack_18 = _DAT_1810c1700 ^ (ulonglong)auStack_58;
  puStack_28 = param_1;
  lVar4 = FUN_1801d4460(*param_1);
  uVar5 = FUN_1801d5120(*param_1);
  uStack_38 = 0;
  ReadProcessMemory(uVar5,lVar4 + 0x81d4ba0,&lStack_20,8);
  uVar5 = FUN_1801d5120(*param_1);
  uStack_38 = 0;
  ReadProcessMemory(uVar5,lStack_20 + 0x380,&puStack_28,4);
  plVar3 = (longlong *)param_1[1];
  if (plVar3 != (longlong *)0x0) {
    LOCK();
    plVar1 = plVar3 + 1;
    *(int *)plVar1 = (int)*plVar1 + -1;
    UNLOCK();
    if ((int)*plVar1 == 0) {
      (**(code **)*plVar3)(plVar3);
      LOCK();
      piVar2 = (int *)((longlong)plVar3 + 0xc);
      *piVar2 = *piVar2 + -1;
      UNLOCK();
      if (*piVar2 == 0) {
        (**(code **)(*plVar3 + 8))(plVar3);
      }
    }
  }
  FUN_180e155e0(uStack_18 ^ (ulonglong)auStack_58);
  return;
}

