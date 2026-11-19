/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086db28
 */

void FUN_0086db28(long param_1,long param_2,ulong param_3)

{
  void *pvVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 local_70;
  undefined8 uStack_68;
  void *local_60;
  long *local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if (((param_3 & 1) == 0) || (*(int *)(param_1 + 0x94) == *(int *)(param_2 + 0x14))) {
    local_48 = *(undefined8 *)(param_2 + 0xc);
    uStack_40 = *(undefined8 *)(param_1 + 0x94);
    local_58 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    *local_58 = param_2;
    uStack_50 = 1;
    FUN_008521fc(&local_70,param_1 + 0x90);
    pvVar1 = local_60;
    if (((ulong)local_70 & 1) == 0) {
      pvVar1 = (void *)((long)&local_70 + 1);
    }
                    /* try { // try from 0086dba8 to 0086dbbf has its CatchHandler @ 0086dc3c */
    uVar3 = FUN_008659e8(param_1,&local_48,&local_58,
                         "Expected \'(\', \'{\' or <string> when parsing function call, got %s",
                         pvVar1);
    if (((ulong)local_70 & 1) != 0) {
      operator_delete(local_60,(ulong)local_70 & 0xfffffffffffffffe);
    }
  }
  else {
    local_70 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    *local_70 = param_2;
    uStack_68 = 1;
    uVar3 = FUN_008659e8(param_1,param_2 + 0xc,&local_70,
                         "Expected function call arguments after \'(\'");
  }
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

