/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805df0
 */

void _INIT_28(void)

{
  if ((DAT_00d1aff8 & 1) == 0) {
    DAT_00d1aff8 = 1;
    DAT_00d1aff0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1aff0;
  }
  return;
}

