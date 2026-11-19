/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875524
 */

int FUN_00875524(long param_1,undefined4 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_40 = 0;
  FUN_0087559c(param_1 + 0xd8,&local_40);
  lVar2 = *(long *)(param_1 + 0xe0);
  *(undefined4 *)(lVar2 + -8) = 0;
  *(undefined4 *)(lVar2 + -4) = param_2;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return (int)((ulong)(*(long *)(param_1 + 0xe0) - *(long *)(param_1 + 0xd8)) >> 3) + -1;
}

