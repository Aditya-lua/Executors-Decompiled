/* 7ff70c925030 FUN_7ff70c925030 */

void FUN_7ff70c925030(longlong *param_1)

{
  int *piVar1;
  longlong lVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined8 *puVar5;
  longlong lVar6;
  ulonglong uVar7;
  
  FUN_7ff70c925700(param_1 + 0x3d);
  lVar2 = param_1[0x38];
  if (lVar2 != 0) {
    uVar7 = param_1[0x3a] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70c925517;
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[0x38] = 0;
    param_1[0x39] = 0;
    param_1[0x3a] = 0;
  }
  puVar5 = (undefined8 *)param_1[0x36];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x20);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[0x36],0x20);
  lVar2 = param_1[0x30];
  if (lVar2 != 0) {
    uVar7 = param_1[0x32] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70c925517;
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[0x30] = 0;
    param_1[0x31] = 0;
    param_1[0x32] = 0;
  }
  puVar5 = (undefined8 *)param_1[0x2e];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x30);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[0x2e],0x30);
  lVar2 = param_1[0x28];
  if (lVar2 != 0) {
    uVar7 = param_1[0x2a] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70c925517;
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[0x28] = 0;
    param_1[0x29] = 0;
    param_1[0x2a] = 0;
  }
  puVar5 = (undefined8 *)param_1[0x26];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x20);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[0x26],0x20);
  lVar2 = param_1[0x20];
  if (lVar2 != 0) {
    uVar7 = param_1[0x22] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70c925517;
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[0x20] = 0;
    param_1[0x21] = 0;
    param_1[0x22] = 0;
  }
  puVar5 = (undefined8 *)param_1[0x1e];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x20);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[0x1e],0x20);
  lVar2 = param_1[0x18];
  if (lVar2 != 0) {
    uVar7 = param_1[0x1a] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70c925517;
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[0x18] = 0;
    param_1[0x19] = 0;
    param_1[0x1a] = 0;
  }
  puVar5 = (undefined8 *)param_1[0x16];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x30);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[0x16],0x30);
  lVar2 = param_1[0x10];
  if (lVar2 != 0) {
    uVar7 = param_1[0x12] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70c925517;
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[0x10] = 0;
    param_1[0x11] = 0;
    param_1[0x12] = 0;
  }
  puVar5 = (undefined8 *)param_1[0xe];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x30);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[0xe],0x30);
  lVar2 = param_1[8];
  if (lVar2 != 0) {
    uVar7 = param_1[10] - lVar2;
    lVar6 = lVar2;
    if (0xfff < uVar7) {
      lVar6 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) {
LAB_7ff70c925517:
                    /* WARNING: Does not return */
        pcVar4 = (code *)invalidInstructionException();
        (*pcVar4)();
      }
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar6,uVar7);
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[10] = 0;
  }
  puVar5 = (undefined8 *)param_1[6];
  *(undefined8 *)puVar5[1] = 0;
  puVar5 = (undefined8 *)*puVar5;
  while (puVar5 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)*puVar5;
    thunk_FUN_7ff70ca90250(puVar5,0x28);
    puVar5 = puVar3;
  }
  thunk_FUN_7ff70ca90250(param_1[6],0x28);
  if (*param_1 != 0) {
    LOCK();
    piVar1 = (int *)(*param_1 + 0x2c);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    puVar5 = (undefined8 *)*param_1;
    if (puVar5 != (undefined8 *)0x0 && *piVar1 == 0) {
      do {
        puVar3 = (undefined8 *)puVar5[2];
        puVar5[2] = 0;
        (**(code **)*puVar5)(puVar5,1);
        puVar5 = puVar3;
      } while (puVar3 != (undefined8 *)0x0);
    }
  }
  *param_1 = 0;
  if (((longlong *)param_1[4] != (longlong *)0x0) &&
     (puVar5 = (undefined8 *)(**(code **)(*(longlong *)param_1[4] + 0x10))(),
     puVar5 != (undefined8 *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c92550d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)*puVar5)(puVar5,1,*(code **)*puVar5);
    return;
  }
  return;
}


