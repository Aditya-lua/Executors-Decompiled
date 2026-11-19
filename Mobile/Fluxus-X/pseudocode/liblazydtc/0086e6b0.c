/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086e6b0
 */

void FUN_0086e6b0(long param_1,int *param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  void *pvVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  ulong uVar8;
  undefined8 uVar9;
  undefined8 local_c0;
  undefined8 uStack_b8;
  void *local_b0;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  byte local_78;
  undefined7 uStack_77;
  undefined8 uStack_70;
  void *local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  void *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  lVar1 = *(long *)(param_1 + 0x1d8);
  if ((((*(long *)(param_1 + 0x1d0) == lVar1) || (param_2[1] != *(int *)(lVar1 + -0x24))) ||
      (*param_2 != *(int *)(lVar1 + -0x28))) ||
     ((param_2[3] != *(int *)(lVar1 + -0x1c) || (param_2[2] != *(int *)(lVar1 + -0x20))))) {
    uStack_98 = param_4[1];
    local_a0 = *param_4;
    uStack_88 = param_4[3];
    uStack_90 = param_4[2];
    FUN_008aa1ac(&local_78,param_3,&local_a0);
    if (DAT_00d1ebe0 == 1) {
      puVar6 = (undefined8 *)__cxa_allocate_exception(0x30);
      if ((local_78 & 1) == 0) {
        local_c0 = CONCAT71(uStack_77,local_78);
        uStack_b8 = uStack_70;
        local_b0 = local_68;
      }
      else {
                    /* try { // try from 0086e860 to 0086e867 has its CatchHandler @ 0086e8e8 */
        FUN_007ff40c(&local_c0,local_68,uStack_70);
      }
      pvVar4 = local_b0;
      uVar3 = uStack_b8;
      uVar7 = local_c0;
      *puVar6 = &PTR_LAB_00c4a5f8;
      uVar9 = *(undefined8 *)param_2;
      puVar6[2] = *(undefined8 *)(param_2 + 2);
      puVar6[1] = uVar9;
      uStack_b8 = 0;
      local_b0 = (void *)0x0;
      local_c0 = 0;
      puVar6[4] = uVar3;
      puVar6[3] = uVar7;
      puVar6[5] = pvVar4;
      if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* try { // try from 0086e8a4 to 0086e8bb has its CatchHandler @ 0086e8f8 */
                    /* WARNING: Subroutine does not return */
        __cxa_throw(puVar6,&PTR_PTR_00c4a610,&LAB_00857a64);
      }
      goto LAB_0086e94c;
    }
    puVar6 = *(undefined8 **)(param_1 + 0x1d8);
    if (puVar6 < *(undefined8 **)(param_1 + 0x1e0)) {
      if ((local_78 & 1) == 0) {
        local_60 = CONCAT71(uStack_77,local_78);
        uStack_58 = uStack_70;
        local_50 = local_68;
      }
      else {
                    /* try { // try from 0086e790 to 0086e797 has its CatchHandler @ 0086e8dc */
        FUN_007ff40c(&local_60,local_68,uStack_70);
      }
      puVar5 = puVar6 + 6;
      *puVar6 = &PTR_LAB_00c4a5f8;
      uVar7 = *(undefined8 *)param_2;
      puVar6[2] = *(undefined8 *)(param_2 + 2);
      puVar6[1] = uVar7;
      puVar6[4] = uStack_58;
      puVar6[3] = local_60;
      puVar6[5] = local_50;
      *(undefined8 **)(param_1 + 0x1d8) = puVar5;
    }
    else {
                    /* try { // try from 0086e778 to 0086e787 has its CatchHandler @ 0086e918 */
      puVar5 = (undefined8 *)FUN_008702a0(param_1 + 0x1d0,param_2,&local_78);
    }
    uVar8 = (ulong)DAT_00d1ebe0;
    *(undefined8 **)(param_1 + 0x1d8) = puVar5;
    if ((uVar8 <= (ulong)(((long)puVar5 - *(long *)(param_1 + 0x1d0) >> 4) * -0x5555555555555555))
       && ((*(byte *)(param_1 + 0x69) & 1) == 0)) {
      if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* try { // try from 0086e8cc to 0086e8db has its CatchHandler @ 0086e918 */
        uVar7 = FUN_008578f8(param_2,"Reached error limit (%d)");
                    /* catch() { ... } // from try @ 0086e790 with catch @ 0086e8dc */
        *(undefined8 **)(param_1 + 0x1d8) = puVar6;
        if ((local_78 & 1) != 0) {
          operator_delete(local_68,CONCAT71(uStack_77,local_78) & 0xfffffffffffffffe);
        }
        if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar7);
        }
      }
      goto LAB_0086e94c;
    }
    if ((local_78 & 1) != 0) {
      operator_delete(local_68,CONCAT71(uStack_77,local_78) & 0xfffffffffffffffe);
    }
  }
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return;
  }
LAB_0086e94c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

