/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b65e0c
 */

undefined8 ossl_cipher_generic_stream_final(long param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  
  uVar1 = ossl_prov_is_running();
  if ((int)uVar1 != 0) {
    if ((*(byte *)(param_1 + 0x6c) >> 3 & 1) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x21a,
                    "ossl_cipher_generic_stream_final");
      ERR_set_error(0x39,0x72,0);
      uVar1 = 0;
    }
    else {
      uVar1 = 1;
      *param_3 = 0;
    }
  }
  return uVar1;
}

