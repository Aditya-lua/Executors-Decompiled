/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851b90
 */

void _INIT_125(void)

{
  if ((DAT_00d1eb08 & 1) == 0) {
    DAT_00d1eb08 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb00 = DAT_00d1e930;
  }
  return;
}

