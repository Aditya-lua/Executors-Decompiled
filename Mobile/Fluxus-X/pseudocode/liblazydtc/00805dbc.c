/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805dbc
 */

void _INIT_27(void)

{
  if ((DAT_00d1afe8 & 1) == 0) {
    DAT_00d1afe8 = 1;
    DAT_00d1afe0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1afe0;
  }
  return;
}

