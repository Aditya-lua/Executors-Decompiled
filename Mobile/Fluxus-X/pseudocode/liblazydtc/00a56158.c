/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a56158
 */

int EVP_PKEY_decrypt(EVP_PKEY_CTX *ctx,uchar *out,size_t *outlen,uchar *in,size_t inlen)

{
  int iVar1;
  undefined8 uVar2;
  size_t sVar3;
  code *UNRECOVERED_JUMPTABLE;
  long lVar4;
  
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    ERR_new();
    uVar2 = 0x114;
  }
  else {
    if (*(int *)ctx != 0x400) {
      ERR_new();
      ERR_set_debug("crypto/evp/asymcipher.c",0x119,"EVP_PKEY_decrypt");
      ERR_set_error(6,0x97,0);
      return -1;
    }
    if (*(long *)(ctx + 0x30) != 0) {
      if (out == (uchar *)0x0) {
        sVar3 = 0;
      }
      else {
        sVar3 = *outlen;
      }
                    /* WARNING: Could not recover jumptable at 0x00a56288. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar1 = (**(code **)(*(long *)(ctx + 0x28) + 0x50))
                        (*(long *)(ctx + 0x30),out,outlen,sVar3,in,inlen);
      return iVar1;
    }
    lVar4 = *(long *)(ctx + 0x78);
    if ((lVar4 != 0) &&
       (UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0xa8), UNRECOVERED_JUMPTABLE != (code *)0x0)) {
      if ((*(byte *)(lVar4 + 4) >> 1 & 1) == 0) {
LAB_00a5623c:
                    /* WARNING: Could not recover jumptable at 0x00a56260. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*UNRECOVERED_JUMPTABLE)(ctx,out,outlen,in,inlen);
        return iVar1;
      }
      iVar1 = EVP_PKEY_get_size(*(undefined8 *)(ctx + 0x88));
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/asymcipher.c",0x129,"EVP_PKEY_decrypt");
        uVar2 = 0xa3;
      }
      else {
        if (out == (uchar *)0x0) {
          *outlen = (long)iVar1;
          return 1;
        }
        if ((ulong)(long)iVar1 <= *outlen) {
          UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(ctx + 0x78) + 0xa8);
          goto LAB_00a5623c;
        }
        ERR_new();
        ERR_set_debug("crypto/evp/asymcipher.c",0x129,"EVP_PKEY_decrypt");
        uVar2 = 0x9b;
      }
      ERR_set_error(6,uVar2,0);
      return 0;
    }
    ERR_new();
    uVar2 = 0x126;
  }
  ERR_set_debug("crypto/evp/asymcipher.c",uVar2,"EVP_PKEY_decrypt");
  ERR_set_error(6,0x96,0);
  return -2;
}

