/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6821c
 */

undefined8
ossl_cipher_hw_generic_cbc(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  if (*(code **)(param_1 + 0x38) == (code *)0x0) {
    if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
      CRYPTO_cbc128_decrypt();
    }
    else {
      CRYPTO_cbc128_encrypt
                (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,
                 *(undefined8 *)(param_1 + 0x30));
    }
  }
  else {
    (**(code **)(param_1 + 0x38))
              (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),param_1 + 0x20,
               *(byte *)(param_1 + 0x6c) >> 1 & 1);
  }
  return 1;
}

