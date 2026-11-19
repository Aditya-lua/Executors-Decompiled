/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc22e0
 */

void ZSTD_XXH64_canonicalFromHash(ulong *param_1,ulong param_2)

{
  ulong uVar1;
  
  uVar1 = (param_2 & 0xff00ff00ff00ff00) >> 8 | (param_2 & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  *param_1 = uVar1 >> 0x20 | uVar1 << 0x20;
  return;
}

