/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0340
 */

void ZSTD_findFrameCompressedSize(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined1 auStack_40 [8];
  undefined8 local_38;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  FUN_00bb04a4(auStack_40,param_1,param_2,0);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_38);
  }
  return;
}

