/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a827c
 */

ulong ssl3_ctrl(long param_1,undefined4 param_2,ulong param_3,uint *param_4)

{
  uint uVar1;
  int iVar2;
  EVP_PKEY *pkey;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  size_t sVar7;
  char *pcVar8;
  undefined8 uVar9;
  long lVar10;
  ushort *puVar11;
  
  iVar2 = 0;
  switch(param_2) {
  case 3:
    if (param_4 != (uint *)0x0) {
      pkey = (EVP_PKEY *)ssl_dh_to_pkey(param_4);
      if (pkey != (EVP_PKEY *)0x0) {
        iVar2 = SSL_set0_tmp_dh_pkey(param_1,pkey);
        if (iVar2 == 0) {
          EVP_PKEY_free(pkey);
          return 0;
        }
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0xd7c,"ssl3_ctrl");
      uVar6 = 0xc0100;
      goto LAB_009a879c;
    }
    ERR_new(0);
    uVar6 = 0xd77;
    goto LAB_009a878c;
  case 4:
    if (param_4 != (uint *)0x0) {
      iVar2 = ssl_set_tmp_ecdh_groups(param_1 + 0xac8,param_1 + 0xac0,param_4);
      break;
    }
    ERR_new(0);
    uVar6 = 0xd93;
LAB_009a878c:
    ERR_set_debug("ssl/s3_lib.c",uVar6,"ssl3_ctrl");
    uVar6 = 0xc0102;
LAB_009a879c:
    ERR_set_error(0x14,uVar6,0);
    return 0;
  case 6:
    ERR_new(0);
    ERR_set_debug("ssl/s3_lib.c",0xd88,"ssl3_ctrl");
    uVar6 = 0xc0101;
    goto LAB_009a879c;
  case 10:
    iVar2 = *(int *)(param_1 + 0x1b4);
    break;
  case 0xb:
    iVar2 = *(int *)(param_1 + 0x1b4);
    *(undefined4 *)(param_1 + 0x1b4) = 0;
    break;
  case 0xc:
    iVar2 = *(int *)(param_1 + 0x1b0);
    break;
  case 0xd:
    iVar2 = *(int *)(param_1 + 0xa8);
    break;
  case 0x37:
    if (param_3 != 0) {
      ERR_new(0);
      ERR_set_debug("ssl/s3_lib.c",0xdb7,"ssl3_ctrl");
      uVar6 = 0x140;
      goto LAB_009a879c;
    }
    CRYPTO_free(*(void **)(param_1 + 0xa58));
    *(undefined8 *)(param_1 + 0xa58) = 0;
    if (param_4 != (uint *)0x0) {
      sVar7 = strlen((char *)param_4);
      if (0xfe < sVar7 - 1) {
        ERR_new();
        ERR_set_debug("ssl/s3_lib.c",0xdaf,"ssl3_ctrl");
        uVar6 = 0x13f;
        goto LAB_009a879c;
      }
      pcVar8 = CRYPTO_strdup((char *)param_4,"ssl/s3_lib.c",0xdb2);
      *(char **)(param_1 + 0xa58) = pcVar8;
      if (pcVar8 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/s3_lib.c",0xdb3,"ssl3_ctrl");
        uVar6 = 0xc0103;
        goto LAB_009a879c;
      }
    }
    goto LAB_009a8630;
  case 0x39:
    *(uint **)(param_1 + 0xa50) = param_4;
    goto LAB_009a8630;
  case 0x41:
    *(int *)(param_1 + 0xa60) = (int)param_3;
    goto LAB_009a8630;
  case 0x42:
    uVar6 = *(undefined8 *)(param_1 + 0xa80);
    goto LAB_009a862c;
  case 0x43:
    *(uint **)(param_1 + 0xa80) = param_4;
    goto LAB_009a8630;
  case 0x44:
    uVar6 = *(undefined8 *)(param_1 + 0xa78);
    goto LAB_009a862c;
  case 0x45:
    *(uint **)(param_1 + 0xa78) = param_4;
    goto LAB_009a8630;
  case 0x46:
    *(undefined8 *)param_4 = *(undefined8 *)(param_1 + 0xa88);
    uVar5 = *(ulong *)(param_1 + 0xa90);
    if ((long)uVar5 < 1) {
      uVar5 = 0xffffffffffffffff;
    }
    return uVar5;
  case 0x47:
    CRYPTO_free(*(void **)(param_1 + 0xa88));
    *(uint **)(param_1 + 0xa88) = param_4;
    *(ulong *)(param_1 + 0xa90) = param_3;
    goto LAB_009a8630;
  case 0x58:
    if (param_3 == 0) {
      iVar2 = ssl_cert_set0_chain(param_1,0,param_4);
    }
    else {
      iVar2 = ssl_cert_set1_chain(param_1,0,param_4);
    }
    break;
  case 0x59:
    if (param_3 == 0) {
      iVar2 = ssl_cert_add0_chain_cert(param_1,0,param_4);
    }
    else {
      iVar2 = ssl_cert_add1_chain_cert(param_1,0,param_4);
    }
    break;
  case 0x5a:
    if (*(long *)(param_1 + 0x918) == 0) {
      return 0;
    }
    lVar10 = *(long *)(param_1 + 0xad0);
    if ((param_4 != (uint *)0x0) && (lVar10 != 0)) {
      puVar11 = *(ushort **)(param_1 + 0xad8);
      lVar4 = lVar10;
      do {
        lVar3 = tls1_group_id_lookup(*(undefined8 *)(param_1 + 0x9a8),*puVar11);
        if (lVar3 == 0) {
          uVar1 = *puVar11 | 0x1000000;
        }
        else {
          uVar1 = tls1_group_id2nid(*(undefined2 *)(lVar3 + 0x1c),1);
        }
        *param_4 = uVar1;
        lVar4 = lVar4 + -1;
        puVar11 = puVar11 + 1;
        param_4 = param_4 + 1;
      } while (lVar4 != 0);
    }
    return (long)(int)lVar10;
  case 0x5b:
    iVar2 = tls1_set_groups(param_1 + 0xac8,param_1 + 0xac0,param_4,param_3);
    break;
  case 0x5c:
    iVar2 = tls1_set_groups_list
                      (*(undefined8 *)(param_1 + 0x9a8),param_1 + 0xac8,param_1 + 0xac0,param_4);
    break;
  case 0x5d:
    uVar5 = tls1_shared_group(param_1,param_3 & 0xffffffff);
    if (param_3 == 0xffffffffffffffff) {
      return uVar5 & 0xffff;
    }
    goto LAB_009a8740;
  case 0x61:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 0;
    goto LAB_009a84f8;
  case 0x62:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 0;
    goto LAB_009a850c;
  case 0x65:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 1;
LAB_009a84f8:
    iVar2 = tls1_set_sigalgs(uVar6,param_4,param_3,uVar9);
    break;
  case 0x66:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 1;
LAB_009a850c:
    iVar2 = tls1_set_sigalgs_list(uVar6,param_4,uVar9);
    break;
  case 0x67:
    if (*(int *)(param_1 + 0x38) != 0) {
      return 0;
    }
    if (*(int *)(param_1 + 0x2f0) == 0) {
      return 0;
    }
    if (param_4 != (uint *)0x0) {
      *(undefined8 *)param_4 = *(undefined8 *)(param_1 + 0x2f8);
    }
    return *(ulong *)(param_1 + 0x300);
  case 0x68:
    if (*(int *)(param_1 + 0x38) == 0) {
      return 0;
    }
    lVar10 = *(long *)(param_1 + 0x898);
    CRYPTO_free(*(void **)(lVar10 + 0x188));
    *(undefined8 *)(lVar10 + 0x188) = 0;
    *(undefined8 *)(lVar10 + 400) = 0;
    if (param_3 == 0) {
      return 1;
    }
    if (param_4 == (uint *)0x0) {
      return 1;
    }
    if (0xff < param_3) {
      return 0;
    }
    lVar4 = CRYPTO_memdup(param_4,param_3,"ssl/s3_lib.c",0x1125);
    *(long *)(lVar10 + 0x188) = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    *(ulong *)(lVar10 + 400) = param_3;
    return 1;
  case 0x69:
    iVar2 = ssl_build_cert_chain(param_1,0,param_3 & 0xffffffff);
    break;
  case 0x6a:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 0;
    goto LAB_009a85d8;
  case 0x6b:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 1;
LAB_009a85d8:
    iVar2 = ssl_cert_set_cert_store(uVar6,param_4,uVar9,param_3 & 0xffffffff);
    break;
  case 0x6c:
    lVar10 = *(long *)(param_1 + 0x3b0);
    goto joined_r0x009a86a4;
  case 0x6d:
    if (*(long *)(param_1 + 0x918) == 0) {
      return 0;
    }
    if (*(long *)(param_1 + 0x4b0) == 0) {
      return 0;
    }
    EVP_PKEY_up_ref();
    uVar6 = *(undefined8 *)(param_1 + 0x4b0);
    goto LAB_009a86d0;
  case 0x6f:
    if (*(long *)(param_1 + 0xab8) == 0) {
      return 0;
    }
    *(long *)param_4 = *(long *)(param_1 + 0xab8);
    return (long)*(int *)(param_1 + 0xab0);
  case 0x73:
    uVar6 = *(undefined8 *)(**(long **)(param_1 + 0x898) + 0x10);
LAB_009a862c:
    *(undefined8 *)param_4 = uVar6;
LAB_009a8630:
    iVar2 = 1;
    break;
  case 0x74:
    iVar2 = ssl_cert_select_current(*(undefined8 *)(param_1 + 0x898),param_4);
    break;
  case 0x75:
    if (param_3 == 3) {
      if (*(int *)(param_1 + 0x38) == 0) {
        return 0;
      }
      if (*(long *)(param_1 + 0x2e0) == 0) {
        return 0;
      }
      if ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 0x44) != 0) {
        return 2;
      }
      if (*(long *)(param_1 + 0x388) == 0) {
        return 0;
      }
      **(long **)(param_1 + 0x898) = *(long *)(param_1 + 0x388);
      return 1;
    }
    iVar2 = ssl_cert_set_current(*(undefined8 *)(param_1 + 0x898),param_3);
    break;
  case 0x76:
    *(int *)(*(long *)(param_1 + 0x898) + 0x18) = (int)param_3;
    return 1;
  case 0x7f:
    iVar2 = *(int *)(param_1 + 0xa60);
    break;
  case 0x84:
    lVar10 = *(long *)(param_1 + 0x380);
