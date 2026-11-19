/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851620
 */

void _INIT_96(void)

{
  if ((DAT_00d1e938 & 1) == 0) {
    DAT_00d1e938 = 1;
    DAT_00d1e930 = DAT_00d1e930 + 1;
    DAT_00d1e934 = DAT_00d1e930;
  }
  return;
}

