/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d67f0
 */

undefined8 SSL_extension_supported(uint param_1)

{
  if ((((param_1 < 0x34) && ((1L << ((ulong)param_1 & 0x3f) & 0xabe0800e57c23U) != 0)) ||
      (param_1 == 0x3374)) || (param_1 == 0xff01)) {
    return 1;
  }
  return 0;
}

