/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d1628
 */

ulong LZ4_compress_destSize_extState(void *param_1)

{
  ulong uVar1;
  
  uVar1 = FUN_008d1670();
  if ((param_1 != (void *)0x0) && (((ulong)param_1 & 7) == 0)) {
    uVar1 = uVar1 & 0xffffffff;
    memset(param_1,0,0x4020);
  }
  return uVar1;
}

