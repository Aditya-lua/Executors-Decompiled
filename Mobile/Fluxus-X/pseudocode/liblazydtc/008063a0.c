/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008063a0
 */

void _INIT_56(void)

{
  if ((DAT_00d1b1b8 & 1) == 0) {
    DAT_00d1b1b8 = 1;
    DAT_00d1b1b0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b1b0;
  }
  return;
}

