/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14654
 */

undefined4 X509_VERIFY_PARAM_get_hostflags(long param_1)

{
  return *(undefined4 *)(param_1 + 0x40);
}

