/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7c364
 */

int EVP_PKEY_verify_recover(EVP_PKEY_CTX *ctx,uchar *rout,size_t *routlen,uchar *sig,size_t siglen)

{
  int iVar1;
  undefined8 uVar2;
  size_t sVar3;
  code *UNRECOVERED_JUMPTABLE;
  long lVar4;
  
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x2de,"EVP_PKEY_verify_recover");
    uVar2 = 0xc0102;
  }
  else {
    if (*(int *)ctx == 0x40) {
      if (*(long *)(ctx + 0x30) == 0) {
        lVar4 = *(long *)(ctx + 0x78);
        if ((lVar4 != 0) &&
           (UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x68), UNRECOVERED_JUMPTABLE != (code *)0x0))
        {
          if ((*(byte *)(lVar4 + 4) >> 1 & 1) == 0) {
LAB_00a7c444:
                    /* WARNING: Could not recover jumptable at 0x00a7c468. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            iVar1 = (*UNRECOVERED_JUMPTABLE)(ctx,rout,routlen,sig,siglen);
            return iVar1;
          }
          iVar1 = EVP_PKEY_get_size(*(undefined8 *)(ctx + 0x88));
          if (iVar1 == 0) {
            ERR_new();
            ERR_set_debug("crypto/evp/signature.c",0x2f9,"EVP_PKEY_verify_recover");
            uVar2 = 0xa3;
          }
          else {
            if (rout == (uchar *)0x0) {
              *routlen = (long)iVar1;
              return 1;
            }
            if ((ulong)(long)iVar1 <= *routlen) {
              UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(ctx + 0x78) + 0x68);
              goto LAB_00a7c444;
            }
            ERR_new();
            ERR_set_debug("crypto/evp/signature.c",0x2f9,"EVP_PKEY_verify_recover");
            uVar2 = 0x9b;
          }
          ERR_set_error(6,uVar2,0);
          return 0;
        }
        ERR_new();
        uVar2 = 0x2f6;
      }
      else {
        if (*(code **)(*(long *)(ctx + 0x28) + 0x60) != (code *)0x0) {
          if (rout == (uchar *)0x0) {
            sVar3 = 0;
          }
          else {
            sVar3 = *routlen;
          }
                    /* WARNING: Could not recover jumptable at 0x00a7c4e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          iVar1 = (**(code **)(*(long *)(ctx + 0x28) + 0x60))
                            (*(long *)(ctx + 0x30),rout,routlen,sVar3,sig,siglen);
          return iVar1;
        }
        ERR_new();
        uVar2 = 0x2eb;
      }
      ERR_set_debug("crypto/evp/signature.c",uVar2,"EVP_PKEY_verify_recover");
      ERR_set_error(6,0x96,0);
      return -2;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x2e3,"EVP_PKEY_verify_recover");
    uVar2 = 0x97;
  }
  ERR_set_error(6,uVar2,0);
  return -1;
}

