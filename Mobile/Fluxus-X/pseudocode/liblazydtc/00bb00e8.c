/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb00e8
 */

void ZSTD_getFrameContentSize(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  undefined8 local_58 [2];
  int local_44;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  lVar3 = ZSTD_getFrameHeader_advanced(local_58,param_1,param_2,0);
  uVar1 = 0;
  if (local_44 != 1) {
    uVar1 = local_58[0];
  }
  if (lVar3 != 0) {
    uVar1 = 0xfffffffffffffffe;
  }
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar1);
  }
  return;
}

