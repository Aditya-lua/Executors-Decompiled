/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089f9c8
 */

undefined8 * FUN_0089f9c8(long *param_1,undefined8 *param_2)

{
  long lVar1;
  undefined1 uVar2;
  long lVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  long *plVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  void *local_70;
  undefined8 *puStack_68;
  undefined8 *local_60;
  void *pvStack_58;
  long *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar10 = param_1[1] - *param_1;
  uVar5 = (lVar10 >> 3) * 0x6db6db6db6db6db7 + 1;
  if (uVar5 < 0x492492492492493) {
    plVar9 = param_1 + 2;
    lVar6 = *plVar9 - *param_1 >> 3;
    uVar8 = lVar6 * -0x2492492492492492;
    if (uVar8 <= uVar5) {
      uVar8 = uVar5;
    }
    if (0x249249249249248 < (ulong)(lVar6 * 0x6db6db6db6db6db7)) {
      uVar8 = 0x492492492492492;
    }
    local_50 = plVar9;
    if (uVar8 == 0) {
      local_70 = (void *)0x0;
    }
    else {
      if (0x492492492492492 < uVar8) goto LAB_0089fb68;
      local_70 = operator_new(uVar8 * 0x38);
    }
    puStack_68 = (undefined8 *)((long)local_70 + lVar10);
    uVar12 = param_2[2];
    uVar11 = param_2[1];
    uVar7 = param_2[3];
    param_2[2] = 0;
    param_2[3] = 0;
    *puStack_68 = *param_2;
    uVar2 = *(undefined1 *)(param_2 + 6);
    puStack_68[2] = uVar12;
    puStack_68[1] = uVar11;
    uVar12 = param_2[5];
    uVar11 = param_2[4];
    *(undefined1 *)(puStack_68 + 6) = uVar2;
    *param_2 = 0;
    param_2[1] = 0;
    pvStack_58 = (void *)((long)local_70 + uVar8 * 0x38);
    param_2[4] = 0;
    param_2[5] = 0;
    lVar6 = *param_1;
    lVar1 = param_1[1];
    puStack_68[3] = uVar7;
    *(undefined1 *)(param_2 + 6) = 0x40;
    local_60 = puStack_68 + 7;
    puStack_68[5] = uVar12;
    puStack_68[4] = uVar11;
    lVar10 = (long)puStack_68 + (lVar6 - lVar1);
                    /* try { // try from 0089faf0 to 0089fafb has its CatchHandler @ 0089fb7c */
    FUN_0089fc60(plVar9,lVar6,lVar1,lVar10);
    puVar4 = local_60;
    local_70 = (void *)*param_1;
    lVar6 = param_1[2];
    *param_1 = lVar10;
    param_1[2] = (long)pvStack_58;
    param_1[1] = (long)local_60;
    puStack_68 = local_70;
    local_60 = local_70;
    pvStack_58 = (void *)lVar6;
    FUN_0089fba4(&local_70);
    if (*(long *)(lVar3 + 0x28) == local_48) {
      return puVar4;
    }
  }
  else {
    if (*(long *)(lVar3 + 0x28) != local_48) goto LAB_0089fba0;
    FUN_0089fc4c();
LAB_0089fb68:
    if (*(long *)(lVar3 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_0089fba0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

