/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008061cc
 */

void _INIT_47(void)

{
  if ((DAT_00d1b128 & 1) == 0) {
    DAT_00d1b128 = 1;
    DAT_00d1b120 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b120;
  }
  return;
}

