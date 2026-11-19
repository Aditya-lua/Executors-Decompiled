/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad328c
 */

undefined4 ossl_rsa_multip_cap(int param_1)

{
  undefined4 uVar1;
  
  if (param_1 < 0x400) {
    return 2;
  }
  if (param_1 < 0x1000) {
    return 3;
  }
  uVar1 = 4;
  if (0x1fff < param_1) {
    uVar1 = 5;
  }
  return uVar1;
}

