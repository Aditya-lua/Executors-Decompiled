/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ecc
 */

undefined8 ssl_handshake_hash(long param_1,uchar *param_2,ulong param_3,ulong *param_4)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  EVP_MD_CTX *out;
  EVP_MD_CTX *in;
  
  in = *(EVP_MD_CTX **)(param_1 + 400);
  EVP_MD_CTX_get0_md(in);
  iVar1 = EVP_MD_get_size();
  if ((iVar1 < 0) || (param_3 < (ulong)(long)iVar1)) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x12e3,"ssl_handshake_hash");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    out = (EVP_MD_CTX *)0x0;
  }
  else {
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (out == (EVP_MD_CTX *)0x0) {
      ERR_new();
      uVar3 = 0x12e9;
    }
    else {
      iVar2 = EVP_MD_CTX_copy_ex(out,in);
      if ((iVar2 != 0) && (iVar2 = EVP_DigestFinal_ex(out,param_2,(uint *)0x0), 0 < iVar2)) {
        uVar3 = 1;
        *param_4 = (long)iVar1;
        goto LAB_009b7fe0;
      }
      ERR_new();
      uVar3 = 0x12ef;
    }
    ERR_set_debug("ssl/ssl_lib.c",uVar3,"ssl_handshake_hash");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  uVar3 = 0;
LAB_009b7fe0:
  EVP_MD_CTX_free(out);
  return uVar3;
}

