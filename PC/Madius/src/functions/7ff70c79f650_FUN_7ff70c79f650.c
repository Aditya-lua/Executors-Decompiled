/* 7ff70c79f650 FUN_7ff70c79f650 */

undefined8 FUN_7ff70c79f650(longlong param_1,undefined8 param_2)

{
  int *piVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  longlong *plVar4;
  longlong *plVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong *plVar8;
  
  lVar6 = *(longlong *)(param_1 + 0x168);
  uVar7 = *(longlong *)(param_1 + 0x170) - 1U & *(ulonglong *)(param_1 + 0x178);
  puVar3 = *(undefined8 **)(lVar6 + uVar7 * 8);
  if (puVar3[1] == 0) {
    plVar8 = (longlong *)0x0;
  }
  else {
    LOCK();
    piVar1 = (int *)(puVar3[1] + 8);
    *piVar1 = *piVar1 + 1;
    UNLOCK();
    plVar8 = (longlong *)puVar3[1];
    lVar6 = *(longlong *)(param_1 + 0x168);
    uVar7 = *(longlong *)(param_1 + 0x170) - 1U & *(ulonglong *)(param_1 + 0x178);
  }
  plVar4 = (longlong *)*puVar3;
  plVar5 = *(longlong **)(*(longlong *)(lVar6 + uVar7 * 8) + 8);
  if (plVar5 != (longlong *)0x0) {
    LOCK();
    plVar2 = plVar5 + 1;
    *(int *)plVar2 = (int)*plVar2 + -1;
    UNLOCK();
    if ((int)*plVar2 == 0) {
      (**(code **)*plVar5)();
      LOCK();
      piVar1 = (int *)((longlong)plVar5 + 0xc);
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      if (*piVar1 == 0) {
        (**(code **)(*plVar5 + 8))();
      }
    }
  }
  plVar5 = (longlong *)(param_1 + 0x180);
  *plVar5 = *plVar5 + -1;
  lVar6 = 0;
  if (*plVar5 != 0) {
    lVar6 = *(longlong *)(param_1 + 0x178) + 1;
  }
  *(longlong *)(param_1 + 0x178) = lVar6;
  (**(code **)(*plVar4 + 8))(plVar4,param_2,param_1);
  if (plVar8 != (longlong *)0x0) {
    LOCK();
    plVar4 = plVar8 + 1;
    *(int *)plVar4 = (int)*plVar4 + -1;
    UNLOCK();
    if ((int)*plVar4 == 0) {
      (**(code **)*plVar8)(plVar8);
      LOCK();
      piVar1 = (int *)((longlong)plVar8 + 0xc);
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      if (*piVar1 == 0) {
        (**(code **)(*plVar8 + 8))(plVar8);
      }
    }
  }
  return param_2;
}


