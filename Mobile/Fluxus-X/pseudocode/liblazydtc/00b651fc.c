/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b651fc
 */

undefined8 ossl_cipher_generic_set_ctx_params(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined4 local_2c;
  int local_28;
  int local_24;
  
  if (param_2 == 0) {
    return 1;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"padding");
  if (lVar2 != 0) {
    iVar1 = OSSL_PARAM_get_uint(lVar2,&local_24);
    if (iVar1 == 0) {
      ERR_new();
      uVar3 = 0x27b;
      goto LAB_00b65384;
    }
    *(byte *)(param_1 + 0x6c) = *(byte *)(param_1 + 0x6c) & 0xfe | local_24 != 0;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"use-bits");
  if (lVar2 != 0) {
    iVar1 = OSSL_PARAM_get_uint(lVar2,&local_28);
    if (iVar1 == 0) {
      ERR_new();
      uVar3 = 0x285;
      goto LAB_00b65384;
    }
    *(byte *)(param_1 + 0x6c) = *(byte *)(param_1 + 0x6c) & 0x7f | (local_28 != 0) << 7;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"tls-version");
  if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_get_uint(lVar2,param_1 + 0x70), iVar1 != 0)) {
    lVar2 = OSSL_PARAM_locate_const(param_2,"tls-mac-size");
    if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_get_size_t(lVar2,param_1 + 0x88), iVar1 != 0)) {
      lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002aa191);
      if (lVar2 != 0) {
        iVar1 = OSSL_PARAM_get_uint(lVar2,&local_2c);
        if (iVar1 == 0) {
          ERR_new();
          uVar3 = 0x29d;
          goto LAB_00b65384;
        }
        *(undefined4 *)(param_1 + 0xa0) = local_2c;
      }
      return 1;
    }
    ERR_new();
    uVar3 = 0x294;
  }
  else {
    ERR_new();
    uVar3 = 0x28d;
  }
LAB_00b65384:
  ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar3,
                "ossl_cipher_generic_set_ctx_params");
  ERR_set_error(0x39,0x67,0);
  return 0;
}

