/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c64
 */

void EVP_PKEY_meth_set_digestverify(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xd8) = param_2;
  return;
}

