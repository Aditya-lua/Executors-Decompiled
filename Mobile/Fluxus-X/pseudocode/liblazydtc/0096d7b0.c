/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096d7b0
 */

undefined8 FUN_0096d7b0(long *param_1,long param_2,SSL_CTX *param_3)

{
  undefined *puVar1;
  byte bVar2;
  byte bVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  long *plVar7;
  long lVar8;
  X509_STORE *pXVar9;
  undefined8 *puVar10;
  BIO *bp;
  stack_st_X509_INFO *psVar11;
  X509_LOOKUP_METHOD *m;
  X509_LOOKUP *ctx;
  char *__s2;
  undefined *puVar12;
  long lVar13;
  undefined8 uVar14;
  char *pcVar15;
  bool bVar16;
  undefined8 *puVar17;
  undefined *puVar18;
  int iVar19;
  undefined1 auVar20 [16];
  
  plVar7 = (long *)FUN_009685c0();
  lVar8 = FUN_009685e4(param_1,param_2);
  if ((((*(int *)(param_2 + 0x6d8) == 0) || ((*(byte *)((long)plVar7 + 0x79) & 1) == 0)) ||
      (*plVar7 != 0)) || ((plVar7[9] != 0 || (*(long *)(lVar8 + 0x38) != 0)))) {
    bVar4 = false;
    lVar8 = *(long *)(param_2 + 0xc0);
    if (lVar8 != 0) goto LAB_0096d84c;
LAB_0096d8f0:
    bVar4 = (bool)(bVar4 ^ 1);
  }
  else {
    bVar4 = (*(byte *)(lVar8 + 0xc0) & 0x40) == 0;
    lVar8 = *(long *)(param_2 + 0xc0);
    if (lVar8 == 0) goto LAB_0096d8f0;
LAB_0096d84c:
    puVar10 = (undefined8 *)FUN_009167a8(lVar8 + 0x128,"tls:ossl:x509:share",0x13);
    if ((puVar10 == (undefined8 *)0x0) || (puVar10[1] == 0)) goto LAB_0096d8f0;
    if (-1 < *(int *)(param_2 + 0x6d8)) {
      auVar20 = FUN_00941cb8();
      lVar8 = FUN_00941d54(auVar20._0_8_,auVar20._8_8_,puVar10[2],puVar10[3]);
      if ((long)*(int *)(param_2 + 0x6d8) * 1000 <= lVar8) goto LAB_0096d8f0;
    }
    lVar8 = FUN_009685c0(param_1);
    pcVar15 = (char *)*puVar10;
    __s2 = *(char **)(lVar8 + 8);
    if ((pcVar15 == (char *)0x0) || (__s2 == (char *)0x0)) {
      if (pcVar15 != __s2) goto LAB_0096d8f0;
    }
    else {
      iVar5 = strcmp(pcVar15,__s2);
      if (iVar5 != 0) goto LAB_0096d8f0;
    }
    pXVar9 = (X509_STORE *)puVar10[1];
    bVar4 = (bool)(bVar4 ^ 1);
    if ((pXVar9 != (X509_STORE *)0x0) && (!bVar4)) {
      iVar5 = X509_STORE_up_ref(pXVar9);
      if (iVar5 != 0) {
        SSL_CTX_set_cert_store(param_3,pXVar9);
        return 0;
      }
      bVar4 = false;
    }
  }
  pXVar9 = SSL_CTX_get_cert_store(param_3);
  puVar10 = (undefined8 *)FUN_009685c0(param_1);
  lVar8 = FUN_009685e4(param_1,param_2);
  puVar17 = (undefined8 *)puVar10[9];
  puVar18 = (undefined *)0x0;
  if (puVar17 == (undefined8 *)0x0) {
    puVar18 = (undefined *)puVar10[1];
  }
  puVar12 = (undefined *)*puVar10;
  pcVar15 = *(char **)(lVar8 + 0x38);
  bVar2 = *(byte *)((long)puVar10 + 0x79);
  if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) {
    if (*(long *)(param_2 + 0x12a0) == 0) {
      if (param_1 != (long *)0x0) goto LAB_0096d960;
    }
    else if ((param_1 != (long *)0x0) && (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))) {
LAB_0096d960:
      if (0 < *(int *)(*param_1 + 0xc)) {
        puVar1 = &DAT_002c6e43;
        if (puVar18 != (undefined *)0x0) {
          puVar1 = puVar18;
        }
        FUN_00904ddc(param_2,param_1,"populate_x509_store, path=%s, blob=%d",puVar1,
                     puVar17 != (undefined8 *)0x0);
      }
    }
  }
  if (pXVar9 == (X509_STORE *)0x0) {
    return 0x1b;
  }
  if ((bVar2 & 1) == 0) goto joined_r0x0096dbcc;
  bVar16 = false;
  if (puVar17 != (undefined8 *)0x0) {
    if ((ulong)puVar17[1] >> 0x1f == 0) {
      bp = BIO_new_mem_buf((void *)*puVar17,(int)puVar17[1]);
      if (bp == (BIO *)0x0) {
        uVar14 = 0x1b;
        goto LAB_0096da84;
      }
      psVar11 = PEM_X509_INFO_read_bio(bp,(stack_st_X509_INFO *)0x0,(undefined1 *)0x0,(void *)0x0);
      if (psVar11 == (stack_st_X509_INFO *)0x0) {
        BIO_free(bp);
      }
      else {
        iVar5 = OPENSSL_sk_num(psVar11);
        if (iVar5 < 1) {
LAB_0096da98:
          iVar5 = 0;
        }
        else {
          iVar5 = 0;
          iVar19 = 0;
          do {
            puVar10 = (undefined8 *)OPENSSL_sk_value(psVar11,iVar19);
            if ((X509 *)*puVar10 != (X509 *)0x0) {
              iVar6 = X509_STORE_add_cert(pXVar9,(X509 *)*puVar10);
              if (iVar6 == 0) goto LAB_0096da98;
              iVar5 = iVar5 + 1;
            }
            if ((X509_CRL *)puVar10[1] != (X509_CRL *)0x0) {
              iVar6 = X509_STORE_add_crl(pXVar9,(X509_CRL *)puVar10[1]);
              if (iVar6 == 0) goto LAB_0096da98;
              iVar5 = iVar5 + 1;
            }
            iVar19 = iVar19 + 1;
            iVar6 = OPENSSL_sk_num(psVar11);
          } while (iVar19 < iVar6);
        }
        OPENSSL_sk_pop_free(psVar11,X509_INFO_free);
        BIO_free(bp);
        if (0 < iVar5) {
          if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))
             ) {
            FUN_00904c98(param_2,"successfully imported CA certificate blob");
          }
          bVar16 = true;
          goto LAB_0096dafc;
        }
      }
    }
    uVar14 = 0x4d;
