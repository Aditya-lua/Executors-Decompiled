/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0110
 */

undefined4 ossl_get_extension_type(ulong param_1)

{
  if (param_1 < 0x1a) {
    return *(undefined4 *)(&DAT_00c581e8 + param_1 * 0x38);
  }
  return 0x10001;
}

