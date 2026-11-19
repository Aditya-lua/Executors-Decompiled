/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f774
 */

undefined4 EC_KEY_decoded_from_explicit_params(long param_1)

{
  if (param_1 == 0) {
    return 0xffffffff;
  }
  if (*(long *)(param_1 + 0x18) == 0) {
    return 0xffffffff;
  }
  return *(undefined4 *)(*(long *)(param_1 + 0x18) + 0x28);
}

