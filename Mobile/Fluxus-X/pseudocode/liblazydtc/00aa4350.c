/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4350
 */

bool ossl_provider_set_fallback(byte *param_1)

{
  if (param_1 != (byte *)0x0) {
    *param_1 = *param_1 | 4;
  }
  return param_1 != (byte *)0x0;
}

