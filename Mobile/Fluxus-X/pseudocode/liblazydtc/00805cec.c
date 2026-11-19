/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805cec
 */

void _INIT_23(void)

{
  if ((DAT_00d1afa8 & 1) == 0) {
    DAT_00d1afa8 = 1;
    DAT_00d1afa0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1afa0;
  }
  return;
}

