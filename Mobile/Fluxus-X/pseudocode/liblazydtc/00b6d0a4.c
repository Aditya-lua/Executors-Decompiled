/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6d0a4
 */

undefined8 mbedtls_chachapoly_update_aad(long param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  
  if (*(int *)(param_1 + 0xe8) == 1) {
    *(long *)(param_1 + 0xd8) = *(long *)(param_1 + 0xd8) + param_3;
    uVar1 = mbedtls_poly1305_update(param_1 + 0x88);
    return uVar1;
  }
  return 0xffffffac;
}

