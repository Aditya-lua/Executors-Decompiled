/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2da0
 */

void ZSTD_estimateDStreamSize_fromFrame(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  undefined1 auStack_58 [8];
  ulong local_50;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uVar2 = ZSTD_getFrameHeader_advanced(auStack_58,param_1,param_2,0);
  if (uVar2 < 0xffffffffffffff89) {
    if (uVar2 == 0) {
      if (local_50 < 0x80000001) {
        uVar2 = local_50;
        if (0x1ffff < local_50) {
          uVar2 = 0x20000;
        }
        uVar2 = local_50 + uVar2 * 3 + 0x17728;
      }
      else {
        uVar2 = 0xfffffffffffffff0;
      }
    }
    else {
      uVar2 = 0xffffffffffffffb8;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

