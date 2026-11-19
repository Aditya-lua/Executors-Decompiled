/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00886f0c
 */

undefined8 * FUN_00886f0c(long *param_1,undefined8 *param_2,undefined8 *param_3)

{
  ulong uVar1;
  long lVar2;
  size_t __n;
  undefined8 *puVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  void *__dest;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  void *local_70;
  undefined8 *local_68;
  undefined8 *local_60;
  void *pvStack_58;
  long *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  puVar3 = (undefined8 *)param_1[1];
  plVar4 = param_1 + 2;
  if (puVar3 < (undefined8 *)*plVar4) {
    puVar9 = param_2;
    if (param_2 == puVar3) {
      uVar12 = *param_3;
      uVar11 = param_3[3];
      uVar10 = param_3[2];
      puVar3[1] = param_3[1];
      *puVar3 = uVar12;
      puVar3[3] = uVar11;
      puVar3[2] = uVar10;
      param_1[1] = (long)(puVar3 + 4);
    }
    else {
      if (puVar3 + -4 < puVar3) {
        puVar3[1] = puVar3[-3];
        *puVar3 = puVar3[-4];
        puVar3[3] = puVar3[-1];
        puVar3[2] = puVar3[-2];
        puVar7 = puVar3 + 4;
      }
      else {
        puVar7 = puVar3;
      }
      param_1[1] = (long)puVar7;
      if (puVar3 != param_2 + 4) {
        lVar5 = (long)puVar3 - (long)(param_2 + 4);
        memmove((void *)((long)puVar3 - lVar5),param_2,lVar5 - 7);
        puVar7 = (undefined8 *)param_1[1];
      }
      lVar5 = 0x20;
      if (puVar7 <= param_3 || param_3 < param_2) {
        lVar5 = 0;
      }
      param_3 = (undefined8 *)((long)param_3 + lVar5);
      uVar10 = *(undefined8 *)((long)param_3 + 9);
      uVar12 = param_3[1];
      uVar11 = *param_3;
      *(undefined8 *)((long)param_2 + 0x11) = *(undefined8 *)((long)param_3 + 0x11);
      *(undefined8 *)((long)param_2 + 9) = uVar10;
      param_2[1] = uVar12;
      *param_2 = uVar11;
    }
  }
  else {
    lVar5 = *param_1;
    uVar1 = ((long)puVar3 - lVar5 >> 5) + 1;
    if (uVar1 >> 0x3b != 0) {
      if (*(long *)(lVar2 + 0x28) != local_48) goto LAB_00887134;
      FUN_008873ec();
LAB_008870fc:
      if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      goto LAB_00887134;
    }
    uVar6 = *plVar4 - lVar5;
    uVar8 = (long)uVar6 >> 4;
    if (uVar8 <= uVar1) {
      uVar8 = uVar1;
    }
    if (0x7fffffffffffffdf < uVar6) {
      uVar8 = 0x7ffffffffffffff;
    }
    local_50 = plVar4;
    if (uVar8 == 0) {
      local_70 = (void *)0x0;
    }
    else {
      if (uVar8 >> 0x3b != 0) goto LAB_008870fc;
      local_70 = operator_new(uVar8 << 5);
    }
    pvStack_58 = (void *)((long)local_70 + uVar8 * 0x20);
    local_68 = (undefined8 *)((long)local_70 + ((long)param_2 - lVar5));
    local_60 = local_68;
                    /* try { // try from 00886ff8 to 00887003 has its CatchHandler @ 00887110 */
    FUN_0088729c(&local_70,param_3);
    puVar9 = local_68;
    memcpy(local_60,param_2,param_1[1] - (long)param_2);
    lVar5 = param_1[1];
    param_1[1] = (long)param_2;
    __n = (long)param_2 - *param_1;
    __dest = (void *)((long)local_68 - __n);
    local_60 = (undefined8 *)((long)local_60 + (lVar5 - (long)param_2));
    memcpy(__dest,(void *)*param_1,__n);
    local_70 = (void *)*param_1;
    lVar5 = param_1[2];
    *param_1 = (long)__dest;
    param_1[2] = (long)pvStack_58;
    param_1[1] = (long)local_60;
    local_68 = local_70;
    local_60 = local_70;
    pvStack_58 = (void *)lVar5;
    if (local_70 != (void *)0x0) {
      operator_delete(local_70,lVar5 - (long)local_70);
    }
  }
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return puVar9;
  }
LAB_00887134:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

