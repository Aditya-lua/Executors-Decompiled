/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080602c
 */

void _INIT_39(void)

{
  if ((DAT_00d1b0a8 & 1) == 0) {
    DAT_00d1b0a8 = 1;
    DAT_00d1b0a0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b0a0;
  }
  return;
}