LAB_0096da84:
    FUN_00904b80(param_2,"error importing CA certificate blob");
    return uVar14;
  }
LAB_0096dafc:
  if (puVar18 == (undefined *)0x0 && puVar12 == (undefined *)0x0) {
    if (!bVar16) {
      X509_STORE_set_default_paths(pXVar9);
    }
    goto joined_r0x0096dbcc;
  }
  if ((puVar18 == (undefined *)0x0) || (iVar5 = X509_STORE_load_file(pXVar9,puVar18), iVar5 != 0)) {
LAB_0096db20:
    if (puVar12 == (undefined *)0x0) goto LAB_0096db38;
LAB_0096db24:
    iVar5 = X509_STORE_load_path(pXVar9,puVar12);
    if (iVar5 != 0) goto LAB_0096db38;
    if (!bVar16) {
      pcVar15 = "error setting certificate path: %s";
      puVar18 = puVar12;
LAB_0096de5c:
      FUN_00904b80(param_2,pcVar15,puVar18);
      return 0x4d;
    }
    if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) ||
       ((*(long *)(param_2 + 0x12a0) != 0 && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))))
    goto LAB_0096db38;
    FUN_00904c98(param_2,"error setting certificate path, continuing anyway");
    bVar3 = *(byte *)(param_2 + 0xa85);
  }
  else {
    if (!bVar16) {
      pcVar15 = "error setting certificate file: %s";
      goto LAB_0096de5c;
    }
    if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) ||
       ((*(long *)(param_2 + 0x12a0) != 0 && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))))
    goto LAB_0096db20;
    FUN_00904c98(param_2,"error setting certificate file, continuing anyway");
    if (puVar12 != (undefined *)0x0) goto LAB_0096db24;
