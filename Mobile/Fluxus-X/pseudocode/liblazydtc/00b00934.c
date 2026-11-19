/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00934
 */

undefined8 FUN_00b00934(CONF_VALUE *param_1,long *param_2,ASN1_INTEGER **param_3,long *param_4)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ASN1_OBJECT *pAVar4;
  void *pvVar5;
  BIO *b;
  size_t __n;
  void *pvVar6;
  undefined8 uVar7;
  int *piVar8;
  ASN1_OCTET_STRING *pAVar9;
  char *pcVar10;
  undefined1 auStack_858 [2048];
  size_t local_58;
  
  pcVar10 = param_1->name;
  iVar3 = strcmp(pcVar10,"language");
  if (iVar3 == 0) {
    if (*param_2 == 0) {
      pAVar4 = OBJ_txt2obj(param_1->value,0);
      *param_2 = (long)pAVar4;
      if (pAVar4 != (ASN1_OBJECT *)0x0) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0x62,"process_pci_value");
      uVar7 = 0x6e;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0x5d,"process_pci_value");
      uVar7 = 0x9b;
    }
LAB_00b00bf4:
    ERR_set_error(0x22,uVar7,0);
    ERR_add_error_data(6,"section:",param_1->section,",name:",param_1->name,",value:",param_1->value
                      );
    return 0;
  }
  iVar3 = strcmp(pcVar10,"pathlen");
  if (iVar3 == 0) {
    if (*param_3 == (ASN1_INTEGER *)0x0) {
      iVar3 = X509V3_get_value_int(param_1,param_3);
      if (iVar3 != 0) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0x6e,"process_pci_value");
      uVar7 = 0x9c;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0x69,"process_pci_value");
      uVar7 = 0x9d;
    }
    goto LAB_00b00bf4;
  }
  iVar3 = strcmp(pcVar10,"policy");
  if (iVar3 != 0) {
    return 1;
  }
  pAVar9 = (ASN1_OCTET_STRING *)*param_4;
  if (pAVar9 == (ASN1_OCTET_STRING *)0x0) {
    pAVar9 = ASN1_OCTET_STRING_new();
    *param_4 = (long)pAVar9;
    if (pAVar9 == (ASN1_OCTET_STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0x79,"process_pci_value");
      uVar7 = 0xc0100;
      goto LAB_00b00bf4;
    }
    bVar2 = true;
  }
  else {
    bVar2 = false;
  }
  pcVar10 = param_1->value;
  iVar3 = strncmp(pcVar10,"hex:",4);
  if (iVar3 == 0) {
    pvVar6 = (void *)OPENSSL_hexstr2buf(pcVar10 + 4,&local_58);
    if (pvVar6 == (void *)0x0) goto LAB_00b00f14;
    pvVar5 = CRYPTO_realloc(*(void **)((int *)*param_4 + 2),*(int *)*param_4 + (int)local_58 + 1,
                            "crypto/x509/v3_pci.c",0x89);
    if (pvVar5 != (void *)0x0) {
      *(void **)(*param_4 + 8) = pvVar5;
      memcpy((void *)(*(long *)((int *)*param_4 + 2) + (long)*(int *)*param_4),pvVar6,local_58);
      piVar8 = (int *)*param_4;
      iVar3 = *piVar8;
      *piVar8 = iVar3 + (int)local_58;
      *(undefined1 *)(*(long *)(piVar8 + 2) + (long)(iVar3 + (int)local_58)) = 0;
      CRYPTO_free(pvVar6);
      return 1;
    }
    CRYPTO_free(pvVar6);
    CRYPTO_free(*(void **)(*param_4 + 8));
    *(undefined8 *)(*param_4 + 8) = 0;
    *(undefined4 *)*param_4 = 0;
    ERR_new();
    uVar7 = 0x99;
LAB_00b00efc:
    ERR_set_debug("crypto/x509/v3_pci.c",uVar7,"process_pci_value");
    uVar7 = 0xc0100;
  }
  else {
    iVar3 = strncmp(pcVar10,"file:",5);
    if (iVar3 == 0) {
      b = BIO_new_file(pcVar10 + 5,"r");
      if (b != (BIO *)0x0) {
        pvVar6 = (void *)0x0;
        do {
          while (iVar3 = BIO_read(b,auStack_858,0x800), 0 < iVar3) {
            pvVar6 = CRYPTO_realloc(*(void **)((int *)*param_4 + 2),iVar3 + *(int *)*param_4 + 1,
                                    "crypto/x509/v3_pci.c",0xad);
            if (pvVar6 == (void *)0x0) {
              CRYPTO_free(*(void **)(*param_4 + 8));
              *(undefined8 *)(*param_4 + 8) = 0;
              *(undefined4 *)*param_4 = 0;
              ERR_new();
              ERR_set_debug("crypto/x509/v3_pci.c",0xb3,"process_pci_value");
              ERR_set_error(0x22,0xc0100,0);
              ERR_add_error_data(6,"section:",param_1->section,",name:",param_1->name,",value:",
                                 param_1->value);
              BIO_free_all(b);
              goto joined_r0x00b00e3c;
            }
            *(void **)(*param_4 + 8) = pvVar6;
            memcpy((void *)(*(long *)((int *)*param_4 + 2) + (long)*(int *)*param_4),auStack_858,
                   (long)iVar3);
            piVar8 = (int *)*param_4;
            lVar1 = (long)*piVar8 + (long)iVar3;
            *piVar8 = (int)lVar1;
            *(undefined1 *)(*(long *)(piVar8 + 2) + lVar1) = 0;
          }
          if (iVar3 != 0) {
            BIO_free_all(b);
            ERR_new();
            uVar7 = 0xc1;
            goto LAB_00b00e64;
          }
          iVar3 = BIO_test_flags(b,8);
        } while (iVar3 != 0);
        BIO_free_all(b);
        if (pvVar6 != (void *)0x0) {
          return 1;
        }
        ERR_new();
        uVar7 = 0xe1;
        goto LAB_00b00efc;
      }
      ERR_new();
      uVar7 = 0xa3;
LAB_00b00e64:
      ERR_set_debug("crypto/x509/v3_pci.c",uVar7,"process_pci_value");
      uVar7 = 0x80020;
    }
    else {
      iVar3 = strncmp(pcVar10,"text:",5);
      if (iVar3 == 0) {
        __n = strlen(pcVar10 + 5);
        local_58 = __n;
        pvVar6 = CRYPTO_realloc(pAVar9->data,(int)__n + pAVar9->length + 1,"crypto/x509/v3_pci.c",
                                200);
        if (pvVar6 != (void *)0x0) {
          *(void **)(*param_4 + 8) = pvVar6;
          memcpy((void *)(*(long *)((int *)*param_4 + 2) + (long)*(int *)*param_4),
                 param_1->value + 5,__n);
          piVar8 = (int *)*param_4;
          iVar3 = *piVar8 + (int)__n;
          *piVar8 = iVar3;
          *(undefined1 *)(*(long *)(piVar8 + 2) + (long)iVar3) = 0;
          return 1;
        }
        CRYPTO_free(*(void **)(*param_4 + 8));
        *(undefined8 *)(*param_4 + 8) = 0;
        *(undefined4 *)*param_4 = 0;
        ERR_new();
        uVar7 = 0xd7;
        goto LAB_00b00efc;
      }
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pci.c",0xdc,"process_pci_value");
      uVar7 = 0x98;
    }
  }
  ERR_set_error(0x22,uVar7,0);
LAB_00b00f14:
  ERR_add_error_data(6,"section:",param_1->section,",name:",param_1->name,",value:",param_1->value);
joined_r0x00b00e3c:
  if (bVar2) {
    ASN1_OCTET_STRING_free((ASN1_STRING *)*param_4);
    *param_4 = 0;
    return 0;
  }
  return 0;
}

