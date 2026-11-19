/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1443c
 */

undefined4 X509_VERIFY_PARAM_get_inh_flags(long param_1)

{
  return *(undefined4 *)(param_1 + 0x10);
}

