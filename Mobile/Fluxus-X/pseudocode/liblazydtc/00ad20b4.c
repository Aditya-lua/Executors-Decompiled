/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad20b4
 */

undefined4 RSA_get_version(long param_1)

{
  return *(undefined4 *)(param_1 + 0x10);
}

