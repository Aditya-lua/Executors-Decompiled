/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9a874
 */

bool CRYPTO_secure_allocated(ulong param_1)

{
  return DAT_00d220f0 == '\x01' &&
         (DAT_00d22118 <= param_1 && param_1 < DAT_00d22118 + DAT_00d22120);
}

