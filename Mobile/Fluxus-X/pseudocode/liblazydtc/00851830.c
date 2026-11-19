/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851830
 */

void _INIT_107(void)

{
  if ((DAT_00d1e9e8 & 1) == 0) {
    DAT_00d1e9e8 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e9e0 = DAT_00d1e930;
  }
  return;
}

