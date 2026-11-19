/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4fda8
 */

long OSSL_DECODER_CTX_new_for_pkey
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined4 param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  long lVar2;
  
  lVar2 = OSSL_DECODER_CTX_new();
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_pkey.c",0x1b7,"OSSL_DECODER_CTX_new_for_pkey");
    ERR_set_error(0x3c,0xc0100,0);
  }
  else {
    iVar1 = OSSL_DECODER_CTX_set_input_type(lVar2,param_2);
    if ((((iVar1 == 0) || (iVar1 = OSSL_DECODER_CTX_set_input_structure(lVar2,param_3), iVar1 == 0))
        || (iVar1 = OSSL_DECODER_CTX_set_selection(lVar2,param_5), iVar1 == 0)) ||
       ((iVar1 = ossl_decoder_ctx_setup_for_pkey(lVar2,param_1,param_4,param_6,param_7), iVar1 == 0
        || (iVar1 = OSSL_DECODER_CTX_add_extra(lVar2,param_6,param_7), iVar1 == 0)))) {
      OSSL_DECODER_CTX_free(lVar2);
      lVar2 = 0;
    }
  }
  return lVar2;
}

