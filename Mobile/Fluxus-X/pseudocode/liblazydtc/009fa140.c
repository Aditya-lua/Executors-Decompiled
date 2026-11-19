/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fa140
 */

size_t FUN_009fa140(BIO *param_1,int param_2,size_t param_3,BIO *param_4)

{
  int iVar1;
  long lVar2;
  BIO *bp;
  _func_603 *p_Var3;
  size_t sVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  void *pvVar10;
  int iVar11;
  bio_st *pbVar12;
  int iVar13;
  undefined1 auStack_44 [4];
  
  pbVar12 = param_1->prev_bio;
  switch(param_2) {
  case 1:
    pbVar12->cb_arg = (char *)0x0;
    pbVar12->flags = 0;
    pbVar12->retry_reason = 0;
    bp = *(BIO **)&param_1->references;
    if (bp != (BIO *)0x0) {
      param_2 = 1;
      goto LAB_009fa464;
    }
    break;
  case 2:
    if (0 < *(int *)&pbVar12->cb_arg) {
      return 0;
    }
    bp = *(BIO **)&param_1->references;
    param_2 = 2;
    goto LAB_009fa464;
  case 3:
    return (long)pbVar12->flags;
  case 4:
  case 5:
  case 6:
  case 7:
  case 8:
  case 9:
  case 0xe:
  case 0xf:
  case 0x10:
  case 0x11:
  case 0x12:
  case 0x13:
  case 0x14:
  case 0x15:
  case 0x16:
  case 0x17:
  case 0x18:
  case 0x19:
  case 0x1a:
  case 0x1b:
  case 0x1c:
switchD_009fa184_caseD_4:
    bp = *(BIO **)&param_1->references;
    if (bp != (BIO *)0x0) {
LAB_009fa464:
      sVar4 = BIO_ctrl(bp,param_2,param_3,param_4);
      return sVar4;
    }
    break;
  case 10:
    if (*(int *)&pbVar12->cb_arg != 0) {
      return (long)*(int *)&pbVar12->cb_arg;
    }
    bp = *(BIO **)&param_1->references;
    if (bp != (BIO *)0x0) {
      param_2 = 10;
      goto LAB_009fa464;
    }
    break;
  case 0xb:
    bp = *(BIO **)&param_1->references;
    if (bp != (BIO *)0x0) {
      if (0 < pbVar12->flags) {
        while( true ) {
          BIO_clear_flags(param_1,0xf);
          if (pbVar12->flags < 1) break;
          iVar1 = BIO_write(*(BIO **)&param_1->references,
                            (void *)(*(long *)&pbVar12->init + (long)pbVar12->retry_reason),
                            pbVar12->flags);
          BIO_copy_next_retry(param_1);
          if (iVar1 < 1) {
            return (long)iVar1;
          }
          pbVar12->flags = pbVar12->flags - iVar1;
          pbVar12->retry_reason = pbVar12->retry_reason + iVar1;
        }
        pbVar12->flags = 0;
        pbVar12->retry_reason = 0;
        bp = *(BIO **)&param_1->references;
      }
      param_2 = 0xb;
      goto LAB_009fa464;
    }
    break;
  case 0xc:
    lVar2 = BIO_int_ctrl(param_4,0x75,(long)*(int *)&pbVar12->method,0);
    if ((0 < lVar2) &&
       (lVar2 = BIO_int_ctrl(param_4,0x75,(long)*(int *)((long)&pbVar12->method + 4),1), 0 < lVar2))
    {
      return 1;
    }
    break;
  case 0xd:
    if (pbVar12->flags != 0) {
      return (long)pbVar12->flags;
    }
    bp = *(BIO **)&param_1->references;
    if (bp != (BIO *)0x0) {
      param_2 = 0xd;
      goto LAB_009fa464;
    }
    break;
  case 0x1d:
    FUN_009f9ea0(param_1,auStack_44,0);
    sVar4 = (long)*(int *)&pbVar12->cb_arg;
    if ((long)param_3 <= (long)*(int *)&pbVar12->cb_arg) {
      sVar4 = param_3;
    }
    memcpy(param_4,pbVar12->callback + *(int *)((long)&pbVar12->cb_arg + 4),sVar4);
    return sVar4;
  default:
    iVar1 = (int)param_3;
    switch(param_2) {
    case 0x65:
      if (*(long *)&param_1->references == 0) {
        return 0;
      }
      BIO_clear_flags(param_1,0xf);
      sVar4 = BIO_ctrl(*(BIO **)&param_1->references,0x65,param_3,param_4);
      BIO_copy_next_retry(param_1);
      return sVar4;
    default:
      goto switchD_009fa184_caseD_4;
    case 0x74:
      iVar1 = *(int *)&pbVar12->cb_arg;
      uVar5 = (ulong)iVar1;
      if (iVar1 < 1) {
        return 0;
      }
      lVar2 = (long)*(int *)((long)&pbVar12->cb_arg + 4);
      uVar6 = 0;
      sVar4 = 0;
      if (iVar1 != 1) {
        uVar6 = uVar5 & 0xfffffffffffffffe;
        lVar7 = 0;
        lVar8 = 0;
        p_Var3 = pbVar12->callback + lVar2 + 1;
        uVar9 = uVar6;
        do {
          if (p_Var3[-1] == (_func_603)0xa) {
            lVar7 = lVar7 + 1;
          }
          if (*p_Var3 == (_func_603)0xa) {
            lVar8 = lVar8 + 1;
          }
          uVar9 = uVar9 - 2;
          p_Var3 = p_Var3 + 2;
        } while (uVar9 != 0);
        sVar4 = lVar8 + lVar7;
        if (uVar6 == uVar5) {
          return sVar4;
        }
      }
      do {
        lVar7 = uVar6 + lVar2;
        uVar6 = uVar6 + 1;
        if (pbVar12->callback[lVar7] == (_func_603)0xa) {
          sVar4 = sVar4 + 1;
        }
      } while ((long)uVar6 < (long)uVar5);
      return sVar4;
    case 0x75:
      iVar13 = iVar1;
      iVar11 = iVar1;
      if (param_4 != (BIO *)0x0) {
        if (*(int *)&param_4->method == 0) {
          iVar11 = *(int *)((long)&pbVar12->method + 4);
        }
        else {
          iVar13 = *(int *)&pbVar12->method;
        }
      }
      p_Var3 = pbVar12->callback;
      pvVar10 = *(void **)&pbVar12->init;
      if ((0x1000 < iVar13) && (iVar13 != *(int *)&pbVar12->method)) {
        if ((long)param_3 < 1) {
          return 0;
        }
        p_Var3 = CRYPTO_malloc(iVar1,"crypto/bio/bf_buff.c",0x143);
        if (p_Var3 == (_func_603 *)0x0) break;
      }
      if (((iVar11 < 0x1001) || (iVar11 == *(int *)((long)&pbVar12->method + 4))) ||
         (pvVar10 = CRYPTO_malloc(iVar1,"crypto/bio/bf_buff.c",0x148), pvVar10 != (void *)0x0)) {
        if (pbVar12->callback != p_Var3) {
          CRYPTO_free(pbVar12->callback);
          pbVar12->callback = p_Var3;
          pbVar12->cb_arg = (char *)0x0;
          *(int *)&pbVar12->method = iVar13;
        }
        if (*(void **)&pbVar12->init != pvVar10) {
          CRYPTO_free(*(void **)&pbVar12->init);
          *(void **)&pbVar12->init = pvVar10;
          pbVar12->flags = 0;
          pbVar12->retry_reason = 0;
          *(int *)((long)&pbVar12->method + 4) = iVar11;
        }
        return 1;
      }
      if (p_Var3 != pbVar12->callback) {
        CRYPTO_free(p_Var3);
      }
      break;
    case 0x7a:
      if ((long)param_3 <= (long)*(int *)&pbVar12->method) {
        p_Var3 = pbVar12->callback;
LAB_009fa430:
        *(int *)&pbVar12->cb_arg = iVar1;
        *(undefined4 *)((long)&pbVar12->cb_arg + 4) = 0;
        memcpy(p_Var3,param_4,(long)iVar1);
        return 1;
      }
      if ((long)param_3 < 1) {
        return 0;
      }
      p_Var3 = CRYPTO_malloc(iVar1,"crypto/bio/bf_buff.c",0x124);
      if (p_Var3 != (_func_603 *)0x0) {
        CRYPTO_free(pbVar12->callback);
        pbVar12->callback = p_Var3;
        goto LAB_009fa430;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bf_buff.c",0x199,"buffer_ctrl");
    ERR_set_error(0x20,0xc0100,0);
  }
  return 0;
}

