/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a577c0
 */

ulong FUN_00a577c0(EVP_MD_CTX *param_1,EVP_MD *param_2,undefined8 param_3,ENGINE *param_4)

{
  int *piVar1;
  EVP_MD *pEVar2;
  char cVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  uint uVar7;
  int iVar8;
  ENGINE *pEVar9;
  ENGINE *pEVar10;
  EVP_PKEY_CTX *pEVar11;
  ulong uVar12;
  char *pcVar13;
  EVP_MD_CTX *ctx;
  undefined8 uVar14;
  code *pcVar15;
  EVP_MD *pEVar16;
  _func_1088 *p_Var17;
  
  p_Var17 = param_1->update;
  if (p_Var17 != (_func_1088 *)0x0) {
    iVar8 = *(int *)p_Var17;
    if (((((iVar8 - 0x10U < 0x31) &&
          ((1L << ((ulong)(iVar8 - 0x10U) & 0x3f) & 0x1000000010001U) != 0)) || (iVar8 == 0x100)) ||
        (iVar8 == 0x80)) && (*(long *)(p_Var17 + 0x30) != 0)) {
      if (iVar8 == 0x100) {
        uVar7 = EVP_DigestVerifyInit(param_1,(EVP_PKEY_CTX **)0x0,param_2,param_4,(EVP_PKEY *)0x0);
        return (ulong)uVar7;
      }
      if (iVar8 == 0x80) {
        uVar7 = EVP_DigestSignInit(param_1,(EVP_PKEY_CTX **)0x0,param_2,param_4,(EVP_PKEY *)0x0);
        return (ulong)uVar7;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/digest.c",0xa5,"evp_md_init_internal");
      uVar14 = 0xbd;
      goto LAB_00a57a38;
    }
  }
  EVP_MD_CTX_clear_flags(param_1,2);
  if (param_1[1].engine != (ENGINE *)0x0) {
    if (param_1->engine != (ENGINE *)0x0) {
      pcVar15 = *(code **)(param_1->engine + 0xb0);
      if (pcVar15 != (code *)0x0) {
        (*pcVar15)();
      }
      param_1[1].engine = (ENGINE *)0x0;
      goto LAB_00a57890;
    }
    ERR_new();
    uVar14 = 0xae;
LAB_00a57a2c:
    ERR_set_debug("crypto/evp/digest.c",uVar14,"evp_md_init_internal");
    uVar14 = 0x86;
    goto LAB_00a57a38;
  }
LAB_00a57890:
  if (param_2 == (EVP_MD *)0x0) {
    param_2 = (EVP_MD *)param_1->engine;
    if (param_2 == (EVP_MD *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/digest.c",0xba,"evp_md_init_internal");
      uVar14 = 0x8b;
      goto LAB_00a57a38;
    }
    pEVar9 = (ENGINE *)param_1->flags;
  }
  else {
    param_1->digest = param_2;
    pEVar9 = (ENGINE *)param_1->flags;
  }
  if (((pEVar9 != (ENGINE *)0x0) && (param_1->engine != (ENGINE *)0x0)) &&
     (param_2->type == *(int *)param_1->engine)) goto LAB_00a57b28;
  ENGINE_finish(pEVar9);
  param_1->flags = 0;
  if (param_4 == (ENGINE *)0x0) {
    pEVar9 = ENGINE_get_digest_engine(param_2->type);
    if (pEVar9 == (ENGINE *)0x0 && param_1->flags == 0) {
      if ((((ulong)param_1->md_data & 0x100) == 0) && (*(int *)&param_2->init != 2)) {
        if (param_1->engine != (ENGINE *)0x0) {
          if ((*(long *)(param_1->engine + 0x40) != 0) &&
             (iVar8 = EVP_MD_CTX_test_flags(param_1,2), iVar8 == 0)) {
            (**(code **)(param_1->engine + 0x40))(param_1);
          }
          if ((param_1->pctx != (EVP_PKEY_CTX *)0x0) && (0 < *(int *)(param_1->engine + 0x4c))) {
            EVP_MD_CTX_test_flags(param_1,4);
            CRYPTO_clear_free(param_1->pctx,(long)*(int *)(param_1->engine + 0x4c),
                              "crypto/evp/digest.c",0x25);
            param_1->pctx = (EVP_PKEY_CTX *)0x0;
          }
        }
        if (param_2->md_ctrl == (_func_1085 *)0x0) {
          if (param_2->type == 0) {
            pcVar13 = "NULL";
          }
          else {
            pcVar13 = OBJ_nid2sn(param_2->type);
          }
          param_2 = (EVP_MD *)
                    evp_generic_fetch(0,1,pcVar13,&DAT_002ab32c,FUN_00a59084,&LAB_00a59588,
                                      &LAB_00a595ac);
          if (param_2 == (EVP_MD *)0x0) {
            ERR_new();
            uVar14 = 0xfe;
            goto LAB_00a57a2c;
          }
          uVar12 = param_1[1].flags;
          if ((uVar12 != 0) && (*(int *)(uVar12 + 0x18) == 0)) {
            piVar1 = (int *)(uVar12 + 0x78);
            do {
              iVar8 = *piVar1;
              iVar6 = iVar8 + -1;
              cVar3 = '\x01';
              bVar5 = (bool)ExclusiveMonitorPass(piVar1,0x10);
              if (bVar5) {
                *piVar1 = iVar6;
                cVar3 = ExclusiveMonitorsStatus();
              }
            } while (cVar3 != '\0');
            if (iVar6 == 0) {
              DataMemoryBarrier(2,1);
            }
            else if (1 < iVar8) goto LAB_00a57d58;
            evp_md_free_int();
          }
LAB_00a57d58:
          param_1[1].flags = (ulong)param_2;
        }
        ctx = (EVP_MD_CTX *)param_1[1].engine;
        if (((ctx != (EVP_MD_CTX *)0x0) &&
            (pEVar16 = (EVP_MD *)param_1->engine, pEVar16 != (EVP_MD *)0x0)) && (pEVar16 != param_2)
           ) {
          if (pEVar16[1].cleanup != (_func_1082 *)0x0) {
            (*pEVar16[1].cleanup)(ctx);
          }
          ctx = (EVP_MD_CTX *)0x0;
          param_1[1].engine = (ENGINE *)0x0;
        }
        if ((param_2->md_ctrl != (_func_1085 *)0x0) &&
           (pEVar16 = (EVP_MD *)param_1[1].flags, pEVar16 != param_2)) {
          if (*(int *)&param_2->init == 0) {
            pEVar16 = param_2 + 1;
            do {
              cVar3 = '\x01';
              bVar5 = (bool)ExclusiveMonitorPass(pEVar16,0x10);
              if (bVar5) {
                pEVar16->type = pEVar16->type + 1;
                cVar3 = ExclusiveMonitorsStatus();
              }
            } while (cVar3 != '\0');
            pEVar16 = (EVP_MD *)param_1[1].flags;
          }
          if ((pEVar16 != (EVP_MD *)0x0) && (*(int *)&pEVar16->init == 0)) {
            pEVar2 = pEVar16 + 1;
            do {
              iVar8 = pEVar2->type;
              iVar6 = iVar8 + -1;
              cVar3 = '\x01';
              bVar5 = (bool)ExclusiveMonitorPass(pEVar2,0x10);
              if (bVar5) {
                pEVar2->type = iVar6;
                cVar3 = ExclusiveMonitorsStatus();
              }
            } while (cVar3 != '\0');
            if (iVar6 == 0) {
              DataMemoryBarrier(2,1);
            }
            else if (1 < iVar8) goto LAB_00a57df8;
            evp_md_free_int(pEVar16);
          }
LAB_00a57df8:
          ctx = (EVP_MD_CTX *)param_1[1].engine;
          param_1[1].flags = (ulong)param_2;
        }
        param_1->engine = (ENGINE *)param_2;
        if (ctx == (EVP_MD_CTX *)0x0) {
          pcVar15 = (code *)param_2[1].flags;
          ossl_provider_ctx(param_2->md_ctrl);
          ctx = (EVP_MD_CTX *)(*pcVar15)();
          param_1[1].engine = (ENGINE *)ctx;
          if (ctx == (EVP_MD_CTX *)0x0) {
            ERR_new();
            uVar14 = 0x118;
            goto LAB_00a57a2c;
          }
          param_2 = (EVP_MD *)param_1->engine;
        }
        if (param_2[1].init != (_func_1078 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a57e40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar7 = (*param_2[1].init)(ctx);
          return (ulong)uVar7;
        }
        ERR_new();
        uVar14 = 0x11e;
        goto LAB_00a57a2c;
      }
      bVar5 = false;
      pEVar9 = (ENGINE *)0x0;
    }
    else {
      bVar5 = false;
    }
  }
  else {
    pEVar9 = (ENGINE *)0x0;
    bVar5 = true;
  }
  pEVar10 = (ENGINE *)param_1[1].flags;
  if (param_1->engine == pEVar10) {
    param_1->engine = (ENGINE *)0x0;
  }
  if ((pEVar10 != (ENGINE *)0x0) && (*(int *)(pEVar10 + 0x18) == 0)) {
    pEVar10 = pEVar10 + 0x78;
    do {
      iVar8 = *(int *)pEVar10;
      iVar6 = iVar8 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(pEVar10,0x10);
      if (bVar4) {
        *(int *)pEVar10 = iVar6;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar6 == 0) {
      DataMemoryBarrier(2,1);
    }
    else if (1 < iVar8) goto LAB_00a57a00;
    evp_md_free_int();
  }
LAB_00a57a00:
  param_1[1].flags = 0;
  if (bVar5) {
    iVar8 = ENGINE_init(param_4);
    pEVar9 = param_4;
    if (iVar8 == 0) {
      ERR_new();
      uVar14 = 299;
      goto LAB_00a57a2c;
    }
LAB_00a57a60:
    param_2 = ENGINE_get_digest(pEVar9,param_2->type);
    if (param_2 == (EVP_MD *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/digest.c",0x137,"evp_md_init_internal");
      ERR_set_error(6,0x86,0);
      ENGINE_finish(pEVar9);
      return 0;
    }
  }
  else if (pEVar9 != (ENGINE *)0x0) goto LAB_00a57a60;
  pEVar16 = (EVP_MD *)param_1->engine;
  param_1->flags = (ulong)pEVar9;
  if (pEVar16 != param_2) {
    if (pEVar16 != (EVP_MD *)0x0) {
      if ((pEVar16->sign != (_func_1083 *)0x0) &&
         (iVar8 = EVP_MD_CTX_test_flags(param_1,2), iVar8 == 0)) {
        (**(code **)(param_1->engine + 0x40))(param_1);
      }
      if ((param_1->pctx != (EVP_PKEY_CTX *)0x0) && (0 < *(int *)(param_1->engine + 0x4c))) {
        EVP_MD_CTX_test_flags(param_1,4);
        CRYPTO_clear_free(param_1->pctx,(long)*(int *)(param_1->engine + 0x4c),"crypto/evp/digest.c"
                          ,0x25);
        param_1->pctx = (EVP_PKEY_CTX *)0x0;
      }
    }
    param_1->engine = (ENGINE *)param_2;
    if ((((ulong)param_1->md_data & 0x100) == 0) &&
       (iVar8 = *(int *)((long)&param_2->verify + 4), iVar8 != 0)) {
      param_1[1].digest = (EVP_MD *)param_2->final;
      pEVar11 = (EVP_PKEY_CTX *)CRYPTO_zalloc((long)iVar8,"crypto/evp/digest.c",0x14c);
      param_1->pctx = pEVar11;
      if (pEVar11 == (EVP_PKEY_CTX *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/digest.c",0x14e,"evp_md_init_internal");
        uVar14 = 0xc0100;
LAB_00a57a38:
        ERR_set_error(6,uVar14,0);
        return 0;
      }
    }
  }
LAB_00a57b28:
  pEVar11 = (EVP_PKEY_CTX *)param_1->update;
  if (pEVar11 != (EVP_PKEY_CTX *)0x0) {
    iVar8 = *(int *)pEVar11;
    if ((((((0x30 < iVar8 - 0x10U) ||
           ((1L << ((ulong)(iVar8 - 0x10U) & 0x3f) & 0x1000000010001U) == 0)) && (iVar8 != 0x100))
         && (iVar8 != 0x80)) || (*(long *)(pEVar11 + 0x28) == 0)) &&
       ((iVar8 = EVP_PKEY_CTX_ctrl(pEVar11,-1,0x1f0,7,0,param_1), iVar8 != -2 && (iVar8 < 1)))) {
      return 0;
    }
  }
  if (((ulong)param_1->md_data & 0x100) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00a57b94. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar12 = (**(code **)(param_1->engine + 0x20))(param_1);
    return uVar12;
  }
  return 1;
}

