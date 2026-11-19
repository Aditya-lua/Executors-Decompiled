/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67fa0
 */

/* WARNING: Removing unreachable block (ram,0x00a68130) */

int EVP_DigestVerifyFinal(EVP_MD_CTX *ctx,uchar *sig,size_t siglen)

{
  EVP_PKEY_CTX EVar1;
  int iVar2;
  EVP_MD_CTX *out;
  long lVar3;
  EVP_PKEY_CTX *pEVar4;
  code *pcVar5;
  uint local_84;
  uchar auStack_80 [64];
  
  local_84 = 0;
  pEVar4 = (EVP_PKEY_CTX *)ctx->update;
  if (pEVar4 != (EVP_PKEY_CTX *)0x0) {
    if (((*(int *)pEVar4 == 0x100) && (*(long *)(pEVar4 + 0x30) != 0)) &&
       (*(long *)(pEVar4 + 0x28) != 0)) {
      if ((*(byte *)((long)&ctx->md_data + 1) >> 1 & 1) == 0) {
        pEVar4 = EVP_PKEY_CTX_dup(pEVar4);
        if (pEVar4 == (EVP_PKEY_CTX *)0x0) {
          return 0;
        }
        iVar2 = (**(code **)(*(long *)(pEVar4 + 0x28) + 0x98))
                          (*(undefined8 *)(pEVar4 + 0x30),sig,siglen);
        EVP_PKEY_CTX_free(pEVar4);
        return iVar2;
      }
      iVar2 = (**(code **)(*(long *)(pEVar4 + 0x28) + 0x98))(*(long *)(pEVar4 + 0x30),sig,siglen);
      goto LAB_00a68184;
    }
    lVar3 = *(long *)(pEVar4 + 0x78);
    if (lVar3 != 0) {
      EVar1 = pEVar4[0xa0];
      if (((byte)EVar1 & 1) != 0) {
        iVar2 = (**(code **)(lVar3 + 0xf8))(pEVar4,ctx);
        if (iVar2 == 0) {
          return 0;
        }
        EVar1 = pEVar4[0xa0];
        lVar3 = *(long *)(pEVar4 + 0x78);
      }
      pEVar4[0xa0] = (EVP_PKEY_CTX)((byte)EVar1 & 0xfe);
      pcVar5 = *(code **)(lVar3 + 0x88);
      if ((*(byte *)((long)&ctx->md_data + 1) >> 1 & 1) == 0) {
        out = (EVP_MD_CTX *)EVP_MD_CTX_new();
        if (out == (EVP_MD_CTX *)0x0) {
          return -1;
        }
        iVar2 = EVP_MD_CTX_copy_ex(out,ctx);
        if (iVar2 == 0) {
          EVP_MD_CTX_free(out);
          return -1;
        }
        if (pcVar5 == (code *)0x0) {
          iVar2 = EVP_DigestFinal_ex(out,auStack_80,&local_84);
        }
        else {
          iVar2 = (**(code **)(*(long *)(out->update + 0x78) + 0x88))
                            (out->update,sig,siglen & 0xffffffff,out);
        }
        EVP_MD_CTX_free(out);
        if (pcVar5 != (code *)0x0) {
          return iVar2;
        }
      }
      else {
        if (pcVar5 != (code *)0x0) {
          iVar2 = (*pcVar5)(pEVar4,sig,siglen & 0xffffffff,ctx);
          goto LAB_00a68184;
        }
        iVar2 = EVP_DigestFinal_ex(ctx,auStack_80,&local_84);
      }
      if (iVar2 == 0) {
        return 0;
      }
      iVar2 = EVP_PKEY_verify(pEVar4,sig,siglen,auStack_80,(ulong)local_84);
      goto LAB_00a68184;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/evp/m_sigver.c",0x26d,"EVP_DigestVerifyFinal");
  ERR_set_error(6,0x86,0);
  iVar2 = 0;
LAB_00a68184:
  return iVar2;
}

