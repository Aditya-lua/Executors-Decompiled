/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f6c4
 */

undefined4 EVP_MD_get_pkey_type(long param_1)

{
  return *(undefined4 *)(param_1 + 4);
}

