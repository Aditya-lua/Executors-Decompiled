/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d1560
 */

void LZ4_compress_fast(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4,
                      undefined4 param_5)

{
  long lVar1;
  undefined1 auStack_4048 [16416];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  LZ4_compress_fast_extState(auStack_4048,param_1,param_2,param_3,param_4,param_5);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

