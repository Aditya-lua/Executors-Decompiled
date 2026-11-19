/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a88144
 */

undefined8 FUN_00a88144(long param_1,long param_2,long param_3,ulong param_4)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  
  lVar3 = EVP_CIPHER_CTX_get_cipher_data();
  if ((((*(long *)(lVar3 + 0x1f0) != 0) && (0xf < param_4)) && (param_3 != 0)) && (param_2 != 0)) {
    if (*(long *)(lVar3 + 0x1f8) == 0) {
      return 0;
    }
    if (param_4 < 0x1000001) {
      if (*(code **)(lVar3 + 0x210) == (code *)0x0) {
        uVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
        iVar2 = CRYPTO_xts128_encrypt(lVar3 + 0x1f0,param_1 + 0x28,param_3,param_2,param_4,uVar1);
        if (iVar2 != 0) {
          return 0;
        }
      }
      else {
        (**(code **)(lVar3 + 0x210))
                  (param_3,param_2,param_4,*(long *)(lVar3 + 0x1f0),*(long *)(lVar3 + 0x1f8),
                   param_1 + 0x28);
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/e_aes.c",0xcb3,"aes_xts_cipher");
    ERR_set_error(6,0xbf,0);
  }
  return 0;
}

