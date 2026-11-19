/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5268
 */

int PKCS1_MGF1(uchar *mask,long len,uchar *seed,long seedlen,EVP_MD *dgst)

{
  long lVar1;
  int iVar2;
  int iVar3;
  EVP_MD_CTX *ctx;
  long lVar4;
  long lVar5;
  uchar auStack_a4 [64];
  undefined1 local_64;
  undefined1 local_63;
  undefined1 local_62;
  undefined1 local_61;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if ((ctx == (EVP_MD_CTX *)0x0) || (iVar2 = EVP_MD_get_size(dgst), iVar2 < 0)) {
LAB_00ad5380:
    iVar2 = -1;
  }
  else {
    if (0 < len) {
      lVar4 = 0;
      lVar5 = 0;
      do {
        local_64 = (undefined1)((ulong)lVar4 >> 0x18);
        local_63 = (undefined1)((ulong)lVar4 >> 0x10);
        local_62 = (undefined1)((ulong)lVar4 >> 8);
        local_61 = (undefined1)lVar4;
        iVar3 = EVP_DigestInit_ex(ctx,dgst,(ENGINE *)0x0);
        if (((iVar3 == 0) || (iVar3 = EVP_DigestUpdate(ctx,seed,seedlen), iVar3 == 0)) ||
           (iVar3 = EVP_DigestUpdate(ctx,&local_64,4), iVar3 == 0)) goto LAB_00ad5380;
        lVar1 = lVar5 + iVar2;
        if (len < lVar1) {
          iVar2 = EVP_DigestFinal_ex(ctx,auStack_a4,(uint *)0x0);
          if (iVar2 == 0) goto LAB_00ad5380;
          memcpy(mask + lVar5,auStack_a4,len - lVar5);
          break;
        }
        iVar3 = EVP_DigestFinal_ex(ctx,mask + lVar5,(uint *)0x0);
        if (iVar3 == 0) goto LAB_00ad5380;
        lVar4 = lVar4 + 1;
        lVar5 = lVar1;
      } while (lVar1 < len);
    }
    iVar2 = 0;
  }
  OPENSSL_cleanse(auStack_a4,0x40);
  EVP_MD_CTX_free(ctx);
  return iVar2;
}

