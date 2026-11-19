/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2a034
 */

undefined8 FUN_00b2a034(undefined8 param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long local_18;
  
  if (param_2 == 0) {
    return 1;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"keylen");
  if (lVar2 == 0) {
LAB_00b2a074:
    lVar2 = OSSL_PARAM_locate_const(param_2,"ivlen");
    if (lVar2 == 0) {
      return 1;
    }
    iVar1 = OSSL_PARAM_get_size_t(lVar2,&local_18);
    if (iVar1 != 0) {
      if (local_18 == 0x10) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/cipher_chacha20.c",0x96,
                    "chacha20_set_ctx_params");
      uVar3 = 0x6d;
      goto LAB_00b2a138;
    }
    ERR_new();
    uVar3 = 0x92;
  }
  else {
    iVar1 = OSSL_PARAM_get_size_t(lVar2,&local_18);
    if (iVar1 != 0) {
      if (local_18 != 0x20) {
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/cipher_chacha20.c",0x8b,
                      "chacha20_set_ctx_params");
        uVar3 = 0x69;
        goto LAB_00b2a138;
      }
      goto LAB_00b2a074;
    }
    ERR_new();
    uVar3 = 0x87;
  }
  ERR_set_debug("providers/implementations/ciphers/cipher_chacha20.c",uVar3,
                "chacha20_set_ctx_params");
  uVar3 = 0x67;
LAB_00b2a138:
  ERR_set_error(0x39,uVar3,0);
  return 0;
}

