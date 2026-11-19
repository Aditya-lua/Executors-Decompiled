/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba06d8
 */

undefined4 mbedtls_ecjpake_check(int *param_1)

{
  undefined4 uVar1;
  
  if ((*param_1 == 0) || (param_1[2] == 0)) {
    return 0xffffb080;
  }
  uVar1 = 0xffffb080;
  if (*(long *)(param_1 + 0x78) != 0) {
    uVar1 = 0;
  }
  return uVar1;
}

