/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c730
 */

void * ossl_tdes_dupctx(long param_1)

{
  int iVar1;
  void *pvVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    pvVar2 = (void *)0x0;
  }
  else {
    pvVar2 = CRYPTO_malloc(0x248,"providers/implementations/ciphers/cipher_tdes_common.c",0x2e);
    if (pvVar2 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/cipher_tdes_common.c",0x30,"ossl_tdes_dupctx"
                   );
      ERR_set_error(0x39,0xc0100,0);
    }
    else {
      (**(code **)(*(long *)(param_1 + 0xa8) + 0x10))(pvVar2,param_1);
    }
  }
  return pvVar2;
}

