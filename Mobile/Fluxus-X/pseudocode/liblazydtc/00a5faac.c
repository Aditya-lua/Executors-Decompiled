/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5faac
 */

undefined8 EVP_MD_CTX_get_pkey_ctx(long param_1)

{
  return *(undefined8 *)(param_1 + 0x28);
}

