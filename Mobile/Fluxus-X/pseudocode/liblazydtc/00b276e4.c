/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b276e4
 */

undefined8
FUN_00b276e4(long param_1,long param_2,ulong *param_3,undefined8 param_4,long param_5,ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if ((((*(long *)(param_1 + 0x2b0) != 0) && (*(long *)(param_1 + 0x2b8) != 0)) && (0xf < param_6))
     && ((param_5 != 0 && (param_2 != 0)))) {
    if ((*(byte *)(param_1 + 0x6c) >> 2 & 1) == 0) {
      return 0;
    }
    if (param_6 < 0x1000001) {
      if (*(code **)(param_1 + 0x2d0) == (code *)0x0) {
        iVar1 = CRYPTO_xts128_encrypt
                          (param_1 + 0x2b0,param_1 + 0x20,param_5,param_2,param_6,
                           *(byte *)(param_1 + 0x6c) >> 1 & 1);
        if (iVar1 != 0) {
          return 0;
        }
      }
      else {
        (**(code **)(param_1 + 0x2d0))
                  (param_5,param_2,param_6,*(long *)(param_1 + 0x2b0),*(long *)(param_1 + 0x2b8),
                   param_1 + 0x20);
      }
      *param_3 = param_6;
      return 1;
    }
    ERR_new(0);
    ERR_set_debug("providers/implementations/ciphers/cipher_aes_xts.c",0xb2,"aes_xts_cipher");
    ERR_set_error(0x39,0x94,0);
  }
  return 0;
}

