/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806094
 */

void _INIT_41(void)

{
  if ((DAT_00d1b0c8 & 1) == 0) {
    DAT_00d1b0c8 = 1;
    DAT_00d1b0c0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b0c0;
  }
  return;
}

