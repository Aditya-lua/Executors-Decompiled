/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008861e0
 */

void FUN_008861e0(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined **local_70;
  undefined8 local_68;
  undefined8 *local_60;
  undefined8 *local_58;
  long local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_58 = (undefined8 *)0x0;
  local_50 = 0;
  local_60 = (undefined8 *)0x0;
  local_70 = &PTR_LAB_00c4b768;
  local_68 = param_1;
                    /* try { // try from 0088622c to 00886233 has its CatchHandler @ 008862a0 */
  (**(code **)**(undefined8 **)(param_2 + 0x90))(*(undefined8 **)(param_2 + 0x90),&local_70);
  puVar3 = local_58;
  for (puVar1 = local_60; puVar1 != puVar3; puVar1 = puVar1 + 1) {
                    /* try { // try from 00886244 to 0088624b has its CatchHandler @ 008862a4 */
    FUN_0088dd6c(param_1,*puVar1);
  }
  local_70 = &PTR_LAB_00c4b768;
  if (local_60 != (undefined8 *)0x0) {
    local_58 = local_60;
    operator_delete(local_60,local_50 - (long)local_60);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

