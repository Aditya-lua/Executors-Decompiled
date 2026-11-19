/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00827284
 */

void FUN_00827284(undefined8 *param_1,long param_2,long param_3)

{
  long lVar1;
  ulong *puVar2;
  byte *pbVar3;
  void *pvVar4;
  ulong uVar5;
  ulong uVar6;
  ulong local_60;
  ulong uStack_58;
  void *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *param_1 = &PTR_LAB_00c48a38;
  pbVar3 = (byte *)(param_1 + 1);
  pbVar3[0] = 0;
  pbVar3[1] = 0;
  pbVar3[2] = 0;
  pbVar3[3] = 0;
  pbVar3[4] = 0;
  pbVar3[5] = 0;
  pbVar3[6] = 0;
  pbVar3[7] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  uStack_58 = 0;
  local_50 = (void *)0x0;
  local_60 = 0;
  if (param_3 == 0) {
    uVar6 = 0;
    uVar5 = 0;
    pvVar4 = (void *)0x0;
  }
  else {
    param_3 = param_3 * 0x18;
    do {
                    /* try { // try from 008272f4 to 008272ff has its CatchHandler @ 008273b8 */
      puVar2 = (ulong *)FUN_0081f6dc(&local_60,param_2);
      pvVar4 = (void *)puVar2[2];
      uVar6 = puVar2[1];
      uVar5 = *puVar2;
      *puVar2 = 0;
      puVar2[1] = 0;
      puVar2[2] = 0;
      if ((local_60 & 1) != 0) {
        operator_delete(local_50,local_60 & 0xfffffffffffffffe);
      }
      param_3 = param_3 + -0x18;
      param_2 = param_2 + 0x18;
      local_60 = uVar5;
      uStack_58 = uVar6;
      local_50 = pvVar4;
    } while (param_3 != 0);
    uStack_58 = 0;
    local_50 = (void *)0x0;
    local_60 = 0;
    if ((*pbVar3 & 1) != 0) {
      operator_delete((void *)param_1[3],param_1[1] & 0xfffffffffffffffe);
      param_1[3] = pvVar4;
      param_1[2] = uVar6;
      param_1[1] = uVar5;
      if ((local_60 & 1) != 0) {
        operator_delete(local_50,local_60 & 0xfffffffffffffffe);
      }
      goto LAB_00827390;
    }
  }
  local_50 = (void *)0x0;
  uStack_58 = 0;
  local_60 = 0;
  param_1[2] = uVar6;
  param_1[1] = uVar5;
  param_1[3] = pvVar4;
LAB_00827390:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

