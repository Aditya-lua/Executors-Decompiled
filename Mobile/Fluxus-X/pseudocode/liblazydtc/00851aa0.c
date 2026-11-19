/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851aa0
 */

void _INIT_120(void)

{
  if ((DAT_00d1eab8 & 1) == 0) {
    DAT_00d1eab8 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eab0 = DAT_00d1e930;
  }
  return;
}

