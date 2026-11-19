/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a865c8
 */

undefined8 EVP_CIPHER_meth_set_impl_ctx_size(long param_1,undefined4 param_2)

{
  if (*(int *)(param_1 + 0x38) == 0) {
    *(undefined4 *)(param_1 + 0x38) = param_2;
    return 1;
  }
  return 0;
}

