/* 7ff70c931930 FUN_7ff70c931930 */

void FUN_7ff70c931930(ulonglong *param_1,ulonglong param_2)

{
  int *piVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined8 *puVar5;
  longlong lVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  longlong *plVar10;
  ulonglong uVar11;
  
  if (param_2 < 0x555555555555556) {
    plVar10 = (longlong *)*param_1;
    uVar8 = param_1[2] - (longlong)plVar10;
    uVar11 = ((longlong)uVar8 >> 4) * -0x5555555555555555;
    uVar7 = 0x555555555555555 - (uVar11 >> 1);
    uVar9 = (uVar11 >> 1) + uVar11;
    if (uVar9 <= param_2) {
      uVar9 = param_2;
    }
    if (uVar7 <= uVar11 && uVar11 - uVar7 != 0) {
      uVar9 = 0x555555555555555;
    }
    if (plVar10 != (longlong *)0x0) {
      plVar2 = (longlong *)param_1[1];
      if (plVar10 != plVar2) {
        do {
          if (*plVar10 != 0) {
            LOCK();
            piVar1 = (int *)(*plVar10 + 0x2c);
            *piVar1 = *piVar1 + -1;
            UNLOCK();
            puVar5 = (undefined8 *)*plVar10;
            if (puVar5 != (undefined8 *)0x0 && *piVar1 == 0) {
              do {
                puVar3 = (undefined8 *)puVar5[2];
                puVar5[2] = 0;
                (**(code **)*puVar5)(puVar5,1);
                puVar5 = puVar3;
              } while (puVar3 != (undefined8 *)0x0);
            }
          }
          *plVar10 = 0;
          if (((longlong *)plVar10[4] != (longlong *)0x0) &&
             (puVar5 = (undefined8 *)(**(code **)(*(longlong *)plVar10[4] + 0x10))(),
             puVar5 != (undefined8 *)0x0)) {
            (**(code **)*puVar5)(puVar5,1);
          }
          plVar10 = plVar10 + 6;
        } while (plVar10 != plVar2);
        plVar10 = (longlong *)*param_1;
        uVar8 = param_1[2] - (longlong)plVar10;
      }
      if (0xfff < uVar8) {
        if (0x1f < (ulonglong)((longlong)plVar10 + (-8 - plVar10[-1]))) goto LAB_7ff70c931b01;
        uVar8 = uVar8 + 0x27;
        plVar10 = (longlong *)plVar10[-1];
      }
      thunk_FUN_7ff70ca90250(plVar10,uVar8);
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
    }
    if (uVar9 < 0x555555555555556) {
      if (uVar9 == 0) {
        uVar8 = 0;
LAB_7ff70c931ad1:
        *param_1 = uVar8;
        param_1[1] = uVar8;
        param_1[2] = uVar9 * 0x30 + uVar8;
        return;
      }
      if (uVar9 < 0x56) {
        uVar8 = FUN_7ff70ca8ff40(uVar9 * 0x30);
        goto LAB_7ff70c931ad1;
      }
      if (uVar9 != 0x555555555555555) {
        lVar6 = FUN_7ff70ca8ff40(uVar9 * 0x30 + 0x27);
        uVar8 = lVar6 + 0x27U & 0xffffffffffffffe0;
        *(longlong *)(uVar8 - 8) = lVar6;
        goto LAB_7ff70c931ad1;
      }
    }
    FUN_7ff70ca007a0();
  }
  FUN_7ff70c7ac850();
LAB_7ff70c931b01:
                    /* WARNING: Does not return */
  pcVar4 = (code *)invalidInstructionException();
  (*pcVar4)();
}


