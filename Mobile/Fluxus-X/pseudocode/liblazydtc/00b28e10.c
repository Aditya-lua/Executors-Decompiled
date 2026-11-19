/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b28e10
 */

undefined8 FUN_00b28e10(long param_1,undefined8 param_2,int param_3)

{
  long lVar1;
  
  lVar1 = param_1 + 0x2c0;
  *(long *)(param_1 + 0x2b8) = lVar1;
  ossl_aria_set_encrypt_key(param_2,param_3 << 3,lVar1);
  CRYPTO_gcm128_init(param_1 + 0xf8,lVar1,ossl_aria_encrypt);
  *(undefined8 *)(param_1 + 0x2b0) = 0;
  *(byte *)(param_1 + 0x54) = *(byte *)(param_1 + 0x54) | 4;
  return 1;
}

