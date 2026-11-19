/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851d40
 */

void _INIT_134(void)

{
  if ((DAT_00d1eb98 & 1) == 0) {
    DAT_00d1eb98 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb90 = DAT_00d1e930;
  }
  return;
}