joined_r0x009a86a4:
    if (lVar10 == 0) {
      return 0;
    }
    *param_4 = *(uint *)(lVar10 + 0xc);
    return 1;
  case 0x85:
    if (*(long *)(param_1 + 0x918) == 0) {
      return 0;
    }
    if (*(long *)(param_1 + 0x2e8) == 0) {
      return 0;
    }
    EVP_PKEY_up_ref();
    uVar6 = *(undefined8 *)(param_1 + 0x2e8);
LAB_009a86d0:
    *(undefined8 *)param_4 = uVar6;
    return 1;
  case 0x86:
    if (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
         (iVar2 = **(int **)(param_1 + 8), 0x303 < iVar2)) && (iVar2 != 0x10000)) &&
       (*(char *)(param_1 + 0x4ad) != '\0')) {
      uVar5 = (ulong)*(ushort *)(param_1 + 0x4ae);
    }
    else {
      uVar5 = (ulong)*(uint *)(*(long *)(param_1 + 0x918) + 0x308);
    }
LAB_009a8740:
    iVar2 = tls1_group_id2nid(uVar5,1);
    break;
  case 0x89:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 0;
    goto LAB_009a872c;
  case 0x8a:
    uVar6 = *(undefined8 *)(param_1 + 0x898);
    uVar9 = 1;
LAB_009a872c:
    iVar2 = ssl_cert_get_cert_store(uVar6,param_4,uVar9);
  }
  return (long)iVar2;
}