LAB_0096db38:
    bVar3 = *(byte *)(param_2 + 0xa85);
  }
  if ((bVar3 >> 4 & 1) == 0) goto joined_r0x0096dbcc;
  lVar13 = *(long *)(param_2 + 0x12a0);
  if ((lVar13 == 0) || (0 < *(int *)(lVar13 + 8))) {
    if (puVar18 == (undefined *)0x0) {
      puVar18 = &DAT_002c6e43;
    }
    FUN_00904c98(param_2," CAfile: %s",puVar18);
    if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) goto joined_r0x0096dbcc;
    lVar13 = *(long *)(param_2 + 0x12a0);
    if (lVar13 != 0) goto LAB_0096db8c;
  }
  else {
LAB_0096db8c:
    if (*(int *)(lVar13 + 8) < 1) goto joined_r0x0096dbcc;
  }
  if (puVar12 == (undefined *)0x0) {
    puVar12 = &DAT_002c6e43;
  }
  FUN_00904c98(param_2," CApath: %s",puVar12);
joined_r0x0096dbcc:
  if (pcVar15 != (char *)0x0) {
    m = X509_LOOKUP_file();
    ctx = X509_STORE_add_lookup(pXVar9,m);
    if ((ctx == (X509_LOOKUP *)0x0) || (iVar5 = X509_load_crl_file(ctx,pcVar15,1), iVar5 == 0)) {
      FUN_00904b80(param_2,"error loading CRL file: %s",pcVar15);
      return 0x52;
    }
    if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
      FUN_00904c98(param_2,"successfully loaded CRL file:");
    }
    X509_STORE_set_flags(pXVar9,0xc);
    if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
      FUN_00904c98(param_2,"  CRLfile: %s",pcVar15);
    }
  }
  if ((((bVar2 & 1) != 0) && (X509_STORE_set_flags(pXVar9,0x8000), pcVar15 == (char *)0x0)) &&
     ((*(byte *)(lVar8 + 0xc0) >> 4 & 1) == 0)) {
    X509_STORE_set_flags(pXVar9,0x80000);
  }
  if (bVar4) {
    return 0;
  }
  lVar8 = FUN_009685c0(param_1);
  if (*(long *)(param_2 + 0xc0) == 0) {
    return 0;
  }
  lVar13 = *(long *)(param_2 + 0xc0) + 0x128;
  plVar7 = (long *)FUN_009167a8(lVar13,"tls:ossl:x509:share",0x13);
  if (plVar7 == (long *)0x0) {
    plVar7 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x20);
    if (plVar7 == (long *)0x0) {
      return 0;
    }
    lVar13 = FUN_009164f8(lVar13,"tls:ossl:x509:share",0x13,plVar7,&LAB_00970be8);
    if (lVar13 == 0) {
      (*(code *)PTR_free_00cc4678)(plVar7);
      return 0;
    }
  }
  iVar5 = X509_STORE_up_ref(pXVar9);
  if (iVar5 == 0) {
    return 0;
  }
  if (*(long *)(lVar8 + 8) == 0) {
    lVar8 = 0;
  }
  else {
    lVar8 = (*(code *)PTR_strdup_00cc4688)();
    if (lVar8 == 0) {
      X509_STORE_free(pXVar9);
      return 0;
    }
  }
  if ((X509_STORE *)plVar7[1] != (X509_STORE *)0x0) {
    X509_STORE_free((X509_STORE *)plVar7[1]);
    (*(code *)PTR_free_00cc4678)(*plVar7);
  }
  auVar20 = FUN_00941cb8();
  *(undefined1 (*) [16])(plVar7 + 2) = auVar20;
  *plVar7 = lVar8;
  plVar7[1] = (long)pXVar9;
  return 0;
}

