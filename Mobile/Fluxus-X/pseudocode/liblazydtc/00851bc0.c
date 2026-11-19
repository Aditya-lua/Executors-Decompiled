/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851bc0
 */

void _INIT_126(void)

{
  if ((DAT_00d1eb18 & 1) == 0) {
    DAT_00d1eb18 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1eb10 = DAT_00d1e930;
  }
  return;
}

