/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08e78
 */

ulong X509_issuer_and_serial_hash(X509 *a)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  char *__s;
  EVP_MD *type;
  size_t cnt;
  ulong uVar2;
  uint local_40 [4];
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    uVar2 = 0;
    __s = (char *)0x0;
    type = (EVP_MD *)0x0;
  }
  else {
    __s = X509_NAME_oneline(*(X509_NAME **)&(a->ex_data).dummy,(char *)0x0,0);
    if (__s == (char *)0x0) {
      uVar2 = 0;
      type = (EVP_MD *)0x0;
    }
    else {
      type = (EVP_MD *)
             EVP_MD_fetch(*(undefined8 *)a[1].sha1_hash,&DAT_002d53fd,
                          *(undefined8 *)(a[1].sha1_hash + 8));
      if ((type != (EVP_MD *)0x0) && (iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar1 != 0)
         ) {
        cnt = strlen(__s);
        iVar1 = EVP_DigestUpdate(ctx,__s,cnt);
        if ((iVar1 != 0) &&
           ((iVar1 = EVP_DigestUpdate(ctx,a->signature,(long)*(int *)&a->sig_alg), iVar1 != 0 &&
            (iVar1 = EVP_DigestFinal_ex(ctx,(uchar *)local_40,(uint *)0x0), iVar1 != 0)))) {
          uVar2 = (ulong)local_40[0];
          goto LAB_00b08f64;
        }
      }
      uVar2 = 0;
    }
  }
LAB_00b08f64:
  CRYPTO_free(__s);
  EVP_MD_free(type);
  EVP_MD_CTX_free(ctx);
  return uVar2;
}

