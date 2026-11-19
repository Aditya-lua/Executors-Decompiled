/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae134c
 */

undefined8 sha512_256_init(undefined8 *param_1)

{
  param_1[1] = 0x9f555fa3c84c64c2;
  *param_1 = 0x22312194fc2bf72c;
  param_1[3] = 0x963877195940eabd;
  param_1[2] = 0x2393b86b6f53b151;
  param_1[0x1a] = 0x2000000000;
  param_1[5] = 0xbe5e1e2553863992;
  param_1[4] = 0x96283ee2a88effe3;
  param_1[7] = 0xeb72ddc81c52ca2;
  param_1[6] = 0x2b0199fc2c85b8aa;
  param_1[8] = 0;
  param_1[9] = 0;
  return 1;
}

