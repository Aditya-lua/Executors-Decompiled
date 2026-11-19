/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a57750
 */

void EVP_MD_CTX_free(EVP_MD_CTX *param_1)

{
  int iVar1;
  
  if (param_1 == (EVP_MD_CTX *)0x0) {
    return;
  }
  iVar1 = EVP_MD_CTX_test_flags(param_1,0x400);
  if (iVar1 == 0) {
    EVP_PKEY_CTX_free((EVP_PKEY_CTX *)param_1->update);
    param_1->update = (_func_1088 *)0x0;
  }
  evp_md_ctx_clear_digest(param_1,0,0);
  OPENSSL_cleanse(param_1,0x48);
  CRYPTO_free(param_1);
  return;
}

