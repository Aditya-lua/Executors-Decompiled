/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851c50
 */

void _INIT_129(void)

{
  if ((DAT_00d1eb48 & 1) == 0) {
    DAT_00d1eb48 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb40 = DAT_00d1e930;
  }
  return;
}

