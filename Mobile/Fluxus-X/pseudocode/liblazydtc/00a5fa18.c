/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa18
 */

undefined4 EVP_MD_meth_get_app_datasize(long param_1)

{
  return *(undefined4 *)(param_1 + 0x4c);
}

