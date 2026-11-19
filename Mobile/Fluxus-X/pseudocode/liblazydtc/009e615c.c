/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e615c
 */

undefined8 tls13_restore_handshake_digest_for_pha(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(EVP_MD_CTX **)(param_1 + 0xbc8) == (EVP_MD_CTX *)0x0) {
    ERR_new();
    uVar2 = 0x963;
  }
  else {
    iVar1 = EVP_MD_CTX_copy_ex(*(EVP_MD_CTX **)(param_1 + 400),*(EVP_MD_CTX **)(param_1 + 0xbc8));
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x968;
  }
  ERR_set_debug("ssl/statem/statem_lib.c",uVar2,"tls13_restore_handshake_digest_for_pha");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

