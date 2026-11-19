/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1b464
 */

void FUN_00c1b464(long *param_1,undefined8 *param_2)

{
  void *pvVar1;
  size_t sVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  bool bVar9;
  long lVar10;
  
  if (param_1[1] != 0) {
    lVar10 = param_2[1];
    lVar8 = 0;
    bVar9 = true;
    do {
      lVar3 = lVar10;
      if (!bVar9) {
        pvVar1 = (void *)*param_2;
        if ((ulong)param_2[2] < lVar10 + 2U) {
          sVar2 = param_2[2] * 2;
          if (sVar2 <= lVar10 + 0x3e2U) {
            sVar2 = lVar10 + 0x3e2U;
          }
          param_2[2] = sVar2;
          pvVar1 = realloc(pvVar1,sVar2);
          *param_2 = pvVar1;
          if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          lVar3 = param_2[1];
        }
        else {
        }
        *(undefined2 *)((long)pvVar1 + lVar3) = 0x202c;
        lVar3 = param_2[1] + 2;
        param_2[1] = lVar3;
      }
      plVar7 = *(long **)(*param_1 + lVar8 * 8);
      if ((*(ushort *)((long)plVar7 + 9) >> 1 & 0x1f) < 9) {
        (**(code **)(*plVar7 + 0x20))(plVar7,param_2);
        if ((*(ushort *)((long)plVar7 + 9) & 0xc0) != 0x40) {
          (**(code **)(*plVar7 + 0x28))(plVar7,param_2);
        }
      }
      else {
        uVar4 = lVar3 + 1;
        pvVar1 = (void *)*param_2;
        *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + 1;
        if ((ulong)param_2[2] < uVar4) {
          sVar2 = param_2[2] * 2;
          if (sVar2 <= lVar3 + 0x3e1U) {
            sVar2 = lVar3 + 0x3e1U;
          }
          param_2[2] = sVar2;
          pvVar1 = realloc(pvVar1,sVar2);
          *param_2 = pvVar1;
          if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          uVar4 = param_2[1] + 1;
          lVar6 = param_2[1];
        }
        else {
          lVar6 = lVar3;
        }
        param_2[1] = uVar4;
        lVar5 = *plVar7;
        *(undefined1 *)((long)pvVar1 + lVar6) = 0x28;
        (**(code **)(lVar5 + 0x20))(plVar7,param_2);
        if ((*(ushort *)((long)plVar7 + 9) & 0xc0) != 0x40) {
          (**(code **)(*plVar7 + 0x28))(plVar7,param_2);
        }
        lVar6 = param_2[1];
        pvVar1 = (void *)*param_2;
        uVar4 = lVar6 + 1;
        *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + -1;
        if ((ulong)param_2[2] < uVar4) {
          sVar2 = param_2[2] * 2;
          if (sVar2 <= lVar6 + 0x3e1U) {
            sVar2 = lVar6 + 0x3e1U;
          }
          param_2[2] = sVar2;
          pvVar1 = realloc(pvVar1,sVar2);
          *param_2 = pvVar1;
          if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          lVar6 = param_2[1];
          uVar4 = lVar6 + 1;
        }
        param_2[1] = uVar4;
        *(undefined1 *)((long)pvVar1 + lVar6) = 0x29;
      }
      if (lVar3 == param_2[1]) {
        param_2[1] = lVar10;
      }
      else {
        bVar9 = false;
        lVar10 = param_2[1];
      }
      lVar8 = lVar8 + 1;
    } while (lVar8 != param_1[1]);
  }
  return;
}

