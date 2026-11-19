/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008da350
 */

undefined8 LZ4_setStreamDecode(undefined8 *param_1,long param_2,int param_3)

{
  param_1[2] = 0;
  param_1[3] = (long)param_3;
  *param_1 = 0;
  param_1[1] = param_2 + param_3;
  return 1;
}

