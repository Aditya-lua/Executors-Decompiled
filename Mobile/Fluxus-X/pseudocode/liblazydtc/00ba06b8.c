/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba06b8
 */

undefined8 mbedtls_ecjpake_set_point_format(long param_1,uint param_2)

{
  if (param_2 < 2) {
    *(uint *)(param_1 + 0xcc) = param_2;
    return 0;
  }
  return 0xffffb080;
}

