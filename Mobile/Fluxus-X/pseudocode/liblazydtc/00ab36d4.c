/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab36d4
 */

undefined4
ASN1_item_verify_ex(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined4 uVar1;
  long lVar2;
  EVP_PKEY_CTX *ctx;
  
  lVar2 = evp_md_ctx_new_ex(param_6,param_5,param_7,param_8);
  if (lVar2 == 0) {
    uVar1 = 0xffffffff;
  }
  else {
    uVar1 = ASN1_item_verify_ctx(param_1,param_2,param_3,param_4,lVar2);
    ctx = (EVP_PKEY_CTX *)EVP_MD_CTX_get_pkey_ctx(lVar2);
    EVP_PKEY_CTX_free(ctx);
    EVP_MD_CTX_free(lVar2);
  }
  return uVar1;
}

