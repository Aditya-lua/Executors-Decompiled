/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa08
 */

undefined4 EVP_MD_meth_get_input_blocksize(long param_1)

{
  return *(undefined4 *)(param_1 + 0x48);
}

