/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00805cb8
 */

void _INIT_22(void)

{
  if ((DAT_00d1af98 & 1) == 0) {
    DAT_00d1af98 = 1;
    DAT_00d1af90 = DAT_00d1e920 + 1;
    DAT_00d1e920 = DAT_00d1af90;
  }
  return;
}

