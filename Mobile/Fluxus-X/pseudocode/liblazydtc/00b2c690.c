/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c690
 */

long ossl_tdes_newctx(undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                     undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  long lVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = CRYPTO_zalloc(0x248,"providers/implementations/ciphers/cipher_tdes_common.c",0x1f);
    if (lVar2 != 0) {
      ossl_cipher_generic_initkey(lVar2,param_3,param_4,param_5,param_2,param_6,param_7,param_1);
    }
  }
  return lVar2;
}

