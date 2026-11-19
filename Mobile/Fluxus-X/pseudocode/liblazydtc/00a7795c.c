/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7795c
 */

undefined8 EVP_PKEY_CTX_get0_propq(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

