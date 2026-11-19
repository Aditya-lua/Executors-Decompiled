/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69c3c
 */

undefined8 mbedtls_cipher_setkey(long *param_1,undefined8 param_2,uint param_3,uint param_4)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  
  if (((1 < param_4) || (lVar3 = *param_1, lVar3 == 0)) ||
     (((*(uint *)(lVar3 + 8) >> 0x19 & 1) == 0 && ((*(uint *)(lVar3 + 8) >> 2 & 0x3c0) != param_3)))
     ) {
    return 0xffff9f00;
  }
  *(uint *)(param_1 + 1) = param_3;
  *(uint *)((long)param_1 + 0xc) = param_4;
  uVar1 = *(uint *)(lVar3 + 8);
  if ((param_4 == 1) || ((uVar1 >> 0xc & 0xf) - 3 < 3)) {
                    /* WARNING: Could not emulate address calculation at 0x00b69c98 */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x40))
                      (param_1[10]);
    return uVar2;
  }
                    /* WARNING: Could not emulate address calculation at 0x00b69cbc */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (**(code **)((&mbedtls_cipher_base_lookup_table)[uVar1 >> 0x1a & 0x1f] + 0x48))
                    (param_1[10]);
  return uVar2;
}

