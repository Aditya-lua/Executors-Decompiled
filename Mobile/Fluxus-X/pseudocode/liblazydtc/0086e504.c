/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086e504
 */

void FUN_0086e504(long param_1,uint param_2,long param_3)

{
  undefined7 *puVar1;
  void *pvVar2;
  long lVar3;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined4 local_80;
  undefined4 uStack_7c;
  void *local_70;
  byte local_60;
  undefined7 uStack_5f;
  undefined7 *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if ((*(int *)(param_1 + 0x148) == 0) || (*(uint *)(param_1 + 0x14c) <= *(uint *)(param_3 + 4))) {
    FUN_0086b5f8(param_1,param_2,param_3,0);
  }
  else {
    local_90 = 0;
    uStack_88 = 0;
    FUN_008521dc(&local_80,&local_90,*(int *)(param_1 + 0x148));
    FUN_008521fc(&local_60,&local_80);
    puVar1 = local_50;
    if ((local_60 & 1) == 0) {
      puVar1 = &uStack_5f;
    }
                    /* try { // try from 0086e584 to 0086e59b has its CatchHandler @ 0086e678 */
    FUN_008aa02c(&local_80,"; did you forget to close %s at line %d?",puVar1,
                 *(int *)(param_1 + 0x14c) + 1);
    pvVar2 = local_70;
    if ((local_80 & 1) == 0) {
      pvVar2 = (void *)((long)&local_80 + 1);
    }
                    /* try { // try from 0086e5ac to 0086e5bb has its CatchHandler @ 0086e658 */
    FUN_0086b5f8(param_1,param_2,param_3,pvVar2);
    if ((local_80 & 1) != 0) {
      operator_delete(local_70,CONCAT44(uStack_7c,local_80) & 0xfffffffffffffffe);
    }
    if ((local_60 & 1) != 0) {
      operator_delete(local_50,CONCAT71(uStack_5f,local_60) & 0xfffffffffffffffe);
    }
  }
  FUN_00853d20(&local_80,param_1 + 0x70);
  if (local_80 == param_2) {
    FUN_00858f2c(param_1);
    FUN_00858f2c(param_1);
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_80 == param_2);
  }
  return;
}

