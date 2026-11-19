/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d1f4
 */

undefined8 ossl_cipher_hw_tdes_ede3_initkey(long param_1,const_DES_cblock *param_2)

{
  *(undefined8 *)(param_1 + 0x240) = 0;
  DES_set_key_unchecked(param_2,(DES_key_schedule *)(param_1 + 0xc0));
  DES_set_key_unchecked(param_2 + 1,(DES_key_schedule *)(param_1 + 0x140));
  DES_set_key_unchecked(param_2 + 2,(DES_key_schedule *)(param_1 + 0x1c0));
  return 1;
}

