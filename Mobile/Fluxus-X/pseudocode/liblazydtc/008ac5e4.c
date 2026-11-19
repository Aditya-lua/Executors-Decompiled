/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac5e4
 */

void FUN_008ac5e4(long param_1,undefined8 param_2,undefined8 *param_3)

{
  long lVar1;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  uStack_58 = param_3[1];
  local_60 = *param_3;
  uStack_48 = param_3[3];
  uStack_50 = param_3[2];
  FUN_008b949c(param_1,param_2,&local_60);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

