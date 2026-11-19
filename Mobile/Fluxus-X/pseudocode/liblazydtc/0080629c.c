/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080629c
 */

void _INIT_51(void)

{
  if ((DAT_00d1b168 & 1) == 0) {
    DAT_00d1b168 = 1;
    DAT_00d1b160 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b160;
  }
  return;
}

