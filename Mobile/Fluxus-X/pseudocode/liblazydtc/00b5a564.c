/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5a564
 */

undefined4
FUN_00b5a564(long param_1,uchar *param_2,char param_3,void *param_4,size_t param_5,void *param_6,
            size_t param_7,void *param_8,size_t param_9)

{
  uchar *md;
  int iVar1;
  EVP_MD *pEVar2;
  long lVar3;
  ulong __n;
  EVP_MD_CTX *ctx;
  size_t cnt;
  char local_68;
  undefined1 local_67;
  undefined1 local_66;
  undefined1 local_65;
  undefined1 local_64;
  char local_63;
  
  lVar3 = *(long *)(param_1 + 0xf8);
  __n = *(ulong *)(param_1 + 0xe8);
  ctx = *(EVP_MD_CTX **)(lVar3 + 0x18);
  local_67 = (undefined1)(__n >> 0x15);
  local_66 = (undefined1)(__n >> 0xd);
  local_65 = (undefined1)(__n >> 5);
  local_68 = '\x01';
  local_64 = (undefined1)((int)__n << 3);
  if (param_3 == -1) {
    cnt = 5;
  }
  else {
    cnt = 6;
    local_63 = param_3;
  }
  pEVar2 = (EVP_MD *)ossl_prov_digest_md(lVar3);
  iVar1 = EVP_DigestInit_ex(ctx,pEVar2,(ENGINE *)0x0);
  if (iVar1 != 0) {
    md = (uchar *)(lVar3 + 0x106);
    do {
      iVar1 = EVP_DigestUpdate(ctx,&local_68,cnt);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = EVP_DigestUpdate(ctx,param_4,param_5);
      if (iVar1 == 0) {
        return 0;
      }
      if ((param_6 != (void *)0x0) && (iVar1 = EVP_DigestUpdate(ctx,param_6,param_7), iVar1 == 0)) {
        return 0;
      }
      if ((param_8 != (void *)0x0) && (iVar1 = EVP_DigestUpdate(ctx,param_8,param_9), iVar1 == 0)) {
        return 0;
      }
      if (__n < *(ulong *)(lVar3 + 0x20)) {
        iVar1 = EVP_DigestFinal(ctx,md,(uint *)0x0);
        if (iVar1 == 0) {
          return 0;
        }
        memcpy(param_2,md,__n);
        OPENSSL_cleanse(md,*(size_t *)(lVar3 + 0x20));
        return 1;
      }
      iVar1 = EVP_DigestFinal(ctx,param_2,(uint *)0x0);
      if (iVar1 == 0) {
        return 0;
      }
      __n = __n - *(long *)(lVar3 + 0x20);
      if (__n == 0) {
        return 1;
      }
      param_2 = param_2 + *(long *)(lVar3 + 0x20);
      local_68 = local_68 + '\x01';
      pEVar2 = (EVP_MD *)ossl_prov_digest_md(lVar3);
      iVar1 = EVP_DigestInit_ex(ctx,pEVar2,(ENGINE *)0x0);
    } while (iVar1 != 0);
  }
  return 0;
}

