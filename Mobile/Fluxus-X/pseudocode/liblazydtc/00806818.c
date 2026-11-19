/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806818
 */

void _INIT_78(void)

{
  if ((DAT_00d1b318 & 1) == 0) {
    DAT_00d1b318 = 1;
    DAT_00d1b310 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b310;
  }
  return;
}

