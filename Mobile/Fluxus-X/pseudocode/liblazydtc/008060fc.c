/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008060fc
 */

void _INIT_43(void)

{
  if ((DAT_00d1b0e8 & 1) == 0) {
    DAT_00d1b0e8 = 1;
    DAT_00d1b0e0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b0e0;
  }
  return;
}

