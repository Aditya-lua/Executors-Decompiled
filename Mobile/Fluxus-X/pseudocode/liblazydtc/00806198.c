/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806198
 */

void _INIT_46(void)

{
  if ((DAT_00d1b118 & 1) == 0) {
    DAT_00d1b118 = 1;
    DAT_00d1b110 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b110;
  }
  return;
}

