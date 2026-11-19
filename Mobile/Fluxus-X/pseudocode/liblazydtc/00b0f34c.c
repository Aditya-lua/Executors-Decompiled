/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f34c
 */

void X509_STORE_CTX_set_error_depth(long param_1,undefined4 param_2)

{
  *(undefined4 *)(param_1 + 0xac) = param_2;
  return;
}

