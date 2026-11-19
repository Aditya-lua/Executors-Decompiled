/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851c80
 */

void _INIT_130(void)

{
  if ((DAT_00d1eb58 & 1) == 0) {
    DAT_00d1eb58 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb50 = DAT_00d1e930;
  }
  return;
}

