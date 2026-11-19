/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b683c4
 */

undefined8
ossl_cipher_hw_generic_cfb8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 local_14;
  
  local_14 = *(undefined4 *)(param_1 + 0xa0);
  CRYPTO_cfb128_8_encrypt
            (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,&local_14,
             *(byte *)(param_1 + 0x6c) >> 1 & 1,*(undefined8 *)(param_1 + 0x30));
  *(undefined4 *)(param_1 + 0xa0) = local_14;
  return 1;
}

