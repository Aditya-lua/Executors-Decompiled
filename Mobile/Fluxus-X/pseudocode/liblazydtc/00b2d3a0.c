/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d3a0
 */

undefined8 ossl_cipher_hw_tdes_ecb(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  
  if (7 < param_4) {
    uVar1 = 0;
    do {
      DES_ecb3_encrypt((const_DES_cblock *)(param_3 + uVar1),(DES_cblock *)(param_2 + uVar1),
                       (DES_key_schedule *)(param_1 + 0xc0),(DES_key_schedule *)(param_1 + 0x140),
                       (DES_key_schedule *)(param_1 + 0x1c0),*(byte *)(param_1 + 0x6c) >> 1 & 1);
      uVar1 = uVar1 + 8;
    } while (uVar1 <= param_4 - 8);
  }
  return 1;
}

