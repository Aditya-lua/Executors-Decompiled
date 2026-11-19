/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab364
 */

undefined8 ssl3_digest_cached_records(long param_1,int param_2)

{
  int iVar1;
  undefined8 uVar2;
  size_t cnt;
  long lVar3;
  EVP_MD *type;
  void *local_28;
  
  if (*(long *)(param_1 + 400) == 0) {
    cnt = BIO_ctrl(*(BIO **)(param_1 + 0x188),3,0,&local_28);
    if ((long)cnt < 1) {
      ERR_new();
      ERR_set_debug("ssl/s3_enc.c",0x17c,"ssl3_digest_cached_records");
      uVar2 = 0x14c;
    }
    else {
      lVar3 = EVP_MD_CTX_new();
      *(long *)(param_1 + 400) = lVar3;
      if (lVar3 == 0) {
        ERR_new();
        ERR_set_debug("ssl/s3_enc.c",0x182,"ssl3_digest_cached_records");
        uVar2 = 0xc0100;
      }
      else {
        type = (EVP_MD *)ssl_handshake_md(param_1);
        if (type == (EVP_MD *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/s3_enc.c",0x189,"ssl3_digest_cached_records");
          uVar2 = 0x129;
        }
        else {
          iVar1 = EVP_DigestInit_ex(*(EVP_MD_CTX **)(param_1 + 400),type,(ENGINE *)0x0);
          if ((iVar1 != 0) &&
             (iVar1 = EVP_DigestUpdate(*(EVP_MD_CTX **)(param_1 + 400),local_28,cnt), iVar1 != 0))
          goto LAB_009ab384;
          ERR_new();
          ERR_set_debug("ssl/s3_enc.c",0x18e,"ssl3_digest_cached_records");
          uVar2 = 0xc0103;
        }
      }
    }
    ossl_statem_fatal(param_1,0x50,uVar2,0);
    uVar2 = 0;
  }
  else {
LAB_009ab384:
    if (param_2 == 0) {
      BIO_free(*(BIO **)(param_1 + 0x188));
      *(undefined8 *)(param_1 + 0x188) = 0;
    }
    uVar2 = 1;
  }
  return uVar2;
}

