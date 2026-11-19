/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd914
 */

uint FUN_008dd914(undefined8 *param_1)

{
  if (param_1[1] == 0) {
    return 0x3f - (int)LZCOUNT(*param_1);
  }
  return (uint)LZCOUNT(param_1[1]) ^ 0x7f;
}

