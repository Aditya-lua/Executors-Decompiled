/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b65150
 */

undefined8 ossl_cipher_var_keylen_set_ctx_params(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long local_28;
  
  if (param_2 != 0) {
    uVar2 = ossl_cipher_generic_set_ctx_params();
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"keylen");
    if (lVar3 != 0) {
      iVar1 = OSSL_PARAM_get_size_t(lVar3,&local_28);
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x80,
                      "ossl_cipher_var_keylen_set_ctx_params");
        ERR_set_error(0x39,0x67,0);
        return 0;
      }
      if (*(long *)(param_1 + 0x48) != local_28) {
        *(long *)(param_1 + 0x48) = local_28;
        *(byte *)(param_1 + 0x6c) = *(byte *)(param_1 + 0x6c) & 0xf7;
      }
    }
  }
  return 1;
}

