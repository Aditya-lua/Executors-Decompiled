/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008064a4
 */

void _INIT_61(void)

{
  if ((DAT_00d1b208 & 1) == 0) {
    DAT_00d1b208 = 1;
    DAT_00d1b200 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b200;
  }
  return;
}

