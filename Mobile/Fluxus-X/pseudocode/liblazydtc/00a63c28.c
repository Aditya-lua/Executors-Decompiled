/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63c28
 */

int EVP_PKEY_derive(EVP_PKEY_CTX *ctx,uchar *key,size_t *keylen)

{
  int iVar1;
  undefined8 uVar2;
  size_t sVar3;
  code *UNRECOVERED_JUMPTABLE;
  long lVar4;
  
  if ((ctx == (EVP_PKEY_CTX *)0x0) || (keylen == (size_t *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/exchange.c",0x1fe,"EVP_PKEY_derive");
    uVar2 = 0xc0102;
  }
  else {
    if (*(int *)ctx == 0x800) {
      if (*(long *)(ctx + 0x30) != 0) {
        if (key == (uchar *)0x0) {
          sVar3 = 0;
        }
        else {
          sVar3 = *keylen;
        }
                    /* WARNING: Could not recover jumptable at 0x00a63d2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (**(code **)(*(long *)(ctx + 0x28) + 0x48))(*(long *)(ctx + 0x30),key,keylen,sVar3);
        return iVar1;
      }
      lVar4 = *(long *)(ctx + 0x78);
      if ((lVar4 == 0) ||
         (UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0xb8), UNRECOVERED_JUMPTABLE == (code *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/evp/exchange.c",0x210,"EVP_PKEY_derive");
        ERR_set_error(6,0x96,0);
        return -2;
      }
      if ((*(byte *)(lVar4 + 4) >> 1 & 1) == 0) {
LAB_00a63cf8:
                    /* WARNING: Could not recover jumptable at 0x00a63d10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*UNRECOVERED_JUMPTABLE)(ctx,key,keylen);
        return iVar1;
      }
      iVar1 = EVP_PKEY_get_size(*(undefined8 *)(ctx + 0x88));
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/exchange.c",0x214,"EVP_PKEY_derive");
        uVar2 = 0xa3;
      }
      else {
        if (key == (uchar *)0x0) {
          *keylen = (long)iVar1;
          return 1;
        }
        if ((ulong)(long)iVar1 <= *keylen) {
          UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(ctx + 0x78) + 0xb8);
          goto LAB_00a63cf8;
        }
        ERR_new();
        ERR_set_debug("crypto/evp/exchange.c",0x214,"EVP_PKEY_derive");
        uVar2 = 0x9b;
      }
      ERR_set_error(6,uVar2,0);
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/exchange.c",0x203,"EVP_PKEY_derive");
    uVar2 = 0x97;
  }
  ERR_set_error(6,uVar2,0);
  return -1;
}

