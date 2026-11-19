/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806234
 */

void _INIT_49(void)

{
  if ((DAT_00d1b148 & 1) == 0) {
    DAT_00d1b148 = 1;
    DAT_00d1b140 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b140;
  }
  return;
}

