/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7c44
 */

int EVP_BytesToKey(EVP_CIPHER *type,EVP_MD *md,uchar *salt,uchar *data,int datal,int count,
                  uchar *key,uchar *iv)

{
  int iVar1;
  int iVar2;
  int iVar3;
  EVP_MD_CTX *ctx;
  uint uVar4;
  ulong uVar5;
  uchar *puVar6;
  int local_a8;
  uint local_a4;
  uchar local_a0 [64];
  
  local_a4 = 0;
  iVar1 = EVP_CIPHER_get_key_length();
  iVar2 = EVP_CIPHER_get_iv_length(type);
  if (0x40 < iVar1) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: nkey <= EVP_MAX_KEY_LENGTH","crypto/evp/evp_key.c",0x5a);
  }
  if (0x10 < iVar2) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: niv <= EVP_MAX_IV_LENGTH","crypto/evp/evp_key.c",0x5b);
  }
  if (data != (uchar *)0x0) {
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (ctx == (EVP_MD_CTX *)0x0) {
LAB_00ab7e34:
      iVar1 = 0;
    }
    else {
      local_a8 = 0;
      do {
        iVar3 = EVP_DigestInit_ex(ctx,md,(ENGINE *)0x0);
        if (((iVar3 == 0) ||
            ((((local_a8 != 0 &&
               (iVar3 = EVP_DigestUpdate(ctx,local_a0,(ulong)local_a4), iVar3 == 0)) ||
              (iVar3 = EVP_DigestUpdate(ctx,data,(long)datal), iVar3 == 0)) ||
             ((salt != (uchar *)0x0 && (iVar3 = EVP_DigestUpdate(ctx,salt,8), iVar3 == 0)))))) ||
           (iVar3 = EVP_DigestFinal_ex(ctx,local_a0,&local_a4), iVar3 == 0)) goto LAB_00ab7e34;
        if (1 < (uint)count) {
          uVar4 = 1;
          do {
            iVar3 = EVP_DigestInit_ex(ctx,md,(ENGINE *)0x0);
            if (((iVar3 == 0) ||
                (iVar3 = EVP_DigestUpdate(ctx,local_a0,(ulong)local_a4), iVar3 == 0)) ||
               (iVar3 = EVP_DigestFinal_ex(ctx,local_a0,&local_a4), iVar3 == 0)) goto LAB_00ab7e34;
            uVar4 = uVar4 + 1;
          } while (uVar4 < (uint)count);
        }
        if (iVar1 == 0) {
          uVar5 = 0;
        }
        else {
          uVar5 = 0;
          do {
            if (uVar5 == local_a4) {
              iVar1 = iVar1 - (int)uVar5;
              goto LAB_00ab7dd8;
            }
            puVar6 = key;
            if (key != (uchar *)0x0) {
              puVar6 = key + 1;
              *key = local_a0[uVar5];
            }
            uVar5 = uVar5 + 1;
            key = puVar6;
          } while (iVar1 != (int)uVar5);
          iVar1 = 0;
        }
LAB_00ab7dd8:
        local_a8 = local_a8 + 1;
        if (iVar2 != 0) {
          uVar4 = (uint)uVar5;
          puVar6 = iv;
          while (iv = puVar6, uVar4 != local_a4) {
            if (puVar6 != (uchar *)0x0) {
              iv = puVar6 + 1;
              *puVar6 = local_a0[uVar5 & 0xffffffff];
            }
            iVar2 = iVar2 + -1;
            if (iVar2 == 0) break;
            uVar4 = (int)uVar5 + 1;
            uVar5 = (ulong)uVar4;
            puVar6 = iv;
          }
        }
      } while (iVar2 != 0 || iVar1 != 0);
      iVar1 = EVP_CIPHER_get_key_length(type);
    }
    EVP_MD_CTX_free(ctx);
    OPENSSL_cleanse(local_a0,0x40);
  }
  return iVar1;
}

