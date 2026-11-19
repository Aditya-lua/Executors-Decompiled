/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83388
 */

uint ossl_toupper(uint param_1)

{
  uint uVar1;
  
  uVar1 = param_1 ^ 0x20;
  if (0x19 < param_1 - 0x61) {
    uVar1 = param_1;
  }
  return uVar1;
}

