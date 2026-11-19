/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805f5c
 */

void _INIT_35(void)

{
  if ((DAT_00d1b068 & 1) == 0) {
    DAT_00d1b068 = 1;
    DAT_00d1b060 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1b060;
  }
  return;
}

