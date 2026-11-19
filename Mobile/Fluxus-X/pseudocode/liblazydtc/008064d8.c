/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008064d8
 */

void _INIT_62(void)

{
  if ((DAT_00d1b218 & 1) == 0) {
    DAT_00d1b218 = 1;
    DAT_00d1b210 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b210;
  }
  return;
}

