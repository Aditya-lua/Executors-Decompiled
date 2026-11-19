/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851890
 */

void _INIT_109(void)

{
  if ((DAT_00d1ea08 & 1) == 0) {
    DAT_00d1ea08 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea00 = DAT_00d1e930;
  }
  return;
}

