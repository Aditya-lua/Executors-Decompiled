/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b65e78
 */

undefined8
ossl_cipher_generic_cipher
          (long param_1,undefined8 param_2,ulong *param_3,ulong param_4,undefined8 param_5,
          ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    if ((*(byte *)(param_1 + 0x6c) >> 3 & 1) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x22c,
                    "ossl_cipher_generic_cipher");
      uVar2 = 0x72;
    }
    else if (param_4 < param_6) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x231,
                    "ossl_cipher_generic_cipher");
      uVar2 = 0x6a;
    }
    else {
      iVar1 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,param_6);
      if (iVar1 != 0) {
        *param_3 = param_6;
        return 1;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x236,
                    "ossl_cipher_generic_cipher");
      uVar2 = 0x66;
    }
    ERR_set_error(0x39,uVar2,0);
    uVar2 = 0;
  }
  return uVar2;
}

