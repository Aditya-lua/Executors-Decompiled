/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67bcc
 */

/* WARNING: Removing unreachable block (ram,0x00a67e4c) */
/* WARNING: Type propagation algorithm not settling */

int EVP_DigestSignFinal(EVP_MD_CTX *ctx,uchar *sigret,size_t *siglen)

{
  EVP_PKEY_CTX EVar1;
  int iVar2;
  EVP_MD_CTX *out;
  EVP_PKEY_CTX *pEVar3;
  code *UNRECOVERED_JUMPTABLE;
  long lVar4;
  EVP_PKEY_CTX *pEVar5;
  uint local_84;
  uchar auStack_80 [64];
  
  pEVar5 = (EVP_PKEY_CTX *)ctx->update;
  if (pEVar5 == (EVP_PKEY_CTX *)0x0) {
LAB_00a67cd4:
    ERR_new();
    ERR_set_debug("crypto/evp/m_sigver.c",0x1f0,"EVP_DigestSignFinal");
    ERR_set_error(6,0x86,0);
    return 0;
  }
  if (((*(int *)pEVar5 == 0x80) && (*(EVP_PKEY_CTX **)(pEVar5 + 0x30) != (EVP_PKEY_CTX *)0x0)) &&
     (*(long *)(pEVar5 + 0x28) != 0)) {
    if (sigret == (uchar *)0x0) {
      ctx = (EVP_MD_CTX *)0x0;
    }
    else {
      if ((*(byte *)((long)&ctx->md_data + 1) >> 1 & 1) == 0) {
        pEVar5 = EVP_PKEY_CTX_dup(pEVar5);
        if (pEVar5 == (EVP_PKEY_CTX *)0x0) {
          return 0;
        }
        pEVar3 = *(EVP_PKEY_CTX **)(pEVar5 + 0x30);
        ctx = (EVP_MD_CTX *)*siglen;
        UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(pEVar5 + 0x28) + 0x78);
LAB_00a67d50:
        iVar2 = (*UNRECOVERED_JUMPTABLE)(pEVar3,sigret,siglen,ctx);
        EVP_PKEY_CTX_free(pEVar5);
        return iVar2;
      }
      ctx = (EVP_MD_CTX *)*siglen;
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(pEVar5 + 0x28) + 0x78);
    pEVar5 = *(EVP_PKEY_CTX **)(pEVar5 + 0x30);
  }
  else {
    lVar4 = *(long *)(pEVar5 + 0x78);
    if (lVar4 == 0) goto LAB_00a67cd4;
    EVar1 = pEVar5[0xa0];
    if (((byte)EVar1 & 1) != 0) {
      iVar2 = (**(code **)(lVar4 + 0xf8))(pEVar5,ctx);
      if (iVar2 == 0) {
        return 0;
      }
      EVar1 = pEVar5[0xa0];
      lVar4 = *(long *)(pEVar5 + 0x78);
    }
    pEVar5[0xa0] = (EVP_PKEY_CTX)((byte)EVar1 & 0xfe);
    if ((*(byte *)(lVar4 + 4) >> 2 & 1) == 0) {
      UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x78);
      if (sigret == (uchar *)0x0) {
        if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
          iVar2 = EVP_MD_get_size(ctx->engine);
          if (iVar2 < 0) {
            return 0;
          }
          iVar2 = EVP_PKEY_sign(pEVar5,(uchar *)0x0,siglen,(uchar *)0x0,(long)iVar2);
        }
        else {
          iVar2 = (*UNRECOVERED_JUMPTABLE)(pEVar5,0,siglen,ctx);
        }
      }
      else {
        local_84 = 0;
        if ((*(byte *)((long)&ctx->md_data + 1) >> 1 & 1) == 0) {
          out = (EVP_MD_CTX *)EVP_MD_CTX_new();
          if (out == (EVP_MD_CTX *)0x0) {
            return 0;
          }
          iVar2 = EVP_MD_CTX_copy_ex(out,ctx);
          if (iVar2 == 0) {
            EVP_MD_CTX_free(out);
            return 0;
          }
          if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
            iVar2 = EVP_DigestFinal_ex(out,auStack_80,&local_84);
          }
          else {
            iVar2 = (**(code **)(*(long *)(out->update + 0x78) + 0x78))
                              (out->update,sigret,siglen,out);
          }
          EVP_MD_CTX_free(out);
          if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
            return iVar2;
          }
        }
        else {
          if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
            iVar2 = (*UNRECOVERED_JUMPTABLE)(pEVar5,sigret,siglen,ctx);
            return iVar2;
          }
          iVar2 = EVP_DigestFinal_ex(ctx,auStack_80,&local_84);
        }
        if (iVar2 == 0) {
          return 0;
        }
        iVar2 = EVP_PKEY_sign(pEVar5,sigret,siglen,auStack_80,(ulong)local_84);
      }
      if (iVar2 < 1) {
        return 0;
      }
      return 1;
    }
    if (sigret == (uchar *)0x0) {
      UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x78);
      sigret = (uchar *)0x0;
    }
    else {
      if ((*(byte *)((long)&ctx->md_data + 1) >> 1 & 1) == 0) {
        pEVar3 = EVP_PKEY_CTX_dup(pEVar5);
        if (pEVar3 == (EVP_PKEY_CTX *)0x0) {
          return 0;
        }
        UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(pEVar3 + 0x78) + 0x78);
        pEVar5 = pEVar3;
        goto LAB_00a67d50;
      }
      UNRECOVERED_JUMPTABLE = *(code **)(lVar4 + 0x78);
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00a67e00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar2 = (*UNRECOVERED_JUMPTABLE)(pEVar5,sigret,siglen,ctx);
  return iVar2;
}

