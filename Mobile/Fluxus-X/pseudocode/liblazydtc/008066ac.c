/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008066ac
 */

void _INIT_71(void)

{
  if ((DAT_00d1b2a8 & 1) == 0) {
    DAT_00d1b2a8 = 1;
    DAT_00d1b2a0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b2a0;
  }
  return;
}

