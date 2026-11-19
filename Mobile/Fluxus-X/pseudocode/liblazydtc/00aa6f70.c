/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6f70
 */

undefined8 MDC2_Init(undefined4 *param_1)

{
  *param_1 = 0;
  param_1[7] = 1;
  *(undefined8 *)(param_1 + 5) = 0x2525252525252525;
  *(undefined8 *)(param_1 + 3) = 0x5252525252525252;
  return 1;
}

