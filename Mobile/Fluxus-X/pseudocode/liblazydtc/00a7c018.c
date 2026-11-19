/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7c018
 */

int EVP_PKEY_sign(EVP_PKEY_CTX *ctx,uchar *sig,size_t *siglen,uchar *tbs,size_t tbslen)

{
  int iVar1;
  undefined8 uVar2;
  size_t sVar3;
  code *UNRECOVERED_JUMPTABLE;
  long lVar4;
  
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x27d,"EVP_PKEY_sign");
    uVar2 = 0xc0102;
  }
  else {
    if (*(int *)ctx == 0x10) {
      if (*(long *)(ctx + 0x30) == 0) {
        lVar4 = *(long *)(ctx + 0x78);
        if ((lVar4 != 0) &&
           (UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x48), UNRECOVERED_JUMPTABLE != (code *)0x0))
        {
          if ((*(byte *)(lVar4 + 4) >> 1 & 1) == 0) {
LAB_00a7c0f8:
                    /* WARNING: Could not recover jumptable at 0x00a7c11c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            iVar1 = (*UNRECOVERED_JUMPTABLE)(ctx,sig,siglen,tbs,tbslen);
            return iVar1;
          }
          iVar1 = EVP_PKEY_get_size(*(undefined8 *)(ctx + 0x88));
          if (iVar1 == 0) {
            ERR_new();
            ERR_set_debug("crypto/evp/signature.c",0x299,"EVP_PKEY_sign");
            uVar2 = 0xa3;
          }
          else {
            if (sig == (uchar *)0x0) {
              *siglen = (long)iVar1;
              return 1;
            }
            if ((ulong)(long)iVar1 <= *siglen) {
              UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(ctx + 0x78) + 0x48);
              goto LAB_00a7c0f8;
            }
            ERR_new();
            ERR_set_debug("crypto/evp/signature.c",0x299,"EVP_PKEY_sign");
            uVar2 = 0x9b;
          }
          ERR_set_error(6,uVar2,0);
          return 0;
        }
        ERR_new();
        uVar2 = 0x295;
      }
      else {
        if (*(code **)(*(long *)(ctx + 0x28) + 0x40) != (code *)0x0) {
          if (sig == (uchar *)0x0) {
            sVar3 = 0;
          }
          else {
            sVar3 = *siglen;
          }
                    /* WARNING: Could not recover jumptable at 0x00a7c194. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          iVar1 = (**(code **)(*(long *)(ctx + 0x28) + 0x40))
                            (*(long *)(ctx + 0x30),sig,siglen,sVar3,tbs,tbslen);
          return iVar1;
        }
        ERR_new();
        uVar2 = 0x28a;
      }
      ERR_set_debug("crypto/evp/signature.c",uVar2,"EVP_PKEY_sign");
      ERR_set_error(6,0x96,0);
      return -2;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x282,"EVP_PKEY_sign");
    uVar2 = 0x97;
  }
  ERR_set_error(6,uVar2,0);
  return -1;
}

