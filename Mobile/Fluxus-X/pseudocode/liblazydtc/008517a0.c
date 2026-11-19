/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008517a0
 */

void _INIT_104(void)

{
  if ((DAT_00d1e9b8 & 1) == 0) {
    DAT_00d1e9b8 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e9b0 = DAT_00d1e930;
  }
  return;
}

