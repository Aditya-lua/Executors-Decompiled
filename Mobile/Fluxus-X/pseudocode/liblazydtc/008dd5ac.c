/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd5ac
 */

void LZ4_compress(undefined8 param_1,undefined8 param_2,uint param_3)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_4048 [16416];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (param_3 < 0x7e000001) {
    iVar2 = (uint)((ulong)param_3 * 0x8080808081 >> 0x27) + 0x10;
  }
  else {
    iVar2 = 0;
  }
  LZ4_compress_fast_extState(auStack_4048,param_1,param_2,(ulong)param_3,iVar2,1);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

