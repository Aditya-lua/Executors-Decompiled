/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875cac
 */

void FUN_00875cac(long param_1,uint param_2,uint param_3,int param_4)

{
  long lVar1;
  uint local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_2c = (param_3 & 0xff) << 8 | param_2 | param_4 << 0x10;
  FUN_0087593c(param_1 + 0x30,&local_2c);
  FUN_00875bc8(param_1 + 0x48,param_1 + 0x1a0);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

