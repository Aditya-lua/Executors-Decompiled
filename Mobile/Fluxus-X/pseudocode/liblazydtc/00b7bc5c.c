/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7bc5c
 */

undefined4 mbedtls_psa_get_random(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = psa_generate_random(param_2,param_3);
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 0xffffffc4;
  }
  return uVar2;
}

