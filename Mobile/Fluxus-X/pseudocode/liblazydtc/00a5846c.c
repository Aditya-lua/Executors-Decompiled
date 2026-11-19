/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5846c
 */

int EVP_MD_CTX_copy_ex(EVP_MD_CTX *out,EVP_MD_CTX *in)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  EVP_PKEY_CTX *pEVar6;
  undefined8 uVar7;
  ENGINE *pEVar8;
  code *pcVar9;
  ulong uVar10;
  ulong uVar11;
  
  if (in == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x211,"EVP_MD_CTX_copy_ex");
    uVar7 = 0xc0102;
LAB_00a585e0:
    ERR_set_error(6,uVar7,0);
LAB_00a585e8:
    iVar5 = 0;
  }
  else {
    pEVar8 = in->engine;
    if (pEVar8 == (ENGINE *)0x0) {
      if (out != (EVP_MD_CTX *)0x0) {
        iVar5 = EVP_MD_CTX_test_flags(out,0x400);
        if (iVar5 == 0) {
          EVP_PKEY_CTX_free((EVP_PKEY_CTX *)out->update);
          out->update = (_func_1088 *)0x0;
        }
        evp_md_ctx_clear_digest(out,0,0);
        OPENSSL_cleanse(out,0x48);
      }
      uVar10 = out[1].flags;
      if ((uVar10 != 0) && (*(int *)(uVar10 + 0x18) == 0)) {
        piVar1 = (int *)(uVar10 + 0x78);
        do {
          iVar5 = *piVar1;
          iVar4 = iVar5 + -1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = iVar4;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (iVar4 == 0) {
          DataMemoryBarrier(2,1);
        }
        else if (1 < iVar5) goto LAB_00a587d4;
        evp_md_free_int();
      }
LAB_00a587d4:
      memcpy(out,in,0x48);
LAB_00a587e4:
      EVP_MD_CTX_clear_flags(out,0x400);
      if ((EVP_PKEY_CTX *)in->update != (EVP_PKEY_CTX *)0x0) {
        pEVar6 = EVP_PKEY_CTX_dup((EVP_PKEY_CTX *)in->update);
        out->update = (_func_1088 *)pEVar6;
        if (pEVar6 == (EVP_PKEY_CTX *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/evp/digest.c",0x242,"EVP_MD_CTX_copy_ex");
          ERR_set_error(6,0xbe,0);
LAB_00a58844:
          iVar5 = EVP_MD_CTX_test_flags(out,0x400);
          if (iVar5 == 0) {
            EVP_PKEY_CTX_free((EVP_PKEY_CTX *)out->update);
            out->update = (_func_1088 *)0x0;
          }
          evp_md_ctx_clear_digest(out,0,0);
          OPENSSL_cleanse(out,0x48);
          goto LAB_00a585e8;
        }
      }
    }
    else {
      if ((*(long *)(pEVar8 + 0x70) != 0) && (((ulong)in->md_data & 0x100) == 0)) {
        if (*(long *)(pEVar8 + 0xb8) == 0) {
          ERR_new();
          uVar7 = 0x223;
LAB_00a58934:
          ERR_set_debug("crypto/evp/digest.c",uVar7,"EVP_MD_CTX_copy_ex");
          uVar7 = 0xbe;
          goto LAB_00a585e0;
        }
        if (out != (EVP_MD_CTX *)0x0) {
          iVar5 = EVP_MD_CTX_test_flags(out,0x400);
          if (iVar5 == 0) {
            EVP_PKEY_CTX_free((EVP_PKEY_CTX *)out->update);
            out->update = (_func_1088 *)0x0;
          }
          if (out[1].engine != (ENGINE *)0x0) {
            if ((out->engine != (ENGINE *)0x0) &&
               (pcVar9 = *(code **)(out->engine + 0xb0), pcVar9 != (code *)0x0)) {
              (*pcVar9)();
            }
            out[1].engine = (ENGINE *)0x0;
            EVP_MD_CTX_set_flags(out,2);
          }
          if (out->engine != (ENGINE *)0x0) {
            if ((*(long *)(out->engine + 0x40) != 0) &&
               (iVar5 = EVP_MD_CTX_test_flags(out,2), iVar5 == 0)) {
              (**(code **)(out->engine + 0x40))(out);
            }
            if (((out->pctx != (EVP_PKEY_CTX *)0x0) && (0 < *(int *)(out->engine + 0x4c))) &&
               (iVar5 = EVP_MD_CTX_test_flags(out,4), iVar5 == 0)) {
              CRYPTO_clear_free(out->pctx,(long)*(int *)(out->engine + 0x4c),"crypto/evp/digest.c",
                                0x25);
              out->pctx = (EVP_PKEY_CTX *)0x0;
            }
          }
          ENGINE_finish((ENGINE *)out->flags);
          out->flags = 0;
        }
        uVar10 = out[1].flags;
        uVar11 = in[1].flags;
        if (((uVar10 != 0) && (uVar10 != uVar11)) && (*(int *)(uVar10 + 0x18) == 0)) {
          piVar1 = (int *)(uVar10 + 0x78);
          do {
            iVar5 = *piVar1;
            iVar4 = iVar5 + -1;
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
            if (bVar3) {
              *piVar1 = iVar4;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          if (iVar4 == 0) {
            DataMemoryBarrier(2,1);
          }
          else if (1 < iVar5) goto LAB_00a588bc;
          evp_md_free_int(uVar10);
        }
LAB_00a588bc:
        memcpy(out,in,0x48);
        out->update = (_func_1088 *)0x0;
        out[1].engine = (ENGINE *)0x0;
        if (((uVar10 != uVar11) && (uVar10 = in[1].flags, uVar10 != 0)) &&
           (*(int *)(uVar10 + 0x18) == 0)) {
          piVar1 = (int *)(uVar10 + 0x78);
          do {
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
            if (bVar3) {
              *piVar1 = *piVar1 + 1;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
        }
        if (in[1].engine != (ENGINE *)0x0) {
          pEVar8 = (ENGINE *)(**(code **)(in->engine + 0xb8))();
          out[1].engine = pEVar8;
          if (pEVar8 == (ENGINE *)0x0) {
            ERR_new();
            uVar7 = 0x236;
            goto LAB_00a58934;
          }
        }
        goto LAB_00a587e4;
      }
      if ((ENGINE *)in->flags != (ENGINE *)0x0) {
        iVar5 = ENGINE_init((ENGINE *)in->flags);
        if (iVar5 == 0) {
          ERR_new();
          ERR_set_debug("crypto/evp/digest.c",0x250,"EVP_MD_CTX_copy_ex");
          uVar7 = 0x80026;
          goto LAB_00a585e0;
        }
        pEVar8 = in->engine;
      }
      pEVar6 = (EVP_PKEY_CTX *)0x0;
      if (out->engine == pEVar8) {
        pEVar6 = out->pctx;
        EVP_MD_CTX_set_flags(out,4);
      }
      iVar5 = EVP_MD_CTX_test_flags(out,0x400);
      if (iVar5 == 0) {
        EVP_PKEY_CTX_free((EVP_PKEY_CTX *)out->update);
        out->update = (_func_1088 *)0x0;
      }
      evp_md_ctx_clear_digest(out,0,0);
      OPENSSL_cleanse(out,0x48);
      memcpy(out,in,0x48);
      EVP_MD_CTX_clear_flags(out,0x400);
      out->pctx = (EVP_PKEY_CTX *)0x0;
      out->update = (_func_1088 *)0x0;
      if ((in->pctx != (EVP_PKEY_CTX *)0x0) && (iVar5 = *(int *)(out->engine + 0x4c), iVar5 != 0)) {
        if (pEVar6 == (EVP_PKEY_CTX *)0x0) {
          pEVar6 = CRYPTO_malloc(iVar5,"crypto/evp/digest.c",0x26b);
          out->pctx = pEVar6;
          if (pEVar6 == (EVP_PKEY_CTX *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/evp/digest.c",0x26d,"EVP_MD_CTX_copy_ex");
            uVar7 = 0xc0100;
            goto LAB_00a585e0;
          }
          iVar5 = *(int *)(out->engine + 0x4c);
        }
        else {
          out->pctx = pEVar6;
        }
        memcpy(pEVar6,in->pctx,(long)iVar5);
      }
      out[1].digest = in[1].digest;
      if ((EVP_PKEY_CTX *)in->update != (EVP_PKEY_CTX *)0x0) {
        pEVar6 = EVP_PKEY_CTX_dup((EVP_PKEY_CTX *)in->update);
        out->update = (_func_1088 *)pEVar6;
        if (pEVar6 != (EVP_PKEY_CTX *)0x0) goto LAB_00a587a4;
        goto LAB_00a58844;
      }
LAB_00a587a4:
      if (*(code **)(out->engine + 0x38) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a587c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar5 = (**(code **)(out->engine + 0x38))(out,in);
        return iVar5;
      }
    }
    iVar5 = 1;
  }
  return iVar5;
}

