/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805ff8
 */

void _INIT_38(void)

{
  if ((DAT_00d1b098 & 1) == 0) {
    DAT_00d1b098 = 1;
    DAT_00d1b090 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b090;
  }
  return;
}

