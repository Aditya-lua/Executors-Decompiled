/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805f28
 */

void _INIT_34(void)

{
  if ((DAT_00d1b058 & 1) == 0) {
    DAT_00d1b058 = 1;
    DAT_00d1b050 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b050;
  }
  return;
}

