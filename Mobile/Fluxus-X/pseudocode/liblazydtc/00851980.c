/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851980
 */

void _INIT_114(void)

{
  if ((DAT_00d1ea58 & 1) == 0) {
    DAT_00d1ea58 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea50 = DAT_00d1e930;
  }
  return;
}

