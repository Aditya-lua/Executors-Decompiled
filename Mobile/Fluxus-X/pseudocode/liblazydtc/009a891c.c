/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a891c
 */

long ssl3_ctx_ctrl(long param_1,int param_2,ulong param_3,long *param_4)

{
  int iVar1;
  long lVar2;
  EVP_PKEY *pkey;
  size_t sVar3;
  char *pcVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long *plVar8;
  undefined4 uVar9;
  
  lVar2 = 0;
  uVar9 = (undefined4)param_3;
  switch(param_2) {
  case 3:
    if (param_4 == (long *)0x0) {
      ERR_new(0);
      uVar6 = 0xec4;
LAB_009a8dd4:
      ERR_set_debug("ssl/s3_lib.c",uVar6,"ssl3_ctx_ctrl");
      uVar6 = 0xc0102;
      goto LAB_009a8ef0;
    }
    pkey = (EVP_PKEY *)ssl_dh_to_pkey(param_4);
    if (pkey != (EVP_PKEY *)0x0) {
      iVar1 = SSL_CTX_set0_tmp_dh_pkey(param_1,pkey);
      if (iVar1 == 0) {
        EVP_PKEY_free(pkey);
        return 0;
      }
      return 1;
    }
    ERR_new();
    uVar6 = 0xec9;
    goto LAB_009a8eb0;
  case 4:
    if (param_4 == (long *)0x0) {
      ERR_new(0);
      uVar6 = 0xedf;
      goto LAB_009a8dd4;
    }
    iVar1 = ssl_set_tmp_ecdh_groups(param_1 + 0x280,param_1 + 0x278,param_4);
    break;
  default:
    goto switchD_009a8958_caseD_5;
  case 6:
    ERR_new(0);
    ERR_set_debug("ssl/s3_lib.c",0xed4,"ssl3_ctx_ctrl");
    uVar6 = 0xc0101;
    goto LAB_009a8ef0;
  case 0xe:
    lVar2 = *(long *)(param_1 + 0x110);
    if (lVar2 == 0) {
      lVar2 = OPENSSL_sk_new_null();
      *(long *)(param_1 + 0x110) = lVar2;
      if (lVar2 == 0) {
        ERR_new();
        uVar6 = 0xf72;
        goto LAB_009a8eb0;
      }
    }
    iVar1 = OPENSSL_sk_push(lVar2,param_4);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar6 = 0xf77;
LAB_009a8eb0:
    ERR_set_debug("ssl/s3_lib.c",uVar6,"ssl3_ctx_ctrl");
    uVar6 = 0xc0100;
LAB_009a8ef0:
    ERR_set_error(0x14,uVar6,0);
    return 0;
  case 0x36:
    *(long **)(param_1 + 0x220) = param_4;
    return 1;
  case 0x3a:
  case 0x3b:
    if (param_4 == (long *)0x0) {
      return 0x50;
    }
    if (param_3 == 0x50) {
      if (param_2 == 0x3b) {
        lVar2 = *param_4;
        *(long *)(param_1 + 0x230) = param_4[1];
        *(long *)(param_1 + 0x228) = lVar2;
        plVar8 = *(long **)(param_1 + 0x238);
        lVar2 = param_4[4];
        plVar8[3] = param_4[5];
        plVar8[2] = lVar2;
        lVar2 = param_4[2];
        plVar8[1] = param_4[3];
        *plVar8 = lVar2;
        lVar2 = *(long *)(param_1 + 0x238);
        lVar5 = param_4[8];
        *(long *)(lVar2 + 0x38) = param_4[9];
        *(long *)(lVar2 + 0x30) = lVar5;
        lVar5 = param_4[6];
        *(long *)(lVar2 + 0x28) = param_4[7];
        *(long *)(lVar2 + 0x20) = lVar5;
        return 1;
      }
      lVar2 = *(long *)(param_1 + 0x228);
      param_4[1] = *(long *)(param_1 + 0x230);
      *param_4 = lVar2;
      plVar8 = *(long **)(param_1 + 0x238);
      lVar2 = plVar8[2];
      param_4[5] = plVar8[3];
      param_4[4] = lVar2;
      lVar2 = *plVar8;
      param_4[3] = plVar8[1];
      param_4[2] = lVar2;
      lVar2 = *(long *)(param_1 + 0x238);
      lVar5 = *(long *)(lVar2 + 0x30);
      param_4[9] = *(long *)(lVar2 + 0x38);
      param_4[8] = lVar5;
      lVar5 = *(long *)(lVar2 + 0x20);
      param_4[7] = *(long *)(lVar2 + 0x28);
      param_4[6] = lVar5;
      return 1;
    }
    ERR_new(0);
    ERR_set_debug("ssl/s3_lib.c",0xef4,"ssl3_ctx_ctrl");
    uVar6 = 0x145;
    goto LAB_009a8ef0;
  case 0x40:
    *(long **)(param_1 + 600) = param_4;
    return 1;
  case 0x41:
    *(undefined4 *)(param_1 + 0x260) = uVar9;
    return 1;
  case 0x4e:
    *(long **)(param_1 + 0x318) = param_4;
    *(ulong *)(param_1 + 0x390) = *(ulong *)(param_1 + 0x390) | 0x20;
    return 1;
  case 0x4f:
    *(ulong *)(param_1 + 0x390) = *(ulong *)(param_1 + 0x390) | 0x20;
    CRYPTO_free(*(void **)(param_1 + 0x338));
    *(undefined8 *)(param_1 + 0x338) = 0;
    if (param_4 == (long *)0x0) {
      return 1;
    }
    sVar3 = strlen((char *)param_4);
    if (0xfe < sVar3 - 1) {
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0xf2a,"ssl3_ctx_ctrl");
      uVar6 = 0x165;
      goto LAB_009a8ef0;
    }
    pcVar4 = CRYPTO_strdup((char *)param_4,"ssl/s3_lib.c",0xf2d);
    *(char **)(param_1 + 0x338) = pcVar4;
    if (pcVar4 != (char *)0x0) {
      return 1;
    }
    ERR_new();
    uVar6 = 0xf2e;
    goto LAB_009a8edc;
  case 0x50:
    *(undefined4 *)(param_1 + 0x388) = uVar9;
    return 1;
  case 0x51:
    *(undefined1 **)(param_1 + 0x330) = &LAB_009a8f00;
    if (*(void **)(param_1 + 0x380) != (void *)0x0) {
      CRYPTO_free(*(void **)(param_1 + 0x380));
    }
    pcVar4 = CRYPTO_strdup((char *)param_4,"ssl/s3_lib.c",0xf37);
    *(char **)(param_1 + 0x380) = pcVar4;
    if (pcVar4 != (char *)0x0) {
      return 1;
    }
    ERR_new();
    uVar6 = 0xf38;
LAB_009a8edc:
    ERR_set_debug("ssl/s3_lib.c",uVar6,"ssl3_ctx_ctrl");
    uVar6 = 0xc0103;
    goto LAB_009a8ef0;
  case 0x52:
    lVar2 = *(long *)(param_1 + 0x110);
    if ((param_3 != 0) || (lVar2 != 0)) goto LAB_009a8d3c;
  case 0x73:
    lVar2 = *(long *)(**(long **)(param_1 + 0x158) + 0x10);
LAB_009a8d3c:
    *param_4 = lVar2;
    return 1;
  case 0x53:
    OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x110),X509_free);
    *(undefined8 *)(param_1 + 0x110) = 0;
    return 1;
  case 0x58:
    if (param_3 == 0) {
      iVar1 = ssl_cert_set0_chain(0,param_1,param_4);
    }
    else {
      iVar1 = ssl_cert_set1_chain(0,param_1,param_4);
    }
    break;
  case 0x59:
    if (param_3 == 0) {
      iVar1 = ssl_cert_add0_chain_cert(0,param_1,param_4);
    }
    else {
      iVar1 = ssl_cert_add1_chain_cert(0,param_1,param_4);
    }
    break;
  case 0x5b:
    iVar1 = tls1_set_groups(param_1 + 0x280,param_1 + 0x278,param_4,param_3);
    break;
  case 0x5c:
    iVar1 = tls1_set_groups_list(param_1,param_1 + 0x280,param_1 + 0x278,param_4);
    break;
  case 0x61:
    iVar1 = tls1_set_sigalgs(*(undefined8 *)(param_1 + 0x158),param_4,param_3,0);
    break;
  case 0x62:
    iVar1 = tls1_set_sigalgs_list(*(undefined8 *)(param_1 + 0x158),param_4,0);
    break;
  case 0x65:
    iVar1 = tls1_set_sigalgs(*(undefined8 *)(param_1 + 0x158),param_4,param_3,1);
    break;
  case 0x66:
    iVar1 = tls1_set_sigalgs_list(*(undefined8 *)(param_1 + 0x158),param_4,1);
    break;
  case 0x68:
    lVar2 = *(long *)(param_1 + 0x158);
    CRYPTO_free(*(void **)(lVar2 + 0x188));
    *(undefined8 *)(lVar2 + 0x188) = 0;
    *(undefined8 *)(lVar2 + 400) = 0;
    if (param_3 == 0) {
      return 1;
    }
    if (param_4 == (long *)0x0) {
      return 1;
    }
    if (0xff < param_3) {
      return 0;
    }
    lVar5 = CRYPTO_memdup(param_4,param_3,"ssl/s3_lib.c",0x1125);
    *(long *)(lVar2 + 0x188) = lVar5;
    if (lVar5 == 0) {
      return 0;
    }
    *(ulong *)(lVar2 + 400) = param_3;
    return 1;
  case 0x69:
    iVar1 = ssl_build_cert_chain(0,param_1,param_3 & 0xffffffff);
    break;
  case 0x6a:
    uVar6 = *(undefined8 *)(param_1 + 0x158);
    uVar7 = 0;
    goto LAB_009a8cec;
  case 0x6b:
    uVar6 = *(undefined8 *)(param_1 + 0x158);
    uVar7 = 1;
