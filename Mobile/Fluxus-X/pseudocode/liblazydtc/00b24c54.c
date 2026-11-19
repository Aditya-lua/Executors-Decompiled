/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b24c54
 */

undefined8
FUN_00b24c54(long param_1,undefined8 param_2,ulong *param_3,ulong param_4,undefined8 param_5,
            ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    if (param_4 < param_6) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/cipher_aes_ocb.c",0x1fd,"aes_ocb_cipher");
      uVar2 = 0x6a;
    }
    else {
      if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
        iVar1 = CRYPTO_ocb128_decrypt();
      }
      else {
        iVar1 = CRYPTO_ocb128_encrypt(param_1 + 0x2b0,param_5,param_2,param_6);
      }
      if (iVar1 != 0) {
        *param_3 = param_6;
        return 1;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/cipher_aes_ocb.c",0x202,"aes_ocb_cipher");
      uVar2 = 0x66;
    }
    ERR_set_error(0x39,uVar2,0);
    uVar2 = 0;
  }
  return uVar2;
}

