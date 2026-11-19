/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008447a0
 */

long FUN_008447a0(long *param_1,undefined8 *param_2)

{
  long *plVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  void *pvVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  void *local_70;
  undefined8 *local_68;
  undefined8 *local_60;
  void *local_58;
  long *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  lVar12 = param_1[1] - *param_1;
  uVar7 = (lVar12 >> 5) * -0x5555555555555555 + 1;
  if (uVar7 < 0x2aaaaaaaaaaaaab) {
    local_50 = param_1 + 2;
    lVar9 = *local_50 - *param_1 >> 5;
    uVar10 = lVar9 * 0x5555555555555556;
    if (uVar10 <= uVar7) {
      uVar10 = uVar7;
    }
    if (0x155555555555554 < (ulong)(lVar9 * -0x5555555555555555)) {
      uVar10 = 0x2aaaaaaaaaaaaaa;
    }
    if (uVar10 == 0) {
      local_70 = (void *)0x0;
    }
    else {
      if (0x2aaaaaaaaaaaaaa < uVar10) goto LAB_00844958;
      local_70 = operator_new(uVar10 * 0x60);
    }
    uVar13 = *param_2;
    uVar15 = param_2[3];
    uVar14 = param_2[2];
    local_68 = (undefined8 *)((long)local_70 + lVar12);
    uVar8 = param_2[6];
    uVar11 = *(undefined8 *)((long)param_2 + 0x55);
    local_58 = (void *)((long)local_70 + uVar10 * 0x60);
    local_68[1] = param_2[1];
    *local_68 = uVar13;
    local_68[3] = uVar15;
    local_68[2] = uVar14;
    uVar15 = param_2[5];
    uVar14 = param_2[4];
    local_68[6] = uVar8;
    uVar8 = param_2[9];
    uVar13 = param_2[10];
    local_68[5] = uVar15;
    local_68[4] = uVar14;
    uVar15 = param_2[8];
    uVar14 = param_2[7];
    *(undefined8 *)((long)local_68 + 0x55) = uVar11;
    local_68[8] = uVar15;
    local_68[7] = uVar14;
    local_68[9] = uVar8;
    local_68[10] = uVar13;
    local_60 = local_68 + 0xc;
    param_2[4] = 0;
    param_2[5] = 0;
    param_2[8] = 0;
    param_2[9] = 0;
    param_2[6] = 0;
    param_2[7] = 0;
                    /* try { // try from 008448a4 to 008448af has its CatchHandler @ 0084496c */
    FUN_00844994(param_1,&local_70);
    puVar3 = local_68;
    lVar12 = param_1[1];
    while (puVar4 = local_60, puVar3 != local_60) {
      pvVar6 = (void *)local_60[-5];
      puVar5 = local_60 + -0xc;
      if (pvVar6 != (void *)0x0) {
        plVar1 = local_60 + -3;
        local_60[-4] = pvVar6;
        local_60 = local_60 + -0xc;
        operator_delete(pvVar6,*plVar1 - (long)pvVar6);
        puVar5 = local_60;
      }
      local_60 = puVar5;
      pvVar6 = (void *)puVar4[-8];
      if (pvVar6 != (void *)0x0) {
        puVar4[-7] = pvVar6;
        operator_delete(pvVar6,puVar4[-6] - (long)pvVar6);
      }
    }
    if (local_70 != (void *)0x0) {
      operator_delete(local_70,(long)local_58 - (long)local_70);
    }
    if (*(long *)(lVar2 + 0x28) == local_48) {
      return lVar12;
    }
  }
  else {
    if (*(long *)(lVar2 + 0x28) != local_48) goto LAB_00844990;
    FUN_00844b5c();
LAB_00844958:
    if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_00844990:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

