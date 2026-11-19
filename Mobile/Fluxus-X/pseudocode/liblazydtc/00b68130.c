/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68130
 */

undefined8 ossl_gcm_cipher_final(long param_1,undefined8 param_2)

{
  int iVar1;
  
  if ((*(byte *)(param_1 + 0x54) & 1) == 0) {
    iVar1 = CRYPTO_gcm128_finish(param_1 + 0xf8,param_2,*(undefined8 *)(param_1 + 0x18));
    if (iVar1 != 0) {
      return 0;
    }
  }
  else {
    CRYPTO_gcm128_tag(param_1 + 0xf8,param_2,0x10);
    *(undefined8 *)(param_1 + 0x18) = 0x10;
  }
  return 1;
}

