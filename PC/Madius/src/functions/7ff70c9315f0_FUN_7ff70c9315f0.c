/* 7ff70c9315f0 FUN_7ff70c9315f0 */

void FUN_7ff70c9315f0(undefined8 *param_1,longlong *param_2,ulonglong param_3)

{
  int *piVar1;
  undefined8 *puVar2;
  longlong *plVar3;
  longlong *plVar4;
  undefined8 *puVar5;
  longlong *plVar6;
  ulonglong uVar7;
  longlong *plVar8;
  longlong lVar9;
  longlong *plVar10;
  
  plVar10 = (longlong *)*param_1;
  if ((ulonglong)((param_1[2] - (longlong)plVar10 >> 4) * -0x5555555555555555) < param_3) {
    FUN_7ff70c931930(param_1,param_3);
    plVar10 = (longlong *)*param_1;
    do {
      plVar6 = plVar10 + 6;
      FUN_7ff70c931bb0(plVar10,param_2);
      *(int *)(plVar10 + 5) = (int)param_2[5];
      param_2 = param_2 + 6;
      param_3 = param_3 - 1;
      plVar10 = plVar6;
    } while (param_3 != 0);
  }
  else {
    plVar6 = (longlong *)param_1[1];
    uVar7 = ((longlong)plVar6 - (longlong)plVar10 >> 4) * -0x5555555555555555;
    if (uVar7 < param_3) {
      for (; plVar10 != plVar6; plVar10 = plVar10 + 6) {
        lVar9 = *param_2;
        if (lVar9 != 0) {
          LOCK();
          *(int *)(lVar9 + 0x2c) = *(int *)(lVar9 + 0x2c) + 1;
          UNLOCK();
        }
        if (*plVar10 != 0) {
          LOCK();
          piVar1 = (int *)(*plVar10 + 0x2c);
          *piVar1 = *piVar1 + -1;
          UNLOCK();
          puVar5 = (undefined8 *)*plVar10;
          if ((undefined8 *)*plVar10 != (undefined8 *)0x0 && *piVar1 == 0) {
            do {
              puVar2 = (undefined8 *)puVar5[2];
              puVar5[2] = 0;
              (**(code **)*puVar5)(puVar5,1);
              puVar5 = puVar2;
            } while (puVar2 != (undefined8 *)0x0);
          }
        }
        *plVar10 = lVar9;
        *(int *)(plVar10 + 5) = (int)param_2[5];
        param_2 = param_2 + 6;
        plVar6 = (longlong *)param_1[1];
      }
      if (param_3 != uVar7) {
        lVar9 = uVar7 - param_3;
        plVar10 = plVar6;
        do {
          plVar6 = plVar10 + 6;
          FUN_7ff70c931bb0(plVar10,param_2);
          *(int *)(plVar10 + 5) = (int)param_2[5];
          param_2 = param_2 + 6;
          lVar9 = lVar9 + 1;
          plVar10 = plVar6;
        } while (lVar9 != 0);
      }
    }
    else {
      plVar8 = plVar10 + param_3 * 6;
      plVar4 = plVar8;
      plVar3 = plVar6;
      if (param_3 != 0) {
        do {
          lVar9 = *param_2;
          if (lVar9 != 0) {
            LOCK();
            *(int *)(lVar9 + 0x2c) = *(int *)(lVar9 + 0x2c) + 1;
            UNLOCK();
          }
          if (*plVar10 != 0) {
            LOCK();
            piVar1 = (int *)(*plVar10 + 0x2c);
            *piVar1 = *piVar1 + -1;
            UNLOCK();
            puVar5 = (undefined8 *)*plVar10;
            if (puVar5 != (undefined8 *)0x0 && *piVar1 == 0) {
              do {
                puVar2 = (undefined8 *)puVar5[2];
                puVar5[2] = 0;
                (**(code **)*puVar5)(puVar5,1);
                puVar5 = puVar2;
              } while (puVar2 != (undefined8 *)0x0);
            }
          }
          *plVar10 = lVar9;
          *(int *)(plVar10 + 5) = (int)param_2[5];
          plVar10 = plVar10 + 6;
          param_2 = param_2 + 6;
          param_3 = param_3 - 1;
        } while (param_3 != 0);
        plVar3 = (longlong *)param_1[1];
      }
      for (; plVar6 = plVar8, plVar4 != plVar3; plVar4 = plVar4 + 6) {
        if (*plVar4 != 0) {
          LOCK();
          piVar1 = (int *)(*plVar4 + 0x2c);
          *piVar1 = *piVar1 + -1;
          UNLOCK();
          puVar5 = (undefined8 *)*plVar4;
          if (puVar5 != (undefined8 *)0x0 && *piVar1 == 0) {
            do {
              puVar2 = (undefined8 *)puVar5[2];
              puVar5[2] = 0;
              (**(code **)*puVar5)(puVar5,1);
              puVar5 = puVar2;
            } while (puVar2 != (undefined8 *)0x0);
          }
        }
        *plVar4 = 0;
        if (((longlong *)plVar4[4] != (longlong *)0x0) &&
           (puVar5 = (undefined8 *)(**(code **)(*(longlong *)plVar4[4] + 0x10))(),
           puVar5 != (undefined8 *)0x0)) {
          (**(code **)*puVar5)(puVar5,1);
        }
      }
    }
  }
  param_1[1] = plVar6;
  return;
}


