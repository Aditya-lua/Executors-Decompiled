/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806130
 */

void _INIT_44(void)

{
  if ((DAT_00d1b0f8 & 1) == 0) {
    DAT_00d1b0f8 = 1;
    DAT_00d1b0f0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b0f0;
  }
  return;
}

