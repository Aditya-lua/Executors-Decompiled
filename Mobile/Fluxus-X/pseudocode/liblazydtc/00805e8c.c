/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805e8c
 */

void _INIT_31(void)

{
  if ((DAT_00d1b028 & 1) == 0) {
    DAT_00d1b028 = 1;
    DAT_00d1b020 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b020;
  }
  return;
}

