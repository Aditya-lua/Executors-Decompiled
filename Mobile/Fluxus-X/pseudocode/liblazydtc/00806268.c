/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806268
 */

void _INIT_50(void)

{
  if ((DAT_00d1b158 & 1) == 0) {
    DAT_00d1b158 = 1;
    DAT_00d1b150 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b150;
  }
  return;
}

