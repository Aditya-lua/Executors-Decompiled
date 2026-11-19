/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a8a7c
 */

void FUN_008a8a7c(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long lVar1;
  undefined4 *puVar2;
  long lVar3;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = FUN_00853270(param_2,&DAT_002a518d);
  if (local_50 != 0) {
    puVar2 = (undefined4 *)FUN_008a8b48(param_1,&local_50);
    *puVar2 = 1;
  }
  if (param_3 != (long *)0x0) {
    lVar3 = *param_3;
    while (lVar3 != 0) {
      param_3 = param_3 + 1;
      local_50 = FUN_00853270(param_2);
      if (local_50 != 0) {
        puVar2 = (undefined4 *)FUN_008a8b48(param_1,&local_50);
        *puVar2 = 1;
      }
      lVar3 = *param_3;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

