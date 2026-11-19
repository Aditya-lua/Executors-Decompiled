/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008062d0
 */

void _INIT_52(void)

{
  if ((DAT_00d1b178 & 1) == 0) {
    DAT_00d1b178 = 1;
    DAT_00d1b170 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b170;
  }
  return;
}

