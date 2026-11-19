/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00879e34
 */

long FUN_00879e34(long *param_1,undefined4 *param_2)

{
  long *plVar1;
  undefined4 uVar2;
  long lVar3;
  undefined4 *puVar4;
  undefined4 *puVar5;
  undefined4 *puVar6;
  void *pvVar7;
  ulong uVar8;
  undefined8 uVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  void *local_70;
  undefined4 *local_68;
  undefined4 *local_60;
  void *local_58;
  long *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar12 = param_1[1] - *param_1;
  uVar8 = (lVar12 >> 3) * 0x6db6db6db6db6db7 + 1;
  if (uVar8 < 0x492492492492493) {
    local_50 = param_1 + 2;
    lVar10 = *local_50 - *param_1 >> 3;
    uVar11 = lVar10 * -0x2492492492492492;
    if (uVar11 <= uVar8) {
      uVar11 = uVar8;
    }
    if (0x249249249249248 < (ulong)(lVar10 * 0x6db6db6db6db6db7)) {
      uVar11 = 0x492492492492492;
    }
    if (uVar11 == 0) {
      local_70 = (void *)0x0;
    }
    else {
      if (0x492492492492492 < uVar11) goto LAB_0087a004;
      local_70 = operator_new(uVar11 * 0x38);
    }
    local_68 = (undefined4 *)((long)local_70 + lVar12);
    uVar2 = *param_2;
    uVar14 = *(undefined8 *)(param_2 + 4);
    uVar13 = *(undefined8 *)(param_2 + 2);
    *(undefined2 *)(local_68 + 1) = *(undefined2 *)(param_2 + 1);
    *local_68 = uVar2;
    uVar9 = *(undefined8 *)(param_2 + 6);
    local_58 = (void *)((long)local_70 + uVar11 * 0x38);
    *(undefined8 *)(local_68 + 4) = uVar14;
    *(undefined8 *)(local_68 + 2) = uVar13;
    uVar14 = *(undefined8 *)(param_2 + 10);
    uVar13 = *(undefined8 *)(param_2 + 8);
    *(undefined8 *)(local_68 + 6) = uVar9;
    uVar9 = *(undefined8 *)(param_2 + 0xc);
    *(undefined8 *)(local_68 + 10) = uVar14;
    *(undefined8 *)(local_68 + 8) = uVar13;
    *(undefined8 *)(local_68 + 0xc) = uVar9;
    local_60 = local_68 + 0xe;
    *(undefined8 *)(param_2 + 2) = 0;
    *(undefined8 *)(param_2 + 4) = 0;
    *(undefined8 *)(param_2 + 10) = 0;
    *(undefined8 *)(param_2 + 0xc) = 0;
    *(undefined8 *)(param_2 + 6) = 0;
    *(undefined8 *)(param_2 + 8) = 0;
                    /* try { // try from 00879f50 to 00879f5b has its CatchHandler @ 0087a018 */
    FUN_0087a040(param_1,&local_70);
    puVar4 = local_68;
    lVar12 = param_1[1];
    while (puVar5 = local_60, puVar4 != local_60) {
      pvVar7 = *(void **)(local_60 + -6);
      puVar6 = local_60 + -0xe;
      if (pvVar7 != (void *)0x0) {
        plVar1 = (long *)(local_60 + -2);
        *(void **)(local_60 + -4) = pvVar7;
        local_60 = local_60 + -0xe;
        operator_delete(pvVar7,*plVar1 - (long)pvVar7);
        puVar6 = local_60;
      }
      local_60 = puVar6;
      pvVar7 = *(void **)(puVar5 + -0xc);
      if (pvVar7 != (void *)0x0) {
        *(void **)(puVar5 + -10) = pvVar7;
        operator_delete(pvVar7,*(long *)(puVar5 + -8) - (long)pvVar7);
      }
    }
    if (local_70 != (void *)0x0) {
      operator_delete(local_70,(long)local_58 - (long)local_70);
    }
    if (*(long *)(lVar3 + 0x28) == local_48) {
      return lVar12;
    }
  }
  else {
    if (*(long *)(lVar3 + 0x28) != local_48) goto LAB_0087a03c;
    FUN_0087a200();
LAB_0087a004:
    if (*(long *)(lVar3 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_0087a03c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

