/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e41e4
 */

undefined8 tls13_save_handshake_digest_for_pha(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  EVP_MD_CTX *out;
  
  if (*(long *)(param_1 + 0xbc8) == 0) {
    uVar2 = ssl3_digest_cached_records(param_1,1);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    *(EVP_MD_CTX **)(param_1 + 0xbc8) = out;
    if (out == (EVP_MD_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x94e,"tls13_save_handshake_digest_for_pha");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0;
    }
    iVar1 = EVP_MD_CTX_copy_ex(out,*(EVP_MD_CTX **)(param_1 + 400));
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x953,"tls13_save_handshake_digest_for_pha");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      EVP_MD_CTX_free(*(undefined8 *)(param_1 + 0xbc8));
      *(undefined8 *)(param_1 + 0xbc8) = 0;
      return 0;
    }
  }
  return 1;
}