LAB_009a8cec:
    iVar1 = ssl_cert_set_cert_store(uVar6,param_4,uVar7,param_3 & 0xffffffff);
    break;
  case 0x74:
    iVar1 = ssl_cert_select_current(*(undefined8 *)(param_1 + 0x158),param_4);
    break;
  case 0x75:
    iVar1 = ssl_cert_set_current(*(undefined8 *)(param_1 + 0x158),param_3);
    break;
  case 0x76:
    *(undefined4 *)(*(long *)(param_1 + 0x158) + 0x18) = uVar9;
    return 1;
  case 0x7f:
    return (long)*(int *)(param_1 + 0x260);
  case 0x80:
    lVar2 = *(long *)(param_1 + 0x250);
    goto LAB_009a8d3c;
  case 0x81:
    lVar2 = *(long *)(param_1 + 600);
    goto LAB_009a8d3c;
  case 0x89:
    iVar1 = ssl_cert_get_cert_store(*(undefined8 *)(param_1 + 0x158),param_4,0);
    break;
  case 0x8a:
    iVar1 = ssl_cert_get_cert_store(*(undefined8 *)(param_1 + 0x158),param_4,1);
  }
  lVar2 = (long)iVar1;
switchD_009a8958_caseD_5:
  return lVar2;
}

