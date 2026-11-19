/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab754
 */

undefined8
ssl3_generate_master_secret(long param_1,uchar *param_2,void *param_3,size_t param_4,long *param_5)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  size_t cnt;
  undefined8 uVar2;
  ulong uVar3;
  char *__s;
  long lVar4;
  uint local_a4;
  uchar auStack_a0 [64];
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/s3_enc.c",0x1ee,"ssl3_generate_master_secret");
    ossl_statem_fatal(param_1,0x50,0xc0100,0);
LAB_009ab974:
    uVar2 = 0;
  }
  else {
    uVar3 = 0;
    lVar4 = 0;
    do {
      iVar1 = EVP_DigestInit_ex(ctx,*(EVP_MD **)(*(long *)(param_1 + 0x9a8) + 0x108),(ENGINE *)0x0);
      if (iVar1 < 1) {
LAB_009ab8f0:
        ERR_new();
        ERR_set_debug("ssl/s3_enc.c",0x1ff,"ssl3_generate_master_secret");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
        EVP_MD_CTX_free(ctx);
        OPENSSL_cleanse(auStack_a0,0x40);
        goto LAB_009ab974;
      }
      __s = (&PTR_DAT_00c53c68)[uVar3];
      cnt = strlen(__s);
      iVar1 = EVP_DigestUpdate(ctx,__s,cnt);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestUpdate(ctx,param_3,param_4);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestUpdate(ctx,(void *)(param_1 + 0x160),0x20);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestUpdate(ctx,(void *)(param_1 + 0x140),0x20);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestFinal_ex(ctx,auStack_a0,&local_a4);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestInit_ex(ctx,*(EVP_MD **)(*(long *)(param_1 + 0x9a8) + 0x100),(ENGINE *)0x0);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestUpdate(ctx,param_3,param_4);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestUpdate(ctx,auStack_a0,(ulong)local_a4);
      if (iVar1 < 1) goto LAB_009ab8f0;
      iVar1 = EVP_DigestFinal_ex(ctx,param_2,&local_a4);
      if (iVar1 < 1) goto LAB_009ab8f0;
      uVar3 = uVar3 + 1;
      param_2 = param_2 + local_a4;
      lVar4 = lVar4 + (ulong)local_a4;
    } while (uVar3 < 3);
    EVP_MD_CTX_free(ctx);
    OPENSSL_cleanse(auStack_a0,0x40);
    uVar2 = 1;
    *param_5 = lVar4;
  }
  return uVar2;
}

