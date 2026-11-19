/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00864840
 */

void FUN_00864840(long param_1,long param_2)

{
  long lVar1;
  long *local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(int *)(param_2 + 8) == DAT_00d1b010) &&
     (*(char *)(*(long *)(param_2 + 0x20) + 0x30) == '\x01')) {
    local_48 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    *local_48 = param_2;
    uStack_40 = 1;
    FUN_008659e8(param_1,param_2 + 0xc,&local_48,
                 "Variable \'%s\' is constant and may not be reassigned",
                 **(undefined8 **)(param_2 + 0x20));
  }
  else {
    local_48 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    *local_48 = param_2;
    uStack_40 = 1;
    FUN_008659e8(param_1,param_2 + 0xc,&local_48,"Assigned expression must be a variable or a field"
                );
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

