/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008519e0
 */

void _INIT_116(void)

{
  if ((DAT_00d1ea78 & 1) == 0) {
    DAT_00d1ea78 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea70 = DAT_00d1e930;
  }
  return;
}

