/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a016c
 */

void FUN_008a016c(long param_1,ulong param_2,undefined8 param_3)

{
  long lVar1;
  int *piVar2;
  long *plVar3;
  ulong uVar4;
  int local_90 [12];
  int local_60 [10];
  long local_38;
  
  piVar2 = local_90;
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  FUN_0089d05c(local_60,param_1,param_3);
  if (local_60[0] == 7) {
    plVar3 = *(long **)(param_1 + 0x78);
    if (plVar3[5] != 0) {
      uVar4 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
      uVar4 = (param_2 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
      uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(plVar3 + 6) & 0x3f)
      ;
      if ((*(ulong *)(plVar3[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
        do {
          if (*(ulong *)(*plVar3 + uVar4 * 0x10) == param_2) {
            if (*(int *)(*plVar3 + uVar4 * 0x10 + 8) == 0) goto LAB_008a0274;
            break;
          }
          uVar4 = uVar4 + 1 & plVar3[4] - 1U;
        } while ((*(ulong *)(plVar3[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
      }
    }
    local_90[8] = 0;
    local_90[9] = 0;
    local_90[2] = 0;
    local_90[3] = 0;
    local_90[0] = 0;
    local_90[1] = 0;
    local_90[6] = 0;
    local_90[7] = 0;
    local_90[4] = 0;
    local_90[5] = 0;
  }
  else {
LAB_008a0274:
    piVar2 = local_60;
  }
  FUN_008a02ac(param_1,param_2,piVar2);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

