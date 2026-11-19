/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a64c
 */

ulong FUN_00a5a64c(EVP_CIPHER_CTX *param_1,EVP_CIPHER *param_2,ENGINE *param_3,uchar *param_4,
                  uchar *param_5,uint param_6,long param_7)

{
  _func_1091 **pp_Var1;
  char cVar2;
  bool bVar3;
  int iVar4;
  undefined4 uVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  ulong uVar9;
  char *pcVar10;
  void *pvVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  uchar *__dest;
  size_t __n;
  ENGINE *pEVar14;
  code *pcVar15;
  EVP_CIPHER *pEVar16;
  size_t inl;
  EVP_CIPHER_CTX *pEVar17;
  _func_1092 *p_Var18;
  _func_1094 *p_Var19;
  ENGINE *pEVar20;
  _func_1090 **pp_Var21;
  undefined1 auVar22 [16];
  undefined8 local_110 [15];
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined4 local_6c [3];
  
  inl = (size_t)param_6;
  *(undefined4 *)&param_1->field_0x6c = 0xffffffff;
  if (param_6 == 0) {
LAB_00a5a6d8:
    param_1->encrypt = (int)inl;
    if (param_2 != (EVP_CIPHER *)0x0) goto LAB_00a5a6e0;
LAB_00a5a6a4:
    if (param_1->cipher != (EVP_CIPHER *)0x0) goto LAB_00a5a6e0;
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x6d,"evp_cipher_init_internal");
    uVar13 = 0x83;
  }
  else {
    if (param_6 != 0xffffffff) {
      inl = 1;
      goto LAB_00a5a6d8;
    }
    inl = (size_t)(uint)param_1->encrypt;
    if (param_2 == (EVP_CIPHER *)0x0) goto LAB_00a5a6a4;
LAB_00a5a6e0:
    pEVar14 = param_1->engine;
    iVar8 = (int)inl;
    if ((pEVar14 == (ENGINE *)0x0) || (pEVar16 = param_1->cipher, pEVar16 == (EVP_CIPHER *)0x0)) {
LAB_00a5a704:
      if (param_2 == (EVP_CIPHER *)0x0) {
        pEVar20 = (ENGINE *)0x0;
        if (param_3 == (ENGINE *)0x0) goto LAB_00a5a724;
LAB_00a5a828:
        pEVar16 = (EVP_CIPHER *)param_1[1].engine;
        if (param_1->cipher == pEVar16) {
          param_1->cipher = (EVP_CIPHER *)0x0;
        }
        if ((pEVar16 != (EVP_CIPHER *)0x0) && (*(int *)&pEVar16->init == 0)) {
          pp_Var1 = &pEVar16[1].cleanup;
          do {
            iVar7 = *(int *)pp_Var1;
            iVar4 = iVar7 + -1;
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(pp_Var1,0x10);
            if (bVar3) {
              *(int *)pp_Var1 = iVar4;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          if (iVar4 == 0) {
            DataMemoryBarrier(2,1);
          }
          else if (1 < iVar7) goto LAB_00a5a8bc;
          CRYPTO_free((void *)pEVar16[1].flags);
          ossl_provider_free(pEVar16[1].do_cipher);
          CRYPTO_THREAD_lock_free(*(undefined8 *)&pEVar16[1].ctx_size);
          CRYPTO_free(pEVar16);
        }
LAB_00a5a8bc:
        param_1[1].engine = (ENGINE *)0x0;
        if (param_2 == (EVP_CIPHER *)0x0) goto LAB_00a5a9b0;
        if (param_1->cipher != (EVP_CIPHER *)0x0) {
          uVar9 = param_1->flags;
          EVP_CIPHER_CTX_reset(param_1);
          param_1->encrypt = iVar8;
          param_1->flags = uVar9;
        }
        if (param_3 == (ENGINE *)0x0) {
          if (pEVar20 != (ENGINE *)0x0) goto LAB_00a5a914;
        }
        else {
          iVar8 = ENGINE_init(param_3);
          pEVar20 = param_3;
          if (iVar8 == 0) {
            ERR_new();
            uVar13 = 0x137;
            goto LAB_00a5af00;
          }
LAB_00a5a914:
          param_2 = ENGINE_get_cipher(pEVar20,param_2->nid);
          if (param_2 == (EVP_CIPHER *)0x0) {
            ERR_new();
            uVar13 = 0x147;
            goto LAB_00a5af00;
          }
        }
        param_1->cipher = param_2;
        param_1->engine = pEVar20;
        if (*(int *)&param_2->set_asn1_parameters == 0) {
          param_1->cipher_data = (void *)0x0;
          pEVar16 = param_2;
        }
        else {
          pvVar11 = (void *)CRYPTO_zalloc((long)*(int *)&param_2->set_asn1_parameters,
                                          "crypto/evp/evp_enc.c",0x158);
          param_1->cipher_data = pvVar11;
          if (pvVar11 == (void *)0x0) {
            param_1->cipher = (EVP_CIPHER *)0x0;
            ERR_new();
            ERR_set_debug("crypto/evp/evp_enc.c",0x15b,"evp_cipher_init_internal");
            uVar13 = 0xc0100;
            goto LAB_00a5af0c;
          }
          pEVar16 = param_1->cipher;
        }
        param_1->key_len = param_2->key_len;
        param_1->flags = param_1->flags & 1;
        if ((((byte)pEVar16->flags >> 6 & 1) == 0) ||
           (iVar8 = EVP_CIPHER_CTX_ctrl(param_1,0,0,(void *)0x0), 0 < iVar8)) goto LAB_00a5a9b0;
        param_1->cipher = (EVP_CIPHER *)0x0;
        ERR_new();
        uVar13 = 0x167;
      }
      else {
        pEVar20 = (ENGINE *)0x0;
        if (param_3 != (ENGINE *)0x0) goto LAB_00a5a828;
        pEVar20 = ENGINE_get_cipher_engine(param_2->nid);
        pEVar14 = param_1->engine;
LAB_00a5a724:
        if ((((pEVar20 != (ENGINE *)0x0) || (pEVar14 != (ENGINE *)0x0)) ||
            ((param_2 != (EVP_CIPHER *)0x0 && (*(int *)&param_2->init == 2)))) ||
           (((param_2 == (EVP_CIPHER *)0x0 && (param_1->cipher != (EVP_CIPHER *)0x0)) &&
            (*(int *)&param_1->cipher->init == 2)))) goto LAB_00a5a828;
        if ((param_2 != (EVP_CIPHER *)0x0) &&
           (pEVar16 = param_1->cipher, pEVar16 != (EVP_CIPHER *)0x0)) {
          if (*(code **)&pEVar16->ctx_size != (code *)0x0) {
            uVar9 = (**(code **)&pEVar16->ctx_size)(param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
            pEVar16 = param_1->cipher;
          }
          CRYPTO_clear_free(param_1->cipher_data,(long)*(int *)&pEVar16->set_asn1_parameters,
                            "crypto/evp/evp_enc.c",0x9c);
          param_1->cipher_data = (void *)0x0;
          if (param_1->cipher != (EVP_CIPHER *)0x0) {
            uVar9 = param_1->flags;
            EVP_CIPHER_CTX_reset(param_1);
            param_1->encrypt = iVar8;
            param_1->flags = uVar9;
          }
        }
        if (param_2 == (EVP_CIPHER *)0x0) {
          param_2 = param_1->cipher;
        }
        pp_Var21 = &param_2[1].do_cipher;
        if (*pp_Var21 == (_func_1090 *)0x0) {
          if (param_2->nid == 0) {
            pcVar10 = "NULL";
          }
          else {
            pcVar10 = OBJ_nid2sn(param_2->nid);
          }
          param_2 = (EVP_CIPHER *)
                    evp_generic_fetch(0,2,pcVar10,&DAT_002ab32c,FUN_00a5cd0c,&LAB_00a5d1c4,
                                      FUN_00a5d1e8);
          if (param_2 == (EVP_CIPHER *)0x0) {
            return 0;
          }
          pEVar14 = param_1[1].engine;
          if ((pEVar14 != (ENGINE *)0x0) && (*(int *)(pEVar14 + 0x18) == 0)) {
            pEVar20 = pEVar14 + 0x80;
            do {
              iVar7 = *(int *)pEVar20;
              iVar4 = iVar7 + -1;
              cVar2 = '\x01';
              bVar3 = (bool)ExclusiveMonitorPass(pEVar20,0x10);
              if (bVar3) {
                *(int *)pEVar20 = iVar4;
                cVar2 = ExclusiveMonitorsStatus();
              }
            } while (cVar2 != '\0');
            if (iVar4 == 0) {
              DataMemoryBarrier(2,1);
            }
            else if (1 < iVar7) goto LAB_00a5aed8;
            CRYPTO_free(*(void **)(pEVar14 + 0x68));
            ossl_provider_free(*(undefined8 *)(pEVar14 + 0x78));
            CRYPTO_THREAD_lock_free(*(undefined8 *)(pEVar14 + 0x88));
            CRYPTO_free(pEVar14);
          }
LAB_00a5aed8:
          param_1[1].engine = (ENGINE *)param_2;
          pp_Var21 = &param_2[1].do_cipher;
          if (*pp_Var21 != (_func_1090 *)0x0) goto LAB_00a5a7b0;
          ERR_new();
          uVar13 = 0xc4;
        }
        else {
LAB_00a5a7b0:
          pEVar16 = (EVP_CIPHER *)param_1[1].engine;
          if (param_2 != pEVar16) {
            if (*(int *)&param_2->init == 0) {
              pp_Var1 = &param_2[1].cleanup;
              do {
                cVar2 = '\x01';
                bVar3 = (bool)ExclusiveMonitorPass(pp_Var1,0x10);
                if (bVar3) {
                  *(int *)pp_Var1 = *(int *)pp_Var1 + 1;
                  cVar2 = ExclusiveMonitorsStatus();
                }
              } while (cVar2 != '\0');
              pEVar16 = (EVP_CIPHER *)param_1[1].engine;
            }
            if ((pEVar16 != (EVP_CIPHER *)0x0) && (*(int *)&pEVar16->init == 0)) {
              pp_Var1 = &pEVar16[1].cleanup;
              do {
                iVar7 = *(int *)pp_Var1;
                iVar4 = iVar7 + -1;
                cVar2 = '\x01';
                bVar3 = (bool)ExclusiveMonitorPass(pp_Var1,0x10);
                if (bVar3) {
                  *(int *)pp_Var1 = iVar4;
                  cVar2 = ExclusiveMonitorsStatus();
                }
              } while (cVar2 != '\0');
              if (iVar4 == 0) {
                DataMemoryBarrier(2,1);
              }
              else if (1 < iVar7) goto LAB_00a5ac4c;
              CRYPTO_free((void *)pEVar16[1].flags);
              ossl_provider_free(pEVar16[1].do_cipher);
              CRYPTO_THREAD_lock_free(*(undefined8 *)&pEVar16[1].ctx_size);
              CRYPTO_free(pEVar16);
            }
LAB_00a5ac4c:
            param_1[1].engine = (ENGINE *)param_2;
          }
          param_1->cipher = param_2;
          if (param_1[1].cipher == (EVP_CIPHER *)0x0) {
            p_Var18 = param_2[1].set_asn1_parameters;
            auVar22 = ossl_provider_ctx(*pp_Var21);
            uVar6 = (*p_Var18)(auVar22._0_8_,auVar22._8_8_);
            param_1[1].cipher = (EVP_CIPHER *)(ulong)uVar6;
            if ((EVP_CIPHER *)(ulong)uVar6 == (EVP_CIPHER *)0x0) {
              ERR_new();
              uVar13 = 0xd4;
              goto LAB_00a5af00;
            }
          }
          uVar9 = param_1->flags;
          if (((uint)uVar9 >> 8 & 1) != 0) {
            memset(local_110,0,0x50);
            local_6c[0] = 0;
            param_1->flags = uVar9 | 0x100;
            if ((param_1->cipher == (EVP_CIPHER *)0x0) ||
               (param_1->cipher[1].do_cipher != (_func_1090 *)0x0)) {
              OSSL_PARAM_construct_uint(&local_98,"padding",local_6c);
              local_110[4] = local_78;
              local_110[1] = uStack_90;
              local_110[0] = local_98;
              local_110[3] = uStack_80;
              local_110[2] = local_88;
              uVar9 = evp_do_ciph_ctx_setparams(param_1->cipher,param_1[1].cipher,local_110);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
          }
          if (param_7 != 0) {
            memset(local_110,0,0x78);
            puVar12 = (undefined8 *)OSSL_PARAM_locate_const(param_7,"keylen");
            if (puVar12 != (undefined8 *)0x0) {
              local_110[4] = puVar12[4];
              local_110[3] = puVar12[3];
              local_110[2] = puVar12[2];
              local_110[1] = puVar12[1];
              local_110[0] = *puVar12;
            }
            uVar9 = (ulong)(puVar12 != (undefined8 *)0x0);
            puVar12 = (undefined8 *)OSSL_PARAM_locate_const(param_7,"ivlen");
            if (puVar12 == (undefined8 *)0x0) {
              if (uVar9 == 0) goto LAB_00a5adc8;
              pEVar16 = param_1->cipher;
            }
            else {
              local_110[uVar9 * 5 + 4] = puVar12[4];
              uVar13 = puVar12[2];
              local_110[uVar9 * 5 + 3] = puVar12[3];
              local_110[uVar9 * 5 + 2] = uVar13;
              uVar13 = *puVar12;
              local_110[uVar9 * 5 + 1] = puVar12[1];
              local_110[uVar9 * 5] = uVar13;
              pEVar16 = param_1->cipher;
            }
            if ((pEVar16 != (EVP_CIPHER *)0x0) &&
               (pcVar15 = *(code **)&pEVar16[2].ctx_size, pcVar15 != (code *)0x0)) {
              pEVar16 = param_1[1].cipher;
              *(undefined4 *)&param_1->field_0x6c = 0xffffffff;
              iVar7 = (*pcVar15)(pEVar16,local_110);
              if (iVar7 != 0) goto LAB_00a5adc8;
            }
            ERR_new();
            ERR_set_debug("crypto/evp/evp_enc.c",0xff,"evp_cipher_init_internal");
            uVar13 = 0xdd;
            goto LAB_00a5af0c;
          }
LAB_00a5adc8:
          if (iVar8 == 0) {
            p_Var19 = param_1->cipher[1].ctrl;
            if (p_Var19 != (_func_1094 *)0x0) goto LAB_00a5adfc;
            ERR_new();
            uVar13 = 0x117;
          }
          else {
            p_Var19 = (_func_1094 *)param_1->cipher[1].get_asn1_parameters;
            if (p_Var19 != (_func_1094 *)0x0) {
LAB_00a5adfc:
              pEVar17 = (EVP_CIPHER_CTX *)param_1[1].cipher;
              if (param_4 == (uchar *)0x0) {
                iVar8 = 0;
              }
              else {
                iVar8 = EVP_CIPHER_CTX_get_key_length(param_1);
              }
              if (param_5 != (uchar *)0x0) {
                EVP_CIPHER_CTX_get_iv_length(param_1);
              }
              uVar6 = (*p_Var19)(pEVar17,(int)param_4,iVar8,param_5);
              return (ulong)uVar6;
            }
            ERR_new();
            uVar13 = 0x108;
          }
        }
      }
LAB_00a5af00:
      ERR_set_debug("crypto/evp/evp_enc.c",uVar13,"evp_cipher_init_internal");
      uVar13 = 0x86;
      goto LAB_00a5af0c;
    }
    if (param_2 != (EVP_CIPHER *)0x0) {
      if (param_2->nid != pEVar16->nid) goto LAB_00a5a704;
LAB_00a5a9b0:
      pEVar16 = param_1->cipher;
      if (pEVar16 == (EVP_CIPHER *)0x0) {
        return 0;
      }
    }
    if ((0x10 < (uint)pEVar16->block_size) ||
       ((1 << (ulong)(pEVar16->block_size & 0x1f) & 0x10102U) == 0)) {
                    /* WARNING: Subroutine does not return */
      OPENSSL_die("assertion failed: ctx->cipher->block_size == 1 || ctx->cipher->block_size == 8 || ctx->cipher->block_size == 16"
                  ,"crypto/evp/evp_enc.c",0x175);
    }
    if ((param_1->flags & 1) == 0) {
      EVP_CIPHER_CTX_get0_cipher(param_1);
      iVar8 = EVP_CIPHER_get_mode();
      if (iVar8 == 0x10002) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_enc.c",0x179,"evp_cipher_init_internal");
        uVar13 = 0xaa;
        goto LAB_00a5af0c;
      }
    }
    EVP_CIPHER_CTX_get0_cipher(param_1);
    uVar6 = EVP_CIPHER_get_flags();
    if ((uVar6 >> 4 & 1) != 0) goto switchD_00a5aa60_caseD_0;
    EVP_CIPHER_CTX_get0_cipher(param_1);
    uVar5 = EVP_CIPHER_get_mode();
    switch(uVar5) {
    case 0:
    case 1:
      goto switchD_00a5aa60_caseD_0;
    case 3:
    case 4:
      param_1->num = 0;
    case 2:
      uVar6 = EVP_CIPHER_CTX_get_iv_length(param_1);
      if (uVar6 < 0x11) {
        __dest = param_1->oiv;
        __n = (size_t)(int)uVar6;
        if (param_5 != (uchar *)0x0) {
          memcpy(__dest,param_5,__n);
        }
LAB_00a5aaf8:
        memcpy(param_1->iv,__dest,__n);
switchD_00a5aa60_caseD_0:
        pEVar16 = param_1->cipher;
        if ((param_4 != (uchar *)0x0) || (((byte)pEVar16->flags >> 5 & 1) != 0)) {
          iVar8 = (*pEVar16->do_cipher)(param_1,param_4,param_5,inl);
          if (iVar8 == 0) {
            return 0;
          }
          pEVar16 = param_1->cipher;
        }
        param_1->buf_len = 0;
        param_1->final_used = 0;
        param_1->block_mask = pEVar16->block_size + -1;
        return 1;
      }
      ERR_new();
      uVar13 = 0x18e;
      break;
    case 5:
      param_1->num = 0;
      if (param_5 == (uchar *)0x0) goto switchD_00a5aa60_caseD_0;
      iVar8 = EVP_CIPHER_CTX_get_iv_length(param_1);
      if (iVar8 - 1U < 0x10) {
        __n = (size_t)iVar8;
        __dest = param_5;
        goto LAB_00a5aaf8;
      }
      ERR_new();
      uVar13 = 0x19c;
      break;
    default:
      goto LAB_00a5af18;
    }
    ERR_set_debug("crypto/evp/evp_enc.c",uVar13,"evp_cipher_init_internal");
    uVar13 = 0xc2;
  }
LAB_00a5af0c:
  ERR_set_error(6,uVar13,0);
LAB_00a5af18:
  return 0;
}

