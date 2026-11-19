/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851860
 */

void _INIT_108(void)

{
  if ((DAT_00d1e9f8 & 1) == 0) {
    DAT_00d1e9f8 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e9f0 = DAT_00d1e930;
  }
  return;
}

