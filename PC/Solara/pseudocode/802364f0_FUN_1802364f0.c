/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_1802364f0(longlong param_1)

{
  int *piVar1;
  undefined8 *puVar2;
  int iVar3;
  longlong lVar4;
  longlong *plVar5;
  ulonglong uVar6;
  longlong lVar7;
  undefined1 auStack_a8 [32];
  undefined8 uStack_88;
  undefined4 uStack_80;
  undefined4 auStack_78 [2];
  undefined8 uStack_70;
  undefined4 auStack_68 [2];
  undefined8 uStack_60;
  undefined4 auStack_58 [2];
  undefined8 uStack_50;
  longlong lStack_48;
  longlong lStack_40;
  longlong lStack_38;
  undefined4 auStack_30 [2];
  undefined8 uStack_28;
  ulonglong uStack_20;
  
  uStack_20 = _DAT_1810c1700 ^ (ulonglong)auStack_a8;
  LOCK();
  *(undefined4 *)(param_1 + 0x3c) = 1;
  UNLOCK();
  if (*(longlong *)(param_1 + 0x48) != 0) {
    lStack_38 = 1;
    uStack_80 = 0;
    uStack_88 = 0;
    SetWaitableTimer(*(undefined8 *)(param_1 + 0x50),&lStack_38,1,0);
  }
  if (*(longlong *)(param_1 + 0xa8) != 0) {
    FUN_180237e60(param_1);
    FUN_18022fa40(*(undefined8 *)(param_1 + 0xa8));
    lVar4 = *(longlong *)(param_1 + 0xa8);
    if (lVar4 != 0) {
      CloseHandle(*(undefined8 *)(lVar4 + 8));
      func_0x000180e15340(lVar4,0x18);
    }
    *(undefined8 *)(param_1 + 0xa8) = 0;
    LOCK();
    *(int *)(param_1 + 0x30) = *(int *)(param_1 + 0x30) + -1;
    UNLOCK();
  }
  LOCK();
  piVar1 = (int *)(param_1 + 0x30);
  iVar3 = *piVar1;
  *piVar1 = *piVar1;
  UNLOCK();
  while (0 < iVar3) {
    lStack_48 = 0;
    lStack_40 = 0;
    for (plVar5 = *(longlong **)(param_1 + 0x88); plVar5 != (longlong *)0x0;
        plVar5 = (longlong *)plVar5[1]) {
      (**(code **)(*plVar5 + 0x28))(plVar5,&lStack_48);
    }
    lVar4 = *(longlong *)(param_1 + 0x90);
    if (lVar4 != 0) {
      if (lStack_40 == 0) {
        lStack_48 = lVar4;
      }
      else {
        *(longlong *)(lStack_40 + 0x20) = lVar4;
      }
      lStack_40 = *(longlong *)(param_1 + 0x98);
      *(undefined8 *)(param_1 + 0x90) = 0;
      *(undefined8 *)(param_1 + 0x98) = 0;
    }
    if (lStack_48 == 0) {
      auStack_30[0] = 0;
      uStack_28 = 0;
      lStack_38 = 0;
      uVar6 = (ulonglong)uStack_88 >> 0x20;
      uStack_88 = CONCAT44((int)uVar6,*(undefined4 *)(param_1 + 0x40));
      GetQueuedCompletionStatus(*(undefined8 *)(param_1 + 0x28),auStack_30,&uStack_28,&lStack_38);
      if (lStack_38 != 0) {
        LOCK();
        *(int *)(param_1 + 0x30) = *(int *)(param_1 + 0x30) + -1;
        UNLOCK();
        auStack_68[0] = 0;
        uStack_60 = 0x1810bc020;
        (**(code **)(lStack_38 + 0x28))(0,lStack_38,auStack_68,0);
      }
    }
    else {
      do {
        lVar4 = *(longlong *)(lStack_48 + 0x20);
        if (lVar4 == 0) {
          lStack_40 = 0;
        }
        *(undefined8 *)(lStack_48 + 0x20) = 0;
        LOCK();
        *(int *)(param_1 + 0x30) = *(int *)(param_1 + 0x30) + -1;
        UNLOCK();
        auStack_78[0] = 0;
        uStack_70 = 0x1810bc020;
        puVar2 = (undefined8 *)(lStack_48 + 0x28);
        lVar7 = lStack_48;
        lStack_48 = lVar4;
        (*(code *)*puVar2)(0,lVar7,auStack_78,0);
      } while (lStack_48 != 0);
    }
    if (lStack_48 != 0) {
      do {
        lVar4 = *(longlong *)(lStack_48 + 0x20);
        if (lVar4 == 0) {
          lStack_40 = 0;
        }
        *(undefined8 *)(lStack_48 + 0x20) = 0;
        auStack_58[0] = 0;
        uStack_50 = 0x1810bc020;
        puVar2 = (undefined8 *)(lStack_48 + 0x28);
        lVar7 = lStack_48;
        lStack_48 = lVar4;
        (*(code *)*puVar2)(0,lVar7,auStack_58);
      } while (lStack_48 != 0);
    }
    LOCK();
    piVar1 = (int *)(param_1 + 0x30);
    iVar3 = *piVar1;
    *piVar1 = *piVar1;
    UNLOCK();
  }
  if (*(longlong *)(param_1 + 0x48) != 0) {
    FUN_18022fa40();
    lVar4 = *(longlong *)(param_1 + 0x48);
    if (lVar4 != 0) {
      CloseHandle(*(undefined8 *)(lVar4 + 8));
      func_0x000180e15340(lVar4,0x18);
    }
    *(undefined8 *)(param_1 + 0x48) = 0;
  }
  FUN_180e155e0(uStack_20 ^ (ulonglong)auStack_a8);
  return;
}

