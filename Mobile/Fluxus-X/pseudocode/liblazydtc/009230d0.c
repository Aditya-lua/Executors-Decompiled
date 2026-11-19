/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009230d0
 */

long * FUN_009230d0(undefined8 *param_1,byte *param_2,uint param_3)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  byte local_5c [4];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  plVar2 = (long *)(*(code *)PTR_malloc_00cc4670)
                             ((ulong)(uint)(*(int *)(param_1 + 3) << 1) +
                              (ulong)*(uint *)(param_1 + 4) + 0x18);
  if (plVar2 != (long *)0x0) {
    plVar3 = plVar2 + 3;
    *plVar2 = (long)param_1;
    plVar2[1] = (long)plVar3;
    plVar2[2] = (long)plVar3 + (ulong)*(uint *)(param_1 + 3);
    if (*(uint *)((long)param_1 + 0x1c) < param_3) {
      (*(code *)*param_1)();
      (*(code *)param_1[1])(plVar2[1],param_2,param_3);
      param_2 = (byte *)(plVar2[2] + (ulong)*(uint *)(param_1 + 3));
      (*(code *)param_1[2])(param_2,plVar2[1]);
      param_3 = *(uint *)(param_1 + 4);
      plVar3 = (long *)plVar2[1];
    }
    (*(code *)*param_1)(plVar3);
    (*(code *)*param_1)(plVar2[2]);
    if (param_3 == 0) {
      uVar4 = 0;
    }
    else {
      uVar4 = (ulong)param_3;
      uVar5 = uVar4;
      do {
        local_5c[0] = *param_2 ^ 0x36;
        (*(code *)param_1[1])(plVar2[1],local_5c,1);
        local_5c[0] = *param_2 ^ 0x5c;
        (*(code *)param_1[1])(plVar2[2],local_5c,1);
        uVar5 = uVar5 - 1;
        param_2 = param_2 + 1;
      } while (uVar5 != 0);
    }
    if (uVar4 < *(uint *)((long)param_1 + 0x1c)) {
      do {
        (*(code *)param_1[1])(plVar2[1],&DAT_00746c10,1);
        (*(code *)param_1[1])(plVar2[2],&DAT_00746c11,1);
        uVar4 = uVar4 + 1;
      } while (uVar4 < *(uint *)((long)param_1 + 0x1c));
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar2;
}

