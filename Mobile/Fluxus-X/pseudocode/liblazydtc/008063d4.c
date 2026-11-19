/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008063d4
 */

void _INIT_57(void)

{
  if ((DAT_00d1b1c8 & 1) == 0) {
    DAT_00d1b1c8 = 1;
    DAT_00d1b1c0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b1c0;
  }
  return;
}

