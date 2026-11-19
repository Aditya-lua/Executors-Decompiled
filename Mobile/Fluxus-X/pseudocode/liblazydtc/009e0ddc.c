/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0ddc
 */

/* WARNING: Type propagation algorithm not settling */

long dtls1_do_write(SSL *param_1,int param_2)

{
  undefined1 uVar1;
  bool bVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  ssl3_state_st *psVar6;
  uchar *puVar7;
  BIO *bp;
  undefined1 *puVar8;
  undefined8 uVar9;
  _func_3150 *p_Var10;
  ulong uVar11;
  _func_3150 *p_Var12;
  long lVar13;
  void *pvVar14;
  X509_EXTENSIONS *pXVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  long lVar19;
  _func_3150 **pp_Var20;
  _func_3150 *p_Var21;
  _func_3150 *local_68;
  
  iVar3 = dtls1_query_mtu();
  if (((iVar3 == 0) ||
      (uVar11._0_4_ = param_1[1].tlsext_ocsp_exts[9].stack.sorted,
      uVar11._4_4_ = param_1[1].tlsext_ocsp_exts[9].stack.num_alloc, uVar5 = dtls1_min_mtu(param_1),
      uVar11 < uVar5)) ||
     ((param_2 == 0x16 &&
      ((param_1->msg_callback_arg == (void *)0x0 &&
       (param_1->msg_callback !=
        (_func_3150 *)(*(long *)&param_1[1].tlsext_ocsp_exts[10].stack + 0xc))))))) {
    return 0xffffffff;
  }
  psVar6 = param_1[3].s3;
  if (psVar6 == (ssl3_state_st *)0x0) {
    lVar19 = 0;
    puVar7 = param_1[3].packet;
    goto joined_r0x009e0eb8;
  }
  if (param_1[3].packet == (uchar *)0x0) {
LAB_009e0e74:
    EVP_MD_CTX_get0_md(psVar6);
    iVar3 = EVP_MD_get_size();
    lVar19 = (long)iVar3;
  }
  else {
    EVP_CIPHER_CTX_get0_cipher(param_1[3].packet);
    uVar4 = EVP_CIPHER_get_flags();
    lVar19 = 0;
    if ((uVar4 >> 0x15 & 1) == 0) {
      psVar6 = param_1[3].s3;
      goto LAB_009e0e74;
    }
  }
  puVar7 = param_1[3].packet;
joined_r0x009e0eb8:
  if (puVar7 == (uchar *)0x0) {
    lVar13 = 0;
  }
  else {
    EVP_CIPHER_CTX_get0_cipher();
    iVar3 = EVP_CIPHER_get_mode();
    lVar13 = 0;
    if (iVar3 == 2) {
      iVar3 = EVP_CIPHER_CTX_get_block_size(param_1[3].packet);
      lVar13 = (long)(iVar3 << 1);
    }
  }
  pp_Var20 = &param_1->msg_callback;
  p_Var10 = *pp_Var20;
  param_1->rwstate = 1;
  if (p_Var10 != (_func_3150 *)0x0) {
    lVar13 = lVar13 + lVar19;
    p_Var21 = (_func_3150 *)0x0;
    bVar2 = true;
    do {
      while( true ) {
        if ((param_2 == 0x16) && (pvVar14 = param_1->msg_callback_arg, pvVar14 != (void *)0x0)) {
          if (p_Var21 == (_func_3150 *)0x0) {
            p_Var21 = *(_func_3150 **)&param_1[1].tlsext_ocsp_exts[10].stack.sorted;
          }
          else {
            if (pvVar14 < (void *)0xd) {
              return 0xffffffff;
            }
            param_1->msg_callback = p_Var10 + 0xc;
            param_1->msg_callback_arg = (void *)((long)pvVar14 + -0xc);
          }
        }
        lVar19 = BIO_ctrl(param_1->wbio,0xd,0,(void *)0x0);
        uVar5 = lVar13 + ((lVar19 << 0x20) + 0xd00000000 >> 0x20);
        uVar11 = *(ulong *)&param_1[1].tlsext_ocsp_exts[9].stack.sorted;
        p_Var12 = (_func_3150 *)(uVar11 - uVar5);
        if ((uVar11 < uVar5 || p_Var12 == (_func_3150 *)0x0) || (p_Var12 < (_func_3150 *)0xd)) {
          lVar19 = BIO_ctrl(param_1->wbio,0xb,0,(void *)0x0);
          if ((int)lVar19 < 1) {
            param_1->rwstate = 2;
            return lVar19;
          }
          uVar5 = *(ulong *)&param_1[1].tlsext_ocsp_exts[9].stack.sorted;
          if (uVar5 <= lVar13 + 0x19U) {
            return 0xffffffff;
          }
          p_Var12 = (_func_3150 *)(uVar5 - (lVar13 + 0xd));
        }
        if ((_func_3150 *)((ulong)param_1->msg_callback & 0xffffffff) <= p_Var12) {
          p_Var12 = param_1->msg_callback;
        }
        uVar5 = ssl_get_max_send_fragment(param_1);
        if ((_func_3150 *)(uVar5 & 0xffffffff) < p_Var12) {
          uVar5 = ssl_get_max_send_fragment(param_1);
          p_Var12 = (_func_3150 *)(uVar5 & 0xffffffff);
        }
        if (param_2 == 0x16) {
          if (p_Var12 < (_func_3150 *)0xc) {
            return 0xffffffff;
          }
          pXVar15 = param_1[1].tlsext_ocsp_exts;
          *(_func_3150 **)&pXVar15[10].stack.sorted = p_Var21;
          pXVar15[10].stack.comp = (_func_257 *)(p_Var12 + -0xc);
          puVar8 = (undefined1 *)
                   (*(long *)(param_1->d1->cookie + 4) + (long)param_1->msg_callback_arg);
          *puVar8 = *(undefined1 *)&pXVar15[9].stack.comp;
          puVar8[1] = (char)((ulong)*(undefined8 *)&pXVar15[10].stack >> 0x10);
          puVar8[2] = (char)((ulong)*(undefined8 *)&pXVar15[10].stack >> 8);
          puVar8[3] = (char)*(undefined8 *)&pXVar15[10].stack;
          puVar8[4] = *(undefined1 *)((long)&pXVar15[10].stack.data + 1);
          puVar8[5] = *(undefined1 *)&pXVar15[10].stack.data;
          uVar16 = pXVar15[10].stack.sorted;
          puVar8[6] = (char)((uint)uVar16 >> 0x10);
          uVar17 = pXVar15[10].stack.sorted;
          puVar8[7] = (char)((uint)uVar17 >> 8);
          uVar18 = pXVar15[10].stack.sorted;
          puVar8[8] = (char)uVar18;
          puVar8[9] = (char)((ulong)pXVar15[10].stack.comp >> 0x10);
          puVar8[10] = (char)((ulong)pXVar15[10].stack.comp >> 8);
          puVar8[0xb] = (char)pXVar15[10].stack.comp;
        }
        iVar3 = dtls1_write_bytes(param_1,param_2,
                                  *(long *)(param_1->d1->cookie + 4) +
                                  (long)param_1->msg_callback_arg,p_Var12,&local_68);
        if (iVar3 < 1) break;
        if (p_Var12 != local_68) {
          return 0xffffffff;
        }
        if ((param_2 == 0x16) &&
           (pXVar15 = param_1[1].tlsext_ocsp_exts, *(int *)&pXVar15[0x10].stack.field_0x4 == 0)) {
          puVar8 = (undefined1 *)
                   (*(long *)(param_1->d1->cookie + 4) + (long)param_1->msg_callback_arg);
          if ((p_Var21 == (_func_3150 *)0x0) && (param_1->version != 0x100)) {
            *puVar8 = *(undefined1 *)&pXVar15[9].stack.comp;
            puVar8[1] = (char)((ulong)*(undefined8 *)&pXVar15[10].stack >> 0x10);
            puVar8[2] = (char)((ulong)*(undefined8 *)&pXVar15[10].stack >> 8);
            puVar8[3] = (char)*(undefined8 *)&pXVar15[10].stack;
            puVar8[4] = *(undefined1 *)((long)&pXVar15[10].stack.data + 1);
            uVar1 = *(undefined1 *)&pXVar15[10].stack.data;
            *(undefined2 *)(puVar8 + 6) = 0;
            puVar8[8] = 0;
            puVar8[5] = uVar1;
            puVar8[9] = (char)((ulong)*(undefined8 *)&pXVar15[10].stack >> 0x10);
            puVar8[10] = (char)((ulong)*(undefined8 *)&pXVar15[10].stack >> 8);
            puVar8[0xb] = (char)*(undefined8 *)&pXVar15[10].stack;
            p_Var10 = local_68;
          }
          else {
            puVar8 = puVar8 + 0xc;
            p_Var10 = p_Var12 + -0xc;
          }
          iVar3 = ssl3_finish_mac(param_1,puVar8,p_Var10);
          if (iVar3 == 0) {
            return 0xffffffff;
          }
          p_Var12 = local_68;
        }
        p_Var10 = *pp_Var20 + -(long)p_Var12;
        if (p_Var10 == (_func_3150 *)0x0) {
          if ((code *)param_1[1].tlsext_ocsp_resp != (code *)0x0) {
            uVar9._0_4_ = param_1[1].tlsext_ocsp_resplen;
            uVar9._4_4_ = param_1[1].tlsext_ticket_expected;
            (*(code *)param_1[1].tlsext_ocsp_resp)
                      (1,param_1->version,param_2,*(undefined8 *)(param_1->d1->cookie + 4),
                       (_func_3150 *)((long)param_1->msg_callback_arg + (long)p_Var12),param_1,uVar9
                      );
          }
          *pp_Var20 = (_func_3150 *)0x0;
          param_1->msg_callback_arg = (void *)0x0;
          return 1;
        }
        local_68 = p_Var12 + -0xc;
        p_Var21 = local_68 + (long)p_Var21;
        param_1->msg_callback = p_Var10;
        param_1->msg_callback_arg = (_func_3150 *)((long)param_1->msg_callback_arg + (long)p_Var12);
        pXVar15 = param_1[1].tlsext_ocsp_exts;
        *(_func_3150 **)&pXVar15[10].stack.sorted = p_Var21;
        pXVar15[10].stack.comp = (_func_257 *)0x0;
        if (p_Var10 == (_func_3150 *)0x0) {
          return 0;
        }
      }
      if (!bVar2) {
        return 0xffffffff;
      }
      bp = SSL_get_wbio(param_1);
      lVar19 = BIO_ctrl(bp,0x2b,0,(void *)0x0);
      if (lVar19 < 1) {
        return 0xffffffff;
      }
      uVar4 = SSL_get_options(param_1);
      if ((uVar4 >> 0xc & 1) != 0) {
        return 0xffffffff;
      }
      iVar3 = dtls1_query_mtu(param_1);
      if (iVar3 == 0) {
        return 0xffffffff;
      }
      p_Var10 = *pp_Var20;
      bVar2 = false;
    } while (p_Var10 != (_func_3150 *)0x0);
  }
  return 0;
}

