/* 7ff70c925700 FUN_7ff70c925700 */

void FUN_7ff70c925700(undefined8 *param_1)

{
  int *piVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined8 *puVar5;
  ulonglong uVar6;
  longlong *plVar7;
  
  plVar7 = (longlong *)*param_1;
  if (plVar7 != (longlong *)0x0) {
    plVar2 = (longlong *)param_1[1];
    if (plVar7 == plVar2) {
      uVar6 = param_1[2] - (longlong)plVar7;
    }
    else {
      do {
        if (*plVar7 != 0) {
          LOCK();
          piVar1 = (int *)(*plVar7 + 0x2c);
          *piVar1 = *piVar1 + -1;
          UNLOCK();
          puVar5 = (undefined8 *)*plVar7;
          if (puVar5 != (undefined8 *)0x0 && *piVar1 == 0) {
            do {
              puVar3 = (undefined8 *)puVar5[2];
              puVar5[2] = 0;
              (**(code **)*puVar5)(puVar5,1);
              puVar5 = puVar3;
            } while (puVar3 != (undefined8 *)0x0);
          }
        }
        *plVar7 = 0;
        if (((longlong *)plVar7[4] != (longlong *)0x0) &&
           (puVar5 = (undefined8 *)(**(code **)(*(longlong *)plVar7[4] + 0x10))(),
           puVar5 != (undefined8 *)0x0)) {
          (**(code **)*puVar5)(puVar5,1);
        }
        plVar7 = plVar7 + 6;
      } while (plVar7 != plVar2);
      plVar7 = (longlong *)*param_1;
      uVar6 = param_1[2] - (longlong)plVar7;
    }
    if (0xfff < uVar6) {
      if (0x1f < (ulonglong)((longlong)plVar7 + (-8 - plVar7[-1]))) {
                    /* WARNING: Does not return */
        pcVar4 = (code *)invalidInstructionException();
        (*pcVar4)();
      }
      uVar6 = uVar6 + 0x27;
      plVar7 = (longlong *)plVar7[-1];
    }
    thunk_FUN_7ff70ca90250(plVar7,uVar6);
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  return;
}


