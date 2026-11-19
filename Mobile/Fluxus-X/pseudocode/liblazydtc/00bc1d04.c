/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1d04
 */

void ZSTD_XXH32_canonicalFromHash(uint *param_1,uint param_2)

{
  uint uVar1;
  
  uVar1 = (param_2 & 0xff00ff00) >> 8 | (param_2 & 0xff00ff) << 8;
  *param_1 = uVar1 >> 0x10 | uVar1 << 0x10;
  return;
}

