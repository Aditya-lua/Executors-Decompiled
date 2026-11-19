/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83374
 */

uint ossl_tolower(uint param_1)

{
  uint uVar1;
  
  uVar1 = param_1 ^ 0x20;
  if (0x19 < param_1 - 0x41) {
    uVar1 = param_1;
  }
  return uVar1;
}

