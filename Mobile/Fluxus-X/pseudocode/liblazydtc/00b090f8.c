/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b090f8
 */

ulong X509_NAME_hash_old(X509_NAME *x)

{
  int iVar1;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  ulong uVar2;
  uint local_40 [4];
  
  type = (EVP_MD *)EVP_MD_fetch(0,&DAT_002d53fd,"-fips");
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  uVar2 = 0;
  if ((type != (EVP_MD *)0x0) && (ctx != (EVP_MD_CTX *)0x0)) {
    iVar1 = i2d_X509_NAME(x,(uchar **)0x0);
    if ((iVar1 < 0) ||
       (((iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar1 == 0 ||
         (iVar1 = EVP_DigestUpdate(ctx,x->bytes->data,x->bytes->length), iVar1 == 0)) ||
        (iVar1 = EVP_DigestFinal_ex(ctx,(uchar *)local_40,(uint *)0x0), iVar1 == 0)))) {
      uVar2 = 0;
    }
    else {
      uVar2 = (ulong)local_40[0];
    }
  }
  EVP_MD_CTX_free(ctx);
  EVP_MD_free(type);
  return uVar2;
}

