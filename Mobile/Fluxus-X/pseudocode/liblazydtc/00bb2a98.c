/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2a98
 */

undefined1  [16] ZSTD_dParam_getBounds(int param_1)

{
  if (param_1 - 1000U < 5) {
    return ZEXT816(0x100000000) << 0x40;
  }
  if (param_1 == 100) {
    return ZEXT816(0x1f0000000a) << 0x40;
  }
  if (param_1 == 0x3ed) {
    return ZEXT816(0x2000000000400) << 0x40;
  }
  return ZEXT816(0xffffffffffffffd8);
}

