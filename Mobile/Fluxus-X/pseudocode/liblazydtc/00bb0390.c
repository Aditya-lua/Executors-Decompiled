/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0390
 */

void ZSTD_getDecompressedSize(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong local_58 [2];
  int local_44;
  long local_28;
  
  lVar3 = tpidr_el0;
  local_28 = *(long *)(lVar3 + 0x28);
  lVar4 = ZSTD_getFrameHeader_advanced(local_58,param_1,param_2,0);
  uVar1 = 0;
  if (local_44 != 1) {
    uVar1 = local_58[0];
  }
  if (lVar4 != 0) {
    uVar1 = 0xfffffffffffffffe;
  }
  uVar2 = 0;
  if (uVar1 < 0xfffffffffffffffe) {
    uVar2 = uVar1;
  }
  if (*(long *)(lVar3 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

