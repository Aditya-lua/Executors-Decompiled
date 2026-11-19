/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a67138
 */

bool FUN_00a67138(EVP_MD_CTX *param_1,undefined8 *param_2,EVP_MD *param_3,char *param_4,
                 undefined8 param_5,long param_6,ENGINE *param_7,EVP_PKEY *param_8,int param_9)

{
  uint uVar1;
  bool bVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  EVP_MD *pEVar7;
  long lVar8;
  undefined8 uVar9;
  EVP_PKEY_CTX *ctx;
  char *name;
  undefined8 uVar10;
  code *pcVar11;
  long lVar12;
  _func_1088 *p_Var13;
  undefined4 uVar14;
  EVP_PKEY_CTX *pEVar15;
  long lVar16;
  long lVar17;
  int local_bc;
  char acStack_b8 [80];
  long local_68;
  
  local_68 = 0;
  memset(acStack_b8,0,0x50);
  if (param_1[1].engine != (ENGINE *)0x0) {
    if (param_1->engine == (ENGINE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/m_sigver.c",0x38,"do_sigver_init");
      uVar10 = 0x86;
      goto LAB_00a676a8;
    }
    pcVar11 = *(code **)(param_1->engine + 0xb0);
    if (pcVar11 != (code *)0x0) {
      (*pcVar11)();
    }
    param_1[1].engine = (ENGINE *)0x0;
  }
  pEVar15 = (EVP_PKEY_CTX *)param_1->update;
  if (pEVar15 == (EVP_PKEY_CTX *)0x0) {
    if (param_7 == (ENGINE *)0x0) {
      pEVar15 = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(param_5,param_8);
    }
    else {
      pEVar15 = EVP_PKEY_CTX_new(param_8,param_7);
    }
    bVar2 = false;
    param_1->update = (_func_1088 *)pEVar15;
    if (pEVar15 == (EVP_PKEY_CTX *)0x0) {
      return false;
    }
  }
  else {
    bVar2 = true;
  }
  uVar4 = ERR_set_mark();
  uVar6 = (ulong)uVar4;
  if (*(long *)(pEVar15 + 0x20) == 0) {
LAB_00a675bc:
    ERR_pop_to_mark();
    EVP_KEYMGMT_free(local_68);
    local_68 = 0;
    if ((param_3 == (EVP_MD *)0x0) && (param_4 != (char *)0x0)) {
      param_3 = (EVP_MD *)evp_get_digestbyname_ex(*(undefined8 *)(pEVar15 + 8));
    }
    ctx = (EVP_PKEY_CTX *)param_1->update;
    lVar16 = *(long *)(ctx + 0x78);
    if (lVar16 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/m_sigver.c",0x131,"do_sigver_init");
      uVar10 = 0x96;
      goto LAB_00a676a8;
    }
    if (param_3 == (EVP_MD *)0x0) {
      if ((*(uint *)(lVar16 + 4) >> 2 & 1) == 0) {
        iVar5 = EVP_PKEY_get_default_digest_nid(param_8,&local_bc);
        if (0 < iVar5) {
          name = OBJ_nid2sn(local_bc);
          param_3 = EVP_get_digestbyname(name);
          if (param_3 != (EVP_MD *)0x0) {
            ctx = (EVP_PKEY_CTX *)param_1->update;
            lVar16 = *(long *)(ctx + 0x78);
            goto LAB_00a67630;
          }
        }
        ERR_new();
        ERR_set_debug("crypto/evp/m_sigver.c",0x13e,"do_sigver_init");
        uVar10 = 0x9e;
LAB_00a676a8:
        ERR_set_error(6,uVar10,0);
        return false;
      }
LAB_00a67630:
      if (param_9 != 0) goto LAB_00a67638;
LAB_00a676c0:
      if (*(code **)(lVar16 + 0x70) != (code *)0x0) {
        iVar5 = (**(code **)(lVar16 + 0x70))(ctx,param_1);
        if (iVar5 < 1) {
          return false;
        }
        p_Var13 = param_1->update;
        uVar14 = 0x80;
        goto LAB_00a676e0;
      }
      if (*(long *)(lVar16 + 0xd0) == 0) {
        iVar5 = EVP_PKEY_sign_init(ctx);
joined_r0x00a678d0:
        if (iVar5 < 1) {
          return false;
        }
      }
      else {
        uVar14 = 0x10;
LAB_00a67724:
        *(undefined4 *)ctx = uVar14;
        param_1[1].digest = (EVP_MD *)FUN_00a68260;
      }
    }
    else {
      if (param_9 == 0) goto LAB_00a676c0;
LAB_00a67638:
      if (*(code **)(lVar16 + 0x80) == (code *)0x0) {
        if (*(long *)(lVar16 + 0xd8) == 0) {
          iVar5 = EVP_PKEY_verify_init(ctx);
          goto joined_r0x00a678d0;
        }
        uVar14 = 0x20;
        goto LAB_00a67724;
      }
      iVar5 = (**(code **)(lVar16 + 0x80))(ctx,param_1);
      if (iVar5 < 1) {
        return false;
      }
      p_Var13 = param_1->update;
      uVar14 = 0x100;
LAB_00a676e0:
      *(undefined4 *)p_Var13 = uVar14;
    }
    iVar5 = EVP_PKEY_CTX_set_signature_md(param_1->update,param_3);
    if (iVar5 < 1) {
      return false;
    }
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = param_1->update;
    }
    if ((*(byte *)(*(long *)(param_1->update + 0x78) + 4) >> 2 & 1) != 0) {
      return true;
    }
    iVar5 = EVP_DigestInit_ex(param_1,param_3,param_7);
    if (iVar5 == 0) {
      return false;
    }
    param_1->update[0xa0] = (_func_1088)((byte)param_1->update[0xa0] & 0xfe);
    p_Var13 = param_1->update;
    if (*(long *)(*(long *)(p_Var13 + 0x78) + 0xf8) != 0) {
      p_Var13[0xa0] = (_func_1088)((byte)p_Var13[0xa0] | 1);
    }
LAB_00a67854:
    iVar5 = evp_pkey_ctx_use_cached_data(pEVar15);
LAB_00a67860:
    EVP_KEYMGMT_free(local_68);
    return 0 < iVar5;
  }
  if (bVar2) {
    lVar16 = 0;
    if (param_8 != (EVP_PKEY *)0x0) goto joined_r0x00a67344;
    lVar16 = 0;
    iVar5 = 0x80;
    if (param_9 != 0) {
      iVar5 = 0x100;
    }
    if (((*(int *)pEVar15 != iVar5) || (lVar16 = *(long *)(pEVar15 + 0x28), lVar16 == 0)) ||
       (*(long *)(pEVar15 + 0x30) == 0)) goto joined_r0x00a67344;
    bVar2 = true;
  }
  else {
    lVar16 = 0;
joined_r0x00a67344:
    bVar2 = false;
  }
  if (param_6 == 0) {
    param_6 = *(long *)(pEVar15 + 0x10);
  }
  if (*(long *)(pEVar15 + 0x88) == 0) {
    ERR_clear_last_mark(uVar6);
    ERR_new();
    ERR_set_debug("crypto/evp/m_sigver.c",0x5e,"do_sigver_init");
    uVar10 = 0x9a;
  }
  else {
    if (bVar2) {
      if ((param_3 == (EVP_MD *)0x0) && (param_4 == (char *)0x0)) {
        param_4 = (char *)EVP_MD_get0_name(param_1->digest);
        uVar6 = 0;
        if (param_4 != (char *)0x0) {
          uVar4 = strcmp(param_4,"UNDEF");
          uVar6 = (ulong)uVar4;
          if (uVar4 == 0) {
            param_4 = (char *)0x0;
          }
        }
      }
      lVar17 = 0;
LAB_00a672f4:
      if (param_2 != (undefined8 *)0x0) {
        *param_2 = pEVar15;
      }
      if (param_3 == (EVP_MD *)0x0) {
        if ((bVar2) || (param_4 != (char *)0x0)) {
          if (param_4 != (char *)0x0) {
LAB_00a67410:
            evp_md_ctx_clear_digest(param_1,1,0);
            ERR_set_mark();
            pEVar7 = (EVP_MD *)EVP_MD_fetch(*(undefined8 *)(pEVar15 + 8),param_4,param_6);
            param_1[1].flags = (ulong)pEVar7;
            if (pEVar7 == (EVP_MD *)0x0) {
              pEVar7 = EVP_get_digestbyname(param_4);
              param_1->digest = pEVar7;
              param_1->engine = (ENGINE *)pEVar7;
              if (pEVar7 == (EVP_MD *)0x0) {
                ERR_clear_last_mark();
                ERR_new();
                uVar10 = 0xfd;
                goto LAB_00a678f4;
              }
            }
            else {
              param_1->digest = pEVar7;
              param_1->engine = (ENGINE *)pEVar7;
            }
            uVar4 = ERR_pop_to_mark();
            uVar6 = (ulong)uVar4;
          }
        }
        else {
          uVar6 = evp_keymgmt_util_get_deflt_digest_name(local_68,lVar17,acStack_b8,0x50);
          if (0 < (int)uVar6) {
            param_4 = acStack_b8;
            uVar4 = strcmp(acStack_b8,"UNDEF");
            uVar6 = (ulong)uVar4;
            if (uVar4 != 0) goto LAB_00a67410;
          }
LAB_00a67404:
          param_4 = (char *)0x0;
        }
      }
      else {
        param_1->digest = param_3;
        if (param_4 == (char *)0x0) {
          param_4 = (char *)EVP_MD_get0_name(param_3);
          uVar6 = 0;
          if (param_4 != (char *)0x0) {
            uVar4 = strcmp(param_4,"UNDEF");
            uVar6 = (ulong)uVar4;
            if (uVar4 == 0) goto LAB_00a67404;
          }
        }
      }
      if (param_9 == 0) {
        pcVar11 = *(code **)(lVar16 + 0x68);
        if (pcVar11 != (code *)0x0) goto LAB_00a67800;
        ERR_new(uVar6);
        uVar10 = 0x10e;
      }
      else {
        pcVar11 = *(code **)(lVar16 + 0x88);
        if (pcVar11 != (code *)0x0) {
LAB_00a67800:
          iVar5 = (*pcVar11)(*(undefined8 *)(pEVar15 + 0x30),param_4,lVar17);
          if ((param_4 != (char *)0x0) || (0 < iVar5)) {
            if (iVar5 < 1) goto LAB_00a67860;
            goto LAB_00a67854;
          }
          if (param_3 != (EVP_MD *)0x0) goto LAB_00a67908;
          ERR_new();
          ERR_set_debug("crypto/evp/m_sigver.c",0x11c,"do_sigver_init");
          uVar10 = 0x9e;
          goto LAB_00a67900;
        }
        ERR_new(uVar6);
        uVar10 = 0x107;
      }
    }
    else {
      evp_pkey_ctx_free_old_ops(pEVar15);
      lVar12 = *(long *)(*(long *)(pEVar15 + 0x88) + 0x60);
      lVar8 = *(long *)(pEVar15 + 0x20);
      if (lVar12 != 0) {
        if (lVar12 != *(long *)(pEVar15 + 0x20)) {
          ERR_clear_last_mark();
          ERR_new();
          ERR_set_debug("crypto/evp/m_sigver.c",0x70,"do_sigver_init");
          uVar10 = 0xc0103;
          goto LAB_00a67900;
        }
        lVar8 = lVar12;
      }
      lVar8 = evp_keymgmt_util_query_operation_name(lVar8,0xc);
      if (lVar8 == 0) {
        ERR_clear_last_mark();
        ERR_new();
        uVar10 = 0x77;
      }
      else {
        uVar10 = 0;
        uVar4 = 2;
        do {
          EVP_SIGNATURE_free(lVar16);
          EVP_KEYMGMT_free(local_68);
          uVar1 = uVar4 - 1 & 0x7fffffff;
          if (uVar1 == 2) {
            uVar10 = EVP_KEYMGMT_get0_provider(*(undefined8 *)(pEVar15 + 0x20));
            lVar16 = evp_signature_fetch_from_prov(uVar10,lVar8,*(undefined8 *)(pEVar15 + 0x10));
            if (lVar16 == 0) goto LAB_00a675bc;
LAB_00a674e0:
            uVar9 = EVP_KEYMGMT_get0_name(*(undefined8 *)(pEVar15 + 0x20));
            lVar12 = evp_keymgmt_fetch_from_prov(uVar10,uVar9,*(undefined8 *)(pEVar15 + 0x10));
            local_68 = lVar12;
            if (lVar12 == 0) {
              lVar17 = 0;
LAB_00a67528:
              EVP_KEYMGMT_free(lVar12);
            }
            else {
              lVar17 = evp_pkey_export_to_provider
                                 (*(undefined8 *)(pEVar15 + 0x88),*(undefined8 *)(pEVar15 + 8),
                                  &local_68,*(undefined8 *)(pEVar15 + 0x10));
              if (local_68 == 0) goto LAB_00a67528;
            }
            if (lVar17 != 0) break;
          }
          else {
            if (uVar1 == 1) {
              lVar16 = EVP_SIGNATURE_fetch(*(undefined8 *)(pEVar15 + 8),lVar8,
                                           *(undefined8 *)(pEVar15 + 0x10));
              if (lVar16 != 0) {
                uVar10 = EVP_SIGNATURE_get0_provider(lVar16);
                goto LAB_00a674e0;
              }
            }
            else if (lVar16 != 0) goto LAB_00a674e0;
            lVar17 = 0;
          }
          bVar3 = uVar4 < 3;
          uVar4 = uVar4 + 1;
        } while (bVar3);
        if (lVar17 == 0) {
          EVP_SIGNATURE_free(lVar16);
          ERR_clear_last_mark();
          ERR_new();
          uVar10 = 0xc2;
        }
        else {
          ERR_pop_to_mark();
          *(long *)(pEVar15 + 0x28) = lVar16;
          iVar5 = 0x80;
          if (param_9 != 0) {
            iVar5 = 0x100;
          }
          *(int *)pEVar15 = iVar5;
          pcVar11 = *(code **)(lVar16 + 0x30);
          uVar10 = ossl_provider_ctx(*(undefined8 *)(lVar16 + 0x18));
          uVar6 = (*pcVar11)(uVar10,param_6);
          *(ulong *)(pEVar15 + 0x30) = uVar6;
          if (uVar6 != 0) goto LAB_00a672f4;
          ERR_new();
          uVar10 = 0xd0;
        }
      }
    }
LAB_00a678f4:
    ERR_set_debug("crypto/evp/m_sigver.c",uVar10,"do_sigver_init");
    uVar10 = 0x86;
  }
LAB_00a67900:
  ERR_set_error(6,uVar10,0);
LAB_00a67908:
  evp_pkey_ctx_free_old_ops(pEVar15);
  *(int *)pEVar15 = 0;
  EVP_KEYMGMT_free(local_68);
  return false;
}

