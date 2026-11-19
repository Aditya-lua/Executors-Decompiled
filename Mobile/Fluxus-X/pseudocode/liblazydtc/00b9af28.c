/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9af28
 */

undefined4 mbedtls_ecdh_get_grp_id(long param_1)

{
  return *(undefined4 *)(param_1 + 4);
}

