/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084c130
 */

void FUN_0084c130(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  void *pvVar5;
  undefined8 *puVar6;
  long *plVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  undefined8 *local_90;
  undefined8 *puStack_88;
  undefined8 *local_80;
  undefined8 *local_78;
  long *local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if ((ulong)param_1[4] < 0x2a) {
    lVar12 = param_1[1];
    lVar10 = param_1[2];
    plVar7 = param_1 + 3;
    lVar8 = *plVar7;
    uVar11 = lVar10 - lVar12;
    uVar9 = lVar8 - *param_1;
    if (uVar11 < uVar9) {
      if (lVar8 == lVar10) {
        local_90 = operator_new(0xfc0);
        FUN_0084c68c(param_1,&local_90);
        local_90 = *(undefined8 **)param_1[1];
        param_1[1] = (long)((undefined8 *)param_1[1] + 1);
        goto LAB_0084c180;
      }
      local_90 = operator_new(0xfc0);
      FUN_0084c50c(param_1,&local_90);
    }
    else {
      uVar9 = (long)uVar9 >> 2;
      if (lVar8 == *param_1) {
        uVar9 = 1;
      }
      local_70 = plVar7;
      if (uVar9 >> 0x3d != 0) {
        if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe1b8();
        }
        goto LAB_0084c388;
      }
      puVar4 = operator_new(uVar9 * 8);
      puVar6 = (undefined8 *)((long)puVar4 + uVar11);
      local_78 = puVar4 + uVar9;
      local_90 = puVar4;
      puStack_88 = puVar6;
      local_80 = puVar6;
                    /* try { // try from 0084c20c to 0084c213 has its CatchHandler @ 0084c360 */
      pvVar5 = operator_new(0xfc0);
      if (uVar11 == uVar9 * 8) {
        if (lVar10 == lVar12) {
                    /* try { // try from 0084c26c to 0084c273 has its CatchHandler @ 0084c34c */
          puVar6 = operator_new(8);
          local_78 = puVar6 + 1;
          local_90 = puVar6;
          puStack_88 = puVar6;
          operator_delete(puVar4,uVar11);
          lVar10 = param_1[2];
        }
        else {
          lVar12 = ((long)uVar11 >> 3) + 1;
          puVar6 = puVar6 + -((ulong)(lVar12 - (lVar12 >> 0x3f)) >> 1);
          puStack_88 = puVar6;
        }
      }
      local_80 = puVar6 + 1;
      *puVar6 = pvVar5;
      lVar12 = -7 - lVar10;
      while (lVar8 = param_1[1], lVar10 != lVar8) {
        lVar10 = lVar10 + -8;
        lVar12 = lVar12 + 8;
                    /* try { // try from 0084c2b8 to 0084c2c3 has its CatchHandler @ 0084c364 */
        FUN_0084c820(&local_90,lVar10);
      }
      puVar6 = (undefined8 *)*param_1;
      lVar1 = param_1[2];
      lVar2 = param_1[3];
      param_1[1] = (long)puStack_88;
      *param_1 = (long)local_90;
      param_1[3] = (long)local_78;
      param_1[2] = (long)local_80;
      local_80 = (undefined8 *)lVar1;
      if (lVar10 != lVar1) {
        local_80 = (undefined8 *)(lVar1 + (-lVar1 - lVar12 & 0xfffffffffffffff8U));
      }
      local_90 = puVar6;
      puStack_88 = (undefined8 *)lVar8;
      local_78 = (undefined8 *)lVar2;
      if (puVar6 != (undefined8 *)0x0) {
        operator_delete(puVar6,lVar2 - (long)puVar6);
      }
    }
  }
  else {
    param_1[4] = param_1[4] - 0x2a;
    local_90 = *(undefined8 **)param_1[1];
    param_1[1] = (long)((undefined8 *)param_1[1] + 1);
LAB_0084c180:
    FUN_0084c38c(param_1,&local_90);
  }
  if (*(long *)(lVar3 + 0x28) == local_68) {
    return;
  }
LAB_0084c388:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

