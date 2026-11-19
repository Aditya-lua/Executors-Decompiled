/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e868
 */

void FUN_0080e868(undefined8 *param_1,ulong param_2)

{
  ulong uVar1;
  void *pvVar2;
  void *pvVar3;
  long *plVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  byte bVar8;
  
  if (param_2 == 0) {
    pvVar2 = (void *)*param_1;
    *param_1 = 0;
    if (pvVar2 != (void *)0x0) {
      operator_delete(pvVar2,param_1[1] << 3);
    }
    param_1[1] = 0;
  }
  else {
    if (param_2 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    pvVar2 = operator_new(param_2 << 3);
    pvVar3 = (void *)*param_1;
    *param_1 = pvVar2;
    if (pvVar3 != (void *)0x0) {
      operator_delete(pvVar3,param_1[1] << 3);
      pvVar2 = (void *)*param_1;
    }
    param_1[1] = param_2;
    memset(pvVar2,0,param_2 << 3);
    plVar4 = (long *)param_1[2];
    if (plVar4 != (long *)0x0) {
      uVar5 = plVar4[1];
      bVar8 = POPCOUNT((char)param_2) + POPCOUNT((char)(param_2 >> 8)) +
              POPCOUNT((char)(param_2 >> 0x10)) + POPCOUNT((char)(param_2 >> 0x18)) +
              POPCOUNT((char)(param_2 >> 0x20)) + POPCOUNT((char)(param_2 >> 0x28)) +
              POPCOUNT((char)(param_2 >> 0x30)) + POPCOUNT((char)(param_2 >> 0x38));
      if (bVar8 < 2) {
        uVar5 = uVar5 & param_2 - 1;
      }
      else if (param_2 <= uVar5) {
        uVar7 = 0;
        if (param_2 != 0) {
          uVar7 = uVar5 / param_2;
        }
        uVar5 = uVar5 - uVar7 * param_2;
      }
      *(undefined8 **)((long)pvVar2 + uVar5 * 8) = param_1 + 2;
      plVar6 = (long *)*plVar4;
      if (plVar6 != (long *)0x0) {
        do {
          uVar7 = plVar6[1];
          if (bVar8 < 2) {
            uVar7 = uVar7 & param_2 - 1;
          }
          else if (param_2 <= uVar7) {
            uVar1 = 0;
            if (param_2 != 0) {
              uVar1 = uVar7 / param_2;
            }
            uVar7 = uVar7 - uVar1 * param_2;
          }
          if (uVar7 == uVar5) {
            plVar4 = plVar6;
          }
          else if (*(long *)((long)pvVar2 + uVar7 * 8) == 0) {
            *(long **)((long)pvVar2 + uVar7 * 8) = plVar4;
            plVar4 = plVar6;
            uVar5 = uVar7;
          }
          else {
            *plVar4 = *plVar6;
            *plVar6 = **(long **)((long)pvVar2 + uVar7 * 8);
            **(undefined8 **)((long)pvVar2 + uVar7 * 8) = plVar6;
          }
          plVar6 = (long *)*plVar4;
        } while (plVar6 != (long *)0x0);
      }
    }
  }
  return;
}

