/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58408
 */

int EVP_MD_CTX_copy(EVP_MD_CTX *out,EVP_MD_CTX *in)

{
  int iVar1;
  
  if (out != (EVP_MD_CTX *)0x0) {
    iVar1 = EVP_MD_CTX_test_flags(out,0x400);
    if (iVar1 == 0) {
      EVP_PKEY_CTX_free((EVP_PKEY_CTX *)out->update);
      out->update = (_func_1088 *)0x0;
    }
    evp_md_ctx_clear_digest(out,0,0);
    OPENSSL_cleanse(out,0x48);
  }
  iVar1 = EVP_MD_CTX_copy_ex(out,in);
  return iVar1;
}

