/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806748
 */

void _INIT_74(void)

{
  if ((DAT_00d1b2d8 & 1) == 0) {
    DAT_00d1b2d8 = 1;
    DAT_00d1b2d0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b2d0;
  }
  return;
}

