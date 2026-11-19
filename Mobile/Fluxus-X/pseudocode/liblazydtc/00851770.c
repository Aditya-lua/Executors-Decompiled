/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851770
 */

void _INIT_103(void)

{
  if ((DAT_00d1e9a8 & 1) == 0) {
    DAT_00d1e9a8 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e9a0 = DAT_00d1e930;
  }
  return;
}

