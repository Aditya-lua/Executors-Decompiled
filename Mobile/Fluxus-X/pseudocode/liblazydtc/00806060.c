/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806060
 */

void _INIT_40(void)

{
  if ((DAT_00d1b0b8 & 1) == 0) {
    DAT_00d1b0b8 = 1;
    DAT_00d1b0b0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b0b0;
  }
  return;
}

