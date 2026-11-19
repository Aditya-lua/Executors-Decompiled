/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c84
 */

void EVP_PKEY_meth_set_digest_custom(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xf8) = param_2;
  return;
}

