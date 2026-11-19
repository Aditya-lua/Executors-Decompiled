/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69bc8
 */

undefined8 mbedtls_cipher_setup(long *param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  if (param_2 == 0) {
    uVar2 = 0xffff9f00;
  }
  else {
    memset(param_1,0,0x60);
    if (*(code **)((&mbedtls_cipher_base_lookup_table)[*(uint *)(param_2 + 8) >> 0x1a & 0x1f] + 0x50
                  ) != (code *)0x0) {
      lVar1 = (**(code **)((&mbedtls_cipher_base_lookup_table)
                           [*(uint *)(param_2 + 8) >> 0x1a & 0x1f] + 0x50))();
      param_1[10] = lVar1;
      if (lVar1 == 0) {
        return 0xffff9e80;
      }
    }
    uVar2 = 0;
    *param_1 = param_2;
  }
  return uVar2;
}

