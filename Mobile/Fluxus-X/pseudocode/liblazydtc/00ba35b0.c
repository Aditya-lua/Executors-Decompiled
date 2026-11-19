/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba35b0
 */

undefined4 psa_validate_key_persistence(char param_1)

{
  undefined4 uVar1;
  
  uVar1 = 0xffffff79;
  if (param_1 != -1) {
    uVar1 = 0;
  }
  return uVar1;
}

