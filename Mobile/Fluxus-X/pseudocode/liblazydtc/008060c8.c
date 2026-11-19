/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008060c8
 */

void _INIT_42(void)

{
  if ((DAT_00d1b0d8 & 1) == 0) {
    DAT_00d1b0d8 = 1;
    DAT_00d1b0d0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b0d0;
  }
  return;
}

