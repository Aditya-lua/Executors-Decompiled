/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805d20
 */

void _INIT_24(void)

{
  if ((DAT_00d1afb8 & 1) == 0) {
    DAT_00d1afb8 = 1;
    DAT_00d1afb0 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1afb0;
  }
  return;
}

