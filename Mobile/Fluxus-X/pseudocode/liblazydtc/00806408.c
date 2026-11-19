/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806408
 */

void _INIT_58(void)

{
  if ((DAT_00d1b1d8 & 1) == 0) {
    DAT_00d1b1d8 = 1;
    DAT_00d1b1d0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b1d0;
  }
  return;
}

