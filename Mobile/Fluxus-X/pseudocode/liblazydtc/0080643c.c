/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080643c
 */

void _INIT_59(void)

{
  if ((DAT_00d1b1e8 & 1) == 0) {
    DAT_00d1b1e8 = 1;
    DAT_00d1b1e0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b1e0;
  }
  return;
}

