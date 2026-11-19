/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008066e0
 */

void _INIT_72(void)

{
  if ((DAT_00d1b2b8 & 1) == 0) {
    DAT_00d1b2b8 = 1;
    DAT_00d1b2b0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b2b0;
  }
  return;
}

