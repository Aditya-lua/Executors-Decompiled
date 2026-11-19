/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77954
 */

undefined8 EVP_PKEY_CTX_get0_libctx(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

