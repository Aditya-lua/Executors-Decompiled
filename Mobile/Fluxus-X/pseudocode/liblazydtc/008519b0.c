/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008519b0
 */

void _INIT_115(void)

{
  if ((DAT_00d1ea68 & 1) == 0) {
    DAT_00d1ea68 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1ea60 = DAT_00d1e930;
  }
  return;
}

