/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad87c
 */

/* WARNING: Type propagation algorithm not settling */

int ssl_build_cert_chain(long param_1,undefined8 *param_2,uint param_3)

{
  undefined4 uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  X509_STORE_CTX *ctx;
  X509 *pXVar5;
  undefined8 uVar6;
  char *pcVar7;
  undefined8 *puVar8;
  X509_STORE *ctx_00;
  stack_st_X509 *psVar9;
  undefined8 *puVar10;
  long *plVar11;
  undefined8 *puVar12;
  
  puVar10 = (undefined8 *)(param_1 + 0x898);
  if (param_1 == 0) {
    puVar10 = param_2 + 0x2b;
  }
  puVar10 = (undefined8 *)*puVar10;
  plVar11 = (long *)*puVar10;
  puVar12 = param_2;
  if (param_1 != 0) {
    puVar12 = *(undefined8 **)(param_1 + 0x9a8);
  }
  if (*plVar11 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x376,"ssl_build_cert_chain");
    ERR_set_error(0x14,0xb3,0);
    ctx = (X509_STORE_CTX *)0x0;
    ctx_00 = (X509_STORE *)0x0;
joined_r0x009ad994:
    iVar4 = 0;
joined_r0x009adbd8:
    if ((param_3 & 4) == 0) goto LAB_009ada94;
  }
  else {
    if ((param_3 >> 2 & 1) == 0) {
      ctx_00 = (X509_STORE *)puVar10[0x39];
      if (ctx_00 == (X509_STORE *)0x0) {
        puVar8 = param_2;
        if (param_1 != 0) {
          puVar8 = *(undefined8 **)(param_1 + 0x9a8);
        }
        ctx_00 = (X509_STORE *)puVar8[5];
        if ((param_3 & 1) != 0) goto LAB_009ad9b8;
LAB_009ad9b0:
        psVar9 = (stack_st_X509 *)0x0;
      }
      else {
        if ((param_3 & 1) == 0) goto LAB_009ad9b0;
LAB_009ad9b8:
        psVar9 = (stack_st_X509 *)plVar11[2];
      }
      ctx = (X509_STORE_CTX *)X509_STORE_CTX_new_ex(*puVar12,puVar12[0x88]);
      if (ctx == (X509_STORE_CTX *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_cert.c",0x394,"ssl_build_cert_chain");
        uVar1 = 0xc0100;
LAB_009ada7c:
        ERR_set_error(0x14,uVar1,0);
        goto joined_r0x009ad994;
      }
      iVar2 = X509_STORE_CTX_init(ctx,ctx_00,(X509 *)*plVar11,psVar9);
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_cert.c",0x398,"ssl_build_cert_chain");
        uVar1 = 0x8000b;
        goto LAB_009ada7c;
      }
      X509_STORE_CTX_set_flags(ctx,(ulong)*(uint *)((long)puVar10 + 0x1c) & 0x30000);
      iVar2 = X509_verify_cert(ctx);
      if (((param_3 >> 3 & 1) == 0) || (0 < iVar2)) {
        iVar4 = 0;
        if (iVar2 < 1) {
          iVar2 = X509_STORE_CTX_get_error(ctx);
          ERR_new();
          ERR_set_debug("ssl/ssl_cert.c",0x3aa,"ssl_build_cert_chain");
          pcVar7 = X509_verify_cert_error_string((long)iVar2);
          ERR_set_error(0x14,0x86,"Verify error:%s",pcVar7);
          goto joined_r0x009ad994;
        }
      }
      else {
        if ((param_3 >> 4 & 1) != 0) {
          ERR_clear_error();
        }
        iVar4 = 2;
      }
      psVar9 = X509_STORE_CTX_get1_chain(ctx);
      pXVar5 = (X509 *)OPENSSL_sk_shift();
      X509_free(pXVar5);
      if (((param_3 >> 1 & 1) != 0) && (iVar2 = OPENSSL_sk_num(psVar9), 0 < iVar2)) {
        iVar2 = OPENSSL_sk_num(psVar9);
        OPENSSL_sk_value(psVar9,iVar2 + -1);
        uVar3 = X509_get_extension_flags();
        if ((uVar3 >> 0xd & 1) != 0) {
          pXVar5 = (X509 *)OPENSSL_sk_pop(psVar9);
          X509_free(pXVar5);
        }
      }
      iVar2 = OPENSSL_sk_num(psVar9);
      if (0 < iVar2) {
        iVar2 = 0;
        do {
          uVar6 = OPENSSL_sk_value(psVar9,iVar2);
          iVar4 = ssl_security_cert(param_1,param_2,uVar6,0,0);
          if (iVar4 != 1) {
            ERR_new();
            ERR_set_debug("ssl/ssl_cert.c",0x3c4,"ssl_build_cert_chain");
            ERR_set_error(0x14,iVar4,0);
            OPENSSL_sk_pop_free(psVar9,X509_free);
            iVar4 = 0;
            goto joined_r0x009adbd8;
          }
          iVar2 = iVar2 + 1;
          iVar4 = OPENSSL_sk_num(psVar9);
        } while (iVar2 < iVar4);
        iVar4 = 1;
      }
      OPENSSL_sk_pop_free(plVar11[2],X509_free);
      if (iVar4 == 0) {
        iVar4 = 1;
      }
      plVar11[2] = (long)psVar9;
      goto joined_r0x009adbd8;
    }
    ctx_00 = X509_STORE_new();
    if (ctx_00 != (X509_STORE *)0x0) {
      iVar2 = OPENSSL_sk_num(plVar11[2]);
      if (0 < iVar2) {
        iVar2 = 0;
        do {
          pXVar5 = (X509 *)OPENSSL_sk_value(plVar11[2],iVar2);
          iVar4 = X509_STORE_add_cert(ctx_00,pXVar5);
          if (iVar4 == 0) goto LAB_009ad98c;
          iVar2 = iVar2 + 1;
          iVar4 = OPENSSL_sk_num(plVar11[2]);
        } while (iVar2 < iVar4);
      }
      iVar2 = X509_STORE_add_cert(ctx_00,(X509 *)*plVar11);
      if (iVar2 != 0) goto LAB_009ad9b0;
LAB_009ad98c:
      ctx = (X509_STORE_CTX *)0x0;
      goto joined_r0x009ad994;
    }
    iVar4 = 0;
    ctx = (X509_STORE_CTX *)0x0;
  }
  X509_STORE_free(ctx_00);
LAB_009ada94:
  X509_STORE_CTX_free(ctx);
  return iVar4;
}

