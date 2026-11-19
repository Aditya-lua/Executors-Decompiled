/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008067b0
 */

void _INIT_76(void)

{
  if ((DAT_00d1b2f8 & 1) == 0) {
    DAT_00d1b2f8 = 1;
    DAT_00d1b2f0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b2f0;
  }
  return;
}

