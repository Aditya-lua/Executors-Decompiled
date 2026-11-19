/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851ce0
 */

void _INIT_132(void)

{
  if ((DAT_00d1eb78 & 1) == 0) {
    DAT_00d1eb78 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb70 = DAT_00d1e930;
  }
  return;
}

