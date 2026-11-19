/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086c914
 */

/* WARNING: Removing unreachable block (ram,0x0086ca3c) */

void FUN_0086c914(long param_1,undefined8 param_2)

{
  long lVar1;
  void *pvVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 local_a0;
  undefined8 uStack_98;
  void *local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long *local_70;
  long lStack_68;
  undefined8 local_60;
  undefined1 local_58 [16];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  local_58._0_8_ = 0;
  local_58._8_8_ = 0;
  local_60 = 0;
  local_70 = (long *)(param_1 + 0x480);
  lStack_68 = *(long *)(param_1 + 0x488) - *(long *)(param_1 + 0x480) >> 3;
                    /* try { // try from 0086c960 to 0086c967 has its CatchHandler @ 0086cab0 */
  local_58 = FUN_00862f80(param_1,&local_70);
  if (*(int *)(param_1 + 0x90) == 299) {
    uStack_98 = *(undefined8 *)(param_1 + 0x98);
    local_a0 = *(ulong *)(param_1 + 0x90);
    uStack_88 = *(undefined8 *)(param_1 + 0xa8);
    local_90 = *(void **)(param_1 + 0xa0);
                    /* try { // try from 0086c988 to 0086c98f has its CatchHandler @ 0086caac */
    FUN_00858f2c(param_1);
    local_80 = 0;
                    /* try { // try from 0086c994 to 0086c9b7 has its CatchHandler @ 0086caa4 */
    uVar4 = FUN_00863248(param_1,0,&local_a0,&local_80,0,local_58,0,&local_70);
  }
  else {
    local_80 = 0;
    uStack_78 = 0;
                    /* try { // try from 0086c9c0 to 0086c9cb has its CatchHandler @ 0086caa8 */
    FUN_008521fc(&local_a0);
    pvVar2 = local_90;
    if ((local_a0 & 1) == 0) {
      pvVar2 = (void *)((long)&local_a0 + 1);
    }
                    /* try { // try from 0086c9dc to 0086c9f3 has its CatchHandler @ 0086ca80 */
    uVar4 = FUN_008659e8(param_1,param_2,&local_80,
                         "Expected \'function\' declaration after attribute, but got %s instead",
                         pvVar2);
    if ((local_a0 & 1) != 0) {
      operator_delete(local_90,local_a0 & 0xfffffffffffffffe);
    }
  }
  lVar1 = *local_70 + lStack_68 * 8;
  if (lVar1 != local_70[1]) {
    local_70[1] = lVar1;
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

