/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805f90
 */

void _INIT_36(void)

{
  if ((DAT_00d1b078 & 1) == 0) {
    DAT_00d1b078 = 1;
    DAT_00d1b070 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b070;
  }
  return;
}

