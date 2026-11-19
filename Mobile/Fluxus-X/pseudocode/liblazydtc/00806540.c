/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806540
 */

void _INIT_64(void)

{
  if ((DAT_00d1b238 & 1) == 0) {
    DAT_00d1b238 = 1;
    DAT_00d1b230 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b230;
  }
  return;
}

