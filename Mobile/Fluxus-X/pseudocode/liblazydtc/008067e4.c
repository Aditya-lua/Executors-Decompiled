/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008067e4
 */

void _INIT_77(void)

{
  if ((DAT_00d1b308 & 1) == 0) {
    DAT_00d1b308 = 1;
    DAT_00d1b300 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b300;
  }
  return;
}

