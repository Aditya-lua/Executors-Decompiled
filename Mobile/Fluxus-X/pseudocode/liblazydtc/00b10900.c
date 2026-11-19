/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10900
 */

undefined4 X509_STORE_CTX_get_num_untrusted(long param_1)

{
  return *(undefined4 *)(param_1 + 0x94);
}

