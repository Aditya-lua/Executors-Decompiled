/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a0ec8
 */

undefined8
FUN_008a0ec8(undefined8 *param_1,long param_2,long param_3,undefined8 param_4,undefined8 param_5)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined **local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  void *local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  void *local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined1 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_a8 = &PTR_FUN_00c4c048;
  uStack_88 = 0;
  local_90 = (void *)0x0;
  local_78 = (void *)0x0;
  uStack_80 = 0;
  uStack_68 = 0;
  local_70 = 0;
  local_60 = 0x40;
  local_58 = 0;
  uStack_50 = 0;
  uStack_a0 = param_4;
  local_98 = param_5;
  if (param_3 != 0) {
                    /* try { // try from 008a0f28 to 008a0fd7 has its CatchHandler @ 008a1068 */
    puVar3 = (undefined8 *)FUN_008a1090(&local_90);
    *puVar3 = 0xff00;
    if (param_3 != 1) {
      puVar3 = (undefined8 *)FUN_008a1090(&local_90,param_2 + 8);
      *puVar3 = 0xff0000;
      if (param_3 != 2) {
        puVar3 = (undefined8 *)FUN_008a1090(&local_90,param_2 + 0x10);
        *puVar3 = 0xff000000;
        if (param_3 != 3) {
          puVar3 = (undefined8 *)FUN_008a1090(&local_90,param_2 + 0x18);
          *puVar3 = 0xff00000000;
          if (param_3 != 4) {
            puVar3 = (undefined8 *)FUN_008a1090(&local_90,param_2 + 0x20);
            *puVar3 = 0xff0000000000;
            if (param_3 != 5) {
              puVar3 = (undefined8 *)FUN_008a1090(&local_90,param_2 + 0x28);
              *puVar3 = 0xff000000000000;
              if (param_3 != 6) {
                puVar3 = (undefined8 *)FUN_008a1090(&local_90,param_2 + 0x30);
                *puVar3 = 0xff00000000000000;
              }
            }
          }
        }
      }
    }
  }
                    /* try { // try from 008a0fe8 to 008a0ff3 has its CatchHandler @ 008a1064 */
  (**(code **)*param_1)(param_1,&local_a8);
  uVar2 = local_58;
  local_a8 = &PTR_FUN_00c4c048;
  if (local_90 != (void *)0x0) {
    operator_delete(local_90);
    local_90 = (void *)0x0;
    operator_delete(local_78);
    uStack_88 = 0;
    uStack_80 = 0;
    local_78 = (void *)0x0;
    operator_delete((void *)0x0);
    local_70 = 0;
    local_60 = 0x40;
  }
  operator_delete(local_78);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar2;
}

