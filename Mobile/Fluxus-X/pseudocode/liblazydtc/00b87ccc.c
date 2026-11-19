/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87ccc
 */

ulong psa_hash_abort(uint *param_1)

{
  uint uVar1;
  ulong uVar2;
  
  uVar1 = *param_1;
  uVar2 = (ulong)uVar1;
  if (uVar1 != 0) {
    if (uVar1 == 1) {
      uVar2 = mbedtls_psa_hash_abort(param_1 + 2);
    }
    else {
      uVar2 = 0xffffff77;
    }
    *param_1 = 0;
  }
  return uVar2;
}

